package androidx.compose.ui.util;

import defpackage.dj;
import defpackage.gb0;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ut;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t, ky kyVar) {
        if (kyVar != null) {
            appendable.append((CharSequence) kyVar.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    public static final <T> boolean fastAll(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Boolean) kyVar.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) kyVar.invoke(list.get(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, ky kyVar) {
        gb0 gb0Var = new gb0(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (gb0Var.d(kyVar.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, ky kyVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastFilteredMap(List<? extends T> list, ky kyVar, ky kyVar2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                arrayList.add(kyVar2.invoke(t));
            }
        }
        return arrayList;
    }

    public static final <T> T fastFirst(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                return t;
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    public static final <T> T fastFirstOrNull(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, ky kyVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dj.d0(arrayList, (Iterable) kyVar.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r, my myVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = (R) myVar.invoke(r, list.get(i));
        }
        return r;
    }

    public static final <T> void fastForEach(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kyVar.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, my myVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            myVar.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, ky kyVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            kyVar.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ky kyVar) {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            appendElement(a, t, kyVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ky kyVar) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, kyVar)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ky kyVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            kyVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ky kyVar2 = kyVar;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i, charSequence5, kyVar2);
    }

    public static final <T> T fastLastOrNull(List<? extends T> list, ky kyVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            T t = list.get(size);
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                return t;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, ky kyVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(kyVar.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexed(List<? extends T> list, my myVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(myVar.invoke(Integer.valueOf(i), list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, my myVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = myVar.invoke(Integer.valueOf(i), list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, ky kyVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = kyVar.invoke(list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(kyVar.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, ky kyVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) kyVar.invoke(t);
        int i = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                T t2 = list.get(i);
                Comparable comparable2 = (Comparable) kyVar.invoke(t2);
                if (comparable.compareTo(comparable2) < 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrDefault(List<? extends T> list, R r, ky kyVar) {
        if (list.isEmpty()) {
            return r;
        }
        R r2 = (R) kyVar.invoke(list.get(0));
        int i = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                Comparable comparable = (Comparable) kyVar.invoke(list.get(i));
                if (comparable.compareTo(r2) > 0) {
                    r2 = comparable;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, ky kyVar) {
        if (list.isEmpty()) {
            return null;
        }
        R r = (R) kyVar.invoke(list.get(0));
        int i = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                Comparable comparable = (Comparable) kyVar.invoke(list.get(i));
                if (comparable.compareTo(r) > 0) {
                    r = comparable;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return r;
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, ky kyVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) kyVar.invoke(t);
        int i = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                T t2 = list.get(i);
                Comparable comparable2 = (Comparable) kyVar.invoke(t2);
                if (comparable.compareTo(comparable2) > 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, my myVar) {
        if (list.isEmpty()) {
            throwUnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s = (S) yi.p0(list);
        int i = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                s = (S) myVar.invoke(s, list.get(i));
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return s;
    }

    public static final <T> int fastSumBy(List<? extends T> list, ky kyVar) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((Number) kyVar.invoke(list.get(i2))).intValue();
        }
        return i;
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> list2, my myVar) {
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(myVar.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, my myVar) {
        if (list.size() <= 1) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t = list.get(0);
        int size = list.size() - 1;
        while (i < size) {
            i++;
            T t2 = list.get(i);
            arrayList.add(myVar.invoke(t, t2));
            t = t2;
        }
        return arrayList;
    }

    public static final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }
}
