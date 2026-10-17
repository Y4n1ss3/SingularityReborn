package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ba extends us0 implements my {
    public final /* synthetic */ int d;
    public boolean e;
    public int f;
    public final /* synthetic */ Object g;
    public Object h;
    public Object i;
    public Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(boolean z, my myVar, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.d = 3;
        this.e = z;
        this.h = myVar;
        this.g = sharedPreferences;
        this.j = kyVar;
        this.i = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new ba(this.e, (un) this.h, (Context) obj2, (MutableState) this.i, (MutableState) this.j, hmVar, 0);
            case 1:
                return new ba((Context) obj2, hmVar);
            case 2:
                return new ba(this.e, (ky) this.h, (SharedPreferences) obj2, (MutableState) this.i, (MutableState) this.j, hmVar, 2);
            default:
                return new ba(this.e, (my) this.h, (SharedPreferences) obj2, (ky) this.j, (MutableState) this.i, hmVar);
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
        return ((ba) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x024d, code lost:
    
        if (defpackage.zj0.c("\n        setprop persist.ocms.post_nux_default_apps_install_enabled 0\n        am force-stop com.oculus.ocms\n        pm disable com.oculus.ocms/com.oculus.ocms.defaultapps.DefaultAppsNuxOtaReceiver\n        pm disable com.oculus.ocms/com.oculus.ocms.updates.auto.AutoUpdateOnScreenOffAlarmReceiver\n        pm disable com.oculus.ocms/com.oculus.ocms.installer2.service.Installer2StatusReceiver\n        pm disable com.oculus.ocms/com.oculus.ocms.library.service.BinaryCheckUpdateIntentService\n    ", false, r18) == r9) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0269, code lost:
    
        if (defpackage.zj0.c("\n        setprop persist.ocms.post_nux_default_apps_install_enabled 1\n        am force-stop com.oculus.ocms\n        pm enable com.oculus.ocms/com.oculus.ocms.defaultapps.DefaultAppsNuxOtaReceiver\n        pm enable com.oculus.ocms/com.oculus.ocms.updates.auto.AutoUpdateOnScreenOffAlarmReceiver\n        pm enable com.oculus.ocms/com.oculus.ocms.installer2.service.Installer2StatusReceiver\n        pm enable com.oculus.ocms/com.oculus.ocms.library.service.BinaryCheckUpdateIntentService\n    ", false, r18) == r9) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (r1 == r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
    
        if (defpackage.zj0.c(r1, true, r18) == r9) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fa  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File file;
        String str;
        File file2;
        Object c;
        boolean b;
        Object c2;
        Object c3;
        int i = this.d;
        boolean z = false;
        z = false;
        z = false;
        w01 w01Var = w01.a;
        Object obj2 = this.g;
        vn vnVar = vn.d;
        hm hmVar = null;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) this.j;
                int i2 = this.f;
                if (i2 == 0) {
                    p10.Q(obj);
                    if (!this.e) {
                        zj0 zj0Var = zj0.a;
                        this.f = 2;
                        break;
                    } else {
                        zj0 zj0Var2 = zj0.a;
                        this.f = 1;
                        break;
                    }
                } else {
                    if (i2 == 1) {
                        p10.Q(obj);
                        kb.h((un) this.h, (Context) obj2, (MutableState) this.i, mutableState);
                        return w01Var;
                    }
                    if (i2 != 2) {
                        if (i2 == 3) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    nq nqVar = nr.a;
                    rz rzVar = f80.a;
                    aa aaVar = new aa(mutableState, hmVar, z ? 1 : 0);
                    this.f = 3;
                    if (p01.H(rzVar, aaVar, this) != vnVar) {
                        return w01Var;
                    }
                }
                return vnVar;
            case 1:
                Context context = (Context) obj2;
                int i3 = this.f;
                try {
                } catch (Exception e) {
                    Log.e("DomainBlockerManager", "Error applying Magisk hosts module", e);
                }
                if (i3 == 0) {
                    p10.Q(obj);
                    File file3 = new File(context.getCacheDir(), "eh_module");
                    uv.K(file3);
                    file3.mkdirs();
                    hs.b(context, "module", file3);
                    File file4 = new File(file3, "system/etc");
                    file4.mkdirs();
                    File file5 = new File(file4, "hosts");
                    uv.M(file5, hs.a(context));
                    file5.setReadable(true, false);
                    File file6 = new File(context.getCacheDir(), "hosts.zip");
                    if (file6.exists()) {
                        file6.delete();
                    }
                    hs.g(file3, file6);
                    zj0 zj0Var3 = zj0.a;
                    String W = es0.W("\n                    mkdir -p /data/adb/esingularity\n                    cp " + file6.getAbsolutePath() + " /data/adb/singularity/hosts.zip\n                    magisk --install-module /data/adb/singularity/hosts.zip\n                    rm -f /data/adb/modules/singularity-hosts/disable\n                    ");
                    this.h = "/data/adb/modules/singularity-hosts";
                    this.i = file3;
                    this.j = file6;
                    this.f = 1;
                    if (zj0.c(W, true, this) == vnVar) {
                        return vnVar;
                    }
                    file = file6;
                    str = "/data/adb/modules/singularity-hosts";
                    file2 = file3;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z2 = this.e;
                            p10.Q(obj);
                            b = z2;
                            c2 = obj;
                            boolean b2 = q10.b(ds0.E0((String) c2).toString(), "1");
                            if (b && !b2) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                        str = (String) this.h;
                        p10.Q(obj);
                        c = obj;
                        b = q10.b(ds0.E0((String) c).toString(), "1");
                        zj0 zj0Var4 = zj0.a;
                        this.h = null;
                        this.i = null;
                        this.j = null;
                        this.e = b;
                        this.f = 3;
                        c2 = zj0.c("[ -f " + str + "/disable ] && echo 1 || echo 0", true, this);
                        if (c2 == vnVar) {
                            return vnVar;
                        }
                        boolean b22 = q10.b(ds0.E0((String) c2).toString(), "1");
                        if (b) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    file = (File) this.j;
                    file2 = (File) this.i;
                    String str2 = (String) this.h;
                    p10.Q(obj);
                    str = str2;
                }
                uv.K(file2);
                file.delete();
                zj0 zj0Var5 = zj0.a;
                this.h = str;
                this.i = null;
                this.j = null;
                this.f = 2;
                c = zj0.c("[ -d " + str + " ] && echo 1 || echo 0", true, this);
                if (c == vnVar) {
                    return vnVar;
                }
                b = q10.b(ds0.E0((String) c).toString(), "1");
                zj0 zj0Var42 = zj0.a;
                this.h = null;
                this.i = null;
                this.j = null;
                this.e = b;
                this.f = 3;
                c2 = zj0.c("[ -f " + str + "/disable ] && echo 1 || echo 0", true, this);
                if (c2 == vnVar) {
                }
                boolean b222 = q10.b(ds0.E0((String) c2).toString(), "1");
                if (b) {
                }
                return Boolean.valueOf(z);
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    p10.Q(obj);
                    String str3 = this.e ? "FILE=/data/data/com.oculus.vrshell/files/deviceconfig_cache_v2.txt\nWAS_IMMUTABLE=0\ncase \"$(lsattr \"$FILE\" 2>/dev/null | cut -d ' ' -f 1)\" in\n    *i*) WAS_IMMUTABLE=1 ;;\nesac\n[ -e \"$FILE.gamepad-backup\" ] || cp -p \"$FILE\" \"$FILE.gamepad-backup\"\nchattr -i \"$FILE\"\nsed -i '/^oculus_systemshell:emulated_gamepad_shell_enabled,/s/,[^,]*$/,true/' \"$FILE\"\n[ \"$WAS_IMMUTABLE\" = \"0\" ] || chattr +i \"$FILE\"\nam force-stop com.oculus.vrshell\nam startservice -n com.oculus.vrshell/.ShellService" : "FILE=/data/data/com.oculus.vrshell/files/deviceconfig_cache_v2.txt\nWAS_IMMUTABLE=0\ncase \"$(lsattr \"$FILE\" 2>/dev/null | cut -d ' ' -f 1)\" in\n    *i*) WAS_IMMUTABLE=1 ;;\nesac\nchattr -i \"$FILE\"\nsed -i '/^oculus_systemshell:emulated_gamepad_shell_enabled,/s/,[^,]*$/,false/' \"$FILE\"\n[ \"$WAS_IMMUTABLE\" = \"0\" ] || chattr +i \"$FILE\"\nam force-stop com.oculus.vrshell\nam startservice -n com.oculus.vrshell/.ShellService";
                    zj0 zj0Var6 = zj0.a;
                    this.f = 1;
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                p10.Q(obj);
                                return w01Var;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        c3 = obj;
                        boolean b3 = q10.b(ds0.E0((String) c3).toString(), "1");
                        nq nqVar2 = nr.a;
                        rz rzVar2 = f80.a;
                        qz0 qz0Var = new qz0(b3, this.e, (ky) this.h, (SharedPreferences) obj2, (MutableState) this.i, (MutableState) this.j, (hm) null);
                        this.f = 3;
                        if (p01.H(rzVar2, qz0Var, this) != vnVar) {
                            return w01Var;
                        }
                        return vnVar;
                    }
                    p10.Q(obj);
                }
                zj0 zj0Var7 = zj0.a;
                this.f = 2;
                c3 = zj0.c("grep -q '^oculus_systemshell:emulated_gamepad_shell_enabled,true$' /data/data/com.oculus.vrshell/files/deviceconfig_cache_v2.txt 2>/dev/null && echo 1 || echo 0", true, this);
                break;
            default:
                boolean z3 = this.e;
                int i5 = this.f;
                if (i5 == 0) {
                    p10.Q(obj);
                    String str4 = z3 ? "oculuspreferences --setc vrshell_skip_launchcheck_requires_controllers_enabled true\nam force-stop com.oculus.vrshell" : "oculuspreferences --setc vrshell_skip_launchcheck_requires_controllers_enabled false\nam force-stop com.oculus.vrshell";
                    my myVar = (my) this.h;
                    this.f = 1;
                    if (myVar.invoke(str4, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i5 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                ((MutableState) this.i).setValue(Boolean.valueOf(z3));
                ((SharedPreferences) obj2).edit().putBoolean("no_controller_enabled", z3).apply();
                ((ky) this.j).invoke(z3 ? "Controller requirement disabled" : "Controller requirement enabled");
                return w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(Context context, hm hmVar) {
        super(2, hmVar);
        this.d = 1;
        this.g = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba(boolean z, Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = z;
        this.h = obj;
        this.g = obj2;
        this.i = mutableState;
        this.j = mutableState2;
    }
}
