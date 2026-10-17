package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.focus.PlatformFocusOwner;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeChangeRequester;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.InsetsListener;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.layout.WindowInsetsRulerProvider;
import androidx.compose.ui.layout.WindowInsetsRulers_androidKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OutOfFrameExecutor;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeView.RootModifierNode;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.ExecuteDelayed;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.a21;
import defpackage.a50;
import defpackage.c5;
import defpackage.d5;
import defpackage.dk;
import defpackage.dq;
import defpackage.er;
import defpackage.f2;
import defpackage.f90;
import defpackage.fc;
import defpackage.fi0;
import defpackage.gb0;
import defpackage.h10;
import defpackage.hl0;
import defpackage.hm;
import defpackage.iy;
import defpackage.ji;
import defpackage.ji0;
import defpackage.jq;
import defpackage.k4;
import defpackage.ki0;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.na0;
import defpackage.o;
import defpackage.p0;
import defpackage.p01;
import defpackage.p10;
import defpackage.pl0;
import defpackage.q10;
import defpackage.qb;
import defpackage.r40;
import defpackage.s40;
import defpackage.sl0;
import defpackage.so;
import defpackage.t60;
import defpackage.u11;
import defpackage.vn;
import defpackage.w01;
import defpackage.xa0;
import defpackage.y40;
import defpackage.y80;
import defpackage.z0;
import defpackage.zk0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, PlatformFocusOwner, ViewRootForTest, MatrixPositionCalculator, jq, OutOfFrameExecutor, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, FocusListener, ExecuteDelayed {
    private static Method addChangeCallbackMethod;
    private static Method dispatchOnScrollChangedMethod;
    private static Method getBooleanMethod;
    private static Runnable systemPropertiesChangedRunnable;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final AndroidAutofillManager _autofillManager;
    private final MutableState _composeViewContext$delegate;
    private final InputModeManagerImpl _inputModeManager;
    private TextInputServiceAndroid _legacyTextInputServiceAndroid;
    private View _rootView;
    private SoftwareKeyboardController _softwareKeyboardController;
    private TextInputService _textInputService;
    private final MutableState _viewTreeOwners$delegate;
    private final LazyWindowInfo _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private boolean composeViewContextIncrementedDuringInit;
    private final MutableState configuration$delegate;
    private AndroidContentCaptureManager contentCaptureManager;
    private kn coroutineContext;
    private float currentFrameRate;
    private float currentFrameRateCategory;
    private final MutableState density$delegate;
    private final State derivedIsAttached$delegate;
    private final xa0 dirtyLayers;
    private final AndroidDragAndDropManager dragAndDropManager;
    private final xa0 endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler;
    private View frameRateCategoryView;
    private long globalPosition;
    private final GraphicsContext graphicsContext;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private final IndirectPointerNavigationGestureDetector indirectPointerNavigationGestureDetector;
    private final InsetsListener insetsListener;
    private final MutableState isAttached$delegate;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private int keepScreenOnCount;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final MutableState layoutDirection$delegate;
    private final na0 layoutNodes;
    private LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry lifecycleRetainedValuesStoreOwnerEntry;
    private final State localeList$delegate;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private ky onReadyForComposition;
    private final qb outOfFrameQueue;
    private final Runnable outOfFrameRunnable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private xa0 postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private IndirectPointerEventPrimaryDirectionalMotionAxis primaryDirectionalMotionAxisOverride;
    private boolean processingRequestFocusForNextNonChildView;
    private final RectManager rectManager;
    private long relayoutTime;
    private final iy resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private RetainedValuesStore retainedValuesStore;
    private final LayoutNode root;
    private final ScrollCapture scrollCapture;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete;
    private final AtomicReference<SessionMutex.Session<AndroidPlatformTextInputSession>> textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final State viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final xa0 composeViews = new xa0();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final y40 lifecycleOwner;
        private final hl0 savedStateRegistryOwner;
        private final a21 viewModelStoreOwner;

        public ViewTreeOwners(y40 y40Var, hl0 hl0Var, a21 a21Var) {
            this.lifecycleOwner = y40Var;
            this.savedStateRegistryOwner = hl0Var;
            this.viewModelStoreOwner = a21Var;
        }

        public final y40 getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final hl0 getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }

        public final a21 getViewModelStoreOwner() {
            return this.viewModelStoreOwner;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v38, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context context, ComposeViewContext composeViewContext) {
        super(context);
        final AndroidComposeView androidComposeView;
        AndroidAutofillManager androidAutofillManager;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        this._composeViewContext$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(composeViewContext, null, 2, null);
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m4531getUnspecifiedF1C5BW0();
        int i = 1;
        this.superclassInitComplete = true;
        this.sharedDrawScope = AndroidComposeUiFlags.isSharedDrawingEnabled ? composeViewContext.getSharedDrawScope$ui() : new LayoutNodeDrawScope(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        this.retainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
        this.outOfFrameQueue = new qb();
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        this.outOfFrameRunnable = new c5(this, 0);
        this.density$delegate = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(context), SnapshotStateKt.referentialEqualityPolicy());
        this.focusOwner = new FocusOwnerImpl(this, this);
        this.coroutineContext = composeViewContext.getCompositionContext$ui().getEffectCoroutineContext();
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this._windowInfo = new LazyWindowInfo();
        this.isAttached$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.derivedIsAttached$delegate = SnapshotStateKt.derivedStateOf(new AndroidComposeView$derivedIsAttached$2(this));
        this.canvasHolder = AndroidComposeUiFlags.isSharedDrawingEnabled ? composeViewContext.getCanvasHolder$ui() : new CanvasHolder();
        this.viewConfiguration = AndroidComposeUiFlags.isSharedViewConfigurationEnabled ? composeViewContext.getViewConfiguration$ui() : new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.insetsListener = new InsetsListener(this);
        LayoutNode layoutNode = new LayoutNode(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, 3, objArr4 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(getViewConfiguration());
        layoutNode.setModifier(new ModifierNodeElement<RootModifierNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$root$1$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public AndroidComposeView.RootModifierNode create() {
                return AndroidComposeView.this.new RootModifierNode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return AndroidComposeView.this.hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("rootModifier");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(AndroidComposeView.RootModifierNode rootModifierNode) {
            }
        }.then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()));
        this.root = layoutNode;
        na0 na0Var = h10.a;
        this.layoutNodes = new na0();
        this.rectManager = new RectManager(getLayoutNodes(), this);
        this.semanticsOwner = new SemanticsOwner(getRoot(), new EmptySemanticsModifier(), getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = AndroidComposeUiFlags.isSharedAccessibilityManagerEnabled ? composeViewContext.getAccessibilityManager$ui() : new AndroidAccessibilityManager(context);
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new xa0();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configuration$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
        this.localeList$delegate = SnapshotStateKt.derivedStateOf(new AndroidComposeView$localeList$2(this));
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        if (autofillSupported()) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager == null) {
                throw k4.a("Autofill service could not be located.");
            }
            androidComposeView = this;
            androidAutofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(autofillManager), getSemanticsOwner(), androidComposeView, getRectManager(), context.getPackageName());
        } else {
            androidComposeView = this;
            androidAutofillManager = null;
        }
        androidComposeView._autofillManager = androidAutofillManager;
        androidComposeView.clipboardManager = AndroidComposeUiFlags.isSharedClipboardManagerEnabled ? composeViewContext.getClipboardManager$ui() : new AndroidClipboardManager(context);
        androidComposeView.clipboard = AndroidComposeUiFlags.isSharedClipboardManagerEnabled ? composeViewContext.getClipboard$ui() : new AndroidClipboard(androidComposeView.getClipboardManager());
        androidComposeView.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(androidComposeView));
        androidComposeView.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(androidComposeView.getRoot());
        androidComposeView.globalPosition = IntOffset.m7733constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        androidComposeView.tmpPositionArray = new int[]{0, 0};
        androidComposeView.tmpMatrix = Matrix.m5005constructorimpl$default(null, 1, null);
        androidComposeView.viewToWindowMatrix = Matrix.m5005constructorimpl$default(null, 1, null);
        androidComposeView.windowToViewMatrix = Matrix.m5005constructorimpl$default(null, 1, null);
        androidComposeView.lastMatrixRecalculationAnimationTime = -1L;
        androidComposeView.windowPosition = companion.m4530getInfiniteF1C5BW0();
        androidComposeView.isRenderNodeCompatible = true;
        androidComposeView._viewTreeOwners$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        androidComposeView.viewTreeOwners$delegate = SnapshotStateKt.derivedStateOf(new AndroidComposeView$viewTreeOwners$2(androidComposeView));
        androidComposeView.textInputSessionMutex = SessionMutex.m4192constructorimpl();
        androidComposeView.fontLoader = AndroidComposeUiFlags.isSharedFontEnabled ? composeViewContext.getFontLoader$ui() : new AndroidFontResourceLoader(context);
        androidComposeView.fontFamilyResolver$delegate = AndroidComposeUiFlags.isSharedFontEnabled ? composeViewContext.getFontFamilyResolver$ui() : SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        androidComposeView.layoutDirection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection, null, 2, null);
        androidComposeView.hapticFeedBack = AndroidComposeUiFlags.isSharedHapticsEnabled ? composeViewContext.getHapticFeedback$ui() : new PlatformHapticFeedback(androidComposeView);
        androidComposeView._inputModeManager = new InputModeManagerImpl(androidComposeView.isInTouchMode() ? InputMode.Companion.m5574getTouchaOaMEAU() : InputMode.Companion.m5573getKeyboardaOaMEAU(), new InputModeChangeRequester() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            @Override // androidx.compose.ui.input.InputModeChangeRequester
            /* renamed from: request-iuPiT84 */
            public final boolean mo5575requestiuPiT84(int i2) {
                InputMode.Companion companion2 = InputMode.Companion;
                if (InputMode.m5569equalsimpl0(i2, companion2.m5574getTouchaOaMEAU())) {
                    return AndroidComposeView.this.isInTouchMode();
                }
                if (!InputMode.m5569equalsimpl0(i2, companion2.m5573getKeyboardaOaMEAU())) {
                    return false;
                }
                if (AndroidComposeView.this.isInTouchMode()) {
                    return AndroidComposeView.this.requestFocusFromTouch();
                }
                return true;
            }
        }, objArr3 == true ? 1 : 0);
        androidComposeView.modifierLocalManager = new ModifierLocalManager(androidComposeView);
        androidComposeView.textToolbar = new AndroidTextToolbar(androidComposeView);
        androidComposeView.layerCache = new WeakCache<>();
        androidComposeView.endApplyChangesListeners = new xa0();
        androidComposeView.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MotionEvent motionEvent;
                int actionMasked;
                long j;
                AndroidComposeView.this.removeCallbacks(this);
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i2 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i2 = 2;
                }
                int i3 = i2;
                AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                j = androidComposeView2.relayoutTime;
                androidComposeView2.sendSimulatedEvent(motionEvent, i3, j, false);
            }
        };
        androidComposeView.sendHoverExitEvent = new c5(androidComposeView, i);
        androidComposeView.indirectPointerNavigationGestureDetector = new IndirectPointerNavigationGestureDetector(context, new AndroidComposeView$indirectPointerNavigationGestureDetector$1(androidComposeView));
        androidComposeView.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(androidComposeView);
        androidComposeView.matrixToWindow = new CalculateMatrixToWindowApi29();
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.contentCaptureManager);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(androidComposeView, 1, false);
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        u11.b(androidComposeView, androidComposeViewAccessibilityDelegateCompat);
        ky onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(androidComposeView);
        }
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().attach$ui(androidComposeView);
        AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(androidComposeView);
        if (androidComposeView.isArrEnabled$ui()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            androidComposeView.frameRateCategoryView = view;
            androidComposeView.addView(view);
        }
        androidComposeView.scrollCapture = Build.VERSION.SDK_INT >= 31 ? new ScrollCapture() : null;
        androidComposeView.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentMouseCursorIcon = PointerIcon.Companion.getDefault();
            private PointerIcon currentStylusHoverIcon;

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getIcon() {
                return this.currentMouseCursorIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getStylusHoverIcon() {
                return this.currentStylusHoverIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.currentMouseCursorIcon = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(AndroidComposeView.this, pointerIcon);
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setStylusHoverIcon(PointerIcon pointerIcon) {
                this.currentStylusHoverIcon = pointerIcon;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int e;
        boolean b = q10.b(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.composeAccessibilityDelegate;
        if (b) {
            int e2 = androidComposeViewAccessibilityDelegateCompat.getIdToBeforeMap$ui().e(i, -1);
            if (e2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, e2);
                return;
            }
            return;
        }
        if (!q10.b(str, androidComposeViewAccessibilityDelegateCompat.getExtraDataTestTraversalAfterVal$ui()) || (e = this.composeAccessibilityDelegate.getIdToAfterMap$ui().e(i, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, e);
    }

    private final boolean autofillSupported() {
        return true;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui == null || parent$ui.getHasFixedInnerContentConstraints$ui()) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m6680component1VKZWuLQ(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m6681component2VKZWuLQ(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m6682convertMeasureSpecI7RO_PI(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return m6689packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m6689packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m6689packZIaKswc(size, size);
        }
        throw new IllegalStateException();
    }

    private final void dispatchConfigurationChangeIfNeeded() {
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        updateConfiguration(getResources().getConfiguration());
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int i) {
        boolean containsDescendant;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view = this;
        while (view != null) {
            View rootView = getRootView();
            rootView.getClass();
            view = focusFinder.findNextFocus((ViewGroup) rootView, view, i);
            if (view != null) {
                containsDescendant = AndroidComposeView_androidKt.containsDescendant(this, view);
                if (!containsDescendant) {
                    return view;
                }
            }
        }
        return null;
    }

    /* renamed from: findNextViewInEmbeddedView-3ESFkO8, reason: not valid java name */
    private final View m6683findNextViewInEmbeddedView3ESFkO8(int i) {
        boolean containsDescendant;
        FocusTargetNode activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null) {
            o.f("findNextViewInEmbeddedView called when owner does not have anything focused.");
            return null;
        }
        Integer m4400toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m4400toAndroidFocusDirection3ESFkO8(i);
        if (m4400toAndroidFocusDirection3ESFkO8 == null) {
            throw k4.a("Invalid focus direction");
        }
        int intValue = m4400toAndroidFocusDirection3ESFkO8.intValue();
        View interopView = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode).getInteropView();
        View findFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue);
        if (findNextFocus != null && interopView != null) {
            containsDescendant = AndroidComposeView_androidKt.containsDescendant(interopView, findNextFocus);
            if (containsDescendant) {
                return findNextFocus;
            }
        }
        return null;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
        return null;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.derivedIsAttached$delegate.getValue()).booleanValue();
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        int i;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i = configuration.fontWeightAdjustment;
        return i;
    }

    private final TextInputServiceAndroid getLegacyTextInputServiceAndroid() {
        TextInputServiceAndroid textInputServiceAndroid = this._legacyTextInputServiceAndroid;
        if (textInputServiceAndroid != null) {
            return textInputServiceAndroid;
        }
        TextInputServiceAndroid textInputServiceAndroid2 = new TextInputServiceAndroid(getView(), this);
        this._legacyTextInputServiceAndroid = textInputServiceAndroid2;
        return textInputServiceAndroid2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ComposeViewContext get_composeViewContext() {
        return (ComposeViewContext) this._composeViewContext$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    private final boolean handleIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        boolean dispatchIndirectPointerEvent = getFocusOwner().dispatchIndirectPointerEvent(indirectPointerEvent);
        if (!ComposeUiFlags.isIndirectPointerNavigationGestureDetectorEnabled) {
            return dispatchIndirectPointerEvent;
        }
        this.indirectPointerNavigationGestureDetector.onIndirectPointerEvent(indirectPointerEvent, dispatchIndirectPointerEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0069  */
    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m6685handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        int i;
        MotionEvent motionEvent3;
        int pointerId;
        boolean z;
        MotionEvent motionEvent4;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z2 = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent5 = this.previousMotionEvent;
                boolean z3 = motionEvent5 != null && motionEvent5.getToolType(0) == 3;
                if (motionEvent5 != null) {
                    try {
                        if (hasChangedDevices(motionEvent, motionEvent5)) {
                            if (isDevicePressEvent(motionEvent5)) {
                                this.pointerInputEventProcessor.processCancel();
                            } else if (motionEvent5.getActionMasked() != 10 && z3) {
                                sendSimulatedEvent$default(this, motionEvent5, 10, motionEvent5.getEventTime(), false, 8, null);
                                motionEvent2 = motionEvent5;
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                                    i = 9;
                                    androidComposeView = this;
                                    sendSimulatedEvent$default(androidComposeView, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                                } else {
                                    androidComposeView = this;
                                    i = 9;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = androidComposeView.previousMotionEvent;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent6 = androidComposeView.previousMotionEvent;
                                    pointerId = motionEvent6 == null ? motionEvent6.getPointerId(0) : -1;
                                    if (motionEvent.getAction() == i || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent7 = androidComposeView.previousMotionEvent;
                                            float x = motionEvent7 == null ? motionEvent7.getX() : Float.NaN;
                                            MotionEvent motionEvent8 = androidComposeView.previousMotionEvent;
                                            z = x == motionEvent.getX() || (motionEvent8 != null ? motionEvent8.getY() : Float.NaN) != motionEvent.getY();
                                            motionEvent4 = androidComposeView.previousMotionEvent;
                                            if ((motionEvent4 == null ? motionEvent4.getEventTime() : -1L) != motionEvent.getEventTime()) {
                                                z2 = false;
                                            }
                                            if (!z || z2) {
                                                if (pointerId >= 0) {
                                                    androidComposeView.motionEventAdapter.endStream(pointerId);
                                                }
                                                androidComposeView.pointerInputEventProcessor.clearPreviouslyHitModifierNodes();
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        androidComposeView.motionEventAdapter.endStream(pointerId);
                                    }
                                }
                                androidComposeView.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                                int m6690sendMotionEvent8iAsVTc = m6690sendMotionEvent8iAsVTc(motionEvent);
                                Trace.endSection();
                                androidComposeView.forceUseMatrixCache = false;
                                return m6690sendMotionEvent8iAsVTc;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent5;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z3) {
                }
                androidComposeView = this;
                i = 9;
                if (motionEvent2 != null) {
                }
                motionEvent3 = androidComposeView.previousMotionEvent;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent62 = androidComposeView.previousMotionEvent;
                    if (motionEvent62 == null) {
                    }
                    if (motionEvent.getAction() == i) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent72 = androidComposeView.previousMotionEvent;
                        if (motionEvent72 == null) {
                        }
                        MotionEvent motionEvent82 = androidComposeView.previousMotionEvent;
                        if (motionEvent82 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        motionEvent4 = androidComposeView.previousMotionEvent;
                        if ((motionEvent4 == null ? motionEvent4.getEventTime() : -1L) != motionEvent.getEventTime()) {
                        }
                        if (!z) {
                        }
                        if (pointerId >= 0) {
                        }
                        androidComposeView.pointerInputEventProcessor.clearPreviouslyHitModifierNodes();
                    }
                }
                androidComposeView.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int m6690sendMotionEvent8iAsVTc2 = m6690sendMotionEvent8iAsVTc(motionEvent);
                Trace.endSection();
                androidComposeView.forceUseMatrixCache = false;
                return m6690sendMotionEvent8iAsVTc2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.forceUseMatrixCache = false;
            throw th3;
        }
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        getContext();
        float scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor() * f;
        getContext();
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(scaledVerticalScrollFactor, viewConfiguration.getScaledHorizontalScrollFactor() * f, motionEvent.getEventTime(), motionEvent.getDeviceId()), new AndroidComposeView$handleRotaryEvent$1(this, motionEvent));
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final RetainedValuesStore installLocalRetainedValuesStore(y40 y40Var, a21 a21Var) {
        LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
        if (y40Var != null && a21Var != null && frameEndScheduler != null) {
            t60 c = ((dk) a21Var).c();
            zk0 zk0Var = new zk0(11);
            so soVar = so.b;
            c.getClass();
            soVar.getClass();
            f90 f90Var = new f90(c, zk0Var, soVar);
            ji a = ki0.a(LifecycleRetainedValuesStoreOwner.class);
            String a2 = a.a();
            if (a2 != null) {
                LifecycleRetainedValuesStoreOwner lifecycleRetainedValuesStoreOwner = (LifecycleRetainedValuesStoreOwner) f90Var.a(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a2));
                Object parent = getParent();
                parent.getClass();
                LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry orCreateRetainedValuesStoreEntry = lifecycleRetainedValuesStoreOwner.getOrCreateRetainedValuesStoreEntry(((View) parent).getId());
                this.lifecycleRetainedValuesStoreOwnerEntry = orCreateRetainedValuesStoreEntry;
                return orCreateRetainedValuesStoreEntry.getRetainedValuesStore();
            }
            o.m("Local and anonymous classes can not be ViewModels");
        }
        return null;
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            invalidateLayers(layoutNodeArr[i]);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            invalidateLayoutNodeMeasurement(layoutNodeArr[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAttached() {
        return ((Boolean) this.isAttached$delegate.getValue()).booleanValue();
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* renamed from: moveFocusInChildrenBypassUnfocusableComposeView-3ESFkO8, reason: not valid java name */
    private final boolean m6686moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4393getEnterdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4394getExitdhqQ8s())) {
            return false;
        }
        Integer m4400toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m4400toAndroidFocusDirection3ESFkO8(i);
        if (m4400toAndroidFocusDirection3ESFkO8 == null) {
            throw k4.a("Invalid focus direction");
        }
        int intValue = m4400toAndroidFocusDirection3ESFkO8.intValue();
        View m6683findNextViewInEmbeddedView3ESFkO8 = m6683findNextViewInEmbeddedView3ESFkO8(i);
        if (m6683findNextViewInEmbeddedView3ESFkO8 != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(m6683findNextViewInEmbeddedView3ESFkO8, Integer.valueOf(intValue), null);
        }
        return false;
    }

    /* renamed from: moveFocusInChildrenCurrent-3ESFkO8, reason: not valid java name */
    private final boolean m6687moveFocusInChildrenCurrent3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4393getEnterdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4394getExitdhqQ8s())) {
            return false;
        }
        Integer m4400toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m4400toAndroidFocusDirection3ESFkO8(i);
        if (m4400toAndroidFocusDirection3ESFkO8 == null) {
            throw k4.a("Invalid focus direction");
        }
        int intValue = m4400toAndroidFocusDirection3ESFkO8.intValue();
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        android.graphics.Rect androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = androidRect == null ? focusFinder.findNextFocus(this, findFocus(), intValue) : focusFinder.findNextFocusFromRect(this, androidRect, intValue);
        if (findNextFocus != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(findNextFocus, Integer.valueOf(intValue), androidRect);
        }
        return false;
    }

    /* renamed from: moveFocusInChildrenViewFocusFix-3ESFkO8, reason: not valid java name */
    private final boolean m6688moveFocusInChildrenViewFocusFix3ESFkO8(int i) {
        AndroidViewsHandler androidViewsHandler;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4393getEnterdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4394getExitdhqQ8s()) || !hasFocus() || (androidViewsHandler = this._androidViewsHandler) == null) {
            return false;
        }
        Integer m4400toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m4400toAndroidFocusDirection3ESFkO8(i);
        if (m4400toAndroidFocusDirection3ESFkO8 == null) {
            throw k4.a("Invalid focus direction");
        }
        int intValue = m4400toAndroidFocusDirection3ESFkO8.intValue();
        View rootView = getRootView();
        rootView.getClass();
        ViewGroup viewGroup = (ViewGroup) rootView;
        View findFocus = viewGroup.findFocus();
        if (findFocus == null) {
            o.f("view hasFocus but root can't find it");
            return false;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, findFocus, intValue);
        if (!FocusOwnerImplKt.m4416is1dFocusSearch3ESFkO8(i) || !androidViewsHandler.hasFocus()) {
            Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
            r6 = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
            if (findNextFocus != null && r6 != null) {
                viewGroup.offsetDescendantRectToMyCoords(this, r6);
                viewGroup.offsetRectIntoDescendantCoords(findNextFocus, r6);
            }
        }
        if (findNextFocus == null || findNextFocus == findFocus) {
            return false;
        }
        View focusedChild = androidViewsHandler.getFocusedChild();
        ViewParent parent = findNextFocus.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return FocusInteropUtils_androidKt.requestInteropFocus(findNextFocus, Integer.valueOf(intValue), r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void outOfFrameRunnable$lambda$0(AndroidComposeView androidComposeView) {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        while (!androidComposeView.outOfFrameQueue.isEmpty()) {
            try {
                ((iy) androidComposeView.outOfFrameQueue.removeLast()).invoke();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m6689packZIaKswc(int i, int i2) {
        return (i << 32) | i2;
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = this.tmpPositionArray[0];
            float f4 = f2 - r0[1];
            this.windowPosition = Offset.m4508constructorimpl((Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo6721calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m6762invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                layoutNode = layoutNode.getParent$ui();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$0(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.m6690sendMotionEvent8iAsVTc(motionEvent);
        } else {
            o.f("The ACTION_HOVER_EXIT event was not cleared.");
        }
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m6690sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
                getComposeViewContext().getWindowInfo$ui().m6771setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m6165constructorimpl(motionEvent.getMetaState()));
            } else {
                this._windowInfo.m6771setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m6165constructorimpl(motionEvent.getMetaState()));
            }
        }
        PointerInputEvent convertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (convertToPointerInputEvent$ui == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false, false);
        }
        List<PointerInputEventData> pointers = convertToPointerInputEvent$ui.getPointers();
        int size = pointers.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                pointerInputEventData = pointers.get(size);
                if (pointerInputEventData.getDown() && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        pointerInputEventData = null;
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.m6119getPositionF1C5BW0();
        }
        int m6124processBIzXfog = this.pointerInputEventProcessor.m6124processBIzXfog(convertToPointerInputEvent$ui, this, isInBounds(motionEvent));
        convertToPointerInputEvent$ui.setMotionEvent(null);
        if (actionMasked != 0 && actionMasked != 5) {
            return m6124processBIzXfog;
        }
        if ((m6124processBIzXfog & 1) != 0) {
            return m6124processBIzXfog;
        }
        this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return m6124processBIzXfog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long mo6183localToScreenMKHz9U = mo6183localToScreenMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (mo6183localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (mo6183localToScreenMKHz9U & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent convertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(obtain, this);
        convertToPointerInputEvent$ui.getClass();
        this.pointerInputEventProcessor.m6124processBIzXfog(convertToPointerInputEvent$ui, this, true);
        obtain.recycle();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    private final void setAttached(boolean z) {
        this.isAttached$delegate.setValue(Boolean.valueOf(z));
    }

    private void setDensity(Density density) {
        this.density$delegate.setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void set_composeViewContext(ComposeViewContext composeViewContext) {
        this._composeViewContext$delegate.setValue(composeViewContext);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m6691startDrag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, ky kyVar) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, kyVar, null));
    }

    private final void updateConfiguration(Configuration configuration) {
        boolean diffForWindowMetricsChanged;
        Configuration configuration2 = getConfiguration();
        if (q10.b(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AndroidDensity_androidKt.Density(getContext()));
        }
        diffForWindowMetricsChanged = AndroidComposeView_androidKt.diffForWindowMetricsChanged(configuration2, configuration);
        if (diffForWindowMetricsChanged) {
            updateWindowMetrics();
        }
        if (AndroidComposeUiFlags.isSharedFontEnabled || getFontWeightAdjustmentCompat(configuration2) == getFontWeightAdjustmentCompat(configuration)) {
            return;
        }
        setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int m7739getXimpl = IntOffset.m7739getXimpl(j);
        int m7740getYimpl = IntOffset.m7740getYimpl(j);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        z = false;
        z = false;
        int i = iArr[0];
        if (m7739getXimpl != i || m7740getYimpl != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.globalPosition = IntOffset.m7733constructorimpl((i << 32) | (iArr[1] & 4294967295L));
            if (m7739getXimpl != Integer.MAX_VALUE && m7740getYimpl != Integer.MAX_VALUE) {
                MutableVector<LayoutNode> mutableVector = getRoot().get_children$ui();
                LayoutNode[] layoutNodeArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    layoutNodeArr[i2].getMeasurePassDelegate$ui().requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
                }
                z = true;
            }
        }
        recalculateWindowPosition();
        View view = this._rootView;
        if (view == null) {
            view = getRootView();
            this._rootView = view;
        }
        getRectManager().m6853updateOffsetsgTq6Wqs(this.globalPosition, IntOffsetKt.m7756roundk4lQ0M(this.windowPosition), this.viewToWindowMatrix, view.getWidth(), view.getHeight());
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
        getRectManager().dispatchCallbacks();
    }

    private final void updateWindowMetrics() {
        MutableState mutableState = this._windowInfo._containerSize;
        if (mutableState != null) {
            mutableState.setValue(AndroidWindowInfo_androidKt.calculateWindowSize(this));
        }
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui().addView(androidViewHolder);
        getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        androidViewHolder.setImportantForAccessibility(1);
        u11.b(androidViewHolder, new p0() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
            
                if (r0.intValue() == r3.this$0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L19;
             */
            @Override // defpackage.p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onInitializeAccessibilityNodeInfo(View view, z0 z0Var) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat4;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat5;
                super.onInitializeAccessibilityNodeInfo(view, z0Var);
                androidComposeViewAccessibilityDelegateCompat = AndroidComposeView.this.composeAccessibilityDelegate;
                if (androidComposeViewAccessibilityDelegateCompat.isEnabled$ui()) {
                    z0Var.a.setVisibleToUser(false);
                }
                LayoutNode parent$ui = layoutNode.getParent$ui();
                while (true) {
                    if (parent$ui == null) {
                        parent$ui = null;
                        break;
                    } else if (parent$ui.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
                        break;
                    } else {
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                Integer valueOf = parent$ui != null ? Integer.valueOf(parent$ui.getSemanticsId()) : null;
                if (valueOf != null) {
                }
                valueOf = -1;
                AndroidComposeView androidComposeView = this;
                int intValue = valueOf.intValue();
                z0Var.b = intValue;
                AccessibilityNodeInfo accessibilityNodeInfo = z0Var.a;
                accessibilityNodeInfo.setParent(androidComposeView, intValue);
                int semanticsId = layoutNode.getSemanticsId();
                androidComposeViewAccessibilityDelegateCompat2 = AndroidComposeView.this.composeAccessibilityDelegate;
                int e = androidComposeViewAccessibilityDelegateCompat2.getIdToBeforeMap$ui().e(semanticsId, -1);
                if (e != -1) {
                    View semanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(AndroidComposeView.this.getAndroidViewsHandler$ui(), e);
                    if (semanticsIdToView != null) {
                        accessibilityNodeInfo.setTraversalBefore(semanticsIdToView);
                    } else {
                        accessibilityNodeInfo.setTraversalBefore(this, e);
                    }
                    AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                    androidComposeViewAccessibilityDelegateCompat5 = androidComposeView2.composeAccessibilityDelegate;
                    androidComposeView2.addExtraDataToAccessibilityNodeInfoHelper(semanticsId, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat5.getExtraDataTestTraversalBeforeVal$ui());
                }
                androidComposeViewAccessibilityDelegateCompat3 = AndroidComposeView.this.composeAccessibilityDelegate;
                int e2 = androidComposeViewAccessibilityDelegateCompat3.getIdToAfterMap$ui().e(semanticsId, -1);
                if (e2 != -1) {
                    View semanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(AndroidComposeView.this.getAndroidViewsHandler$ui(), e2);
                    if (semanticsIdToView2 != null) {
                        accessibilityNodeInfo.setTraversalAfter(semanticsIdToView2);
                    } else {
                        accessibilityNodeInfo.setTraversalAfter(this, e2);
                    }
                    AndroidComposeView androidComposeView3 = AndroidComposeView.this;
                    androidComposeViewAccessibilityDelegateCompat4 = androidComposeView3.composeAccessibilityDelegate;
                    androidComposeView3.addExtraDataToAccessibilityNodeInfoHelper(semanticsId, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat4.getExtraDataTestTraversalAfterVal$ui());
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (!ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        if (getFocusOwner().hasFocusableContent()) {
            super.addFocusables(arrayList, i, i2);
            if (getFocusOwner().hasNonInteropFocusableContent() || arrayList == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        if (autofillSupported()) {
            AndroidAutofillManager androidAutofillManager = this._autofillManager;
            if (androidAutofillManager != null) {
                androidAutofillManager.performAutofill(sparseArray);
            }
            AndroidAutofill androidAutofill = this._autofill;
            if (androidAutofill != null) {
                AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
            }
        }
    }

    public final Object boundsUpdatesAccessibilityEventLoop(hm hmVar) {
        Object boundsUpdatesEventLoop$ui = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui(hmVar);
        return boundsUpdatesEventLoop$ui == vn.d ? boundsUpdatesEventLoop$ui : w01.a;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(hm hmVar) {
        Object boundsUpdatesEventLoop$ui = this.contentCaptureManager.boundsUpdatesEventLoop$ui(hmVar);
        return boundsUpdatesEventLoop$ui == vn.d ? boundsUpdatesEventLoop$ui : w01.a;
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo6637calculateLocalPositionMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m5011mapMKHz9U(this.windowToViewMatrix, j);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo6638calculatePositionInWindowMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m5011mapMKHz9U(this.viewToWindowMatrix, j);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.composeAccessibilityDelegate.m6702canScroll0AR0LA0$ui(false, i, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.composeAccessibilityDelegate.m6702canScroll0AR0LA0$ui(true, i, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public void clearOwnerFocus() {
        if (isFocused() || (!ComposeUiFlags.isViewFocusFixEnabled && hasFocus())) {
            clearFocus();
        } else if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            clearFocus();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(my myVar, iy iyVar, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, myVar, iyVar);
        }
        OwnedLayer pop = this.layerCache.pop();
        if (pop == null) {
            return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, myVar, iyVar);
        }
        pop.reuseLayer(myVar, iyVar);
        return pop;
    }

    @Override // androidx.compose.ui.node.Owner
    public void decrementKeepScreenOnCount() {
        this.keepScreenOnCount--;
        getView().setKeepScreenOn(this.keepScreenOnCount > 0);
    }

    @Override // androidx.compose.ui.node.Owner
    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 1) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), false);
            }
            this.sensitiveComponentCount--;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.notifyObjectsInitialized();
        this.isDrawingContent = true;
        try {
            Trace.beginSection("AndroidOwner:draw");
            try {
                CanvasHolder canvasHolder = this.canvasHolder;
                Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
                canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
                getRoot().draw$ui(canvasHolder.getAndroidCanvas(), null);
                canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                if (this.dirtyLayers.e()) {
                    int i = this.dirtyLayers.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((OwnedLayer) this.dirtyLayers.b(i2)).updateDisplayList();
                    }
                }
                if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
                    int save = canvas.save();
                    canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
                    super.dispatchDraw(canvas);
                    canvas.restoreToCount(save);
                }
                this.dirtyLayers.j();
                this.isDrawingContent = false;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
            if (uncaughtExceptionHandler == null) {
                throw th2;
            }
            uncaughtExceptionHandler.onUncaughtException(th2);
        }
        xa0 xa0Var = this.postponedDirtyLayers;
        if (xa0Var != null) {
            this.dirtyLayers.h(xa0Var);
            xa0Var.j();
        }
        if (isArrEnabled$ui()) {
            Api35Impl.setRequestedFrameRate(this, this.currentFrameRate);
            View view = this.frameRateCategoryView;
            if (view != null) {
                Api35Impl.setRequestedFrameRate(view, this.currentFrameRateCategory);
                if (!Float.isNaN(this.currentFrameRateCategory)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
            }
            this.currentFrameRate = Float.NaN;
            this.currentFrameRateCategory = Float.NaN;
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            return motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : (m6685handleMotionEvent8iAsVTc(motionEvent) & 4) != 0;
        }
        if (motionEvent.isFromSource(2097152)) {
            AndroidIndirectPointerEvent m6011convertToIndirectPointerEventk92h6UU$ui = this.motionEventAdapter.m6011convertToIndirectPointerEventk92h6UU$ui(motionEvent, this.primaryDirectionalMotionAxisOverride);
            if (m6011convertToIndirectPointerEventk92h6UU$ui == null) {
                getFocusOwner().dispatchIndirectPointerCancel();
                this.indirectPointerNavigationGestureDetector.cancelCurrentEventStream();
                return true;
            }
            if (handleIndirectPointerEvent(m6011convertToIndirectPointerEventk92h6UU$ui)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (!isBadMotionEvent(motionEvent) && isAttachedToWindow()) {
            this.composeAccessibilityDelegate.dispatchHoverEvent$ui(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && isInBounds(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.previousMotionEvent;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                    this.hoverExitReceived = true;
                    postDelayed(this.sendHoverExitEvent, 8L);
                    return false;
                }
            } else if (!isPositionChanged(motionEvent)) {
                return false;
            }
            if ((m6685handleMotionEvent8iAsVTc(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().mo4407dispatchKeyEventYhN2O0w(androidx.compose.ui.input.key.KeyEvent.m5916constructorimpl(keyEvent), new AndroidComposeView$dispatchKeyEvent$1(this, keyEvent));
        }
        if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            getComposeViewContext().getWindowInfo$ui().m6771setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m6165constructorimpl(keyEvent.getMetaState()));
        } else {
            this._windowInfo.m6771setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m6165constructorimpl(keyEvent.getMetaState()));
        }
        return FocusOwner.m4404dispatchKeyEventYhN2O0w$default(getFocusOwner(), androidx.compose.ui.input.key.KeyEvent.m5916constructorimpl(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().mo4406dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m5916constructorimpl(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: dispatchOnScrollChanged-k-4lQ0M */
    public void mo6639dispatchOnScrollChangedk4lQ0M(long j) {
        Companion.dispatchOnScrollChanged(getViewTreeObserver());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        super.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object m6711boximpl;
        FocusTargetNode activeFocusTargetNode;
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent))) {
            return false;
        }
        int m6685handleMotionEvent8iAsVTc = m6685handleMotionEvent8iAsVTc(motionEvent);
        if ((m6685handleMotionEvent8iAsVTc & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
        boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
        if (z && z2) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null || (m6711boximpl = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                m6711boximpl = AutoClearFocusBehavior.m6711boximpl(AutoClearFocusBehavior.Companion.m6719getDefault4UtRPd4());
            }
            if (q10.b(m6711boximpl, AutoClearFocusBehavior.m6711boximpl(AutoClearFocusBehavior.Companion.m6718getCursorBased4UtRPd4())) && (activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode()) != null) {
                if (!LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.requireLayoutCoordinates(activeFocusTargetNode)).m4542containsk4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L)))) {
                    FocusManager.clearFocus$default(getFocusOwner(), false, 1, null);
                }
            }
        }
        return (m6685handleMotionEvent8iAsVTc & 1) != 0;
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui().drawView(androidViewHolder, canvas);
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public Object executeDelayed(long j, iy iyVar) {
        f2 f2Var = new f2(1, iyVar);
        postDelayed(f2Var, j);
        return f2Var;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r2 != false) goto L12;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i) {
        Rect calculateFocusRectRelativeTo;
        boolean containsDescendant;
        if (view == null || this.measureAndLayoutDelegate.getDuringMeasureLayout$ui()) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus != null) {
            containsDescendant = AndroidComposeView_androidKt.containsDescendant(this, findNextFocus);
        }
        findNextFocus = null;
        if (view == this) {
            calculateFocusRectRelativeTo = getFocusOwner().getFocusRect();
            if (calculateFocusRectRelativeTo == null) {
                calculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(view, this);
            }
        } else {
            calculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(view, this);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        int m4391unboximpl = focusDirection != null ? focusDirection.m4391unboximpl() : FocusDirection.Companion.m4392getDowndhqQ8s();
        ji0 ji0Var = new ji0();
        if (getFocusOwner().mo4408focusSearchULY8qGw(m4391unboximpl, calculateFocusRectRelativeTo, new AndroidComposeView$focusSearch$searchResult$1(ji0Var)) == null) {
            return view;
        }
        if (ji0Var.d != null) {
            if (findNextFocus != null) {
                if (FocusOwnerImplKt.m4416is1dFocusSearch3ESFkO8(m4391unboximpl)) {
                    if (!ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                        return super.focusSearch(view, i);
                    }
                } else if (TwoDimensionalFocusSearchKt.m4464isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) ji0Var.d), FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findNextFocus, this), calculateFocusRectRelativeTo, m4391unboximpl)) {
                }
            }
            return this;
        }
        if (findNextFocus == null) {
            return super.focusSearch(view, i);
        }
        return findNextFocus;
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public void focusTargetAvailable() {
        if (getFocusOwner().getRootState().getHasFocus()) {
            return;
        }
        focusableViewAvailable(this);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean z) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui(z);
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        androidViewsHandler2.getClass();
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.autofill.AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final ComposeViewContext getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.composeViewContextIncrementedDuringInit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Configuration getConfiguration() {
        return (Configuration) this.configuration$delegate.getValue();
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public kn getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public Density getDensity() {
        return (Density) this.density$delegate.getValue();
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public Rect getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.getLeft());
            rect.top = Math.round(embeddedViewFocusRect.getTop());
            rect.right = Math.round(embeddedViewFocusRect.getRight());
            rect.bottom = Math.round(embeddedViewFocusRect.getBottom());
            return;
        }
        if (q10.b(getFocusOwner().mo4408focusSearchULY8qGw(FocusDirection.Companion.m4392getDowndhqQ8s(), null, AndroidComposeView$getFocusedRect$1.INSTANCE), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    public final LifecycleRetainedValuesStoreOwner.FrameEndScheduler getFrameEndScheduler$ui() {
        return this.frameEndScheduler;
    }

    @Override // androidx.compose.ui.node.Owner
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || !this.outOfFrameQueue.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    public final InsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public LocaleList getLocaleList() {
        return (LocaleList) this.localeList$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final IndirectPointerEventPrimaryDirectionalMotionAxis m6692getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // androidx.compose.ui.node.Owner
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public RetainedValuesStore getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.isShowingLayoutBounds(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = this._softwareKeyboardController;
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this._softwareKeyboardController = delegatingSoftwareKeyboardController;
        return delegatingSoftwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public TextInputService getTextInputService() {
        TextInputService textInputService = this._textInputService;
        if (textInputService != null) {
            return textInputService;
        }
        TextInputService textInputService2 = new TextInputService((PlatformTextInputService) AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(getLegacyTextInputServiceAndroid()));
        this._textInputService = textInputService2;
        return textInputService2;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final RootForTest.UncaughtExceptionHandler getUncaughtExceptionHandler$ui() {
        return this.uncaughtExceptionHandler;
    }

    @Override // androidx.compose.ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public WindowInfo getWindowInfo() {
        return AndroidComposeUiFlags.isSharedWindowInfoEnabled ? getComposeViewContext().getWindowInfo$ui() : this._windowInfo;
    }

    public final AndroidAutofillManager get_autofillManager$ui() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public void incrementKeepScreenOnCount() {
        this.keepScreenOnCount++;
        getView().setKeepScreenOn(this.keepScreenOnCount > 0);
    }

    @Override // androidx.compose.ui.node.Owner
    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 0) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), true);
            }
            this.sensitiveComponentCount++;
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.node.Owner
    public void invalidateRootLayer() {
        invalidate();
    }

    public final boolean isArrEnabled$ui() {
        return Build.VERSION.SDK_INT >= 35;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        y40 lifecycleOwner;
        s40 lifecycle;
        r40 r40Var = null;
        if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            lifecycleOwner = getComposeViewContext().getLifecycleOwner$ui();
        } else {
            ViewTreeOwners viewTreeOwners = getViewTreeOwners();
            lifecycleOwner = viewTreeOwners != null ? viewTreeOwners.getLifecycleOwner() : null;
        }
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            r40Var = ((a50) lifecycle).d;
        }
        return r40Var == r40.h;
    }

    @Override // androidx.compose.ui.input.pointer.MatrixPositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo6007localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        Matrix.m5024timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m6708preTranslatecG2Xzmc(fArr, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo6183localToScreenMKHz9U(long j) {
        recalculateWindowPosition();
        long m5011mapMKHz9U = Matrix.m5011mapMKHz9U(this.viewToWindowMatrix, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.windowPosition >> 32)) + Float.intBitsToFloat((int) (m5011mapMKHz9U >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)) + Float.intBitsToFloat((int) (m5011mapMKHz9U & 4294967295L));
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z) {
        iy iyVar;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    iyVar = this.resendMotionEventOnLayout;
                } finally {
                    Trace.endSection();
                }
            } else {
                iyVar = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(iyVar)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            getRectManager().dispatchCallbacks();
            dispatchPendingInteropLayoutCallbacks();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo6640measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m6512measureAndLayout0kLqBqw(layoutNode, j);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
                getRectManager().dispatchCallbacks();
                dispatchPendingInteropLayoutCallbacks();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.outOfFrameRunnable);
        }
        this.outOfFrameRunnable.run();
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* renamed from: moveFocusInChildren-3ESFkO8 */
    public boolean mo4457moveFocusInChildren3ESFkO8(int i) {
        return ComposeUiFlags.isViewFocusFixEnabled ? m6688moveFocusInChildrenViewFocusFix3ESFkO8(i) : ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? m6686moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(i) : m6687moveFocusInChildrenCurrent3ESFkO8(i);
    }

    public final void notifyLayerIsDirty$ui(OwnedLayer ownedLayer, boolean z) {
        boolean z2 = this.isDrawingContent;
        if (!z) {
            if (z2) {
                return;
            }
            this.dirtyLayers.k(ownedLayer);
            xa0 xa0Var = this.postponedDirtyLayers;
            if (xa0Var != null) {
                xa0Var.k(ownedLayer);
                return;
            }
            return;
        }
        if (!z2) {
            this.dirtyLayers.g(ownedLayer);
            return;
        }
        xa0 xa0Var2 = this.postponedDirtyLayers;
        if (xa0Var2 == null) {
            xa0Var2 = new xa0();
            this.postponedDirtyLayers = xa0Var2;
        }
        xa0Var2.g(ownedLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        y40 lifecycleOwner;
        s40 lifecycle;
        s40 s40Var;
        y40 lifecycleOwner2;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
        }
        if (ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
            this.insetsListener.onViewAttachedToWindow(this);
        }
        Companion.addNotificationForSysPropsChange(this);
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().incrementViewCount$ui();
        }
        this.composeViewContextIncrementedDuringInit = false;
        if (!AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            this._windowInfo.setWindowFocused(hasWindowFocus());
            this._windowInfo.setOnInitializeContainerSize(new AndroidComposeView$onAttachedToWindow$1(this));
            updateWindowMetrics();
        }
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        s40 s40Var2 = null;
        if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            RetainedValuesStore installLocalRetainedValuesStore = installLocalRetainedValuesStore(getComposeViewContext().getLifecycleOwner$ui(), getComposeViewContext().getViewModelStoreOwner$ui());
            if (installLocalRetainedValuesStore == null) {
                installLocalRetainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
            }
            this.retainedValuesStore = installLocalRetainedValuesStore;
            ky kyVar = this.onReadyForComposition;
            if (kyVar != null) {
                kyVar.invoke(getComposeViewContext());
                this.onReadyForComposition = null;
            }
            s40Var = getComposeViewContext().getLifecycleOwner$ui().getLifecycle();
        } else {
            y40 o = q10.o(this);
            hl0 t = y80.t(this);
            a21 n = p01.n(this);
            RetainedValuesStore installLocalRetainedValuesStore2 = installLocalRetainedValuesStore(o, n);
            if (installLocalRetainedValuesStore2 == null) {
                installLocalRetainedValuesStore2 = ForgetfulRetainedValuesStore.INSTANCE;
            }
            this.retainedValuesStore = installLocalRetainedValuesStore2;
            ViewTreeOwners viewTreeOwners = getViewTreeOwners();
            if (viewTreeOwners == null || (o != null && t != null && (o != viewTreeOwners.getLifecycleOwner() || t != viewTreeOwners.getSavedStateRegistryOwner() || n != viewTreeOwners.getViewModelStoreOwner()))) {
                if (o == null) {
                    o.f("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                    return;
                }
                if (t == null) {
                    o.f("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                    return;
                }
                if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.b(this);
                }
                o.getLifecycle().a(this);
                set_viewTreeOwners(new ViewTreeOwners(o, t, n));
                ky kyVar2 = this.onReadyForComposition;
                if (kyVar2 != null) {
                    kyVar2.invoke(getComposeViewContext());
                }
                this.onReadyForComposition = null;
            }
            ViewTreeOwners viewTreeOwners2 = getViewTreeOwners();
            if (viewTreeOwners2 != null && (lifecycleOwner2 = viewTreeOwners2.getLifecycleOwner()) != null) {
                s40Var2 = lifecycleOwner2.getLifecycle();
            }
            if (s40Var2 == null) {
                throw k4.a("No lifecycle owner exists");
            }
            s40Var = s40Var2;
        }
        s40Var.a(this);
        s40Var.a(this.contentCaptureManager);
        this._inputModeManager.m5578setInputModeiuPiT84(isInTouchMode() ? InputMode.Companion.m5574getTouchaOaMEAU() : InputMode.Companion.m5573getKeyboardaOaMEAU());
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (i >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getFocusOwner().getListeners().g(androidAutofillManager);
            getSemanticsOwner().getListeners$ui().g(androidAutofillManager);
        }
        getFocusOwner().getListeners().g(this);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m4196getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? getLegacyTextInputServiceAndroid().isEditorFocused() : androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateConfiguration(configuration);
    }

    @Override // defpackage.jq
    public void onCreate(y40 y40Var) {
        y40Var.getClass();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m4196getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? getLegacyTextInputServiceAndroid().createInputConnection(editorInfo) : androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui(jArr, iArr, consumer);
    }

    @Override // defpackage.jq
    public void onDestroy(y40 y40Var) {
        y40Var.getClass();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        getLayoutNodes().g(layoutNode.getSemanticsId());
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onDetach$ui(layoutNode);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        s40 lifecycle;
        y40 lifecycleOwner;
        AndroidAutofill androidAutofill;
        super.onDetachedFromWindow();
        setAttached(false);
        if (ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
            this.insetsListener.onViewDetachedFromWindow(this);
        }
        View view = this.frameRateCategoryView;
        if (isArrEnabled$ui() && view != null) {
            removeView(view);
        }
        Companion.removeNotificationForSysPropsChange(this);
        getComposeViewContext().decrementViewCount$ui();
        getSnapshotObserver().stopObserving$ui();
        if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            lifecycle = getComposeViewContext().getLifecycleOwner$ui().getLifecycle();
        } else {
            this._windowInfo.setOnInitializeContainerSize(null);
            ViewTreeOwners viewTreeOwners = getViewTreeOwners();
            lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null) ? null : lifecycleOwner.getLifecycle();
            if (lifecycle == null) {
                throw k4.a("No lifecycle owner exists");
            }
        }
        lifecycle.b(this.contentCaptureManager);
        lifecycle.b(this);
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.release();
        }
        this.lifecycleRetainedValuesStoreOwnerEntry = null;
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getSemanticsOwner().getListeners$ui().k(androidAutofillManager);
            getFocusOwner().getListeners().k(androidAutofillManager);
        }
        getRectManager().resetOffsets();
        getRectManager().dispatchCallbacks();
        getRectManager().removeScheduledCallback();
        getFocusOwner().getListeners().k(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        r3.m(0, r0);
     */
    @Override // androidx.compose.ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onEndApplyChanges() {
        xa0 xa0Var;
        AndroidAutofillManager androidAutofillManager;
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        if (autofillSupported() && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onEndApplyChanges$ui();
        }
        loop0: while (this.endApplyChangesListeners.e() && this.endApplyChangesListeners.b(0) != null) {
            int i = this.endApplyChangesListeners.b;
            int i2 = 0;
            while (true) {
                xa0 xa0Var2 = this.endApplyChangesListeners;
                if (i2 < i) {
                    iy iyVar = (iy) xa0Var2.b(i2);
                    xa0Var = this.endApplyChangesListeners;
                    if (i2 < 0 || i2 >= xa0Var.b) {
                        break loop0;
                    }
                    Object[] objArr = xa0Var.a;
                    Object obj = objArr[i2];
                    objArr[i2] = null;
                    if (iyVar != null) {
                        iyVar.invoke();
                    }
                    i2++;
                }
            }
            xa0Var.f(i2);
            throw null;
        }
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        NodeChain nodes$ui;
        boolean z;
        NodeChain nodes$ui2;
        boolean z2;
        if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled || focusTargetModifierNode == null) {
            return;
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(2097152);
        if (!focusTargetModifierNode.getNode().isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = focusTargetModifierNode.getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
        gb0 gb0Var = null;
        ArrayList arrayList = null;
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        Modifier.Node node2 = node;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof IndirectPointerInputModifierNode) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node2);
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2 && (node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node2 = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui2 = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
        }
        if (arrayList == null) {
            return;
        }
        if (focusTargetModifierNode2 != null) {
            int m6573constructorimpl2 = NodeKind.m6573constructorimpl(2097152);
            if (!focusTargetModifierNode2.getNode().isAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node3 = focusTargetModifierNode2.getNode();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode2);
            gb0 gb0Var2 = null;
            while (requireLayoutNode2 != null) {
                if ((fc.b(requireLayoutNode2) & m6573constructorimpl2) != 0) {
                    while (node3 != null) {
                        if ((node3.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            Modifier.Node node4 = node3;
                            MutableVector mutableVector2 = null;
                            while (node4 != null) {
                                if (node4 instanceof IndirectPointerInputModifierNode) {
                                    if (gb0Var2 == null) {
                                        gb0 gb0Var3 = sl0.a;
                                        gb0Var2 = new gb0();
                                    }
                                    gb0Var2.d(node4);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (node4.getKindSet$ui() & m6573constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) node4).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node4 = delegate$ui2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node4 != null) {
                                                    mutableVector2.add(node4);
                                                    node4 = null;
                                                }
                                                mutableVector2.add(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node4 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        node3 = node3.getParent$ui();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                node3 = (requireLayoutNode2 == null || (nodes$ui = requireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            gb0Var = gb0Var2;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            IndirectPointerInputModifierNode indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) arrayList.get(i3);
            if (!(gb0Var != null ? gb0Var.a(indirectPointerInputModifierNode) : false)) {
                indirectPointerInputModifierNode.onCancelIndirectPointerInput();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        updatePositionCacheAndDispatch();
        dispatchConfigurationChangeIfNeeded();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
            this.onMeasureConstraints = null;
            updatePositionCacheAndDispatch();
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutNodeDeactivated(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onLayoutNodeDeactivated$ui(layoutNode);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long m6682convertMeasureSpecI7RO_PI = m6682convertMeasureSpecI7RO_PI(i);
            long m6682convertMeasureSpecI7RO_PI2 = m6682convertMeasureSpecI7RO_PI(i2);
            long m7572fitPrioritizingHeightZbe2FdA = Constraints.Companion.m7572fitPrioritizingHeightZbe2FdA((int) (m6682convertMeasureSpecI7RO_PI >>> 32), (int) (m6682convertMeasureSpecI7RO_PI & 4294967295L), (int) (m6682convertMeasureSpecI7RO_PI2 >>> 32), (int) (4294967295L & m6682convertMeasureSpecI7RO_PI2));
            Constraints constraints = this.onMeasureConstraints;
            boolean z = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m7551boximpl(m7572fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    z = Constraints.m7557equalsimpl0(constraints.m7570unboximpl(), m7572fitPrioritizingHeightZbe2FdA);
                }
                if (!z) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m6513updateRootConstraintsBRTryo0(m7572fitPrioritizingHeightZbe2FdA);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), GroupFlagsKt.IsSubcompositionContextFlag), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), GroupFlagsKt.IsSubcompositionContextFlag));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.jq
    public void onPause(y40 y40Var) {
        y40Var.getClass();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostAttach(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onPostAttach$ui(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostLayoutNodeReused(LayoutNode layoutNode, int i) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onPostLayoutNodeReused$ui(layoutNode, i);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreAttach(LayoutNode layoutNode) {
        getLayoutNodes().i(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreLayoutNodeReused(LayoutNode layoutNode, int i) {
        getLayoutNodes().g(i);
        getLayoutNodes().i(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!autofillSupported() || viewStructure == null) {
            return;
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.populateViewStructure(viewStructure);
        }
        AndroidAutofill androidAutofill = this._autofill;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.measureAndLayoutDelegate;
        if (z) {
            if (measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z2) && z3) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (measureAndLayoutDelegate.requestRemeasure(layoutNode, z2) && z3) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.measureAndLayoutDelegate;
        if (z) {
            if (measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z2)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (measureAndLayoutDelegate.requestRelayout(layoutNode, z2)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon stylusHoverIcon;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (stylusHoverIcon = getPointerIconService().getStylusHoverIcon()) == null) ? super.onResolvePointerIcon(motionEvent, i) : AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), stylusHoverIcon);
    }

    @Override // defpackage.jq
    public void onResume(y40 y40Var) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
        }
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
            frameEndScheduler.getClass();
            retainedValuesStoreEntry.stopRetainingExitedValues(frameEndScheduler);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(i);
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        updatePositionCacheAndDispatch();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui();
        this.contentCaptureManager.onSemanticsChange$ui();
    }

    @Override // defpackage.jq
    public void onStart(y40 y40Var) {
        y40Var.getClass();
    }

    @Override // defpackage.jq
    public void onStop(y40 y40Var) {
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.startRetainingExitedValues();
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z) {
        this._inputModeManager.m5578setInputModeiuPiT84(z ? InputMode.Companion.m5574getTouchaOaMEAU() : InputMode.Companion.m5573getKeyboardaOaMEAU());
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui(androidContentCaptureManager, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean isShowingLayoutBounds;
        if (!AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            this._windowInfo.setWindowFocused(z);
        }
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui(OwnedLayer ownedLayer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        this.dirtyLayers.k(ownedLayer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(iy iyVar) {
        if (this.endApplyChangesListeners.c(iyVar) >= 0) {
            return;
        }
        this.endApplyChangesListeners.g(iyVar);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder) {
        getAndroidViewsHandler$ui().removeViewInLayout(androidViewHolder);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = getAndroidViewsHandler$ui().getLayoutNodeToHolder();
        p01.c(layoutNodeToHolder).remove(getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(androidViewHolder));
        androidViewHolder.setImportantForAccessibility(0);
    }

    public final void removeConnectionToComposeViewContext() {
        if (this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().decrementViewCount$ui();
            this.composeViewContextIncrementedDuringInit = false;
        }
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public void removeDelayedExecution(Object obj) {
        Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
        if (runnable == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestAutofill(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.requestAutofill$ui(layoutNode);
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, android.graphics.Rect rect) {
        return ComposeUiFlags.isViewFocusFixEnabled ? requestFocusViewFocusFix(i, rect) : ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? requestFocusBypassUnfocusableComposeView(i, rect) : requestFocusCurrent(i, rect);
    }

    public final boolean requestFocusBypassUnfocusableComposeView(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        int m4391unboximpl = focusDirection != null ? focusDirection.m4391unboximpl() : FocusDirection.Companion.m4393getEnterdhqQ8s();
        Boolean mo4408focusSearchULY8qGw = getFocusOwner().mo4408focusSearchULY8qGw(m4391unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1(m4391unboximpl));
        Boolean bool = Boolean.TRUE;
        if (q10.b(mo4408focusSearchULY8qGw, bool) || q10.b(getFocusOwner().mo4408focusSearchULY8qGw(m4391unboximpl, null, new AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1(m4391unboximpl)), bool)) {
            return true;
        }
        if (hasFocus() && FocusOwnerImplKt.m4416is1dFocusSearch3ESFkO8(m4391unboximpl)) {
            return getFocusOwner().mo4411resetFocus3ESFkO8(m4391unboximpl);
        }
        return false;
    }

    public final boolean requestFocusCurrent(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().getRootState().getHasFocus()) {
            return super.requestFocus(i, rect);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        int m4391unboximpl = focusDirection != null ? focusDirection.m4391unboximpl() : FocusDirection.Companion.m4393getEnterdhqQ8s();
        return q10.b(getFocusOwner().mo4408focusSearchULY8qGw(m4391unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new AndroidComposeView$requestFocusCurrent$1(m4391unboximpl)), Boolean.TRUE);
    }

    public final boolean requestFocusViewFocusFix(int i, android.graphics.Rect rect) {
        View findNextNonChildView;
        if (isFocused()) {
            return true;
        }
        if (this.processingRequestFocusForNextNonChildView) {
            return false;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        int m4391unboximpl = focusDirection != null ? focusDirection.m4391unboximpl() : FocusDirection.Companion.m4393getEnterdhqQ8s();
        if (hasFocus() && mo4457moveFocusInChildren3ESFkO8(m4391unboximpl)) {
            return true;
        }
        fi0 fi0Var = new fi0();
        Boolean mo4408focusSearchULY8qGw = getFocusOwner().mo4408focusSearchULY8qGw(m4391unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1(fi0Var, m4391unboximpl));
        if (mo4408focusSearchULY8qGw == null) {
            return false;
        }
        if (mo4408focusSearchULY8qGw.booleanValue()) {
            return true;
        }
        if (fi0Var.d) {
            return false;
        }
        if ((rect != null && !hasFocus() && q10.b(getFocusOwner().mo4408focusSearchULY8qGw(m4391unboximpl, null, new AndroidComposeView$requestFocusViewFocusFix$altFocus$1(m4391unboximpl)), Boolean.TRUE)) || (findNextNonChildView = findNextNonChildView(i)) == null || findNextNonChildView == this) {
            return true;
        }
        this.processingRequestFocusForNextNonChildView = true;
        boolean requestFocus = findNextNonChildView.requestFocus(i);
        this.processingRequestFocusForNextNonChildView = false;
        return requestFocus;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* renamed from: requestOwnerFocus-7o62pno */
    public boolean mo4458requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect) {
        Integer m4400toAndroidFocusDirection3ESFkO8;
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if (isFocused()) {
                return true;
            }
        } else if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (m4400toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m4400toAndroidFocusDirection3ESFkO8(focusDirection.m4391unboximpl())) == null) ? 130 : m4400toAndroidFocusDirection3ESFkO8.intValue(), rect != null ? RectHelper_androidKt.toAndroidRect(rect) : null);
    }

    @Override // androidx.compose.ui.node.OutOfFrameExecutor
    public void schedule(iy iyVar) {
        boolean isEmpty = this.outOfFrameQueue.isEmpty();
        this.outOfFrameQueue.addLast(iyVar);
        if (isEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.outOfFrameRunnable);
            } else {
                o.m("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo6184screenToLocalMKHz9U(long j) {
        recalculateWindowPosition();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return Matrix.m5011mapMKHz9U(this.windowToViewMatrix, Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
    }

    @Override // androidx.compose.ui.node.RootForTest
    public boolean sendIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        if (AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent).getActionMasked() != 3) {
            return handleIndirectPointerEvent(indirectPointerEvent);
        }
        getFocusOwner().dispatchIndirectPointerCancel();
        return true;
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo6641sendKeyEventZmokQxo(KeyEvent keyEvent) {
        return getFocusOwner().mo4406dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || FocusOwner.m4404dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui(j);
    }

    public final void setComposeViewContext(ComposeViewContext composeViewContext) {
        if (!(getCoroutineContext() == composeViewContext.getCompositionContext$ui().getEffectCoroutineContext() || getRoot().getChildren$ui().isEmpty())) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            ComposeViewContext composeViewContext2 = get_composeViewContext();
            if (composeViewContext != composeViewContext2) {
                if (isAttachedToWindow()) {
                    composeViewContext2.decrementViewCount$ui();
                    composeViewContext.incrementViewCount$ui();
                }
                set_composeViewContext(composeViewContext);
                setCoroutineContext(composeViewContext.getCompositionContext$ui().getEffectCoroutineContext());
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration$delegate.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    public void setCoroutineContext(kn knVar) {
        this.coroutineContext = knVar;
    }

    public final void setFrameEndScheduler$ui(LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler) {
        this.frameEndScheduler = frameEndScheduler;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnReadyForComposition(ky kyVar) {
        if (!AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            if (getViewTreeOwners() != null) {
                kyVar.invoke(getComposeViewContext());
            }
            if (isAttachedToWindow()) {
                return;
            }
            this.onReadyForComposition = kyVar;
            return;
        }
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            kyVar.invoke(getComposeViewContext());
        } else {
            this.onReadyForComposition = kyVar;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m6693setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        this.primaryDirectionalMotionAxisOverride = indirectPointerEventPrimaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setUncaughtExceptionHandler(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        this.measureAndLayoutDelegate.setUncaughtExceptionHandler$ui(uncaughtExceptionHandler);
    }

    public final void setUncaughtExceptionHandler$ui(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object textInputSession(my myVar, hm hmVar) {
        AndroidComposeView$textInputSession$1 androidComposeView$textInputSession$1;
        int i;
        if (hmVar instanceof AndroidComposeView$textInputSession$1) {
            androidComposeView$textInputSession$1 = (AndroidComposeView$textInputSession$1) hmVar;
            int i2 = androidComposeView$textInputSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidComposeView$textInputSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidComposeView$textInputSession$1.result;
                i = androidComposeView$textInputSession$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    AtomicReference<SessionMutex.Session<AndroidPlatformTextInputSession>> atomicReference = this.textInputSessionMutex;
                    AndroidComposeView$textInputSession$2 androidComposeView$textInputSession$2 = new AndroidComposeView$textInputSession$2(this);
                    androidComposeView$textInputSession$1.label = 1;
                    Object m4199withSessionCancellingPreviousimpl = SessionMutex.m4199withSessionCancellingPreviousimpl(atomicReference, androidComposeView$textInputSession$2, myVar, androidComposeView$textInputSession$1);
                    vn vnVar = vn.d;
                    if (m4199withSessionCancellingPreviousimpl == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                o.j();
                return null;
            }
        }
        androidComposeView$textInputSession$1 = new AndroidComposeView$textInputSession$1(this, hmVar);
        Object obj2 = androidComposeView$textInputSession$1.result;
        i = androidComposeView$textInputSession$1.label;
        if (i != 0) {
        }
        o.j();
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public void voteFrameRate(float f) {
        if (isArrEnabled$ui()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.currentFrameRate) || f > this.currentFrameRate) {
                    this.currentFrameRate = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.currentFrameRateCategory) || f < this.currentFrameRateCategory) {
                    this.currentFrameRateCategory = f;
                }
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addNotificationForSysPropsChange(AndroidComposeView androidComposeView) {
            if (AndroidComposeView.systemPropertiesChangedRunnable == null) {
                d5 d5Var = new d5();
                AndroidComposeView.systemPropertiesChangedRunnable = d5Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (AndroidComposeView.systemPropertiesClass == null) {
                        AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    }
                    if (AndroidComposeView.addChangeCallbackMethod == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = AndroidComposeView.systemPropertiesClass;
                        AndroidComposeView.addChangeCallbackMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = AndroidComposeView.addChangeCallbackMethod;
                    if (method != null) {
                        method.invoke(null, d5Var);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            synchronized (AndroidComposeView.composeViews) {
                AndroidComposeView.composeViews.g(androidComposeView);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addNotificationForSysPropsChange$lambda$0() {
            synchronized (AndroidComposeView.composeViews) {
                try {
                    int i = 0;
                    if (Build.VERSION.SDK_INT < 30) {
                        xa0 xa0Var = AndroidComposeView.composeViews;
                        Object[] objArr = xa0Var.a;
                        int i2 = xa0Var.b;
                        while (i < i2) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i];
                            boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                            androidComposeView.setShowLayoutBounds(AndroidComposeView.Companion.getIsShowingLayoutBounds());
                            if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                androidComposeView.post(new c5(androidComposeView, 2));
                            }
                            i++;
                        }
                    } else {
                        xa0 xa0Var2 = AndroidComposeView.composeViews;
                        Object[] objArr2 = xa0Var2.a;
                        int i3 = xa0Var2.b;
                        while (i < i3) {
                            AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr2[i];
                            androidComposeView2.post(new c5(androidComposeView2, 3));
                            i++;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                }
                if (AndroidComposeView.getBooleanMethod == null) {
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return q10.b(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeNotificationForSysPropsChange(AndroidComposeView androidComposeView) {
            synchronized (AndroidComposeView.composeViews) {
                AndroidComposeView.composeViews.k(androidComposeView);
            }
        }

        public final void dispatchOnScrollChanged(ViewTreeObserver viewTreeObserver) {
            try {
                if (AndroidComposeView.dispatchOnScrollChangedMethod == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.dispatchOnScrollChangedMethod = declaredMethod;
                }
                Method method = AndroidComposeView.dispatchOnScrollChangedMethod;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public na0 getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addView(view, -1, generateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class RootModifierNode extends Modifier.Node implements BringIntoViewModifierNode, SemanticsModifierNode, RotaryInputModifierNode, KeyInputModifierNode, LayoutModifierNode, TraversableNode, WindowInsetsRulerProvider {
        private int previousGeneration = -1;
        private final ky rulerLambda = new AndroidComposeView$RootModifierNode$rulerLambda$1(this);

        public RootModifierNode() {
        }

        @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
        public Object bringIntoView(LayoutCoordinates layoutCoordinates, iy iyVar, hm hmVar) {
            long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
            Rect rect = (Rect) iyVar.invoke();
            Rect m4553translatek4lQ0M = rect != null ? rect.m4553translatek4lQ0M(positionInRoot) : null;
            if (m4553translatek4lQ0M != null) {
                AndroidComposeView.this.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(m4553translatek4lQ0M), false);
            }
            return w01.a;
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public xa0 getCutoutRects() {
            return getInsetsListener().getDisplayCutouts();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public List<RectRulers> getCutoutRulers() {
            return getInsetsListener().getDisplayCutoutRulers();
        }

        public final MutableIntState getGeneration() {
            return getInsetsListener().getGeneration();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public InsetsListener getInsetsListener() {
            return AndroidComposeView.this.getInsetsListener();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public pl0 getInsetsValues() {
            return getInsetsListener().getInsetsValues();
        }

        public final int getPreviousGeneration() {
            return this.previousGeneration;
        }

        public final ky getRulerLambda() {
            return this.rulerLambda;
        }

        @Override // androidx.compose.ui.node.TraversableNode
        public Object getTraverseKey() {
            return WindowInsetsRulers_androidKt.RulerKey;
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s */
        public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, this.rulerLambda, new AndroidComposeView$RootModifierNode$measure$1(mo6234measureBRTryo0), 4, null);
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* renamed from: onKeyEvent-ZmokQxo */
        public boolean mo196onKeyEventZmokQxo(KeyEvent keyEvent) {
            Boolean mo4408focusSearchULY8qGw;
            FocusDirection m4401toFocusDirectionZmokQxo = FocusInteropUtils_androidKt.m4401toFocusDirectionZmokQxo(keyEvent);
            if (m4401toFocusDirectionZmokQxo == null || !KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5929getKeyDownCS__XNY())) {
                return false;
            }
            if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                FocusTargetNode activeFocusTargetNode = AndroidComposeView.this.getFocusOwner().getActiveFocusTargetNode();
                if (activeFocusTargetNode != null && activeFocusTargetNode.isInteropViewHost() && AndroidComposeView.this.mo4457moveFocusInChildren3ESFkO8(m4401toFocusDirectionZmokQxo.m4391unboximpl())) {
                    return true;
                }
                Boolean mo4408focusSearchULY8qGw2 = AndroidComposeView.this.getFocusOwner().mo4408focusSearchULY8qGw(m4401toFocusDirectionZmokQxo.m4391unboximpl(), AndroidComposeView.this.getEmbeddedViewFocusRect(), new AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1(m4401toFocusDirectionZmokQxo));
                if (mo4408focusSearchULY8qGw2 != null ? mo4408focusSearchULY8qGw2.booleanValue() : true) {
                    return true;
                }
                if (FocusOwnerImplKt.m4416is1dFocusSearch3ESFkO8(m4401toFocusDirectionZmokQxo.m4391unboximpl())) {
                    Integer m4400toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m4400toAndroidFocusDirection3ESFkO8(m4401toFocusDirectionZmokQxo.m4391unboximpl());
                    int intValue = m4400toAndroidFocusDirection3ESFkO8 != null ? m4400toAndroidFocusDirection3ESFkO8.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = AndroidComposeView.this.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, AndroidComposeView.this.getView(), intValue);
                    if (findNextFocus == null || findNextFocus.equals(AndroidComposeView.this)) {
                        return AndroidComposeView.this.getFocusOwner().mo4411resetFocus3ESFkO8(m4401toFocusDirectionZmokQxo.m4391unboximpl());
                    }
                }
                return false;
            }
            Integer m4400toAndroidFocusDirection3ESFkO82 = FocusInteropUtils_androidKt.m4400toAndroidFocusDirection3ESFkO8(m4401toFocusDirectionZmokQxo.m4391unboximpl());
            if (ComposeUiFlags.isViewFocusFixEnabled && AndroidComposeView.this.hasFocus() && m4400toAndroidFocusDirection3ESFkO82 != null && AndroidComposeView.this.mo4457moveFocusInChildren3ESFkO8(m4401toFocusDirectionZmokQxo.m4391unboximpl())) {
                return true;
            }
            Rect embeddedViewFocusRect = AndroidComposeView.this.getEmbeddedViewFocusRect();
            Boolean mo4408focusSearchULY8qGw3 = AndroidComposeView.this.getFocusOwner().mo4408focusSearchULY8qGw(m4401toFocusDirectionZmokQxo.m4391unboximpl(), embeddedViewFocusRect, new AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$2(m4401toFocusDirectionZmokQxo));
            if (mo4408focusSearchULY8qGw3 != null ? mo4408focusSearchULY8qGw3.booleanValue() : true) {
                return true;
            }
            if (!FocusOwnerImplKt.m4416is1dFocusSearch3ESFkO8(m4401toFocusDirectionZmokQxo.m4391unboximpl())) {
                return false;
            }
            if (m4400toAndroidFocusDirection3ESFkO82 != null) {
                View findNextNonChildView = AndroidComposeView.this.findNextNonChildView(m4400toAndroidFocusDirection3ESFkO82.intValue());
                if (q10.b(findNextNonChildView, AndroidComposeView.this)) {
                    findNextNonChildView = null;
                }
                if (findNextNonChildView != null) {
                    android.graphics.Rect androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
                    if (androidRect == null) {
                        throw k4.a("Invalid rect");
                    }
                    View rootView2 = AndroidComposeView.this.getRootView();
                    rootView2.getClass();
                    ViewGroup viewGroup = (ViewGroup) rootView2;
                    viewGroup.offsetDescendantRectToMyCoords(AndroidComposeView.this.getView(), androidRect);
                    viewGroup.offsetRectIntoDescendantCoords(findNextNonChildView, androidRect);
                    if (FocusInteropUtils_androidKt.requestInteropFocus(findNextNonChildView, m4400toAndroidFocusDirection3ESFkO82, androidRect)) {
                        return true;
                    }
                }
            }
            if (AndroidComposeView.this.getFocusOwner().mo4405clearFocusI7lrPNg(false, true, false, m4401toFocusDirectionZmokQxo.m4391unboximpl()) && (mo4408focusSearchULY8qGw = AndroidComposeView.this.getFocusOwner().mo4408focusSearchULY8qGw(m4401toFocusDirectionZmokQxo.m4391unboximpl(), null, new AndroidComposeView$RootModifierNode$onKeyEvent$1(m4401toFocusDirectionZmokQxo))) != null) {
                return mo4408focusSearchULY8qGw.booleanValue();
            }
            return true;
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* renamed from: onPreKeyEvent-ZmokQxo */
        public boolean mo198onPreKeyEventZmokQxo(KeyEvent keyEvent) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
            return false;
        }

        public final void setPreviousGeneration(int i) {
            this.previousGeneration = i;
        }

        public static /* synthetic */ void getRulerLambda$annotations() {
        }

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }
    }

    @er
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m6684getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @er
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    @Override // androidx.compose.ui.node.Owner
    public RootForTest getRootForTest() {
        return this;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] fArr = this.viewToWindowMatrix;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long m5011mapMKHz9U = Matrix.m5011mapMKHz9U(fArr, Offset.m4508constructorimpl((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32)));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (m5011mapMKHz9U >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (m5011mapMKHz9U & 4294967295L));
        this.windowPosition = Offset.m4508constructorimpl((Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L));
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }
}
