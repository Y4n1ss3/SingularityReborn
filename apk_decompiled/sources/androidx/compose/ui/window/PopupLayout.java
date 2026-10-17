package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ii0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import defpackage.y80;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    private Object backCallback;
    private final State canCalculatePosition$delegate;
    private final View composeView;
    private final MutableState content$delegate;
    private final boolean isNested;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private iy onDismissRequest;
    private final WindowManager.LayoutParams params;
    private IntRect parentBounds;
    private final MutableState parentLayoutCoordinates$delegate;
    private LayoutDirection parentLayoutDirection;
    private final int[] parentLocationInWindow;
    private final int[] parentLocationOnScreen;
    private final MutableState popupContentSize$delegate;
    private final PopupLayoutHelper popupLayoutHelper;
    private PopupPositionProvider positionProvider;
    private final Rect previousWindowVisibleFrame;
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final SnapshotStateObserver snapshotStateObserver;
    private String testTag;
    private final WindowManager windowManager;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ky onCommitAffectingPopupPosition = PopupLayout$Companion$onCommitAffectingPopupPosition$1.INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PopupLayout(iy iyVar, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, boolean z, PopupLayoutHelper popupLayoutHelper) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = iyVar;
        this.properties = popupProperties;
        this.testTag = str;
        this.composeView = view;
        this.isNested = z;
        this.popupLayoutHelper = popupLayoutHelper;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentLayoutCoordinates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new PopupLayout$canCalculatePosition$2(this));
        float m7611constructorimpl = Dp.m7611constructorimpl(8.0f);
        this.maxSupportedElevation = m7611constructorimpl;
        this.previousWindowVisibleFrame = new Rect();
        this.parentLocationOnScreen = new int[2];
        this.parentLocationInWindow = new int[2];
        this.snapshotStateObserver = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
        setId(R.id.content);
        setTag(com.lumi.singularity.R.id.view_tree_lifecycle_owner, q10.o(view));
        setTag(com.lumi.singularity.R.id.view_tree_view_model_store_owner, p01.n(view));
        setTag(com.lumi.singularity.R.id.view_tree_saved_state_registry_owner, y80.t(view));
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo367toPx0680j_4(m7611constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m7876getLambda$1131826196$ui(), null, 2, null);
        this.locationOnScreen = new int[2];
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        int flagsWithSecureFlagInherited;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        flagsWithSecureFlagInherited = AndroidPopup_androidKt.flagsWithSecureFlagInherited(this.properties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        layoutParams.flags = flagsWithSecureFlagInherited;
        layoutParams.type = this.properties.getWindowType();
        IBinder windowToken = this.properties.getWindowToken();
        if (windowToken == null) {
            windowToken = this.composeView.getApplicationWindowToken();
        }
        layoutParams.token = windowToken;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        return layoutParams;
    }

    private final my getContent() {
        return (my) this.content$delegate.getValue();
    }

    private final IntRect getDisplayBounds() {
        IntRect intBounds;
        Rect rect = this.previousWindowVisibleFrame;
        boolean clippingEnabled = this.properties.getClippingEnabled();
        PopupLayoutHelper popupLayoutHelper = this.popupLayoutHelper;
        if (clippingEnabled) {
            popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
        } else {
            popupLayoutHelper.getWindowBounds(this.composeView, rect);
        }
        intBounds = AndroidPopup_androidKt.toIntBounds(rect);
        return intBounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates$delegate.getValue();
    }

    private final void maybeRegisterBackCallback() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        Object obj = this.backCallback;
        if (obj == null) {
            obj = Api33Impl.createBackCallback(this.onDismissRequest);
            this.backCallback = obj;
        }
        Api33Impl.maybeRegisterBackCallback(this, obj);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            o.n();
            return;
        }
        super.setLayoutDirection(i2);
    }

    private final void updatePopupProperties(PopupProperties popupProperties) {
        int flagsWithSecureFlagInherited;
        if (q10.b(this.properties, popupProperties)) {
            return;
        }
        if (popupProperties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = popupProperties;
        WindowManager.LayoutParams layoutParams2 = this.params;
        flagsWithSecureFlagInherited = AndroidPopup_androidKt.flagsWithSecureFlagInherited(popupProperties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        layoutParams2.flags = flagsWithSecureFlagInherited;
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-857613600);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857613600, i2, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:715)");
            }
            getContent().invoke(startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PopupLayout$Content$4(this, i));
        }
    }

    public final void dismiss() {
        setTag(com.lumi.singularity.R.id.view_tree_lifecycle_owner, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                iy iyVar = this.onDismissRequest;
                if (iyVar != null) {
                    iyVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.params;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m7877getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.internalOnLayout$ui(z, i, i2, i3, i4);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui(int i, int i2) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui(i, i2);
        } else {
            IntRect displayBounds = getDisplayBounds();
            super.internalOnMeasure$ui(View.MeasureSpec.makeMeasureSpec(displayBounds.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.getHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.start();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
        maybeUnregisterBackCallback();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            iy iyVar = this.onDismissRequest;
            if (iyVar != null) {
                iyVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        iy iyVar2 = this.onDismissRequest;
        if (iyVar2 != null) {
            iyVar2.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        if (isAttachedToWindow()) {
            int[] iArr = this.locationOnScreen;
            int i = iArr[0];
            int i2 = iArr[1];
            this.composeView.getLocationOnScreen(iArr);
            int[] iArr2 = this.locationOnScreen;
            if (i == iArr2[0] && i2 == iArr2[1]) {
                return;
            }
            updateParentBounds$ui();
        }
    }

    public final void setContent(CompositionContext compositionContext, my myVar) {
        setParentCompositionContext(compositionContext);
        setContent(myVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7878setPopupContentSizefhxjrPA(IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(iy iyVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        this.onDismissRequest = iyVar;
        this.testTag = str;
        updatePopupProperties(popupProperties);
        superSetLayoutDirection(layoutDirection);
    }

    public final void updateParentBounds$ui() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long mo6242getSizeYbymL2g = parentLayoutCoordinates.mo6242getSizeYbymL2g();
            long positionOnScreen = this.isNested ? LayoutCoordinatesKt.positionOnScreen(parentLayoutCoordinates) : LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
            IntRect m7772IntRectVbeCjmY = IntRectKt.m7772IntRectVbeCjmY(IntOffset.m7733constructorimpl((Math.round(Float.intBitsToFloat((int) (positionOnScreen >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (positionOnScreen & 4294967295L))))), mo6242getSizeYbymL2g);
            if (q10.b(m7772IntRectVbeCjmY, this.parentBounds)) {
                return;
            }
            this.parentBounds = m7772IntRectVbeCjmY;
            updatePosition();
        }
    }

    public final void updateParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        updateParentBounds$ui();
    }

    public final void updatePosition() {
        IntSize m7877getPopupContentSizebOM6tXw;
        IntRect intRect = this.parentBounds;
        if (intRect == null || (m7877getPopupContentSizebOM6tXw = m7877getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long m7786unboximpl = m7877getPopupContentSizebOM6tXw.m7786unboximpl();
        IntRect displayBounds = getDisplayBounds();
        long m7777constructorimpl = IntSize.m7777constructorimpl((displayBounds.getWidth() << 32) | (displayBounds.getHeight() & 4294967295L));
        ii0 ii0Var = new ii0();
        ii0Var.d = IntOffset.Companion.m7750getZeronOccac();
        this.snapshotStateObserver.observeReads(this, onCommitAffectingPopupPosition, new PopupLayout$updatePosition$1(ii0Var, this, intRect, m7777constructorimpl, m7786unboximpl));
        this.params.x = IntOffset.m7739getXimpl(ii0Var.d);
        this.params.y = IntOffset.m7740getYimpl(ii0Var.d);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.setGestureExclusionRects(this, (int) (m7777constructorimpl >> 32), (int) (m7777constructorimpl & 4294967295L));
        }
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    private final void setContent(my myVar) {
        this.content$delegate.setValue(myVar);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PopupLayout(iy iyVar, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, boolean z, PopupLayoutHelper popupLayoutHelper, int i, dq dqVar) {
        this(iyVar, popupProperties, str, view, density, popupPositionProvider, uuid, z, r10);
        PopupLayoutHelper popupLayoutHelper2;
        PopupLayoutHelper popupLayoutHelperImpl29;
        if ((i & Fields.RotationX) != 0) {
            if (Build.VERSION.SDK_INT >= 30) {
                popupLayoutHelperImpl29 = new PopupLayoutHelperImpl30();
            } else {
                popupLayoutHelperImpl29 = new PopupLayoutHelperImpl29();
            }
            popupLayoutHelper2 = popupLayoutHelperImpl29;
        } else {
            popupLayoutHelper2 = popupLayoutHelper;
        }
    }
}
