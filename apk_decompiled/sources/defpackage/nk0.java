package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class nk0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ ok0 e;

    public /* synthetic */ nk0(ok0 ok0Var, int i) {
        this.d = i;
        this.e = ok0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r0.getReturnType().equals(r9) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        if (r9.getReturnType().equals(r0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
    
        if (r1.equals(r9) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e2, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L68;
     */
    @Override // defpackage.iy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.d;
        Class cls = Integer.TYPE;
        Class<?> cls2 = null;
        boolean z = false;
        ok0 ok0Var = this.e;
        switch (i) {
            case 0:
                Class<?> loadClass = ok0Var.c.a.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass.getClass();
                Method method = loadClass.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass2 = ok0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass2.getClass();
                method.getClass();
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(loadClass2));
            case 1:
                Class<?> loadClass3 = ok0Var.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                loadClass3.getClass();
                Method method2 = loadClass3.getMethod("getBounds", null);
                Method method3 = loadClass3.getMethod("getType", null);
                Method method4 = loadClass3.getMethod("getState", null);
                method2.getClass();
                Class cls3 = ki0.a(Rect.class).d;
                cls3.getClass();
                if (method2.getReturnType().equals(cls3) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    Class cls4 = ki0.a(cls).d;
                    cls4.getClass();
                    if (method3.getReturnType().equals(cls4) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        Class cls5 = ki0.a(cls).d;
                        cls5.getClass();
                        if (method4.getReturnType().equals(cls5)) {
                            break;
                        }
                    }
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 2:
                ClassLoader classLoader = ok0Var.a;
                Class<?> loadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                loadClass4.getClass();
                Method method5 = loadClass4.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls6 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> loadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    loadClass5.getClass();
                    break;
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 3:
                Class<?> loadClass6 = ok0Var.a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                loadClass6.getClass();
                Method method6 = loadClass6.getMethod("getType", null);
                Method method7 = loadClass6.getMethod("hasProperty", cls);
                Method method8 = loadClass6.getMethod("hasProperties", int[].class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls.getClass();
                    if (method6.getReturnType().equals(cls)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls7 = Boolean.TYPE;
                            cls7.getClass();
                            if (method7.getReturnType().equals(cls7)) {
                                method8.getClass();
                                if (Modifier.isPublic(method8.getModifiers())) {
                                    break;
                                }
                            }
                        }
                    }
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 4:
                ClassLoader classLoader2 = ok0Var.a;
                Class<?> loadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass7.getClass();
                Method method9 = loadClass7.getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> loadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    loadClass8.getClass();
                    break;
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 5:
                try {
                    Class<?> loadClass9 = ok0Var.b.a.loadClass("java.util.function.Consumer");
                    loadClass9.getClass();
                    cls2 = loadClass9;
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> loadClass10 = ok0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    loadClass10.getClass();
                    Method method10 = loadClass10.getMethod("addWindowLayoutInfoListener", Activity.class, cls2);
                    Method method11 = loadClass10.getMethod("removeWindowLayoutInfoListener", cls2);
                    method10.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        break;
                    }
                    r6 = false;
                    z = r6;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(ok0.d(ok0Var));
        }
    }
}
