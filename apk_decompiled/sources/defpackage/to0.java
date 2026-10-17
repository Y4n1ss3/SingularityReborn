package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class to0 extends xo0 {
    public final vo0 a;
    public final float b;
    public final float c;

    public to0(vo0 vo0Var, float f, float f2) {
        this.a = vo0Var;
        this.b = f;
        this.c = f2;
    }

    public final float a() {
        vo0 vo0Var = this.a;
        return (float) Math.toDegrees(Math.atan((vo0Var.c - this.c) / (vo0Var.b - this.b)));
    }
}
