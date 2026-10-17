package androidx.compose.ui.text;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;
import defpackage.er;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (dq) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, dq dqVar) {
        this(r18, r34, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r48, r1, r2, r20, r21, r22, r24, r25, r26, r27, r28, (i5 & GroupFlagsKt.IsNodeFlag) != 0 ? null : textMotion, (dq) null);
        long m4797getUnspecified0d7_KjU = (i5 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m7816getUnspecifiedXSAIIZE = (i5 & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j2;
        FontWeight fontWeight2 = (i5 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i5 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i5 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i5 & 32) != 0 ? null : fontFamily;
        String str2 = (i5 & 64) != 0 ? null : str;
        long m7816getUnspecifiedXSAIIZE2 = (i5 & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
        BaselineShift baselineShift2 = (i5 & Fields.RotationX) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i5 & Fields.RotationY) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i5 & Fields.RotationZ) != 0 ? null : localeList;
        long m4797getUnspecified0d7_KjU2 = (i5 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i5 & Fields.TransformOrigin) != 0 ? null : textDecoration;
        long j6 = m4797getUnspecified0d7_KjU;
        Shadow shadow2 = (i5 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i5 & Fields.Clip) != 0 ? null : drawStyle;
        int m7495getUnspecifiede0LSkKk = (i5 & Fields.CompositingStrategy) != 0 ? TextAlign.Companion.m7495getUnspecifiede0LSkKk() : i;
        int m7511getUnspecifieds_7Xco = (i5 & 65536) != 0 ? TextDirection.Companion.m7511getUnspecifieds_7Xco() : i2;
        long m7816getUnspecifiedXSAIIZE3 = (i5 & Fields.RenderEffect) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j5;
        TextIndent textIndent2 = (i5 & Fields.ColorFilter) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i5 & Fields.BlendMode) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i5 & 1048576) != 0 ? null : lineHeightStyle;
        int m7407getUnspecifiedrAG3T2k = (i5 & 2097152) != 0 ? LineBreak.Companion.m7407getUnspecifiedrAG3T2k() : i3;
        int m7383getUnspecifiedvmbZdU8 = (i5 & 4194304) != 0 ? Hyphens.Companion.m7383getUnspecifiedvmbZdU8() : i4;
        long j7 = m7816getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = m7816getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = m4797getUnspecified0d7_KjU2;
    }

    /* renamed from: copy-CXVQc50$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m7068copyCXVQc50$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, Object obj) {
        Hyphens hyphens2;
        LineBreak lineBreak2;
        long m7001getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m7001getColor0d7_KjU() : j;
        long m7002getFontSizeXSAIIZE = (i & 2) != 0 ? textStyle.spanStyle.m7002getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7003getFontStyle4Lr2A7w = (i & 8) != 0 ? textStyle.spanStyle.m7003getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7004getFontSynthesisZQGJjVo = (i & 16) != 0 ? textStyle.spanStyle.m7004getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7005getLetterSpacingXSAIIZE = (i & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m7005getLetterSpacingXSAIIZE() : j3;
        BaselineShift m7000getBaselineShift5SSeXJ0 = (i & Fields.RotationX) != 0 ? textStyle.spanStyle.m7000getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = m7001getColor0d7_KjU;
        long m6999getBackground0d7_KjU = (i & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m6999getBackground0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign m7482boximpl = (i & Fields.Clip) != 0 ? TextAlign.m7482boximpl(textStyle.paragraphStyle.m6965getTextAligne0LSkKk()) : textAlign;
        TextDirection m7499boximpl = (i & Fields.CompositingStrategy) != 0 ? TextDirection.m7499boximpl(textStyle.paragraphStyle.m6967getTextDirections_7Xco()) : textDirection;
        long m6963getLineHeightXSAIIZE = (i & 65536) != 0 ? textStyle.paragraphStyle.m6963getLineHeightXSAIIZE() : j5;
        TextIndent textIndent2 = (i & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & Fields.ColorFilter) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & Fields.BlendMode) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m7387boximpl = (i & 1048576) != 0 ? LineBreak.m7387boximpl(textStyle.paragraphStyle.m6962getLineBreakrAG3T2k()) : lineBreak;
        if ((i & 2097152) != 0) {
            lineBreak2 = m7387boximpl;
            hyphens2 = Hyphens.m7374boximpl(textStyle.paragraphStyle.m6960getHyphensvmbZdU8());
        } else {
            hyphens2 = hyphens;
            lineBreak2 = m7387boximpl;
        }
        return textStyle.m7081copyCXVQc50(j6, m7002getFontSizeXSAIIZE, fontWeight2, m7003getFontStyle4Lr2A7w, m7004getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m7005getLetterSpacingXSAIIZE, m7000getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m6999getBackground0d7_KjU, textDecoration3, shadow2, m7482boximpl, m7499boximpl, m6963getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2);
    }

    /* renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m7069copyHL5avdY$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i, Object obj) {
        long m7001getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m7001getColor0d7_KjU() : j;
        return textStyle.m7082copyHL5avdY(m7001getColor0d7_KjU, (i & 2) != 0 ? textStyle.spanStyle.m7002getFontSizeXSAIIZE() : j2, (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight, (i & 8) != 0 ? textStyle.spanStyle.m7003getFontStyle4Lr2A7w() : fontStyle, (i & 16) != 0 ? textStyle.spanStyle.m7004getFontSynthesisZQGJjVo() : fontSynthesis, (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str, (i & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m7005getLetterSpacingXSAIIZE() : j3, (i & Fields.RotationX) != 0 ? textStyle.spanStyle.m7000getBaselineShift5SSeXJ0() : baselineShift, (i & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : localeList, (i & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m6999getBackground0d7_KjU() : j4, (i & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration, (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow, (i & Fields.Clip) != 0 ? TextAlign.m7482boximpl(textStyle.paragraphStyle.m6965getTextAligne0LSkKk()) : textAlign, (i & Fields.CompositingStrategy) != 0 ? TextDirection.m7499boximpl(textStyle.paragraphStyle.m6967getTextDirections_7Xco()) : textDirection, (i & 65536) != 0 ? textStyle.paragraphStyle.m6963getLineHeightXSAIIZE() : j5, (i & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent);
    }

    /* renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m7070copyNOaFTUo$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        LineHeightStyle lineHeightStyle2;
        PlatformTextStyle platformTextStyle2;
        long m7001getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m7001getColor0d7_KjU() : j;
        long m7002getFontSizeXSAIIZE = (i & 2) != 0 ? textStyle.spanStyle.m7002getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7003getFontStyle4Lr2A7w = (i & 8) != 0 ? textStyle.spanStyle.m7003getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7004getFontSynthesisZQGJjVo = (i & 16) != 0 ? textStyle.spanStyle.m7004getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7005getLetterSpacingXSAIIZE = (i & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m7005getLetterSpacingXSAIIZE() : j3;
        BaselineShift m7000getBaselineShift5SSeXJ0 = (i & Fields.RotationX) != 0 ? textStyle.spanStyle.m7000getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = m7001getColor0d7_KjU;
        long m6999getBackground0d7_KjU = (i & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m6999getBackground0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign m7482boximpl = (i & Fields.Clip) != 0 ? TextAlign.m7482boximpl(textStyle.paragraphStyle.m6965getTextAligne0LSkKk()) : textAlign;
        TextDirection m7499boximpl = (i & Fields.CompositingStrategy) != 0 ? TextDirection.m7499boximpl(textStyle.paragraphStyle.m6967getTextDirections_7Xco()) : textDirection;
        long m6963getLineHeightXSAIIZE = (i & 65536) != 0 ? textStyle.paragraphStyle.m6963getLineHeightXSAIIZE() : j5;
        TextIndent textIndent2 = (i & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i & Fields.ColorFilter) != 0 ? textStyle.platformStyle : platformTextStyle;
        if ((i & Fields.BlendMode) != 0) {
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            lineHeightStyle2 = lineHeightStyle;
            platformTextStyle2 = platformTextStyle3;
        }
        return textStyle.m7083copyNOaFTUo(j6, m7002getFontSizeXSAIIZE, fontWeight2, m7003getFontStyle4Lr2A7w, m7004getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m7005getLetterSpacingXSAIIZE, m7000getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m6999getBackground0d7_KjU, textDecoration3, shadow2, m7482boximpl, m7499boximpl, m6963getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2);
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m7071copyNs73l9s$default(TextStyle textStyle, Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, Object obj) {
        TextMotion textMotion2;
        int i6;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i7;
        int i8;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j5;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j6;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j7;
        long j8;
        Brush brush2;
        float f2;
        int i9;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i5 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f;
        long m7002getFontSizeXSAIIZE = (i5 & 4) != 0 ? textStyle.spanStyle.m7002getFontSizeXSAIIZE() : j;
        FontWeight fontWeight3 = (i5 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7003getFontStyle4Lr2A7w = (i5 & 16) != 0 ? textStyle.spanStyle.m7003getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7004getFontSynthesisZQGJjVo = (i5 & 32) != 0 ? textStyle.spanStyle.m7004getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i5 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i5 & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7005getLetterSpacingXSAIIZE = (i5 & Fields.RotationX) != 0 ? textStyle.spanStyle.m7005getLetterSpacingXSAIIZE() : j2;
        BaselineShift m7000getBaselineShift5SSeXJ0 = (i5 & Fields.RotationY) != 0 ? textStyle.spanStyle.m7000getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i5 & Fields.RotationZ) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i5 & Fields.CameraDistance) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m6999getBackground0d7_KjU = (i5 & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.m6999getBackground0d7_KjU() : j3;
        float f3 = alpha;
        TextDecoration textDecoration3 = (i5 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i5 & Fields.Clip) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i5 & Fields.CompositingStrategy) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int m6965getTextAligne0LSkKk = (i5 & 65536) != 0 ? textStyle.paragraphStyle.m6965getTextAligne0LSkKk() : i;
        int m6967getTextDirections_7Xco = (i5 & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m6967getTextDirections_7Xco() : i2;
        long m6963getLineHeightXSAIIZE = (i5 & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.m6963getLineHeightXSAIIZE() : j4;
        TextIndent textIndent3 = (i5 & Fields.BlendMode) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i5 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i5 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int m6962getLineBreakrAG3T2k = (i5 & 4194304) != 0 ? textStyle.paragraphStyle.m6962getLineBreakrAG3T2k() : i3;
        int m6960getHyphensvmbZdU8 = (i5 & GroupFlagsKt.IsNodeFlag) != 0 ? textStyle.paragraphStyle.m6960getHyphensvmbZdU8() : i4;
        if ((i5 & GroupFlagsKt.HasObjectKeyFlag) != 0) {
            i6 = m6960getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i7 = m6965getTextAligne0LSkKk;
            i8 = m6967getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            i9 = m6962getLineBreakrAG3T2k;
            shadow2 = shadow3;
            j5 = m7002getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m7003getFontStyle4Lr2A7w;
            fontSynthesis2 = m7004getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j6 = m7005getLetterSpacingXSAIIZE;
            baselineShift2 = m7000getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j7 = m6999getBackground0d7_KjU;
            j8 = m6963getLineHeightXSAIIZE;
            brush2 = brush;
            f2 = f3;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            i6 = m6960getHyphensvmbZdU8;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i7 = m6965getTextAligne0LSkKk;
            i8 = m6967getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j5 = m7002getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m7003getFontStyle4Lr2A7w;
            fontSynthesis2 = m7004getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j6 = m7005getLetterSpacingXSAIIZE;
            baselineShift2 = m7000getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j7 = m6999getBackground0d7_KjU;
            j8 = m6963getLineHeightXSAIIZE;
            brush2 = brush;
            f2 = f3;
            i9 = m6962getLineBreakrAG3T2k;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m7084copyNs73l9s(brush2, f2, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j6, baselineShift2, textGeometricTransform2, localeList2, j7, textDecoration2, shadow2, drawStyle2, i7, i8, j8, textIndent2, platformTextStyle2, lineHeightStyle2, i9, i6, textMotion2);
    }

    /* renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m7072copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        TextAlign textAlign2;
        TextDirection textDirection2;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j5;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j6;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j7;
        long j8;
        Brush brush2;
        float f2;
        LineBreak lineBreak2;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i & 2) != 0 ? textStyle.spanStyle.getAlpha() : f;
        long m7002getFontSizeXSAIIZE = (i & 4) != 0 ? textStyle.spanStyle.m7002getFontSizeXSAIIZE() : j;
        FontWeight fontWeight3 = (i & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7003getFontStyle4Lr2A7w = (i & 16) != 0 ? textStyle.spanStyle.m7003getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7004getFontSynthesisZQGJjVo = (i & 32) != 0 ? textStyle.spanStyle.m7004getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7005getLetterSpacingXSAIIZE = (i & Fields.RotationX) != 0 ? textStyle.spanStyle.m7005getLetterSpacingXSAIIZE() : j2;
        BaselineShift m7000getBaselineShift5SSeXJ0 = (i & Fields.RotationY) != 0 ? textStyle.spanStyle.m7000getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i & Fields.RotationZ) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i & Fields.CameraDistance) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m6999getBackground0d7_KjU = (i & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.m6999getBackground0d7_KjU() : j3;
        float f3 = alpha;
        TextDecoration textDecoration3 = (i & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i & Fields.Clip) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i & Fields.CompositingStrategy) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign m7482boximpl = (i & 65536) != 0 ? TextAlign.m7482boximpl(textStyle.paragraphStyle.m6965getTextAligne0LSkKk()) : textAlign;
        TextDirection m7499boximpl = (i & Fields.RenderEffect) != 0 ? TextDirection.m7499boximpl(textStyle.paragraphStyle.m6967getTextDirections_7Xco()) : textDirection;
        long m6963getLineHeightXSAIIZE = (i & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.m6963getLineHeightXSAIIZE() : j4;
        TextIndent textIndent3 = (i & Fields.BlendMode) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m7387boximpl = (i & 4194304) != 0 ? LineBreak.m7387boximpl(textStyle.paragraphStyle.m6962getLineBreakrAG3T2k()) : lineBreak;
        Hyphens m7374boximpl = (i & GroupFlagsKt.IsNodeFlag) != 0 ? Hyphens.m7374boximpl(textStyle.paragraphStyle.m6960getHyphensvmbZdU8()) : hyphens;
        if ((i & GroupFlagsKt.HasObjectKeyFlag) != 0) {
            hyphens2 = m7374boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = m7482boximpl;
            textDirection2 = m7499boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            lineBreak2 = m7387boximpl;
            shadow2 = shadow3;
            j5 = m7002getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m7003getFontStyle4Lr2A7w;
            fontSynthesis2 = m7004getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j6 = m7005getLetterSpacingXSAIIZE;
            baselineShift2 = m7000getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j7 = m6999getBackground0d7_KjU;
            j8 = m6963getLineHeightXSAIIZE;
            brush2 = brush;
            f2 = f3;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            hyphens2 = m7374boximpl;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = m7482boximpl;
            textDirection2 = m7499boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j5 = m7002getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m7003getFontStyle4Lr2A7w;
            fontSynthesis2 = m7004getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j6 = m7005getLetterSpacingXSAIIZE;
            baselineShift2 = m7000getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j7 = m6999getBackground0d7_KjU;
            j8 = m6963getLineHeightXSAIIZE;
            brush2 = brush;
            f2 = f3;
            lineBreak2 = m7387boximpl;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m7085copyaIRg9q4(brush2, f2, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j6, baselineShift2, textGeometricTransform2, localeList2, j7, textDecoration2, shadow2, drawStyle2, textAlign2, textDirection2, j8, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-p1EtxEg$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m7073copyp1EtxEg$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, Object obj) {
        TextMotion textMotion2;
        int i6;
        long m7001getColor0d7_KjU = (i5 & 1) != 0 ? textStyle.spanStyle.m7001getColor0d7_KjU() : j;
        long m7002getFontSizeXSAIIZE = (i5 & 2) != 0 ? textStyle.spanStyle.m7002getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight2 = (i5 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7003getFontStyle4Lr2A7w = (i5 & 8) != 0 ? textStyle.spanStyle.m7003getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7004getFontSynthesisZQGJjVo = (i5 & 16) != 0 ? textStyle.spanStyle.m7004getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i5 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i5 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7005getLetterSpacingXSAIIZE = (i5 & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m7005getLetterSpacingXSAIIZE() : j3;
        BaselineShift m7000getBaselineShift5SSeXJ0 = (i5 & Fields.RotationX) != 0 ? textStyle.spanStyle.m7000getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i5 & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i5 & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = m7001getColor0d7_KjU;
        long m6999getBackground0d7_KjU = (i5 & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m6999getBackground0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i5 & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i5 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i5 & Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int m6965getTextAligne0LSkKk = (i5 & Fields.CompositingStrategy) != 0 ? textStyle.paragraphStyle.m6965getTextAligne0LSkKk() : i;
        int m6967getTextDirections_7Xco = (i5 & 65536) != 0 ? textStyle.paragraphStyle.m6967getTextDirections_7Xco() : i2;
        long m6963getLineHeightXSAIIZE = (i5 & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m6963getLineHeightXSAIIZE() : j5;
        TextIndent textIndent2 = (i5 & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i5 & Fields.BlendMode) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i5 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int m6962getLineBreakrAG3T2k = (i5 & 2097152) != 0 ? textStyle.paragraphStyle.m6962getLineBreakrAG3T2k() : i3;
        int m6960getHyphensvmbZdU8 = (i5 & 4194304) != 0 ? textStyle.paragraphStyle.m6960getHyphensvmbZdU8() : i4;
        if ((i5 & GroupFlagsKt.IsNodeFlag) != 0) {
            i6 = m6960getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            i6 = m6960getHyphensvmbZdU8;
        }
        return textStyle.m7086copyp1EtxEg(j6, m7002getFontSizeXSAIIZE, fontWeight2, m7003getFontStyle4Lr2A7w, m7004getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m7005getLetterSpacingXSAIIZE, m7000getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m6999getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, m6965getTextAligne0LSkKk, m6967getTextDirections_7Xco, m6963getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, m6962getLineBreakrAG3T2k, i6, textMotion2);
    }

    /* renamed from: copy-v2rsoow$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m7074copyv2rsoow$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        long m7001getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m7001getColor0d7_KjU() : j;
        long m7002getFontSizeXSAIIZE = (i & 2) != 0 ? textStyle.spanStyle.m7002getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7003getFontStyle4Lr2A7w = (i & 8) != 0 ? textStyle.spanStyle.m7003getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7004getFontSynthesisZQGJjVo = (i & 16) != 0 ? textStyle.spanStyle.m7004getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7005getLetterSpacingXSAIIZE = (i & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m7005getLetterSpacingXSAIIZE() : j3;
        BaselineShift m7000getBaselineShift5SSeXJ0 = (i & Fields.RotationX) != 0 ? textStyle.spanStyle.m7000getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = m7001getColor0d7_KjU;
        long m6999getBackground0d7_KjU = (i & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m6999getBackground0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i & Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign m7482boximpl = (i & Fields.CompositingStrategy) != 0 ? TextAlign.m7482boximpl(textStyle.paragraphStyle.m6965getTextAligne0LSkKk()) : textAlign;
        TextDirection m7499boximpl = (i & 65536) != 0 ? TextDirection.m7499boximpl(textStyle.paragraphStyle.m6967getTextDirections_7Xco()) : textDirection;
        long m6963getLineHeightXSAIIZE = (i & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m6963getLineHeightXSAIIZE() : j5;
        TextIndent textIndent2 = (i & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & Fields.BlendMode) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m7387boximpl = (i & 2097152) != 0 ? LineBreak.m7387boximpl(textStyle.paragraphStyle.m6962getLineBreakrAG3T2k()) : lineBreak;
        Hyphens m7374boximpl = (i & 4194304) != 0 ? Hyphens.m7374boximpl(textStyle.paragraphStyle.m6960getHyphensvmbZdU8()) : hyphens;
        if ((i & GroupFlagsKt.IsNodeFlag) != 0) {
            hyphens2 = m7374boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            hyphens2 = m7374boximpl;
        }
        return textStyle.m7087copyv2rsoow(j6, m7002getFontSizeXSAIIZE, fontWeight2, m7003getFontStyle4Lr2A7w, m7004getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m7005getLetterSpacingXSAIIZE, m7000getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m6999getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, m7482boximpl, m7499boximpl, m6963getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, m7387boximpl, hyphens2, textMotion2);
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @er
    /* renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m7081copyCXVQc50(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new TextStyle(new SpanStyle(Color.m4762equalsimpl0(j, this.spanStyle.m7001getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, getDrawStyle(), (dq) null), new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), getTextMotion(), (dq) null), platformTextStyle);
    }

    @er
    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m7082copyHL5avdY(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        return new TextStyle(new SpanStyle(Color.m4762equalsimpl0(j, this.spanStyle.m7001getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (dq) null), new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j5, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m7098getLineBreakrAG3T2k(), m7095getHyphensvmbZdU8(), getTextMotion(), (dq) null), this.platformStyle);
    }

    @er
    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m7083copyNOaFTUo(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(Color.m4762equalsimpl0(j, this.spanStyle.m7001getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (dq) null), new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, m7098getLineBreakrAG3T2k(), m7095getHyphensvmbZdU8(), getTextMotion(), (dq) null), platformTextStyle);
    }

    /* renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m7084copyNs73l9s(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (dq) null), new ParagraphStyle(i, i2, j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (dq) null), platformTextStyle);
    }

    @er
    /* renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m7085copyaIRg9q4(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (dq) null), new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), textMotion, (dq) null), platformTextStyle);
    }

    /* renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m7086copyp1EtxEg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m4762equalsimpl0(j, this.spanStyle.m7001getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (dq) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (dq) null), platformTextStyle);
    }

    @er
    /* renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m7087copyv2rsoow(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m4762equalsimpl0(j, this.spanStyle.m7001getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7516from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (dq) null), new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), textMotion, (dq) null), platformTextStyle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return q10.b(this.spanStyle, textStyle.spanStyle) && q10.b(this.paragraphStyle, textStyle.paragraphStyle) && q10.b(this.platformStyle, textStyle.platformStyle);
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m7088getBackground0d7_KjU() {
        return this.spanStyle.m6999getBackground0d7_KjU();
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m7089getBaselineShift5SSeXJ0() {
        return this.spanStyle.m7000getBaselineShift5SSeXJ0();
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m7090getColor0d7_KjU() {
        return this.spanStyle.m7001getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m7091getFontSizeXSAIIZE() {
        return this.spanStyle.m7002getFontSizeXSAIIZE();
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m7092getFontStyle4Lr2A7w() {
        return this.spanStyle.m7003getFontStyle4Lr2A7w();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m7093getFontSynthesisZQGJjVo() {
        return this.spanStyle.m7004getFontSynthesisZQGJjVo();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m7094getHyphensEaSxIns() {
        return Hyphens.m7374boximpl(m7095getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m7095getHyphensvmbZdU8() {
        return this.paragraphStyle.m6960getHyphensvmbZdU8();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m7096getLetterSpacingXSAIIZE() {
        return this.spanStyle.m7005getLetterSpacingXSAIIZE();
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m7097getLineBreakLgCVezo() {
        return LineBreak.m7387boximpl(m7098getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m7098getLineBreakrAG3T2k() {
        return this.paragraphStyle.m6962getLineBreakrAG3T2k();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m7099getLineHeightXSAIIZE() {
        return this.paragraphStyle.m6963getLineHeightXSAIIZE();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle getParagraphStyle$ui_text() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle getSpanStyle$ui_text() {
        return this.spanStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m7100getTextAlignbuA522U() {
        return TextAlign.m7482boximpl(m7101getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m7101getTextAligne0LSkKk() {
        return this.paragraphStyle.m6965getTextAligne0LSkKk();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m7102getTextDirectionmmuk1to() {
        return TextDirection.m7499boximpl(m7103getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m7103getTextDirections_7Xco() {
        return this.paragraphStyle.m6967getTextDirections_7Xco();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text(textStyle.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        if (this != textStyle) {
            return q10.b(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text(textStyle.spanStyle);
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.hashCode() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text() {
        int hashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || textStyle.equals(Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @er
    /* renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m7104mergeZ1GrekI(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle m7006fastMergedSHsh3o = SpanStyleKt.m7006fastMergedSHsh3o(this.spanStyle, j, null, Float.NaN, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle m6968fastMergej5T8yCg = ParagraphStyleKt.m6968fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == m7006fastMergedSHsh3o && this.paragraphStyle == m6968fastMergej5T8yCg) ? this : new TextStyle(m7006fastMergedSHsh3o, m6968fastMergej5T8yCg);
    }

    /* renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m7105mergedA7vx0o(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i3, int i4, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle m7006fastMergedSHsh3o = SpanStyleKt.m7006fastMergedSHsh3o(this.spanStyle, j, null, Float.NaN, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle m6968fastMergej5T8yCg = ParagraphStyleKt.m6968fastMergej5T8yCg(this.paragraphStyle, i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion);
        return (this.spanStyle == m7006fastMergedSHsh3o && this.paragraphStyle == m6968fastMergej5T8yCg) ? this : new TextStyle(m7006fastMergedSHsh3o, m6968fastMergej5T8yCg);
    }

    public final TextStyle plus(TextStyle textStyle) {
        return merge(textStyle);
    }

    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m4769toStringimpl(m7090getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m7812toStringimpl(m7091getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m7092getFontStyle4Lr2A7w() + ", fontSynthesis=" + m7093getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m7812toStringimpl(m7096getLetterSpacingXSAIIZE())) + ", baselineShift=" + m7089getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m4769toStringimpl(m7088getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m7487toStringimpl(m7101getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m7504toStringimpl(m7103getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m7812toStringimpl(m7099getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m7398toStringimpl(m7098getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m7379toStringimpl(m7095getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    public final TextStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public final TextStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    @er
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, dq dqVar) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @er
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, dq dqVar) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent);
    }

    @er
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, dq dqVar) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle);
    }

    @er
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, dq dqVar) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, dq dqVar) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i, i2, j4, textIndent, platformTextStyle, lineHeightStyle, i3, i4, textMotion);
    }

    @er
    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, dq dqVar) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, textAlign, textDirection, j4, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i, dq dqVar) {
        this(spanStyle, paragraphStyle, (i & 4) != 0 ? null : platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, r0);
        PlatformTextStyle createPlatformTextStyleInternal;
        createPlatformTextStyleInternal = TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i, dq dqVar) {
        this(r18, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r42, r1, r2, r20, r21, (i & Fields.RenderEffect) != 0 ? null : textIndent, null);
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
        long j6 = m4797getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i & Fields.Clip) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i & Fields.CompositingStrategy) != 0 ? null : textDirection;
        long m7816getUnspecifiedXSAIIZE3 = (i & 65536) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j5;
        long j7 = m7816getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = m7816getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = m4797getUnspecified0d7_KjU2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        this(r0, new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j5, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), (TextMotion) null, (dq) null), null);
        SpanStyle spanStyle = new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (dq) null);
    }

    @er
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m7075getHyphensEaSxIns$annotations() {
    }

    @er
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m7076getLineBreakLgCVezo$annotations() {
    }

    @er
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m7077getTextAlignbuA522U$annotations() {
    }

    @er
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m7078getTextDirectionmmuk1to$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, dq dqVar) {
        this(r18, r30, r32, r33, r34, r35, r36, r37, r39, r40, r41, r42, r44, r1, r2, r20, r21, r23, r24, (i & Fields.BlendMode) != 0 ? null : lineHeightStyle, null);
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
        long j6 = m4797getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i & Fields.Clip) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i & Fields.CompositingStrategy) != 0 ? null : textDirection;
        long m7816getUnspecifiedXSAIIZE3 = (i & 65536) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j5;
        TextIndent textIndent2 = (i & Fields.RenderEffect) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & Fields.ColorFilter) != 0 ? null : platformTextStyle;
        long j7 = m7816getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = m7816getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = m4797getUnspecified0d7_KjU2;
    }

    public final TextStyle merge(SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (dq) null), new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), (TextMotion) null, (dq) null), platformTextStyle);
    }

    public final TextStyle merge(ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, dq dqVar) {
        this(r18, r32, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r46, r1, r2, r20, r21, r23, r24, r25, r26, (i & 2097152) != 0 ? null : hyphens, null);
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
        long j6 = m4797getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i & Fields.Clip) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i & Fields.CompositingStrategy) != 0 ? null : textDirection;
        long m7816getUnspecifiedXSAIIZE3 = (i & 65536) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j5;
        TextIndent textIndent2 = (i & Fields.RenderEffect) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & Fields.ColorFilter) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & Fields.BlendMode) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i & 1048576) != 0 ? null : lineBreak;
        long j7 = m7816getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = m7816getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = m4797getUnspecified0d7_KjU2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(r1, new ParagraphStyle(r3, r4, j5, textIndent, r24, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), (TextMotion) null, Fields.RotationX, (dq) null), platformTextStyle);
        SpanStyle spanStyle = new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, Fields.CompositingStrategy, (dq) null);
        int m7488unboximpl = textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk();
        int m7505unboximpl = textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco();
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, dq dqVar) {
        this(r18, r34, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r48, r1, r2, r20, r21, r22, r24, r25, r26, r27, r28, (i & GroupFlagsKt.IsNodeFlag) != 0 ? null : textMotion, (dq) null);
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
        long j6 = m4797getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i & Fields.Clip) != 0 ? null : drawStyle;
        TextAlign textAlign2 = (i & Fields.CompositingStrategy) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i & 65536) != 0 ? null : textDirection;
        long m7816getUnspecifiedXSAIIZE3 = (i & Fields.RenderEffect) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j5;
        TextIndent textIndent2 = (i & Fields.ColorFilter) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & Fields.BlendMode) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & 1048576) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i & 2097152) != 0 ? null : lineBreak;
        Hyphens hyphens2 = (i & 4194304) != 0 ? null : hyphens;
        long j7 = m7816getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = m7816getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = m4797getUnspecified0d7_KjU2;
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (dq) null), new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), textMotion, (dq) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, dq dqVar) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, i, i2, j5, textIndent, platformTextStyle, lineHeightStyle, i3, i4, textMotion);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (dq) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (dq) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, dq dqVar) {
        this(brush, (i5 & 2) != 0 ? Float.NaN : f, (i5 & 4) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : fontWeight, (i5 & 16) != 0 ? null : fontStyle, (i5 & 32) != 0 ? null : fontSynthesis, (i5 & 64) != 0 ? null : fontFamily, (i5 & Fields.SpotShadowColor) != 0 ? null : str, (i5 & Fields.RotationX) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j2, (i5 & Fields.RotationY) != 0 ? null : baselineShift, (i5 & Fields.RotationZ) != 0 ? null : textGeometricTransform, (i5 & Fields.CameraDistance) != 0 ? null : localeList, (i5 & Fields.TransformOrigin) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3, (i5 & 8192) != 0 ? null : textDecoration, (i5 & Fields.Clip) != 0 ? null : shadow, (32768 & i5) != 0 ? null : drawStyle, (65536 & i5) != 0 ? TextAlign.Companion.m7495getUnspecifiede0LSkKk() : i, (131072 & i5) != 0 ? TextDirection.Companion.m7511getUnspecifieds_7Xco() : i2, (262144 & i5) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j4, (524288 & i5) != 0 ? null : textIndent, (1048576 & i5) != 0 ? null : platformTextStyle, (2097152 & i5) != 0 ? null : lineHeightStyle, (4194304 & i5) != 0 ? LineBreak.Companion.m7407getUnspecifiedrAG3T2k() : i3, (8388608 & i5) != 0 ? Hyphens.Companion.m7383getUnspecifiedvmbZdU8() : i4, (i5 & GroupFlagsKt.HasObjectKeyFlag) != 0 ? null : textMotion, (dq) null);
    }

    private TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (dq) null), new ParagraphStyle(i, i2, j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (dq) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, dq dqVar) {
        this(brush, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : fontWeight, (i & 16) != 0 ? null : fontStyle, (i & 32) != 0 ? null : fontSynthesis, (i & 64) != 0 ? null : fontFamily, (i & Fields.SpotShadowColor) != 0 ? null : str, (i & Fields.RotationX) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j2, (i & Fields.RotationY) != 0 ? null : baselineShift, (i & Fields.RotationZ) != 0 ? null : textGeometricTransform, (i & Fields.CameraDistance) != 0 ? null : localeList, (i & Fields.TransformOrigin) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3, (i & 8192) != 0 ? null : textDecoration, (i & Fields.Clip) != 0 ? null : shadow, (32768 & i) != 0 ? null : drawStyle, (65536 & i) != 0 ? null : textAlign, (131072 & i) != 0 ? null : textDirection, (262144 & i) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j4, (524288 & i) != 0 ? null : textIndent, (1048576 & i) != 0 ? null : platformTextStyle, (2097152 & i) != 0 ? null : lineHeightStyle, (4194304 & i) != 0 ? null : lineBreak, (8388608 & i) != 0 ? null : hyphens, (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? null : textMotion, (dq) null);
    }

    private TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (dq) null), new ParagraphStyle(textAlign != null ? textAlign.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7505unboximpl() : TextDirection.Companion.m7511getUnspecifieds_7Xco(), j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7399unboximpl() : LineBreak.Companion.m7407getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7380unboximpl() : Hyphens.Companion.m7383getUnspecifiedvmbZdU8(), textMotion, (dq) null), platformTextStyle);
    }
}
