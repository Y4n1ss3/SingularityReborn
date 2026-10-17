package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class fx implements jw {
    public final /* synthetic */ jw d;

    public fx(jw jwVar) {
        this.d = jwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.jw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, hm hmVar) {
        ex exVar;
        int i;
        if (hmVar instanceof ex) {
            exVar = (ex) hmVar;
            int i2 = exVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exVar.e = i2 - Integer.MIN_VALUE;
                Object obj2 = exVar.d;
                i = exVar.e;
                if (i != 0) {
                    p10.Q(obj2);
                    if (obj != null) {
                        exVar.e = 1;
                        Object emit = this.d.emit(obj, exVar);
                        vn vnVar = vn.d;
                        if (emit == vnVar) {
                            return vnVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj2);
                }
                return w01.a;
            }
        }
        exVar = new ex(this, hmVar);
        Object obj22 = exVar.d;
        i = exVar.e;
        if (i != 0) {
        }
        return w01.a;
    }
}
