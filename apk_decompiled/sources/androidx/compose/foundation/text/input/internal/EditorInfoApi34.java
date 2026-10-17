package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import defpackage.ac;
import defpackage.p5;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class EditorInfoApi34 {
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(y80.E(p5.k(), p5.y(), p5.t(), p5.w(), p5.z(), p5.A(), p5.B()));
        editorInfo.setSupportedHandwritingGesturePreviews(ac.o0(new Class[]{p5.k(), p5.y(), p5.t(), p5.w()}));
    }
}
