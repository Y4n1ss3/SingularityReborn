package androidx.compose.ui.platform;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class Api28ClipboardManagerClipClear {
    public static final Api28ClipboardManagerClipClear INSTANCE = new Api28ClipboardManagerClipClear();

    private Api28ClipboardManagerClipClear() {
    }

    public static final void clearPrimaryClip(android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
