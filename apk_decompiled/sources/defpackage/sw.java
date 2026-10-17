package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sw implements iw {
    public final /* synthetic */ int d;
    public final /* synthetic */ iw e;
    public final /* synthetic */ my f;

    public /* synthetic */ sw(iw iwVar, my myVar, int i) {
        this.d = i;
        this.e = iwVar;
        this.f = myVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    @Override // defpackage.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(jw jwVar, hm hmVar) {
        xw xwVar;
        int i;
        zw zwVar;
        a e;
        int i2 = this.d;
        w01 w01Var = w01.a;
        my myVar = this.f;
        iw iwVar = this.e;
        vn vnVar = vn.d;
        switch (i2) {
            case 0:
                Object collect = ((hh) iwVar).collect(new tr(new fi0(), jwVar, (z2) myVar, 1), hmVar);
                return collect == vnVar ? collect : w01Var;
            default:
                if (hmVar instanceof xw) {
                    xwVar = (xw) hmVar;
                    int i3 = xwVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xwVar.e = i3 - Integer.MIN_VALUE;
                        Object obj = xwVar.d;
                        i = xwVar.e;
                        if (i != 0) {
                            p10.Q(obj);
                            zw zwVar2 = new zw(myVar, jwVar);
                            try {
                                xwVar.g = zwVar2;
                                xwVar.e = 1;
                                return iwVar.collect(zwVar2, xwVar) == vnVar ? vnVar : w01Var;
                            } catch (a e2) {
                                zwVar = zwVar2;
                                e = e2;
                            }
                        } else {
                            if (i != 1) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zwVar = xwVar.g;
                            try {
                                p10.Q(obj);
                                return w01Var;
                            } catch (a e3) {
                                e = e3;
                            }
                        }
                        if (e.d != zwVar) {
                            return w01Var;
                        }
                        throw e;
                    }
                }
                xwVar = new xw(this, hmVar);
                Object obj2 = xwVar.d;
                i = xwVar.e;
                if (i != 0) {
                }
                if (e.d != zwVar) {
                }
        }
    }
}
