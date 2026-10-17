package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public interface ClipboardManager {
    default ClipEntry getClip() {
        return null;
    }

    default android.content.ClipboardManager getNativeClipboard() {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    AnnotatedString getText();

    default boolean hasText() {
        AnnotatedString text = getText();
        return text != null && text.length() > 0;
    }

    void setText(AnnotatedString annotatedString);

    default void setClip(ClipEntry clipEntry) {
    }
}
