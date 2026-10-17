package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.hm;
import defpackage.lu0;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Draggable2DState {
    static /* synthetic */ Object drag$default(Draggable2DState draggable2DState, MutatePriority mutatePriority, my myVar, hm hmVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drag");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return draggable2DState.drag(mutatePriority, myVar, hmVar);
    }

    /* renamed from: dispatchRawDelta-k-4lQ0M */
    void mo403dispatchRawDeltak4lQ0M(long j);

    Object drag(MutatePriority mutatePriority, my myVar, hm hmVar);
}
