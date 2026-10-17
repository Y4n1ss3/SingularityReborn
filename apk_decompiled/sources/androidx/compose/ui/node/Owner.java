package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.g10;
import defpackage.hm;
import defpackage.iy;
import defpackage.kn;
import defpackage.lu0;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface Owner extends PositionCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z) {
            enableExtraAssertions = z;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    static /* synthetic */ OwnedLayer createLayer$default(Owner owner, my myVar, iy iyVar, GraphicsLayer graphicsLayer, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: createLayer");
            return null;
        }
        if ((i & 4) != 0) {
            graphicsLayer = null;
        }
        return owner.createLayer(myVar, iyVar, graphicsLayer);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z);
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: measureAndLayout");
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        owner.measureAndLayout(z);
    }

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: onRequestMeasure");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        owner.onRequestMeasure(layoutNode, z, z2, z3);
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: onRequestRelayout");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        owner.onRequestRelayout(layoutNode, z, z2);
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo6637calculateLocalPositionMKHz9U(long j);

    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo6638calculatePositionInWindowMKHz9U(long j);

    OwnedLayer createLayer(my myVar, iy iyVar, GraphicsLayer graphicsLayer);

    void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillManager getAutofillManager();

    AutofillTree getAutofillTree();

    Clipboard getClipboard();

    ClipboardManager getClipboardManager();

    kn getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    g10 getLayoutNodes();

    LocaleList getLocaleList();

    long getMeasureIteration();

    ModifierLocalManager getModifierLocalManager();

    default OutOfFrameExecutor getOutOfFrameExecutor() {
        return null;
    }

    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    PointerIconService getPointerIconService();

    RectManager getRectManager();

    RetainedValuesStore getRetainedValuesStore();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    SemanticsOwner getSemanticsOwner();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout(boolean z);

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo6640measureAndLayout0kLqBqw(LayoutNode layoutNode, long j);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    void onInteropViewLayoutChange(View view);

    void onLayoutChange(LayoutNode layoutNode);

    void onLayoutNodeDeactivated(LayoutNode layoutNode);

    void onPostAttach(LayoutNode layoutNode);

    void onPreAttach(LayoutNode layoutNode);

    void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3);

    void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(iy iyVar);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener onLayoutCompletedListener);

    void requestAutofill(LayoutNode layoutNode);

    void requestOnPositionedCallback(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z);

    Object textInputSession(my myVar, hm hmVar);

    @er
    static /* synthetic */ void getFontLoader$annotations() {
    }

    default void decrementKeepScreenOnCount() {
    }

    default void decrementSensitiveComponentCount() {
    }

    default void incrementKeepScreenOnCount() {
    }

    default void incrementSensitiveComponentCount() {
    }

    default void invalidateRootLayer() {
    }

    /* renamed from: dispatchOnScrollChanged-k-4lQ0M, reason: not valid java name */
    default void mo6639dispatchOnScrollChangedk4lQ0M(long j) {
    }

    default void voteFrameRate(float f) {
    }

    default void onPostLayoutNodeReused(LayoutNode layoutNode, int i) {
    }

    default void onPreLayoutNodeReused(LayoutNode layoutNode, int i) {
    }
}
