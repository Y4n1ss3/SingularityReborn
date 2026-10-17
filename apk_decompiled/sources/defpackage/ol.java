package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ol implements InvocationHandler {
    public final ji a;
    public final uu b;

    public ol(ji jiVar, uu uuVar) {
        this.a = jiVar;
        this.b = uuVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean b = q10.b(method.getName(), "accept");
        uu uuVar = this.b;
        if (b && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            ji jiVar = this.a;
            if (jiVar.c(obj2)) {
                obj2.getClass();
                uuVar.invoke(obj2);
                return w01.a;
            }
            throw new ClassCastException("Value cannot be cast to " + jiVar.a());
        }
        if (q10.b(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (q10.b(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(uuVar.hashCode());
        }
        if (q10.b(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return uuVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
