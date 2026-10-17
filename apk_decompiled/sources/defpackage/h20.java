package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class h20 extends ij0 implements my {
    public rc0 d;
    public zh e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ i20 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h20(hm hmVar, i20 i20Var) {
        super(hmVar);
        this.h = i20Var;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        h20 h20Var = new h20(hmVar, this.h);
        h20Var.g = obj;
        return h20Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((h20) create((co0) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005f -> B:6:0x0071). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rc0 b;
        rc0 rc0Var;
        d60 d60Var;
        co0 co0Var;
        int i = this.f;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            co0 co0Var2 = (co0) this.g;
            Object E = this.h.E();
            if (E instanceof zh) {
                i20 i20Var = ((zh) E).h;
                this.f = 1;
                co0Var2.a(this, i20Var);
                return vnVar;
            }
            if ((E instanceof n00) && (b = ((n00) E).b()) != null) {
                Object f = b.f();
                f.getClass();
                d60 d60Var2 = (d60) f;
                rc0Var = b;
                d60Var = d60Var2;
                co0Var = co0Var2;
                if (!d60Var.equals(rc0Var)) {
                }
            }
        } else if (i == 1) {
            p10.Q(obj);
        } else {
            if (i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d60Var = this.e;
            rc0Var = this.d;
            co0Var = (co0) this.g;
            p10.Q(obj);
            d60Var = d60Var.g();
            if (!d60Var.equals(rc0Var)) {
                if (d60Var instanceof zh) {
                    zh zhVar = (zh) d60Var;
                    i20 i20Var2 = zhVar.h;
                    this.g = co0Var;
                    this.d = rc0Var;
                    this.e = zhVar;
                    this.f = 2;
                    co0Var.a(this, i20Var2);
                    return vnVar;
                }
                d60Var = d60Var.g();
                if (!d60Var.equals(rc0Var)) {
                }
            }
        }
        return w01.a;
    }
}
