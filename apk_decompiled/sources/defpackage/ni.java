package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ni {
    public static final ni c = new ni();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, mi miVar, q40 q40Var, Class cls) {
        q40 q40Var2 = (q40) hashMap.get(miVar);
        if (q40Var2 == null || q40Var == q40Var2) {
            if (q40Var2 == null) {
                hashMap.put(miVar, q40Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + miVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + q40Var2 + ", new value " + q40Var);
    }

    public final li a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            li liVar = (li) hashMap2.get(superclass);
            if (liVar == null) {
                liVar = a(superclass, null);
            }
            hashMap.putAll(liVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            li liVar2 = (li) hashMap2.get(cls2);
            if (liVar2 == null) {
                liVar2 = a(cls2, null);
            }
            for (Map.Entry entry : liVar2.b.entrySet()) {
                b(hashMap, (mi) entry.getKey(), (q40) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            ud0 ud0Var = (ud0) method.getAnnotation(ud0.class);
            if (ud0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!y40.class.isAssignableFrom(parameterTypes[0])) {
                        o.m("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                q40 value = ud0Var.value();
                if (parameterTypes.length > 1) {
                    if (!q40.class.isAssignableFrom(parameterTypes[1])) {
                        o.m("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != q40.ON_ANY) {
                        o.m("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    o.m("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new mi(i, method), value, cls);
                z = true;
            }
        }
        li liVar3 = new li(hashMap);
        hashMap2.put(cls, liVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return liVar3;
    }
}
