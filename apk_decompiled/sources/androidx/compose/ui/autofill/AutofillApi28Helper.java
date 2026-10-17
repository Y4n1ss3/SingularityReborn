package androidx.compose.ui.autofill;

import android.view.ViewStructure;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutofillApi28Helper {
    public static final int $stable = 0;
    public static final AutofillApi28Helper INSTANCE = new AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    public final void setMaxTextLength(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }
}
