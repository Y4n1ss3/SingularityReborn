package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class fl0 {
    public final gl0 a;
    public final el0 b;

    public fl0(gl0 gl0Var) {
        this.a = gl0Var;
        this.b = new el0(gl0Var);
    }

    public final void a(Bundle bundle) {
        gl0 gl0Var = this.a;
        hl0 hl0Var = gl0Var.a;
        if (!gl0Var.e) {
            gl0Var.a();
        }
        if (((a50) hl0Var.getLifecycle()).d.compareTo(r40.g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((a50) hl0Var.getLifecycle()).d).toString());
        }
        if (gl0Var.g) {
            o.f("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = q10.t("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        gl0Var.f = bundle2;
        gl0Var.g = true;
    }

    public final void b(Bundle bundle) {
        gl0 gl0Var = this.a;
        Bundle g = p10.g((xe0[]) Arrays.copyOf(new xe0[0], 0));
        Bundle bundle2 = gl0Var.f;
        if (bundle2 != null) {
            g.putAll(bundle2);
        }
        synchronized (gl0Var.c) {
            for (Map.Entry entry : gl0Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((dl0) entry.getValue()).a();
                str.getClass();
                a.getClass();
                g.putBundle(str, a);
            }
        }
        if (g.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", g);
    }
}
