package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.VpnService;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.system.DnsBlockerService;
import com.lumi.singularity.ui.activities.TweaksActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class uy0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ uy0(Object obj, Object obj2, MutableState mutableState, int i) {
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.e = mutableState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.e;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                p01.t((un) obj3, null, null, new vz0(((Boolean) obj).booleanValue(), (ky) obj2, mutableState, null), 3);
                break;
            default:
                rw0 rw0Var = (rw0) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                r6.f(mutableState, bool, (SharedPreferences) obj3, "blocker_is_running", booleanValue);
                if (!booleanValue) {
                    TweaksActivity tweaksActivity = (TweaksActivity) rw0Var;
                    Intent action = new Intent(tweaksActivity, (Class<?>) DnsBlockerService.class).setAction(DnsBlockerService.ACTION_STOP);
                    action.getClass();
                    tweaksActivity.startService(action);
                    break;
                } else {
                    TweaksActivity tweaksActivity2 = (TweaksActivity) rw0Var;
                    Intent prepare = VpnService.prepare(tweaksActivity2);
                    if (prepare == null) {
                        Intent action2 = new Intent(tweaksActivity2, (Class<?>) DnsBlockerService.class).setAction(DnsBlockerService.ACTION_START);
                        action2.getClass();
                        tweaksActivity2.startService(action2);
                        break;
                    } else {
                        tweaksActivity2.A.J(prepare);
                        break;
                    }
                }
        }
        return w01Var;
    }
}
