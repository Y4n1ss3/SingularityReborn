package defpackage;

import com.lumi.singularity.ui.activities.TweaksActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class m01 extends us0 implements my {
    public final /* synthetic */ rw0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(rw0 rw0Var, boolean z, boolean z2, boolean z3, hm hmVar) {
        super(2, hmVar);
        this.d = rw0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new m01(this.d, this.e, this.f, this.g, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        m01 m01Var = (m01) create((un) obj, (hm) obj2);
        w01 w01Var = w01.a;
        m01Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        p10.Q(obj);
        TweaksActivity tweaksActivity = (TweaksActivity) this.d;
        tweaksActivity.v.setValue(Boolean.valueOf(this.e));
        tweaksActivity.w.setValue(Boolean.valueOf(this.f));
        tweaksActivity.x.setValue(Boolean.valueOf(this.g));
        return w01.a;
    }
}
