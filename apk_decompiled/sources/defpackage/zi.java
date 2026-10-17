package defpackage;

import java.util.Collection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class zi extends y80 {
    public static int a0(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
