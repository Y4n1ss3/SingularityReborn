package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import com.lumi.singularity.system.TweakService;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class nw0 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TweakService e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw0(TweakService tweakService, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = tweakService;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        TweakService tweakService = this.e;
        switch (i) {
            case 0:
                return new nw0(tweakService, hmVar, 0);
            case 1:
                return new nw0(tweakService, hmVar, 1);
            default:
                return new nw0(tweakService, hmVar, 2);
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
                ((nw0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 1:
                ((nw0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((nw0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        TweakService tweakService = this.e;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                p10.Q(obj);
                int i2 = TweakService.T;
                tweakService.e();
                break;
            case 1:
                p10.Q(obj);
                int i3 = TweakService.T;
                tweakService.g();
                break;
            default:
                p10.Q(obj);
                int i4 = TweakService.T;
                if (!tweakService.d()) {
                    if (!tweakService.d()) {
                        tweakService.stopSelf();
                        break;
                    }
                } else {
                    Notification a = tweakService.a();
                    Object systemService = tweakService.getSystemService("notification");
                    systemService.getClass();
                    ((NotificationManager) systemService).notify(2, a);
                    break;
                }
                break;
        }
        return w01Var;
    }
}
