package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;
    private ky onDragStarted;
    private ky onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private Draggable2DState state;

    public Draggable2DNode(Draggable2DState draggable2DState, ky kyVar, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, ky kyVar2, ky kyVar3) {
        super(kyVar, z, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z2;
        this.reverseDirection = z3;
        this.onDragStarted = kyVar2;
        this.onDragStopped = kyVar3;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    private final long m445reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m4508constructorimpl(j ^ (-9223372034707292160L)) : j;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(my myVar, hm hmVar) {
        Object drag = this.state.drag(MutatePriority.UserInput, new Draggable2DNode$drag$2(myVar, this, null), hmVar);
        return drag == vn.d ? drag : w01.a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo385onDragStartedk4lQ0M(long j) {
        this.onDragStarted.invoke(Offset.m4505boximpl(j));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        this.onDragStopped.invoke(Velocity.m7840boximpl(dragStopped.m417getVelocity9UxMQ8M()));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(Draggable2DState draggable2DState, ky kyVar, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, ky kyVar2, ky kyVar3) {
        boolean z4;
        boolean z5 = true;
        if (q10.b(this.state, draggable2DState)) {
            z4 = false;
        } else {
            this.state = draggable2DState;
            z4 = true;
        }
        if (this.reverseDirection != z3) {
            this.reverseDirection = z3;
        } else {
            z5 = z4;
        }
        this.onDragStarted = kyVar2;
        this.onDragStopped = kyVar3;
        this.startDragImmediately = z2;
        update(kyVar, z, mutableInteractionSource, null, z5);
    }
}
