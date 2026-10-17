package defpackage;

import androidx.compose.animation.core.AnimationKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ps implements Comparable {
    public static final long d;
    public static final long e;
    public static final /* synthetic */ int f = 0;

    static {
        int i = qs.a;
        d = d41.u(4611686018427387903L);
        e = d41.u(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / AnimationKt.MillisToNanos;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return d41.u(y80.i(j4, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = ((j4 * AnimationKt.MillisToNanos) + (j2 - (j3 * AnimationKt.MillisToNanos))) << 1;
        int i = qs.a;
        return j5;
    }

    public static final boolean b(long j) {
        return j == d || j == e;
    }

    public static final long c(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = qs.a;
        return j2;
    }
}
