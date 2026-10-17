package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bd0 extends f30 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd0(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                if (obj != ((cd0) obj2)) {
                    break;
                }
                break;
            case 1:
                if (obj != ((ya0) obj2)) {
                    break;
                }
                break;
            default:
                if (obj != ((rl0) obj2)) {
                    break;
                }
                break;
        }
        return String.valueOf(obj);
    }
}
