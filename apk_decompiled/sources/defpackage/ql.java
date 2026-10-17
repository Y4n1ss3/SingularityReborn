package defpackage;

import android.app.Activity;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ql {
    public final ClassLoader a;

    public ql(ClassLoader classLoader, int i) {
        switch (i) {
            case 1:
                this.a = classLoader;
                break;
            default:
                classLoader.getClass();
                this.a = classLoader;
                break;
        }
    }

    public pl a(Object obj, ji jiVar, Activity activity, uu uuVar) {
        ol olVar = new ol(jiVar, uuVar);
        ClassLoader classLoader = this.a;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, olVar);
        newProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(obj, activity, newProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> loadClass3 = classLoader.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new pl(cls2.getMethod("removeWindowLayoutInfoListener", loadClass3), obj, newProxyInstance);
    }
}
