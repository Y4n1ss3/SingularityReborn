package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u31 {
    public final gf a;
    public final float b;

    public u31(Rect rect, float f) {
        this.a = new gf(rect);
        this.b = f;
    }

    public final Rect a() {
        gf gfVar = this.a;
        gfVar.getClass();
        return new Rect(gfVar.a, gfVar.b, gfVar.c, gfVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u31.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        u31 u31Var = (u31) obj;
        return q10.b(this.a, u31Var.a) && this.b == u31Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return k4.g(sb, this.b, ')');
    }

    public u31(gf gfVar, float f) {
        this.a = gfVar;
        this.b = f;
    }
}
