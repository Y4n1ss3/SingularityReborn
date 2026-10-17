package androidx.compose.ui.platform;

import android.content.Context;
import defpackage.hm;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidClipboard implements Clipboard {
    public static final int $stable = 8;
    private final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboard(Context context) {
        this(new AndroidClipboardManager(context));
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object getClipEntry(hm hmVar) {
        return this.androidClipboardManager.getClip();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public android.content.ClipboardManager getNativeClipboard() {
        return this.androidClipboardManager.getNativeClipboard();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object setClipEntry(ClipEntry clipEntry, hm hmVar) {
        this.androidClipboardManager.setClip(clipEntry);
        return w01.a;
    }

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }
}
