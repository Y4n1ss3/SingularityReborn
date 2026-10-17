package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class is extends wf0 {
    public double[] a;
    public int b;

    @Override // defpackage.wf0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.wf0
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.wf0
    public final int d() {
        return this.b;
    }
}
