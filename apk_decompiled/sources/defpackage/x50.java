package defpackage;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class x50 {
    public static final ProvidableCompositionLocal a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object jj0Var;
        try {
            ClassLoader classLoader = y40.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof er) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            jj0Var = new jj0(th);
        }
        ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) (jj0Var instanceof jj0 ? null : jj0Var);
        if (providableCompositionLocal == null) {
            providableCompositionLocal = CompositionLocalKt.staticCompositionLocalOf(new ms(9));
        }
        a = providableCompositionLocal;
    }
}
