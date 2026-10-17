package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ow implements iw {
    public final /* synthetic */ ah d;
    public final /* synthetic */ gd0 e;

    public ow(ah ahVar, gd0 gd0Var) {
        this.d = ahVar;
        this.e = gd0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        if (r11.collect(r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        r11 = new defpackage.av0(r10);
        r10 = r10.e;
        r0.g = r10;
        r0.h = null;
        r0.e = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (defpackage.p01.q(r11, r10, r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(jw jwVar, hm hmVar) {
        nw nwVar;
        int i;
        w01 w01Var;
        vn vnVar;
        ek0 ek0Var;
        ek0 ek0Var2;
        try {
            if (hmVar instanceof nw) {
                nwVar = (nw) hmVar;
                int i2 = nwVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nwVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = nwVar.d;
                    i = nwVar.e;
                    w01Var = w01.a;
                    vnVar = vn.d;
                    if (i != 0) {
                        p10.Q(obj);
                        ah ahVar = this.d;
                        nwVar.g = this;
                        nwVar.h = jwVar;
                        nwVar.e = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) nwVar.g;
                                p10.Q(obj);
                                throw th;
                            }
                            if (i != 3) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ek0Var2 = (ek0) nwVar.g;
                            try {
                                p10.Q(obj);
                                ek0Var2.releaseIntercepted();
                                return w01Var;
                            } catch (Throwable th2) {
                                th = th2;
                                ek0Var2.releaseIntercepted();
                                throw th;
                            }
                        }
                        jwVar = nwVar.h;
                        this = (ow) nwVar.g;
                        p10.Q(obj);
                    }
                    ek0Var = new ek0(jwVar, nwVar.getContext());
                    gd0 gd0Var = this.e;
                    nwVar.g = ek0Var;
                    nwVar.h = null;
                    nwVar.e = 3;
                    gd0Var.invoke(ek0Var, null, nwVar);
                    if (w01Var != vnVar) {
                        ek0Var2 = ek0Var;
                        ek0Var2.releaseIntercepted();
                        return w01Var;
                    }
                    return vnVar;
                }
            }
            gd0 gd0Var2 = this.e;
            nwVar.g = ek0Var;
            nwVar.h = null;
            nwVar.e = 3;
            gd0Var2.invoke(ek0Var, null, nwVar);
            if (w01Var != vnVar) {
            }
            return vnVar;
        } catch (Throwable th3) {
            th = th3;
            ek0Var2 = ek0Var;
            ek0Var2.releaseIntercepted();
            throw th;
        }
        nwVar = new nw(this, hmVar);
        Object obj2 = nwVar.d;
        i = nwVar.e;
        w01Var = w01.a;
        vnVar = vn.d;
        if (i != 0) {
        }
        ek0Var = new ek0(jwVar, nwVar.getContext());
    }
}
