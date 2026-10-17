package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ga implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ga(ky kyVar, Object obj, int i) {
        this.d = i;
        this.e = kyVar;
        this.f = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj = this.f;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                kyVar.invoke((q90) obj);
                break;
            default:
                kyVar.invoke((String) obj);
                break;
        }
        return w01Var;
    }
}
