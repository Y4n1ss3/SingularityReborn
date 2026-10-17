package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sj0 extends n {
    public int f;
    public int g;
    public final /* synthetic */ tj0 h;

    public sj0(tj0 tj0Var) {
        this.h = tj0Var;
        this.f = tj0Var.size();
        this.g = tj0Var.f;
    }

    @Override // defpackage.n
    public final void a() {
        int i = this.f;
        if (i == 0) {
            this.d = 2;
            return;
        }
        tj0 tj0Var = this.h;
        Object[] objArr = tj0Var.d;
        int i2 = this.g;
        this.e = objArr[i2];
        this.d = 1;
        this.g = (i2 + 1) % tj0Var.e;
        this.f = i - 1;
    }
}
