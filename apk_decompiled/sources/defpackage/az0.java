package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class az0 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az0(boolean z, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = z;
        this.g = sharedPreferences;
        this.h = kyVar;
        this.i = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new az0(this.f, this.g, this.h, this.i, hmVar, 0);
            case 1:
                return new az0(this.f, this.g, this.h, this.i, hmVar, 1);
            default:
                return new az0(this.f, this.g, this.h, this.i, hmVar, 2);
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
        return ((az0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r1 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (defpackage.zj0.c(r1, false, r17) == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        if (defpackage.zj0.c(r1, false, r17) == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010f, code lost:
    
        if (r1 == r7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0102, code lost:
    
        if (defpackage.zj0.c(r1, false, r17) == r7) goto L72;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object H;
        int i = this.d;
        w01 w01Var = w01.a;
        boolean z = this.f;
        vn vnVar = vn.d;
        int i2 = 2;
        hm hmVar = null;
        switch (i) {
            case 0:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var = zj0.a;
                    String str = z ? "sed -i '/name=\"com\\.oculus\\.updater\"/{s/enabled=\"1\"/enabled=\"2\"/;s/enabled=\"3\"/enabled=\"2\"/;/enabled=\"[23]\"/!s/first-install-time/enabled=\"2\" first-install-time/}' /data/system/users/0/package-restrictions.xml\nsed -i '/name=\"com\\.oculus\\.updater\"/{s/enabled=\"1\"/enabled=\"2\"/;s/enabled=\"3\"/enabled=\"2\"/;/enabled=\"[23]\"/!s/first-install-time/enabled=\"2\" first-install-time/}' /data/system/users/0/package-restrictions.xml.reservecopy\npm disable --user 0 com.oculus.nux.ota/.NuxOtaIntentService\nsu 1000 -c \"pm disable com.oculus.accountscenter\"\nsettings put global ota_update_server_url \"http://127.0.0.1/\"\nsettings put global ota_download_url \"http://127.0.0.1/\"\noculuspreferences --setc auto_up_defer_time_ms 999999999999\noculuspreferences --setc app_auto_updates_enabled 0\noculuspreferences --setc update_before_shutdown_enabled 0" : "sed -i '/name=\"com\\.oculus\\.updater\"/{s/enabled=\"2\"/enabled=\"1\"/}' /data/system/users/0/package-restrictions.xml\nsed -i '/name=\"com\\.oculus\\.updater\"/{s/enabled=\"2\"/enabled=\"1\"/}' /data/system/users/0/package-restrictions.xml.reservecopy\npm enable --user 0 com.oculus.nux.ota/.NuxOtaIntentService\nsu 1000 -c \"pm enable com.oculus.accountscenter\"\nsettings delete global ota_update_server_url\nsettings delete global ota_download_url\noculuspreferences --setc auto_up_defer_time_ms 2592000000\noculuspreferences --setc app_auto_updates_enabled 1\noculuspreferences --setc update_before_shutdown_enabled 1";
                    this.e = 1;
                    break;
                } else if (i3 == 1) {
                    p10.Q(obj);
                } else if (i3 == 2) {
                    p10.Q(obj);
                    c = obj;
                    boolean b = q10.b(ds0.E0((String) c).toString(), "http://127.0.0.1/");
                    nq nqVar = nr.a;
                    rz rzVar = f80.a;
                    w9 w9Var = new w9(b, this.g, this.h, this.i, null, 1);
                    this.e = 3;
                    if (p01.H(rzVar, w9Var, this) != vnVar) {
                    }
                    break;
                } else if (i3 != 3) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                zj0 zj0Var2 = zj0.a;
                this.e = 2;
                c = zj0.c("settings get global ota_update_server_url 2>/dev/null", false, this);
                break;
            case 1:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    String str2 = z ? "oculuspreferences --setc simultaneous_hands_and_controllers_mode 1" : "oculuspreferences --setc simultaneous_hands_and_controllers_mode 0";
                    zj0 zj0Var3 = zj0.a;
                    this.e = 1;
                    break;
                } else if (i4 == 1) {
                    p10.Q(obj);
                } else if (i4 != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                nq nqVar2 = nr.a;
                rz rzVar2 = f80.a;
                w9 w9Var2 = new w9(this.f, this.g, this.h, this.i, null, 2);
                this.e = 2;
                if (p01.H(rzVar2, w9Var2, this) != vnVar) {
                }
                break;
            default:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var4 = zj0.a;
                    String str3 = z ? hr.c() ? "su 1000 -c \"pm disable --user 0 com.oculus.companion.server/.remotewipe.RemoteWipeJobService\"" : "su 1000 -c \"pm disable --user 0 com.oculus.companion.server/.DisabledDeviceJobService\"\nsu 1000 -c \"pm disable --user 0 com.oculus.companion.server/.RemoteWipeJobService\"\nsu 1000 -c \"pm disable --user 0 com.oculus.companion.server/.WipeReceiver\"" : hr.c() ? "su 1000 -c \"pm enable --user 0 com.oculus.companion.server/.remotewipe.RemoteWipeJobService\"" : "su 1000 -c \"pm enable --user 0 com.oculus.companion.server/.DisabledDeviceJobService\"\nsu 1000 -c \"pm enable --user 0 com.oculus.companion.server/.RemoteWipeJobService\"\nsu 1000 -c \"pm enable --user 0 com.oculus.companion.server/.WipeReceiver\"";
                    this.e = 1;
                    break;
                } else if (i5 == 1) {
                    p10.Q(obj);
                } else if (i5 == 2) {
                    p10.Q(obj);
                    H = obj;
                    zr0 zr0Var = (zr0) H;
                    nq nqVar3 = nr.a;
                    rz rzVar3 = f80.a;
                    g4 g4Var = new g4(zr0Var, this.g, this.h, this.i, null, 3);
                    this.e = 3;
                    if (p01.H(rzVar3, g4Var, this) != vnVar) {
                    }
                    break;
                } else if (i5 != 3) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                ob0 ob0Var = as0.a;
                this.e = 2;
                nq nqVar4 = nr.a;
                H = p01.H(hq.d, new y9(i2, hmVar), this);
                break;
        }
        return vnVar;
    }
}
