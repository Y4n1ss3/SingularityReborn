package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.platform.Clipboard;
import defpackage.hm;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClipboardPasteState {
    public static final int $stable = 8;
    private boolean _hasClip;
    private boolean _hasText;
    private final Clipboard clipboard;

    public ClipboardPasteState(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final boolean getHasClip() {
        return this._hasClip;
    }

    public final boolean getHasText() {
        return this._hasText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2.hasMimeType("text/*") == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object update(hm hmVar) {
        boolean hasPrimaryClip = this.clipboard.getNativeClipboard().hasPrimaryClip();
        this._hasClip = hasPrimaryClip;
        boolean z = hasPrimaryClip && (r2 = this.clipboard.getNativeClipboard().getPrimaryClipDescription()) != null;
        this._hasText = z;
        return w01.a;
    }
}
