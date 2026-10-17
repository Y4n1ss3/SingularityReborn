package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.hm;
import defpackage.lu0;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TransformableState {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object transform$default(TransformableState transformableState, MutatePriority mutatePriority, my myVar, hm hmVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: transform");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return transformableState.transform(mutatePriority, myVar, hmVar);
    }

    boolean isTransformInProgress();

    Object transform(MutatePriority mutatePriority, my myVar, hm hmVar);
}
