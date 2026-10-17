package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.a50;
import defpackage.ad0;
import defpackage.b1;
import defpackage.b10;
import defpackage.cq;
import defpackage.d41;
import defpackage.dq;
import defpackage.e10;
import defpackage.er;
import defpackage.f10;
import defpackage.fb0;
import defpackage.g10;
import defpackage.gb0;
import defpackage.h10;
import defpackage.hm;
import defpackage.iy;
import defpackage.j;
import defpackage.j50;
import defpackage.k4;
import defpackage.kr0;
import defpackage.ky;
import defpackage.la0;
import defpackage.lu0;
import defpackage.ma0;
import defpackage.my;
import defpackage.n10;
import defpackage.na0;
import defpackage.nf;
import defpackage.ny;
import defpackage.o;
import defpackage.oa0;
import defpackage.p0;
import defpackage.p10;
import defpackage.q0;
import defpackage.q10;
import defpackage.r40;
import defpackage.rl0;
import defpackage.sl0;
import defpackage.ta0;
import defpackage.ti;
import defpackage.u0;
import defpackage.v0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import defpackage.z0;
import defpackage.zb;
import defpackage.zg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends p0 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final int CONTENT_CHANGE_TYPE_CHECKED = 8192;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataShapeRectCornersKey = "androidx.compose.ui.semantics.shapeCorners";
    public static final String ExtraDataShapeRectKey = "androidx.compose.ui.semantics.shapeRect";
    public static final String ExtraDataShapeRegionKey = "androidx.compose.ui.semantics.shapeRegion";
    public static final int ExtraDataShapeTypeGeneric = 2;
    public static final String ExtraDataShapeTypeKey = "androidx.compose.ui.semantics.shapeType";
    public static final int ExtraDataShapeTypeRectangle = 0;
    public static final int ExtraDataShapeTypeRounded = 1;
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private List<? extends AccessibilityServiceInfo> _enabledServices;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private kr0 actionIdToLabel;
    private final zg boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private g10 currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private z0 currentlyAccessibilityFocusedANI;
    private z0 currentlyFocusedANI;
    private final la0 drawingOrder;
    private int focusedVirtualViewId;
    private la0 idToAfterMap;
    private la0 idToBeforeMap;
    private kr0 labelToActionId;
    private final Handler legacyMainHandler;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private oa0 paneDisplayed;
    private final na0 pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final na0 pendingVerticalScrollEvents;
    private na0 previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private Boolean requestFromAccessibilityToolForTesting;
    private final ky scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final zb subtreeChangedLayoutNodes;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final e10 AccessibilityActionsResourceIds = f10.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private ky onSendAccessibilityEvent = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final void addSetProgressAction(z0 z0Var, SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            z0Var.a(new u0(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final void addPageActions(z0 z0Var, SemanticsNode semanticsNode) {
            boolean enabled;
            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getRole());
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                if (role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), Role.Companion.m6829getCarouselo7Vup1c())) {
                    return;
                }
                SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    z0Var.a(new u0(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    z0Var.a(new u0(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    z0Var.a(new u0(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    z0Var.a(new u0(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class ComposeAccessibilityNodeProvider extends b1 {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // defpackage.b1
        public void addExtraDataToAccessibilityNodeInfo(int i, z0 z0Var, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i, z0Var, str, bundle);
        }

        @Override // defpackage.b1
        public z0 createAccessibilityNodeInfo(int i) {
            z0 createNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (i == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = createNodeInfo;
                }
                if (i == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = createNodeInfo;
                }
            }
            return createNodeInfo;
        }

        @Override // defpackage.b1
        public z0 findFocus(int i) {
            if (i == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (i == 2) {
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            o.m(j50.h(i, "Unknown focus type: "));
            return null;
        }

        @Override // defpackage.b1
        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i, i2, bundle);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.legacyMainHandler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new na0();
        this.pendingVerticalScrollEvents = new na0();
        this.actionIdToLabel = new kr0();
        this.labelToActionId = new kr0();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new zb();
        this.boundsUpdateChannel = d41.b(1, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        na0 na0Var = h10.a;
        na0Var.getClass();
        this.currentSemanticsNodes = na0Var;
        this.paneDisplayed = new oa0();
        this.idToBeforeMap = new la0();
        this.idToAfterMap = new la0();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = new na0();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), na0Var);
        int i = b10.a;
        this.drawingOrder = new la0();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new j(this, 1);
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, z0 z0Var, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        float[] cornerArray;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (q10.b(str, this.ExtraDataTestTraversalBeforeVal)) {
            int e = this.idToBeforeMap.e(i, -1);
            if (e != -1) {
                z0Var.a.getExtras().putInt(str, e);
                return;
            }
            return;
        }
        if (q10.b(str, this.ExtraDataTestTraversalAfterVal)) {
            int e2 = this.idToAfterMap.e(i, -1);
            if (e2 != -1) {
                z0Var.a.getExtras().putInt(str, e2);
                return;
            }
            return;
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null && q10.b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig$ui());
                    if (textLayoutResult == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = i2 + i4;
                        if (i5 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i5)));
                        }
                    }
                    z0Var.a.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e(LogTag, "Invalid arguments for accessibility character locations");
            return;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getTestTag()) && bundle != null && q10.b(str, ExtraDataTestTagKey)) {
            String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getTestTag());
            if (str2 != null) {
                z0Var.a.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (q10.b(str, ExtraDataIdKey)) {
            z0Var.a.getExtras().putInt(str, semanticsNode.getId());
            return;
        }
        if (q10.b(str, ExtraDataShapeTypeKey)) {
            Shape shape = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getShape());
            if (shape != null) {
                Rect shapeBounds = getShapeBounds(semanticsNode, getBoundsInScreen(z0Var), shape);
                Outline m6700createOutline12SF9DM = m6700createOutline12SF9DM(shape, shapeBounds.m4549getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection());
                if (m6700createOutline12SF9DM instanceof Outline.Rectangle) {
                    z0Var.a.getExtras().putInt(ExtraDataShapeTypeKey, 0);
                    z0Var.a.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(m6700createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    return;
                }
                if (m6700createOutline12SF9DM instanceof Outline.Rounded) {
                    AccessibilityNodeInfo accessibilityNodeInfo = z0Var.a;
                    AccessibilityNodeInfo accessibilityNodeInfo2 = z0Var.a;
                    accessibilityNodeInfo.getExtras().putInt(ExtraDataShapeTypeKey, 1);
                    accessibilityNodeInfo2.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(m6700createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    accessibilityNodeInfo2.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, toCornerArray(m6700createOutline12SF9DM));
                    return;
                }
                if (!(m6700createOutline12SF9DM instanceof Outline.Generic)) {
                    o.n();
                    return;
                } else {
                    z0Var.a.getExtras().putInt(ExtraDataShapeTypeKey, 2);
                    z0Var.a.getExtras().putParcelable(ExtraDataShapeRegionKey, toRegion(m6700createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    return;
                }
            }
            return;
        }
        if (q10.b(str, ExtraDataShapeRectKey)) {
            Shape shape2 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getShape());
            if (shape2 != null) {
                Rect shapeBounds2 = getShapeBounds(semanticsNode, getBoundsInScreen(z0Var), shape2);
                android.graphics.Rect androidRect = toAndroidRect(m6700createOutline12SF9DM(shape2, shapeBounds2.m4549getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), shapeBounds2.getLeft(), shapeBounds2.getTop());
                if (androidRect != null) {
                    z0Var.a.getExtras().putParcelable(ExtraDataShapeRectKey, androidRect);
                    return;
                }
                return;
            }
            return;
        }
        if (q10.b(str, ExtraDataShapeRectCornersKey)) {
            Shape shape3 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getShape());
            if (shape3 == null || (cornerArray = toCornerArray(m6700createOutline12SF9DM(shape3, getShapeBounds(semanticsNode, getBoundsInScreen(z0Var), shape3).m4549getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()))) == null) {
                return;
            }
            z0Var.a.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, cornerArray);
            return;
        }
        if (q10.b(str, ExtraDataShapeRegionKey)) {
            Shape shape4 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getShape());
            if (shape4 != null) {
                Rect shapeBounds3 = getShapeBounds(semanticsNode, getBoundsInScreen(z0Var), shape4);
                Region region = toRegion(m6700createOutline12SF9DM(shape4, shapeBounds3.m4549getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), shapeBounds3.getLeft(), shapeBounds3.getTop());
                if (region != null) {
                    z0Var.a.getExtras().putParcelable(ExtraDataShapeRegionKey, region);
                    return;
                }
                return;
            }
            return;
        }
        rl0 accessibilityExtraKeys$ui = semanticsNode.getUnmergedConfig$ui().getAccessibilityExtraKeys$ui();
        if (accessibilityExtraKeys$ui == null) {
            return;
        }
        Object[] objArr = accessibilityExtraKeys$ui.b;
        long[] jArr = accessibilityExtraKeys$ui.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i6 << 3) + i8];
                        String accessibilityExtraKey$ui = semanticsPropertyKey.getAccessibilityExtraKey$ui();
                        if (q10.b(accessibilityExtraKey$ui, str)) {
                            Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsPropertyKey);
                            if (orNull instanceof Serializable) {
                                z0Var.a.getExtras().putSerializable(accessibilityExtraKey$ui, (Serializable) orNull);
                            } else {
                                if (!(orNull instanceof Parcelable)) {
                                    o.f("Accessibility extra values must be either Serializable or Parcelable.");
                                    return;
                                }
                                z0Var.a.getExtras().putParcelable(accessibilityExtraKey$ui, (Parcelable) orNull);
                            }
                        } else {
                            continue;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* renamed from: adjustForReversedScrollingAndRtl-RE3cj74, reason: not valid java name */
    private final long m6698adjustForReversedScrollingAndRtlRE3cj74(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j) {
        boolean isRtl;
        if (Offset.m4513equalsimpl0(j, Offset.Companion.m4532getZeroF1C5BW0())) {
            return j;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        SemanticsConfiguration unmergedConfig$ui = semanticsNode2.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getHorizontalScrollAxisRange());
        if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
            intBitsToFloat = -intBitsToFloat;
        }
        isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
        if (isRtl) {
            intBitsToFloat = -intBitsToFloat;
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig$ui(), semanticsProperties.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
            intBitsToFloat2 = -intBitsToFloat2;
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        IntRect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        return toBoundsInScreen(adjustedBounds.getLeft(), adjustedBounds.getTop(), adjustedBounds.getRight(), adjustedBounds.getBottom());
    }

    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m6699canScrollmoWRBKg(g10 g10Var, boolean z, int i, long j) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        if (Offset.m4513equalsimpl0(j, Offset.Companion.m4531getUnspecifiedF1C5BW0()) || (((InlineClassHelperKt.DualUnsignedFloatMask & j) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else {
            if (z) {
                o.n();
                return false;
            }
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        }
        Object[] objArr = g10Var.c;
        long[] jArr = g10Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j2 & 255) < 128) {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4];
                        if (IntRectKt.toRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m4542containsk4lQ0M(j) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui(), horizontalScrollAxisRange)) != null) {
                            int i5 = scrollAxisRange.getReverseScrolling() ? -i : i;
                            if (i == 0 && scrollAxisRange.getReverseScrolling()) {
                                i5 = -1;
                            }
                            if (i5 < 0) {
                                if (((Number) scrollAxisRange.getValue().invoke()).floatValue() <= 0.0f) {
                                    j2 >>= 8;
                                }
                                z2 = true;
                                j2 >>= 8;
                            } else {
                                if (((Number) scrollAxisRange.getValue().invoke()).floatValue() >= ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue()) {
                                    j2 >>= 8;
                                }
                                z2 = true;
                                j2 >>= 8;
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return z2;
                }
            }
            if (i2 == length) {
                return z2;
            }
            i2++;
        }
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private final boolean clearAccessibilityFocus(int i) {
        if (!isAccessibilityFocused(i)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        return true;
    }

    private final AccessibilityEvent createEvent(int i, int i2) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i);
        if (isEnabled$ui() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i)) != null) {
            SemanticsConfiguration unmergedConfig$ui = semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            obtain.setPassword(unmergedConfig$ui.contains(semanticsProperties.getPassword()));
            boolean b = q10.b(SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui(), semanticsProperties.getIsSensitiveData()), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                q0.f(obtain, b);
            }
        }
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0 createNodeInfo(int i) {
        if (((a50) this.view.getComposeViewContext().getLifecycleOwner$ui().getLifecycle()).d == r40.d) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i);
        if (semanticsNodeWithAdjustedBounds == null) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        boolean b = q10.b(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsSensitiveData()), Boolean.TRUE);
        if (b && !isRequestFromAccessibilityTool()) {
            return null;
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        z0 z0Var = new z0(obtain);
        if (Build.VERSION.SDK_INT >= 34) {
            q0.g(obtain, b);
        } else {
            Bundle extras = obtain.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)) | (b ? 64 : 0));
            }
        }
        if (i == -1) {
            Object parentForAccessibility = this.view.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            z0Var.b = -1;
            obtain.setParent(view);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer valueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (valueOf == null) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + i + " has null parent");
                o.j();
                return null;
            }
            int intValue = valueOf.intValue();
            int i2 = intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? intValue : -1;
            AndroidComposeView androidComposeView = this.view;
            z0Var.b = i2;
            obtain.setParent(androidComposeView, i2);
        }
        AndroidComposeView androidComposeView2 = this.view;
        z0Var.c = i;
        obtain.setSource(androidComposeView2, i);
        obtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(i, z0Var, semanticsNode);
        return z0Var;
    }

    /* renamed from: createOutline-12SF9DM, reason: not valid java name */
    private final Outline m6700createOutline12SF9DM(Shape shape, long j, LayoutDirection layoutDirection) {
        return shape.mo283createOutlinePq9zytI(j, layoutDirection, this.view.getDensity());
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent = createEvent(i, 8192);
        if (num != null) {
            createEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent.getText().add(charSequence);
        }
        return createEvent;
    }

    private final z0 emptyNodeInfoOrNull() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return new z0(AccessibilityNodeInfo.obtain());
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m7055getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties.getTextSelectionRange())).m7064unboximpl());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m7060getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties.getTextSelectionRange())).m7064unboximpl());
    }

    private final android.graphics.Rect getBoundsInScreen(z0 z0Var) {
        android.graphics.Rect rect = new android.graphics.Rect();
        z0Var.a.getBoundsInScreen(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g10 getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1.INSTANCE);
            if (isEnabled$ui()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    private final List<AccessibilityServiceInfo> getEnabledServices() {
        List list = this._enabledServices;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this._enabledServices = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    private final Handler getHandler() {
        return AndroidComposeUiFlags.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) yi.q0(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i) {
        String iterableTextForAccessibility;
        TextLayoutResult textLayoutResult;
        if (semanticsNode == null || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (i == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator companion = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
            return companion;
        }
        if (i == 2) {
            AccessibilityIterators.WordTextSegmentIterator companion2 = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        }
        if (i != 4) {
            if (i == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator companion3 = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                companion3.initialize(iterableTextForAccessibility);
                return companion3;
            }
            if (i != 16) {
                return null;
            }
        }
        if (!semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig$ui())) == null) {
            return null;
        }
        if (i == 4) {
            AccessibilityIterators.LineTextSegmentIterator companion4 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
            companion4.initialize(iterableTextForAccessibility, textLayoutResult);
            return companion4;
        }
        AccessibilityIterators.PageTextSegmentIterator companion5 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
        companion5.initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
        return companion5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1, androidx.compose.ui.semantics.SemanticsPropertyReceiver] */
    private final Rect getShapeBounds(SemanticsNode semanticsNode, android.graphics.Rect rect, final Shape shape) {
        Modifier.Node node;
        ?? r0 = new SemanticsPropertyReceiver() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1
            private boolean hasMatchedShape;

            public final boolean getHasMatchedShape() {
                return this.hasMatchedShape;
            }

            @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
            public <T> void set(SemanticsPropertyKey<T> semanticsPropertyKey, T t) {
                if (t == Shape.this) {
                    this.hasMatchedShape = true;
                }
            }

            public final void setHasMatchedShape(boolean z) {
                this.hasMatchedShape = z;
            }
        };
        LayoutNode layoutNode$ui = semanticsNode.getLayoutNode$ui();
        NodeChain nodes$ui = layoutNode$ui.getNodes$ui();
        int m6573constructorimpl = NodeKind.m6573constructorimpl(8);
        Object obj = null;
        if ((nodes$ui.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            Modifier.Node head$ui = nodes$ui.getHead$ui();
            loop0: while (true) {
                if (head$ui == null) {
                    break;
                }
                if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    Modifier.Node node2 = head$ui;
                    MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof SemanticsModifierNode) {
                            ((SemanticsModifierNode) node2).applySemantics(r0);
                            if (r0.getHasMatchedShape()) {
                                obj = node2;
                                break loop0;
                            }
                        } else if ((node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
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
                if ((head$ui.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                    break;
                }
                head$ui = head$ui.getChild$ui();
            }
        }
        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) obj;
        if (semanticsModifierNode == null || (node = semanticsModifierNode.getNode()) == null || !node.isAttached()) {
            return LayoutCoordinatesKt.boundsInWindow(layoutNode$ui.getOuterCoordinator$ui(), false);
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(semanticsModifierNode);
        Rect localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(requireLayoutCoordinates).localBoundingBoxOf(requireLayoutCoordinates, false);
        return toBoundsRelativeToNodeBounds(toBoundsInScreen(localBoundingBoxOf.getLeft(), localBoundingBoxOf.getTop(), localBoundingBoxOf.getRight(), localBoundingBoxOf.getBottom()), rect);
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isAccessibilityFocused(int i) {
        return this.accessibilityFocusedVirtualViewId == i;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig$ui.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getEditableText());
    }

    private final boolean isRequestFromAccessibilityTool() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (q10.b(bool, Boolean.TRUE)) {
            return true;
        }
        if (q10.b(bool, Boolean.FALSE)) {
            return false;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (Build.VERSION.SDK_INT >= 34) {
            return q0.e(accessibilityManager);
        }
        return true;
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x001a -> B:6:0x001b). Please report as a decompilation issue!!! */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean legacyScrollOntoScreen(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        boolean isRtl;
        my myVar;
        SemanticsConfiguration unmergedConfig$ui;
        SemanticsConfiguration unmergedConfig$ui2;
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null && (unmergedConfig$ui2 = parent.getUnmergedConfig$ui()) != null) {
            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui2, SemanticsActions.INSTANCE.getScrollBy());
            while (parent != null && accessibilityAction == null) {
                parent = parent.getParent();
                if (parent != null && (unmergedConfig$ui = parent.getUnmergedConfig$ui()) != null) {
                    accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getScrollBy());
                }
            }
            if (parent != null) {
                Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                return this.view.requestRectangleOnScreen(new android.graphics.Rect((int) Math.floor(boundsInRoot.getLeft()), (int) Math.floor(boundsInRoot.getTop()), y80.P((float) Math.ceil(boundsInRoot.getRight())), y80.P((float) Math.ceil(boundsInRoot.getBottom()))));
            }
            Rect boundsInParent = LayoutCoordinatesKt.boundsInParent(parent.getLayoutInfo().getCoordinates());
            LayoutCoordinates parentLayoutCoordinates = parent.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
            Rect m4553translatek4lQ0M = boundsInParent.m4553translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.Companion.m4532getZeroF1C5BW0());
            Rect m4556Recttz77jQw = RectKt.m4556Recttz77jQw(semanticsNode.m6838getPositionInRootF1C5BW0(), IntSizeKt.m7794toSizeozmzZPI(semanticsNode.m6841getSizeYbymL2g()));
            SemanticsConfiguration unmergedConfig$ui3 = parent.getUnmergedConfig$ui();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui3, semanticsProperties.getHorizontalScrollAxisRange());
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig$ui(), semanticsProperties.getVerticalScrollAxisRange());
            float legacyScrollOntoScreen$scrollDelta = legacyScrollOntoScreen$scrollDelta(m4556Recttz77jQw.getLeft() - m4553translatek4lQ0M.getLeft(), m4556Recttz77jQw.getRight() - m4553translatek4lQ0M.getRight());
            if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
                legacyScrollOntoScreen$scrollDelta = -legacyScrollOntoScreen$scrollDelta;
            }
            isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
            if (isRtl) {
                legacyScrollOntoScreen$scrollDelta = -legacyScrollOntoScreen$scrollDelta;
            }
            float legacyScrollOntoScreen$scrollDelta2 = legacyScrollOntoScreen$scrollDelta(m4556Recttz77jQw.getTop() - m4553translatek4lQ0M.getTop(), m4556Recttz77jQw.getBottom() - m4553translatek4lQ0M.getBottom());
            if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
                legacyScrollOntoScreen$scrollDelta2 = -legacyScrollOntoScreen$scrollDelta2;
            }
            return (accessibilityAction == null || (myVar = (my) accessibilityAction.getAction()) == null || !((Boolean) myVar.invoke(Float.valueOf(legacyScrollOntoScreen$scrollDelta), Float.valueOf(legacyScrollOntoScreen$scrollDelta2))).booleanValue()) ? false : true;
        }
        accessibilityAction = null;
        while (parent != null) {
            parent = parent.getParent();
            if (parent != null) {
                accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getScrollBy());
            }
            accessibilityAction = null;
            while (parent != null) {
            }
        }
        if (parent != null) {
        }
    }

    private static final float legacyScrollOntoScreen$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.m(w01.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [dq, java.util.List] */
    public final boolean performActionHelper(int i, int i2, Bundle bundle) {
        SemanticsNode semanticsNode;
        iy iyVar;
        boolean enabled;
        iy iyVar2;
        iy iyVar3;
        iy iyVar4;
        float f;
        float f2;
        iy iyVar5;
        boolean isRtl;
        iy iyVar6;
        iy iyVar7;
        iy iyVar8;
        iy iyVar9;
        iy iyVar10;
        iy iyVar11;
        ky kyVar;
        AccessibilityAction accessibilityAction;
        ky kyVar2;
        iy iyVar12;
        CharSequence charSequence;
        List list;
        Float valueOf = Float.valueOf(0.0f);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return false;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getIsSensitiveData());
        Boolean bool = Boolean.TRUE;
        if (q10.b(orNull, bool) && !isRequestFromAccessibilityTool()) {
            return false;
        }
        if (i2 == 64) {
            return requestAccessibilityFocus(i);
        }
        if (i2 == 128) {
            return clearAccessibilityFocus(i);
        }
        if (i2 == 256 || i2 == 512) {
            if (bundle == null) {
                return false;
            }
            return traverseAtGranularity(semanticsNode, bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"), i2 == 256, bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"));
        }
        if (i2 == 16384) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCopyText());
            if (accessibilityAction2 == null || (iyVar = (iy) accessibilityAction2.getAction()) == null) {
                return false;
            }
            return ((Boolean) iyVar.invoke()).booleanValue();
        }
        if (i2 == 131072) {
            boolean accessibilitySelection = setAccessibilitySelection(semanticsNode, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (accessibilitySelection) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 0, null, null, 12, null);
            }
            return accessibilitySelection;
        }
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (!enabled) {
            return false;
        }
        if (i2 == 1) {
            if (this.view.isInTouchMode()) {
                this.view.requestFocusFromTouch();
            }
            AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getRequestFocus());
            if (accessibilityAction3 == null || (iyVar2 = (iy) accessibilityAction3.getAction()) == null) {
                return false;
            }
            return ((Boolean) iyVar2.invoke()).booleanValue();
        }
        int i3 = 2;
        if (i2 == 2) {
            if (!q10.b(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getFocused()), bool)) {
                return false;
            }
            this.view.getFocusOwner().mo4405clearFocusI7lrPNg(false, true, true, FocusDirection.Companion.m4394getExitdhqQ8s());
            return true;
        }
        Boolean bool2 = 0;
        bool2 = 0;
        switch (i2) {
            case 16:
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnClick());
                if (accessibilityAction4 != null && (iyVar3 = (iy) accessibilityAction4.getAction()) != null) {
                    bool2 = (Boolean) iyVar3.invoke();
                }
                sendEventForVirtualView$default(this, i, 1, null, null, 12, null);
                if (bool2 != 0) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnLongClick());
                if (accessibilityAction5 == null || (iyVar4 = (iy) accessibilityAction5.getAction()) == null) {
                    return false;
                }
                return ((Boolean) iyVar4.invoke()).booleanValue();
            case Fields.TransformOrigin /* 4096 */:
            case 8192:
                break;
            case Fields.CompositingStrategy /* 32768 */:
                AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPasteText());
                if (accessibilityAction6 == null || (iyVar7 = (iy) accessibilityAction6.getAction()) == null) {
                    return false;
                }
                return ((Boolean) iyVar7.invoke()).booleanValue();
            case 65536:
                AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCutText());
                if (accessibilityAction7 == null || (iyVar8 = (iy) accessibilityAction7.getAction()) == null) {
                    return false;
                }
                return ((Boolean) iyVar8.invoke()).booleanValue();
            case Fields.ColorFilter /* 262144 */:
                AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getExpand());
                if (accessibilityAction8 == null || (iyVar9 = (iy) accessibilityAction8.getAction()) == null) {
                    return false;
                }
                return ((Boolean) iyVar9.invoke()).booleanValue();
            case Fields.BlendMode /* 524288 */:
                AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCollapse());
                if (accessibilityAction9 == null || (iyVar10 = (iy) accessibilityAction9.getAction()) == null) {
                    return false;
                }
                return ((Boolean) iyVar10.invoke()).booleanValue();
            case 1048576:
                AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getDismiss());
                if (accessibilityAction10 == null || (iyVar11 = (iy) accessibilityAction10.getAction()) == null) {
                    return false;
                }
                return ((Boolean) iyVar11.invoke()).booleanValue();
            case 2097152:
                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetText());
                if (accessibilityAction11 == null || (kyVar = (ky) accessibilityAction11.getAction()) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) kyVar.invoke(new AnnotatedString(string, bool2, i3, bool2))).booleanValue();
            case android.R.id.accessibilityActionShowOnScreen:
                return AndroidComposeUiFlags.isAccessibilityShowOnScreenNestedScrollingEnabled ? scrollOntoScreen(semanticsNode) : legacyScrollOntoScreen(semanticsNode);
            case android.R.id.accessibilityActionSetProgress:
                if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress())) == null || (kyVar2 = (ky) accessibilityAction.getAction()) == null) {
                    return false;
                }
                return ((Boolean) kyVar2.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case android.R.id.accessibilityActionImeEnter:
                AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnImeAction());
                if (accessibilityAction12 == null || (iyVar12 = (iy) accessibilityAction12.getAction()) == null) {
                    return false;
                }
                return ((Boolean) iyVar12.invoke()).booleanValue();
            default:
                switch (i2) {
                    case android.R.id.accessibilityActionScrollUp:
                    case android.R.id.accessibilityActionScrollLeft:
                    case android.R.id.accessibilityActionScrollDown:
                    case android.R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (i2) {
                            case android.R.id.accessibilityActionPageUp:
                                AccessibilityAction accessibilityAction13 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageUp());
                                if (accessibilityAction13 != null && (r0 = (iy) accessibilityAction13.getAction()) != null) {
                                    break;
                                }
                                break;
                            case android.R.id.accessibilityActionPageDown:
                                AccessibilityAction accessibilityAction14 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageDown());
                                if (accessibilityAction14 != null && (r0 = (iy) accessibilityAction14.getAction()) != null) {
                                    break;
                                }
                                break;
                            case android.R.id.accessibilityActionPageLeft:
                                AccessibilityAction accessibilityAction15 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageLeft());
                                if (accessibilityAction15 != null && (r0 = (iy) accessibilityAction15.getAction()) != null) {
                                    break;
                                }
                                break;
                            case android.R.id.accessibilityActionPageRight:
                                AccessibilityAction accessibilityAction16 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageRight());
                                if (accessibilityAction16 != null && (r0 = (iy) accessibilityAction16.getAction()) != null) {
                                    break;
                                }
                                break;
                            default:
                                kr0 kr0Var = this.actionIdToLabel;
                                kr0Var.getClass();
                                kr0 kr0Var2 = (kr0) cq.h(kr0Var, i);
                                if (kr0Var2 != null && (charSequence = (CharSequence) cq.h(kr0Var2, i2)) != null && (list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCustomActions())) != null) {
                                    int size = list.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i4);
                                        if (q10.b(customAccessibilityAction.getLabel(), charSequence)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                }
                return false;
        }
        boolean z = i2 == 4096;
        boolean z2 = i2 == 8192;
        boolean z3 = i2 == 16908345;
        boolean z4 = i2 == 16908347;
        boolean z5 = i2 == 16908344;
        boolean z6 = i2 == 16908346;
        boolean z7 = z3 || z4 || z || z2;
        boolean z8 = z5 || z6 || z || z2;
        if (z || z2) {
            ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getProgressBarRangeInfo());
            AccessibilityAction accessibilityAction17 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress());
            if (progressBarRangeInfo != null && accessibilityAction17 != null) {
                float floatValue = Float.valueOf(((ti) progressBarRangeInfo.getRange()).b).floatValue();
                float floatValue2 = Float.valueOf(((ti) progressBarRangeInfo.getRange()).a).floatValue();
                if (floatValue < floatValue2) {
                    floatValue = floatValue2;
                }
                float floatValue3 = Float.valueOf(((ti) progressBarRangeInfo.getRange()).a).floatValue();
                float floatValue4 = Float.valueOf(((ti) progressBarRangeInfo.getRange()).b).floatValue();
                if (floatValue3 > floatValue4) {
                    floatValue3 = floatValue4;
                }
                if (progressBarRangeInfo.getSteps() > 0) {
                    f = floatValue - floatValue3;
                    f2 = progressBarRangeInfo.getSteps() + 1;
                } else {
                    f = floatValue - floatValue3;
                    f2 = 20.0f;
                }
                float f3 = f / f2;
                if (z2) {
                    f3 = -f3;
                }
                ky kyVar3 = (ky) accessibilityAction17.getAction();
                if (kyVar3 != null) {
                    return ((Boolean) kyVar3.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + f3))).booleanValue();
                }
                return false;
            }
        }
        long m4549getSizeNHjbRc = LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m4549getSizeNHjbRc();
        Float scrollViewportLength = SemanticsUtils_androidKt.getScrollViewportLength(semanticsNode.getUnmergedConfig$ui());
        SemanticsConfiguration unmergedConfig$ui2 = semanticsNode.getUnmergedConfig$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction18 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui2, semanticsActions.getScrollBy());
        if (accessibilityAction18 == null) {
            return false;
        }
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getHorizontalScrollAxisRange());
        if (scrollAxisRange != null && z7) {
            float floatValue5 = scrollViewportLength != null ? scrollViewportLength.floatValue() : Float.intBitsToFloat((int) (m4549getSizeNHjbRc >> 32));
            if (z3 || z2) {
                floatValue5 = -floatValue5;
            }
            if (scrollAxisRange.getReverseScrolling()) {
                floatValue5 = -floatValue5;
            }
            isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
            if (isRtl && (z3 || z4)) {
                floatValue5 = -floatValue5;
            }
            if (performActionHelper$canScroll(scrollAxisRange, floatValue5)) {
                if (!semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getPageLeft()) && !semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getPageRight())) {
                    my myVar = (my) accessibilityAction18.getAction();
                    if (myVar != null) {
                        return ((Boolean) myVar.invoke(Float.valueOf(floatValue5), valueOf)).booleanValue();
                    }
                    return false;
                }
                AccessibilityAction accessibilityAction19 = floatValue5 > 0.0f ? (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageRight()) : (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageLeft());
                if (accessibilityAction19 == null || (iyVar6 = (iy) accessibilityAction19.getAction()) == null) {
                    return false;
                }
                return ((Boolean) iyVar6.invoke()).booleanValue();
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && z8) {
            float floatValue6 = scrollViewportLength != null ? scrollViewportLength.floatValue() : Float.intBitsToFloat((int) (4294967295L & m4549getSizeNHjbRc));
            if (z5 || z2) {
                floatValue6 = -floatValue6;
            }
            if (scrollAxisRange2.getReverseScrolling()) {
                floatValue6 = -floatValue6;
            }
            if (performActionHelper$canScroll(scrollAxisRange2, floatValue6)) {
                if (!semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getPageUp()) && !semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getPageDown())) {
                    my myVar2 = (my) accessibilityAction18.getAction();
                    if (myVar2 != null) {
                        return ((Boolean) myVar2.invoke(valueOf, Float.valueOf(floatValue6))).booleanValue();
                    }
                    return false;
                }
                AccessibilityAction accessibilityAction20 = floatValue6 > 0.0f ? (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageDown()) : (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageUp());
                if (accessibilityAction20 != null && (iyVar5 = (iy) accessibilityAction20.getAction()) != null) {
                    return ((Boolean) iyVar5.invoke()).booleanValue();
                }
            }
        }
        return false;
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        if (f >= 0.0f || ((Number) scrollAxisRange.getValue().invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue();
        }
        return true;
    }

    private final void populateAccessibilityNodeInfoProperties(int i, z0 z0Var, SemanticsNode semanticsNode) {
        String infoStateDescriptionOrNull;
        boolean infoIsCheckable;
        boolean enabled;
        boolean enabled2;
        boolean enabled3;
        boolean isScreenReaderFocusable;
        View semanticsIdToView;
        ta0 ta0Var;
        int i2;
        boolean enabled4;
        boolean enabled5;
        boolean isRtl;
        boolean isRtl2;
        boolean enabled6;
        String accessibilityExtraKey$ui;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean z;
        boolean enabled8;
        SemanticsNode semanticsNode2;
        boolean z2;
        SemanticsNode semanticsNode3;
        SemanticsConfiguration config;
        Resources resources = this.view.getContext().getResources();
        z0Var.f(ClassName);
        AccessibilityNodeInfo accessibilityNodeInfo = z0Var.a;
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getEditableText())) {
            z0Var.f(TextFieldClassName);
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getText())) {
            z0Var.f(TextClassName);
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getRole());
        if (role != null) {
            role.m6827unboximpl();
            if (semanticsNode.isFake$ui() || semanticsNode.getReplacedChildren$ui().isEmpty()) {
                Role.Companion companion = Role.Companion;
                if (Role.m6824equalsimpl0(role.m6827unboximpl(), companion.m6835getTabo7Vup1c())) {
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                } else if (Role.m6824equalsimpl0(role.m6827unboximpl(), companion.m6834getSwitcho7Vup1c())) {
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                } else {
                    String m6799toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m6799toLegacyClassNameV4PA4sw(role.m6827unboximpl());
                    if (!Role.m6824equalsimpl0(role.m6827unboximpl(), companion.m6832getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui() || semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants()) {
                        z0Var.f(m6799toLegacyClassNameV4PA4sw);
                    }
                }
            }
        }
        accessibilityNodeInfo.setPackageName(this.view.getContext().getPackageName());
        accessibilityNodeInfo.setImportantForAccessibility(SemanticsOwnerKt.isImportantForAccessibility(semanticsNode));
        boolean isRequestFromAccessibilityTool = isRequestFromAccessibilityTool();
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            SemanticsNode semanticsNode4 = replacedChildren$ui.get(i4);
            if (getCurrentSemanticsNodes().a(semanticsNode4.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(semanticsNode4.getLayoutNode$ui());
                if (semanticsNode4.getId() != -1) {
                    if (androidViewHolder != null) {
                        accessibilityNodeInfo.addChild(androidViewHolder);
                    } else {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(semanticsNode4.getId());
                        boolean b = (semanticsNodeWithAdjustedBounds == null || (semanticsNode3 = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null || (config = semanticsNode3.getConfig()) == null) ? false : q10.b(SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsSensitiveData()), Boolean.TRUE);
                        if (isRequestFromAccessibilityTool || !b) {
                            accessibilityNodeInfo.addChild(this.view, semanticsNode4.getId());
                        }
                    }
                    this.drawingOrder.g(semanticsNode4.getId(), i3);
                    i3++;
                }
            }
        }
        if (i == this.accessibilityFocusedVirtualViewId) {
            accessibilityNodeInfo.setAccessibilityFocused(true);
            z0Var.a(u0.e);
        } else {
            accessibilityNodeInfo.setAccessibilityFocused(false);
            z0Var.a(u0.d);
        }
        setText(semanticsNode, z0Var);
        setContentInvalid(semanticsNode, z0Var);
        infoStateDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoStateDescriptionOrNull(semanticsNode, resources);
        if (Build.VERSION.SDK_INT >= 30) {
            v0.g(accessibilityNodeInfo, infoStateDescriptionOrNull);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", infoStateDescriptionOrNull);
        }
        infoIsCheckable = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoIsCheckable(semanticsNode);
        accessibilityNodeInfo.setCheckable(infoIsCheckable);
        SemanticsConfiguration unmergedConfig$ui2 = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui2, semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                accessibilityNodeInfo.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                accessibilityNodeInfo.setChecked(false);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), Role.Companion.m6835getTabo7Vup1c())) {
                accessibilityNodeInfo.setSelected(booleanValue);
            } else {
                accessibilityNodeInfo.setChecked(booleanValue);
            }
        }
        if (!semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties2.getContentDescription());
            accessibilityNodeInfo.setContentDescription(list != null ? (String) yi.q0(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties2.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode5 = semanticsNode;
            while (true) {
                if (semanticsNode5 == null) {
                    z2 = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig$ui3 = semanticsNode5.getUnmergedConfig$ui();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    z2 = ((Boolean) semanticsNode5.getUnmergedConfig$ui().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                semanticsNode5 = semanticsNode5.getParent();
            }
            if (z2) {
                accessibilityNodeInfo.setViewIdResourceName(str);
            }
        }
        SemanticsConfiguration unmergedConfig$ui4 = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((w01) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui4, semanticsProperties3.getHeading())) != null) {
            accessibilityNodeInfo.setHeading(true);
        }
        if (((w01) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getTextEntryKey())) != null) {
            accessibilityNodeInfo.setTextEntryKey(true);
        }
        if (i != -1) {
            int e = this.drawingOrder.e(semanticsNode.getId(), -1);
            if (e != -1) {
                accessibilityNodeInfo.setDrawingOrder(e);
            } else {
                Log.w(LogTag, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
            }
        }
        accessibilityNodeInfo.setPassword(semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties3.getPassword()));
        Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getIsEditable());
        Boolean bool2 = Boolean.TRUE;
        accessibilityNodeInfo.setEditable(q10.b(orNull, bool2));
        Integer num = (Integer) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getMaxTextLength());
        accessibilityNodeInfo.setMaxTextLength(num != null ? num.intValue() : -1);
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        accessibilityNodeInfo.setEnabled(enabled);
        accessibilityNodeInfo.setFocusable(semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties3.getFocused()));
        if (accessibilityNodeInfo.isFocusable()) {
            accessibilityNodeInfo.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties3.getFocused())).booleanValue());
            if (accessibilityNodeInfo.isFocused()) {
                accessibilityNodeInfo.addAction(2);
                this.focusedVirtualViewId = i;
            } else {
                accessibilityNodeInfo.addAction(1);
            }
        }
        accessibilityNodeInfo.setVisibleToUser(!SemanticsOwnerKt.isHidden(semanticsNode));
        if (ComposeUiFlags.isAccessibilityShouldIncludeOffscreenChildrenEnabled) {
            if (semanticsNode.isFake$ui()) {
                semanticsNode2 = semanticsNode.getParent();
                semanticsNode2.getClass();
            } else {
                semanticsNode2 = semanticsNode;
            }
            setInvisibleIfEmptyBounds(z0Var, semanticsNode2);
        }
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int m6818unboximpl = liveRegionMode.m6818unboximpl();
            LiveRegionMode.Companion companion2 = LiveRegionMode.Companion;
            accessibilityNodeInfo.setLiveRegion((!LiveRegionMode.m6815equalsimpl0(m6818unboximpl, companion2.m6820getPolite0phEisY()) && LiveRegionMode.m6815equalsimpl0(m6818unboximpl, companion2.m6819getAssertive0phEisY())) ? 2 : 1);
        }
        accessibilityNodeInfo.setClickable(false);
        SemanticsConfiguration unmergedConfig$ui5 = semanticsNode.getUnmergedConfig$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui5, semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean b2 = q10.b(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getSelected()), bool2);
            Role.Companion companion3 = Role.Companion;
            if (!(role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), companion3.m6835getTabo7Vup1c()))) {
                if (!(role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), companion3.m6833getRadioButtono7Vup1c()))) {
                    z = false;
                    accessibilityNodeInfo.setClickable(z || (z && !b2));
                    enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                    if (enabled8 && accessibilityNodeInfo.isClickable()) {
                        z0Var.a(new u0(16, accessibilityAction.getLabel()));
                    }
                }
            }
            z = true;
            accessibilityNodeInfo.setClickable(z || (z && !b2));
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8) {
                z0Var.a(new u0(16, accessibilityAction.getLabel()));
            }
        }
        accessibilityNodeInfo.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfo.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                z0Var.a(new u0(32, accessibilityAction2.getLabel()));
            }
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            z0Var.a(new u0(Fields.Clip, accessibilityAction3.getLabel()));
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                z0Var.a(new u0(2097152, accessibilityAction4.getLabel()));
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getOnImeAction());
            if (accessibilityAction5 != null) {
                z0Var.a(new u0(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                z0Var.a(new u0(65536, accessibilityAction6.getLabel()));
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null && accessibilityNodeInfo.isFocused() && this.view.getClipboardManager().hasText()) {
                z0Var.a(new u0(Fields.CompositingStrategy, accessibilityAction7.getLabel()));
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            accessibilityNodeInfo.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getSetSelection());
            z0Var.a(new u0(Fields.RenderEffect, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            accessibilityNodeInfo.addAction(Fields.RotationX);
            accessibilityNodeInfo.addAction(Fields.RotationY);
            accessibilityNodeInfo.setMovementGranularities(11);
            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getContentDescription());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 20);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExtraDataIdKey);
        CharSequence e2 = z0Var.e();
        if (e2 != null && e2.length() != 0 && semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getGetTextLayoutResult())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties3.getTestTag())) {
            arrayList.add(ExtraDataTestTagKey);
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties3.getShape())) {
            arrayList.add(ExtraDataShapeTypeKey);
            arrayList.add(ExtraDataShapeRectKey);
            arrayList.add(ExtraDataShapeRectCornersKey);
            arrayList.add(ExtraDataShapeRegionKey);
        }
        rl0 accessibilityExtraKeys$ui = semanticsNode.getUnmergedConfig$ui().getAccessibilityExtraKeys$ui();
        if (accessibilityExtraKeys$ui != null) {
            Object[] objArr = accessibilityExtraKeys$ui.b;
            long[] jArr = accessibilityExtraKeys$ui.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j = jArr[i5];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        long j2 = j;
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j2 & 255) < 128 && (accessibilityExtraKey$ui = ((SemanticsPropertyKey) objArr[(i5 << 3) + i7]).getAccessibilityExtraKey$ui()) != null) {
                                arrayList.add(accessibilityExtraKey$ui);
                            }
                            j2 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        accessibilityNodeInfo.setAvailableExtraData(arrayList);
        SemanticsConfiguration unmergedConfig$ui6 = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties4 = SemanticsProperties.INSTANCE;
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui6, semanticsProperties4.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            SemanticsConfiguration unmergedConfig$ui7 = semanticsNode.getUnmergedConfig$ui();
            SemanticsActions semanticsActions2 = SemanticsActions.INSTANCE;
            if (unmergedConfig$ui7.contains(semanticsActions2.getSetProgress())) {
                z0Var.f("android.widget.SeekBar");
            } else {
                z0Var.f("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((ti) progressBarRangeInfo.getRange()).a, ((ti) progressBarRangeInfo.getRange()).b, progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig$ui().contains(semanticsActions2.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    float current = progressBarRangeInfo.getCurrent();
                    float f = ((ti) progressBarRangeInfo.getRange()).b;
                    float f2 = ((ti) progressBarRangeInfo.getRange()).a;
                    if (f < f2) {
                        f = f2;
                    }
                    if (current < f) {
                        z0Var.a(u0.f);
                    }
                    float current2 = progressBarRangeInfo.getCurrent();
                    float f3 = ((ti) progressBarRangeInfo.getRange()).a;
                    float f4 = ((ti) progressBarRangeInfo.getRange()).b;
                    if (f3 > f4) {
                        f3 = f4;
                    }
                    if (current2 > f3) {
                        z0Var.a(u0.g);
                    }
                }
            }
        }
        Api24Impl.addSetProgressAction(z0Var, semanticsNode);
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, z0Var);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, z0Var);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties4.getHorizontalScrollAxisRange());
        SemanticsConfiguration unmergedConfig$ui8 = semanticsNode.getUnmergedConfig$ui();
        SemanticsActions semanticsActions3 = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui8, semanticsActions3.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                z0Var.f("android.widget.HorizontalScrollView");
            }
            if (((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfo.setScrollable(true);
            }
            enabled5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    z0Var.a(u0.f);
                    isRtl2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    z0Var.a(!isRtl2 ? u0.k : u0.i);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    z0Var.a(u0.g);
                    isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    z0Var.a(!isRtl ? u0.i : u0.k);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties4.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                z0Var.f("android.widget.ScrollView");
            }
            if (((Number) scrollAxisRange2.getMaxValue().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfo.setScrollable(true);
            }
            enabled4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    z0Var.a(u0.f);
                    z0Var.a(u0.j);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    z0Var.a(u0.g);
                    z0Var.a(u0.h);
                }
            }
        }
        Api29Impl.addPageActions(z0Var, semanticsNode);
        accessibilityNodeInfo.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties4.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions3.getExpand());
            if (accessibilityAction10 != null) {
                z0Var.a(new u0(Fields.ColorFilter, accessibilityAction10.getLabel()));
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions3.getCollapse());
            if (accessibilityAction11 != null) {
                z0Var.a(new u0(Fields.BlendMode, accessibilityAction11.getLabel()));
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions3.getDismiss());
            if (accessibilityAction12 != null) {
                z0Var.a(new u0(1048576, accessibilityAction12.getLabel()));
            }
            if (semanticsNode.getUnmergedConfig$ui().contains(semanticsActions3.getCustomActions())) {
                List list3 = (List) semanticsNode.getUnmergedConfig$ui().get(semanticsActions3.getCustomActions());
                int size2 = list3.size();
                e10 e10Var = AccessibilityActionsResourceIds;
                if (size2 >= e10Var.b) {
                    throw new IllegalStateException("Can't have more than " + e10Var.b + " custom actions for one widget");
                }
                kr0 kr0Var = new kr0();
                ta0 ta0Var2 = ad0.a;
                ta0 ta0Var3 = new ta0();
                kr0 kr0Var2 = this.labelToActionId;
                if (p10.e(kr0Var2.d, kr0Var2.f, i) >= 0) {
                    kr0 kr0Var3 = this.labelToActionId;
                    kr0Var3.getClass();
                    ta0 ta0Var4 = (ta0) cq.h(kr0Var3, i);
                    ma0 ma0Var = new ma0();
                    int[] iArr = e10Var.a;
                    int i8 = e10Var.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ma0Var.e(iArr[i9]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i10);
                        ta0Var4.getClass();
                        if (ta0Var4.a(customAccessibilityAction.getLabel()) >= 0) {
                            int b3 = ta0Var4.b(customAccessibilityAction.getLabel());
                            ta0Var = ta0Var4;
                            kr0Var.b(b3, customAccessibilityAction.getLabel());
                            ta0Var3.h(b3, customAccessibilityAction.getLabel());
                            int[] iArr2 = ma0Var.a;
                            int i11 = ma0Var.b;
                            i2 = size3;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    i12 = -1;
                                    break;
                                }
                                int i13 = i11;
                                if (b3 == iArr2[i12]) {
                                    break;
                                }
                                i12++;
                                i11 = i13;
                            }
                            if (i12 >= 0) {
                                ma0Var.g(i12);
                            }
                            z0Var.a(new u0(b3, customAccessibilityAction.getLabel()));
                        } else {
                            ta0Var = ta0Var4;
                            i2 = size3;
                            arrayList2.add(customAccessibilityAction);
                        }
                        i10++;
                        ta0Var4 = ta0Var;
                        size3 = i2;
                    }
                    int size4 = arrayList2.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i14);
                        int b4 = ma0Var.b(i14);
                        kr0Var.b(b4, customAccessibilityAction2.getLabel());
                        ta0Var3.h(b4, customAccessibilityAction2.getLabel());
                        z0Var.a(new u0(b4, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i15 = 0; i15 < size5; i15++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i15);
                        int b5 = AccessibilityActionsResourceIds.b(i15);
                        kr0Var.b(b5, customAccessibilityAction3.getLabel());
                        ta0Var3.h(b5, customAccessibilityAction3.getLabel());
                        z0Var.a(new u0(b5, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.b(i, kr0Var);
                this.labelToActionId.b(i, ta0Var3);
            }
        }
        isScreenReaderFocusable = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isScreenReaderFocusable(semanticsNode, resources);
        accessibilityNodeInfo.setScreenReaderFocusable(isScreenReaderFocusable);
        int e3 = this.idToBeforeMap.e(i, -1);
        if (e3 != -1) {
            View semanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui(), e3);
            if (semanticsIdToView2 != null) {
                accessibilityNodeInfo.setTraversalBefore(semanticsIdToView2);
            } else {
                accessibilityNodeInfo.setTraversalBefore(this.view, e3);
            }
            addExtraDataToAccessibilityNodeInfoHelper(i, z0Var, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int e4 = this.idToAfterMap.e(i, -1);
        if (e4 != -1 && (semanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui(), e4)) != null) {
            accessibilityNodeInfo.setTraversalAfter(semanticsIdToView);
            addExtraDataToAccessibilityNodeInfoHelper(i, z0Var, this.ExtraDataTestTraversalAfterVal, null);
        }
        String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName());
        if (str2 != null) {
            z0Var.f(str2);
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (((Number) scrollAxisRange.getValue().invoke()).floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return ((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (((Number) scrollAxisRange.getValue().invoke()).floatValue() >= ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() || scrollAxisRange.getReverseScrolling()) {
            return ((Number) scrollAxisRange.getValue().invoke()).floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final boolean registerScrollingId(int i, List<ScrollObservationScope> list) {
        boolean z;
        ScrollObservationScope findById = SemanticsUtils_androidKt.findById(list, i);
        if (findById != null) {
            z = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(i, this.scrollObservationScopes, null, null, null, null);
            z = true;
            findById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    private final boolean requestAccessibilityFocus(int i) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i)) {
            return false;
        }
        int i2 = this.accessibilityFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = i;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, Fields.CompositingStrategy, null, null, 12, null);
        return true;
    }

    private final void resetEnabledAccessibilityServiceList() {
        this._enabledServices = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            OwnerSnapshotObserver snapshotObserver = this.view.getSnapshotObserver();
            snapshotObserver.observer.observeReads(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(scrollObservationScope, this));
        }
    }

    /* renamed from: scrollDxDyForNodeVisible-RE3cj74, reason: not valid java name */
    private final long m6701scrollDxDyForNodeVisibleRE3cj74(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j) {
        Rect boundsInParent = LayoutCoordinatesKt.boundsInParent(semanticsNode2.getLayoutInfo().getCoordinates());
        LayoutCoordinates parentLayoutCoordinates = semanticsNode2.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
        Rect m4553translatek4lQ0M = boundsInParent.m4553translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.Companion.m4532getZeroF1C5BW0());
        Rect m4556Recttz77jQw = RectKt.m4556Recttz77jQw(Offset.m4521plusMKHz9U(semanticsNode.m6838getPositionInRootF1C5BW0(), j), IntSizeKt.m7794toSizeozmzZPI(semanticsNode.m6841getSizeYbymL2g()));
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(m4556Recttz77jQw.getLeft() - m4553translatek4lQ0M.getLeft(), m4556Recttz77jQw.getRight() - m4553translatek4lQ0M.getRight())) << 32) | (Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(m4556Recttz77jQw.getTop() - m4553translatek4lQ0M.getTop(), m4556Recttz77jQw.getBottom() - m4553translatek4lQ0M.getBottom())) & 4294967295L));
    }

    private static final float scrollDxDyForNodeVisible_RE3cj74$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x001a -> B:6:0x001b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean scrollOntoScreen(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        SemanticsConfiguration unmergedConfig$ui;
        SemanticsConfiguration unmergedConfig$ui2;
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null && (unmergedConfig$ui2 = parent.getUnmergedConfig$ui()) != null) {
            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui2, SemanticsActions.INSTANCE.getScrollBy());
            while (accessibilityAction == null && parent != null) {
                parent = parent.getParent();
                if (parent != null && (unmergedConfig$ui = parent.getUnmergedConfig$ui()) != null) {
                    accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getScrollBy());
                }
            }
            if (parent != null) {
                Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                return this.view.requestRectangleOnScreen(new android.graphics.Rect((int) Math.floor(boundsInRoot.getLeft()), (int) Math.floor(boundsInRoot.getTop()), y80.P((float) Math.ceil(boundsInRoot.getRight())), y80.P((float) Math.ceil(boundsInRoot.getBottom()))));
            }
            long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
            boolean z = false;
            while (parent != null) {
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getScrollBy());
                if (accessibilityAction2 != null) {
                    long m6701scrollDxDyForNodeVisibleRE3cj74 = m6701scrollDxDyForNodeVisibleRE3cj74(semanticsNode, parent, m4532getZeroF1C5BW0);
                    long m6698adjustForReversedScrollingAndRtlRE3cj74 = m6698adjustForReversedScrollingAndRtlRE3cj74(semanticsNode, parent, m6701scrollDxDyForNodeVisibleRE3cj74);
                    my myVar = (my) accessibilityAction2.getAction();
                    z = (myVar != null && ((Boolean) myVar.invoke(Float.valueOf(Float.intBitsToFloat((int) (m6698adjustForReversedScrollingAndRtlRE3cj74 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (m6698adjustForReversedScrollingAndRtlRE3cj74 & 4294967295L))))).booleanValue()) || z;
                    m4532getZeroF1C5BW0 = Offset.m4520minusMKHz9U(m4532getZeroF1C5BW0, m6701scrollDxDyForNodeVisibleRE3cj74);
                }
                parent = parent.getParent();
            }
            return z;
        }
        accessibilityAction = null;
        while (accessibilityAction == null) {
            parent = parent.getParent();
            if (parent != null) {
                accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getScrollBy());
            }
            accessibilityAction = null;
            while (accessibilityAction == null) {
            }
        }
        if (parent != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i;
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        int[] iArr = n10.a;
        oa0 oa0Var = new oa0();
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
            if (getCurrentSemanticsNodes().a(semanticsNode2.getId())) {
                if (!semanticsNodeCopy.getChildren().a(semanticsNode2.getId())) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui());
                    return;
                }
                oa0Var.b(semanticsNode2.getId());
            }
        }
        oa0 children = semanticsNodeCopy.getChildren();
        int[] iArr2 = children.b;
        long[] jArr = children.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128 && !oa0Var.a(iArr2[(i2 << 3) + i4])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui());
                            return;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        List<SemanticsNode> replacedChildren$ui2 = semanticsNode.getReplacedChildren$ui();
        int size2 = replacedChildren$ui2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui2.get(i5);
            SemanticsNodeCopy semanticsNodeCopy2 = (SemanticsNodeCopy) this.previousSemanticsNodes.b(semanticsNode3.getId());
            if (semanticsNodeCopy2 != null && getCurrentSemanticsNodes().a(semanticsNode3.getId())) {
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !isEnabled$ui()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(i, i2);
        if (num != null) {
            createEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(createEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        createEvent.setContentChangeTypes(i2);
        if (str != null) {
            createEvent.getText().add(str);
        }
        sendEvent(createEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), Fields.RenderEffect);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0553, code lost:
    
        if (r2.isEmpty() == false) goto L171;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSemanticsPropertyChangeEvents(g10 g10Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        Integer num3;
        int i3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        Integer num4;
        int i5;
        SemanticsNode semanticsNode;
        int i6;
        boolean z;
        Object[] objArr;
        int i7;
        int i8;
        long[] jArr3;
        int i9;
        Integer num5;
        Object[] objArr2;
        int i10;
        long[] jArr4;
        long[] jArr5;
        int[] iArr3;
        ArrayList arrayList3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Integer num6;
        String str;
        Integer num7;
        boolean accessibilityEquals;
        String text;
        int i16;
        int i17;
        boolean z2;
        AccessibilityEvent createTextSelectionChangedEvent;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        g10 g10Var2 = g10Var;
        Integer num8 = 64;
        ArrayList arrayList4 = new ArrayList(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes);
        androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes.clear();
        int[] iArr4 = g10Var2.b;
        long[] jArr6 = g10Var2.a;
        int i18 = 2;
        int length = jArr6.length - 2;
        int i19 = 0;
        Integer num9 = 0;
        if (length < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j = jArr6[i20];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i21 = 8;
                int i22 = 8 - ((~(i20 - length)) >>> 31);
                long j2 = j;
                int i23 = i19;
                while (i23 < i22) {
                    if ((j2 & 255) < 128) {
                        int i24 = iArr4[(i20 << 3) + i23];
                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) androidComposeViewAccessibilityDelegateCompat.previousSemanticsNodes.b(i24);
                        if (semanticsNodeCopy == null) {
                            i2 = i23;
                            num3 = num8;
                            i3 = i22;
                            arrayList2 = arrayList4;
                            iArr2 = iArr4;
                            jArr2 = jArr6;
                            i4 = i18;
                            num4 = num9;
                        } else {
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) g10Var2.b(i24);
                            SemanticsNode semanticsNode2 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode2 == null) {
                                throw k4.a("no value for specified key");
                            }
                            i4 = i18;
                            fb0 props$ui = semanticsNode2.getUnmergedConfig$ui().getProps$ui();
                            Object[] objArr3 = props$ui.b;
                            int i25 = i22;
                            Object[] objArr4 = props$ui.c;
                            long[] jArr7 = props$ui.a;
                            int i26 = i21;
                            int length2 = jArr7.length - 2;
                            if (length2 >= 0) {
                                Integer num10 = num8;
                                z = false;
                                int i27 = 0;
                                while (true) {
                                    long j3 = jArr7[i27];
                                    int i28 = length2;
                                    semanticsNode = semanticsNode2;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i29 = 8 - ((~(i27 - i28)) >>> 31);
                                        long j4 = j3;
                                        int i30 = 0;
                                        while (i30 < i29) {
                                            if ((j4 & 255) < 128) {
                                                int i31 = (i27 << 3) + i30;
                                                Object obj = objArr3[i31];
                                                Object obj2 = objArr4[i31];
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                i9 = i23;
                                                if (((q10.b(semanticsPropertyKey, semanticsProperties.getHorizontalScrollAxisRange()) || q10.b(semanticsPropertyKey, semanticsProperties.getVerticalScrollAxisRange())) ? androidComposeViewAccessibilityDelegateCompat.registerScrollingId(i24, arrayList4) : false) || !q10.b(obj2, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey))) {
                                                    if (q10.b(semanticsPropertyKey, semanticsProperties.getPaneTitle())) {
                                                        obj2.getClass();
                                                        String str2 = (String) obj2;
                                                        if (semanticsNodeCopy.getUnmergedConfig().contains(semanticsProperties.getPaneTitle())) {
                                                            androidComposeViewAccessibilityDelegateCompat.sendPaneChangeEvents(i24, i26, str2);
                                                        }
                                                    } else {
                                                        if (q10.b(semanticsPropertyKey, semanticsProperties.getStateDescription())) {
                                                            iArr3 = iArr4;
                                                            i15 = i25;
                                                            i13 = i28;
                                                            i10 = i30;
                                                            arrayList3 = arrayList4;
                                                            Integer num11 = num10;
                                                            i14 = i24;
                                                            jArr5 = jArr6;
                                                            i12 = i27;
                                                            jArr4 = jArr7;
                                                            i11 = i29;
                                                            objArr2 = objArr3;
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i24), Fields.CameraDistance, num11, null, 8, null);
                                                            num5 = num11;
                                                            num6 = num9;
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, num6, null, 8, null);
                                                        } else {
                                                            iArr3 = iArr4;
                                                            objArr2 = objArr3;
                                                            i15 = i25;
                                                            num5 = num10;
                                                            i13 = i28;
                                                            i10 = i30;
                                                            arrayList3 = arrayList4;
                                                            jArr5 = jArr6;
                                                            i12 = i27;
                                                            i14 = i24;
                                                            jArr4 = jArr7;
                                                            i11 = i29;
                                                            if (q10.b(semanticsPropertyKey, semanticsProperties.getToggleableState())) {
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, 8192, null, 8, null);
                                                                num6 = num9;
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, num6, null, 8, null);
                                                            } else if (q10.b(semanticsPropertyKey, semanticsProperties.getError())) {
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, 3072, null, 8, null);
                                                                num6 = num9;
                                                            } else if (q10.b(semanticsPropertyKey, semanticsProperties.getProgressBarRangeInfo())) {
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, num5, null, 8, null);
                                                                num6 = num9;
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, num6, null, 8, null);
                                                            } else {
                                                                num6 = num9;
                                                                if (q10.b(semanticsPropertyKey, semanticsProperties.getSelected())) {
                                                                    Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getRole());
                                                                    if (!(role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), Role.Companion.m6835getTabo7Vup1c()))) {
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, num5, null, 8, null);
                                                                        num6 = num6;
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, num6, null, 8, null);
                                                                    } else if (q10.b(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getSelected()), Boolean.TRUE)) {
                                                                        AccessibilityEvent createEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), 4);
                                                                        SemanticsNode copyWithMergingEnabled$ui = semanticsNode.copyWithMergingEnabled$ui();
                                                                        List list = (List) SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui.getConfig(), semanticsProperties.getContentDescription());
                                                                        String fastJoinToString$default = list != null ? ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null) : null;
                                                                        List list2 = (List) SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui.getConfig(), semanticsProperties.getText());
                                                                        String fastJoinToString$default2 = list2 != null ? ListUtilsKt.fastJoinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null;
                                                                        if (fastJoinToString$default != null) {
                                                                            createEvent.setContentDescription(fastJoinToString$default);
                                                                        }
                                                                        if (fastJoinToString$default2 != null) {
                                                                            createEvent.getText().add(fastJoinToString$default2);
                                                                        }
                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(createEvent);
                                                                    } else {
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, num6, null, 8, null);
                                                                    }
                                                                } else if (q10.b(semanticsPropertyKey, semanticsProperties.getContentDescription())) {
                                                                    int semanticsNodeIdToAccessibilityVirtualNodeId = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14);
                                                                    obj2.getClass();
                                                                    androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId, Fields.CameraDistance, 4, (List) obj2);
                                                                } else {
                                                                    str = "";
                                                                    if (!q10.b(semanticsPropertyKey, semanticsProperties.getEditableText())) {
                                                                        num7 = num6;
                                                                        if (q10.b(semanticsPropertyKey, semanticsProperties.getTextSelectionRange())) {
                                                                            AnnotatedString textForTextField = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNode.getUnmergedConfig$ui());
                                                                            if (textForTextField != null && (text = textForTextField.getText()) != null) {
                                                                                str = text;
                                                                            }
                                                                            long m7064unboximpl = ((TextRange) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties.getTextSelectionRange())).m7064unboximpl();
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Integer.valueOf(TextRange.m7060getStartimpl(m7064unboximpl)), Integer.valueOf(TextRange.m7055getEndimpl(m7064unboximpl)), Integer.valueOf(str.length()), androidComposeViewAccessibilityDelegateCompat.trimToSize(str, ParcelSafeTextLength)));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
                                                                        } else if (q10.b(semanticsPropertyKey, semanticsProperties.getHorizontalScrollAxisRange()) || q10.b(semanticsPropertyKey, semanticsProperties.getVerticalScrollAxisRange())) {
                                                                            num6 = num7;
                                                                            androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui());
                                                                            ScrollObservationScope findById = SemanticsUtils_androidKt.findById(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes, i14);
                                                                            findById.getClass();
                                                                            findById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getHorizontalScrollAxisRange()));
                                                                            findById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getVerticalScrollAxisRange()));
                                                                            androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded(findById);
                                                                        } else if (q10.b(semanticsPropertyKey, semanticsProperties.getFocused())) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 8));
                                                                            }
                                                                            num6 = num7;
                                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), Fields.CameraDistance, num6, null, 8, null);
                                                                        } else {
                                                                            num6 = num7;
                                                                            SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                                                                            if (q10.b(semanticsPropertyKey, semanticsActions.getCustomActions())) {
                                                                                List list3 = (List) semanticsNode.getUnmergedConfig$ui().get(semanticsActions.getCustomActions());
                                                                                List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsActions.getCustomActions());
                                                                                if (list4 != null) {
                                                                                    gb0 gb0Var = sl0.a;
                                                                                    gb0 gb0Var2 = new gb0();
                                                                                    int size = list3.size();
                                                                                    for (int i32 = 0; i32 < size; i32++) {
                                                                                        gb0Var2.d(((CustomAccessibilityAction) list3.get(i32)).getLabel());
                                                                                    }
                                                                                    gb0 gb0Var3 = new gb0();
                                                                                    int size2 = list4.size();
                                                                                    for (int i33 = 0; i33 < size2; i33++) {
                                                                                        gb0Var3.d(((CustomAccessibilityAction) list4.get(i33)).getLabel());
                                                                                    }
                                                                                    z = !gb0Var2.equals(gb0Var3);
                                                                                }
                                                                            } else {
                                                                                if (obj2 instanceof AccessibilityAction) {
                                                                                    accessibilityEquals = AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) obj2, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey));
                                                                                    if (accessibilityEquals) {
                                                                                        z = false;
                                                                                    }
                                                                                }
                                                                                z = true;
                                                                            }
                                                                        }
                                                                    } else if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getSetText())) {
                                                                        AnnotatedString textForTextField2 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                                                        if (textForTextField2 == null) {
                                                                            textForTextField2 = "";
                                                                        }
                                                                        AnnotatedString textForTextField3 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNode.getUnmergedConfig$ui());
                                                                        str = textForTextField3 != null ? textForTextField3 : "";
                                                                        CharSequence trimToSize = androidComposeViewAccessibilityDelegateCompat.trimToSize(str, ParcelSafeTextLength);
                                                                        int length3 = textForTextField2.length();
                                                                        int length4 = str.length();
                                                                        int i34 = length3 > length4 ? length4 : length3;
                                                                        int i35 = 0;
                                                                        while (true) {
                                                                            num7 = num6;
                                                                            if (i35 >= i34) {
                                                                                i16 = length3;
                                                                                break;
                                                                            }
                                                                            i16 = length3;
                                                                            if (textForTextField2.charAt(i35) != str.charAt(i35)) {
                                                                                break;
                                                                            }
                                                                            i35++;
                                                                            length3 = i16;
                                                                            num6 = num7;
                                                                        }
                                                                        int i36 = 0;
                                                                        while (true) {
                                                                            if (i36 >= i34 - i35) {
                                                                                i17 = i36;
                                                                                break;
                                                                            }
                                                                            i17 = i36;
                                                                            if (textForTextField2.charAt((i16 - 1) - i36) != str.charAt((length4 - 1) - i17)) {
                                                                                break;
                                                                            } else {
                                                                                i36 = i17 + 1;
                                                                            }
                                                                        }
                                                                        int i37 = (i16 - i17) - i35;
                                                                        int i38 = (length4 - i17) - i35;
                                                                        SemanticsConfiguration unmergedConfig = semanticsNodeCopy.getUnmergedConfig();
                                                                        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                                        boolean contains = unmergedConfig.contains(semanticsProperties2.getPassword());
                                                                        boolean contains2 = semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties2.getPassword());
                                                                        boolean contains3 = semanticsNodeCopy.getUnmergedConfig().contains(semanticsProperties2.getEditableText());
                                                                        boolean z3 = contains3 && !contains && contains2;
                                                                        boolean z4 = contains3 && contains && !contains2;
                                                                        if (z3 || z4) {
                                                                            z2 = z3;
                                                                            createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), num7, num7, Integer.valueOf(length4), trimToSize);
                                                                        } else {
                                                                            z2 = z3;
                                                                            createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), 16);
                                                                            createTextSelectionChangedEvent.setFromIndex(i35);
                                                                            createTextSelectionChangedEvent.setRemovedCount(i37);
                                                                            createTextSelectionChangedEvent.setAddedCount(i38);
                                                                            createTextSelectionChangedEvent.setBeforeText(textForTextField2);
                                                                            createTextSelectionChangedEvent.getText().add(trimToSize);
                                                                        }
                                                                        createTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                        if (z2 || z4) {
                                                                            long m7064unboximpl2 = ((TextRange) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties2.getTextSelectionRange())).m7064unboximpl();
                                                                            createTextSelectionChangedEvent.setFromIndex(TextRange.m7060getStartimpl(m7064unboximpl2));
                                                                            createTextSelectionChangedEvent.setToIndex(TextRange.m7055getEndimpl(m7064unboximpl2));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                        }
                                                                    } else {
                                                                        num7 = num6;
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), Fields.CameraDistance, Integer.valueOf(i4), null, 8, null);
                                                                    }
                                                                    num6 = num7;
                                                                }
                                                            }
                                                        }
                                                        j4 >>= 8;
                                                        int i39 = i10 + 1;
                                                        num9 = num6;
                                                        i24 = i14;
                                                        i28 = i13;
                                                        i29 = i11;
                                                        arrayList4 = arrayList3;
                                                        iArr4 = iArr3;
                                                        jArr7 = jArr4;
                                                        i30 = i39;
                                                        i25 = i15;
                                                        i27 = i12;
                                                        i26 = 8;
                                                        jArr6 = jArr5;
                                                        i23 = i9;
                                                        objArr3 = objArr2;
                                                        num10 = num5;
                                                    }
                                                }
                                            } else {
                                                i9 = i23;
                                            }
                                            iArr3 = iArr4;
                                            objArr2 = objArr3;
                                            i15 = i25;
                                            num5 = num10;
                                            i13 = i28;
                                            i10 = i30;
                                            arrayList3 = arrayList4;
                                            jArr5 = jArr6;
                                            num6 = num9;
                                            i12 = i27;
                                            i14 = i24;
                                            jArr4 = jArr7;
                                            i11 = i29;
                                            j4 >>= 8;
                                            int i392 = i10 + 1;
                                            num9 = num6;
                                            i24 = i14;
                                            i28 = i13;
                                            i29 = i11;
                                            arrayList4 = arrayList3;
                                            iArr4 = iArr3;
                                            jArr7 = jArr4;
                                            i30 = i392;
                                            i25 = i15;
                                            i27 = i12;
                                            i26 = 8;
                                            jArr6 = jArr5;
                                            i23 = i9;
                                            objArr3 = objArr2;
                                            num10 = num5;
                                        }
                                        i2 = i23;
                                        objArr = objArr3;
                                        num4 = num9;
                                        i3 = i25;
                                        int i40 = i26;
                                        num3 = num10;
                                        arrayList2 = arrayList4;
                                        iArr2 = iArr4;
                                        jArr2 = jArr6;
                                        i8 = i27;
                                        i7 = i28;
                                        i6 = i24;
                                        jArr3 = jArr7;
                                        if (i29 != i40) {
                                            break;
                                        }
                                    } else {
                                        i2 = i23;
                                        iArr2 = iArr4;
                                        objArr = objArr3;
                                        num4 = num9;
                                        i3 = i25;
                                        num3 = num10;
                                        i7 = i28;
                                        arrayList2 = arrayList4;
                                        jArr2 = jArr6;
                                        i8 = i27;
                                        i6 = i24;
                                        jArr3 = jArr7;
                                    }
                                    if (i8 == i7) {
                                        break;
                                    }
                                    int i41 = i8 + 1;
                                    num9 = num4;
                                    i24 = i6;
                                    length2 = i7;
                                    arrayList4 = arrayList2;
                                    iArr4 = iArr2;
                                    jArr6 = jArr2;
                                    jArr7 = jArr3;
                                    semanticsNode2 = semanticsNode;
                                    objArr3 = objArr;
                                    num10 = num3;
                                    i26 = 8;
                                    i27 = i41;
                                    i25 = i3;
                                    i23 = i2;
                                }
                            } else {
                                i2 = i23;
                                num3 = num8;
                                semanticsNode = semanticsNode2;
                                iArr2 = iArr4;
                                jArr2 = jArr6;
                                num4 = num9;
                                i3 = i25;
                                arrayList2 = arrayList4;
                                i6 = i24;
                                z = false;
                            }
                            if (!z) {
                                z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy.getUnmergedConfig());
                            }
                            if (z) {
                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i6), Fields.CameraDistance, num4, null, 8, null);
                            }
                        }
                        i5 = 8;
                    } else {
                        i2 = i23;
                        num3 = num8;
                        i3 = i22;
                        arrayList2 = arrayList4;
                        iArr2 = iArr4;
                        jArr2 = jArr6;
                        i4 = i18;
                        num4 = num9;
                        i5 = i21;
                    }
                    j2 >>= i5;
                    i23 = i2 + 1;
                    androidComposeViewAccessibilityDelegateCompat = this;
                    num9 = num4;
                    i22 = i3;
                    i21 = i5;
                    i18 = i4;
                    arrayList4 = arrayList2;
                    iArr4 = iArr2;
                    jArr6 = jArr2;
                    num8 = num3;
                    g10Var2 = g10Var;
                }
                num = num8;
                arrayList = arrayList4;
                iArr = iArr4;
                jArr = jArr6;
                i = i18;
                num2 = num9;
                if (i22 != i21) {
                    return;
                }
            } else {
                num = num8;
                arrayList = arrayList4;
                iArr = iArr4;
                jArr = jArr6;
                i = i18;
                num2 = num9;
            }
            if (i20 == length) {
                return;
            }
            i20++;
            i19 = 0;
            androidComposeViewAccessibilityDelegateCompat = this;
            g10Var2 = g10Var;
            num9 = num2;
            i18 = i;
            arrayList4 = arrayList;
            iArr4 = iArr;
            jArr6 = jArr;
            num8 = num;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, oa0 oa0Var) {
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode findClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE);
            }
            if (layoutNode == null || (semanticsConfiguration = layoutNode.getSemanticsConfiguration()) == null) {
                return;
            }
            if (!semanticsConfiguration.isMergingSemanticsOfDescendants() && findClosestParentNode != null) {
                layoutNode = findClosestParentNode;
            }
            int semanticsId = layoutNode.getSemanticsId();
            if (oa0Var.b(semanticsId)) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), Fields.CameraDistance, 1, null, 8, null);
            }
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) this.pendingHorizontalScrollEvents.b(semanticsId);
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) this.pendingVerticalScrollEvents.b(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(semanticsId, Fields.TransformOrigin);
            if (scrollAxisRange != null) {
                createEvent.setScrollX((int) ((Number) scrollAxisRange.getValue().invoke()).floatValue());
                createEvent.setMaxScrollX((int) ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue());
            }
            if (scrollAxisRange2 != null) {
                createEvent.setScrollY((int) ((Number) scrollAxisRange2.getValue().invoke()).floatValue());
                createEvent.setMaxScrollY((int) ((Number) scrollAxisRange2.getMaxValue().invoke()).floatValue());
            }
            sendEvent(createEvent);
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        boolean enabled;
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsActions.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                ny nyVar = (ny) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui().get(semanticsActions.getSetSelection())).getAction();
                if (nyVar != null) {
                    return ((Boolean) nyVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
                }
                return false;
            }
        }
        if ((i == i2 && i2 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) {
            i = -1;
        }
        this.accessibilityCursorPosition = i;
        boolean z2 = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, z0 z0Var) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getError())) {
            z0Var.a.setContentInvalid(true);
            z0Var.a.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getError()));
        }
    }

    private final void setInvisibleIfEmptyBounds(z0 z0Var, SemanticsNode semanticsNode) {
        if (semanticsNode.getTouchBoundsInRoot().isEmpty()) {
            z0Var.a.setVisibleToUser(false);
        }
    }

    private final void setText(SemanticsNode semanticsNode, z0 z0Var) {
        AnnotatedString infoText;
        infoText = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoText(semanticsNode);
        z0Var.a.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final android.graphics.Rect toAndroidRect(Rect rect, float f, float f2) {
        return new android.graphics.Rect((int) (rect.getLeft() + f), (int) (rect.getTop() + f2), (int) (rect.getRight() + f), (int) (rect.getBottom() + f2));
    }

    public static /* synthetic */ android.graphics.Rect toAndroidRect$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Rect rect, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return androidComposeViewAccessibilityDelegateCompat.toAndroidRect(rect, f, f2);
    }

    private final android.graphics.Rect toBoundsInScreen(float f, float f2, float f3, float f4) {
        long mo6183localToScreenMKHz9U = this.view.mo6183localToScreenMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
        long mo6183localToScreenMKHz9U2 = this.view.mo6183localToScreenMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32)));
        int i = (int) (mo6183localToScreenMKHz9U >> 32);
        int i2 = (int) (mo6183localToScreenMKHz9U2 >> 32);
        int i3 = (int) (mo6183localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (mo6183localToScreenMKHz9U2 & 4294967295L);
        return new android.graphics.Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    private final Rect toBoundsRelativeToNodeBounds(android.graphics.Rect rect, android.graphics.Rect rect2) {
        float f = rect.left - rect2.left;
        float f2 = rect.top - rect2.top;
        return new Rect(f, f2, rect.width() + f, rect.height() + f2);
    }

    private final float[] toCornerArray(Outline outline) {
        if (!(outline instanceof Outline.Rounded)) {
            return null;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        return new float[]{Float.intBitsToFloat((int) (rounded.getRoundRect().m4566getTopLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4566getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4567getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4567getTopRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4565getBottomRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4565getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4564getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4564getBottomLeftCornerRadiuskKHJgLs() & 4294967295L))};
    }

    private final Region toRegion(Outline outline, float f, float f2) {
        if (outline instanceof Outline.Generic) {
            Outline.Generic generic = (Outline.Generic) outline;
            Region region = new Region(toAndroidRect$default(this, generic.getBounds().translate(f, f2), 0.0f, 0.0f, 3, null));
            Region region2 = new Region();
            Path path = generic.getPath();
            if (path instanceof AndroidPath) {
                android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
                internalPath.offset(f, f2);
                region2.setPath(internalPath, region);
                return region2;
            }
            lu0.a("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        Rect m4553translatek4lQ0M = rect.m4553translatek4lQ0M(semanticsNode.m6838getPositionInRootF1C5BW0());
        Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        Rect intersect = m4553translatek4lQ0M.overlaps(boundsInRoot) ? m4553translatek4lQ0M.intersect(boundsInRoot) : null;
        if (intersect == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.view;
        float left = intersect.getLeft();
        long mo6183localToScreenMKHz9U = androidComposeView.mo6183localToScreenMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(intersect.getTop()) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        AndroidComposeView androidComposeView2 = this.view;
        float right = intersect.getRight();
        long mo6183localToScreenMKHz9U2 = androidComposeView2.mo6183localToScreenMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(intersect.getBottom()) & 4294967295L) | (Float.floatToRawIntBits(right) << 32)));
        int i = (int) (mo6183localToScreenMKHz9U >> 32);
        int i2 = (int) (mo6183localToScreenMKHz9U2 >> 32);
        int i3 = (int) (mo6183localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (mo6183localToScreenMKHz9U2 & 4294967295L);
        return new RectF(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), ParcelSafeTextLength);
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        boolean z3 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(semanticsNode, i);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = z ? 0 : iterableTextForAccessibility.length();
            }
            int[] following = z ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (following == null) {
                return false;
            }
            int i4 = following[0];
            z3 = true;
            int i5 = following[1];
            if (z2 && isAccessibilitySelectionExtendable(semanticsNode)) {
                i2 = getAccessibilitySelectionStart(semanticsNode);
                if (i2 == -1) {
                    i2 = z ? i4 : i5;
                }
                i3 = z ? i5 : i4;
            } else {
                i2 = z ? i5 : i4;
                i3 = i2;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z ? Fields.RotationX : Fields.RotationY, i, i4, i5, SystemClock.uptimeMillis());
            setAccessibilitySelection(semanticsNode, i2, i3, true);
        }
        return z3;
    }

    private final <T extends CharSequence> T trimToSize(T t, int i) {
        if (i <= 0) {
            o.m("size should be greater than 0");
            return null;
        }
        if (t == null || t.length() == 0) {
            return t;
        }
        if (t.length() <= i) {
            return t;
        }
        int i2 = i - 1;
        if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
            i = i2;
        }
        T t2 = (T) t.subSequence(0, i);
        t2.getClass();
        return t2;
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.hoveredVirtualViewId = i;
        sendEventForVirtualView$default(this, i, Fields.SpotShadowColor, null, null, 12, null);
        sendEventForVirtualView$default(this, i2, Fields.RotationX, null, null, 12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
    
        if (((r6 & ((~r6) << 6)) & r21) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
    
        r16 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateSemanticsNodesCopyAndPanes() {
        char c;
        long j;
        long j2;
        long j3;
        long j4;
        long[] jArr;
        long[] jArr2;
        long j5;
        int i;
        long j6;
        int i2;
        char c2;
        long j7;
        SemanticsConfiguration unmergedConfig;
        oa0 oa0Var = new oa0();
        oa0 oa0Var2 = this.paneDisplayed;
        int[] iArr = oa0Var2.b;
        long[] jArr3 = oa0Var2.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            j2 = 128;
            while (true) {
                long j9 = jArr3[i4];
                j3 = 255;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j9 & 255) < 128) {
                            c2 = c3;
                            int i7 = iArr[(i4 << 3) + i6];
                            j7 = j8;
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i7);
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode == null || !semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                oa0Var.b(i7);
                                SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.b(i7);
                                sendPaneChangeEvents(i7, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle()));
                            }
                        } else {
                            c2 = c3;
                            j7 = j8;
                        }
                        j9 >>= 8;
                        i6++;
                        c3 = c2;
                        j8 = j7;
                    }
                    c = c3;
                    j = j8;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                    j = j8;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                c3 = c;
                j8 = j;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        oa0 oa0Var3 = this.paneDisplayed;
        oa0Var3.getClass();
        int[] iArr2 = oa0Var.b;
        long[] jArr4 = oa0Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j10 = jArr4[i8];
                if ((((~j10) << c) & j10 & j) != j) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j10 & j3) < j2) {
                            int i11 = iArr2[(i8 << 3) + i10];
                            int hashCode = Integer.hashCode(i11) * (-862048943);
                            int i12 = hashCode ^ (hashCode << 16);
                            int i13 = i12 & 127;
                            int i14 = oa0Var3.c;
                            int i15 = (i12 >>> 7) & i14;
                            j6 = j2;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = oa0Var3.a;
                                int i17 = i15 >> 3;
                                i = i3;
                                int i18 = (i15 & 7) << 3;
                                j5 = j10;
                                long j11 = (jArr5[i17] >>> i18) | (((-i18) >> 63) & (jArr5[i17 + 1] << (64 - i18)));
                                int i19 = i15;
                                long j12 = (i13 * 72340172838076673L) ^ j11;
                                long j13 = (j12 - 72340172838076673L) & (~j12) & j;
                                while (true) {
                                    if (j13 == 0) {
                                        break;
                                    }
                                    i2 = (i19 + (Long.numberOfTrailingZeros(j13) >> 3)) & i14;
                                    jArr2 = jArr4;
                                    if (oa0Var3.b[i2] == i11) {
                                        break;
                                    }
                                    j13 &= j13 - 1;
                                    jArr4 = jArr2;
                                }
                                i16 += 8;
                                i15 = (i19 + i16) & i14;
                                jArr4 = jArr2;
                                i3 = i;
                                j10 = j5;
                            }
                            int i20 = i2;
                            if (i20 >= 0) {
                                oa0Var3.i(i20);
                            }
                        } else {
                            jArr2 = jArr4;
                            j5 = j10;
                            i = i3;
                            j6 = j2;
                        }
                        j10 = j5 >> i;
                        i10++;
                        j2 = j6;
                        jArr4 = jArr2;
                        i3 = i;
                    }
                    jArr = jArr4;
                    j4 = j2;
                    if (i9 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    j4 = j2;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                j2 = j4;
                jArr4 = jArr;
                i3 = 8;
            }
        } else {
            j4 = j2;
        }
        this.previousSemanticsNodes.c();
        g10 currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr3 = currentSemanticsNodes.b;
        Object[] objArr = currentSemanticsNodes.c;
        long[] jArr6 = currentSemanticsNodes.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i21 = 0;
            while (true) {
                long j14 = jArr6[i21];
                if ((((~j14) << c) & j14 & j) != j) {
                    int i22 = 8 - ((~(i21 - length3)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j14 & j3) < j4) {
                            int i24 = (i21 << 3) + i23;
                            int i25 = iArr3[i24];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i24];
                            SemanticsConfiguration unmergedConfig$ui = semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig$ui();
                            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                            if (unmergedConfig$ui.contains(semanticsProperties.getPaneTitle()) && this.paneDisplayed.b(i25)) {
                                sendPaneChangeEvents(i25, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig$ui().get(semanticsProperties.getPaneTitle()));
                            }
                            this.previousSemanticsNodes.i(i25, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getCurrentSemanticsNodes()));
                        }
                        j14 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length3) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (defpackage.y80.p(r6, r0) == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002e, B:14:0x0057, B:20:0x0067, B:22:0x006f, B:24:0x0078, B:26:0x007f, B:28:0x0090, B:31:0x009d, B:32:0x00a4, B:40:0x0045, B:42:0x004c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bf -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui(hm hmVar) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i;
        oa0 oa0Var;
        nf it;
        oa0 oa0Var2;
        Object b;
        try {
            if (hmVar instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) hmVar;
                int i2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
                    i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                    vn vnVar = vn.d;
                    if (i != 0) {
                        p10.Q(obj);
                        oa0Var = new oa0();
                        it = this.boundsUpdateChannel.iterator();
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = oa0Var;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        b = it.b(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (b != vnVar) {
                        }
                    } else if (i == 1) {
                        it = (nf) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        oa0Var2 = (oa0) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        p10.Q(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (nf) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        oa0Var2 = (oa0) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        p10.Q(obj);
                        oa0Var = oa0Var2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = oa0Var;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        b = it.b(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (b != vnVar) {
                            return vnVar;
                        }
                        oa0Var2 = oa0Var;
                        obj = b;
                        if (((Boolean) obj).booleanValue()) {
                            this.subtreeChangedLayoutNodes.clear();
                            return w01.a;
                        }
                        it.c();
                        if (isEnabled$ui()) {
                            int i3 = this.subtreeChangedLayoutNodes.f;
                            for (int i4 = 0; i4 < i3; i4++) {
                                LayoutNode layoutNode = (LayoutNode) this.subtreeChangedLayoutNodes.e[i4];
                                sendSubtreeChangeAccessibilityEvents(layoutNode, oa0Var2);
                                sendTypeViewScrolledAccessibilityEvent(layoutNode);
                            }
                            oa0Var2.d();
                            Handler handler = getHandler();
                            if (!this.checkingForSemanticsChanges && handler != null) {
                                this.checkingForSemanticsChanges = true;
                                handler.post(this.semanticsChangeChecker);
                            }
                        }
                        this.subtreeChangedLayoutNodes.clear();
                        this.pendingHorizontalScrollEvents.c();
                        this.pendingVerticalScrollEvents.c();
                        long j = this.SendRecurringAccessibilityEventsIntervalMillis;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = oa0Var2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.subtreeChangedLayoutNodes.clear();
            throw th;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, hmVar);
        Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
        vn vnVar2 = vn.d;
    }

    /* renamed from: canScroll-0AR0LA0$ui, reason: not valid java name */
    public final boolean m6702canScroll0AR0LA0$ui(boolean z, int i, long j) {
        if (q10.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m6699canScrollmoWRBKg(getCurrentSemanticsNodes(), z, i, j);
        }
        return false;
    }

    public final boolean dispatchHoverEvent$ui(MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui = hitTestSemanticsAt$ui(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(hitTestSemanticsAt$ui);
            if (hitTestSemanticsAt$ui == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // defpackage.p0
    public b1 getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    public final String getExtraDataTestTraversalAfterVal$ui() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final int getHoveredVirtualViewId$ui() {
        return this.hoveredVirtualViewId;
    }

    public final la0 getIdToAfterMap$ui() {
        return this.idToAfterMap;
    }

    public final la0 getIdToBeforeMap$ui() {
        return this.idToBeforeMap;
    }

    public final ky getOnSendAccessibilityEvent$ui() {
        return this.onSendAccessibilityEvent;
    }

    public final Boolean getRequestFromAccessibilityToolForTesting$ui() {
        return this.requestFromAccessibilityToolForTesting;
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int hitTestSemanticsAt$ui(float f, float f2) {
        int i;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m6465hitTestSemantics6fMxITs$ui$default(this.view.getRoot(), Offset.m4508constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)), hitTestResult, 0, false, 12, null);
        int size = hitTestResult.size() - 1;
        while (true) {
            i = Integer.MIN_VALUE;
            if (-1 >= size) {
                break;
            }
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(size));
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(requireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (requireLayoutNode.getNodes$ui().m6528hasH91voCI$ui(NodeKind.m6573constructorimpl(8))) {
                i = semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode.getSemanticsId());
                SemanticsNode SemanticsNode = SemanticsNodeKt.SemanticsNode(requireLayoutNode, false);
                if (SemanticsOwnerKt.isImportantForAccessibility(SemanticsNode) && !SemanticsNode_androidKt.isAccessibilityIgnoredLink(SemanticsNode)) {
                    break;
                }
            }
            size--;
        }
        return i;
    }

    public final boolean isEnabled$ui() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !getEnabledServices().isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        resetEnabledAccessibilityServiceList();
    }

    public final void onLayoutChange$ui(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler = getHandler();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler.post(this.semanticsChangeChecker);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        resetEnabledAccessibilityServiceList();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.accessibilityManager.isEnabled()) {
            resetEnabledAccessibilityServiceList();
        }
        this.accessibilityManager.addAccessibilityStateChangeListener(this);
        this.accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler = getHandler();
        handler.getClass();
        handler.removeCallbacks(this.semanticsChangeChecker);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void setAccessibilityForceEnabledForTesting$ui(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setHoveredVirtualViewId$ui(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final void setIdToAfterMap$ui(la0 la0Var) {
        this.idToAfterMap = la0Var;
    }

    public final void setIdToBeforeMap$ui(la0 la0Var) {
        this.idToBeforeMap = la0Var;
    }

    public final void setOnSendAccessibilityEvent$ui(ky kyVar) {
        this.onSendAccessibilityEvent = kyVar;
    }

    public final void setRequestFromAccessibilityToolForTesting$ui(Boolean bool) {
        this.requestFromAccessibilityToolForTesting = bool;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    private final android.graphics.Rect toAndroidRect(Outline outline, float f, float f2) {
        if ((outline instanceof Outline.Rectangle) || (outline instanceof Outline.Rounded)) {
            return toAndroidRect(outline.getBounds(), f, f2);
        }
        return null;
    }

    private static /* synthetic */ void getHandler$annotations() {
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui$annotations() {
    }
}
