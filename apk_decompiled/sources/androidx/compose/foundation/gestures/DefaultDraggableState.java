package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultDraggableState implements DraggableState {
    private final ky onDelta;
    private final DragScope dragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float f) {
            DefaultDraggableState.this.getOnDelta().invoke(Float.valueOf(f));
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();

    public DefaultDraggableState(ky kyVar) {
        this.onDelta = kyVar;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.onDelta.invoke(Float.valueOf(f));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object n = p10.n(new DefaultDraggableState$drag$2(this, mutatePriority, myVar, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public final ky getOnDelta() {
        return this.onDelta;
    }
}
