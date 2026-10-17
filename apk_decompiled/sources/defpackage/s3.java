package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.ui.activities.AdbActivity;
import com.lumi.singularity.ui.activities.AdbRootActivity;
import com.lumi.singularity.ui.activities.MainActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class s3 extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public int e;
    public MutableState f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(c3 c3Var, String str, String str2, String str3, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.i = c3Var;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                return new s3((c3) obj5, (String) obj4, (String) obj3, (String) obj2, this.f, this.g, this.h, hmVar);
            case 1:
                return new s3((Context) obj5, (q90) obj4, this.f, (SharedPreferences) obj3, this.g, this.h, (PackageManager) obj2, hmVar);
            default:
                return new s3((cq0) obj5, (SharedPreferences) obj4, (Context) obj3, (g80) obj2, this.g, this.h, hmVar);
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
        return ((s3) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
    
        if (r1 == r9) goto L44;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object H;
        Object p;
        Object H2;
        MutableState mutableState;
        boolean z;
        int i = this.d;
        MutableState mutableState2 = this.h;
        MutableState mutableState3 = this.g;
        w01 w01Var = w01.a;
        Object obj2 = this.l;
        Object obj3 = this.j;
        vn vnVar = vn.d;
        Object obj4 = this.i;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                String str = (String) obj3;
                MutableState mutableState4 = this.f;
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    File h = ((AdbRootActivity) ((c3) obj4)).h();
                    if (h == null) {
                        j4.e(mutableState4, "Error: Could not locate ADB binary in native libraries.");
                        j4.c(mutableState3);
                        return w01Var;
                    }
                    j4.e(mutableState4, "Pairing with 127.0.0.1:" + str + " using code " + ((String) obj5));
                    String[] strArr = {"pair", uo.c("127.0.0.1:", str)};
                    this.e = 1;
                    nq nqVar = nr.a;
                    H = p01.H(hq.d, new g4(h, strArr, (String) obj2, (String) obj5, null, 0), this);
                    if (H == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    H = obj;
                }
                String obj6 = ds0.E0((String) H).toString();
                if (obj6.length() == 0) {
                    obj6 = "No output from pair command.";
                }
                j4.e(mutableState4, obj6);
                if (ds0.g0(obj6, "Successfully paired", true)) {
                    mutableState2.setValue(Boolean.TRUE);
                    j4.e(mutableState4, "Pairing successful! Now set the Connection Port below using the IP address & Port shown on the Wireless debugging screen.");
                } else {
                    j4.e(mutableState4, "Pairing may have failed. Check the port and code and try again.");
                }
                j4.c(mutableState3);
                return w01Var;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj5;
                Context context = (Context) obj4;
                q90 q90Var = (q90) obj3;
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    ts tsVar = ts.m;
                    wa waVar = new wa(this.f, q90Var, 1);
                    this.e = 1;
                    p = tsVar.p(context, q90Var, waVar, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    p = ((kj0) obj).d;
                }
                if (!(p instanceof jj0)) {
                    sharedPreferences.edit().putString("vector_pkg_".concat(q90Var.a), (String) p).apply();
                }
                MutableState mutableState5 = this.f;
                this.e = 2;
                if (kb.e(context, this.g, this.h, sharedPreferences, (PackageManager) obj2, mutableState5, false, this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            default:
                cq0 cq0Var = (cq0) obj4;
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    SharedPreferences sharedPreferences2 = (SharedPreferences) obj3;
                    sharedPreferences2.getClass();
                    this.f = mutableState3;
                    this.e = 1;
                    nq nqVar2 = nr.a;
                    H2 = p01.H(hq.d, new z2(sharedPreferences2, null, 2), this);
                    if (H2 == vnVar) {
                        return vnVar;
                    }
                    mutableState = mutableState3;
                } else {
                    if (i4 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState6 = this.f;
                    p10.Q(obj);
                    mutableState = mutableState6;
                    H2 = obj;
                }
                Boolean bool = (Boolean) H2;
                bool.getClass();
                mutableState.setValue(bool);
                if (e80.g(mutableState2)) {
                    return w01Var;
                }
                MainActivity mainActivity = (MainActivity) cq0Var;
                if (!mainActivity.h()) {
                    return w01Var;
                }
                try {
                    Process exec = Runtime.getRuntime().exec(new String[]{"magisk", "-v"});
                    InputStream inputStream = exec.getInputStream();
                    inputStream.getClass();
                    String obj7 = ds0.E0(p01.z(new BufferedReader(new InputStreamReader(inputStream, rh.a), 8192))).toString();
                    exec.waitFor();
                    z = ds0.g0(obj7, "MAGISK", true);
                } catch (Exception e) {
                    Log.e("MainActivity", "Failed to check Magisk installation", e);
                    z = false;
                }
                if (z) {
                    return w01Var;
                }
                Intent intent = new Intent((Context) obj5, (Class<?>) (hr.c() ? AdbActivity.class : AdbRootActivity.class));
                intent.putExtra("is_fugu_setup", false);
                intent.putExtra("is_unlocked_bootloader", e80.d(mutableState3));
                intent.putExtra("is_adb_rootable", mainActivity.h());
                ((g80) obj2).J(intent);
                return w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(cq0 cq0Var, SharedPreferences sharedPreferences, Context context, g80 g80Var, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.i = cq0Var;
        this.j = sharedPreferences;
        this.k = context;
        this.l = g80Var;
        this.g = mutableState;
        this.h = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(Context context, q90 q90Var, MutableState mutableState, SharedPreferences sharedPreferences, MutableState mutableState2, MutableState mutableState3, PackageManager packageManager, hm hmVar) {
        super(2, hmVar);
        this.i = context;
        this.j = q90Var;
        this.f = mutableState;
        this.k = sharedPreferences;
        this.g = mutableState2;
        this.h = mutableState3;
        this.l = packageManager;
    }
}
