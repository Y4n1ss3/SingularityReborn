package defpackage;

import android.content.Context;
import android.content.Intent;
import com.lumi.singularity.system.TweakService;
import com.lumi.singularity.ui.activities.AppsActivity;
import com.lumi.singularity.ui.activities.ControllerInfoActivity;
import com.lumi.singularity.ui.activities.DomainBlockerActivity;
import com.lumi.singularity.ui.activities.TerminalActivity;
import com.lumi.singularity.ui.activities.TweaksActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class b70 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ b70(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        w01 w01Var = w01.a;
        Context context = this.e;
        switch (i) {
            case 0:
                Intent intent = new Intent(context, (Class<?>) TerminalActivity.class);
                intent.putExtra("is_rooted", false);
                context.startActivity(intent);
                break;
            case 1:
                Intent intent2 = new Intent(context, (Class<?>) TweaksActivity.class);
                intent2.putExtra("is_rooted", true);
                context.startActivity(intent2);
                break;
            case 2:
                Intent intent3 = new Intent(context, (Class<?>) AppsActivity.class);
                intent3.putExtra("is_rooted", true);
                context.startActivity(intent3);
                break;
            case 3:
                context.startActivity(new Intent(context, (Class<?>) ControllerInfoActivity.class));
                break;
            case 4:
                Intent intent4 = new Intent(context, (Class<?>) TerminalActivity.class);
                intent4.putExtra("is_rooted", true);
                context.startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(context, (Class<?>) TweaksActivity.class);
                intent5.putExtra("is_rooted", false);
                context.startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(context, (Class<?>) AppsActivity.class);
                intent6.putExtra("is_rooted", false);
                context.startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(context, (Class<?>) TweakService.class);
                intent7.setAction("ACTION_APPLY_PASSTHROUGH_FIX");
                context.startService(intent7);
                break;
            default:
                context.startActivity(new Intent(context, (Class<?>) DomainBlockerActivity.class));
                break;
        }
        return w01Var;
    }
}
