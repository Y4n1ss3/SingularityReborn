package defpackage;

import android.app.Notification;
import android.graphics.Path;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class or {
    public static Path a(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static void b(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
