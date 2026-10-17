package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ok0 {
    public final ClassLoader a;
    public final ql b;
    public final ql c;

    public ok0(ClassLoader classLoader, ql qlVar) {
        this.a = classLoader;
        this.b = qlVar;
        this.c = new ql(classLoader, 1);
    }

    public static final boolean d(ok0 ok0Var) {
        Class<?> loadClass = ok0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return Modifier.isPublic(method2.getModifiers());
    }

    public final WindowLayoutComponent a() {
        int a;
        ql qlVar = this.c;
        boolean z = false;
        try {
            qlVar.a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (d41.P("WindowExtensionsProvider#getWindowExtensions is not valid", new i2(qlVar, 26)) && d41.P("WindowExtensions#getWindowLayoutComponent is not valid", new nk0(this, 0)) && d41.P("FoldingFeature class is not valid", new nk0(this, 1)) && (a = zu.a()) >= 1) {
                if (a == 1) {
                    z = c();
                } else if (a < 5) {
                    z = b();
                } else if (b() && d41.P("DisplayFoldFeature is not valid", new nk0(this, 3)) && d41.P("SupportedWindowFeatures is not valid", new nk0(this, 2)) && d41.P("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new nk0(this, 4))) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return d41.P(sb.toString(), new nk0(this, 6));
    }

    public final boolean c() {
        return d41.P("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new nk0(this, 5));
    }
}
