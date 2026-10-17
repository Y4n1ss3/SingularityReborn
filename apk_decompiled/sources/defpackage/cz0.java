package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cz0 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ky g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz0(int i, hm hmVar, ky kyVar, boolean z) {
        super(2, hmVar);
        this.d = i;
        this.f = z;
        this.g = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new cz0(0, hmVar, this.g, this.f);
            default:
                return new cz0(1, hmVar, this.g, this.f);
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
        return ((cz0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (defpackage.zj0.c(r12, false, r11) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (defpackage.zj0.c("stop adbd && start adbd", false, r11) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (defpackage.zj0.c(r12, false, r11) == r4) goto L43;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        ky kyVar = this.g;
        vn vnVar = vn.d;
        boolean z = this.f;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    String str = z ? "5555" : "-1";
                    zj0 zj0Var = zj0.a;
                    String concat = "setprop service.adb.tcp.port ".concat(str);
                    this.e = 1;
                    break;
                } else if (i2 == 1) {
                    p10.Q(obj);
                } else if (i2 == 2) {
                    p10.Q(obj);
                    nq nqVar = nr.a;
                    rz rzVar = f80.a;
                    bz0 bz0Var = new bz0(0, null, kyVar, z);
                    this.e = 3;
                    if (p01.H(rzVar, bz0Var, this) != vnVar) {
                    }
                    break;
                } else if (i2 != 3) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                zj0 zj0Var2 = zj0.a;
                this.e = 2;
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    String str2 = z ? "oculuspreferences --setc shell_teleport_anywhere true" : "oculuspreferences --setc shell_teleport_anywhere false";
                    zj0 zj0Var3 = zj0.a;
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
                nq nqVar2 = nr.a;
                rz rzVar2 = f80.a;
                bz0 bz0Var2 = new bz0(4, null, kyVar, z);
                this.e = 2;
                if (p01.H(rzVar2, bz0Var2, this) != vnVar) {
                }
                break;
        }
        return vnVar;
    }
}
