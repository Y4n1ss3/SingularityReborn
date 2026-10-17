package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class t9 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9(int i, int i2, hm hmVar) {
        super(i, hmVar);
        this.d = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                t9 t9Var = new t9(2, 0, hmVar);
                t9Var.f = obj;
                return t9Var;
            default:
                t9 t9Var2 = new t9(2, 1, hmVar);
                t9Var2.f = obj;
                return t9Var2;
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        String str = (String) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((t9) create(str, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                String str = (String) this.f;
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var = zj0.a;
                    this.f = null;
                    this.e = 1;
                    Object c = zj0.c(str, false, this);
                    if (c == vnVar) {
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
                String str2 = (String) this.f;
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var2 = zj0.a;
                    this.f = null;
                    this.e = 1;
                    Object c2 = zj0.c(str2, false, this);
                    if (c2 == vnVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
        }
        return vnVar;
    }
}
