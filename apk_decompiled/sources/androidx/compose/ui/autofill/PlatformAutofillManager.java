package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PlatformAutofillManager {
    void cancel();

    void commit();

    void notifyValueChanged(View view, int i, AutofillValue autofillValue);

    void notifyViewEntered(View view, int i, Rect rect);

    void notifyViewExited(View view, int i);

    void notifyViewVisibilityChanged(View view, int i, boolean z);

    void requestAutofill(View view, int i, Rect rect);
}
