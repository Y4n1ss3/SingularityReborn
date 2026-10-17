package defpackage;

import android.util.Log;
import com.lumi.singularity.ui.activities.MainActivity;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class x60 implements ky {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ un e;
    public final /* synthetic */ ky f;

    public /* synthetic */ x60(un unVar, ky kyVar) {
        this.e = unVar;
        this.f = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        ky kyVar = this.f;
        un unVar = this.e;
        String str = (String) obj;
        switch (i) {
            case 0:
                Log.v("Fugu", "payload> " + str);
                Set set = MainActivity.w;
                String str2 = (ds0.g0(str, "[sl-magisk]", false) && ds0.g0(str, "post-fs-data", false)) ? "Setting up Magisk" : (ds0.g0(str, "[sl-magisk]", false) && ds0.g0(str, "magiskd up", false)) ? "Magisk running" : (ds0.g0(str, "[bootanimation]", false) && ds0.g0(str, "Mounting", false) && ds0.g0(str, ".glb", false)) ? "Patching Boot animation" : (ds0.g0(str, "[bootanimation]", false) && ds0.g0(str, "Boot animation mount successful", false)) ? "Boot animation patched" : (ds0.g0(str, "[bootanimation]", false) && ds0.g0(str, "Setting up sound overlay", false)) ? "Patching Startup sound" : (ds0.g0(str, "[bootanimation]", false) && ds0.g0(str, "Sound overlay mount successful", false)) ? "Startup sound patched" : null;
                if (str2 != null) {
                    nq nqVar = nr.a;
                    p01.t(unVar, f80.a, null, new y60(0, null, kyVar, str2), 2);
                    break;
                }
                break;
            default:
                str.getClass();
                nq nqVar2 = nr.a;
                p01.t(unVar, hq.d, null, new iz0(str, kyVar, (hm) null), 2);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ x60(MainActivity mainActivity, un unVar, ky kyVar) {
        this.e = unVar;
        this.f = kyVar;
    }
}
