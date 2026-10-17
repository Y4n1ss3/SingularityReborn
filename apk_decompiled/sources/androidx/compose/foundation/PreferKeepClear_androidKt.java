package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PreferKeepClear_androidKt {
    public static final Modifier preferKeepClear(Modifier modifier) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(null));
    }

    private static final Modifier preferKeepClearT(ky kyVar) {
        return new PreferKeepClearElement(kyVar);
    }

    public static final Modifier preferKeepClear(Modifier modifier, ky kyVar) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(kyVar));
    }
}
