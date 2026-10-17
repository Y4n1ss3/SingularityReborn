package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null) {
            spannable = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannable, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannable, new IndentationFixSpan(), spannable.length() - 1, spannable.length() - 1);
        }
        return spannable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        if (z && !TextUnit.m7802equalsimpl0(textStyle.m7096getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m7802equalsimpl0(textStyle.m7096getLetterSpacingXSAIIZE(), TextUnit.Companion.m7816getUnspecifiedXSAIIZE())) {
            int m7101getTextAligne0LSkKk = textStyle.m7101getTextAligne0LSkKk();
            TextAlign.Companion companion = TextAlign.Companion;
            if (!TextAlign.m7485equalsimpl0(m7101getTextAligne0LSkKk, companion.m7495getUnspecifiede0LSkKk()) && !TextAlign.m7485equalsimpl0(textStyle.m7101getTextAligne0LSkKk(), companion.m7494getStarte0LSkKk()) && !TextAlign.m7485equalsimpl0(textStyle.m7101getTextAligne0LSkKk(), companion.m7491getJustifye0LSkKk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m6889toLayoutAlignaXe7zB0(int i) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m7485equalsimpl0(i, companion.m7492getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m7485equalsimpl0(i, companion.m7493getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m7485equalsimpl0(i, companion.m7489getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m7485equalsimpl0(i, companion.m7494getStarte0LSkKk()) && TextAlign.m7485equalsimpl0(i, companion.m7490getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m6890toLayoutBreakStrategyxImikfE(int i) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (LineBreak.Strategy.m7411equalsimpl0(i, companion.m7417getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m7411equalsimpl0(i, companion.m7416getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m7411equalsimpl0(i, companion.m7415getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m6891toLayoutHyphenationFrequency3fSNIE(int i) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m7377equalsimpl0(i, companion.m7381getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m7377equalsimpl0(i, companion.m7382getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m6892toLayoutLineBreakStylehpcqdu8(int i) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (LineBreak.Strictness.m7422equalsimpl0(i, companion.m7426getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m7422equalsimpl0(i, companion.m7427getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m7422equalsimpl0(i, companion.m7428getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m7422equalsimpl0(i, companion.m7429getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m6893toLayoutLineBreakWordStylewPN0Rpw(int i) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        return (!LineBreak.WordBreak.m7434equalsimpl0(i, companion.m7438getDefaultjp8hJ3c()) && LineBreak.WordBreak.m7434equalsimpl0(i, companion.m7439getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m6894toLayoutTextGranularityduNsdkg(int i) {
        TextGranularity.Companion companion = TextGranularity.Companion;
        return (!TextGranularity.m7018equalsimpl0(i, companion.m7022getCharacterDRrd7Zo()) && TextGranularity.m7018equalsimpl0(i, companion.m7023getWordDRrd7Zo())) ? 1 : 0;
    }
}
