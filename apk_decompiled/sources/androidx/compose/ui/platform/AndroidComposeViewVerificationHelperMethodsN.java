package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    public final void setPointerIcon(View view, PointerIcon pointerIcon) {
        android.view.PointerIcon androidPointerIcon = toAndroidPointerIcon(view.getContext(), pointerIcon);
        if (q10.b(view.getPointerIcon(), androidPointerIcon)) {
            return;
        }
        view.setPointerIcon(androidPointerIcon);
    }

    public final android.view.PointerIcon toAndroidPointerIcon(Context context, PointerIcon pointerIcon) {
        return pointerIcon instanceof AndroidPointerIcon ? ((AndroidPointerIcon) pointerIcon).getPointerIcon() : pointerIcon instanceof AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) pointerIcon).getType()) : android.view.PointerIcon.getSystemIcon(context, 1000);
    }
}
