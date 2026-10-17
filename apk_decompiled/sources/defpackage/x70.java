package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class x70 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ File e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x70(File file, String str, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = file;
        this.f = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new x70(this.e, this.f, hmVar, 0);
            default:
                return new x70(this.e, this.f, hmVar, 1);
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
        return ((x70) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        String str = this.f;
        File file = this.e;
        boolean z = false;
        switch (i) {
            case 0:
                p10.Q(obj);
                try {
                    ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath(), "-s", "127.0.0.1:5555", "shell", "id");
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
                    String obj2 = ds0.E0(p01.z(new BufferedReader(new InputStreamReader(inputStream, rh.a), 8192))).toString();
                    start.waitFor();
                    if (start.exitValue() == 0) {
                        if (ds0.g0(obj2, "uid=", true)) {
                            z = true;
                        }
                    }
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z);
            default:
                String str2 = "";
                p10.Q(obj);
                try {
                    ProcessBuilder processBuilder2 = new ProcessBuilder(file.getAbsolutePath(), "-s", "127.0.0.1:5555", "shell", "magisk", "-v");
                    Map<String, String> environment6 = processBuilder2.environment();
                    environment6.getClass();
                    environment6.put("HOME", str);
                    Map<String, String> environment7 = processBuilder2.environment();
                    environment7.getClass();
                    environment7.put("ANDROID_SDK_HOME", str);
                    Map<String, String> environment8 = processBuilder2.environment();
                    environment8.getClass();
                    environment8.put("ADB_VENDOR_KEYS", str + "/.android/adbkey");
                    Map<String, String> environment9 = processBuilder2.environment();
                    environment9.getClass();
                    environment9.put("ADB_SERVER_SOCKET", "tcp:15037");
                    Map<String, String> environment10 = processBuilder2.environment();
                    environment10.getClass();
                    environment10.put("ANDROID_ADB_LOG_PATH", str + "/adb_daemon.log");
                    Process start2 = processBuilder2.redirectErrorStream(true).start();
                    if (start2.waitFor(3L, TimeUnit.SECONDS)) {
                        InputStream inputStream2 = start2.getInputStream();
                        inputStream2.getClass();
                        str2 = ds0.E0(p01.z(new BufferedReader(new InputStreamReader(inputStream2, rh.a), 8192))).toString();
                    } else {
                        start2.destroyForcibly();
                    }
                } catch (Exception unused2) {
                }
                return str2;
        }
    }
}
