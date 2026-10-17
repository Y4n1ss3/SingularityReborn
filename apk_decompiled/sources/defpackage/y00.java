package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class y00 extends wf0 {
    public int[] a;
    public int b;

    @Override // defpackage.wf0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.wf0
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.wf0
    public final int d() {
        return this.b;
    }
}
