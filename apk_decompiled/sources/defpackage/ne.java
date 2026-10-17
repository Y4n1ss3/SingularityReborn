package defpackage;

import android.content.Context;
import com.lumi.singularity.system.TweakService;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ne extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public int f;
    public final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne(Context context, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = context;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Context context = this.g;
        switch (i) {
            case 0:
                return new ne(context, hmVar, 0);
            default:
                return new ne((TweakService) context, hmVar, 1);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((ne) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3 = this.d;
        vn vnVar = vn.d;
        Context context = this.g;
        w01 w01Var = w01.a;
        switch (i3) {
            case 0:
                int i4 = this.f;
                if (i4 == 0) {
                    p10.Q(obj);
                    this.f = 1;
                    obj = j4.i(context, "settings put global captive_portal_mode 0", this);
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            i = this.e;
                            p10.Q(obj);
                            this.e = i;
                            this.f = 3;
                            if (y80.p(2000L, this) == vnVar) {
                                return vnVar;
                            }
                            this.e = i;
                            this.f = 4;
                            if (j4.i(context, "svc wifi enable", this) == vnVar) {
                            }
                            return w01Var;
                        }
                        if (i4 != 3) {
                            if (i4 == 4) {
                                p10.Q(obj);
                                return w01Var;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = this.e;
                        p10.Q(obj);
                        this.e = i;
                        this.f = 4;
                        if (j4.i(context, "svc wifi enable", this) == vnVar) {
                            return vnVar;
                        }
                        return w01Var;
                    }
                    p10.Q(obj);
                }
                int i5 = obj == null ? 0 : 1;
                if (i5 != 0) {
                    this.e = i5;
                    this.f = 2;
                    if (j4.i(context, "svc wifi disable", this) == vnVar) {
                        return vnVar;
                    }
                    i = i5;
                    this.e = i;
                    this.f = 3;
                    if (y80.p(2000L, this) == vnVar) {
                    }
                    this.e = i;
                    this.f = 4;
                    if (j4.i(context, "svc wifi enable", this) == vnVar) {
                    }
                }
                return w01Var;
            default:
                TweakService tweakService = (TweakService) context;
                int i6 = this.f;
                if (i6 == 0) {
                    p10.Q(obj);
                    int i7 = TweakService.T;
                    int i8 = tweakService.c().getInt("charge_limit_target", 100);
                    List list = ce.a;
                    this.e = i8;
                    this.f = 1;
                    nq nqVar = nr.a;
                    if (p01.H(hq.d, new z9(2, 6, null), this) == vnVar) {
                        return vnVar;
                    }
                    i2 = i8;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                p10.Q(obj);
                                tweakService.z = false;
                                return w01Var;
                            }
                            if (i6 != 4) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            p10.Q(obj);
                            tweakService.z = true;
                            return w01Var;
                        }
                        i2 = this.e;
                        p10.Q(obj);
                        if (i2 < 100) {
                            List list2 = ce.a;
                            this.e = i2;
                            this.f = 3;
                            nq nqVar2 = nr.a;
                            if (p01.H(hq.d, new z9(2, 5, null), this) == vnVar) {
                                return vnVar;
                            }
                            tweakService.z = false;
                            return w01Var;
                        }
                        List list3 = ce.a;
                        int h = y80.h(i2, 50, 100);
                        StringBuilder sb = new StringBuilder("\n            #!/system/bin/sh\n            while true; do\n                cap=$(cat /sys/class/power_supply/battery/capacity 2>/dev/null)\n                if [ -n \"$cap\" ]; then\n                    if [ \"$cap\" -ge ");
                        sb.append(h);
                        sb.append(" ]; then\n                        echo 1 > /sys/class/power_supply/battery/input_suspend 2>/dev/null\n                    elif [ \"$cap\" -le ");
                        sb.append(h - 2);
                        sb.append(" ]; then\n                        echo 0 > /sys/class/power_supply/battery/input_suspend 2>/dev/null\n                    fi\n                fi\n                sleep 5\n            done\n        ");
                        String W = es0.W(sb.toString());
                        File file = tweakService.R;
                        if (file == null) {
                            q10.H("chargeLimitScriptFile");
                            throw null;
                        }
                        TweakService.b(file, W);
                        zj0 zj0Var = zj0.a;
                        File file2 = tweakService.R;
                        if (file2 == null) {
                            q10.H("chargeLimitScriptFile");
                            throw null;
                        }
                        String d = uo.d("nohup ", file2.getAbsolutePath(), " > /dev/null 2>&1 &");
                        this.e = i2;
                        this.f = 4;
                        if (zj0.c(d, false, this) == vnVar) {
                            return vnVar;
                        }
                        tweakService.z = true;
                        return w01Var;
                    }
                    i2 = this.e;
                    p10.Q(obj);
                }
                zj0 zj0Var2 = zj0.a;
                this.e = i2;
                this.f = 2;
                if (zj0.c("pkill -f charge_limit.sh || true", false, this) == vnVar) {
                    return vnVar;
                }
                if (i2 < 100) {
                }
        }
    }
}
