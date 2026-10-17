package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class p80 extends q10 {
    public static Object K(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int L(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map M(xe0... xe0VarArr) {
        if (xe0VarArr.length <= 0) {
            return vt.d;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(L(xe0VarArr.length));
        O(linkedHashMap, xe0VarArr);
        return linkedHashMap;
    }

    public static void N(Map map, Iterable iterable) {
        map.getClass();
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xe0 xe0Var = (xe0) it.next();
            map.put(xe0Var.d, xe0Var.e);
        }
    }

    public static void O(Map map, xe0[] xe0VarArr) {
        map.getClass();
        xe0VarArr.getClass();
        for (xe0 xe0Var : xe0VarArr) {
            map.put(xe0Var.d, xe0Var.e);
        }
    }

    public static Map P(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(L(collection.size()));
                    N(linkedHashMap, iterable);
                    return linkedHashMap;
                }
                xe0 xe0Var = (xe0) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                xe0Var.getClass();
                Map singletonMap = Collections.singletonMap(xe0Var.d, xe0Var.e);
                singletonMap.getClass();
                return singletonMap;
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            N(linkedHashMap2, iterable);
            int size2 = linkedHashMap2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashMap2;
                }
                Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                Map singletonMap2 = Collections.singletonMap(entry.getKey(), entry.getValue());
                singletonMap2.getClass();
                return singletonMap2;
            }
        }
        return vt.d;
    }

    public static Map Q(xe0[] xe0VarArr) {
        xe0VarArr.getClass();
        int length = xe0VarArr.length;
        if (length == 0) {
            return vt.d;
        }
        if (length != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(L(xe0VarArr.length));
            O(linkedHashMap, xe0VarArr);
            return linkedHashMap;
        }
        xe0 xe0Var = xe0VarArr[0];
        xe0Var.getClass();
        Map singletonMap = Collections.singletonMap(xe0Var.d, xe0Var.e);
        singletonMap.getClass();
        return singletonMap;
    }
}
