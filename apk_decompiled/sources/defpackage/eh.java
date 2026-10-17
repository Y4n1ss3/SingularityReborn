package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class eh extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hh g;
    public final /* synthetic */ jw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(hh hhVar, jw jwVar, Object obj, hm hmVar) {
        super(2, hmVar);
        this.g = hhVar;
        this.h = jwVar;
        this.f = obj;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        jw jwVar = this.h;
        hh hhVar = this.g;
        switch (i) {
            case 0:
                return new eh(hhVar, jwVar, this.f, hmVar);
            default:
                eh ehVar = new eh(hhVar, jwVar, hmVar);
                ehVar.f = obj;
                return ehVar;
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
        return ((eh) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        jw jwVar = this.h;
        hh hhVar = this.g;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    ny nyVar = hhVar.h;
                    Object obj2 = this.f;
                    this.e = 1;
                    if (nyVar.invoke(jwVar, obj2, this) == vnVar) {
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
                    un unVar = (un) this.f;
                    ji0 ji0Var = new ji0();
                    iw iwVar = hhVar.g;
                    gh ghVar = new gh(ji0Var, unVar, hhVar, jwVar);
                    this.e = 1;
                    if (iwVar.collect(ghVar, this) == vnVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(hh hhVar, jw jwVar, hm hmVar) {
        super(2, hmVar);
        this.g = hhVar;
        this.h = jwVar;
    }
}
