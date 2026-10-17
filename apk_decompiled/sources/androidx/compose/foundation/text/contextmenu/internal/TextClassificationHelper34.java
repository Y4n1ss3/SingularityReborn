package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.util.Log;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextClassificationHelper34 {
    public static final TextClassificationHelper34 INSTANCE = new TextClassificationHelper34();

    private TextClassificationHelper34() {
    }

    public final void sendIntentAllowBackgroundActivityStart(PendingIntent pendingIntent) {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        try {
            pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
            pendingIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e(TextContextMenuTextClassificationHelper_androidKt.TAG, "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }
}
