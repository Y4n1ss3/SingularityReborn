package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zw implements jw {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ jw e;
    public final /* synthetic */ my f;

    public zw(jw jwVar, my myVar) {
        this.e = jwVar;
        this.f = myVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r2.invoke(r12, r0) == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r13.emit(r12, r0) == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        if (r13 == r4) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    @Override // defpackage.jw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, hm hmVar) {
        yw ywVar;
        Object obj2;
        int i;
        gx gxVar;
        int i2;
        jw jwVar;
        int i3 = this.d;
        w01 w01Var = w01.a;
        my myVar = this.f;
        vn vnVar = vn.d;
        boolean z = true;
        switch (i3) {
            case 0:
                if (hmVar instanceof yw) {
                    ywVar = (yw) hmVar;
                    int i4 = ywVar.f;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ywVar.f = i4 - Integer.MIN_VALUE;
                        obj2 = ywVar.e;
                        i = ywVar.f;
                        if (i != 0) {
                            p10.Q(obj2);
                            ywVar.d = this;
                            ywVar.h = obj;
                            ywVar.f = 1;
                            obj2 = myVar.invoke(obj, ywVar);
                            break;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                this = ywVar.d;
                                p10.Q(obj2);
                                if (z) {
                                    return w01Var;
                                }
                                throw new a(this);
                            }
                            obj = ywVar.h;
                            this = ywVar.d;
                            p10.Q(obj2);
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            jw jwVar2 = this.e;
                            ywVar.d = this;
                            ywVar.h = null;
                            ywVar.f = 2;
                            break;
                        } else {
                            z = false;
                        }
                        if (z) {
                        }
                    }
                }
                ywVar = new yw(this, hmVar);
                obj2 = ywVar.e;
                i = ywVar.f;
                if (i != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
            default:
                if (hmVar instanceof gx) {
                    gxVar = (gx) hmVar;
                    int i5 = gxVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        gxVar.e = i5 - Integer.MIN_VALUE;
                        Object obj3 = gxVar.d;
                        i2 = gxVar.e;
                        if (i2 != 0) {
                            p10.Q(obj3);
                            gxVar.g = obj;
                            jwVar = this.e;
                            gxVar.h = jwVar;
                            gxVar.e = 1;
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    p10.Q(obj3);
                                    return w01Var;
                                }
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            jwVar = gxVar.h;
                            obj = gxVar.g;
                            p10.Q(obj3);
                        }
                        gxVar.g = null;
                        gxVar.h = null;
                        gxVar.e = 2;
                        if (jwVar.emit(obj, gxVar) != vnVar) {
                            return w01Var;
                        }
                        return vnVar;
                    }
                }
                gxVar = new gx(this, hmVar);
                Object obj32 = gxVar.d;
                i2 = gxVar.e;
                if (i2 != 0) {
                }
                gxVar.g = null;
                gxVar.h = null;
                gxVar.e = 2;
                if (jwVar.emit(obj, gxVar) != vnVar) {
                }
                return vnVar;
        }
    }

    public zw(my myVar, jw jwVar) {
        this.f = myVar;
        this.e = jwVar;
    }
}
