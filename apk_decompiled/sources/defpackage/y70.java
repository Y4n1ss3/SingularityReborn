package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.lumi.singularity.ui.activities.MainActivity;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class y70 extends us0 implements my {
    public File d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ cq0 l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ SharedPreferences r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ un u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(boolean z, Context context, cq0 cq0Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, SharedPreferences sharedPreferences, MutableState mutableState6, MutableState mutableState7, un unVar, MutableState mutableState8, MutableState mutableState9, hm hmVar) {
        super(2, hmVar);
        this.j = z;
        this.k = context;
        this.l = cq0Var;
        this.m = mutableState;
        this.n = mutableState2;
        this.o = mutableState3;
        this.p = mutableState4;
        this.q = mutableState5;
        this.r = sharedPreferences;
        this.s = mutableState6;
        this.t = mutableState7;
        this.u = unVar;
        this.v = mutableState8;
        this.w = mutableState9;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new y70(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((y70) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x023c, code lost:
    
        if (r1 != r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bb, code lost:
    
        if (r1 == r12) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g;
        Object H;
        File file;
        String str;
        boolean booleanValue;
        String str2;
        int i;
        Object H2;
        String str3;
        int i2;
        Object H3;
        String str4;
        Intent launchIntentForPackage;
        int i3 = this.i;
        MutableState mutableState = this.o;
        MutableState mutableState2 = this.n;
        Context context = this.k;
        w01 w01Var = w01.a;
        MutableState mutableState3 = this.q;
        vn vnVar = vn.d;
        if (i3 == 0) {
            p10.Q(obj);
            if (((Boolean) this.m.getValue()).booleanValue() && !hr.c() && this.j && !e80.f(mutableState2) && !((Boolean) mutableState.getValue()).booleanValue()) {
                if (!((Boolean) this.p.getValue()).booleanValue()) {
                    mutableState3.setValue(((String) mutableState3.getValue()) + "[*] Waiting for wireless ADB before auto-root...\n");
                    return w01Var;
                }
                ts tsVar = ts.f;
                this.i = 1;
                g = tsVar.g(context, this);
            }
            return w01Var;
        }
        if (i3 == 1) {
            p10.Q(obj);
            g = obj;
        } else if (i3 == 2) {
            str = this.e;
            File file2 = this.d;
            p10.Q(obj);
            H = obj;
            file = file2;
            booleanValue = ((Boolean) H).booleanValue();
            if (booleanValue) {
                mutableState3.setValue(((String) mutableState3.getValue()) + "[!] System did not settle in time — aborting auto-root\n");
                return w01Var;
            }
            mutableState3.setValue(((String) mutableState3.getValue()) + "[*] System settled — continuing auto-root\n");
            str2 = "com.singularity.magisk";
            i = context.getPackageManager().getLaunchIntentForPackage("com.singularity.magisk") != null ? 1 : 0;
            if (i != 0) {
                nq nqVar = nr.a;
                hq hqVar = hq.d;
                x70 x70Var = new x70(file, str, null, 1);
                this.d = file;
                this.e = str;
                this.f = "com.singularity.magisk";
                this.g = booleanValue;
                this.h = i;
                this.i = 3;
                H2 = p01.H(hqVar, x70Var, this);
                if (H2 != vnVar) {
                    str3 = str;
                    i2 = i;
                    if (!ds0.g0((String) H2, ":MAGISK:", false)) {
                    }
                }
                return vnVar;
            }
            nq nqVar2 = nr.a;
            hq hqVar2 = hq.d;
            x70 x70Var2 = new x70(file, str, null, 0);
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = booleanValue;
            this.h = i;
            this.i = 5;
            H3 = p01.H(hqVar2, x70Var2, this);
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    str4 = this.f;
                    p10.Q(obj);
                    launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str4);
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(GroupFlagsKt.IsMovableContentFlag);
                        context.startActivity(launchIntentForPackage);
                        return w01Var;
                    }
                    return w01Var;
                }
                if (i3 != 5) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                H3 = obj;
                if (!((Boolean) H3).booleanValue()) {
                    mutableState3.setValue(((String) mutableState3.getValue()) + "[*] ADB link not usable — skipping auto-root\n");
                    return w01Var;
                }
                e80.h(this.s, 0);
                mutableState2.setValue(Boolean.TRUE);
                MutableState mutableState4 = this.t;
                ku kuVar = (ku) mutableState4.getValue();
                MutableState mutableState5 = this.q;
                i3 i3Var = new i3(mutableState5, 15);
                un unVar = this.u;
                cq0 cq0Var = this.l;
                ((MainActivity) cq0Var).j(context, kuVar, i3Var, new h70(unVar, cq0Var, this.k, this.n, this.s, this.v, mutableState5, this.w, mutableState, mutableState4, 1));
                return w01Var;
            }
            i2 = this.h;
            boolean z = this.g;
            str2 = this.f;
            str3 = this.e;
            file = this.d;
            p10.Q(obj);
            booleanValue = z;
            H2 = obj;
            if (!ds0.g0((String) H2, ":MAGISK:", false)) {
                mutableState3.setValue(((String) mutableState3.getValue()) + "[*] Magisk is running — root on boot skipped\n");
                mutableState3.setValue(((String) mutableState3.getValue()) + "[*] Opening Magisk. Enable root for Singularity, and relaunch Singularity\n");
                this.d = null;
                this.e = null;
                this.f = str2;
                this.g = booleanValue;
                this.h = i2;
                this.i = 4;
                if (y80.p(1500L, this) != vnVar) {
                    str4 = str2;
                    launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str4);
                    if (launchIntentForPackage != null) {
                    }
                    return w01Var;
                }
                return vnVar;
            }
            i = i2;
            str = str3;
            nq nqVar22 = nr.a;
            hq hqVar22 = hq.d;
            x70 x70Var22 = new x70(file, str, null, 0);
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = booleanValue;
            this.h = i;
            this.i = 5;
            H3 = p01.H(hqVar22, x70Var22, this);
        }
        le leVar = (le) g;
        if (leVar != null) {
            Log.d("MainActivity", "BootPanicGuard: ".concat(leVar.b));
            if (leVar.a) {
                mutableState3.setValue(((String) mutableState3.getValue()) + "[!] Kernel Panic detected from previous run. Root on boot disabled. Try again or try changing exploit timing\n");
                this.r.edit().putBoolean("root_on_boot", false).apply();
                return w01Var;
            }
        }
        File file3 = new File(context.getApplicationInfo().nativeLibraryDir, "libadb.so");
        String absolutePath = context.getDir("adb_keys", 0).getAbsolutePath();
        mutableState3.setValue(((String) mutableState3.getValue()) + "[*] Waiting for system to settle before auto-root...\n");
        nq nqVar3 = nr.a;
        hq hqVar3 = hq.d;
        mo moVar = new mo(file3, absolutePath, null);
        this.d = file3;
        this.e = absolutePath;
        this.i = 2;
        H = p01.H(hqVar3, moVar, this);
        if (H != vnVar) {
            file = file3;
            str = absolutePath;
            booleanValue = ((Boolean) H).booleanValue();
            if (booleanValue) {
            }
        }
        return vnVar;
    }
}
