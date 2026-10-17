package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.hm;
import defpackage.iy;
import defpackage.mb0;
import defpackage.my;
import defpackage.p01;
import defpackage.vn;
import defpackage.w01;
import defpackage.w5;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, OnScrollChangedDispatcher {
    public static final int $stable = 8;
    private final ContentInViewNode contentInViewNode;
    private final ScrollableDefaultFlingBehavior defaultFlingBehavior;
    private FlingBehavior flingBehavior;
    private final FocusTargetModifierNode focusTargetModifierNode;
    private MouseWheelScrollingLogic mouseWheelScrollingLogic;
    private final ScrollableNestedScrollConnection nestedScrollConnection;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private OverscrollEffect overscrollEffect;
    private my scrollByAction;
    private my scrollByOffsetAction;
    private final ScrollableContainerNode scrollableContainerNode;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.gestures.FlingBehavior] */
    public ScrollableNode(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        super(ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, orientation);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableContainerNode = (ScrollableContainerNode) delegate(new ScrollableContainerNode(z));
        ScrollableDefaultFlingBehavior platformScrollableDefaultFlingBehavior = Scrollable_androidKt.platformScrollableDefaultFlingBehavior();
        this.defaultFlingBehavior = platformScrollableDefaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        ?? r1 = this.flingBehavior;
        ScrollableDefaultFlingBehavior scrollableDefaultFlingBehavior = r1 == 0 ? platformScrollableDefaultFlingBehavior : r1;
        final int i = 0;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState, overscrollEffect2, scrollableDefaultFlingBehavior, orientation, z2, nestedScrollDispatcher, this, new iy(this) { // from class: xl0
            public final /* synthetic */ ScrollableNode e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                boolean isAttached;
                Rect contentInViewNode$lambda$0;
                int i2 = i;
                ScrollableNode scrollableNode = this.e;
                switch (i2) {
                    case 0:
                        isAttached = scrollableNode.isAttached();
                        return Boolean.valueOf(isAttached);
                    default:
                        contentInViewNode$lambda$0 = ScrollableNode.contentInViewNode$lambda$0(scrollableNode);
                        return contentInViewNode$lambda$0;
                }
            }
        });
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        this.focusTargetModifierNode = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m4426FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m4451getNeverLCbbffg(), null, 2, null));
        final int i2 = 1;
        ContentInViewNode contentInViewNode = (ContentInViewNode) delegate(new ContentInViewNode(orientation, scrollingLogic, z2, bringIntoViewSpec, new iy(this) { // from class: xl0
            public final /* synthetic */ ScrollableNode e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                boolean isAttached;
                Rect contentInViewNode$lambda$0;
                int i22 = i2;
                ScrollableNode scrollableNode = this.e;
                switch (i22) {
                    case 0:
                        isAttached = scrollableNode.isAttached();
                        return Boolean.valueOf(isAttached);
                    default:
                        contentInViewNode$lambda$0 = ScrollableNode.contentInViewNode$lambda$0(scrollableNode);
                        return contentInViewNode$lambda$0;
                }
            }
        }));
        this.contentInViewNode = contentInViewNode;
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(new BringIntoViewResponderNode(contentInViewNode));
        if (ComposeFoundationFlags.isKeepInViewFocusObservationChangeEnabled) {
            return;
        }
        delegate(new FocusedBoundsObserverNode(new mb0(this, 14)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$0(ScrollableNode scrollableNode, LayoutCoordinates layoutCoordinates) {
        scrollableNode.contentInViewNode.onFocusBoundsChanged(layoutCoordinates);
        return w01.a;
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect contentInViewNode$lambda$0(ScrollableNode scrollableNode) {
        return FocusTargetModifierNodeKt.getFocusedRect(scrollableNode.focusTargetModifierNode);
    }

    private final void ensureMouseWheelScrollNodeInitialized() {
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic == null) {
            mouseWheelScrollingLogic = new MouseWheelScrollingLogic(this.scrollingLogic, AndroidScrollable_androidKt.platformScrollConfig(this), new ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(this), DelegatableNodeKt.requireDensity(this));
            this.mouseWheelScrollingLogic = mouseWheelScrollingLogic;
        }
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.startReceivingMouseWheelEvents(getCoroutineScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped(ScrollableNode scrollableNode, long j, hm hmVar) {
        scrollableNode.m535onWheelScrollStoppedTH1AsA0(j);
        return w01.a;
    }

    /* renamed from: onWheelScrollStopped-TH1AsA0, reason: not valid java name */
    private final void m535onWheelScrollStoppedTH1AsA0(long j) {
        p01.t(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onWheelScrollStopped$1(this, j, null), 3);
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new w5(this, 12);
        this.scrollByOffsetAction = new ScrollableNode$setScrollSemanticsActions$2(this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setScrollSemanticsActions$lambda$0(ScrollableNode scrollableNode, float f, float f2) {
        p01.t(scrollableNode.getCoroutineScope(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(scrollableNode, f, f2, null), 3);
        return true;
    }

    private final void updateDefaultFlingBehavior() {
        if (isAttached()) {
            this.defaultFlingBehavior.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            setScrollSemanticsActions();
        }
        my myVar = this.scrollByAction;
        if (myVar != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, myVar, 1, null);
        }
        my myVar2 = this.scrollByOffsetAction;
        if (myVar2 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, myVar2);
        }
    }

    @Override // androidx.compose.foundation.gestures.OnScrollChangedDispatcher
    /* renamed from: dispatchScrollDeltaInfo-k-4lQ0M */
    public void mo494dispatchScrollDeltaInfok4lQ0M(long j) {
        if (isAttached()) {
            DelegatableNodeKt.m6411dispatchOnScrollChangedUv8p0NA(this, j);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(my myVar, hm hmVar) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object scroll = scrollingLogic.scroll(MutatePriority.UserInput, new ScrollableNode$drag$2$1(myVar, scrollingLogic, null), hmVar);
        return scroll == vn.d ? scroll : w01.a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        p01.t(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onDragStopped$1(dragStopped, this, null), 3);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo196onKeyEventZmokQxo(KeyEvent keyEvent) {
        long m4508constructorimpl;
        if (!getEnabled()) {
            return false;
        }
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if ((!Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5811getPageDownEK5gGoQ()) && !Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), companion.m5812getPageUpEK5gGoQ())) || !KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5929getKeyDownCS__XNY()) || KeyEvent_androidKt.m5936isCtrlPressedZmokQxo(keyEvent)) {
            return false;
        }
        boolean isVertical = this.scrollingLogic.isVertical();
        ContentInViewNode contentInViewNode = this.contentInViewNode;
        if (isVertical) {
            int m402getViewportSizeYbymL2g$foundation = (int) (contentInViewNode.m402getViewportSizeYbymL2g$foundation() & 4294967295L);
            m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), companion.m5812getPageUpEK5gGoQ()) ? m402getViewportSizeYbymL2g$foundation : -m402getViewportSizeYbymL2g$foundation) & 4294967295L));
        } else {
            int m402getViewportSizeYbymL2g$foundation2 = (int) (contentInViewNode.m402getViewportSizeYbymL2g$foundation() >> 32);
            m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), companion.m5812getPageUpEK5gGoQ()) ? m402getViewportSizeYbymL2g$foundation2 : -m402getViewportSizeYbymL2g$foundation2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        p01.t(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, m4508constructorimpl, null), 3);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) getCanDrag().invoke(PointerType.m6171boximpl(changes.get(i).m6104getTypeT8wyACA()))).booleanValue()) {
                super.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
                break;
            }
            i++;
        }
        if (getEnabled()) {
            if (pointerEventPass == PointerEventPass.Initial && PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), PointerEventType.Companion.m6056getScroll7fucELk())) {
                ensureMouseWheelScrollNodeInitialized();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.m484onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
            }
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo198onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    public final void update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z3;
        if (getEnabled() != z) {
            this.nestedScrollConnection.setEnabled(z);
            this.scrollableContainerNode.update(z);
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = z3;
        boolean update = this.scrollingLogic.update(scrollableState, orientation, overscrollEffect, z2, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.update(orientation, z2, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        update(ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, this.scrollingLogic.isVertical() ? Orientation.Vertical : Orientation.Horizontal, update);
        if (z4) {
            clearScrollSemanticsActions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo385onDragStartedk4lQ0M(long j) {
    }
}
