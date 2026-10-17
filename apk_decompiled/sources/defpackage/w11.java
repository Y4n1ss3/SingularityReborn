package defpackage;

import java.io.Closeable;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class w11 {
    private final x11 impl = new x11();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        str.getClass();
        autoCloseable.getClass();
        x11 x11Var = this.impl;
        if (x11Var != null) {
            if (x11Var.d) {
                x11.a(autoCloseable);
                return;
            }
            synchronized (x11Var.a) {
                autoCloseable2 = (AutoCloseable) x11Var.b.put(str, autoCloseable);
            }
            x11.a(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        x11 x11Var = this.impl;
        if (x11Var != null && !x11Var.d) {
            x11Var.d = true;
            synchronized (x11Var.a) {
                try {
                    Iterator it = x11Var.b.values().iterator();
                    while (it.hasNext()) {
                        x11.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = x11Var.c.iterator();
                    while (it2.hasNext()) {
                        x11.a((AutoCloseable) it2.next());
                    }
                    x11Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        str.getClass();
        x11 x11Var = this.impl;
        if (x11Var == null) {
            return null;
        }
        synchronized (x11Var.a) {
            t = (T) x11Var.b.get(str);
        }
        return t;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        x11 x11Var = this.impl;
        if (x11Var != null) {
            if (x11Var.d) {
                x11.a(autoCloseable);
                return;
            }
            synchronized (x11Var.a) {
                x11Var.c.add(autoCloseable);
            }
        }
    }

    @er
    public void addCloseable(Closeable closeable) {
        closeable.getClass();
        x11 x11Var = this.impl;
        if (x11Var != null) {
            if (x11Var.d) {
                x11.a(closeable);
                return;
            }
            synchronized (x11Var.a) {
                x11Var.c.add(closeable);
            }
        }
    }
}
