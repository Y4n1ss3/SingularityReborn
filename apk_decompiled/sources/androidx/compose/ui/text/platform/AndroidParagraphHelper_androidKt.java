package androidx.compose.ui.text.platform;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import defpackage.at;
import defpackage.oy;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidParagraphHelper_androidKt {
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v6, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [at] */
    public static final CharSequence createCharSequence(String str, float f, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, oy oyVar, boolean z) {
        CharSequence charSequence;
        float f2;
        Density density2;
        PlatformParagraphStyle paragraphStyle;
        if (z && at.d()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            EmojiSupportMatch m6907boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m6907boximpl(paragraphStyle.m6988getEmojiSupportMatch_3YsG6Y());
            charSequence = at.a().g(str, 0, str.length(), m6907boximpl == null ? 0 : EmojiSupportMatch.m6910equalsimpl0(m6907boximpl.m6913unboximpl(), EmojiSupportMatch.Companion.m6914getAll_3YsG6Y()));
            charSequence.getClass();
        } else {
            charSequence = str;
        }
        if (list.isEmpty() && list2.isEmpty() && q10.b(textStyle.getTextIndent(), TextIndent.Companion.getNone()) && TextUnit.m7803getRawTypeimpl(textStyle.m7099getLineHeightXSAIIZE()) == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (q10.b(textStyle.getTextDecoration(), TextDecoration.Companion.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, str.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            SpannableExtensions_androidKt.m7343setLineHeightr9BaKPg(spannableString, textStyle.m7099getLineHeightXSAIIZE(), f, density);
            f2 = f;
            density2 = density;
        } else {
            LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.Companion.getDefault();
            }
            f2 = f;
            density2 = density;
            SpannableExtensions_androidKt.m7342setLineHeightKmRG4DE(spannableString, textStyle.m7099getLineHeightXSAIIZE(), f2, density2, lineHeightStyle);
        }
        SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f2, density2);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density2, oyVar);
        SpannableExtensions_androidKt.setBulletSpans(spannableString, list, f2, density2, textStyle.getTextIndent());
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, list2, density2);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return false;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
