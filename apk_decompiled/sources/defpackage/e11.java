package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class e11 extends cq {
    public final Object f;
    public final i11 g;
    public final ts h;

    public e11(Object obj, i11 i11Var, ts tsVar) {
        this.f = obj;
        this.g = i11Var;
        this.h = tsVar;
    }

    @Override // defpackage.cq
    public final cq D(String str, ky kyVar) {
        Object obj = this.f;
        return ((Boolean) kyVar.invoke(obj)).booleanValue() ? this : new cv(obj, str, this.h, this.g);
    }

    @Override // defpackage.cq
    public final Object i() {
        return this.f;
    }
}
