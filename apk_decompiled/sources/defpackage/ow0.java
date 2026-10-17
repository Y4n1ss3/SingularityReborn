package defpackage;

import com.lumi.singularity.system.TweakService;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ow0 extends us0 implements my {
    public int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ TweakService h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(int i, int i2, int i3, TweakService tweakService, hm hmVar) {
        super(2, hmVar);
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = tweakService;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ow0(this.e, this.f, this.g, this.h, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((ow0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        TweakService tweakService = this.h;
        if (i == 0) {
            p10.Q(obj);
            StringBuilder j = j50.j("\n            #!/system/bin/sh\n            RED_LED=\"/sys/class/leds/red/brightness\"\n            GREEN_LED=\"/sys/class/leds/green/brightness\"\n            BLUE_LED=\"/sys/class/leds/blue/brightness\"\n            while true; do\n                echo ", this.e, " > \"$RED_LED\"\n                echo ", this.f, " > \"$GREEN_LED\"\n                echo ");
            j.append(this.g);
            j.append(" > \"$BLUE_LED\"\n                sleep 1\n            done\n        ");
            String W = es0.W(j.toString());
            File file = tweakService.F;
            if (file == null) {
                q10.H("customLedScriptFile");
                throw null;
            }
            TweakService.b(file, W);
            zj0 zj0Var = zj0.a;
            File file2 = tweakService.F;
            if (file2 == null) {
                q10.H("customLedScriptFile");
                throw null;
            }
            String W2 = es0.W("\n            pkill -f rgb_led.sh || true\n            pkill -f custom_led.sh || true\n            pkill -f power_led.sh || true\n            echo 0 > /sys/class/leds/red/brightness\necho 0 > /sys/class/leds/green/brightness\necho 0 > /sys/class/leds/blue/brightness\n            nohup " + file2.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
            this.d = 1;
            Object c = zj0.c(W2, false, this);
            vn vnVar = vn.d;
            if (c == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        tweakService.n = true;
        tweakService.m = false;
        tweakService.o = false;
        return w01.a;
    }
}
