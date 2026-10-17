package androidx.compose.runtime.collection;

import defpackage.cd0;
import defpackage.cj;
import defpackage.ky;
import defpackage.p01;
import defpackage.va0;
import defpackage.xa0;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final <T> boolean all(cd0 cd0Var, ky kyVar) {
        Object[] objArr = cd0Var.a;
        int i = cd0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((Boolean) kyVar.invoke(objArr[i2])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> cd0 fastFilter(cd0 cd0Var, ky kyVar) {
        Object[] objArr = cd0Var.a;
        int i = cd0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((Boolean) kyVar.invoke(objArr[i2])).booleanValue()) {
                xa0 xa0Var = new xa0();
                Object[] objArr2 = cd0Var.a;
                int i3 = cd0Var.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object obj = objArr2[i4];
                    if (((Boolean) kyVar.invoke(obj)).booleanValue()) {
                        xa0Var.g(obj);
                    }
                }
                return xa0Var;
            }
        }
        return cd0Var;
    }

    public static final <T, R> cd0 fastMap(cd0 cd0Var, ky kyVar) {
        xa0 xa0Var = new xa0(cd0Var.b);
        Object[] objArr = cd0Var.a;
        int i = cd0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            xa0Var.g(kyVar.invoke(objArr[i2]));
        }
        return xa0Var;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(cd0 cd0Var, ky kyVar) {
        if (cd0Var.b <= 1) {
            return true;
        }
        Comparable comparable = (Comparable) kyVar.invoke(cd0Var.b(0));
        if (comparable == null) {
            return false;
        }
        int i = cd0Var.b;
        int i2 = 1;
        while (i2 < i) {
            Comparable comparable2 = (Comparable) kyVar.invoke(cd0Var.b(i2));
            if (comparable2 == null || comparable.compareTo(comparable2) > 0) {
                return false;
            }
            i2++;
            comparable = comparable2;
        }
        return true;
    }

    public static final <T> T removeLast(xa0 xa0Var) {
        if (xa0Var.d()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = xa0Var.b - 1;
        T t = (T) xa0Var.b(i);
        xa0Var.l(i);
        return t;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(xa0 xa0Var, final ky kyVar) {
        va0 va0Var = xa0Var.c;
        if (va0Var == null) {
            va0Var = new va0(xa0Var);
            xa0Var.c = va0Var;
        }
        if (va0Var.d.b > 1) {
            cj.b0(va0Var, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    ky kyVar2 = ky.this;
                    return p01.i((Comparable) kyVar2.invoke(t), (Comparable) kyVar2.invoke(t2));
                }
            });
        }
    }

    public static final <T, K extends Comparable<? super K>> cd0 sortedBy(cd0 cd0Var, ky kyVar) {
        if (isSorted(cd0Var, kyVar)) {
            return cd0Var;
        }
        xa0 mutableObjectList = toMutableObjectList(cd0Var);
        sortBy(mutableObjectList, kyVar);
        return mutableObjectList;
    }

    public static final <T> xa0 toMutableObjectList(cd0 cd0Var) {
        xa0 xa0Var = new xa0(cd0Var.b);
        Object[] objArr = cd0Var.a;
        int i = cd0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            xa0Var.g(objArr[i2]);
        }
        return xa0Var;
    }
}
