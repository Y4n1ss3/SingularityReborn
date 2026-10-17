package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.dq;
import defpackage.ds0;
import defpackage.ny;
import defpackage.o;
import defpackage.oy;
import defpackage.w01;
import defpackage.xl;
import defpackage.y80;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m7335createLetterSpacingSpaneAf_CNQ(long j, Density density) {
        long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo366toPxR2X_6o(j));
        }
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m7805getValueimpl(j));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, ny nyVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            nyVar.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            iArr[i2] = range.getStart();
            iArr[i2 + size] = range.getEnd();
        }
        if (i > 1) {
            Arrays.sort(iArr);
        }
        if (i == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        int i3 = iArr[0];
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = iArr[i4];
            if (i5 != i3) {
                int size3 = list.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i6 = 0; i6 < size3; i6++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i6);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(i3, i5, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = merge(spanStyle2, range2.getItem());
                    }
                }
                if (spanStyle2 != null) {
                    nyVar.invoke(spanStyle2, Integer.valueOf(i3), Integer.valueOf(i5));
                }
                i3 = i5;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(spanStyle.m7005getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA()) || TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(spanStyle.m7005getLetterSpacingXSAIIZE()), companion.m7837getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m7093getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m7336resolveBulletTextUnitToPxo2QH7mI(long j, float f, Density density) {
        if (TextUnit.m7802equalsimpl0(j, TextUnit.Companion.m7816getUnspecifiedXSAIIZE())) {
            return f;
        }
        long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
            return density.mo366toPxR2X_6o(j);
        }
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
            return TextUnit.m7805getValueimpl(j) * f;
        }
        return Float.NaN;
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m7337resolveLineHeightInPxo2QH7mI(long j, float f, Density density) {
        float m7805getValueimpl;
        long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo366toPxR2X_6o(j);
            }
            m7805getValueimpl = TextUnit.m7805getValueimpl(j) / TextUnit.m7805getValueimpl(density.mo370toSpkPz2Gy4(f));
        } else {
            if (!TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
                return Float.NaN;
            }
            m7805getValueimpl = TextUnit.m7805getValueimpl(j);
        }
        return m7805getValueimpl * f;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m7338setBackgroundRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m4815toArgb8_81llA(j)), i, i2);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m7339setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i, int i2) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m7357unboximpl()), i, i2);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f, int i, int i2) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m7340setColorRPmYEkk(spannable, ((SolidColor) brush).m5117getValue0d7_KjU(), i, i2);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f), i, i2);
            } else {
                o.n();
            }
        }
    }

    public static final void setBulletSpans(Spannable spannable, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f, Density density, TextIndent textIndent) {
        Density density2 = density;
        float f2 = 0.0f;
        if (textIndent != null) {
            long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(textIndent.m7519getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
                f2 = density2.mo366toPxR2X_6o(textIndent.m7519getFirstLineXSAIIZE());
            } else if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
                f2 = TextUnit.m7805getValueimpl(textIndent.m7519getFirstLineXSAIIZE()) * f;
            }
        }
        float f3 = f2;
        int size = list.size();
        int i = 0;
        while (i < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float m7336resolveBulletTextUnitToPxo2QH7mI = m7336resolveBulletTextUnitToPxo2QH7mI(bullet.m6903getWidthXSAIIZE(), f, density2);
                float m7336resolveBulletTextUnitToPxo2QH7mI2 = m7336resolveBulletTextUnitToPxo2QH7mI(bullet.m6901getHeightXSAIIZE(), f, density2);
                float m7336resolveBulletTextUnitToPxo2QH7mI3 = m7336resolveBulletTextUnitToPxo2QH7mI(bullet.m6902getPaddingXSAIIZE(), f, density2);
                if (!Float.isNaN(m7336resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(m7336resolveBulletTextUnitToPxo2QH7mI2) && !Float.isNaN(m7336resolveBulletTextUnitToPxo2QH7mI3)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), m7336resolveBulletTextUnitToPxo2QH7mI, m7336resolveBulletTextUnitToPxo2QH7mI2, m7336resolveBulletTextUnitToPxo2QH7mI3, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density2, f3), range.getStart(), range.getEnd());
                }
            }
            i++;
            density2 = density;
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m7340setColorRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m4815toArgb8_81llA(j)), i, i2);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i, int i2) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i, i2);
        }
    }

    private static final void setFontAttributes(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, oy oyVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).m7004getFontSynthesisZQGJjVo() != null)) {
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m7092getFontStyle4Lr2A7w(), textStyle.m7093getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (dq) null) : null, arrayList, new xl(5, spannable, oyVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 setFontAttributes$lambda$2(Spannable spannable, oy oyVar, SpanStyle spanStyle, int i, int i2) {
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m7003getFontStyle4Lr2A7w = spanStyle.m7003getFontStyle4Lr2A7w();
        FontStyle m7169boximpl = FontStyle.m7169boximpl(m7003getFontStyle4Lr2A7w != null ? m7003getFontStyle4Lr2A7w.m7175unboximpl() : FontStyle.Companion.m7179getNormal_LCdwA());
        FontSynthesis m7004getFontSynthesisZQGJjVo = spanStyle.m7004getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan((Typeface) oyVar.invoke(fontFamily, fontWeight, m7169boximpl, FontSynthesis.m7180boximpl(m7004getFontSynthesisZQGJjVo != null ? m7004getFontSynthesisZQGJjVo.m7188unboximpl() : FontSynthesis.Companion.m7189getAllGVVA2EU()))), i, i2, 33);
        return w01.a;
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i, i2);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m7341setFontSizeKmRG4DE(Spannable spannable, long j, Density density, int i, int i2) {
        long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(y80.P(density.mo366toPxR2X_6o(j)), false), i, i2);
        } else if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m7805getValueimpl(j)), i, i2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m7342setLineHeightKmRG4DE(Spannable spannable, long j, float f, Density density, LineHeightStyle lineHeightStyle) {
        float m7337resolveLineHeightInPxo2QH7mI = m7337resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(m7337resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(m7337resolveLineHeightInPxo2QH7mI, 0, (spannable.length() == 0 || ds0.o0(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m7474isTrimFirstLineTopimpl$ui_text(lineHeightStyle.m7447getTrimEVpEnUU()), LineHeightStyle.Trim.m7475isTrimLastLineBottomimpl$ui_text(lineHeightStyle.m7447getTrimEVpEnUU()), lineHeightStyle.m7445getAlignmentPIaL0Z0(), lineHeightStyle.m7446getModelzQqcRY(), null), 0, spannable.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m7343setLineHeightr9BaKPg(Spannable spannable, long j, float f, Density density) {
        float m7337resolveLineHeightInPxo2QH7mI = m7337resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(m7337resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(m7337resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i, int i2) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i, i2);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m4815toArgb8_81llA(shadow.m5105getColor0d7_KjU()), Float.intBitsToFloat((int) (shadow.m5106getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (shadow.m5106getOffsetF1C5BW0() & 4294967295L)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i, i2);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i, int i2, Density density) {
        m7339setBaselineShift0ocSgnM(spannable, spanStyle.m7000getBaselineShift5SSeXJ0(), i, i2);
        m7340setColorRPmYEkk(spannable, spanStyle.m7001getColor0d7_KjU(), i, i2);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i, i2);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), i, i2);
        m7341setFontSizeKmRG4DE(spannable, spanStyle.m7002getFontSizeXSAIIZE(), density, i, i2);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i, i2);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i, i2);
        setLocaleList(spannable, spanStyle.getLocaleList(), i, i2);
        m7338setBackgroundRPmYEkk(spannable, spanStyle.m6999getBackground0d7_KjU(), i, i2);
        setShadow(spannable, spanStyle.getShadow(), i, i2);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i, i2);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, oy oyVar) {
        MetricAffectingSpan m7335createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, oyVar);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i2);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (m7335createLetterSpacingSpaneAf_CNQ = m7335createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).m7005getLetterSpacingXSAIIZE(), density)) != null) {
                        setSpan(spannable, m7335createLetterSpacingSpaneAf_CNQ, start2, end2);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i, int i2) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i, i2);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f, Density density) {
        if (textIndent != null) {
            if ((TextUnit.m7802equalsimpl0(textIndent.m7519getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m7802equalsimpl0(textIndent.m7520getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnit.m7803getRawTypeimpl(textIndent.m7519getFirstLineXSAIIZE()) == 0 || TextUnit.m7803getRawTypeimpl(textIndent.m7520getRestLineXSAIIZE()) == 0) {
                return;
            }
            long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(textIndent.m7519getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            float f2 = 0.0f;
            float mo366toPxR2X_6o = TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA()) ? density.mo366toPxR2X_6o(textIndent.m7519getFirstLineXSAIIZE()) : TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA()) ? TextUnit.m7805getValueimpl(textIndent.m7519getFirstLineXSAIIZE()) * f : 0.0f;
            long m7804getTypeUIouoOA2 = TextUnit.m7804getTypeUIouoOA(textIndent.m7520getRestLineXSAIIZE());
            if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA2, companion.m7838getSpUIouoOA())) {
                f2 = density.mo366toPxR2X_6o(textIndent.m7520getRestLineXSAIIZE());
            } else if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA2, companion.m7837getEmUIouoOA())) {
                f2 = TextUnit.m7805getValueimpl(textIndent.m7520getRestLineXSAIIZE()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(mo366toPxR2X_6o), (int) Math.ceil(f2)), 0, spannable.length());
        }
    }
}
