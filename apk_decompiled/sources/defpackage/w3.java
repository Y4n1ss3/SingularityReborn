package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class w3 extends us0 implements my {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Object obj, Object obj2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new w3((iy) this.e, (iy) obj2, hmVar, 0);
            case 1:
                w3 w3Var = new w3((t40) obj2, hmVar, 1);
                w3Var.e = obj;
                return w3Var;
            case 2:
                return new w3((ky) this.e, (Exception) obj2, hmVar, 2);
            case 3:
                return new w3((q90) this.e, (Context) obj2, hmVar, 3);
            case 4:
                return new w3((ky) this.e, (je) obj2, hmVar, 4);
            case 5:
                return new w3((ky) this.e, (ie) obj2, hmVar, 5);
            case 6:
                return new w3((ky) this.e, (MutableState) obj2, hmVar, 6);
            case 7:
                return new w3((MutableState) this.e, (MutableState) obj2, hmVar, 7);
            case 8:
                return new w3((bo) this.e, (MutableState) obj2, hmVar, 8);
            case 9:
                w3 w3Var2 = new w3((File) obj2, hmVar, 9);
                w3Var2.e = obj;
                return w3Var2;
            default:
                w3 w3Var3 = new w3((MutableState) obj2, hmVar, 10);
                w3Var3.e = obj;
                return w3Var3;
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 1:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 2:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 3:
                break;
            case 4:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 5:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 6:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 7:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 8:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            case 9:
                ((w3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
            default:
                ((w3) create((String) obj, (hm) obj2)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        String concat;
        int i = this.d;
        hm hmVar = null;
        hmVar = null;
        w01 w01Var = w01.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                p10.Q(obj);
                iy iyVar = (iy) this.e;
                if (iyVar == null) {
                    iyVar = (iy) obj2;
                }
                iyVar.invoke();
                break;
            case 1:
                p10.Q(obj);
                un unVar = (un) this.e;
                t40 t40Var = (t40) obj2;
                s40 s40Var = t40Var.d;
                if (((a50) s40Var).d.compareTo(r40.e) < 0) {
                    z10 z10Var = (z10) unVar.getCoroutineContext().get(ts.l);
                    if (z10Var != null) {
                        z10Var.cancel(null);
                        break;
                    }
                } else {
                    s40Var.a(t40Var);
                    break;
                }
                break;
            case 2:
                p10.Q(obj);
                Exception exc = (Exception) obj2;
                ((ky) this.e).invoke("[ERROR] " + exc.getClass().getSimpleName() + ": " + exc.getMessage());
                break;
            case 3:
                q90 q90Var = (q90) this.e;
                p10.Q(obj);
                try {
                    String str = q90Var.e;
                    String str2 = q90Var.j;
                    JSONObject k = ts.k(str, q90Var.f, (Context) obj2, false, false, 40);
                    if (str2 != null && !ds0.n0(str2)) {
                        JSONArray jSONArray = k.getJSONArray("assets");
                        jSONArray.getClass();
                        JSONObject m = ts.m(q90Var, jSONArray);
                        if (m != null) {
                            String string = m.getString("name");
                            string.getClass();
                            hmVar = ts.h(string, str2);
                        }
                        break;
                    }
                    hmVar = k.getString("tag_name");
                } catch (Exception e) {
                    String str3 = q90Var.e;
                    String str4 = q90Var.f;
                    String message = e.getMessage();
                    StringBuilder k2 = j50.k("fetchLatestVersionForEntry failed for ", str3, "/", str4, ": ");
                    k2.append(message);
                    Log.e("ModuleRepoManager", k2.toString());
                    break;
                }
                break;
            case 4:
                p10.Q(obj);
                ky kyVar = (ky) this.e;
                je jeVar = (je) obj2;
                if (jeVar.d) {
                    String str5 = jeVar.a;
                    concat = (str5 != null ? str5 : "Custom").concat(" boot animation + sound applied");
                } else {
                    String str6 = jeVar.a;
                    concat = (str6 != null ? str6 : "Custom").concat(" boot animation applied");
                }
                kyVar.invoke(concat);
                break;
            case 5:
                p10.Q(obj);
                ie ieVar = (ie) obj2;
                ((ky) this.e).invoke(ieVar == ie.g ? ieVar.e.concat(" boot animation + sound applied") : ieVar.e.concat(" boot animation applied"));
                break;
            case 6:
                p10.Q(obj);
                ((ky) this.e).invoke("GPU Max Freq lock started at " + ((String) ((MutableState) obj2).getValue()) + " MHz");
                break;
            case 7:
                p10.Q(obj);
                ((MutableState) this.e).setValue("Not Charging");
                ((MutableState) obj2).setValue("");
                break;
            case 8:
                p10.Q(obj);
                ((MutableState) obj2).setValue(Boolean.valueOf(((bo) this.e).c() != null));
                break;
            case 9:
                un unVar2 = (un) this.e;
                p10.Q(obj);
                nq nqVar = nr.a;
                p01.t(unVar2, hq.d, null, new y9((File) obj2, hmVar, 6), 2);
                break;
            default:
                String str7 = (String) this.e;
                p10.Q(obj);
                if (!((Boolean) ((MutableState) obj2).getValue()).booleanValue() || !ds0.g0(str7, "am force-stop com.oculus.vrshell", false)) {
                    zj0 zj0Var = zj0.a;
                    zj0.a(str7);
                    break;
                } else {
                    String W = es0.W("\n                svc wifi disable\n                " + str7 + "\n                svc wifi enable\n            ");
                    zj0 zj0Var2 = zj0.a;
                    zj0.a(W);
                    break;
                }
                break;
        }
        return w01Var;
        return hmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Object obj, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = obj;
    }
}
