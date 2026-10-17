package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.ui.geometry.Offset;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultDraggable2DState implements Draggable2DState {
    private final ky onDelta;
    private final Drag2DScope drag2DScope = new Drag2DScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1
        @Override // androidx.compose.foundation.gestures.Drag2DScope
        /* renamed from: dragBy-k-4lQ0M, reason: not valid java name */
        public void mo404dragByk4lQ0M(long j) {
            DefaultDraggable2DState.this.getOnDelta().invoke(Offset.m4505boximpl(j));
        }
    };
    private final MutatorMutex drag2DMutex = new MutatorMutex();

    public DefaultDraggable2DState(ky kyVar) {
        this.onDelta = kyVar;
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    /* renamed from: dispatchRawDelta-k-4lQ0M, reason: not valid java name */
    public void mo403dispatchRawDeltak4lQ0M(long j) {
        this.onDelta.invoke(Offset.m4505boximpl(j));
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    public Object drag(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object n = p10.n(new DefaultDraggable2DState$drag$2(this, mutatePriority, myVar, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public final ky getOnDelta() {
        return this.onDelta;
    }
}
