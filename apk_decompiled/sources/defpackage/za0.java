package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class za0 extends ij0 implements my {
    public dz d;
    public ab0 e;
    public long[] f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ab0 j;
    public final /* synthetic */ dz k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(ab0 ab0Var, dz dzVar, hm hmVar) {
        super(hmVar);
        this.j = ab0Var;
        this.k = dzVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        za0 za0Var = new za0(this.j, this.k, hmVar);
        za0Var.i = obj;
        return za0Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((za0) create((co0) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        ab0 ab0Var;
        long[] jArr;
        int i;
        dz dzVar;
        int i2 = this.h;
        if (i2 == 0) {
            p10.Q(obj);
            co0Var = (co0) this.i;
            ab0Var = this.j;
            ya0 ya0Var = ab0Var.e;
            jArr = ya0Var.c;
            i = ya0Var.e;
            dzVar = this.k;
        } else {
            if (i2 != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.g;
            jArr = this.f;
            ab0Var = this.e;
            dzVar = this.d;
            co0Var = (co0) this.i;
            p10.Q(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return w01.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        dzVar.e = i;
        Object obj2 = ab0Var.e.b[i];
        this.i = co0Var;
        this.d = dzVar;
        this.e = ab0Var;
        this.f = jArr;
        this.g = i3;
        this.h = 1;
        co0Var.a(this, obj2);
        return vn.d;
    }
}
