package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultScrollable2DState implements Scrollable2DState {
    private final ky onDelta;
    private final Scroll2DScope scrollScope = new Scroll2DScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollable2DState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.Scroll2DScope
        /* renamed from: scrollBy-MK-Hz9U, reason: not valid java name */
        public long mo407scrollByMKHz9U(long j) {
            return (Float.isNaN(Float.intBitsToFloat((int) (j >> 32))) || Float.isNaN(Float.intBitsToFloat((int) (4294967295L & j)))) ? Offset.Companion.m4532getZeroF1C5BW0() : ((Offset) DefaultScrollable2DState.this.getOnDelta().invoke(Offset.m4505boximpl(j))).m4526unboximpl();
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();
    private final MutableState<Boolean> isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public DefaultScrollable2DState(ky kyVar) {
        this.onDelta = kyVar;
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    /* renamed from: canScroll-k-4lQ0M, reason: not valid java name */
    public boolean mo405canScrollk4lQ0M(long j) {
        return true;
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    public long mo406dispatchRawDeltaMKHz9U(long j) {
        return ((Offset) this.onDelta.invoke(Offset.m4505boximpl(j))).m4526unboximpl();
    }

    public final ky getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    public Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object n = p10.n(new DefaultScrollable2DState$scroll$2(this, mutatePriority, myVar, null), hmVar);
        return n == vn.d ? n : w01.a;
    }
}
