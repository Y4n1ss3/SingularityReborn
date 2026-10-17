package defpackage;

import android.util.Log;
import com.lumi.singularity.ui.activities.MainActivity;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gh implements jw {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ un e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public gh(ji0 ji0Var, un unVar, hh hhVar, jw jwVar) {
        this.f = ji0Var;
        this.e = unVar;
        this.g = hhVar;
        this.h = jwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    @Override // defpackage.jw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, hm hmVar) {
        fh fhVar;
        int i;
        int i2 = this.d;
        w01 w01Var = w01.a;
        Serializable serializable = this.f;
        hm hmVar2 = null;
        int i3 = 1;
        switch (i2) {
            case 0:
                if (hmVar instanceof fh) {
                    fhVar = (fh) hmVar;
                    int i4 = fhVar.h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        fhVar.h = i4 - Integer.MIN_VALUE;
                        Object obj2 = fhVar.f;
                        i = fhVar.h;
                        if (i != 0) {
                            p10.Q(obj2);
                            z10 z10Var = (z10) ((ji0) serializable).d;
                            if (z10Var != null) {
                                z10Var.cancel(new wh("Child of the scoped flow was cancelled"));
                                fhVar.d = this;
                                fhVar.e = obj;
                                fhVar.h = 1;
                                Object n = z10Var.n(fhVar);
                                vn vnVar = vn.d;
                                if (n == vnVar) {
                                    break;
                                }
                            }
                        } else if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = fhVar.e;
                            this = fhVar.d;
                            p10.Q(obj2);
                        }
                        ((ji0) this.f).d = p01.t(this.e, null, xn.g, new eh((hh) this.g, (jw) this.h, obj, null), 1);
                        break;
                    }
                }
                fhVar = new fh(this, hmVar);
                Object obj22 = fhVar.f;
                i = fhVar.h;
                if (i != 0) {
                }
                ((ji0) this.f).d = p01.t(this.e, null, xn.g, new eh((hh) this.g, (jw) this.h, obj, null), 1);
            default:
                String str = (String) obj;
                Log.v("Fugu", "raw> " + str);
                Set set = MainActivity.w;
                String str2 = "Building exploit";
                if (!ds0.g0(str, "build cred carrier", false) && !ds0.g0(str, "simple-carrier", false)) {
                    str2 = ds0.g0(str, "poison inject-lib", false) ? "Poisoning" : ks0.Z(ds0.F0(str).toString(), "] verify", false) ? "Verifying root" : (ds0.g0(str, "getenforce", false) && ds0.g0(str, "-> Permissive", false)) ? "Selinux Permissive" : (ds0.g0(str, "getenforce", false) && ds0.g0(str, "->", false) && !ds0.g0(str, "-> Permissive", false)) ? "Selinux Enforcing" : ds0.g0(str, "root adb ready", false) ? "Root acquired" : null;
                }
                if (str2 != null && ((LinkedHashSet) serializable).add(str2)) {
                    Log.d("Fugu", "Phase milestone: ".concat(str2));
                    nq nqVar = nr.a;
                    p01.t(this.e, f80.a, null, new y60(i3, hmVar2, (ky) this.h, str2), 2);
                }
                if (ds0.g0(str, "root adb ready", true)) {
                    ((fi0) this.g).d = true;
                    break;
                }
                break;
        }
        return w01Var;
    }

    public gh(MainActivity mainActivity, LinkedHashSet linkedHashSet, un unVar, fi0 fi0Var, ky kyVar) {
        this.f = linkedHashSet;
        this.e = unVar;
        this.g = fi0Var;
        this.h = kyVar;
    }
}
