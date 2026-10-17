package androidx.graphics.path;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ConicConverter {
    public int a;
    public int b;
    public float[] c;

    private final native int internalConicToQuadratics(float[] fArr, int i, float[] fArr2, float f, float f2);

    public final void a(float f, float f2, float[] fArr, int i) {
        fArr.getClass();
        int internalConicToQuadratics = internalConicToQuadratics(fArr, i, this.c, f, f2);
        this.a = internalConicToQuadratics;
        int i2 = (internalConicToQuadratics * 4) + 2;
        if (i2 > this.c.length) {
            float[] fArr2 = new float[i2];
            this.c = fArr2;
            this.a = internalConicToQuadratics(fArr, i, fArr2, f, f2);
        }
        this.b = 0;
    }

    public final void b(float[] fArr, int i) {
        fArr.getClass();
        int i2 = this.b;
        if (i2 < this.a) {
            int i3 = i2 * 4;
            float[] fArr2 = this.c;
            fArr[i] = fArr2[i3];
            fArr[i + 1] = fArr2[i3 + 1];
            fArr[i + 2] = fArr2[i3 + 2];
            fArr[i + 3] = fArr2[i3 + 3];
            fArr[i + 4] = fArr2[i3 + 4];
            fArr[i + 5] = fArr2[i3 + 5];
            this.b = i2 + 1;
        }
    }
}
