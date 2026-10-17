package defpackage;

import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class b80 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b80(int i, int i2, hm hmVar) {
        super(i, hmVar);
        this.d = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new b80(2, 0, hmVar);
            case 1:
                return new b80(2, 1, hmVar);
            case 2:
                return new b80(2, 2, hmVar);
            case 3:
                return new b80(2, 3, hmVar);
            case 4:
                return new b80(2, 4, hmVar);
            case 5:
                return new b80(2, 5, hmVar);
            case 6:
                return new b80(2, 6, hmVar);
            case 7:
                return new b80(2, 7, hmVar);
            case 8:
                return new b80(2, 8, hmVar);
            case 9:
                return new b80(2, 9, hmVar);
            case 10:
                return new b80(2, 10, hmVar);
            case 11:
                return new b80(2, 11, hmVar);
            default:
                return new b80(2, 12, hmVar);
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
        return ((b80) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x026c, code lost:
    
        if (r12 == r5) goto L143;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = 2;
        vn vnVar = vn.d;
        hm hmVar = null;
        switch (i) {
            case 0:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    Process.setThreadPriority(10);
                    zj0 zj0Var = zj0.a;
                    this.e = 1;
                    nq nqVar = nr.a;
                    Object H = p01.H(hq.d, new yj0(i2, i2, hmVar), this);
                    if (H != vnVar) {
                        H = w01Var;
                    }
                    if (H == vnVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            case 1:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    nq nqVar2 = nr.a;
                    if (p01.H(hq.d, new b80(i2, i2, hmVar), this) == vnVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            case 2:
                int i5 = this.e;
                try {
                    if (i5 == 0) {
                        p10.Q(obj);
                        zj0 zj0Var2 = zj0.a;
                        this.e = 1;
                        obj = zj0.c("dumpsys package com.oculus.panelapp.settings | grep -m1 'reason='", false, this);
                        if (obj == vnVar) {
                            break;
                        }
                    } else if (i5 == 1) {
                        p10.Q(obj);
                    } else if (i5 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        p10.Q(obj);
                        Log.i("MainActivity", "Settings dexopt fix result: " + ((String) obj));
                        break;
                    }
                    String str = (String) obj;
                    if (ds0.g0(str, "reason=bg-dexopt", false)) {
                        Log.i("MainActivity", "Settings app dexopt state is bg-dexopt - resetting (" + str + ")");
                        zj0 zj0Var3 = zj0.a;
                        this.e = 2;
                        obj = zj0.c("pm compile --reset com.oculus.panelapp.settings\nam force-stop com.oculus.panelapp.settings", false, this);
                        break;
                    }
                } catch (Exception e) {
                    return new Integer(Log.e("MainActivity", "Settings dexopt fix check failed", e));
                }
                break;
            case 3:
                int i6 = this.e;
                if (i6 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var4 = zj0.a;
                    this.e = 1;
                    obj = zj0.c("magisk_path=$(magisk --path 2>/dev/null)\nfor DEXDIR in /data/adb/modules \"$magisk_path/.magisk/modules\"; do\n  [ -d \"$DEXDIR/zygisk_vector\" ] && { echo \"$DEXDIR/zygisk_vector/cli\"; exit 0; }\ndone", false, this);
                    if (obj == vnVar) {
                    }
                } else if (i6 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                }
                String obj2 = ds0.E0((String) obj).toString();
                if (!ds0.n0(obj2)) {
                }
                break;
            case 4:
                int i7 = this.e;
                if (i7 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var5 = zj0.a;
                    this.e = 1;
                    obj = zj0.c("getprop ro.dalvik.vm.native.bridge", false, this);
                    if (obj == vnVar) {
                    }
                } else if (i7 == 1) {
                    p10.Q(obj);
                } else if (i7 != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                if (!ds0.g0(ds0.E0((String) obj).toString(), "libzygisk.so", false)) {
                    break;
                } else {
                    zj0 zj0Var6 = zj0.a;
                    this.e = 2;
                    obj = zj0.c("for z in zygote64 zygote; do\n  for pid in $(pgrep -f $z 2>/dev/null); do\n    grep -q libzygisk.so /proc/$pid/maps 2>/dev/null && { echo yes; exit 0; }\n  done\ndone", false, this);
                    if (obj == vnVar) {
                    }
                }
                break;
            case 5:
                int i8 = this.e;
                if (i8 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var7 = zj0.a;
                    this.e = 1;
                    obj = zj0.c("ls -1 /data/adb/modules_update 2>/dev/null", false, this);
                    if (obj == vnVar) {
                    }
                } else if (i8 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                }
                vv vvVar = new vv(new wv(new br(ds0.q0((CharSequence) obj), new hz(25), 3), true, new hz(26)));
                if (!vvVar.hasNext()) {
                    break;
                } else {
                    Object next = vvVar.next();
                    if (!vvVar.hasNext()) {
                        break;
                    } else {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.add(next);
                        while (vvVar.hasNext()) {
                            linkedHashSet.add(vvVar.next());
                        }
                        break;
                    }
                }
            case 6:
                int i9 = this.e;
                if (i9 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var8 = zj0.a;
                    this.e = 1;
                    obj = zj0.c("blockdev --getro /dev/block/bootdevice/by-name/persist", false, this);
                    if (obj == vnVar) {
                    }
                } else if (i9 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                }
                String obj3 = ds0.E0((String) obj).toString();
                if (!q10.b(obj3, "1")) {
                    if (q10.b(obj3, "0")) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 7:
                int i10 = this.e;
                if (i10 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var9 = zj0.a;
                    this.e = 1;
                    Object b = zj0.b(this);
                    if (b == vnVar) {
                        break;
                    }
                } else if (i10 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            case 8:
                int i11 = this.e;
                if (i11 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var10 = zj0.a;
                    this.e = 1;
                    if (zj0.c("pkill -f rgb_led.sh || true\npkill -f custom_led.sh || true\npkill -f power_led.sh || true\npkill -f min_freq_lock.sh || true\npkill -f max_freq_lock.sh || true\npkill -f gpu_min_freq_lock.sh || true\npkill -f gpu_max_freq_lock.sh || true\npkill -f fan_override.sh || true\npkill -f charge_limit.sh || true\necho 0 > /sys/class/power_supply/battery/input_suspend 2>/dev/null || true\npkill -f usb_interceptor.sh || true\npkill -f ota_blocker.sh || true\npkill -f ovr_loader_override.sh || true\npkill -f frida-server || true\npkill -f hide_mc2.sh || true\nrm -f /data/local/tmp/hide_mc2.pid || true", true, this) == vnVar) {
                        break;
                    }
                } else if (i11 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            case 9:
                int i12 = this.e;
                if (i12 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var11 = zj0.a;
                    this.e = 1;
                    Object b2 = zj0.b(this);
                    if (b2 == vnVar) {
                        break;
                    }
                } else if (i12 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            case 10:
                int i13 = this.e;
                if (i13 == 0) {
                    p10.Q(obj);
                    ro roVar = ro.a;
                    this.e = 1;
                    nq nqVar3 = nr.a;
                    Object H2 = p01.H(hq.d, new jo(2, null), this);
                    if (H2 == vnVar) {
                        break;
                    }
                } else if (i13 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            case 11:
                int i14 = this.e;
                if (i14 == 0) {
                    p10.Q(obj);
                    pz pzVar = pz.a;
                    this.e = 1;
                    nq nqVar4 = nr.a;
                    Object H3 = p01.H(hq.d, new x2(i2, hmVar), this);
                    if (H3 == vnVar) {
                        break;
                    }
                } else if (i14 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            default:
                int i15 = this.e;
                if (i15 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var12 = zj0.a;
                    this.e = 1;
                    if (zj0.c("pkill -f rgb_led.sh; pkill -f power_led.sh", false, this) == vnVar) {
                        break;
                    }
                } else if (i15 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
        }
        return vnVar;
    }
}
