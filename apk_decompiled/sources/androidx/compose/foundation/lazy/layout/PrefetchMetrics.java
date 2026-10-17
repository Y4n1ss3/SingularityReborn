package androidx.compose.foundation.lazy.layout;

import defpackage.fb0;
import defpackage.ql0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrefetchMetrics {
    public static final int $stable = 8;
    private final fb0 averagesByContentType;
    private Averages lastUsedAverage;
    private Object lastUsedContentType;

    public PrefetchMetrics() {
        long[] jArr = ql0.a;
        this.averagesByContentType = new fb0();
    }

    public final Averages getAverage(Object obj) {
        Averages averages = this.lastUsedAverage;
        if (this.lastUsedContentType == obj && averages != null) {
            return averages;
        }
        fb0 fb0Var = this.averagesByContentType;
        Object d = fb0Var.d(obj);
        if (d == null) {
            d = new Averages();
            fb0Var.l(obj, d);
        }
        Averages averages2 = (Averages) d;
        this.lastUsedContentType = obj;
        this.lastUsedAverage = averages2;
        return averages2;
    }
}
