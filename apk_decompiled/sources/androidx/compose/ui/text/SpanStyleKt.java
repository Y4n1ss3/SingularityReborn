package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.dq;
import defpackage.q10;
import defpackage.sn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final TextForegroundStyle DefaultColorForegroundStyle;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m4796getTransparent0d7_KjU();
        long m4787getBlack0d7_KjU = companion.m4787getBlack0d7_KjU();
        DefaultColor = m4787getBlack0d7_KjU;
        DefaultColorForegroundStyle = TextForegroundStyle.Companion.m7516from8_81llA(m4787getBlack0d7_KjU);
    }

    private static final Shadow dropAlpha(Shadow shadow) {
        return Shadow.m5101copyqcb84PM$default(shadow, Color.m4760copywmQWz5c$default(shadow.m5105getColor0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x010f, code lost:
    
        if (androidx.compose.ui.graphics.Color.m4762equalsimpl0(r7, r23.m6999getBackground0d7_KjU()) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008e, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m7802equalsimpl0(r35, r23.m7005getLetterSpacingXSAIIZE()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m7802equalsimpl0(r11, r23.m7002getFontSizeXSAIIZE()) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00eb, code lost:
    
        if (r14.equals(r23.getTextGeometricTransform()) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fc, code lost:
    
        if (r39.equals(r23.getLocaleList()) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpanStyle m7006fastMergedSHsh3o(SpanStyle spanStyle, long j, Brush brush, float f, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        long j5;
        TextGeometricTransform textGeometricTransform2;
        long j6;
        DrawStyle drawStyle2;
        String str2 = str;
        BaselineShift baselineShift2 = baselineShift;
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow2 = shadow;
        if (TextUnit.m7803getRawTypeimpl(j2) == 0) {
            j5 = j2;
        } else {
            j5 = j2;
        }
        if ((brush != null || j == 16 || Color.m4762equalsimpl0(j, spanStyle.getTextForegroundStyle$ui_text().mo7369getColor0d7_KjU())) && ((fontStyle == null || fontStyle.equals(spanStyle.m7003getFontStyle4Lr2A7w())) && ((fontWeight == null || fontWeight.equals(spanStyle.getFontWeight())) && (fontFamily == null || fontFamily == spanStyle.getFontFamily())))) {
            if (TextUnit.m7803getRawTypeimpl(j3) == 0) {
            }
            if ((textDecoration2 == null || textDecoration2.equals(spanStyle.getTextDecoration())) && q10.b(brush, spanStyle.getTextForegroundStyle$ui_text().getBrush()) && ((brush == null || f == spanStyle.getTextForegroundStyle$ui_text().getAlpha()) && ((fontSynthesis == null || fontSynthesis.equals(spanStyle.m7004getFontSynthesisZQGJjVo())) && ((str2 == null || str2.equals(spanStyle.getFontFeatureSettings())) && (baselineShift2 == null || baselineShift2.equals(spanStyle.m7000getBaselineShift5SSeXJ0())))))) {
                if (textGeometricTransform != null) {
                    textGeometricTransform2 = textGeometricTransform;
                } else {
                    textGeometricTransform2 = textGeometricTransform;
                }
                if (localeList == null) {
                }
                if (j4 != 16) {
                    j6 = j4;
                } else {
                    j6 = j4;
                }
                if ((shadow2 == null || shadow2.equals(spanStyle.getShadow())) && (platformSpanStyle == null || platformSpanStyle.equals(spanStyle.getPlatformStyle()))) {
                    drawStyle2 = drawStyle;
                    if (drawStyle2 == null || drawStyle2.equals(spanStyle.getDrawStyle())) {
                        return spanStyle;
                    }
                    TextForegroundStyle merge = spanStyle.getTextForegroundStyle$ui_text().merge(brush != null ? TextForegroundStyle.Companion.from(brush, f) : TextForegroundStyle.Companion.m7516from8_81llA(j));
                    FontFamily fontFamily2 = fontFamily == null ? spanStyle.getFontFamily() : fontFamily;
                    if (TextUnit.m7803getRawTypeimpl(j5) == 0) {
                        j5 = spanStyle.m7002getFontSizeXSAIIZE();
                    }
                    FontWeight fontWeight2 = fontWeight == null ? spanStyle.getFontWeight() : fontWeight;
                    FontStyle m7003getFontStyle4Lr2A7w = fontStyle == null ? spanStyle.m7003getFontStyle4Lr2A7w() : fontStyle;
                    FontSynthesis m7004getFontSynthesisZQGJjVo = fontSynthesis == null ? spanStyle.m7004getFontSynthesisZQGJjVo() : fontSynthesis;
                    if (str2 == null) {
                        str2 = spanStyle.getFontFeatureSettings();
                    }
                    long m7005getLetterSpacingXSAIIZE = TextUnit.m7803getRawTypeimpl(j3) == 0 ? spanStyle.m7005getLetterSpacingXSAIIZE() : j3;
                    if (baselineShift2 == null) {
                        baselineShift2 = spanStyle.m7000getBaselineShift5SSeXJ0();
                    }
                    if (textGeometricTransform2 == null) {
                        textGeometricTransform2 = spanStyle.getTextGeometricTransform();
                    }
                    LocaleList localeList2 = localeList == null ? spanStyle.getLocaleList() : localeList;
                    if (j6 == 16) {
                        j6 = spanStyle.m6999getBackground0d7_KjU();
                    }
                    if (textDecoration2 == null) {
                        textDecoration2 = spanStyle.getTextDecoration();
                    }
                    if (shadow2 == null) {
                        shadow2 = spanStyle.getShadow();
                    }
                    return new SpanStyle(merge, j5, fontWeight2, m7003getFontStyle4Lr2A7w, m7004getFontSynthesisZQGJjVo, fontFamily2, str2, m7005getLetterSpacingXSAIIZE, baselineShift2, textGeometricTransform2, localeList2, j6, textDecoration2, shadow2, mergePlatformStyle(spanStyle, platformSpanStyle), drawStyle2 == null ? spanStyle.getDrawStyle() : drawStyle2, (dq) null);
                }
                drawStyle2 = drawStyle;
                TextForegroundStyle merge2 = spanStyle.getTextForegroundStyle$ui_text().merge(brush != null ? TextForegroundStyle.Companion.from(brush, f) : TextForegroundStyle.Companion.m7516from8_81llA(j));
                if (fontFamily == null) {
                }
                if (TextUnit.m7803getRawTypeimpl(j5) == 0) {
                }
                if (fontWeight == null) {
                }
                if (fontStyle == null) {
                }
                if (fontSynthesis == null) {
                }
                if (str2 == null) {
                }
                if (TextUnit.m7803getRawTypeimpl(j3) == 0) {
                }
                if (baselineShift2 == null) {
                }
                if (textGeometricTransform2 == null) {
                }
                if (localeList == null) {
                }
                if (j6 == 16) {
                }
                if (textDecoration2 == null) {
                }
                if (shadow2 == null) {
                }
                return new SpanStyle(merge2, j5, fontWeight2, m7003getFontStyle4Lr2A7w, m7004getFontSynthesisZQGJjVo, fontFamily2, str2, m7005getLetterSpacingXSAIIZE, baselineShift2, textGeometricTransform2, localeList2, j6, textDecoration2, shadow2, mergePlatformStyle(spanStyle, platformSpanStyle), drawStyle2 == null ? spanStyle.getDrawStyle() : drawStyle2, (dq) null);
            }
        }
        textGeometricTransform2 = textGeometricTransform;
        j6 = j4;
        drawStyle2 = drawStyle;
        TextForegroundStyle merge22 = spanStyle.getTextForegroundStyle$ui_text().merge(brush != null ? TextForegroundStyle.Companion.from(brush, f) : TextForegroundStyle.Companion.m7516from8_81llA(j));
        if (fontFamily == null) {
        }
        if (TextUnit.m7803getRawTypeimpl(j5) == 0) {
        }
        if (fontWeight == null) {
        }
        if (fontStyle == null) {
        }
        if (fontSynthesis == null) {
        }
        if (str2 == null) {
        }
        if (TextUnit.m7803getRawTypeimpl(j3) == 0) {
        }
        if (baselineShift2 == null) {
        }
        if (textGeometricTransform2 == null) {
        }
        if (localeList == null) {
        }
        if (j6 == 16) {
        }
        if (textDecoration2 == null) {
        }
        if (shadow2 == null) {
        }
        return new SpanStyle(merge22, j5, fontWeight2, m7003getFontStyle4Lr2A7w, m7004getFontSynthesisZQGJjVo, fontFamily2, str2, m7005getLetterSpacingXSAIIZE, baselineShift2, textGeometricTransform2, localeList2, j6, textDecoration2, shadow2, mergePlatformStyle(spanStyle, platformSpanStyle), drawStyle2 == null ? spanStyle.getDrawStyle() : drawStyle2, (dq) null);
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f) {
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text(), spanStyle2.getTextForegroundStyle$ui_text(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f);
        long m7007lerpTextUnitInheritableC3pnCVY = m7007lerpTextUnitInheritableC3pnCVY(spanStyle.m7002getFontSizeXSAIIZE(), spanStyle2.m7002getFontSizeXSAIIZE(), f);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m7003getFontStyle4Lr2A7w(), spanStyle2.m7003getFontStyle4Lr2A7w(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m7004getFontSynthesisZQGJjVo(), spanStyle2.m7004getFontSynthesisZQGJjVo(), f);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f);
        long m7007lerpTextUnitInheritableC3pnCVY2 = m7007lerpTextUnitInheritableC3pnCVY(spanStyle.m7005getLetterSpacingXSAIIZE(), spanStyle2.m7005getLetterSpacingXSAIIZE(), f);
        BaselineShift m7000getBaselineShift5SSeXJ0 = spanStyle.m7000getBaselineShift5SSeXJ0();
        float m7357unboximpl = m7000getBaselineShift5SSeXJ0 != null ? m7000getBaselineShift5SSeXJ0.m7357unboximpl() : BaselineShift.m7352constructorimpl(0.0f);
        BaselineShift m7000getBaselineShift5SSeXJ02 = spanStyle2.m7000getBaselineShift5SSeXJ0();
        float m7367lerpjWV1Mfo = BaselineShiftKt.m7367lerpjWV1Mfo(m7357unboximpl, m7000getBaselineShift5SSeXJ02 != null ? m7000getBaselineShift5SSeXJ02.m7357unboximpl() : BaselineShift.m7352constructorimpl(0.0f), f);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text();
        }
        return new SpanStyle(lerp, m7007lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m7007lerpTextUnitInheritableC3pnCVY2, BaselineShift.m7351boximpl(m7367lerpjWV1Mfo), TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f), (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f), ColorKt.m4812lerpjxsXWHM(spanStyle.m6999getBackground0d7_KjU(), spanStyle2.m6999getBackground0d7_KjU(), f), (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f), nullSafeLerp(spanStyle.getShadow(), spanStyle2.getShadow(), f), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f), (dq) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m7007lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        return (TextUnit.m7803getRawTypeimpl(j) == 0 || TextUnit.m7803getRawTypeimpl(j2) == 0) ? ((TextUnit) lerpDiscrete(TextUnit.m7795boximpl(j), TextUnit.m7795boximpl(j2), f)).m7814unboximpl() : TextUnitKt.m7825lerpC3pnCVY(j, j2, f);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        return spanStyle.getPlatformStyle() == null ? platformSpanStyle : platformSpanStyle == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    public static final Shadow nullSafeLerp(Shadow shadow, Shadow shadow2, float f) {
        if (!ComposeUiTextFlags.isCorrectShadowLerpWithNullsEnabled) {
            if (shadow == null) {
                shadow = new Shadow(0L, 0L, 0.0f, 7, null);
            }
            if (shadow2 == null) {
                shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
            }
            return ShadowKt.lerp(shadow, shadow2, f);
        }
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow != null) {
            return shadow2 == null ? ShadowKt.lerp(shadow, dropAlpha(shadow), f) : ShadowKt.lerp(shadow, shadow2, f);
        }
        shadow2.getClass();
        return ShadowKt.lerp(dropAlpha(shadow2), shadow2, f);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle$ui_text().takeOrElse(new sn0(4));
        long m7002getFontSizeXSAIIZE = TextUnit.m7803getRawTypeimpl(spanStyle.m7002getFontSizeXSAIIZE()) == 0 ? DefaultFontSize : spanStyle.m7002getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m7003getFontStyle4Lr2A7w = spanStyle.m7003getFontStyle4Lr2A7w();
        FontStyle m7169boximpl = FontStyle.m7169boximpl(m7003getFontStyle4Lr2A7w != null ? m7003getFontStyle4Lr2A7w.m7175unboximpl() : FontStyle.Companion.m7179getNormal_LCdwA());
        FontSynthesis m7004getFontSynthesisZQGJjVo = spanStyle.m7004getFontSynthesisZQGJjVo();
        FontSynthesis m7180boximpl = FontSynthesis.m7180boximpl(m7004getFontSynthesisZQGJjVo != null ? m7004getFontSynthesisZQGJjVo.m7188unboximpl() : FontSynthesis.Companion.m7189getAllGVVA2EU());
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long m7005getLetterSpacingXSAIIZE = TextUnit.m7803getRawTypeimpl(spanStyle.m7005getLetterSpacingXSAIIZE()) == 0 ? DefaultLetterSpacing : spanStyle.m7005getLetterSpacingXSAIIZE();
        BaselineShift m7000getBaselineShift5SSeXJ0 = spanStyle.m7000getBaselineShift5SSeXJ0();
        float m7357unboximpl = m7000getBaselineShift5SSeXJ0 != null ? m7000getBaselineShift5SSeXJ0.m7357unboximpl() : BaselineShift.Companion.m7362getNoney9eOQZs();
        if (Float.isNaN(m7357unboximpl)) {
            m7357unboximpl = BaselineShift.Companion.m7362getNoney9eOQZs();
        }
        BaselineShift m7351boximpl = BaselineShift.m7351boximpl(m7357unboximpl);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m6999getBackground0d7_KjU = spanStyle.m6999getBackground0d7_KjU();
        if (m6999getBackground0d7_KjU == 16) {
            m6999getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j = m6999getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, m7002getFontSizeXSAIIZE, fontWeight2, m7169boximpl, m7180boximpl, fontFamily2, str, m7005getLetterSpacingXSAIIZE, m7351boximpl, textGeometricTransform2, localeList2, j, textDecoration2, shadow2, platformStyle, drawStyle, (dq) null);
    }
}
