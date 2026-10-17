package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pw implements iw {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ pw(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    @Override // defpackage.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(jw jwVar, hm hmVar) {
        vw vwVar;
        int i;
        Object obj;
        a e;
        m mVar;
        int i2;
        ek0 ek0Var;
        Throwable th;
        int i3 = this.d;
        Object obj2 = this.e;
        vn vnVar = vn.d;
        w01 w01Var = w01.a;
        switch (i3) {
            case 0:
                Object collect = ((iw) obj2).collect(new rw(0, new hi0(), jwVar), hmVar);
                return collect == vnVar ? collect : w01Var;
            case 1:
                if (hmVar instanceof vw) {
                    vwVar = (vw) hmVar;
                    int i4 = vwVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        vwVar.e = i4 - Integer.MIN_VALUE;
                        Object obj3 = vwVar.d;
                        i = vwVar.e;
                        if (i != 0) {
                            p10.Q(obj3);
                            Object obj4 = new Object();
                            try {
                                tr trVar = new tr(new hi0(), jwVar, obj4, 2);
                                vwVar.g = obj4;
                                vwVar.e = 1;
                                if (((pw) obj2).collect(trVar, vwVar) == vnVar) {
                                    return vnVar;
                                }
                            } catch (a e2) {
                                obj = obj4;
                                e = e2;
                                if (e.d != obj) {
                                    throw e;
                                }
                                return w01Var;
                            }
                        } else {
                            if (i != 1) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = vwVar.g;
                            try {
                                p10.Q(obj3);
                            } catch (a e3) {
                                e = e3;
                                if (e.d != obj) {
                                }
                                return w01Var;
                            }
                        }
                        return w01Var;
                    }
                }
                vwVar = new vw(this, hmVar);
                Object obj32 = vwVar.d;
                i = vwVar.e;
                if (i != 0) {
                }
                return w01Var;
            default:
                if (hmVar instanceof m) {
                    mVar = (m) hmVar;
                    int i5 = mVar.g;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mVar.g = i5 - Integer.MIN_VALUE;
                        Object obj5 = mVar.e;
                        i2 = mVar.g;
                        if (i2 != 0) {
                            p10.Q(obj5);
                            ek0 ek0Var2 = new ek0(jwVar, mVar.getContext());
                            try {
                                mVar.d = ek0Var2;
                                mVar.g = 1;
                                Object invoke = ((my) obj2).invoke(ek0Var2, mVar);
                                if (invoke != vnVar) {
                                    invoke = w01Var;
                                }
                                if (invoke == vnVar) {
                                    return vnVar;
                                }
                                ek0Var = ek0Var2;
                            } catch (Throwable th2) {
                                ek0Var = ek0Var2;
                                th = th2;
                                ek0Var.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ek0Var = mVar.d;
                            try {
                                p10.Q(obj5);
                            } catch (Throwable th3) {
                                th = th3;
                                ek0Var.releaseIntercepted();
                                throw th;
                            }
                        }
                        ek0Var.releaseIntercepted();
                        return w01Var;
                    }
                }
                mVar = new m(this, hmVar);
                Object obj52 = mVar.e;
                i2 = mVar.g;
                if (i2 != 0) {
                }
                ek0Var.releaseIntercepted();
                return w01Var;
        }
    }
}
