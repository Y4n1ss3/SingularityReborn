package defpackage;

import android.content.SharedPreferences;
import android.util.Log;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class lo extends us0 implements my {
    public lb0 d;
    public bo e;
    public int f;
    public int g;
    public int h;

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new lo(2, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((lo) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (r1 == r3) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7 A[Catch: all -> 0x0038, TryCatch #3 {all -> 0x0038, blocks: (B:11:0x00a6, B:14:0x00b6, B:16:0x00e7, B:18:0x00ed, B:20:0x010a, B:34:0x0032, B:36:0x0078, B:38:0x0093, B:44:0x007d, B:46:0x0060, B:49:0x0066), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[Catch: all -> 0x0038, TryCatch #3 {all -> 0x0038, blocks: (B:11:0x00a6, B:14:0x00b6, B:16:0x00e7, B:18:0x00ed, B:20:0x010a, B:34:0x0032, B:36:0x0078, B:38:0x0093, B:44:0x007d, B:46:0x0060, B:49:0x0066), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lb0 lb0Var;
        lb0 lb0Var2;
        int i;
        bo boVar;
        int i2;
        Object b;
        lb0 lb0Var3;
        bo boVar2;
        Object i3;
        lb0 lb0Var4;
        SharedPreferences sharedPreferences;
        lb0 lb0Var5;
        vn vnVar = vn.d;
        int i4 = this.h;
        int i5 = 0;
        ?? r8 = 1;
        try {
            if (i4 == 0) {
                p10.Q(obj);
                bo boVar3 = ro.c;
                if (boVar3 != null) {
                    return boVar3;
                }
                ob0 ob0Var = ro.d;
                this.d = ob0Var;
                this.f = 0;
                this.h = 1;
                if (ob0Var.d(this) != vnVar) {
                    lb0Var2 = ob0Var;
                    i = 0;
                }
                return vnVar;
            }
            if (i4 == 1) {
                int i6 = this.f;
                lb0 lb0Var6 = this.d;
                p10.Q(obj);
                i = i6;
                lb0Var2 = lb0Var6;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boVar = this.e;
                    lb0Var = this.d;
                    try {
                        p10.Q(obj);
                        lb0Var5 = lb0Var;
                        i3 = obj;
                        bo boVar4 = (bo) i3;
                        boVar2 = boVar;
                        boVar = boVar4;
                        r8 = lb0Var5;
                        String str = boVar2 == null ? "Detected" : "Falling back to static";
                        Log.d("CpuUtils", str + " CPU topology: " + yi.u0(boVar.a, null, null, null, new ed(29), 31));
                        ro roVar = ro.a;
                        ro.c = boVar;
                        sharedPreferences = ro.g;
                        lb0Var4 = r8;
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            lb0Var4 = r8;
                            if (edit != null) {
                                ro roVar2 = ro.a;
                                SharedPreferences.Editor putString = edit.putString("cpu_topology_cache", yi.u0(boVar.a, "\n", null, null, new ed(25), 30));
                                lb0Var4 = r8;
                                if (putString != null) {
                                    putString.apply();
                                    lb0Var4 = r8;
                                }
                            }
                        }
                        ((ob0) lb0Var4).f(null);
                        return boVar;
                    } catch (Throwable th) {
                        th = th;
                        ((ob0) lb0Var).f(null);
                        throw th;
                    }
                }
                i5 = this.g;
                i2 = this.f;
                lb0Var2 = this.d;
                try {
                    p10.Q(obj);
                    b = obj;
                    lb0Var2 = lb0Var2;
                    boVar = (bo) b;
                    lb0Var3 = lb0Var2;
                } catch (Exception e) {
                    e = e;
                    Log.w("CpuUtils", "CPU topology detection failed: " + e.getMessage());
                    boVar = null;
                    lb0Var3 = lb0Var2;
                    if (boVar == null) {
                    }
                }
                if (boVar == null) {
                    boVar2 = boVar;
                    r8 = lb0Var3;
                    if (boVar2 == null) {
                    }
                    Log.d("CpuUtils", str + " CPU topology: " + yi.u0(boVar.a, null, null, null, new ed(29), 31));
                    ro roVar3 = ro.a;
                    ro.c = boVar;
                    sharedPreferences = ro.g;
                    lb0Var4 = r8;
                    if (sharedPreferences != null) {
                    }
                    ((ob0) lb0Var4).f(null);
                    return boVar;
                }
                ro roVar4 = ro.a;
                this.d = lb0Var3;
                this.e = boVar;
                this.f = i2;
                this.g = i5;
                this.h = 3;
                i3 = roVar4.i(this);
                lb0Var5 = lb0Var3;
            }
            boVar = ro.c;
            lb0Var4 = lb0Var2;
            if (boVar == null) {
                try {
                    ro roVar5 = ro.a;
                    this.d = lb0Var2;
                    this.f = i;
                    this.g = 0;
                    this.h = 2;
                    b = roVar5.b(this);
                } catch (Exception e2) {
                    e = e2;
                    i2 = i;
                    Log.w("CpuUtils", "CPU topology detection failed: " + e.getMessage());
                    boVar = null;
                    lb0Var3 = lb0Var2;
                    if (boVar == null) {
                    }
                }
                if (b != vnVar) {
                    i2 = i;
                    lb0Var2 = lb0Var2;
                    boVar = (bo) b;
                    lb0Var3 = lb0Var2;
                    if (boVar == null) {
                    }
                }
                return vnVar;
            }
            ((ob0) lb0Var4).f(null);
            return boVar;
        } catch (Throwable th2) {
            th = th2;
            lb0Var = r8;
        }
    }
}
