package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;
import defpackage.er;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ParagraphStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, dq dqVar) {
        this(r1, r2, r3, r5, r7, r8, r9, r10, (i5 & Fields.RotationX) == 0 ? textMotion : null, (dq) null);
        int m7495getUnspecifiede0LSkKk = (i5 & 1) != 0 ? TextAlign.Companion.m7495getUnspecifiede0LSkKk() : i;
        int m7511getUnspecifieds_7Xco = (i5 & 2) != 0 ? TextDirection.Companion.m7511getUnspecifieds_7Xco() : i2;
        long m7816getUnspecifiedXSAIIZE = (i5 & 4) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j;
        TextIndent textIndent2 = (i5 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i5 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i5 & 32) != 0 ? null : lineHeightStyle;
        int m7407getUnspecifiedrAG3T2k = (i5 & 64) != 0 ? LineBreak.Companion.m7407getUnspecifiedrAG3T2k() : i3;
        int m7383getUnspecifiedvmbZdU8 = (i5 & Fields.SpotShadowColor) != 0 ? Hyphens.Companion.m7383getUnspecifiedvmbZdU8() : i4;
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6945copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = TextAlign.m7482boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = TextDirection.m7499boximpl(paragraphStyle.textDirection);
        }
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        return paragraphStyle.m6954copyElsmlbk(textAlign, textDirection, j, textIndent2);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6946copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = TextAlign.m7482boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = TextDirection.m7499boximpl(paragraphStyle.textDirection);
        }
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i & 64) != 0) {
            lineBreak = LineBreak.m7387boximpl(paragraphStyle.lineBreak);
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            hyphens = Hyphens.m7374boximpl(paragraphStyle.hyphens);
        }
        if ((i & Fields.RotationX) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        Hyphens hyphens2 = hyphens;
        TextMotion textMotion2 = textMotion;
        long j2 = j;
        return paragraphStyle.m6955copyNH1kkwU(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6947copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = TextAlign.m7482boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = TextDirection.m7499boximpl(paragraphStyle.textDirection);
        }
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i & 64) != 0) {
            lineBreak = LineBreak.m7387boximpl(paragraphStyle.lineBreak);
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            hyphens = Hyphens.m7374boximpl(paragraphStyle.hyphens);
        }
        Hyphens hyphens2 = hyphens;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j2 = j;
        return paragraphStyle.m6956copyciSxzs0(textAlign, textDirection, j2, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6948copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = TextAlign.m7482boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = TextDirection.m7499boximpl(paragraphStyle.textDirection);
        }
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j2 = j;
        return paragraphStyle.m6957copyxPh5V4g(textAlign, textDirection, j2, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6949copyykzQM6k$default(ParagraphStyle paragraphStyle, int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = paragraphStyle.textAlign;
        }
        if ((i5 & 2) != 0) {
            i2 = paragraphStyle.textDirection;
        }
        if ((i5 & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        if ((i5 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i5 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i5 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i5 & 64) != 0) {
            i3 = paragraphStyle.lineBreak;
        }
        if ((i5 & Fields.SpotShadowColor) != 0) {
            i4 = paragraphStyle.hyphens;
        }
        if ((i5 & Fields.RotationX) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        int i6 = i4;
        TextMotion textMotion2 = textMotion;
        long j2 = j;
        return paragraphStyle.m6958copyykzQM6k(i, i2, j2, textIndent, platformParagraphStyle, lineHeightStyle, i3, i6, textMotion2);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @er
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6954copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent) {
        return new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (dq) null);
    }

    @er
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6955copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), textMotion, (dq) null);
    }

    @er
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6956copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), this.textMotion, (dq) null);
    }

    @er
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6957copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (dq) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m6958copyykzQM6k(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        return new ParagraphStyle(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, textMotion, (dq) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return TextAlign.m7485equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m7502equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m7802equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && q10.b(this.textIndent, paragraphStyle.textIndent) && q10.b(this.platformStyle, paragraphStyle.platformStyle) && q10.b(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m7393equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m7377equalsimpl0(this.hyphens, paragraphStyle.hyphens) && q10.b(this.textMotion, paragraphStyle.textMotion);
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m6959getHyphensEaSxIns() {
        return Hyphens.m7374boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m6960getHyphensvmbZdU8() {
        return this.hyphens;
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m6961getLineBreakLgCVezo() {
        return LineBreak.m7387boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m6962getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m6963getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m6964getTextAlignbuA522U() {
        return TextAlign.m7482boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m6965getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m6966getTextDirectionmmuk1to() {
        return TextDirection.m7499boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m6967getTextDirections_7Xco() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int m7806hashCodeimpl = (TextUnit.m7806hashCodeimpl(this.lineHeight) + ((TextDirection.m7503hashCodeimpl(this.textDirection) + (TextAlign.m7486hashCodeimpl(this.textAlign) * 31)) * 31)) * 31;
        TextIndent textIndent = this.textIndent;
        int hashCode = (m7806hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int hashCode2 = (hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int m7378hashCodeimpl = (Hyphens.m7378hashCodeimpl(this.hyphens) + ((LineBreak.m7397hashCodeimpl(this.lineBreak) + ((hashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31)) * 31)) * 31;
        TextMotion textMotion = this.textMotion;
        return m7378hashCodeimpl + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m6968fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m7487toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m7504toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m7812toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m7398toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m7379toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    @er
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m6950getHyphensEaSxIns$annotations() {
    }

    @er
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m6951getLineBreakLgCVezo$annotations() {
    }

    @er
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m6952getTextAlignbuA522U$annotations() {
    }

    @er
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m6953getTextDirectionmmuk1to$annotations() {
    }

    @er
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, dq dqVar) {
        this(textAlign, textDirection, j, textIndent);
    }

    @er
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, dq dqVar) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @er
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, dq dqVar) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @er
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, dq dqVar) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    private ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this.textAlign = i;
        this.textDirection = i2;
        this.lineHeight = j;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i3;
        this.hyphens = i4;
        this.textMotion = textMotion;
        if (TextUnit.m7802equalsimpl0(j, TextUnit.Companion.m7816getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m7805getValueimpl(j) >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m7805getValueimpl(j) + ')');
    }

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, dq dqVar) {
        this(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, textMotion);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, dq dqVar) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & Fields.SpotShadowColor) != 0 ? null : hyphens, (i & Fields.RotationX) != 0 ? null : textMotion, (dq) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), textMotion, (dq) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, dq dqVar) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent) {
        this(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), (TextMotion) null, (dq) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i, dq dqVar) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), (TextMotion) null, (dq) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, dq dqVar) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & Fields.SpotShadowColor) != 0 ? null : hyphens, (dq) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), (TextMotion) null, (dq) null);
    }
}
