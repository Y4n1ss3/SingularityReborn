package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sz0 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz0(boolean z, ky kyVar, boolean z2, SharedPreferences sharedPreferences, MutableState mutableState, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = z;
        this.f = kyVar;
        this.g = z2;
        this.h = sharedPreferences;
        this.i = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new sz0(this.e, this.f, this.g, this.h, this.i, hmVar, 0);
            case 1:
                return new sz0(this.e, this.f, this.g, this.h, this.i, hmVar, 1);
            default:
                return new sz0(this.e, this.g, this.h, this.f, this.i, hmVar);
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
                ((sz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 1:
                ((sz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((sz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        SharedPreferences sharedPreferences = this.h;
        MutableState mutableState = this.i;
        boolean z = this.e;
        boolean z2 = this.g;
        ky kyVar = this.f;
        switch (i) {
            case 0:
                p10.Q(obj);
                if (!z) {
                    boolean z3 = !z2;
                    mutableState.setValue(Boolean.valueOf(z3));
                    sharedPreferences.edit().putBoolean("guardian_disabled", z3).apply();
                    kyVar.invoke("Couldn't reach wireless ADB. Enable Wireless Debugging and run Setup With Computer first");
                    break;
                } else {
                    kyVar.invoke(z2 ? "Guardian Disabled" : "Guardian Restored");
                    break;
                }
            case 1:
                p10.Q(obj);
                if (!z) {
                    boolean z4 = !z2;
                    mutableState.setValue(Boolean.valueOf(z4));
                    sharedPreferences.edit().putBoolean("captive_portal_disabled", z4).apply();
                    kyVar.invoke("Couldn't reach wireless ADB. Enable Wireless Debugging and run Setup With Computer first");
                    break;
                } else {
                    kyVar.invoke(z2 ? "Captive Portal Disabled" : "Captive Portal Restored");
                    break;
                }
            default:
                p10.Q(obj);
                if (!z) {
                    kyVar.invoke("Couldn't reach wireless ADB. Enable Wireless Debugging and run Setup With Computer first");
                    break;
                } else {
                    mutableState.setValue(Boolean.valueOf(z2));
                    sharedPreferences.edit().putBoolean("sys_ota_url_blocked", z2).apply();
                    kyVar.invoke(z2 ? "OTA URLs redirected to localhost" : "OTA URLs restored");
                    break;
                }
        }
        return w01Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(boolean z, boolean z2, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.d = 2;
        this.e = z;
        this.g = z2;
        this.h = sharedPreferences;
        this.f = kyVar;
        this.i = mutableState;
    }
}
