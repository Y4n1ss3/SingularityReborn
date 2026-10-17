package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bz0 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz0(int i, hm hmVar, ky kyVar, boolean z) {
        super(2, hmVar);
        this.d = i;
        this.e = kyVar;
        this.f = z;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new bz0(0, hmVar, this.e, this.f);
            case 1:
                return new bz0(1, hmVar, this.e, this.f);
            case 2:
                return new bz0(2, hmVar, this.e, this.f);
            case 3:
                return new bz0(3, hmVar, this.e, this.f);
            case 4:
                return new bz0(4, hmVar, this.e, this.f);
            default:
                return new bz0(5, hmVar, this.e, this.f);
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
                ((bz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 1:
                ((bz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 2:
                ((bz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 3:
                ((bz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 4:
                ((bz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((bz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        boolean z = this.f;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                p10.Q(obj);
                kyVar.invoke(z ? "Wireless ADB Enabled" : "Wireless ADB Disabled");
                break;
            case 1:
                p10.Q(obj);
                kyVar.invoke(z ? "USB Interceptor Enabled" : "USB Interceptor Disabled");
                break;
            case 2:
                p10.Q(obj);
                kyVar.invoke(z ? "Link Fix Enabled" : "Link Fix Disabled");
                break;
            case 3:
                p10.Q(obj);
                kyVar.invoke(z ? "Navigator UI enabled" : "Dock UI enabled");
                break;
            case 4:
                p10.Q(obj);
                kyVar.invoke(z ? "Teleport Anywhere Enabled" : "Teleport Anywhere Disabled");
                break;
            default:
                p10.Q(obj);
                kyVar.invoke(z ? "Persist Protected" : "Persist Unprotected");
                break;
        }
        return w01Var;
    }
}
