package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HandwritingHandler_androidKt {
    public static final Modifier handwritingHandler(Modifier modifier) {
        return StylusHandwriting_androidKt.isStylusHandwritingSupported() ? modifier.then(new HandwritingHandlerElement()) : modifier;
    }
}
