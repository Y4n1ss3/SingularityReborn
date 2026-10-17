package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import defpackage.ac;
import defpackage.d10;
import defpackage.k10;
import defpackage.o;
import defpackage.q10;
import defpackage.y80;
import defpackage.zi;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableMethod {
    public static final int $stable = 8;
    private final ComposableInfo composableInfo;
    private final Method method;

    public ComposableMethod(Method method, ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    public final Method asMethod() {
        return this.method;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComposableMethod) {
            return q10.b(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Class<?>[] getParameterTypes() {
        return (Class[]) ac.V(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Parameter[] getParameters() {
        return (Parameter[]) ac.V(this.method.getParameters(), 0, this.composableInfo.getRealParamsCount());
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public final Object invoke(Composer composer, Object obj, Object... objArr) {
        Object obj2;
        ComposableInfo composableInfo = this.composableInfo;
        int component2 = composableInfo.component2();
        int component3 = composableInfo.component3();
        int component4 = composableInfo.component4();
        int length = this.method.getParameterTypes().length;
        int i = component2 + 1;
        int i2 = component3 + i;
        int i3 = 0;
        Object[] objArr2 = new Integer[component4];
        int i4 = 0;
        while (i4 < component4) {
            int i5 = i4 * 31;
            k10 W = y80.W(i5, Math.min(i5 + 31, component2));
            ArrayList arrayList = new ArrayList(zi.a0(W, 10));
            Iterator it = W.iterator();
            while (it.hasNext()) {
                int nextInt = ((d10) it).nextInt();
                arrayList.add(Integer.valueOf((nextInt >= objArr.length || objArr[nextInt] == null) ? 1 : i3));
            }
            int size = arrayList.size();
            int i6 = i3;
            int i7 = i6;
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                int i8 = i7 + 1;
                if (i7 < 0) {
                    y80.V();
                    throw null;
                }
                i6 |= ((Number) obj3).intValue() << i7;
                i7 = i8;
            }
            objArr2[i4] = Integer.valueOf(i6);
            i4++;
            i3 = 0;
        }
        Object[] objArr3 = new Object[length];
        int i9 = 0;
        while (i9 < length) {
            if (i9 >= 0 && i9 < component2) {
                obj2 = (i9 < 0 || i9 >= objArr.length) ? ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i9]) : objArr[i9];
            } else if (i9 == component2) {
                obj2 = composer;
            } else if (i9 == i || (component2 + 2 <= i9 && i9 < i2)) {
                obj2 = 0;
            } else {
                if (i2 > i9 || i9 >= length) {
                    o.f("Unexpected index");
                    return null;
                }
                obj2 = objArr2[i9 - i2];
            }
            objArr3[i9] = obj2;
            i9++;
        }
        return this.method.invoke(obj, Arrays.copyOf(objArr3, length));
    }
}
