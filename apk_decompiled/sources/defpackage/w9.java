package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class w9 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ ky g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9(boolean z, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = z;
        this.f = sharedPreferences;
        this.g = kyVar;
        this.h = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new w9(this.e, this.f, this.g, this.h, hmVar, 0);
            case 1:
                return new w9(this.e, this.f, this.g, this.h, hmVar, 1);
            default:
                return new w9(this.e, this.f, this.g, this.h, hmVar, 2);
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
                ((w9) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 1:
                ((w9) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((w9) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        ky kyVar = this.g;
        SharedPreferences sharedPreferences = this.f;
        boolean z = this.e;
        MutableState mutableState = this.h;
        switch (i) {
            case 0:
                p10.Q(obj);
                ni0 ni0Var = kb.a;
                mutableState.setValue(Boolean.valueOf(z));
                sharedPreferences.edit().putBoolean("automation_unlock_toggle_enabled", z).apply();
                kyVar.invoke(z ? "Dogfood Hub/Shell Debug Unlocked (Verified)" : "Dogfood Hub/Shell Debug Locked (Verified)");
                break;
            case 1:
                p10.Q(obj);
                mutableState.setValue(Boolean.valueOf(z));
                sharedPreferences.edit().putBoolean("sys_ota_disabled", z).apply();
                kyVar.invoke(z ? "OTA Updates Disabled — Reboot Required" : "OTA Updates Re-enabled — Reboot Required");
                break;
            default:
                p10.Q(obj);
                mutableState.setValue(Boolean.valueOf(z));
                sharedPreferences.edit().putBoolean("simultaneous_hands_controllers_enabled", z).apply();
                kyVar.invoke(z ? "Simultaneous Hands & Controllers Enabled" : "Simultaneous Hands & Controllers Disabled");
                break;
        }
        return w01Var;
    }
}
