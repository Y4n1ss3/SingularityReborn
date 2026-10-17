package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import androidx.compose.ui.text.AnnotatedString;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidClipboardManager implements ClipboardManager {
    public static final int $stable = 8;
    private android.content.ClipboardManager _clipboardManager;
    private final Context context;

    public AndroidClipboardManager(Context context) {
        this.context = context;
    }

    private final android.content.ClipboardManager getClipboardManager() {
        android.content.ClipboardManager clipboardManager = this._clipboardManager;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.context.getSystemService("clipboard");
        systemService.getClass();
        android.content.ClipboardManager clipboardManager2 = (android.content.ClipboardManager) systemService;
        this._clipboardManager = clipboardManager2;
        return clipboardManager2;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public ClipEntry getClip() {
        ClipData primaryClip = getClipboardManager().getPrimaryClip();
        if (primaryClip != null) {
            return new ClipEntry(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public android.content.ClipboardManager getNativeClipboard() {
        return getClipboardManager();
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public AnnotatedString getText() {
        ClipData primaryClip = getClipboardManager().getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription primaryClipDescription = getClipboardManager().getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setClip(ClipEntry clipEntry) {
        if (clipEntry == null) {
            Api28ClipboardManagerClipClear.clearPrimaryClip(getClipboardManager());
        } else {
            getClipboardManager().setPrimaryClip(clipEntry.getClipData());
        }
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(AnnotatedString annotatedString) {
        getClipboardManager().setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }
}
