package androidx.compose.ui.platform;

import android.net.Uri;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClipboardExtensions_androidKt {
    public static final Uri firstUriOrNull(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = clipEntry.getClipData().getItemAt(i).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}
