package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class io extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ bo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io(bo boVar, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = boVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new io(this.f, hmVar, 0);
            default:
                return new io(this.f, hmVar, 1);
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
        return ((io) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        bo boVar = this.f;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    ro roVar = ro.a;
                    zn a = boVar.a();
                    this.e = 1;
                    Serializable a2 = roVar.a(a, this);
                    if (a2 == vnVar) {
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
                    ro roVar2 = ro.a;
                    zn b = boVar.b();
                    this.e = 1;
                    Serializable a3 = roVar2.a(b, this);
                    if (a3 == vnVar) {
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
