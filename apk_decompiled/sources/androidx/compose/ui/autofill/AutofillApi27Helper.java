package androidx.compose.ui.autofill;

import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutofillApi27Helper {
    public static final int $stable = 0;
    public static final AutofillApi27Helper INSTANCE = new AutofillApi27Helper();

    private AutofillApi27Helper() {
    }

    public final void notifyViewVisibilityChanged(View view, android.view.autofill.AutofillManager autofillManager, int i, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i, z);
    }
}
