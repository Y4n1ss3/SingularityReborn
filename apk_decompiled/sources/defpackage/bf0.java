package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import androidx.graphics.path.PathIteratorPreApi34Impl;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bf0 implements Iterator, n20 {
    public final df0 d;

    public bf0(Path path, int i, float f) {
        path.getClass();
        if (i == 0) {
            throw null;
        }
        this.d = Build.VERSION.SDK_INT >= 34 ? new cf0(path, i, f) : new PathIteratorPreApi34Impl(path, i, f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PointF[] pointFArr;
        PointF[] pointFArr2;
        df0 df0Var = this.d;
        float[] fArr = df0Var.d;
        ff0 c = df0Var.c(fArr, 0);
        if (c == ff0.j) {
            return hf0.a;
        }
        if (c == ff0.i) {
            return hf0.b;
        }
        float f = c == ff0.g ? fArr[6] : 0.0f;
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1])};
        } else if (ordinal == 1) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])};
        } else {
            if (ordinal != 2 && ordinal != 3) {
                pointFArr2 = ordinal != 4 ? new PointF[0] : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])};
                return new gf0(c, pointFArr2, f);
            }
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])};
        }
        pointFArr2 = pointFArr;
        return new gf0(c, pointFArr2, f);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
