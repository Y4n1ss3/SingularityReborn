package defpackage;

import androidx.compose.runtime.internal.ComposableLambda;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ji implements l20, j20 {
    public static final Map e;
    public final Class d;

    static {
        List E = y80.E(iy.class, ky.class, my.class, ny.class, oy.class, py.class, qy.class, ry.class, sy.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, jy.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ly.class);
        ArrayList arrayList = new ArrayList(zi.a0(E, 10));
        int i = 0;
        for (Object obj : E) {
            int i2 = i + 1;
            if (i < 0) {
                y80.V();
                throw null;
            }
            arrayList.add(new xe0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        e = p80.P(arrayList);
    }

    public ji(Class cls) {
        cls.getClass();
        this.d = cls;
    }

    public final String a() {
        String l;
        Class cls = this.d;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String l2 = p10.l(cls.getName());
            return l2 == null ? cls.getCanonicalName() : l2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (l = p10.l(componentType.getName())) != null) {
            str = l.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String b() {
        String N;
        Class cls = this.d;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String N2 = p10.N(cls.getName());
                return N2 == null ? cls.getSimpleName() : N2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (N = p10.N(componentType.getName())) != null) {
                str = N.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ds0.x0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int l0 = ds0.l0(simpleName, '$', 0, 6);
            return l0 == -1 ? simpleName : simpleName.substring(l0 + 1, simpleName.length());
        }
        return ds0.x0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean c(Object obj) {
        Class cls = this.d;
        cls.getClass();
        Map map = e;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return p01.r(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = p10.t(ki0.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ji) && p10.t(this).equals(p10.t((ji) obj));
    }

    public final int hashCode() {
        return p10.t(this).hashCode();
    }

    public final String toString() {
        return this.d + " (Kotlin reflection is not available)";
    }
}
