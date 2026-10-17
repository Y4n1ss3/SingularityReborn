package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import defpackage.at;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LegacyPlatformTextInputServiceAdapter_androidKt {
    private static final String DEBUG_CLASS = "AndroidLegacyPlatformTextInputServiceAdapter";
    private static ky inputMethodManagerFactory = LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1.INSTANCE;

    public static final LegacyPlatformTextInputServiceAdapter createLegacyPlatformTextInputServiceAdapter() {
        return new AndroidLegacyPlatformTextInputServiceAdapter();
    }

    public static final ky getInputMethodManagerFactory() {
        return inputMethodManagerFactory;
    }

    public static final void setInputMethodManagerFactory(ky kyVar) {
        inputMethodManagerFactory = kyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (at.d()) {
            at.a().i(editorInfo);
        }
    }

    public static /* synthetic */ void getInputMethodManagerFactory$annotations() {
    }
}
