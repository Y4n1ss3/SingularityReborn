package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class tr implements jw {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;
    public final Object g;

    public tr(jw jwVar, kn knVar) {
        this.d = 3;
        this.f = knVar;
        this.g = y80.U(knVar);
        this.e = new d4(jwVar, null, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r8.emit(r14, r0) == r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
    
        if (r13.emit(r14, r0) == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00af, code lost:
    
        if (((defpackage.jw) r8).emit(r14, r0) == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        if (r15 == r7) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010c  */
    @Override // defpackage.jw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, hm hmVar) {
        sr srVar;
        int i;
        tw twVar;
        int i2;
        ww wwVar;
        int i3;
        int i4 = this.d;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        Object obj2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i4) {
            case 0:
                ji0 ji0Var = (ji0) obj3;
                ur urVar = (ur) obj4;
                if (hmVar instanceof sr) {
                    srVar = (sr) hmVar;
                    int i5 = srVar.f;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        srVar.f = i5 - Integer.MIN_VALUE;
                        Object obj5 = srVar.d;
                        i = srVar.f;
                        if (i != 0) {
                            p10.Q(obj5);
                            Object invoke = urVar.e.invoke(obj);
                            Object obj6 = ji0Var.d;
                            if (obj6 == y80.e || !((Boolean) urVar.f.invoke(obj6, invoke)).booleanValue()) {
                                ji0Var.d = invoke;
                                srVar.f = 1;
                                if (((jw) obj2).emit(obj, srVar) == vnVar) {
                                    return vnVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            p10.Q(obj5);
                        }
                        return w01Var;
                    }
                }
                srVar = new sr(this, hmVar);
                Object obj52 = srVar.d;
                i = srVar.f;
                if (i != 0) {
                }
                return w01Var;
            case 1:
                if (hmVar instanceof tw) {
                    twVar = (tw) hmVar;
                    int i6 = twVar.h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        twVar.h = i6 - Integer.MIN_VALUE;
                        Object obj7 = twVar.f;
                        i2 = twVar.h;
                        if (i2 != 0) {
                            p10.Q(obj7);
                            if (!((fi0) obj4).d) {
                                twVar.d = this;
                                twVar.e = obj;
                                twVar.h = 2;
                                obj7 = ((z2) obj3).invoke(obj, twVar);
                                break;
                            } else {
                                twVar.h = 1;
                                break;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    obj = twVar.e;
                                    this = twVar.d;
                                    p10.Q(obj7);
                                    if (!((Boolean) obj7).booleanValue()) {
                                        ((fi0) this.f).d = true;
                                        jw jwVar = (jw) this.e;
                                        twVar.d = null;
                                        twVar.e = null;
                                        twVar.h = 3;
                                        break;
                                    }
                                    return w01Var;
                                }
                                if (i2 != 3) {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            p10.Q(obj7);
                            return w01Var;
                        }
                        return vnVar;
                    }
                }
                twVar = new tw(this, hmVar);
                Object obj72 = twVar.f;
                i2 = twVar.h;
                if (i2 != 0) {
                }
                return vnVar;
            case 2:
                if (hmVar instanceof ww) {
                    wwVar = (ww) hmVar;
                    int i7 = wwVar.f;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        wwVar.f = i7 - Integer.MIN_VALUE;
                        Object obj8 = wwVar.d;
                        i3 = wwVar.f;
                        if (i3 != 0) {
                            p10.Q(obj8);
                            hi0 hi0Var = (hi0) obj4;
                            int i8 = hi0Var.d + 1;
                            hi0Var.d = i8;
                            jw jwVar2 = (jw) obj2;
                            if (i8 < 1) {
                                wwVar.f = 1;
                                break;
                            } else {
                                wwVar.f = 2;
                                d41.w(jwVar2, obj, obj3, wwVar);
                            }
                            return vnVar;
                        }
                        if (i3 != 1 && i3 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj8);
                        return w01Var;
                    }
                }
                wwVar = new ww(this, hmVar);
                Object obj82 = wwVar.d;
                i3 = wwVar.f;
                if (i3 != 0) {
                }
                return w01Var;
            default:
                Object I = p01.I((kn) obj4, obj, obj3, (d4) obj2, hmVar);
                return I == vnVar ? I : w01Var;
        }
    }

    public /* synthetic */ tr(Serializable serializable, jw jwVar, Object obj, int i) {
        this.d = i;
        this.f = serializable;
        this.e = jwVar;
        this.g = obj;
    }

    public tr(ur urVar, ji0 ji0Var, jw jwVar) {
        this.d = 0;
        this.f = urVar;
        this.g = ji0Var;
        this.e = jwVar;
    }
}
