package androidx.compose.ui.platform;

import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Clipboard {
    Object getClipEntry(hm hmVar);

    android.content.ClipboardManager getNativeClipboard();

    Object setClipEntry(ClipEntry clipEntry, hm hmVar);
}
