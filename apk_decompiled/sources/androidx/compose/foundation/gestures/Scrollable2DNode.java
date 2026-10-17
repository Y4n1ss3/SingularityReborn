package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.hm;
import defpackage.i2;
import defpackage.my;
import defpackage.p01;
import defpackage.vn;
import defpackage.w01;
import defpackage.w5;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Scrollable2DNode extends DragGestureNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private final DefaultFlingBehavior defaultFlingBehavior;
    private FlingBehavior flingBehavior;
    private final ScrollableNestedScrollConnection nestedScrollConnection;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private OverscrollEffect overscrollEffect;
    private my scrollByAction;
    private my scrollByOffsetAction;
    private final ScrollableContainerNode scrollableContainerNode;
    private final ScrollingLogic2D scrollingLogic;
    private final boolean shouldAutoInvalidate;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.compose.foundation.gestures.FlingBehavior] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    public Scrollable2DNode(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, boolean z, MutableInteractionSource mutableInteractionSource) {
        super(ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, null);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableContainerNode = (ScrollableContainerNode) delegate(new ScrollableContainerNode(z));
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(ScrollableKt.getUnityDensity()), null, 2, 0 == true ? 1 : 0);
        this.defaultFlingBehavior = defaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        ?? r11 = this.flingBehavior;
        ScrollingLogic2D scrollingLogic2D = new ScrollingLogic2D(scrollable2DState, overscrollEffect2, r11 == 0 ? defaultFlingBehavior : r11, nestedScrollDispatcher, new i2(this, 29));
        this.scrollingLogic = scrollingLogic2D;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic2D, z);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new w5(this, 11);
        this.scrollByOffsetAction = new Scrollable2DNode$setScrollSemanticsActions$2(this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setScrollSemanticsActions$lambda$0(Scrollable2DNode scrollable2DNode, float f, float f2) {
        p01.t(scrollable2DNode.getCoroutineScope(), null, null, new Scrollable2DNode$setScrollSemanticsActions$1$1(scrollable2DNode, f, f2, null), 3);
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

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(my myVar, hm hmVar) {
        Object scroll = this.scrollingLogic.scroll(MutatePriority.UserInput, new Scrollable2DNode$drag$2$1(myVar, null), hmVar);
        return scroll == vn.d ? scroll : w01.a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        updateDefaultFlingBehavior();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        p01.t(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new Scrollable2DNode$onDragStopped$1(this, dragStopped, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) getCanDrag().invoke(PointerType.m6171boximpl(changes.get(i).m6104getTypeT8wyACA()))).booleanValue()) {
                super.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
                return;
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    public final void update(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        boolean z2;
        if (getEnabled() != z) {
            this.nestedScrollConnection.setEnabled(z);
            this.scrollableContainerNode.update(z);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = z2;
        boolean update = this.scrollingLogic.update(scrollable2DState, overscrollEffect, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        DragGestureNode.update$default(this, ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, null, update, 8, null);
        if (z3) {
            clearScrollSemanticsActions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo385onDragStartedk4lQ0M(long j) {
    }
}
