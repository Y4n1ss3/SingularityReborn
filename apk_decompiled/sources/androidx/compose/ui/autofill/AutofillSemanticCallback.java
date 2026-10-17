package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutofillSemanticCallback extends AutofillManager.AutofillCallback {
    public static final AutofillSemanticCallback INSTANCE = new AutofillSemanticCallback();
    public static final int $stable = 8;

    private AutofillSemanticCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i, int i2) {
        super.onAutofillEvent(view, i, i2);
        Log.d("Autofill Status", i2 != 1 ? i2 != 2 ? i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }

    public final void register(AndroidAutofillManager androidAutofillManager) {
        PlatformAutofillManager platformAutofillManager = androidAutofillManager.getPlatformAutofillManager();
        platformAutofillManager.getClass();
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().registerCallback(this);
    }

    public final void unregister(AndroidAutofillManager androidAutofillManager) {
        PlatformAutofillManager platformAutofillManager = androidAutofillManager.getPlatformAutofillManager();
        platformAutofillManager.getClass();
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().unregisterCallback(this);
    }
}
