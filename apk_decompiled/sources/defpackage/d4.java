package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.util.Log;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.system.TweakService;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class d4 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Object obj, Object obj2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = obj;
        this.g = obj2;
    }

    public static final void e(gg ggVar, un unVar, ji0 ji0Var, NsdManager nsdManager, ConcurrentLinkedQueue concurrentLinkedQueue, AtomicBoolean atomicBoolean) {
        if (concurrentLinkedQueue.isEmpty() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) concurrentLinkedQueue.poll();
        if (nsdServiceInfo == null) {
            atomicBoolean.set(false);
            return;
        }
        try {
            try {
                c4 c4Var = new c4(ggVar, unVar, ji0Var, nsdManager, concurrentLinkedQueue, atomicBoolean);
                ggVar = ggVar;
                unVar = unVar;
                ji0Var = ji0Var;
                nsdManager = nsdManager;
                concurrentLinkedQueue = concurrentLinkedQueue;
                atomicBoolean = atomicBoolean;
                nsdManager.resolveService(nsdServiceInfo, c4Var);
            } catch (Exception unused) {
                ggVar = ggVar;
                unVar = unVar;
                ji0Var = ji0Var;
                nsdManager = nsdManager;
                concurrentLinkedQueue = concurrentLinkedQueue;
                atomicBoolean = atomicBoolean;
                atomicBoolean.set(false);
                e(ggVar, unVar, ji0Var, nsdManager, concurrentLinkedQueue, atomicBoolean);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = 2;
        switch (this.d) {
            case 0:
                d4 d4Var = new d4((NsdManager) this.g, hmVar, 0);
                d4Var.f = obj;
                return d4Var;
            case 1:
                return new d4((String) this.g, hmVar, 1);
            case 2:
                return new d4((Context) this.f, (Intent) this.g, hmVar, i);
            case 3:
                d4 d4Var2 = new d4((bh) this.g, hmVar, 3);
                d4Var2.f = obj;
                return d4Var2;
            case 4:
                d4 d4Var3 = new d4((ch) this.g, hmVar, 4);
                d4Var3.f = obj;
                return d4Var3;
            case 5:
                return new d4(i, hmVar);
            case 6:
                return new d4((ScrollState) this.f, (MutableState) this.g, hmVar, 6);
            case 7:
                d4 d4Var4 = new d4((Context) this.g, hmVar, 7);
                d4Var4.f = obj;
                return d4Var4;
            case 8:
                return new d4((TweakService) this.g, hmVar, 8);
            case 9:
                return new d4((TweakService) this.g, hmVar, 9);
            case 10:
                return new d4((TweakService) this.g, hmVar, 10);
            case 11:
                return new d4((ky) this.f, (MutableState) this.g, hmVar, 11);
            default:
                d4 d4Var5 = new d4((jw) this.g, hmVar, 12);
                d4Var5.f = obj;
                return d4Var5;
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 1:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 2:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 3:
                return ((d4) create((gg0) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 4:
                return ((d4) create((jw) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 5:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 6:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 7:
                return ((d4) create((String) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 8:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 9:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 10:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 11:
                return ((d4) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            default:
                return ((d4) create(obj, (hm) obj2)).invokeSuspend(w01Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x0561, code lost:
    
        if (defpackage.zj0.c(r1, false, r19) != r9) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        if (defpackage.zj0.c(r1, false, r19) == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        if (r4 == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01dc, code lost:
    
        if (defpackage.zj0.c(r2, false, r19) == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a7, code lost:
    
        if (r4 != r9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018f, code lost:
    
        if (r6 == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:
    
        if (r12 == r9) goto L84;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        Object e;
        bo boVar;
        Object h;
        String str;
        Object h2;
        Object i;
        NotificationManager notificationManager;
        String str2;
        long j;
        xe0 xe0Var;
        Long f0;
        Integer e0;
        Object e2;
        Object f;
        String num;
        Object H;
        pz pzVar;
        Object H2;
        Object H3;
        int i2 = this.d;
        int i3 = 3;
        int i4 = 0;
        int i5 = 2;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        hm hmVar = null;
        switch (i2) {
            case 0:
                un unVar = (un) this.f;
                int i6 = this.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                NsdManager nsdManager = (NsdManager) this.g;
                this.f = unVar;
                this.e = 1;
                gg ggVar = new gg(1, d41.C(this));
                ggVar.u();
                ji0 ji0Var = new ji0();
                ji0Var.d = new y3(ggVar, unVar, ji0Var, nsdManager, new ConcurrentLinkedQueue(), new AtomicBoolean(false));
                ggVar.d(new a4(i4, ji0Var, nsdManager));
                try {
                    Object obj2 = ji0Var.d;
                    obj2.getClass();
                    nsdManager.discoverServices("_adb-tls-connect._tcp.", 1, (NsdManager.DiscoveryListener) obj2);
                } catch (Exception unused) {
                    if (ggVar.t() instanceof vc0) {
                        ggVar.resumeWith(null);
                    }
                }
                Object s = ggVar.s();
                return s == vnVar ? vnVar : s;
            case 1:
                String str3 = (String) this.g;
                int i7 = this.e;
                try {
                    if (i7 == 0) {
                        p10.Q(obj);
                        zj0 zj0Var = zj0.a;
                        this.e = 1;
                        c = zj0.c("cat /sdcard/boot_config.json", false, this);
                        if (c == vnVar) {
                            return vnVar;
                        }
                    } else if (i7 == 1) {
                        p10.Q(obj);
                        c = obj;
                    } else if (i7 == 2) {
                        jSONObject2 = (JSONObject) this.f;
                        p10.Q(obj);
                        String jSONObject4 = jSONObject2.toString(4);
                        zj0 zj0Var2 = zj0.a;
                        String str4 = "echo '" + jSONObject4 + "' > /sdcard/boot_config.json";
                        this.f = null;
                        this.e = 3;
                        break;
                    } else {
                        if (i7 != 3) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        Log.d("AppsActivity", "Boot config updated successfully with app: ".concat(str3));
                        return w01Var;
                    }
                    String str5 = (String) c;
                    if (ds0.n0(str5) || ds0.g0(str5, "No such file", false)) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject3 = new JSONObject(str5);
                        } catch (Exception unused2) {
                            jSONObject3 = new JSONObject();
                        }
                        jSONObject = jSONObject3;
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("defaultVrAppSet");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    optJSONObject.put("primaryApplication", new JSONObject().put("component", str3));
                    optJSONObject.put("secondaryApps", new JSONArray());
                    optJSONObject.put("launchPolicy", "first-time");
                    jSONObject.put("defaultVrAppSet", optJSONObject);
                    zj0 zj0Var3 = zj0.a;
                    this.f = jSONObject;
                    this.e = 2;
                    if (zj0.c("oculuspreferences --setc debug_enable_boot_configuration_overrides true", false, this) == vnVar) {
                        return vnVar;
                    }
                    jSONObject2 = jSONObject;
                    String jSONObject42 = jSONObject2.toString(4);
                    zj0 zj0Var22 = zj0.a;
                    String str42 = "echo '" + jSONObject42 + "' > /sdcard/boot_config.json";
                    this.f = null;
                    this.e = 3;
                } catch (Exception e3) {
                    Log.e("AppsActivity", "Failed to update boot config: " + e3.getMessage());
                    return w01Var;
                }
                break;
            case 2:
                int i8 = this.e;
                if (i8 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    if (y80.p(10000L, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i8 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                ((Context) this.f).startActivity((Intent) this.g);
                return w01Var;
            case 3:
                int i9 = this.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                gg0 gg0Var = (gg0) this.f;
                bh bhVar = (bh) this.g;
                this.e = 1;
                return bhVar.e(gg0Var, this) == vnVar ? vnVar : w01Var;
            case 4:
                int i10 = this.e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                jw jwVar = (jw) this.f;
                ch chVar = (ch) this.g;
                this.e = 1;
                return chVar.i(jwVar, this) == vnVar ? vnVar : w01Var;
            case 5:
                int i11 = this.e;
                if (i11 == 0) {
                    p10.Q(obj);
                    ro roVar = ro.a;
                    this.e = 1;
                    e = ro.e(this);
                    if (e == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            String str6 = (String) this.g;
                            p10.Q(obj);
                            str = str6;
                            h2 = obj;
                            return new xe0(str, (String) h2);
                        }
                        boVar = (bo) this.f;
                        p10.Q(obj);
                        h = obj;
                        str = (String) h;
                        ro roVar2 = ro.a;
                        String a = boVar.a().a();
                        this.f = null;
                        this.g = str;
                        this.e = 3;
                        h2 = roVar2.h(a, this);
                        if (h2 == vnVar) {
                            return vnVar;
                        }
                        return new xe0(str, (String) h2);
                    }
                    p10.Q(obj);
                    e = obj;
                }
                boVar = (bo) e;
                ro roVar3 = ro.a;
                String a2 = boVar.b().a();
                this.f = boVar;
                this.e = 2;
                h = roVar3.h(a2, this);
                if (h == vnVar) {
                    return vnVar;
                }
                str = (String) h;
                ro roVar22 = ro.a;
                String a3 = boVar.a().a();
                this.f = null;
                this.g = str;
                this.e = 3;
                h2 = roVar22.h(a3, this);
                if (h2 == vnVar) {
                }
                return new xe0(str, (String) h2);
            case 6:
                int i12 = this.e;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                if (((String) ((MutableState) this.g).getValue()).length() <= 0) {
                    return w01Var;
                }
                ScrollState scrollState = (ScrollState) this.f;
                int maxValue = scrollState.getMaxValue();
                this.e = 1;
                return ScrollState.animateScrollTo$default(scrollState, maxValue, null, this, 2, null) == vnVar ? vnVar : w01Var;
            case 7:
                String str7 = (String) this.f;
                int i13 = this.e;
                if (i13 == 0) {
                    p10.Q(obj);
                    Context context = (Context) this.g;
                    this.f = null;
                    this.e = 1;
                    i = j4.i(context, str7, this);
                    if (i == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i13 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    i = obj;
                }
                String str8 = (String) i;
                return str8 == null ? "[error] Couldn't reach wireless ADB. Enable Wireless Debugging and run Setup With Computer first." : str8;
            case 8:
                TweakService tweakService = (TweakService) this.g;
                int i14 = this.e;
                if (i14 == 0) {
                    p10.Q(obj);
                    Object systemService = tweakService.getSystemService("notification");
                    systemService.getClass();
                    notificationManager = (NotificationManager) systemService;
                    NotificationChannel notificationChannel = new NotificationChannel("charge_notif_channel", "Charging Status", 2);
                    notificationChannel.setDescription("Shows current charging mode and wattage.");
                    notificationManager.createNotificationChannel(notificationChannel);
                } else {
                    if (i14 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    notificationManager = (NotificationManager) this.f;
                    p10.Q(obj);
                }
                while (tweakService.B) {
                    Intent registerReceiver = tweakService.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if ((registerReceiver != null ? registerReceiver.getIntExtra("plugged", 0) : 0) == 0) {
                        xe0Var = new xe0("Not Charging", "");
                    } else {
                        try {
                            str2 = ds0.E0(uv.L(new File("/sys/class/power_supply/battery/charge_type"))).toString();
                        } catch (Exception unused3) {
                            str2 = "";
                        }
                        try {
                            f0 = ks0.f0(ds0.E0(uv.L(new File("/sys/class/power_supply/usb/current_max"))).toString());
                        } catch (Exception unused4) {
                        }
                        if (f0 != null) {
                            j = f0.longValue();
                            double d = (j / 1000000.0d) * 5.0d;
                            String str9 = "Charging";
                            switch (str2.hashCode()) {
                                case 2182268:
                                    if (str2.equals("Fast")) {
                                        if (d < 45.0d) {
                                            if (d >= 18.0d) {
                                                str9 = "Fast Charging";
                                                break;
                                            }
                                        } else {
                                            str9 = "Super Charging";
                                            break;
                                        }
                                    }
                                    break;
                                case 2201263:
                                    if (str2.equals("Full")) {
                                        str9 = "Fully Charged";
                                        break;
                                    }
                                    break;
                                case 80576368:
                                    if (str2.equals("Taper")) {
                                        str9 = "Topping Off";
                                        break;
                                    }
                                    break;
                                case 604646380:
                                    if (str2.equals("Trickle")) {
                                        str9 = "Trickle Charging";
                                        break;
                                    }
                                    break;
                            }
                            xe0Var = new xe0(str9, d > 0.5d ? String.format("%.1f W", Arrays.copyOf(new Object[]{new Double(d)}, 1)) : "");
                        }
                        j = 0;
                        double d2 = (j / 1000000.0d) * 5.0d;
                        String str92 = "Charging";
                        switch (str2.hashCode()) {
                            case 2182268:
                                break;
                            case 2201263:
                                break;
                            case 80576368:
                                break;
                            case 604646380:
                                break;
                        }
                        xe0Var = new xe0(str92, d2 > 0.5d ? String.format("%.1f W", Arrays.copyOf(new Object[]{new Double(d2)}, 1)) : "");
                    }
                    String str10 = (String) xe0Var.d;
                    String str11 = (String) xe0Var.e;
                    xc0 xc0Var = new xc0(tweakService, "charge_notif_channel");
                    xc0Var.e = xc0.b("Charging Status");
                    if (str11.length() > 0) {
                        str10 = str10 + " · " + str11;
                    }
                    xc0Var.f = xc0.b(str10);
                    xc0Var.l.icon = R.drawable.ic_lock_idle_charging;
                    xc0Var.g = -1;
                    xc0Var.c();
                    xc0Var.h = "singularity_charge";
                    Notification a4 = xc0Var.a();
                    a4.getClass();
                    notificationManager.notify(3, a4);
                    this.f = notificationManager;
                    this.e = 1;
                    if (y80.p(5000L, this) == vnVar) {
                        return vnVar;
                    }
                }
                return w01Var;
            case 9:
                TweakService tweakService2 = (TweakService) this.g;
                int i15 = this.e;
                if (i15 == 0) {
                    p10.Q(obj);
                    int i16 = TweakService.T;
                    String string = tweakService2.c().getString("gpu_max_freq_selection", null);
                    e0 = string != null ? ks0.e0(string) : null;
                    pz pzVar2 = pz.a;
                    this.f = e0;
                    this.e = 1;
                    e2 = pz.e(this);
                    break;
                } else if (i15 == 1) {
                    e0 = (Integer) this.f;
                    p10.Q(obj);
                    e2 = obj;
                } else if (i15 == 2) {
                    p10.Q(obj);
                    f = obj;
                    num = (String) f;
                    pz pzVar3 = pz.a;
                    this.f = null;
                    this.e = 3;
                    nq nqVar = nr.a;
                    H = p01.H(hq.d, new qe(num, hmVar, i3), this);
                    break;
                } else {
                    if (i15 != 3) {
                        if (i15 != 4) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        tweakService2.w = true;
                        return w01Var;
                    }
                    p10.Q(obj);
                    H = obj;
                    String str12 = (String) H;
                    File file = tweakService2.N;
                    if (file == null) {
                        q10.H("gpuMaxFreqScriptFile");
                        throw null;
                    }
                    TweakService.b(file, str12);
                    zj0 zj0Var4 = zj0.a;
                    File file2 = tweakService2.N;
                    if (file2 == null) {
                        q10.H("gpuMaxFreqScriptFile");
                        throw null;
                    }
                    String W = es0.W("\n            pkill -f gpu_max_freq_lock.sh || true\n            nohup " + file2.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                    this.f = null;
                    this.e = 4;
                    break;
                }
                List list = (List) e2;
                if (e0 == null || !(list.isEmpty() || list.contains(e0))) {
                    pz pzVar4 = pz.a;
                    this.f = null;
                    this.e = 2;
                    f = pz.f(this);
                    break;
                } else {
                    num = e0.toString();
                    pz pzVar32 = pz.a;
                    this.f = null;
                    this.e = 3;
                    nq nqVar2 = nr.a;
                    H = p01.H(hq.d, new qe(num, hmVar, i3), this);
                }
                break;
            case 10:
                TweakService tweakService3 = (TweakService) this.g;
                int i17 = this.e;
                if (i17 == 0) {
                    p10.Q(obj);
                    pzVar = pz.a;
                    this.f = pzVar;
                    this.e = 1;
                    nq nqVar3 = nr.a;
                    H2 = p01.H(hq.d, new z9(i5, 26, hmVar), this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        tweakService3.v = true;
                        return w01Var;
                    }
                    pzVar = (pz) this.f;
                    p10.Q(obj);
                    H2 = obj;
                }
                String str13 = (String) H2;
                pzVar.getClass();
                str13.getClass();
                String W2 = es0.W("\n            #!/system/bin/sh\n            while true; do\n                echo \"" + str13 + "\" > /sys/class/kgsl/kgsl-3d0/min_clock_mhz\n                sleep 2\n            done\n        ");
                File file3 = tweakService3.M;
                if (file3 == null) {
                    q10.H("gpuMinFreqScriptFile");
                    throw null;
                }
                TweakService.b(file3, W2);
                zj0 zj0Var5 = zj0.a;
                File file4 = tweakService3.M;
                if (file4 == null) {
                    q10.H("gpuMinFreqScriptFile");
                    throw null;
                }
                String W3 = es0.W("\n            pkill -f gpu_min_freq_lock.sh || true\n            nohup " + file4.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                this.f = null;
                this.e = 2;
                break;
            case 11:
                MutableState mutableState = (MutableState) this.g;
                int i18 = this.e;
                if (i18 == 0) {
                    p10.Q(obj);
                    mutableState.setValue(Boolean.TRUE);
                    this.e = 1;
                    nq nqVar4 = nr.a;
                    H3 = p01.H(hq.d, new qe(i5, 10, hmVar), this);
                    if (H3 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i18 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    H3 = obj;
                }
                ((ky) this.f).invoke(((if0) H3).c);
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            default:
                int i19 = this.e;
                if (i19 != 0) {
                    if (i19 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                Object obj3 = this.f;
                jw jwVar2 = (jw) this.g;
                this.e = 1;
                return jwVar2.emit(obj3, this) == vnVar ? vnVar : w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Object obj, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(int i, hm hmVar) {
        super(i, hmVar);
        this.d = 5;
    }
}
