package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ch extends bh {
    public final iw g;

    public ch(iw iwVar, kn knVar, int i, mf mfVar) {
        super(knVar, i, mfVar);
        this.g = iwVar;
    }

    @Override // defpackage.bh, defpackage.iw
    public final Object collect(jw jwVar, hm hmVar) {
        int i = this.e;
        vn vnVar = vn.d;
        if (i == -3) {
            kn context = hmVar.getContext();
            Boolean bool = Boolean.FALSE;
            bl blVar = new bl(23);
            kn knVar = this.d;
            kn plus = !((Boolean) knVar.fold(bool, blVar)).booleanValue() ? context.plus(knVar) : p01.l(context, knVar, false);
            if (q10.b(plus, context)) {
                Object i2 = i(jwVar, hmVar);
                if (i2 == vnVar) {
                    return i2;
                }
            } else {
                ts tsVar = ts.i;
                if (q10.b(plus.get(tsVar), context.get(tsVar))) {
                    kn context2 = hmVar.getContext();
                    if (!(jwVar instanceof zn0) && !(jwVar instanceof uc0)) {
                        jwVar = new tr(jwVar, context2);
                    }
                    Object I = p01.I(plus, jwVar, y80.U(plus), new d4(this, null, 4), hmVar);
                    if (I == vnVar) {
                        return I;
                    }
                }
            }
            return w01.a;
        }
        Object collect = super.collect(jwVar, hmVar);
        if (collect == vnVar) {
            return collect;
        }
        return w01.a;
    }

    @Override // defpackage.bh
    public final Object e(gg0 gg0Var, hm hmVar) {
        Object i = i(new zn0(gg0Var), hmVar);
        return i == vn.d ? i : w01.a;
    }

    public abstract Object i(jw jwVar, hm hmVar);

    @Override // defpackage.bh
    public final String toString() {
        return this.g + " -> " + super.toString();
    }
}
