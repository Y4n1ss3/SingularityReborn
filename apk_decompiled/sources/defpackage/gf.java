package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new gf(0, 0, 0, 0);
    }

    public gf(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            o.k(", right: ", i, i3, "Left must be less than or equal to right, left: ");
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        o.k(", bottom: ", i2, i4, "top must be less than or equal to bottom, top: ");
        throw null;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gf.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gf gfVar = (gf) obj;
        return this.a == gfVar.a && this.b == gfVar.b && this.c == gfVar.c && this.d == gfVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return gf.class.getSimpleName() + " { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gf(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
