package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class mc implements hm, wn, Serializable {
    private final hm completion;

    public mc(hm hmVar) {
        this.completion = hmVar;
    }

    public hm create(hm hmVar) {
        hmVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public wn getCallerFrame() {
        hm hmVar = this.completion;
        if (hmVar instanceof wn) {
            return (wn) hmVar;
        }
        return null;
    }

    public final hm getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        bq bqVar = (bq) getClass().getAnnotation(bq.class);
        String str2 = null;
        if (bqVar == null) {
            return null;
        }
        int v = bqVar.v();
        if (v > 1) {
            o.g("Debug metadata version mismatch. Expected: 1, got ", v, ". Please update the Kotlin standard library.");
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? bqVar.l()[i] : -1;
        c8 c8Var = p10.e;
        c8 c8Var2 = p10.f;
        if (c8Var2 == null) {
            try {
                c8 c8Var3 = new c8(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                p10.f = c8Var3;
                c8Var2 = c8Var3;
            } catch (Exception unused2) {
                p10.f = c8Var;
                c8Var2 = c8Var;
            }
        }
        if (c8Var2 != c8Var && (method = (Method) c8Var2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c8Var2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) c8Var2.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = bqVar.c();
        } else {
            str = str2 + '/' + bqVar.c();
        }
        return new StackTraceElement(str, bqVar.m(), bqVar.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        while (true) {
            mc mcVar = this;
            hm hmVar = mcVar.completion;
            hmVar.getClass();
            try {
                obj = mcVar.invokeSuspend(obj);
                if (obj == vn.d) {
                    return;
                }
            } catch (Throwable th) {
                obj = new jj0(th);
            }
            mcVar.releaseIntercepted();
            if (!(hmVar instanceof mc)) {
                hmVar.resumeWith(obj);
                return;
            }
            this = hmVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public hm create(Object obj, hm hmVar) {
        hmVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
