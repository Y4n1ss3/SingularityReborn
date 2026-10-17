package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.LocalSocket;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import com.lumi.singularity.ui.activities.MainActivity;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class z2 extends us0 implements my {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Object obj, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = 2;
        switch (this.d) {
            case 0:
                return new z2((LocalSocket) this.e, hmVar, 0);
            case 1:
                return new z2((Context) this.e, hmVar, 1);
            case 2:
                return new z2((SharedPreferences) this.e, hmVar, i);
            case 3:
                return new z2((MainActivity) this.e, hmVar, 3);
            case 4:
                return new z2((q90) this.e, hmVar, 4);
            case 5:
                z2 z2Var = new z2(i, hmVar);
                z2Var.e = obj;
                return z2Var;
            case 6:
                return new z2((File) this.e, hmVar, 6);
            case 7:
                return new z2((String) this.e, hmVar, 7);
            default:
                return new z2((rw0) this.e, hmVar, 8);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                ((z2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                return w01Var;
            case 1:
                return ((z2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 2:
                return ((z2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 3:
                ((z2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                return w01Var;
            case 4:
                return ((z2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 5:
                return ((z2) create((dp0) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 6:
                return ((z2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 7:
                return ((z2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            default:
                ((z2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                return w01Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        jj0 jj0Var;
        String str;
        String str2;
        JSONArray jSONArray;
        JSONObject m;
        Exception exc;
        Throwable th;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        int responseCode;
        int i = this.d;
        HttpURLConnection httpURLConnection3 = null;
        HttpURLConnection httpURLConnection4 = null;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                p10.Q(obj);
                LocalSocket localSocket = (LocalSocket) this.e;
                localSocket.getClass();
                try {
                    OutputStream outputStream = localSocket.getOutputStream();
                    byte[] bytes = "__SRH_QUIT__\n".getBytes(rh.a);
                    bytes.getClass();
                    outputStream.write(bytes);
                    localSocket.getOutputStream().flush();
                } catch (Exception unused) {
                }
                try {
                    localSocket.close();
                } catch (Exception unused2) {
                }
                return w01Var;
            case 1:
                Context context = (Context) this.e;
                p10.Q(obj);
                try {
                    File file = new File(context.getCacheDir(), "magisk_patcher");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(context.getCacheDir(), "magisk_bundled.apk");
                    if (!file2.exists()) {
                        InputStream open = context.getAssets().open("exploit/magisk.apk");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                open.getClass();
                                q10.k(open, fileOutputStream);
                                fileOutputStream.close();
                                open.close();
                            } finally {
                            }
                        } finally {
                        }
                    }
                    ZipFile zipFile = new ZipFile(file2);
                    try {
                        for (Map.Entry entry : p80.M(new xe0("assets/boot_patch.sh", "boot_patch.sh"), new xe0("assets/util_functions.sh", "util_functions.sh"), new xe0("assets/stub.apk", "stub.apk"), new xe0("lib/arm64-v8a/libinit-ld.so", "init-ld"), new xe0("lib/arm64-v8a/libmagisk.so", "magisk"), new xe0("lib/arm64-v8a/libmagiskboot.so", "magiskboot"), new xe0("lib/arm64-v8a/libmagiskinit.so", "magiskinit")).entrySet()) {
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            ZipEntry entry2 = zipFile.getEntry(str3);
                            if (entry2 == null) {
                                throw new Exception("Missing " + str3 + " in APK");
                            }
                            InputStream inputStream = zipFile.getInputStream(entry2);
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, str4));
                                try {
                                    inputStream.getClass();
                                    q10.k(inputStream, fileOutputStream2);
                                    fileOutputStream2.close();
                                    inputStream.close();
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } finally {
                            }
                        }
                        zipFile.close();
                        uv.J(file2, new File(file, "magisk.apk"), true);
                        return file;
                    } finally {
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                p10.Q(obj);
                try {
                    Process exec = Runtime.getRuntime().exec("getprop ro.boot.verifiedbootstate");
                    InputStream inputStream2 = exec.getInputStream();
                    inputStream2.getClass();
                    String obj2 = ds0.E0(p01.z(new BufferedReader(new InputStreamReader(inputStream2, rh.a), 8192))).toString();
                    exec.waitFor();
                    boolean b = q10.b(obj2, "orange");
                    sharedPreferences.edit().putBoolean("is_unlocked_bootloader", b).apply();
                    return Boolean.valueOf(b);
                } catch (Exception e2) {
                    Log.e("MainActivity", "Failed to check bootloader state", e2);
                    return Boolean.valueOf(sharedPreferences.getBoolean("is_unlocked_bootloader", false));
                }
            case 3:
                MainActivity mainActivity = (MainActivity) this.e;
                p10.Q(obj);
                try {
                } catch (Exception e3) {
                    Log.w("MainActivity", "svc power reboot failed (root likely unavailable), falling back", e3);
                }
                if (Runtime.getRuntime().exec(new String[]{"su", "-c", "svc power reboot"}).waitFor() == 0) {
                    return w01Var;
                }
                Log.w("MainActivity", "svc power reboot exited non-zero, falling back");
                try {
                    File file3 = new File(mainActivity.getApplicationInfo().nativeLibraryDir, "libadb.so");
                    String absolutePath = mainActivity.getDir("adb_keys", 0).getAbsolutePath();
                    absolutePath.getClass();
                    MainActivity.i(file3, absolutePath, "-s", "127.0.0.1:5555", "shell", "svc", "power", "reboot");
                } catch (Exception e4) {
                    Log.e("MainActivity", "Power off via ADB failed, trying direct exec", e4);
                    try {
                        Runtime.getRuntime().exec(new String[]{"svc", "power", "shutdown"});
                    } catch (Exception e5) {
                        q10.c(Log.e("MainActivity", "Direct power off also failed", e5));
                    }
                }
                return w01Var;
            case 4:
                q90 q90Var = (q90) this.e;
                p10.Q(obj);
                try {
                    String str5 = q90Var.e;
                    str = q90Var.e;
                    str2 = q90Var.f;
                    jSONArray = ts.k(str5, str2, null, false, false, 60).getJSONArray("assets");
                    jSONArray.getClass();
                    m = ts.m(q90Var, jSONArray);
                } catch (Exception e6) {
                    String str6 = q90Var.e;
                    String str7 = q90Var.f;
                    String simpleName = e6.getClass().getSimpleName();
                    String message = e6.getMessage();
                    StringBuilder k = j50.k("resolveAssetUrl failed for ", str6, "/", str7, ": ");
                    k.append(simpleName);
                    k.append(": ");
                    k.append(message);
                    Log.e("ModuleRepoManager", k.toString());
                    jj0Var = new jj0(e6);
                }
                if (m != null) {
                    String string = m.getString("browser_download_url");
                    Log.d("ModuleRepoManager", "resolveAssetUrl: " + q90Var.b + " -> " + string);
                    jj0Var = string;
                    return new kj0(jj0Var);
                }
                Log.e("ModuleRepoManager", "resolveAssetUrl: no matching asset in " + str + "/" + str2 + "'s latest release (assets: " + jSONArray.length() + ")");
                return new kj0(new jj0(new Exception("No matching asset found in " + str + "/" + str2 + "'s latest release.")));
            case 5:
                p10.Q(obj);
                return Boolean.valueOf(((dp0) this.e) != dp0.d);
            case 6:
                p10.Q(obj);
                try {
                    try {
                        URLConnection openConnection = new URL("https://github.com/lumince/singularity/raw/refs/heads/main/frida/frida-server").openConnection();
                        openConnection.getClass();
                        httpURLConnection2 = (HttpURLConnection) openConnection;
                        httpURLConnection2.setConnectTimeout(10000);
                        httpURLConnection2.setReadTimeout(15000);
                        httpURLConnection2.setInstanceFollowRedirects(true);
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = httpURLConnection3;
                    }
                } catch (Exception e7) {
                    exc = e7;
                }
                try {
                    responseCode = httpURLConnection2.getResponseCode();
                } catch (Exception e8) {
                    exc = e8;
                    httpURLConnection4 = httpURLConnection2;
                    Log.e("DownloadUtils", "Download failed: https://github.com/lumince/singularity/raw/refs/heads/main/frida/frida-server", exc);
                    if (httpURLConnection4 != null) {
                        httpURLConnection4.disconnect();
                    }
                    r5 = false;
                    httpURLConnection3 = httpURLConnection4;
                    return Boolean.valueOf(r5);
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection == null) {
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
                if (200 > responseCode || responseCode >= 300) {
                    Log.e("DownloadUtils", "Download failed: https://github.com/lumince/singularity/raw/refs/heads/main/frida/frida-server returned HTTP " + responseCode);
                    Boolean bool = Boolean.FALSE;
                    httpURLConnection2.disconnect();
                    return bool;
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
                try {
                    FileOutputStream fileOutputStream3 = new FileOutputStream((File) this.e);
                    try {
                        byte[] bArr = new byte[Fields.TransformOrigin];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read == -1) {
                                fileOutputStream3.close();
                                bufferedInputStream.close();
                                httpURLConnection2.disconnect();
                                httpURLConnection3 = bufferedInputStream;
                                return Boolean.valueOf(r5);
                            }
                            fileOutputStream3.write(bArr, 0, read);
                        }
                    } finally {
                    }
                } finally {
                }
                break;
            case 7:
                p10.Q(obj);
                try {
                    InputStream inputStream3 = Runtime.getRuntime().exec(new String[]{"getprop", (String) this.e}).getInputStream();
                    inputStream3.getClass();
                    return ds0.E0(p01.z(new BufferedReader(new InputStreamReader(inputStream3, rh.a), 8192))).toString();
                } catch (Exception unused3) {
                    return "";
                }
            default:
                p10.Q(obj);
                rw0.a((rw0) this.e, "com.lumi.singularity.SET_FAN_SLEEP_MODE");
                return w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(int i, hm hmVar) {
        super(i, hmVar);
        this.d = 5;
    }
}
