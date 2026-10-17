package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(InputConnection inputConnection, ky kyVar) {
        return Build.VERSION.SDK_INT >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, kyVar) : new NullableInputConnectionWrapperApi25(inputConnection, kyVar);
    }
}
