package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class dw {
    public static final /* synthetic */ int a = 0;

    static {
        long[] jArr = ql0.a;
        int d = ql0.d(0);
        int max = d > 0 ? Math.max(7, ql0.c(d)) : 0;
        if (max != 0) {
            int i = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[max];
    }
}
