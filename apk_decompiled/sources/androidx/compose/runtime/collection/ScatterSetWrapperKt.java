package androidx.compose.runtime.collection;

import defpackage.ky;
import defpackage.rl0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScatterSetWrapperKt {
    public static final boolean fastAny(Set<? extends Object> set, ky kyVar) {
        if (!(set instanceof ScatterSetWrapper)) {
            Set<? extends Object> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (((Boolean) kyVar.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        rl0 set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
        Object[] objArr = set$runtime.b;
        long[] jArr = set$runtime.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && ((Boolean) kyVar.invoke(objArr[(i << 3) + i3])).booleanValue()) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static final <T> void fastForEach(Set<? extends T> set, ky kyVar) {
        if (!(set instanceof ScatterSetWrapper)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                kyVar.invoke(it.next());
            }
            return;
        }
        rl0 set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
        Object[] objArr = set$runtime.b;
        long[] jArr = set$runtime.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        kyVar.invoke(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final <T> Set<T> wrapIntoSet(rl0 rl0Var) {
        return new ScatterSetWrapper(rl0Var);
    }
}
