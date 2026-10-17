package defpackage;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.util.Log;
import androidx.compose.ui.autofill.AutofillUtils_androidKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class w2 extends us0 implements my {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(int i, int i2, hm hmVar) {
        super(i, hmVar);
        this.d = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new w2(2, 0, hmVar);
            case 1:
                return new w2(2, 1, hmVar);
            case 2:
                return new w2(2, 2, hmVar);
            case 3:
                return new w2(2, 3, hmVar);
            case 4:
                return new w2(2, 4, hmVar);
            case 5:
                return new w2(2, 5, hmVar);
            case 6:
                return new w2(2, 6, hmVar);
            case 7:
                return new w2(2, 7, hmVar);
            case 8:
                return new w2(2, 8, hmVar);
            case 9:
                return new w2(2, 9, hmVar);
            default:
                return new w2(2, 10, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((w2) create((String) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 3:
                ((w2) create((String) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                ((w2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 8:
                ((w2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 9:
                ((w2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            default:
                ((w2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        if (defpackage.ds0.g0(r0, "uid=0", false) != false) goto L38;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LocalSocket localSocket;
        Socket socket;
        int i = this.d;
        boolean z = true;
        boolean z2 = false;
        uj0 uj0Var = null;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                p10.Q(obj);
                try {
                    localSocket = new LocalSocket();
                    localSocket.connect(new LocalSocketAddress("singularity_root_helper", LocalSocketAddress.Namespace.ABSTRACT));
                    localSocket.setSoTimeout(3000);
                } catch (IOException unused) {
                    localSocket = null;
                }
                if (localSocket != null) {
                    try {
                        uj0Var = ts.w(localSocket, "id");
                        try {
                            OutputStream outputStream = localSocket.getOutputStream();
                            byte[] bytes = "__SRH_QUIT__\n".getBytes(rh.a);
                            bytes.getClass();
                            outputStream.write(bytes);
                            localSocket.getOutputStream().flush();
                        } catch (Exception unused2) {
                        }
                        try {
                            localSocket.close();
                        } catch (Exception unused3) {
                        }
                    } finally {
                    }
                }
                return uj0Var;
            case 1:
                p10.Q(obj);
                int i2 = (true && true) ? 3000 : 0;
                try {
                    LocalSocket localSocket2 = new LocalSocket();
                    localSocket2.connect(new LocalSocketAddress("singularity_root_helper", LocalSocketAddress.Namespace.ABSTRACT));
                    localSocket2.setSoTimeout(i2);
                    return localSocket2;
                } catch (IOException unused4) {
                    return null;
                }
            case 2:
                p10.Q(obj);
                return "";
            case 3:
                p10.Q(obj);
                return "[preview] command output";
            case 4:
                p10.Q(obj);
                try {
                    socket = new Socket();
                } catch (Exception unused5) {
                    z = false;
                }
                try {
                    socket.connect(new InetSocketAddress("127.0.0.1", 5555), 1000);
                    socket.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 5:
                p10.Q(obj);
                try {
                    Process exec = Runtime.getRuntime().exec("su -c id");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    String readLine = bufferedReader.readLine();
                    exec.waitFor();
                    bufferedReader.close();
                    exec.destroy();
                    if (readLine != null) {
                        break;
                    }
                    z = false;
                    z2 = z;
                } catch (Exception unused6) {
                }
                return Boolean.valueOf(z2);
            case 6:
                p10.Q(obj);
                try {
                    URLConnection openConnection = new URL("https://github.com/lumince/singularity/raw/refs/heads/main/frida/version.txt").openConnection();
                    openConnection.setConnectTimeout(AutofillUtils_androidKt.MAX_AUTOFILL_TEXT_LENGTH);
                    openConnection.setReadTimeout(AutofillUtils_androidKt.MAX_AUTOFILL_TEXT_LENGTH);
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(openConnection.getInputStream()));
                    try {
                        String readLine2 = bufferedReader2.readLine();
                        String obj2 = readLine2 != null ? ds0.E0(readLine2).toString() : null;
                        bufferedReader2.close();
                        return obj2;
                    } finally {
                    }
                } catch (Exception e) {
                    Log.e("FridaUpdate", "Failed to fetch remote version", e);
                    return null;
                }
            case 7:
                p10.Q(obj);
                zj0 zj0Var = zj0.a;
                zj0.a("killall zygote64");
                return w01Var;
            case 8:
                p10.Q(obj);
                zj0 zj0Var2 = zj0.a;
                zj0.a("am start -n com.oculus.panelapp.settings/.SettingsActivity --es \"uri\" \"/home\"");
                return w01Var;
            case 9:
                p10.Q(obj);
                zj0 zj0Var3 = zj0.a;
                zj0.a("am start -n com.oculus.store/.StoreActivity -a android.intent.action.VIEW -d \"https://www.meta.com/experiences/4296951573676418\"");
                return w01Var;
            default:
                p10.Q(obj);
                zj0 zj0Var4 = zj0.a;
                zj0.a("am start -n com.oculus.guidebook/.CalibrationNuxActivity --es uri \"/calibration_nux/EYE\"");
                return w01Var;
        }
    }
}
