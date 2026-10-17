package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ka0 extends aw {
    public final void b(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            fArr = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            this.a = fArr;
        }
        int i2 = this.b;
        fArr[i2] = f;
        this.b = i2 + 1;
    }
}
