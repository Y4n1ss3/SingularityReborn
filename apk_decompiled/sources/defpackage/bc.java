package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bc implements Iterable, n20 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ bc(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return new q((Object[]) obj);
            case 1:
                return new rb((int[]) obj);
            case 2:
                return new q((long[]) obj, 4);
            case 3:
                return new q((float[]) obj, 2);
            case 4:
                return new q((double[]) obj, 1);
            case 5:
                return new q00(cq.z((Object[]) ((i2) obj).e));
            default:
                return new ar((br) obj);
        }
    }
}
