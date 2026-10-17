package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rw implements jw {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rw(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    @Override // defpackage.jw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, hm hmVar) {
        qw qwVar;
        int i;
        cx cxVar;
        Object obj2;
        int i2;
        int i3 = this.d;
        w01 w01Var = w01.a;
        Object obj3 = this.e;
        vn vnVar = vn.d;
        switch (i3) {
            case 0:
                if (hmVar instanceof qw) {
                    qwVar = (qw) hmVar;
                    int i4 = qwVar.f;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qwVar.f = i4 - Integer.MIN_VALUE;
                        Object obj4 = qwVar.d;
                        i = qwVar.f;
                        if (i == 0) {
                            if (i == 1) {
                                p10.Q(obj4);
                                return w01Var;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj4);
                        hi0 hi0Var = (hi0) obj3;
                        int i5 = hi0Var.d;
                        if (i5 < 1) {
                            hi0Var.d = i5 + 1;
                            return w01Var;
                        }
                        jw jwVar = (jw) this.f;
                        qwVar.f = 1;
                        return jwVar.emit(obj, qwVar) == vnVar ? vnVar : w01Var;
                    }
                }
                qwVar = new qw(this, hmVar);
                Object obj42 = qwVar.d;
                i = qwVar.f;
                if (i == 0) {
                }
            default:
                if (hmVar instanceof cx) {
                    cxVar = (cx) hmVar;
                    int i6 = cxVar.f;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        cxVar.f = i6 - Integer.MIN_VALUE;
                        obj2 = cxVar.e;
                        i2 = cxVar.f;
                        if (i2 != 0) {
                            p10.Q(obj2);
                            cxVar.d = this;
                            cxVar.h = obj;
                            cxVar.f = 1;
                            obj2 = ((my) obj3).invoke(obj, cxVar);
                            if (obj2 == vnVar) {
                                return vnVar;
                            }
                        } else {
                            if (i2 != 1) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = cxVar.h;
                            this = cxVar.d;
                            p10.Q(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return w01Var;
                        }
                        ((ji0) this.f).d = obj;
                        throw new a(this);
                    }
                }
                cxVar = new cx(this, hmVar);
                obj2 = cxVar.e;
                i2 = cxVar.f;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
        }
    }
}
