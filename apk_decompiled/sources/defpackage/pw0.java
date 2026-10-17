package defpackage;

import com.lumi.singularity.system.TweakService;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pw0 extends us0 implements my {
    public int d;
    public boolean e;
    public int f;
    public final /* synthetic */ TweakService g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(TweakService tweakService, hm hmVar) {
        super(2, hmVar);
        this.g = tweakService;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new pw0(this.g, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((pw0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c5, code lost:
    
        if (defpackage.zj0.c(r13, false, r12) == r6) goto L28;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z;
        int i2 = this.f;
        TweakService tweakService = this.g;
        vn vnVar = vn.d;
        if (i2 == 0) {
            p10.Q(obj);
            int i3 = TweakService.T;
            i = tweakService.c().getInt("fan_override_target_rpm", iv.b());
            File file = tweakService.P;
            if (file == null) {
                q10.H("fanTargetRpmFile");
                throw null;
            }
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            iv.e(i, absolutePath);
            boolean z2 = tweakService.c().getBoolean("fan_sleep_lower_enabled", false);
            File file2 = tweakService.Q;
            if (file2 == null) {
                q10.H("fanSleepEnabledFile");
                throw null;
            }
            String absolutePath2 = file2.getAbsolutePath();
            absolutePath2.getClass();
            iv.d(absolutePath2, z2);
            File file3 = tweakService.P;
            if (file3 == null) {
                q10.H("fanTargetRpmFile");
                throw null;
            }
            String absolutePath3 = file3.getAbsolutePath();
            absolutePath3.getClass();
            File file4 = tweakService.Q;
            if (file4 == null) {
                q10.H("fanSleepEnabledFile");
                throw null;
            }
            String absolutePath4 = file4.getAbsolutePath();
            absolutePath4.getClass();
            this.d = i;
            this.e = z2;
            this.f = 1;
            nq nqVar = nr.a;
            Object H = p01.H(hq.d, new hv(i, absolutePath3, absolutePath4, null), this);
            if (H != vnVar) {
                z = z2;
                obj = H;
            }
            return vnVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            tweakService.y = true;
            return w01.a;
        }
        z = this.e;
        i = this.d;
        p10.Q(obj);
        String str = (String) obj;
        File file5 = tweakService.O;
        if (file5 == null) {
            q10.H("fanOverrideScriptFile");
            throw null;
        }
        TweakService.b(file5, str);
        zj0 zj0Var = zj0.a;
        File file6 = tweakService.O;
        if (file6 == null) {
            q10.H("fanOverrideScriptFile");
            throw null;
        }
        String W = es0.W("\n            pkill -f fan_override.sh || true\n            nohup " + file6.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
        this.d = i;
        this.e = z;
        this.f = 2;
    }
}
