package androidx.compose.foundation.internal;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ClipboardUtils {
    public static final int $stable = 0;
    public static final ClipboardUtils INSTANCE = new ClipboardUtils();

    private ClipboardUtils() {
    }

    public static final boolean hasText(Clipboard clipboard) {
        ClipDescription primaryClipDescription = clipboard.getNativeClipboard().getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*");
    }

    public static final AnnotatedString readAnnotatedString(ClipEntry clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return ClipboardUtils_androidKt.convertToAnnotatedString(text);
    }

    public static final String readText(ClipEntry clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public static final ClipEntry toClipEntry(AnnotatedString annotatedString) {
        if (annotatedString == null) {
            return null;
        }
        return new ClipEntry(ClipData.newPlainText("plain text", ClipboardUtils_androidKt.convertToCharSequence(annotatedString)));
    }

    public static final boolean hasText(ClipEntry clipEntry) {
        if (clipEntry == null) {
            return false;
        }
        return clipEntry.getClipData().getDescription().hasMimeType("text/*");
    }
}
