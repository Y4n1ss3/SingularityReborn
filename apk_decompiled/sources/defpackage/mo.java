package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mo extends us0 implements my {
    public final /* synthetic */ int d = 0;
    public int e;
    public int f;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(rw0 rw0Var, ky kyVar, int i, hm hmVar) {
        super(2, hmVar);
        this.g = rw0Var;
        this.h = kyVar;
        this.f = i;
    }

    public static final String e(File file, String str, String str2) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath(), "-s", "127.0.0.1:5555", "shell", "getprop", str2);
            Map<String, String> environment = processBuilder.environment();
            environment.getClass();
            environment.put("HOME", str);
            Map<String, String> environment2 = processBuilder.environment();
            environment2.getClass();
            environment2.put("ANDROID_SDK_HOME", str);
            Map<String, String> environment3 = processBuilder.environment();
            environment3.getClass();
            environment3.put("ADB_VENDOR_KEYS", str + "/.android/adbkey");
            Map<String, String> environment4 = processBuilder.environment();
            environment4.getClass();
            environment4.put("ADB_SERVER_SOCKET", "tcp:15037");
            Map<String, String> environment5 = processBuilder.environment();
            environment5.getClass();
            environment5.put("ANDROID_ADB_LOG_PATH", str + "/adb_daemon.log");
            Process start = processBuilder.redirectErrorStream(true).start();
            InputStream inputStream = start.getInputStream();
            inputStream.getClass();
            String obj = ds0.E0(p01.z(new BufferedReader(new InputStreamReader(inputStream, rh.a), 8192))).toString();
            start.waitFor();
            return obj;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new mo(2, hmVar);
            case 1:
                return new mo((File) this.g, (String) this.h, hmVar);
            default:
                return new mo((rw0) this.g, (ky) this.h, this.f, hmVar);
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
        return ((mo) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:17:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0128 -> B:39:0x012b). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bo boVar;
        Iterator it;
        int i;
        int i2;
        int i3 = this.d;
        vn vnVar = vn.d;
        boolean z = true;
        switch (i3) {
            case 0:
                int i4 = this.f;
                if (i4 == 0) {
                    p10.Q(obj);
                    ro roVar = ro.a;
                    this.f = 1;
                    obj = ro.e(this);
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            boVar = (bo) this.g;
                            p10.Q(obj);
                            if (q10.b((String) obj, "performance")) {
                                return Boolean.FALSE;
                            }
                            List o0 = yi.o0(boVar.a, 1);
                            if (!o0.isEmpty()) {
                                it = o0.iterator();
                                i = 0;
                                if (it.hasNext()) {
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                        if (i4 != 3) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = this.e;
                        it = (Iterator) this.h;
                        p10.Q(obj);
                        if (!q10.b(obj, "performance")) {
                            z = false;
                            return Boolean.valueOf(z);
                        }
                        if (it.hasNext()) {
                            zn znVar = (zn) it.next();
                            ro roVar2 = ro.a;
                            String a = znVar.a();
                            this.g = null;
                            this.h = it;
                            this.e = i;
                            this.f = 3;
                            obj = roVar2.h(a, this);
                            if (obj == vnVar) {
                                return vnVar;
                            }
                            if (!q10.b(obj, "performance")) {
                            }
                            if (it.hasNext()) {
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                    p10.Q(obj);
                }
                boVar = (bo) obj;
                ro roVar3 = ro.a;
                String a2 = boVar.b().a();
                this.g = boVar;
                this.f = 2;
                obj = roVar3.h(a2, this);
                if (obj == vnVar) {
                    return vnVar;
                }
                if (q10.b((String) obj, "performance")) {
                }
            case 1:
                String str = (String) this.h;
                File file = (File) this.g;
                int i5 = this.f;
                if (i5 == 0) {
                    p10.Q(obj);
                    i2 = 1;
                    if (i2 < 91) {
                    }
                } else {
                    if (i5 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.e;
                    p10.Q(obj);
                    i2++;
                    if (i2 < 91) {
                        String e = e(file, str, "sys.boot_completed");
                        String e2 = e(file, str, "init.svc.insmod_sh");
                        if (q10.b(e, "1") && (e2.length() == 0 || e2.equals("stopped"))) {
                            return Boolean.TRUE;
                        }
                        this.e = i2;
                        this.f = 1;
                        if (y80.p(1000L, this) == vnVar) {
                            return vnVar;
                        }
                        i2++;
                        if (i2 < 91) {
                            return Boolean.FALSE;
                        }
                    }
                }
                break;
            default:
                int i6 = this.e;
                if (i6 == 0) {
                    p10.Q(obj);
                    rw0.a((rw0) this.g, "com.lumi.singularity.SET_CHARGE_LIMIT");
                    nq nqVar = nr.a;
                    rz rzVar = f80.a;
                    lz0 lz0Var = new lz0(this.f, null, (ky) this.h);
                    this.e = 1;
                    if (p01.H(rzVar, lz0Var, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i6 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
        }
    }

    public /* synthetic */ mo(int i, hm hmVar) {
        super(i, hmVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(File file, String str, hm hmVar) {
        super(2, hmVar);
        this.g = file;
        this.h = str;
    }
}
