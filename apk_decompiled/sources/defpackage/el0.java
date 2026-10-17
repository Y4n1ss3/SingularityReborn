package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class el0 {
    public final gl0 a;
    public ci0 b;

    public el0(gl0 gl0Var) {
        this.a = gl0Var;
    }

    public final Bundle a(String str) {
        gl0 gl0Var = this.a;
        if (!gl0Var.g) {
            o.f("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = gl0Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle t = bundle.containsKey(str) ? q10.t(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            gl0Var.f = null;
        }
        return t;
    }

    public final dl0 b(String str) {
        dl0 dl0Var;
        gl0 gl0Var = this.a;
        synchronized (gl0Var.c) {
            Iterator it = gl0Var.d.entrySet().iterator();
            do {
                dl0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                dl0 dl0Var2 = (dl0) entry.getValue();
                if (q10.b(str2, str)) {
                    dl0Var = dl0Var2;
                }
            } while (dl0Var == null);
        }
        return dl0Var;
    }

    public final void c(String str, dl0 dl0Var) {
        gl0 gl0Var = this.a;
        synchronized (gl0Var.c) {
            if (gl0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            gl0Var.d.put(str, dl0Var);
        }
    }

    public final void d() {
        if (!this.a.h) {
            o.f("Can not perform this action after onSaveInstanceState");
            return;
        }
        ci0 ci0Var = this.b;
        if (ci0Var == null) {
            ci0Var = new ci0(this);
        }
        this.b = ci0Var;
        try {
            n40.class.getDeclaredConstructor(null);
            ci0 ci0Var2 = this.b;
            if (ci0Var2 != null) {
                ci0Var2.a.add(n40.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + n40.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
