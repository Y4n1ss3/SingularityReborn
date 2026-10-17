package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ld0 {
    public static final ld0 a = new ld0();

    public final OnBackInvokedCallback a(final iy iyVar) {
        iyVar.getClass();
        return new OnBackInvokedCallback() { // from class: kd0
            public final void onBackInvoked() {
                iy.this.invoke();
            }
        };
    }

    public final void b(Object obj, int i, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
