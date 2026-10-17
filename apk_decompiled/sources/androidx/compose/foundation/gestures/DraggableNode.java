package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DraggableNode extends DragGestureNode {
    public static final int $stable = 8;
    private ny onDragStarted;
    private ny onDragStopped;
    private Orientation orientation;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private DraggableState state;

    public DraggableNode(DraggableState draggableState, ky kyVar, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ny nyVar, ny nyVar2, boolean z3) {
        super(kyVar, z, mutableInteractionSource, orientation);
        this.state = draggableState;
        this.orientation = orientation;
        this.startDragImmediately = z2;
        this.onDragStarted = nyVar;
        this.onDragStopped = nyVar2;
        this.reverseDirection = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m453reverseIfNeededAH228Gc(long j) {
        return Velocity.m7855timesadjELrA(j, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m454reverseIfNeededMKHz9U(long j) {
        return Offset.m4523timestuRUvjQ(j, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(my myVar, hm hmVar) {
        Object drag = this.state.drag(MutatePriority.UserInput, new DraggableNode$drag$2(myVar, this, null), hmVar);
        return drag == vn.d ? drag : w01.a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo385onDragStartedk4lQ0M(long j) {
        ny nyVar;
        if (isAttached()) {
            ny nyVar2 = this.onDragStarted;
            nyVar = DraggableKt.NoOpOnDragStarted;
            if (q10.b(nyVar2, nyVar)) {
                return;
            }
            p01.t(getCoroutineScope(), null, xn.g, new DraggableNode$onDragStarted$1(this, j, null), 1);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        ny nyVar;
        if (isAttached()) {
            ny nyVar2 = this.onDragStopped;
            nyVar = DraggableKt.NoOpOnDragStopped;
            if (q10.b(nyVar2, nyVar)) {
                return;
            }
            p01.t(getCoroutineScope(), null, xn.g, new DraggableNode$onDragStopped$1(this, dragStopped, null), 1);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(DraggableState draggableState, ky kyVar, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ny nyVar, ny nyVar2, boolean z3) {
        boolean z4;
        boolean z5 = true;
        if (q10.b(this.state, draggableState)) {
            z4 = false;
        } else {
            this.state = draggableState;
            z4 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z4 = true;
        }
        if (this.reverseDirection != z3) {
            this.reverseDirection = z3;
        } else {
            z5 = z4;
        }
        this.onDragStarted = nyVar;
        this.onDragStopped = nyVar2;
        this.startDragImmediately = z2;
        update(kyVar, z, mutableInteractionSource, orientation, z5);
    }
}
