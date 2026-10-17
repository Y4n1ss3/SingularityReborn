package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.hm;
import defpackage.lu0;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DraggableState {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object drag$default(DraggableState draggableState, MutatePriority mutatePriority, my myVar, hm hmVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drag");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return draggableState.drag(mutatePriority, myVar, hmVar);
    }

    void dispatchRawDelta(float f);

    Object drag(MutatePriority mutatePriority, my myVar, hm hmVar);
}
