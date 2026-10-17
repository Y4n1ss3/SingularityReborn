package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.dq;
import defpackage.oy;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, oy oyVar, Density density, boolean z) {
        long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(spanStyle.m7002getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo366toPxR2X_6o(spanStyle.m7002getFontSizeXSAIIZE()));
        } else if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
            androidTextPaint.setTextSize(TextUnit.m7805getValueimpl(spanStyle.m7002getFontSizeXSAIIZE()) * androidTextPaint.getTextSize());
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m7003getFontStyle4Lr2A7w = spanStyle.m7003getFontStyle4Lr2A7w();
            FontStyle m7169boximpl = FontStyle.m7169boximpl(m7003getFontStyle4Lr2A7w != null ? m7003getFontStyle4Lr2A7w.m7175unboximpl() : FontStyle.Companion.m7179getNormal_LCdwA());
            FontSynthesis m7004getFontSynthesisZQGJjVo = spanStyle.m7004getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface((Typeface) oyVar.invoke(fontFamily, fontWeight, m7169boximpl, FontSynthesis.m7180boximpl(m7004getFontSynthesisZQGJjVo != null ? m7004getFontSynthesisZQGJjVo.m7188unboximpl() : FontSynthesis.Companion.m7189getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !q10.b(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !q10.b(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !q10.b(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text())) {
            androidTextPaint.setTextScaleX(spanStyle.getTextGeometricTransform().getScaleX() * androidTextPaint.getTextScaleX());
            androidTextPaint.setTextSkewX(spanStyle.getTextGeometricTransform().getSkewX() + androidTextPaint.getTextSkewX());
        }
        androidTextPaint.m7329setColor8_81llA(spanStyle.m7001getColor0d7_KjU());
        androidTextPaint.m7327setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m4593getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(spanStyle.m7005getLetterSpacingXSAIIZE()), companion.m7838getSpUIouoOA()) && TextUnit.m7805getValueimpl(spanStyle.m7005getLetterSpacingXSAIIZE()) != 0.0f) {
            float textScaleX = androidTextPaint.getTextScaleX() * androidTextPaint.getTextSize();
            float mo366toPxR2X_6o = density.mo366toPxR2X_6o(spanStyle.m7005getLetterSpacingXSAIIZE());
            if (textScaleX != 0.0f) {
                androidTextPaint.setLetterSpacing(mo366toPxR2X_6o / textScaleX);
            }
        } else if (TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(spanStyle.m7005getLetterSpacingXSAIIZE()), companion.m7837getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m7805getValueimpl(spanStyle.m7005getLetterSpacingXSAIIZE()));
        }
        return m7344generateFallbackSpanStyle62GTOB8(spanStyle.m7005getLetterSpacingXSAIIZE(), z, spanStyle.m6999getBackground0d7_KjU(), spanStyle.m7000getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, oy oyVar, Density density, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, oyVar, density, z);
    }

    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m7344generateFallbackSpanStyle62GTOB8(long j, boolean z, long j2, BaselineShift baselineShift) {
        long j3 = j2;
        boolean z2 = false;
        boolean z3 = z && TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j), TextUnitType.Companion.m7838getSpUIouoOA()) && TextUnit.m7805getValueimpl(j) != 0.0f;
        Color.Companion companion = Color.Companion;
        boolean z4 = (Color.m4762equalsimpl0(j3, companion.m4797getUnspecified0d7_KjU()) || Color.m4762equalsimpl0(j3, companion.m4796getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m7354equalsimpl0(baselineShift.m7357unboximpl(), BaselineShift.Companion.m7362getNoney9eOQZs())) {
                z2 = true;
            }
        }
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long m7816getUnspecifiedXSAIIZE = z3 ? j : TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
        if (!z4) {
            j3 = companion.m4797getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, m7816getUnspecifiedXSAIIZE, z2 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, j3, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (dq) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m7003getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning$ui_text() ? androidTextPaint.getFlags() | Fields.SpotShadowColor : androidTextPaint.getFlags() & (-129));
        int m7523getLinearity4e0Vf04$ui_text = textMotion.m7523getLinearity4e0Vf04$ui_text();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m7527equalsimpl0(m7523getLinearity4e0Vf04$ui_text, companion.m7532getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m7527equalsimpl0(m7523getLinearity4e0Vf04$ui_text, companion.m7531getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m7527equalsimpl0(m7523getLinearity4e0Vf04$ui_text, companion.m7533getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
