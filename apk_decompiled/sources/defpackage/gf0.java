package defpackage;

import android.graphics.PointF;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gf0 {
    public final ff0 a;
    public final PointF[] b;
    public final float c;

    public gf0(ff0 ff0Var, PointF[] pointFArr, float f) {
        this.a = ff0Var;
        this.b = pointFArr;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gf0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gf0 gf0Var = (gf0) obj;
        return this.a == gf0Var.a && Arrays.equals(this.b, gf0Var.b) && this.c == gf0Var.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a.hashCode() * 31) + Arrays.hashCode(this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.a);
        sb.append(", points=");
        String arrays = Arrays.toString(this.b);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", weight=");
        return k4.g(sb, this.c, ')');
    }
}
