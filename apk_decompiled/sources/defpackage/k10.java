package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class k10 extends i10 {
    public static final k10 g = new k10(1, 0, 1);

    public final boolean a(int i) {
        return this.d <= i && i <= this.e;
    }

    @Override // defpackage.i10
    public final boolean equals(Object obj) {
        if (!(obj instanceof k10)) {
            return false;
        }
        if (isEmpty() && ((k10) obj).isEmpty()) {
            return true;
        }
        k10 k10Var = (k10) obj;
        return this.d == k10Var.d && this.e == k10Var.e;
    }

    @Override // defpackage.i10
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.d * 31) + this.e;
    }

    @Override // defpackage.i10
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    @Override // defpackage.i10
    public final String toString() {
        return this.d + ".." + this.e;
    }
}
