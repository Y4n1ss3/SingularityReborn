package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class qa extends us0 implements my {
    public final /* synthetic */ int d = 0;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public Object l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(boolean z, Context context, MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, PackageManager packageManager, MutableState mutableState8, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.g = context;
        this.h = mutableState;
        this.i = mutableState2;
        this.p = sharedPreferences;
        this.j = mutableState3;
        this.k = mutableState4;
        this.l = mutableState5;
        this.m = mutableState6;
        this.n = mutableState7;
        this.q = packageManager;
        this.o = mutableState8;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) this.o;
                return new qa(this.f, this.g, this.h, this.i, (SharedPreferences) obj3, this.j, this.k, (MutableState) this.l, (MutableState) this.m, (MutableState) this.n, (PackageManager) obj2, mutableState, hmVar);
            default:
                MutableState mutableState2 = this.j;
                MutableState mutableState3 = this.k;
                qa qaVar = new qa(this.f, this.g, (ky) obj3, (Animatable) obj2, this.h, this.i, mutableState2, mutableState3, hmVar);
                qaVar.o = obj;
                return qaVar;
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((qa) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r3 == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        if (r0 == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        if (r0 == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        if (defpackage.kb.j(r7, r1, r20) == r10) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
    
        if (defpackage.kb.f(r0, r20.h, r20.i, r3, r20.j, false, r20) == r10) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        Context context;
        MutableState mutableState;
        String str;
        Object H;
        Context context2;
        String str2;
        Object H2;
        a11 a11Var;
        Object H3;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.p;
        MutableState mutableState2 = this.k;
        Object obj3 = this.q;
        vn vnVar = vn.d;
        boolean z = this.f;
        int i2 = 3;
        switch (i) {
            case 0:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj2;
                int i3 = this.e;
                Context context3 = this.g;
                if (i3 == 0) {
                    p10.Q(obj);
                    if (!z) {
                        return w01Var;
                    }
                    this.e = 1;
                    sharedPreferences = sharedPreferences2;
                    context = context3;
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                p10.Q(obj);
                                return w01Var;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        sharedPreferences = sharedPreferences2;
                        context = context3;
                        MutableState mutableState3 = (MutableState) this.o;
                        this.e = 3;
                        if (kb.e(context, (MutableState) this.m, (MutableState) this.n, sharedPreferences, (PackageManager) obj3, mutableState3, false, this) != vnVar) {
                            return w01Var;
                        }
                        return vnVar;
                    }
                    p10.Q(obj);
                    sharedPreferences = sharedPreferences2;
                    context = context3;
                }
                MutableState mutableState4 = (MutableState) this.l;
                this.e = 2;
                break;
            default:
                un unVar = (un) this.o;
                int i4 = this.e;
                Context context4 = this.g;
                MutableState mutableState5 = this.h;
                a11 a11Var2 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                if (i4 == 0) {
                    p10.Q(obj);
                    if (z) {
                        p01.t(unVar, null, null, new y9((Animatable) obj3, objArr3 == true ? 1 : 0, i2), 3);
                    }
                    mutableState5.setValue(Boolean.TRUE);
                    String str3 = "singularity";
                    mutableState = mutableState5;
                    str = "Lumince";
                    if (!q10.b((String) this.i.getValue(), "dev")) {
                        this.o = null;
                        this.l = null;
                        this.m = null;
                        this.e = 3;
                        nq nqVar = nr.a;
                        H = p01.H(hq.d, new f4((Object) str, (Object) str3, (Object) context4, (hm) (objArr == true ? 1 : 0), 9), this);
                        break;
                    } else {
                        this.o = null;
                        this.l = "Lumince";
                        this.m = "singularity";
                        this.e = 1;
                        nq nqVar2 = nr.a;
                        context2 = context4;
                        str2 = "singularity";
                        H2 = p01.H(hq.d, new f4((Object) str, (Object) str2, (Object) context2, (hm) (objArr2 == true ? 1 : 0), 9), this);
                        break;
                    }
                    return vnVar;
                }
                if (i4 == 1) {
                    String str4 = (String) this.m;
                    String str5 = (String) this.l;
                    p10.Q(obj);
                    str2 = str4;
                    context2 = context4;
                    mutableState = mutableState5;
                    H2 = obj;
                    str = str5;
                    a11Var = (a11) H2;
                    this.o = null;
                    this.l = null;
                    this.m = null;
                    this.n = a11Var;
                    this.e = 2;
                    nq nqVar3 = nr.a;
                    H3 = p01.H(hq.d, new f4((Object) str, (Object) str2, (Object) context2, (hm) (objArr4 == true ? 1 : 0), 9), this);
                    break;
                } else if (i4 == 2) {
                    a11Var = (a11) this.n;
                    p10.Q(obj);
                    H3 = obj;
                    mutableState = mutableState5;
                    a11 a11Var3 = (a11) H3;
                    if (a11Var != null || a11Var3 != null) {
                        a11Var2 = (a11Var != null && (a11Var3 == null || !d41.E(a11Var3.a, a11Var.a))) ? a11Var : a11Var3;
                    }
                } else {
                    if (i4 != 3) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    H = obj;
                    mutableState = mutableState5;
                    a11Var2 = (a11) H;
                }
                mutableState.setValue(Boolean.FALSE);
                if (a11Var2 != null) {
                    this.j.setValue(a11Var2);
                    mutableState2.setValue(Boolean.TRUE);
                    return w01Var;
                }
                if (!z) {
                    return w01Var;
                }
                ((ky) obj2).invoke("You are on the latest version");
                return w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(boolean z, Context context, ky kyVar, Animatable animatable, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.g = context;
        this.p = kyVar;
        this.q = animatable;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
        this.k = mutableState4;
    }
}
