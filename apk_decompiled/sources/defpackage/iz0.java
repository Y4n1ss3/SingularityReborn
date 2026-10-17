package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class iz0 extends us0 implements my {
    public final /* synthetic */ int d = 0;
    public int e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(int i, hm hmVar, ky kyVar, String str) {
        super(2, hmVar);
        this.f = kyVar;
        this.e = i;
        this.g = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        ky kyVar = this.f;
        String str = this.g;
        switch (i) {
            case 0:
                return new iz0(this.e, hmVar, kyVar, str);
            case 1:
                return new iz0(kyVar, str, hmVar);
            default:
                return new iz0(str, kyVar, hmVar);
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
                ((iz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return ((iz0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (defpackage.zj0.c(r11, false, r10) == r7) goto L16;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        ky kyVar = this.f;
        vn vnVar = vn.d;
        String str = this.g;
        switch (i) {
            case 0:
                p10.Q(obj);
                kyVar.invoke("Fan target updated to " + this.e + " " + str);
                break;
            case 1:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    kyVar.invoke("Build type spoofed to '" + str + "'. Restarting Zygote...");
                    zj0 zj0Var = zj0.a;
                    this.e = 1;
                    if (zj0.c("setprop ctl.restart zygote", false, this) == vnVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var2 = zj0.a;
                    String concat = "magisk resetprop ro.build.type ".concat(str);
                    this.e = 1;
                    break;
                } else if (i3 == 1) {
                    p10.Q(obj);
                } else if (i3 != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                nq nqVar = nr.a;
                rz rzVar = f80.a;
                iz0 iz0Var = new iz0(kyVar, str, (hm) null);
                this.e = 2;
                if (p01.H(rzVar, iz0Var, this) != vnVar) {
                }
                break;
        }
        return vnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(ky kyVar, String str, hm hmVar) {
        super(2, hmVar);
        this.f = kyVar;
        this.g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(String str, ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.g = str;
        this.f = kyVar;
    }
}
