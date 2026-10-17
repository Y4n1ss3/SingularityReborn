package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class f4 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(SnapshotStateMap snapshotStateMap, b8 b8Var, String str, hm hmVar) {
        super(2, hmVar);
        this.d = 3;
        this.f = snapshotStateMap;
        this.g = b8Var;
        this.e = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                return new f4((String) obj4, (ky) obj3, (Context) obj2, hmVar, 0);
            case 1:
                return new f4((String) obj4, (File) obj3, (String[]) obj2, hmVar, 1);
            case 2:
                return new f4((MutableState) obj4, (SnapshotStateMap) obj3, (PackageManager) obj2, hmVar, 2);
            case 3:
                return new f4((SnapshotStateMap) obj3, (b8) obj2, (String) obj4, hmVar);
            case 4:
                return new f4((ArrayList) obj4, (MutableState) obj3, (MutableState) obj2, hmVar, 4);
            case 5:
                return new f4((String) obj4, (MutableState) obj3, (MutableState) obj2, hmVar, 5);
            case 6:
                return new f4((ky) obj3, obj4, (MutableState) obj2, hmVar, 6);
            case 7:
                return new f4((ky) obj3, obj4, (MutableState) obj2, hmVar, 7);
            case 8:
                return new f4((SharedPreferences) obj4, (MutableState) obj3, (MutableState) obj2, hmVar, 8);
            default:
                return new f4((String) obj4, (String) obj3, (Context) obj2, hmVar, 9);
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
                ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            case 1:
                return ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
            case 2:
                ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            case 3:
                ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            case 4:
                ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            case 5:
                ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            case 6:
                ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            case 7:
                ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            case 8:
                ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            default:
                return ((f4) create(unVar, hmVar)).invokeSuspend(w01Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x03bd, code lost:
    
        if (0 != 0) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e4 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        InputStream errorStream;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        String str2;
        int i = this.d;
        Process process = null;
        HttpsURLConnection httpsURLConnection = 0;
        w01 w01Var = w01.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                ky kyVar = (ky) obj2;
                p10.Q(obj);
                File file = new File((String) obj3, ".android");
                File file2 = new File(file, "adbkey");
                File file3 = new File(file, "adbkey.pub");
                if (!file2.exists() || !file3.exists()) {
                    file.mkdirs();
                    kyVar.invoke("Installing bundled ADB keypair...");
                    try {
                        InputStream open = context.getAssets().open("adb/adbkey");
                        try {
                            open.getClass();
                            byte[] z = q10.z(open);
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                fileOutputStream.write(z);
                                fileOutputStream.close();
                                open.close();
                                file2.setReadable(false, false);
                                file2.setReadable(true, true);
                                InputStream open2 = context.getAssets().open("adb/adbkey.pub");
                                try {
                                    open2.getClass();
                                    byte[] z2 = q10.z(open2);
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream2.write(z2);
                                        fileOutputStream2.close();
                                        open2.close();
                                        kyVar.invoke("ADB keypair installed.");
                                    } finally {
                                    }
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    } catch (Exception e) {
                        kyVar.invoke("Error installing ADB keypair: " + e.getMessage());
                    }
                }
                return w01Var;
            case 1:
                p10.Q(obj);
                String str3 = (String) obj3;
                File file4 = new File(str3, "adb_daemon.log");
                long length = file4.exists() ? file4.length() : 0L;
                try {
                    try {
                        ArrayList G = y80.G(((File) obj2).getAbsolutePath());
                        dj.e0(G, (String[]) obj4);
                        ProcessBuilder redirectErrorStream = new ProcessBuilder(G).redirectErrorStream(true);
                        Map<String, String> environment = redirectErrorStream.environment();
                        environment.getClass();
                        environment.put("HOME", str3);
                        Map<String, String> environment2 = redirectErrorStream.environment();
                        environment2.getClass();
                        environment2.put("ANDROID_SDK_HOME", str3);
                        Map<String, String> environment3 = redirectErrorStream.environment();
                        environment3.getClass();
                        environment3.put("EXTERNAL_STORAGE", str3);
                        Map<String, String> environment4 = redirectErrorStream.environment();
                        environment4.getClass();
                        environment4.put("TMPDIR", str3);
                        Map<String, String> environment5 = redirectErrorStream.environment();
                        environment5.getClass();
                        environment5.put("ADB_VENDOR_KEYS", str3 + "/.android/adbkey");
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
                        environment10.put("ANDROID_ADB_LOG_PATH", str3 + "/adb_daemon.log");
                        process = redirectErrorStream.start();
                        InputStream inputStream = process.getInputStream();
                        inputStream.getClass();
                        Charset charset = rh.a;
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
                        try {
                            str = p01.z(bufferedReader);
                            bufferedReader.close();
                            process.waitFor();
                            process.exitValue();
                            if (file4.exists() && file4.length() > length) {
                                try {
                                    file4.length();
                                    FileInputStream fileInputStream = new FileInputStream(file4);
                                    try {
                                        fileInputStream.skip(length);
                                        String obj5 = ds0.E0(new String(q10.z(fileInputStream), charset)).toString();
                                        if (obj5.length() > 0) {
                                            for (String str4 : ds0.r0(obj5)) {
                                            }
                                        }
                                        fileInputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            q10.g(fileInputStream, th);
                                            throw th2;
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                InputStream inputStream2 = process.getInputStream();
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                OutputStream outputStream2 = process.getOutputStream();
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                }
                                InputStream errorStream2 = process.getErrorStream();
                                if (errorStream2 != null) {
                                    errorStream2.close();
                                }
                            } catch (Exception unused2) {
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                q10.g(bufferedReader, th3);
                                throw th4;
                            }
                        }
                    } catch (Exception e2) {
                        str = "Error: " + e2.getMessage();
                        if (0 != 0) {
                            try {
                                InputStream inputStream3 = process.getInputStream();
                                if (inputStream3 != null) {
                                    inputStream3.close();
                                }
                            } catch (Exception unused3) {
                                break;
                            }
                        }
                        if (0 != 0 && (outputStream = process.getOutputStream()) != null) {
                            outputStream.close();
                        }
                        if (0 != 0 && (errorStream = process.getErrorStream()) != null) {
                            errorStream.close();
                            break;
                        }
                    }
                    process.destroy();
                    return str;
                } finally {
                }
            case 2:
                p10.Q(obj);
                ni0 ni0Var = kb.a;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj2;
                PackageManager packageManager = (PackageManager) obj4;
                Iterator it = ((List) ((MutableState) obj3).getValue()).iterator();
                while (it.hasNext()) {
                    String str5 = ((b8) it.next()).c;
                    if (snapshotStateMap.get(str5) == null) {
                        packageManager.getClass();
                        String p = kb.p(kb.n(str5, packageManager));
                        snapshotStateMap.put(str5, new e8(24, p != null ? uo.d("Installed (v", p, ")") : "Ready", p));
                    }
                }
                return w01Var;
            case 3:
                p10.Q(obj);
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj2;
                String str6 = ((b8) obj4).c;
                Object obj6 = snapshotStateMap2.get(str6);
                obj6.getClass();
                String str7 = (String) obj3;
                snapshotStateMap2.put(str6, e8.a((e8) obj6, uo.d("Update Available (", str7, ")"), false, null, true, str7, 6));
                return w01Var;
            case 4:
                p10.Q(obj);
                ni0 ni0Var2 = kb.a;
                ((MutableState) obj2).setValue((ArrayList) obj3);
                ((MutableState) obj4).setValue(Boolean.FALSE);
                return w01Var;
            case 5:
                p10.Q(obj);
                ((MutableState) obj2).setValue(Boolean.valueOf(q10.b((String) obj3, "1")));
                ((MutableState) obj4).setValue(Boolean.TRUE);
                return w01Var;
            case 6:
                p10.Q(obj);
                ((ky) obj2).invoke("Manual fan control enabled at " + ((Number) ((MutableState) obj4).getValue()).intValue() + " " + ((String) obj3) + " — system control disabled");
                return w01Var;
            case 7:
                p10.Q(obj);
                Boolean bool = Boolean.FALSE;
                ((MutableState) obj3).setValue(bool);
                ((MutableState) obj4).setValue(bool);
                ((ky) obj2).invoke("Services folder deleted");
                return w01Var;
            case 8:
                p10.Q(obj);
                if (((SharedPreferences) obj3).getString("gpu_max_freq_selection", null) == null) {
                    ((MutableState) obj4).setValue((String) ((MutableState) obj2).getValue());
                }
                return w01Var;
            default:
                Context context2 = (Context) obj4;
                p10.Q(obj);
                try {
                    try {
                        URLConnection openConnection = new URL("https://api.github.com/repos/" + ((String) obj3) + "/" + ((String) obj2) + "/releases/latest").openConnection();
                        openConnection.getClass();
                        httpURLConnection = (HttpURLConnection) openConnection;
                        try {
                            httpURLConnection.setConnectTimeout(15000);
                            httpURLConnection.setReadTimeout(15000);
                            InputStream inputStream4 = httpURLConnection.getInputStream();
                            inputStream4.getClass();
                            JSONObject jSONObject = new JSONObject(p01.z(new BufferedReader(new InputStreamReader(inputStream4, rh.a), 8192)));
                            String string = jSONObject.getString("tag_name");
                            String string2 = jSONObject.getString("body");
                            JSONArray jSONArray = jSONObject.getJSONArray("assets");
                            int length2 = jSONArray.length();
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    String string3 = jSONObject2.getString("name");
                                    string3.getClass();
                                    if (ks0.Z(string3, ".apk", false)) {
                                        str2 = jSONObject2.getString("browser_download_url");
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    str2 = null;
                                }
                            }
                            if (str2 == null) {
                                Log.e("UpdateManager", "No APK found in the latest release.");
                            } else {
                                String str8 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                                if (str8 == null) {
                                    Log.e("UpdateManager", "Could not get current app version.");
                                } else {
                                    string.getClass();
                                    if (d41.E(string, str8)) {
                                        string2.getClass();
                                        a11 a11Var = new a11(string, string2, str2);
                                        httpURLConnection.disconnect();
                                        return a11Var;
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            Log.e("UpdateManager", "Failed to check for updates: " + e.getMessage());
                            e.printStackTrace();
                            if (httpURLConnection == null) {
                                return null;
                            }
                            httpURLConnection.disconnect();
                            return null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpsURLConnection = "https://api.github.com/repos/";
                        if (httpsURLConnection != 0) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    httpURLConnection = null;
                } catch (Throwable th6) {
                    th = th6;
                    if (httpsURLConnection != 0) {
                    }
                    throw th;
                }
                httpURLConnection.disconnect();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(ky kyVar, Object obj, MutableState mutableState, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = kyVar;
        this.e = obj;
        this.g = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(Object obj, Object obj2, Object obj3, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }
}
