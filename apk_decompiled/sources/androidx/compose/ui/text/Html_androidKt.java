package androidx.compose.ui.text;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.dq;
import defpackage.q10;
import defpackage.uo;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Html_androidKt {
    private static final String AnnotationTag = "annotation";
    private static final String ContentHandlerReplacementTag = "ContentHandlerReplacementTag";
    private static final String Li = "li";
    private static final Html_androidKt$TagHandler$1 TagHandler = new Html.TagHandler() { // from class: androidx.compose.ui.text.Html_androidKt$TagHandler$1
        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z || !q10.b(str, "ContentHandlerReplacementTag")) {
                return;
            }
            xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
        }
    };
    private static final String Ul = "ul";

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void addSpan(AnnotatedString.Builder builder, Object obj, int i, int i2, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        String url;
        if (obj instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj instanceof AlignmentSpan) {
            builder.addStyle(toParagraphStyle((AlignmentSpan) obj), i, i2);
            return;
        }
        if (obj instanceof AnnotationSpan) {
            AnnotationSpan annotationSpan = (AnnotationSpan) obj;
            builder.addStringAnnotation(annotationSpan.getKey(), annotationSpan.getValue(), i, i2);
            return;
        }
        if (obj instanceof BackgroundColorSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (dq) null), i, i2);
            return;
        }
        if (obj instanceof BulletSpanWithLevel) {
            long m6904getDefaultIndentationXSAIIZE = Bullet.Companion.m6904getDefaultIndentationXSAIIZE();
            BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
            int indentationLevel = bulletSpanWithLevel.getIndentationLevel();
            TextUnitKt.m7818checkArithmeticR2X_6o(m6904getDefaultIndentationXSAIIZE);
            builder.m6897addBulletr9BaKPg(bulletSpanWithLevel.getBullet(), TextUnitKt.pack(TextUnit.m7803getRawTypeimpl(m6904getDefaultIndentationXSAIIZE), TextUnit.m7805getValueimpl(m6904getDefaultIndentationXSAIIZE) * indentationLevel), i, i2);
            return;
        }
        if (obj instanceof ForegroundColorSpan) {
            builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (dq) null), i, i2);
            return;
        }
        if (obj instanceof RelativeSizeSpan) {
            builder.addStyle(new SpanStyle(0L, TextUnitKt.getEm(((RelativeSizeSpan) obj).getSizeChange()), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65533, (dq) null), i, i2);
            return;
        }
        if (obj instanceof StrikethroughSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (dq) null), i, i2);
            return;
        }
        if (obj instanceof StyleSpan) {
            SpanStyle spanStyle = toSpanStyle((StyleSpan) obj);
            if (spanStyle != null) {
                builder.addStyle(spanStyle, i, i2);
                return;
            }
            return;
        }
        if (obj instanceof SubscriptSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m7351boximpl(BaselineShift.Companion.m7363getSubscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (dq) null), i, i2);
            return;
        }
        if (obj instanceof SuperscriptSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m7351boximpl(BaselineShift.Companion.m7364getSuperscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (dq) null), i, i2);
            return;
        }
        if (obj instanceof TypefaceSpan) {
            builder.addStyle(toSpanStyle((TypefaceSpan) obj), i, i2);
            return;
        }
        if (obj instanceof UnderlineSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (dq) null), i, i2);
        } else {
            if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                return;
            }
            builder.addLink(new LinkAnnotation.Url(url, textLinkStyles, linkInteractionListener), i, i2);
        }
    }

    private static final void addSpans(AnnotatedString.Builder builder, Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        for (Object obj : spanned.getSpans(0, builder.getLength(), Object.class)) {
            long TextRange = TextRangeKt.TextRange(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            addSpan(builder, obj, TextRange.m7060getStartimpl(TextRange), TextRange.m7055getEndimpl(TextRange), textLinkStyles, linkInteractionListener);
        }
    }

    public static final AnnotatedString fromHtml(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        return toAnnotatedString(Html.fromHtml(uo.c("<ContentHandlerReplacementTag />", str), 63, null, TagHandler), textLinkStyles, linkInteractionListener);
    }

    public static /* synthetic */ AnnotatedString fromHtml$default(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, Object obj) {
        if ((i & 2) != 0) {
            textLinkStyles = null;
        }
        if ((i & 4) != 0) {
            linkInteractionListener = null;
        }
        return fromHtml(companion, str, textLinkStyles, linkInteractionListener);
    }

    private static final FontFamily optionalFontFamilyFromName(String str) {
        if (str != null && str.length() != 0) {
            Typeface create = Typeface.create(str, 0);
            Typeface typeface = Typeface.DEFAULT;
            if (q10.b(create, typeface) || q10.b(create, Typeface.create(typeface, 0))) {
                create = null;
            }
            if (create != null) {
                return AndroidTypeface_androidKt.FontFamily(create);
            }
        }
        return null;
    }

    public static final AnnotatedString toAnnotatedString(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        AnnotatedString.Builder append = new AnnotatedString.Builder(spanned.length()).append((CharSequence) spanned);
        addSpans(append, spanned, textLinkStyles, linkInteractionListener);
        return append.toAnnotatedString();
    }

    public static /* synthetic */ AnnotatedString toAnnotatedString$default(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, Object obj) {
        if ((i & 1) != 0) {
            textLinkStyles = null;
        }
        if ((i & 2) != 0) {
            linkInteractionListener = null;
        }
        return toAnnotatedString(spanned, textLinkStyles, linkInteractionListener);
    }

    private static final ParagraphStyle toParagraphStyle(AlignmentSpan alignmentSpan) {
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        return new ParagraphStyle(i != 1 ? i != 2 ? i != 3 ? TextAlign.Companion.m7495getUnspecifiede0LSkKk() : TextAlign.Companion.m7490getEnde0LSkKk() : TextAlign.Companion.m7489getCentere0LSkKk() : TextAlign.Companion.m7494getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 510, (dq) null);
    }

    private static final SpanStyle toSpanStyle(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (dq) null);
        }
        if (style == 2) {
            return new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m7169boximpl(FontStyle.Companion.m7178getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (dq) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m7169boximpl(FontStyle.Companion.m7178getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (dq) null);
    }

    private static final SpanStyle toSpanStyle(TypefaceSpan typefaceSpan) {
        FontFamily serif;
        String family = typefaceSpan.getFamily();
        FontFamily.Companion companion = FontFamily.Companion;
        if (q10.b(family, companion.getCursive().getName())) {
            serif = companion.getCursive();
        } else if (q10.b(family, companion.getMonospace().getName())) {
            serif = companion.getMonospace();
        } else if (q10.b(family, companion.getSansSerif().getName())) {
            serif = companion.getSansSerif();
        } else {
            serif = q10.b(family, companion.getSerif().getName()) ? companion.getSerif() : optionalFontFamilyFromName(typefaceSpan.getFamily());
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, serif, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (dq) null);
    }
}
