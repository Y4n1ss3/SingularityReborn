package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class yi extends dj {
    public static ArrayList A0(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static ArrayList B0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static List C0(List list) {
        list.getClass();
        if (list.size() <= 1) {
            return I0(list);
        }
        List K0 = K0(list);
        Collections.reverse(K0);
        return K0;
    }

    public static Object D0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        o.m("List has more than one element.");
        return null;
    }

    public static List E0(List list) {
        if (list.size() <= 1) {
            return I0(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ac.K(array);
    }

    public static List F0(List list, Comparator comparator) {
        if (list.size() <= 1) {
            return I0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static final void G0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] H0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List I0(Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        ut utVar = ut.d;
        if (!z) {
            List K0 = K0(iterable);
            ArrayList arrayList = (ArrayList) K0;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? K0 : y80.D(arrayList.get(0)) : utVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return utVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return y80.D(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList J0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List K0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        G0(iterable, arrayList);
        return arrayList;
    }

    public static Set L0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return p01.C(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(p80.L(collection.size()));
                G0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            G0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : p01.C(linkedHashSet2.iterator().next());
            }
        }
        return xt.d;
    }

    public static double l0(ArrayList arrayList) {
        int size = arrayList.size();
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            d += ((Number) obj).floatValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static boolean m0(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    y80.V();
                    throw null;
                }
                if (q10.b(obj, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static List n0(List list) {
        return I0(new LinkedHashSet(list));
    }

    public static List o0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        iterable.getClass();
        if (i < 0) {
            o.c(j50.i(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return I0(iterable);
        }
        boolean z = iterable instanceof Collection;
        ut utVar = ut.d;
        if (z) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return utVar;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    obj = v0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return y80.D(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 >= i) {
                arrayList.add(obj2);
            } else {
                i2++;
            }
        }
        int size3 = arrayList.size();
        return size3 != 0 ? size3 != 1 ? arrayList : y80.D(arrayList.get(0)) : utVar;
    }

    public static Object p0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object q0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object r0(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void s0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ky kyVar) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            p10.c(sb, obj, kyVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void t0(List list, StringBuilder sb, g gVar, int i) {
        if ((i & 64) != 0) {
            gVar = null;
        }
        s0(list, sb, "\n", "", "", "...", gVar);
    }

    public static String u0(Iterable iterable, String str, String str2, String str3, ky kyVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            kyVar = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        s0(iterable, sb, str4, str5, str6, "...", kyVar);
        return sb.toString();
    }

    public static Object v0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static Object w0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable x0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable y0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList z0(List list, ty tyVar) {
        list.getClass();
        ArrayList arrayList = new ArrayList(zi.a0(list, 10));
        boolean z = false;
        for (Object obj : list) {
            boolean z2 = true;
            if (!z && q10.b(obj, tyVar)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
