package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import defpackage.dq;
import defpackage.fi0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextAnnotatorScope {
    private final AnnotatedString initialText;
    private AnnotatedString styledText;

    public TextAnnotatorScope(AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.styledText = annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString.Range replaceStyle$lambda$0(fi0 fi0Var, AnnotatedString.Range range, SpanStyle spanStyle, AnnotatedString.Range range2) {
        AnnotatedString.Range range3;
        AnnotatedString.Range range4;
        if (fi0Var.d && (range2.getItem() instanceof SpanStyle) && range2.getStart() == range.getStart() && range2.getEnd() == range.getEnd()) {
            range3 = new AnnotatedString.Range(spanStyle == null ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (dq) null) : spanStyle, range2.getStart(), range2.getEnd());
            range4 = range2;
        } else {
            range3 = range2;
            range4 = range3;
        }
        fi0Var.d = q10.b(range, range4);
        return range3;
    }

    public final AnnotatedString getStyledText() {
        return this.styledText;
    }

    public final void replaceStyle(AnnotatedString.Range<LinkAnnotation> range, SpanStyle spanStyle) {
        this.styledText = this.initialText.mapAnnotations(new g(new fi0(), range, spanStyle, 0));
    }

    public final void setStyledText(AnnotatedString annotatedString) {
        this.styledText = annotatedString;
    }
}
