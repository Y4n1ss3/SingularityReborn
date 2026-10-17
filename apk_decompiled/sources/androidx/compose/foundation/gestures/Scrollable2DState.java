package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.hm;
import defpackage.lu0;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Scrollable2DState {
    static /* synthetic */ Object scroll$default(Scrollable2DState scrollable2DState, MutatePriority mutatePriority, my myVar, hm hmVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: scroll");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollable2DState.scroll(mutatePriority, myVar, hmVar);
    }

    /* renamed from: canScroll-k-4lQ0M */
    boolean mo405canScrollk4lQ0M(long j);

    /* renamed from: dispatchRawDelta-MK-Hz9U */
    long mo406dispatchRawDeltaMKHz9U(long j);

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar);
}
