package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class dg implements vc0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((ky) obj).getClass().getSimpleName() + '@' + cq.r(this) + ']';
            default:
                return "DisposeOnCancel[" + ((qr) obj) + ']';
        }
    }
}
