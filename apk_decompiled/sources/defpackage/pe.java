package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pe extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe(boolean z, boolean z2, Object obj, Object obj2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = z;
        this.g = z2;
        this.h = obj;
        this.i = obj2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                return new pe((Context) obj2, (SharedPreferences) obj3, this.g, hmVar);
            case 1:
                return new pe(this.f, this.g, (SharedPreferences) obj3, (SnackbarHostState) obj2, hmVar, 1);
            default:
                return new pe(this.f, this.g, (rw0) obj3, (ky) obj2, hmVar, 2);
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
        return ((pe) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (defpackage.p01.H(defpackage.hq.d, new defpackage.jf0(r7, null), r15) == r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default((androidx.compose.material3.SnackbarHostState) r12, "Module installed — rebooting device", null, false, null, r15, 14, null) == r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b1, code lost:
    
        if (defpackage.zj0.c("am start -n com.lumi.singularity/.ui.activities.MainActivity", true, r15) == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a1, code lost:
    
        if (defpackage.y80.p(5000, r15) == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0194, code lost:
    
        if (defpackage.zj0.c("am force-stop com.oculus.systemdriver", true, r15) == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0178, code lost:
    
        if (r1 == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
    
        if (defpackage.y80.p(8000, r15) != r9) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0145, code lost:
    
        if (r6 == r9) goto L84;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object c;
        Object b;
        Intent launchIntentForPackage;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.h;
        vn vnVar = vn.d;
        boolean z2 = this.g;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                SharedPreferences sharedPreferences = (SharedPreferences) obj2;
                switch (this.e) {
                    case 0:
                        p10.Q(obj);
                        z = sharedPreferences.getBoolean("is_unlocked_bootloader", false);
                        if (z2 && z) {
                            zj0 zj0Var = zj0.a;
                            this.f = z;
                            this.e = 1;
                            c = zj0.c("getprop sys.eh.boot_flushed", false, this);
                            break;
                        }
                        this.f = z;
                        this.e = 2;
                        break;
                    case 1:
                        z = this.f;
                        p10.Q(obj);
                        c = obj;
                        if (!q10.b(ds0.E0((String) c).toString(), "1")) {
                            Log.i("BootReceiver", "Passthrough Fix: Waiting for Domain Blocker soft reboot. Skipping this cycle.");
                            break;
                        }
                        this.f = z;
                        this.e = 2;
                        break;
                    case 2:
                        z = this.f;
                        p10.Q(obj);
                        zj0 zj0Var2 = zj0.a;
                        this.f = z;
                        this.e = 3;
                        b = zj0.b(this);
                        break;
                    case 3:
                        z = this.f;
                        p10.Q(obj);
                        b = obj;
                        if (((Boolean) b).booleanValue()) {
                            Log.i("BootReceiver", "Applying Passthrough Fix after system stability check.");
                            zj0 zj0Var3 = zj0.a;
                            this.f = z;
                            this.e = 4;
                            break;
                        }
                        break;
                    case 4:
                        z = this.f;
                        p10.Q(obj);
                        this.f = z;
                        this.e = 5;
                        break;
                    case 5:
                        z = this.f;
                        p10.Q(obj);
                        zj0 zj0Var4 = zj0.a;
                        this.f = z;
                        this.e = 6;
                        break;
                    case 6:
                        p10.Q(obj);
                        String string = sharedPreferences.getString("start_app_on_boot", null);
                        if (string != null && string.length() != 0 && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(string)) != null) {
                            launchIntentForPackage.addFlags(GroupFlagsKt.IsMovableContentFlag);
                            context.startActivity(launchIntentForPackage);
                            break;
                        }
                        break;
                    default:
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
            case 1:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    if (!this.f) {
                        this.e = 4;
                        if (SnackbarHostState.showSnackbar$default((SnackbarHostState) obj3, "Failed to apply hosts file", null, false, null, this, 14, null) != vnVar) {
                        }
                    } else if (z2) {
                        ((SharedPreferences) obj2).edit().putBoolean("cycle_wifi_on_boot", true).apply();
                        this.e = 1;
                        break;
                    } else {
                        this.e = 3;
                        if (SnackbarHostState.showSnackbar$default((SnackbarHostState) obj3, "Blocker enabled & hosts applied", null, false, null, this, 14, null) != vnVar) {
                        }
                    }
                    break;
                } else if (i2 == 1) {
                    p10.Q(obj);
                } else if (i2 != 2 && i2 != 3 && i2 != 4) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                nq nqVar = nr.a;
                hq hqVar = hq.d;
                z9 z9Var = new z9(2, 20, null);
                this.e = 2;
                if (p01.H(hqVar, z9Var, this) != vnVar) {
                }
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    if (this.f) {
                        this.e = 1;
                        nq nqVar2 = nr.a;
                        break;
                    }
                } else if (i3 == 1) {
                    p10.Q(obj);
                } else if (i3 != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                rw0 rw0Var = (rw0) obj2;
                if (z2) {
                    rw0.a(rw0Var, "com.lumi.singularity.START_PERSIST_PROTECT");
                } else {
                    rw0.a(rw0Var, "com.lumi.singularity.STOP_PERSIST_PROTECT");
                }
                nq nqVar3 = nr.a;
                rz rzVar = f80.a;
                bz0 bz0Var = new bz0(5, null, (ky) obj3, z2);
                this.e = 2;
                if (p01.H(rzVar, bz0Var, this) != vnVar) {
                }
                break;
        }
        return vnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(Context context, SharedPreferences sharedPreferences, boolean z, hm hmVar) {
        super(2, hmVar);
        this.d = 0;
        this.h = sharedPreferences;
        this.g = z;
        this.i = context;
    }
}
