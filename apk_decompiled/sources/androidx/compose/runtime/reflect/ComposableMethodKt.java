package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import defpackage.d10;
import defpackage.j10;
import defpackage.k10;
import defpackage.p7;
import defpackage.q10;
import defpackage.y80;
import defpackage.zi;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    public static final ComposableMethod asComposableMethod(Method method) {
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    private static final int defaultParamCount(int i) {
        return (int) Math.ceil(i / 31.0d);
    }

    private static final <T> T[] dup(T t, int i) {
        k10 W = y80.W(0, i);
        ArrayList arrayList = new ArrayList(zi.a0(W, 10));
        Iterator<T> it = W.iterator();
        while (it.hasNext()) {
            ((d10) it).nextInt();
            arrayList.add(t);
        }
        q10.G();
        throw null;
    }

    private static final ComposableInfo getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (q10.b(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        length = -1;
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int changedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i2 = length + 1 + changedParamCount;
        int length2 = method.getParameterTypes().length;
        int defaultParamCount = length2 != i2 ? defaultParamCount(length) : 0;
        return new ComposableInfo(i2 + defaultParamCount == length2, length, changedParamCount, defaultParamCount);
    }

    public static final ComposableMethod getDeclaredComposableMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Class cls2 = Integer.TYPE;
        int changedParamCount = changedParamCount(clsArr.length, 0);
        try {
            p7 p7Var = new p7(3);
            ArrayList arrayList = (ArrayList) p7Var.d;
            p7Var.e(clsArr);
            p7Var.b(Composer.class);
            k10 W = y80.W(0, changedParamCount);
            ArrayList arrayList2 = new ArrayList(zi.a0(W, 10));
            Iterator it = W.iterator();
            while (((j10) it).f) {
                ((d10) it).nextInt();
                arrayList2.add(cls2);
            }
            p7Var.e(arrayList2.toArray(new Class[0]));
            method = cls.getDeclaredMethod(str, (Class[]) arrayList.toArray(new Class[arrayList.size()]));
        } catch (ReflectiveOperationException unused) {
            int defaultParamCount = defaultParamCount(clsArr.length);
            try {
                p7 p7Var2 = new p7(4);
                ArrayList arrayList3 = (ArrayList) p7Var2.d;
                p7Var2.e(clsArr);
                p7Var2.b(Composer.class);
                k10 W2 = y80.W(0, changedParamCount);
                ArrayList arrayList4 = new ArrayList(zi.a0(W2, 10));
                Iterator it2 = W2.iterator();
                while (((j10) it2).f) {
                    ((d10) it2).nextInt();
                    arrayList4.add(cls2);
                }
                p7Var2.e(arrayList4.toArray(new Class[0]));
                k10 W3 = y80.W(0, defaultParamCount);
                ArrayList arrayList5 = new ArrayList(zi.a0(W3, 10));
                Iterator it3 = W3.iterator();
                while (((j10) it3).f) {
                    ((d10) it3).nextInt();
                    arrayList5.add(cls2);
                }
                p7Var2.e(arrayList5.toArray(new Class[0]));
                method = cls.getDeclaredMethod(str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            ComposableMethod asComposableMethod = asComposableMethod(method);
            asComposableMethod.getClass();
            return asComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return !name.equals("int") ? null : 0;
            case 3039496:
                return !name.equals("byte") ? null : (byte) 0;
            case 3052374:
                return !name.equals("char") ? null : (char) 0;
            case 3327612:
                return !name.equals("long") ? null : 0L;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return !name.equals("short") ? null : (short) 0;
            default:
                return null;
        }
    }
}
