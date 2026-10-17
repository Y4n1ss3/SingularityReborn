package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class dj extends cj {
    public static void c0(PersistentCollection.Builder builder, ao0 ao0Var) {
        builder.getClass();
        ao0Var.getClass();
        Iterator it = ao0Var.iterator();
        while (it.hasNext()) {
            builder.add(it.next());
        }
    }

    public static void d0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void e0(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        collection.addAll(asList);
    }

    public static final boolean f0(Iterable iterable, ky kyVar) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((Boolean) kyVar.invoke(it.next())).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static void g0(ky kyVar, List list) {
        int size;
        list.getClass();
        kyVar.getClass();
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof n20) || (list instanceof o20)) {
                f0(list, kyVar);
                return;
            } else {
                p01.D(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) kyVar.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static void h0(Collection collection, ao0 ao0Var) {
        collection.getClass();
        ao0Var.getClass();
        List X = do0.X(ao0Var);
        if (X.isEmpty()) {
            return;
        }
        collection.removeAll(X);
    }

    public static void i0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        collection.removeAll(iterable instanceof Collection ? (Collection) iterable : yi.I0(iterable));
    }

    public static void j0(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        if (objArr.length == 0) {
            return;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        collection.removeAll(asList);
    }

    public static Object k0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(list.size() - 1);
    }
}
