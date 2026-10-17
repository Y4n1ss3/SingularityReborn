package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class li {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public li(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            q40 q40Var = (q40) entry.getValue();
            List list = (List) this.a.get(q40Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(q40Var, list);
            }
            list.add((mi) entry.getKey());
        }
    }

    public static void a(List list, y40 y40Var, q40 q40Var, x40 x40Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                mi miVar = (mi) list.get(size);
                Method method = miVar.b;
                try {
                    int i = miVar.a;
                    if (i == 0) {
                        method.invoke(x40Var, null);
                    } else if (i == 1) {
                        method.invoke(x40Var, y40Var);
                    } else if (i == 2) {
                        method.invoke(x40Var, y40Var, q40Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
