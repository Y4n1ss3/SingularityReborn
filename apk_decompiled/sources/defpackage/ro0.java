package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ro0 {
    public final yo0[] a = new yo0[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final yo0 g = new yo0();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();

    public ro0() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new yo0();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void a(po0 po0Var, float f, RectF rectF, p7 p7Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        yo0[] yo0VarArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr = this.h;
            yo0VarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            hn hnVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? po0Var.f : po0Var.e : po0Var.h : po0Var.g;
            q10 q10Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? po0Var.b : po0Var.a : po0Var.d : po0Var.c;
            yo0 yo0Var = yo0VarArr[i3];
            q10Var.getClass();
            q10Var.p(yo0Var, f, hnVar.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            yo0 yo0Var2 = yo0VarArr[i2];
            fArr[0] = yo0Var2.b;
            fArr[1] = yo0Var2.c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            yo0 yo0Var3 = yo0VarArr[i5];
            yo0Var3.getClass();
            fArr[z] = 0.0f;
            fArr[1] = yo0Var3.a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[z], fArr[1]);
            } else {
                path.lineTo(fArr[z], fArr[1]);
            }
            yo0VarArr[i5].b(matrixArr2[i5], path);
            if (p7Var != null) {
                yo0 yo0Var4 = yo0VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                w80 w80Var = (w80) p7Var.d;
                f2 = 0.0f;
                BitSet bitSet = w80Var.d;
                yo0Var4.getClass();
                bitSet.set(i5, z);
                xo0[] xo0VarArr = w80Var.b;
                yo0Var4.a(yo0Var4.e);
                xo0VarArr[i5] = new so0(new ArrayList(yo0Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            yo0 yo0Var5 = yo0VarArr[i5];
            fArr[0] = yo0Var5.b;
            fArr[1] = yo0Var5.c;
            matrixArr2[i5].mapPoints(fArr);
            yo0 yo0Var6 = yo0VarArr[i7];
            yo0Var6.getClass();
            float[] fArr2 = this.i;
            fArr2[0] = f2;
            fArr2[1] = yo0Var6.a;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            yo0[] yo0VarArr2 = yo0VarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            yo0 yo0Var7 = yo0VarArr2[i5];
            fArr[0] = yo0Var7.b;
            fArr[1] = yo0Var7.c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            yo0 yo0Var8 = this.g;
            yo0Var8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? po0Var.j : po0Var.i : po0Var.l : po0Var.k).getClass();
            yo0Var8.c(max, 0.0f);
            Path path4 = this.j;
            path4.reset();
            yo0Var8.b(matrixArr3[i5], path4);
            if (b(path4, i5) || b(path4, i7)) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = yo0Var8.a;
                matrixArr3[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                yo0Var8.b(matrixArr3[i5], path2);
            } else {
                yo0Var8.b(matrixArr3[i5], path);
            }
            if (p7Var != null) {
                Matrix matrix2 = matrixArr3[i5];
                w80 w80Var2 = (w80) p7Var.d;
                z2 = false;
                w80Var2.d.set(i5 + 4, false);
                xo0[] xo0VarArr2 = w80Var2.c;
                yo0Var8.a(yo0Var8.e);
                xo0VarArr2[i5] = new so0(new ArrayList(yo0Var8.g), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            i5 = i6;
            z = z2;
            yo0VarArr = yo0VarArr2;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
