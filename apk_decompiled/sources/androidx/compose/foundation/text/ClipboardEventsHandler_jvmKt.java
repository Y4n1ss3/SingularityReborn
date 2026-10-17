package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClipboardEventsHandler_jvmKt {
    public static final void rememberClipboardEventsHandler(ky kyVar, iy iyVar, iy iyVar2, boolean z, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1 = ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$2 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$2 = new iy() { // from class: androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$2
                @Override // defpackage.iy
                public final Void invoke() {
                    return null;
                }
            };
        }
        if ((i2 & 4) != 0) {
            ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3 = ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3.INSTANCE;
        }
    }
}
