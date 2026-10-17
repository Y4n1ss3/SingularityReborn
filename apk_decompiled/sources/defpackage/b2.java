package defpackage;

import android.content.Intent;
import androidx.compose.runtime.State;
import com.lumi.singularity.system.DnsBlockerService;
import com.lumi.singularity.ui.activities.MainActivity;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class b2 implements u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u1
    public final void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ky) ((State) obj2).getValue()).invoke(obj);
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj2;
                Set set = MainActivity.w;
                if (((t1) obj).d == -1) {
                    Intent action = new Intent(mainActivity, (Class<?>) DnsBlockerService.class).setAction(DnsBlockerService.ACTION_START);
                    action.getClass();
                    mainActivity.startService(action);
                    break;
                }
                break;
        }
    }
}
