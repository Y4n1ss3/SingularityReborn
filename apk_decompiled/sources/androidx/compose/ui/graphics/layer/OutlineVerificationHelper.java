package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OutlineVerificationHelper {
    public static final int $stable = 0;
    public static final OutlineVerificationHelper INSTANCE = new OutlineVerificationHelper();

    private OutlineVerificationHelper() {
    }

    public final void setPath(Outline outline, Path path) {
        if (path instanceof AndroidPath) {
            outline.setPath(((AndroidPath) path).getInternalPath());
        } else {
            lu0.a("Unable to obtain android.graphics.Path");
        }
    }
}
