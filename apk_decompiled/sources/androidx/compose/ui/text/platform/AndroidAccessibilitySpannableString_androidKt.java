package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i, int i2, Density density, FontFamily.Resolver resolver) {
        SpannableExtensions_androidKt.m7340setColorRPmYEkk(spannableString, spanStyle.m7001getColor0d7_KjU(), i, i2);
        SpannableExtensions_androidKt.m7341setFontSizeKmRG4DE(spannableString, spanStyle.m7002getFontSizeXSAIIZE(), density, i, i2);
        if (spanStyle.getFontWeight() != null || spanStyle.m7003getFontStyle4Lr2A7w() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m7003getFontStyle4Lr2A7w = spanStyle.m7003getFontStyle4Lr2A7w();
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m7124getAndroidTypefaceStyleFO1MlWM(fontWeight, m7003getFontStyle4Lr2A7w != null ? m7003getFontStyle4Lr2A7w.m7175unboximpl() : FontStyle.Companion.m7179getNormal_LCdwA())), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis m7004getFontSynthesisZQGJjVo = spanStyle.m7004getFontSynthesisZQGJjVo();
                Object value = FontFamily.Resolver.m7144resolveDPcqOEQ$default(resolver, fontFamily, null, 0, m7004getFontSynthesisZQGJjVo != null ? m7004getFontSynthesisZQGJjVo.m7188unboximpl() : FontSynthesis.Companion.m7189getAllGVVA2EU(), 6, null).getValue();
                value.getClass();
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i, i2, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i, i2);
        SpannableExtensions_androidKt.m7338setBackgroundRPmYEkk(spannableString, spanStyle.m6999getBackground0d7_KjU(), i, i2);
    }

    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver, URLSpanCache uRLSpanCache) {
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text = annotatedString.getSpanStylesOrNull$ui_text();
        if (spanStylesOrNull$ui_text != null) {
            int size = spanStylesOrNull$ui_text.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text.get(i);
                setSpanStyle(spannableString, SpanStyle.m6992copyGSF8kmg$default(range.component1(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.component2(), range.component3(), density, resolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i2);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.component2(), range2.component3(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i3);
            spannableString.setSpan(uRLSpanCache.toURLSpan(range3.component1()), range3.component2(), range3.component3(), 33);
        }
        List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
        int size4 = linkAnnotations.size();
        for (int i4 = 0; i4 < size4; i4++) {
            AnnotatedString.Range<LinkAnnotation> range4 = linkAnnotations.get(i4);
            if (range4.getStart() != range4.getEnd()) {
                LinkAnnotation item = range4.getItem();
                if ((item instanceof LinkAnnotation.Url) && ((LinkAnnotation.Url) item).getLinkInteractionListener() == null) {
                    spannableString.setSpan(uRLSpanCache.toURLSpan(toUrlLink(range4)), range4.getStart(), range4.getEnd(), 33);
                } else {
                    spannableString.setSpan(uRLSpanCache.toClickableSpan(range4), range4.getStart(), range4.getEnd(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final AnnotatedString.Range<LinkAnnotation.Url> toUrlLink(AnnotatedString.Range<LinkAnnotation> range) {
        LinkAnnotation item = range.getItem();
        item.getClass();
        return new AnnotatedString.Range<>((LinkAnnotation.Url) item, range.getStart(), range.getEnd());
    }
}
