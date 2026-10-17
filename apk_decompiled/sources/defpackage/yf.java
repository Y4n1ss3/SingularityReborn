package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yf extends bh {
    public final o3 g;
    public final o3 h;

    public yf(o3 o3Var, kn knVar, int i, mf mfVar) {
        super(knVar, i, mfVar);
        this.g = o3Var;
        this.h = o3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(gg0 gg0Var, hm hmVar) {
        xf xfVar;
        int i;
        if (hmVar instanceof xf) {
            xfVar = (xf) hmVar;
            int i2 = xfVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xfVar.g = i2 - Integer.MIN_VALUE;
                Object obj = xfVar.e;
                i = xfVar.g;
                w01 w01Var = w01.a;
                if (i != 0) {
                    p10.Q(obj);
                    xfVar.d = gg0Var;
                    xfVar.g = 1;
                    Object invoke = this.g.invoke(gg0Var, xfVar);
                    vn vnVar = vn.d;
                    if (invoke != vnVar) {
                        invoke = w01Var;
                    }
                    if (invoke == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gg0Var = xfVar.d;
                    p10.Q(obj);
                }
                if (!gg0Var.g.v()) {
                    return w01Var;
                }
                o.f("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        xfVar = new xf(this, (im) hmVar);
        Object obj2 = xfVar.e;
        i = xfVar.g;
        w01 w01Var2 = w01.a;
        if (i != 0) {
        }
        if (!gg0Var.g.v()) {
        }
    }

    @Override // defpackage.bh
    public final bh f(kn knVar, int i, mf mfVar) {
        return new yf(this.h, knVar, i, mfVar);
    }

    @Override // defpackage.bh
    public final String toString() {
        return "block[" + this.g + "] -> " + super.toString();
    }
}
