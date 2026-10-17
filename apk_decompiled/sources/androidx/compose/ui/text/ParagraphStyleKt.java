package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0048, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m7802equalsimpl0(r11, r24.m6963getLineHeightXSAIIZE()) != false) goto L17;
     */
    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ParagraphStyle m6968fastMergej5T8yCg(ParagraphStyle paragraphStyle, int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        long j2;
        long j3;
        int i5 = i;
        TextIndent textIndent2 = textIndent;
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m7485equalsimpl0(i5, companion.m7495getUnspecifiede0LSkKk()) || TextAlign.m7485equalsimpl0(i5, paragraphStyle.m6965getTextAligne0LSkKk())) {
            if (TextUnit.m7803getRawTypeimpl(j) == 0) {
                j2 = 0;
                j3 = j;
            } else {
                j2 = 0;
                j3 = j;
            }
            if ((textIndent2 == null || textIndent2.equals(paragraphStyle.getTextIndent())) && ((TextDirection.m7502equalsimpl0(i2, TextDirection.Companion.m7511getUnspecifieds_7Xco()) || TextDirection.m7502equalsimpl0(i2, paragraphStyle.m6967getTextDirections_7Xco())) && ((platformParagraphStyle == null || platformParagraphStyle.equals(paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || lineHeightStyle.equals(paragraphStyle.getLineHeightStyle())) && ((LineBreak.m7393equalsimpl0(i3, LineBreak.Companion.m7407getUnspecifiedrAG3T2k()) || LineBreak.m7393equalsimpl0(i3, paragraphStyle.m6962getLineBreakrAG3T2k())) && ((Hyphens.m7377equalsimpl0(i4, Hyphens.Companion.m7383getUnspecifiedvmbZdU8()) || Hyphens.m7377equalsimpl0(i4, paragraphStyle.m6960getHyphensvmbZdU8())) && (textMotion == null || textMotion.equals(paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j2 = 0;
            j3 = j;
        }
        long m6963getLineHeightXSAIIZE = TextUnit.m7803getRawTypeimpl(j3) == j2 ? paragraphStyle.m6963getLineHeightXSAIIZE() : j3;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (TextAlign.m7485equalsimpl0(i5, companion.m7495getUnspecifiede0LSkKk())) {
            i5 = paragraphStyle.m6965getTextAligne0LSkKk();
        }
        return new ParagraphStyle(i5, !TextDirection.m7502equalsimpl0(i2, TextDirection.Companion.m7511getUnspecifieds_7Xco()) ? i2 : paragraphStyle.m6967getTextDirections_7Xco(), m6963getLineHeightXSAIIZE, textIndent3, mergePlatformStyle(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !LineBreak.m7393equalsimpl0(i3, LineBreak.Companion.m7407getUnspecifiedrAG3T2k()) ? i3 : paragraphStyle.m6962getLineBreakrAG3T2k(), !Hyphens.m7377equalsimpl0(i4, Hyphens.Companion.m7383getUnspecifiedvmbZdU8()) ? i4 : paragraphStyle.m6960getHyphensvmbZdU8(), textMotion == null ? paragraphStyle.getTextMotion() : textMotion, (dq) null);
    }

    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f) {
        int m7488unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m7482boximpl(paragraphStyle.m6965getTextAligne0LSkKk()), TextAlign.m7482boximpl(paragraphStyle2.m6965getTextAligne0LSkKk()), f)).m7488unboximpl();
        int m7505unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m7499boximpl(paragraphStyle.m6967getTextDirections_7Xco()), TextDirection.m7499boximpl(paragraphStyle2.m6967getTextDirections_7Xco()), f)).m7505unboximpl();
        long m7007lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m7007lerpTextUnitInheritableC3pnCVY(paragraphStyle.m6963getLineHeightXSAIIZE(), paragraphStyle2.m6963getLineHeightXSAIIZE(), f);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(m7488unboximpl, m7505unboximpl, m7007lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m7387boximpl(paragraphStyle.m6962getLineBreakrAG3T2k()), LineBreak.m7387boximpl(paragraphStyle2.m6962getLineBreakrAG3T2k()), f)).m7399unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m7374boximpl(paragraphStyle.m6960getHyphensvmbZdU8()), Hyphens.m7374boximpl(paragraphStyle2.m6960getHyphensvmbZdU8()), f)).m7380unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), (dq) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        return paragraphStyle.getPlatformStyle() == null ? platformParagraphStyle : platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int m6965getTextAligne0LSkKk = paragraphStyle.m6965getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        int m7494getStarte0LSkKk = TextAlign.m7485equalsimpl0(m6965getTextAligne0LSkKk, companion.m7495getUnspecifiede0LSkKk()) ? companion.m7494getStarte0LSkKk() : paragraphStyle.m6965getTextAligne0LSkKk();
        int m7106resolveTextDirectionIhaHGbI = TextStyleKt.m7106resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m6967getTextDirections_7Xco());
        long m6963getLineHeightXSAIIZE = TextUnit.m7803getRawTypeimpl(paragraphStyle.m6963getLineHeightXSAIIZE()) == 0 ? DefaultLineHeight : paragraphStyle.m6963getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int m6962getLineBreakrAG3T2k = paragraphStyle.m6962getLineBreakrAG3T2k();
        LineBreak.Companion companion2 = LineBreak.Companion;
        int m7406getSimplerAG3T2k = LineBreak.m7393equalsimpl0(m6962getLineBreakrAG3T2k, companion2.m7407getUnspecifiedrAG3T2k()) ? companion2.m7406getSimplerAG3T2k() : paragraphStyle.m6962getLineBreakrAG3T2k();
        int m6960getHyphensvmbZdU8 = paragraphStyle.m6960getHyphensvmbZdU8();
        Hyphens.Companion companion3 = Hyphens.Companion;
        int m7382getNonevmbZdU8 = Hyphens.m7377equalsimpl0(m6960getHyphensvmbZdU8, companion3.m7383getUnspecifiedvmbZdU8()) ? companion3.m7382getNonevmbZdU8() : paragraphStyle.m6960getHyphensvmbZdU8();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(m7494getStarte0LSkKk, m7106resolveTextDirectionIhaHGbI, m6963getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, m7406getSimplerAG3T2k, m7382getNonevmbZdU8, textMotion, (dq) null);
    }
}
