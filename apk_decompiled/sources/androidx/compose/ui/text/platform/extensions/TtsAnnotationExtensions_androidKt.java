package androidx.compose.ui.text.platform.extensions;

import android.text.style.TtsSpan;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TtsAnnotationExtensions_androidKt {
    public static final TtsSpan toSpan(TtsAnnotation ttsAnnotation) {
        if (ttsAnnotation instanceof VerbatimTtsAnnotation) {
            return toSpan((VerbatimTtsAnnotation) ttsAnnotation);
        }
        o.n();
        return null;
    }

    public static final TtsSpan toSpan(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
