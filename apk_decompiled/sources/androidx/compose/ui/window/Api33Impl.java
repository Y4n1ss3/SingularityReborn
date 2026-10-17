package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class Api33Impl {
    public static final Api33Impl INSTANCE = new Api33Impl();

    private Api33Impl() {
    }

    public static final OnBackInvokedCallback createBackCallback(final iy iyVar) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.a
            public final void onBackInvoked() {
                Api33Impl.createBackCallback$lambda$0(iy.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBackCallback$lambda$0(iy iyVar) {
        if (iyVar != null) {
            iyVar.invoke();
        }
    }

    public static final void maybeRegisterBackCallback(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void maybeUnregisterBackCallback(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
