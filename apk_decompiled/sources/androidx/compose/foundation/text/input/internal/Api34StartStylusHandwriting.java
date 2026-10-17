package androidx.compose.foundation.text.input.internal;

import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Api34StartStylusHandwriting {
    public static final int $stable = 0;
    public static final Api34StartStylusHandwriting INSTANCE = new Api34StartStylusHandwriting();

    private Api34StartStylusHandwriting() {
    }

    public final void startStylusHandwriting(android.view.inputmethod.InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
