package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SpanStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, dq dqVar) {
        this(r18, r25, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r39, r1, r2, (i & Fields.CompositingStrategy) != 0 ? null : drawStyle, (dq) null);
        long m4797getUnspecified0d7_KjU = (i & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m7816getUnspecifiedXSAIIZE = (i & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        long m7816getUnspecifiedXSAIIZE2 = (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
        BaselineShift baselineShift2 = (i & Fields.RotationX) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & Fields.RotationY) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & Fields.RotationZ) != 0 ? null : localeList;
        long m4797getUnspecified0d7_KjU2 = (i & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i & Fields.TransformOrigin) != 0 ? null : textDecoration;
        long j5 = m4797getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        PlatformSpanStyle platformSpanStyle2 = (i & Fields.Clip) != 0 ? null : platformSpanStyle;
        long j6 = m7816getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j7 = m7816getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j8 = m4797getUnspecified0d7_KjU2;
    }

    /* renamed from: copy-GSF8kmg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6992copyGSF8kmg$default(SpanStyle spanStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, Object obj) {
        long m7001getColor0d7_KjU = (i & 1) != 0 ? spanStyle.m7001getColor0d7_KjU() : j;
        return spanStyle.m6996copyGSF8kmg(m7001getColor0d7_KjU, (i & 2) != 0 ? spanStyle.fontSize : j2, (i & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i & 8) != 0 ? spanStyle.fontStyle : fontStyle, (i & 16) != 0 ? spanStyle.fontSynthesis : fontSynthesis, (i & 32) != 0 ? spanStyle.fontFamily : fontFamily, (i & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i & Fields.SpotShadowColor) != 0 ? spanStyle.letterSpacing : j3, (i & Fields.RotationX) != 0 ? spanStyle.baselineShift : baselineShift, (i & Fields.RotationY) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i & Fields.RotationZ) != 0 ? spanStyle.localeList : localeList, (i & Fields.CameraDistance) != 0 ? spanStyle.background : j4, (i & Fields.TransformOrigin) != 0 ? spanStyle.textDecoration : textDecoration, (i & 8192) != 0 ? spanStyle.shadow : shadow, (i & Fields.Clip) != 0 ? spanStyle.platformStyle : platformSpanStyle, (i & Fields.CompositingStrategy) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    /* renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6994copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, Object obj) {
        DrawStyle drawStyle2;
        PlatformSpanStyle platformSpanStyle2;
        long j4;
        long j5;
        TextDecoration textDecoration2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j6;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        Shadow shadow2;
        float alpha = (i & 2) != 0 ? spanStyle.getAlpha() : f;
        long j7 = (i & 4) != 0 ? spanStyle.fontSize : j;
        FontWeight fontWeight3 = (i & 8) != 0 ? spanStyle.fontWeight : fontWeight;
        FontStyle fontStyle3 = (i & 16) != 0 ? spanStyle.fontStyle : fontStyle;
        FontSynthesis fontSynthesis3 = (i & 32) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        FontFamily fontFamily3 = (i & 64) != 0 ? spanStyle.fontFamily : fontFamily;
        String str3 = (i & Fields.SpotShadowColor) != 0 ? spanStyle.fontFeatureSettings : str;
        long j8 = (i & Fields.RotationX) != 0 ? spanStyle.letterSpacing : j2;
        BaselineShift baselineShift3 = (i & Fields.RotationY) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i & Fields.RotationZ) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList3 = (i & Fields.CameraDistance) != 0 ? spanStyle.localeList : localeList;
        float f2 = alpha;
        long j9 = j7;
        long j10 = (i & Fields.TransformOrigin) != 0 ? spanStyle.background : j3;
        TextDecoration textDecoration3 = (i & 8192) != 0 ? spanStyle.textDecoration : textDecoration;
        Shadow shadow3 = (i & Fields.Clip) != 0 ? spanStyle.shadow : shadow;
        PlatformSpanStyle platformSpanStyle3 = (i & Fields.CompositingStrategy) != 0 ? spanStyle.platformStyle : platformSpanStyle;
        if ((i & 65536) != 0) {
            platformSpanStyle2 = platformSpanStyle3;
            drawStyle2 = spanStyle.drawStyle;
            j5 = j10;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j6 = j8;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
            j4 = j9;
        } else {
            drawStyle2 = drawStyle;
            platformSpanStyle2 = platformSpanStyle3;
            j4 = j9;
            j5 = j10;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j6 = j8;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
        }
        return spanStyle.m6998copyNcG25M8(brush, f2, j4, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j6, baselineShift2, textGeometricTransform2, localeList2, j5, textDecoration2, shadow2, platformSpanStyle2, drawStyle2);
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    @er
    /* renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m6995copy2BkPm_w(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        return new SpanStyle(Color.m4762equalsimpl0(j, m7001getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, Fields.CompositingStrategy, (dq) null);
    }

    /* renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m6996copyGSF8kmg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        return new SpanStyle(Color.m4762equalsimpl0(j, m7001getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (dq) null);
    }

    @er
    /* renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m6997copyIuqyXdg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow) {
        return new SpanStyle(Color.m4762equalsimpl0(j, m7001getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, this.platformStyle, this.drawStyle, (dq) null);
    }

    /* renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m6998copyNcG25M8(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, f), j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle, (dq) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return hasSameLayoutAffectingAttributes$ui_text(spanStyle) && hasSameNonLayoutAttributes$ui_text(spanStyle);
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m6999getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m7000getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m7001getColor0d7_KjU() {
        return this.textForegroundStyle.mo7369getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m7002getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m7003getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m7004getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m7005getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextForegroundStyle getTextForegroundStyle$ui_text() {
        return this.textForegroundStyle;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.m7802equalsimpl0(this.fontSize, spanStyle.fontSize) && q10.b(this.fontWeight, spanStyle.fontWeight) && q10.b(this.fontStyle, spanStyle.fontStyle) && q10.b(this.fontSynthesis, spanStyle.fontSynthesis) && q10.b(this.fontFamily, spanStyle.fontFamily) && q10.b(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m7802equalsimpl0(this.letterSpacing, spanStyle.letterSpacing) && q10.b(this.baselineShift, spanStyle.baselineShift) && q10.b(this.textGeometricTransform, spanStyle.textGeometricTransform) && q10.b(this.localeList, spanStyle.localeList) && Color.m4762equalsimpl0(this.background, spanStyle.background) && q10.b(this.platformStyle, spanStyle.platformStyle);
    }

    public final boolean hasSameNonLayoutAttributes$ui_text(SpanStyle spanStyle) {
        return q10.b(this.textForegroundStyle, spanStyle.textForegroundStyle) && q10.b(this.textDecoration, spanStyle.textDecoration) && q10.b(this.shadow, spanStyle.shadow) && q10.b(this.drawStyle, spanStyle.drawStyle);
    }

    public int hashCode() {
        int m4768hashCodeimpl = Color.m4768hashCodeimpl(m7001getColor0d7_KjU()) * 31;
        Brush brush = getBrush();
        int m7806hashCodeimpl = (TextUnit.m7806hashCodeimpl(this.fontSize) + ((Float.hashCode(getAlpha()) + ((m4768hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31)) * 31)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int hashCode = (m7806hashCodeimpl + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int m7173hashCodeimpl = (hashCode + (fontStyle != null ? FontStyle.m7173hashCodeimpl(fontStyle.m7175unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int m7184hashCodeimpl = (m7173hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m7184hashCodeimpl(fontSynthesis.m7188unboximpl()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int hashCode2 = (m7184hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int m7806hashCodeimpl2 = (TextUnit.m7806hashCodeimpl(this.letterSpacing) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int m7355hashCodeimpl = (m7806hashCodeimpl2 + (baselineShift != null ? BaselineShift.m7355hashCodeimpl(baselineShift.m7357unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode3 = (m7355hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int d = kp0.d(this.background, (hashCode3 + (localeList != null ? localeList.hashCode() : 0)) * 31, 31);
        TextDecoration textDecoration = this.textDecoration;
        int hashCode4 = (d + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31;
        Shadow shadow = this.shadow;
        int hashCode5 = (hashCode4 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int hashCode6 = (hashCode5 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.drawStyle;
        return hashCode6 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text() {
        int m7806hashCodeimpl = TextUnit.m7806hashCodeimpl(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int hashCode = (m7806hashCodeimpl + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int m7173hashCodeimpl = (hashCode + (fontStyle != null ? FontStyle.m7173hashCodeimpl(fontStyle.m7175unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int m7184hashCodeimpl = (m7173hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m7184hashCodeimpl(fontSynthesis.m7188unboximpl()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int hashCode2 = (m7184hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int m7806hashCodeimpl2 = (TextUnit.m7806hashCodeimpl(this.letterSpacing) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int m7355hashCodeimpl = (m7806hashCodeimpl2 + (baselineShift != null ? BaselineShift.m7355hashCodeimpl(baselineShift.m7357unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode3 = (m7355hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int d = kp0.d(this.background, (hashCode3 + (localeList != null ? localeList.hashCode() : 0)) * 31, 31);
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return d + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    public final SpanStyle merge(SpanStyle spanStyle) {
        return spanStyle == null ? this : SpanStyleKt.m7006fastMergedSHsh3o(this, spanStyle.textForegroundStyle.mo7369getColor0d7_KjU(), spanStyle.textForegroundStyle.getBrush(), spanStyle.textForegroundStyle.getAlpha(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.background, spanStyle.textDecoration, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    public final SpanStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) Color.m4769toStringimpl(m7001getColor0d7_KjU()));
        sb.append(", brush=");
        sb.append(getBrush());
        sb.append(", alpha=");
        sb.append(getAlpha());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.m7812toStringimpl(this.fontSize));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        sb.append(this.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(this.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(this.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.m7812toStringimpl(this.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(this.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(this.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(this.localeList);
        sb.append(", background=");
        kp0.i(this.background, sb, ", textDecoration=");
        sb.append(this.textDecoration);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", drawStyle=");
        sb.append(this.drawStyle);
        sb.append(')');
        return sb.toString();
    }

    @er
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, dq dqVar) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle);
    }

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, dq dqVar) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, dq dqVar) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, dq dqVar) {
        this(textForegroundStyle, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j3;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, dq dqVar) {
        this(textForegroundStyle, (i & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j2, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : platformSpanStyle, (i & Fields.CompositingStrategy) != 0 ? null : drawStyle, (dq) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, int i, dq dqVar) {
        this(r1, r3, r5, r26, r27, r28, r29, r30, r32, r33, r34, r35, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (dq) null);
        long m4797getUnspecified0d7_KjU = (i & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m7816getUnspecifiedXSAIIZE = (i & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        long m7816getUnspecifiedXSAIIZE2 = (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
        BaselineShift baselineShift2 = (i & Fields.RotationX) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & Fields.RotationY) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & Fields.RotationZ) != 0 ? null : localeList;
        long m4797getUnspecified0d7_KjU2 = (i & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j5 = m7816getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j6 = m4797getUnspecified0d7_KjU2;
    }

    private SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, Fields.CompositingStrategy, (dq) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i, dq dqVar) {
        this(r18, r24, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r38, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : platformSpanStyle, (dq) null);
        long m4797getUnspecified0d7_KjU = (i & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m7816getUnspecifiedXSAIIZE = (i & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        long m7816getUnspecifiedXSAIIZE2 = (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
        BaselineShift baselineShift2 = (i & Fields.RotationX) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & Fields.RotationY) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & Fields.RotationZ) != 0 ? null : localeList;
        long m4797getUnspecified0d7_KjU2 = (i & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i & Fields.TransformOrigin) != 0 ? null : textDecoration;
        long j5 = m4797getUnspecified0d7_KjU;
        long j6 = m7816getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j7 = m7816getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j8 = m4797getUnspecified0d7_KjU2;
    }

    private SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, Fields.CompositingStrategy, (dq) null);
    }

    @er
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, dq dqVar) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow);
    }

    private SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (dq) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, dq dqVar) {
        this(brush, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : fontWeight, (i & 16) != 0 ? null : fontStyle, (i & 32) != 0 ? null : fontSynthesis, (i & 64) != 0 ? null : fontFamily, (i & Fields.SpotShadowColor) != 0 ? null : str, (i & Fields.RotationX) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j2, (i & Fields.RotationY) != 0 ? null : baselineShift, (i & Fields.RotationZ) != 0 ? null : textGeometricTransform, (i & Fields.CameraDistance) != 0 ? null : localeList, (i & Fields.TransformOrigin) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3, (i & 8192) != 0 ? null : textDecoration, (i & Fields.Clip) != 0 ? null : shadow, (32768 & i) != 0 ? null : platformSpanStyle, (i & 65536) != 0 ? null : drawStyle, (dq) null);
    }

    private SpanStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.from(brush, f), j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle, (dq) null);
    }
}
