package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ur implements iw {
    public final iw d;
    public final ky e;
    public final my f;

    public ur(iw iwVar, ky kyVar, my myVar) {
        this.d = iwVar;
        this.e = kyVar;
        this.f = myVar;
    }

    @Override // defpackage.iw
    public final Object collect(jw jwVar, hm hmVar) {
        ji0 ji0Var = new ji0();
        ji0Var.d = y80.e;
        Object collect = this.d.collect(new tr(this, ji0Var, jwVar), hmVar);
        return collect == vn.d ? collect : w01.a;
    }
}
