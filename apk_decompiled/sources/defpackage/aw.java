package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class aw {
    public float[] a;
    public int b;

    public final float a(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aw) {
            aw awVar = (aw) obj;
            int i = awVar.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = awVar.a;
                k10 W = y80.W(0, i2);
                int i3 = W.d;
                int i4 = W.e;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            float f = fArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i2++;
        }
        return sb.toString();
    }
}
