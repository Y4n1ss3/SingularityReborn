package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cc implements ao0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ao0
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new q((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new g50(this);
            case 3:
                return p10.y((my) obj);
            case 4:
                return (Iterator) obj;
            default:
                return new f50((CharSequence) obj);
        }
    }
}
