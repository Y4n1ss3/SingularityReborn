package defpackage;

import android.util.Log;
import androidx.compose.animation.core.AnimationKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class qe extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe(String str, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = 2;
        switch (this.d) {
            case 0:
                return new qe(this.f, hmVar, 0);
            case 1:
                return new qe(this.f, hmVar, 1);
            case 2:
                return new qe(i, i, hmVar);
            case 3:
                return new qe(this.f, hmVar, 3);
            case 4:
                return new qe(this.f, hmVar, 4);
            case 5:
                return new qe(this.f, hmVar, 5);
            case 6:
                return new qe(this.f, hmVar, 6);
            case 7:
                return new qe(this.f, hmVar, 7);
            case 8:
                return new qe(this.f, hmVar, 8);
            case 9:
                return new qe(this.f, hmVar, 9);
            case 10:
                return new qe(i, 10, hmVar);
            case 11:
                return new qe(this.f, hmVar, 11);
            default:
                return new qe(this.f, hmVar, 12);
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
        return ((qe) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x043a, code lost:
    
        if (r0 == r7) goto L200;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        String str;
        Object c;
        Object f;
        long longValue;
        Object H;
        Object c2;
        Object c3;
        Object c4;
        Object c5;
        Object H2;
        Object c6;
        Object c7;
        String str2;
        String concat;
        Object obj2;
        String str3;
        Long f0;
        Object e2;
        Object e3;
        int i = this.d;
        int i2 = 3;
        int i3 = 2;
        vn vnVar = vn.d;
        hm hmVar = null;
        switch (i) {
            case 0:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    String d = uo.d("monkey -p ", this.f, " -c android.intent.category.LAUNCHER 1");
                    zj0 zj0Var = zj0.a;
                    this.e = 1;
                    if (zj0.c(d, false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i4 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
            case 1:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    ro roVar = ro.a;
                    this.e = 1;
                    e = ro.e(this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            p10.Q(obj);
                            return obj;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    e = obj;
                }
                String u0 = yi.u0(((bo) e).a, "\n", null, null, new wd(this.f, 9), 30);
                zj0 zj0Var2 = zj0.a;
                this.e = 2;
                Object c8 = zj0.c(u0, false, this);
                if (c8 != vnVar) {
                    return c8;
                }
                return vnVar;
            case 2:
                int i6 = this.e;
                try {
                } catch (Exception e4) {
                    Log.e("DomainBlockerManager", "Error disabling Magisk hosts module", e4);
                }
                if (i6 == 0) {
                    p10.Q(obj);
                    str = "/data/adb/modules/singularity-hosts";
                    zj0 zj0Var3 = zj0.a;
                    String W = es0.W("\n                touch /data/adb/modules/singularity-hosts/disable\n                rm -f /data/adb/modules/singularity-hosts/update\n                ");
                    this.f = "/data/adb/modules/singularity-hosts";
                    this.e = 1;
                    if (zj0.c(W, true, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        c = obj;
                        r5 = q10.b(ds0.E0((String) c).toString(), "1");
                        return Boolean.valueOf(r5);
                    }
                    str = this.f;
                    p10.Q(obj);
                }
                zj0 zj0Var4 = zj0.a;
                this.f = null;
                this.e = 2;
                c = zj0.c("[ -f " + str + "/disable ] && echo 1 || echo 0", true, this);
                if (c == vnVar) {
                    return vnVar;
                }
                r5 = q10.b(ds0.E0((String) c).toString(), "1");
                return Boolean.valueOf(r5);
            case 3:
                int i7 = this.e;
                if (i7 == 0) {
                    p10.Q(obj);
                    Long f02 = ks0.f0(this.f);
                    if (f02 != null) {
                        longValue = f02.longValue();
                        long j = AnimationKt.MillisToNanos * longValue;
                        return es0.W("\n            #!/system/bin/sh\n            while true; do\n                echo \"" + longValue + "\" > /sys/class/kgsl/kgsl-3d0/max_clock_mhz 2>/dev/null\n                echo \"" + j + "\" > " + pz.i + " 2>/dev/null\n                echo \"" + j + "\" > " + pz.j + " 2>/dev/null\n                sleep 2\n            done\n        ");
                    }
                    pz pzVar = pz.a;
                    this.e = 1;
                    f = pz.f(this);
                    if (f == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i7 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    f = obj;
                }
                longValue = Long.parseLong((String) f);
                long j2 = AnimationKt.MillisToNanos * longValue;
                return es0.W("\n            #!/system/bin/sh\n            while true; do\n                echo \"" + longValue + "\" > /sys/class/kgsl/kgsl-3d0/max_clock_mhz 2>/dev/null\n                echo \"" + j2 + "\" > " + pz.i + " 2>/dev/null\n                echo \"" + j2 + "\" > " + pz.j + " 2>/dev/null\n                sleep 2\n            done\n        ");
            case 4:
                int i8 = this.e;
                if (i8 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    nq nqVar = nr.a;
                    H = p01.H(hq.d, new b80(i3, i2, hmVar), this);
                    if (H == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        c2 = obj;
                        String str4 = (String) c2;
                        return Boolean.valueOf(!ds0.g0(str4, "\"success\":true", false) || ds0.g0(str4, "\"success\": true", false));
                    }
                    p10.Q(obj);
                    H = obj;
                }
                String str5 = (String) H;
                if (str5 == null) {
                    return Boolean.FALSE;
                }
                zj0 zj0Var5 = zj0.a;
                String str6 = str5 + " modules enable " + this.f + " --json";
                this.e = 2;
                c2 = zj0.c(str6, false, this);
                if (c2 == vnVar) {
                    return vnVar;
                }
                String str42 = (String) c2;
                return Boolean.valueOf(!ds0.g0(str42, "\"success\":true", false) || ds0.g0(str42, "\"success\": true", false));
            case 5:
                int i9 = this.e;
                if (i9 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var6 = zj0.a;
                    String d2 = uo.d("grep '^version=' /data/adb/modules/", this.f, "/module.prop 2>/dev/null | cut -d= -f2-");
                    this.e = 1;
                    c3 = zj0.c(d2, false, this);
                    if (c3 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i9 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    c3 = obj;
                }
                String obj3 = ds0.E0((String) c3).toString();
                if (!ds0.n0(obj3)) {
                    return obj3;
                }
                return null;
            case 6:
                int i10 = this.e;
                if (i10 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var7 = zj0.a;
                    String d3 = uo.d("test -f /data/adb/modules/", this.f, "/disable && echo disabled");
                    this.e = 1;
                    c4 = zj0.c(d3, false, this);
                    if (c4 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i10 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    c4 = obj;
                }
                return Boolean.valueOf(!q10.b(ds0.E0((String) c4).toString(), "disabled"));
            case 7:
                int i11 = this.e;
                if (i11 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var8 = zj0.a;
                    String d4 = uo.d("test -d /data/adb/modules/", this.f, " && echo yes");
                    this.e = 1;
                    c5 = zj0.c(d4, false, this);
                    if (c5 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i11 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    c5 = obj;
                }
                return Boolean.valueOf(q10.b(ds0.E0((String) c5).toString(), "yes"));
            case 8:
                int i12 = this.e;
                if (i12 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    nq nqVar2 = nr.a;
                    H2 = p01.H(hq.d, new b80(i3, i2, hmVar), this);
                    if (H2 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        c6 = obj;
                        return Boolean.valueOf(ds0.g0((String) c6, this.f, false));
                    }
                    p10.Q(obj);
                    H2 = obj;
                }
                String str7 = (String) H2;
                if (str7 == null) {
                    return Boolean.FALSE;
                }
                zj0 zj0Var9 = zj0.a;
                String concat2 = str7.concat(" modules ls -e --json");
                this.e = 2;
                c6 = zj0.c(concat2, false, this);
                if (c6 == vnVar) {
                    return vnVar;
                }
                return Boolean.valueOf(ds0.g0((String) c6, this.f, false));
            case 9:
                int i13 = this.e;
                if (i13 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var10 = zj0.a;
                    String d5 = uo.d("unzip -p \"", this.f, "\" module.prop 2>/dev/null");
                    this.e = 1;
                    c7 = zj0.c(d5, false, this);
                    if (c7 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i13 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    c7 = obj;
                }
                Iterator it = ds0.q0((String) c7).iterator();
                while (true) {
                    if (it.hasNext()) {
                        str2 = ds0.E0((String) it.next()).toString();
                        if (ks0.c0(str2, "id=", false)) {
                        }
                    } else {
                        str2 = null;
                    }
                }
                if (str2 != null) {
                    return ds0.E0(ds0.x0(str2, "id=", str2)).toString();
                }
                return null;
            case 10:
                int i14 = this.e;
                if (i14 == 0) {
                    p10.Q(obj);
                    concat = "/sdcard/".concat("persist-" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + ".img");
                    zj0 zj0Var11 = zj0.a;
                    String d6 = uo.d("dd if=/dev/block/bootdevice/by-name/persist of=", concat, " bs=4096");
                    this.f = concat;
                    this.e = 1;
                    if (zj0.c(d6, false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = this.f;
                        p10.Q(obj);
                        obj2 = obj;
                        f0 = ks0.f0(ds0.E0((String) obj2).toString());
                        if (f0 != null || f0.longValue() <= 0) {
                            return new if0(null, "Backup failed — no file was written", false);
                        }
                        return new if0(str3, "Backup saved to " + str3 + " (" + f0 + " bytes)", true);
                    }
                    concat = this.f;
                    p10.Q(obj);
                }
                zj0 zj0Var12 = zj0.a;
                String c9 = uo.c("stat -c %s ", concat);
                this.f = concat;
                this.e = 2;
                Object c10 = zj0.c(c9, false, this);
                if (c10 == vnVar) {
                    return vnVar;
                }
                String str8 = concat;
                obj2 = c10;
                str3 = str8;
                f0 = ks0.f0(ds0.E0((String) obj2).toString());
                if (f0 != null) {
                }
                return new if0(null, "Backup failed — no file was written", false);
            case 11:
                int i15 = this.e;
                try {
                    if (i15 == 0) {
                        p10.Q(obj);
                        zj0 zj0Var13 = zj0.a;
                        String str9 = this.f;
                        wj0 wj0Var = wj0.e;
                        this.e = 1;
                        e2 = zj0Var13.e(str9, wj0Var, false, this);
                        if (e2 == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i15 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        e2 = obj;
                    }
                    return (String) e2;
                } catch (Exception e5) {
                    Log.e("RootUtils", "runAsRootMonitor failed: " + e5.getMessage());
                    return uo.c("Execution failed: ", e5.getMessage());
                }
            default:
                int i16 = this.e;
                try {
                    if (i16 == 0) {
                        p10.Q(obj);
                        zj0 zj0Var14 = zj0.a;
                        String str10 = this.f;
                        wj0 wj0Var2 = wj0.g;
                        this.e = 1;
                        e3 = zj0Var14.e(str10, wj0Var2, false, this);
                        if (e3 == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i16 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        e3 = obj;
                    }
                    return (String) e3;
                } catch (Exception e6) {
                    Log.e("RootUtils", "runAsRootStatus failed: " + e6.getMessage());
                    return uo.c("Execution failed: ", e6.getMessage());
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe(int i, int i2, hm hmVar) {
        super(i, hmVar);
        this.d = i2;
    }
}
