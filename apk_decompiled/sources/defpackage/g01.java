package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class g01 extends us0 implements my {
    public MutableState d;
    public MutableState e;
    public MutableState f;
    public SharedPreferences g;
    public MutableState h;
    public int i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ SharedPreferences m;
    public final /* synthetic */ MutableState n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SharedPreferences sharedPreferences, MutableState mutableState4, hm hmVar) {
        super(2, hmVar);
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.m = sharedPreferences;
        this.n = mutableState4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0101, code lost:
    
        if (defpackage.p01.H(r0, r9, r1) != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (defpackage.p01.H(r0, r2, r1) == r8) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SharedPreferences sharedPreferences, MutableState mutableState4, bo boVar, im imVar) {
        e01 e01Var;
        Object obj;
        int i;
        vn vnVar;
        MutableState mutableState5;
        MutableState mutableState6;
        SharedPreferences sharedPreferences2;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        SharedPreferences sharedPreferences3;
        MutableState mutableState10;
        MutableState mutableState11;
        MutableState mutableState12;
        SharedPreferences sharedPreferences4;
        String str;
        if (imVar instanceof e01) {
            e01Var = (e01) imVar;
            int i2 = e01Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e01Var.j = i2 - Integer.MIN_VALUE;
                obj = e01Var.i;
                i = e01Var.j;
                int i3 = 2;
                hm hmVar = null;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    nq nqVar = nr.a;
                    rz rzVar = f80.a;
                    w3 w3Var = new w3(boVar, mutableState, hmVar, 8);
                    mutableState5 = mutableState2;
                    e01Var.d = mutableState5;
                    mutableState6 = mutableState3;
                    e01Var.e = mutableState6;
                    sharedPreferences2 = sharedPreferences;
                    e01Var.f = sharedPreferences2;
                    mutableState7 = mutableState4;
                    e01Var.g = mutableState7;
                    e01Var.j = 1;
                } else if (i == 1) {
                    MutableState mutableState13 = e01Var.g;
                    SharedPreferences sharedPreferences5 = e01Var.f;
                    MutableState mutableState14 = e01Var.e;
                    MutableState mutableState15 = e01Var.d;
                    p10.Q(obj);
                    mutableState6 = mutableState14;
                    mutableState5 = mutableState15;
                    mutableState7 = mutableState13;
                    sharedPreferences2 = sharedPreferences5;
                } else {
                    if (i == 2) {
                        MutableState mutableState16 = e01Var.g;
                        sharedPreferences3 = e01Var.f;
                        mutableState9 = e01Var.e;
                        mutableState8 = e01Var.d;
                        p10.Q(obj);
                        mutableState7 = mutableState16;
                        String str2 = (String) obj;
                        ro roVar = ro.a;
                        e01Var.d = mutableState8;
                        e01Var.e = mutableState9;
                        e01Var.f = sharedPreferences3;
                        e01Var.g = mutableState7;
                        e01Var.h = str2;
                        e01Var.j = 3;
                        nq nqVar2 = nr.a;
                        obj = p01.H(hq.d, new z9(i3, 15, hmVar), e01Var);
                        if (obj != vnVar) {
                            mutableState10 = mutableState9;
                            mutableState11 = mutableState7;
                            mutableState12 = mutableState8;
                            sharedPreferences4 = sharedPreferences3;
                            str = str2;
                            List list = (List) obj;
                            nq nqVar3 = nr.a;
                            rz rzVar2 = f80.a;
                            f01 f01Var = new f01(str, list, mutableState12, mutableState10, sharedPreferences4, mutableState11, (hm) null);
                            e01Var.d = null;
                            e01Var.e = null;
                            e01Var.f = null;
                            e01Var.g = null;
                            e01Var.h = null;
                            e01Var.j = 4;
                        }
                        return vnVar;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            p10.Q(obj);
                            return w01.a;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = e01Var.h;
                    MutableState mutableState17 = e01Var.g;
                    SharedPreferences sharedPreferences6 = e01Var.f;
                    MutableState mutableState18 = e01Var.e;
                    MutableState mutableState19 = e01Var.d;
                    p10.Q(obj);
                    mutableState11 = mutableState17;
                    mutableState10 = mutableState18;
                    mutableState12 = mutableState19;
                    str = str3;
                    sharedPreferences4 = sharedPreferences6;
                    List list2 = (List) obj;
                    nq nqVar32 = nr.a;
                    rz rzVar22 = f80.a;
                    f01 f01Var2 = new f01(str, list2, mutableState12, mutableState10, sharedPreferences4, mutableState11, (hm) null);
                    e01Var.d = null;
                    e01Var.e = null;
                    e01Var.f = null;
                    e01Var.g = null;
                    e01Var.h = null;
                    e01Var.j = 4;
                }
                ro roVar2 = ro.a;
                e01Var.d = mutableState5;
                e01Var.e = mutableState6;
                e01Var.f = sharedPreferences2;
                e01Var.g = mutableState7;
                e01Var.j = 2;
                nq nqVar4 = nr.a;
                obj = p01.H(hq.d, new z9(i3, 16, hmVar), e01Var);
                if (obj != vnVar) {
                    MutableState mutableState20 = mutableState6;
                    mutableState8 = mutableState5;
                    mutableState9 = mutableState20;
                    sharedPreferences3 = sharedPreferences2;
                    String str22 = (String) obj;
                    ro roVar3 = ro.a;
                    e01Var.d = mutableState8;
                    e01Var.e = mutableState9;
                    e01Var.f = sharedPreferences3;
                    e01Var.g = mutableState7;
                    e01Var.h = str22;
                    e01Var.j = 3;
                    nq nqVar22 = nr.a;
                    obj = p01.H(hq.d, new z9(i3, 15, hmVar), e01Var);
                    if (obj != vnVar) {
                    }
                }
                return vnVar;
            }
        }
        e01Var = new e01(imVar);
        obj = e01Var.i;
        i = e01Var.j;
        int i32 = 2;
        hm hmVar2 = null;
        vnVar = vn.d;
        if (i != 0) {
        }
        ro roVar22 = ro.a;
        e01Var.d = mutableState5;
        e01Var.e = mutableState6;
        e01Var.f = sharedPreferences2;
        e01Var.g = mutableState7;
        e01Var.j = 2;
        nq nqVar42 = nr.a;
        obj = p01.H(hq.d, new z9(i32, 16, hmVar2), e01Var);
        if (obj != vnVar) {
        }
        return vnVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new g01(this.j, this.k, this.l, this.m, this.n, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((g01) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        if (e(r13.j, r13.k, r13.l, r7, r13.n, r5, r13) == r12) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (r0 == r12) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (e(r5, r0, r2, r3, r4, r1, r13) == r12) goto L28;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        Object e;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        SharedPreferences sharedPreferences;
        Object H;
        int i = this.i;
        SharedPreferences sharedPreferences2 = this.m;
        int i2 = 2;
        hm hmVar = null;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            ro roVar = ro.a;
            MutableState mutableState5 = this.j;
            this.d = mutableState5;
            MutableState mutableState6 = this.k;
            this.e = mutableState6;
            mutableState = this.l;
            this.f = mutableState;
            this.g = sharedPreferences2;
            MutableState mutableState7 = this.n;
            this.h = mutableState7;
            this.i = 1;
            e = ro.e(this);
            if (e != vnVar) {
                mutableState2 = mutableState5;
                mutableState3 = mutableState7;
                mutableState4 = mutableState6;
                sharedPreferences = sharedPreferences2;
            }
            return vnVar;
        }
        if (i == 1) {
            MutableState mutableState8 = this.h;
            SharedPreferences sharedPreferences3 = this.g;
            mutableState = this.f;
            MutableState mutableState9 = this.e;
            MutableState mutableState10 = this.d;
            p10.Q(obj);
            mutableState2 = mutableState10;
            mutableState3 = mutableState8;
            mutableState4 = mutableState9;
            sharedPreferences = sharedPreferences3;
            e = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    return w01.a;
                }
                p10.Q(obj);
                H = obj;
                bo boVar = (bo) H;
                if (boVar != null) {
                    this.d = null;
                    this.i = 4;
                }
                return w01.a;
            }
            p10.Q(obj);
            ro roVar2 = ro.a;
            this.i = 3;
            nq nqVar = nr.a;
            H = p01.H(hq.d, new o3(i2, 5, hmVar), this);
        }
        bo boVar2 = (bo) e;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 2;
    }
}
