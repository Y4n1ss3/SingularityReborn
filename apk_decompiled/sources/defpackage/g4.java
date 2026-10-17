package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class g4 extends us0 implements my {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(String str, String str2, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.d = 4;
        this.g = str;
        this.h = str2;
        this.e = mutableState;
        this.f = mutableState2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                return new g4((File) this.e, (String[]) obj2, (String) obj4, (String) obj3, hmVar, 0);
            case 1:
                return new g4((un) this.e, (jm) obj2, (MutableState) obj4, (MutableState) obj3, hmVar, 1);
            case 2:
                g4 g4Var = new g4((SharedPreferences) obj2, (MutableState) obj4, (Context) obj3, hmVar);
                g4Var.e = obj;
                return g4Var;
            case 3:
                return new g4((zr0) this.e, (SharedPreferences) obj2, (ky) obj4, (MutableState) obj3, hmVar, 3);
            default:
                return new g4((String) obj4, (String) obj3, (MutableState) this.e, (MutableState) obj2, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                ((g4) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 2:
                ((g4) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 3:
                ((g4) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((g4) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0234, code lost:
    
        if (0 != 0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025b A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        InputStream errorStream;
        OutputStream outputStream;
        int i = this.d;
        Process process = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = null;
        Object[] objArr5 = null;
        Object[] objArr6 = 0;
        Object[] objArr7 = null;
        Object[] objArr8 = 0;
        Object[] objArr9 = null;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Process process2 = null;
        w01 w01Var = w01.a;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                p10.Q(obj);
                try {
                    try {
                        ArrayList G = y80.G(((File) this.e).getAbsolutePath());
                        dj.e0(G, (String[]) obj3);
                        ProcessBuilder redirectErrorStream = new ProcessBuilder(G).redirectErrorStream(true);
                        String str2 = (String) obj4;
                        Map<String, String> environment = redirectErrorStream.environment();
                        environment.getClass();
                        environment.put("HOME", str2);
                        Map<String, String> environment2 = redirectErrorStream.environment();
                        environment2.getClass();
                        environment2.put("ANDROID_SDK_HOME", str2);
                        Map<String, String> environment3 = redirectErrorStream.environment();
                        environment3.getClass();
                        environment3.put("EXTERNAL_STORAGE", str2);
                        Map<String, String> environment4 = redirectErrorStream.environment();
                        environment4.getClass();
                        environment4.put("TMPDIR", str2);
                        Map<String, String> environment5 = redirectErrorStream.environment();
                        environment5.getClass();
                        environment5.put("ADB_VENDOR_KEYS", str2 + "/.android/adbkey");
                        Map<String, String> environment6 = redirectErrorStream.environment();
                        environment6.getClass();
                        environment6.put("USER", "singularity");
                        Map<String, String> environment7 = redirectErrorStream.environment();
                        environment7.getClass();
                        environment7.put("LOGNAME", "singularity");
                        Map<String, String> environment8 = redirectErrorStream.environment();
                        environment8.getClass();
                        environment8.put("HOSTNAME", "quest");
                        Map<String, String> environment9 = redirectErrorStream.environment();
                        environment9.getClass();
                        environment9.put("ADB_SERVER_SOCKET", "tcp:15037");
                        Map<String, String> environment10 = redirectErrorStream.environment();
                        environment10.getClass();
                        environment10.put("ANDROID_ADB_LOG_PATH", str2 + "/adb_daemon.log");
                        process2 = redirectErrorStream.start();
                        OutputStream outputStream2 = process2.getOutputStream();
                        outputStream2.getClass();
                        Charset charset = rh.a;
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream2, charset), 8192);
                        try {
                            bufferedWriter.write((String) obj2);
                            bufferedWriter.newLine();
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            InputStream inputStream = process2.getInputStream();
                            inputStream.getClass();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
                            try {
                                str = p01.z(bufferedReader);
                                bufferedReader.close();
                                process2.waitFor();
                                process2.exitValue();
                                try {
                                    InputStream inputStream2 = process2.getInputStream();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    OutputStream outputStream3 = process2.getOutputStream();
                                    if (outputStream3 != null) {
                                        outputStream3.close();
                                    }
                                    InputStream errorStream2 = process2.getErrorStream();
                                    if (errorStream2 != null) {
                                        errorStream2.close();
                                    }
                                } catch (Exception unused) {
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    q10.g(bufferedReader, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                q10.g(bufferedWriter, th3);
                                throw th4;
                            }
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    str = "Error: " + e.getMessage();
                    if (0 != 0) {
                        try {
                            InputStream inputStream3 = process.getInputStream();
                            if (inputStream3 != null) {
                                inputStream3.close();
                            }
                        } catch (Exception unused2) {
                            break;
                        }
                    }
                    if (0 != 0 && (outputStream = (objArr10 == true ? 1 : 0).getOutputStream()) != null) {
                        outputStream.close();
                    }
                    if (0 != 0 && (errorStream = (objArr11 == true ? 1 : 0).getErrorStream()) != null) {
                        errorStream.close();
                        break;
                    }
                }
                process2.destroy();
                return str;
            case 1:
                p10.Q(obj);
                um.c((un) this.e, (jm) obj3, (MutableState) obj4, (MutableState) obj2);
                return w01Var;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                un unVar = (un) this.e;
                p10.Q(obj);
                if (((Boolean) ((MutableState) obj4).getValue()).booleanValue()) {
                    nq nqVar = nr.a;
                    hq hqVar = hq.d;
                    p01.t(unVar, hqVar, null, new z9(2, 28, null), 2);
                    p01.t(unVar, hqVar, null, new z9(2, 29, null), 2);
                    p01.t(unVar, hqVar, null, new b80(2, 0, objArr == true ? 1 : 0), 2);
                    boolean z = sharedPreferences.getBoolean("blocker_on_boot", false);
                    boolean z2 = sharedPreferences.getBoolean("blocker_is_running", false);
                    boolean z3 = sharedPreferences.getBoolean("root_blocker_setup", false);
                    if (z && z2) {
                        p01.t(unVar, hqVar, null, new se((Context) obj2, sharedPreferences, z3, (hm) null), 2);
                    }
                }
                return w01Var;
            case 3:
                ky kyVar = (ky) obj4;
                p10.Q(obj);
                zr0 zr0Var = (zr0) this.e;
                if (zr0Var != null) {
                    ((MutableState) obj2).setValue(Boolean.valueOf(zr0Var.F));
                    ((SharedPreferences) obj3).edit().putBoolean("meta_backdoor_toggle_enabled", zr0Var.F).apply();
                    kyVar.invoke(zr0Var.F ? "Meta Backdoor Disabled (Verified)" : "Meta Backdoor Enabled (Verified)");
                } else {
                    kyVar.invoke("Unable to verify Meta Backdoor state");
                }
                return w01Var;
            default:
                p10.Q(obj);
                ((MutableState) this.e).setValue((String) obj4);
                ((MutableState) obj3).setValue((String) obj2);
                return w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Object obj, Object obj2, Object obj3, Object obj4, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(SharedPreferences sharedPreferences, MutableState mutableState, Context context, hm hmVar) {
        super(2, hmVar);
        this.d = 2;
        this.f = sharedPreferences;
        this.g = mutableState;
        this.h = context;
    }
}
