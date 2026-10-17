package defpackage;

import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class jb implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ jb(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return p01.i((String) ((kw0) obj).e, (String) ((kw0) obj2).e);
            case 1:
                return p01.i((String) ((kw0) obj).e, (String) ((kw0) obj2).e);
            case 2:
                return p01.i(Integer.valueOf(((go) yi.p0((ArrayList) obj)).c), Integer.valueOf(((go) yi.p0((ArrayList) obj2)).c));
            default:
                return p01.i(((fv) obj).a, ((fv) obj2).a);
        }
    }
}
