package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class y60 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y60(int i, hm hmVar, ky kyVar, String str) {
        super(2, hmVar);
        this.d = i;
        this.e = kyVar;
        this.f = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        String str = this.f;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                return new y60(0, hmVar, kyVar, str);
            case 1:
                return new y60(1, hmVar, kyVar, str);
            case 2:
                return new y60(2, hmVar, kyVar, str);
            default:
                return new y60(3, hmVar, kyVar, str);
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
                ((y60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 1:
                ((y60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 2:
                ((y60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((y60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        String str = this.f;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                p10.Q(obj);
                kyVar.invoke("[*] ".concat(str));
                break;
            case 1:
                p10.Q(obj);
                kyVar.invoke("[*] ".concat(str));
                break;
            case 2:
                p10.Q(obj);
                kyVar.invoke(str);
                break;
            default:
                p10.Q(obj);
                kyVar.invoke("[ERROR] ".concat(str));
                break;
        }
        return w01Var;
    }
}
