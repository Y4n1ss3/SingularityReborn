package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import defpackage.hm;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultTransformableState implements TransformableState {
    private final ny onTransformation;
    private final TransformScope transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
        @Override // androidx.compose.foundation.gestures.TransformScope
        /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
        public void mo408transformByd4ec7I(float f, long j, float f2) {
            DefaultTransformableState.this.getOnTransformation().invoke(Float.valueOf(f), Offset.m4505boximpl(j), Float.valueOf(f2));
        }
    };
    private final MutatorMutex transformMutex = new MutatorMutex();
    private final MutableState<Boolean> isTransformingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public DefaultTransformableState(ny nyVar) {
        this.onTransformation = nyVar;
    }

    public final ny getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object n = p10.n(new DefaultTransformableState$transform$2(this, mutatePriority, myVar, null), hmVar);
        return n == vn.d ? n : w01.a;
    }
}
