package defpackage;

import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class jc extends f30 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ty g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc(boolean z, ty tyVar, int i, int i2) {
        super(2);
        this.d = i2;
        this.e = z;
        this.g = tyVar;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = this.f;
        ty tyVar = this.g;
        boolean z = this.e;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                d41.a(z, (iy) tyVar, composer, i2 | 1);
                break;
            default:
                cq.a(z, (my) tyVar, composer, i2 | 1);
                break;
        }
        return w01Var;
    }
}
