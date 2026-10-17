package androidx.compose.runtime;

import defpackage.hm;
import defpackage.ny;
import defpackage.p10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RecomposerKt {
    public static final int recomposerKey = 1000;
    private static final Object ProduceAnotherFrame = new Object();
    private static final Object FramePending = new Object();

    private static final long getRecomposerCompoundHashKey() {
        return 1000L;
    }

    public static final <R> Object withRunningRecomposer(ny nyVar, hm hmVar) {
        return p10.n(new RecomposerKt$withRunningRecomposer$2(nyVar, null), hmVar);
    }
}
