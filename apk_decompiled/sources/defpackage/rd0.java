package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class rd0 {
    public final Runnable a;
    public final qb b = new qb();
    public hd0 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public rd0(Runnable runnable) {
        OnBackInvokedCallback a;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                int i2 = 0;
                int i3 = 1;
                a = nd0.a.a(new id0(this, i2), new id0(this, i3), new jd0(this, i2), new jd0(this, i3));
            } else {
                a = ld0.a.a(new jd0(this, 2));
            }
            this.d = a;
        }
    }

    public final void a(y40 y40Var, hd0 hd0Var) {
        y40Var.getClass();
        hd0Var.getClass();
        s40 lifecycle = y40Var.getLifecycle();
        if (((a50) lifecycle).d == r40.d) {
            return;
        }
        hd0Var.addCancellable(new od0(this, lifecycle, hd0Var));
        d();
        hd0Var.setEnabledChangedCallback$activity_release(new qd0(0, this, rd0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        hd0 hd0Var;
        hd0 hd0Var2 = this.c;
        if (hd0Var2 == null) {
            qb qbVar = this.b;
            ListIterator listIterator = qbVar.listIterator(qbVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    hd0Var = 0;
                    break;
                } else {
                    hd0Var = listIterator.previous();
                    if (((hd0) hd0Var).isEnabled()) {
                        break;
                    }
                }
            }
            hd0Var2 = hd0Var;
        }
        this.c = null;
        if (hd0Var2 != null) {
            hd0Var2.handleOnBackPressed();
        } else {
            this.a.run();
        }
    }

    public final void c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        ld0 ld0Var = ld0.a;
        if (z && !this.f) {
            ld0Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            ld0Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z = this.g;
        boolean z2 = false;
        qb qbVar = this.b;
        if (qbVar == null || !qbVar.isEmpty()) {
            Iterator it = qbVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((hd0) it.next()).isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z2);
    }
}
