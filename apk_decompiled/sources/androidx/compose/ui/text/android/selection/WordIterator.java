package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.at;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public WordIterator(CharSequence charSequence, int i, int i2, Locale locale) {
        this.charSequence = charSequence;
        if (!(i >= 0 && i <= charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
        }
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i - 50);
        this.end = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i, i2));
    }

    private final void checkOffsetIsValid(int i) {
        int i2 = this.start;
        boolean z = false;
        if (i <= this.end && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder f = kp0.f(i, "Invalid offset: ", ". Valid range is [");
        f.append(this.start);
        f.append(" , ");
        f.append(this.end);
        f.append(']');
        InlineClassHelperKt.throwIllegalArgumentException(f.toString());
    }

    private final int getBeginning(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isOnLetterOrDigitOrEmoji(i)) {
            return (!isBoundary(i) || (isAfterLetterOrDigitOrEmoji(i) && z)) ? prevBoundary(i) : i;
        }
        if (isAfterLetterOrDigitOrEmoji(i)) {
            return prevBoundary(i);
        }
        return -1;
    }

    private final int getEnd(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isAfterLetterOrDigitOrEmoji(i)) {
            return (!isBoundary(i) || (isOnLetterOrDigitOrEmoji(i) && z)) ? nextBoundary(i) : i;
        }
        if (isOnLetterOrDigitOrEmoji(i)) {
            return nextBoundary(i);
        }
        return -1;
    }

    private final boolean isAfterLetterOrDigitOrEmoji(int i) {
        int i2 = this.start + 1;
        if (i > this.end || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(this.charSequence.charAt(i3))) {
                if (!at.d()) {
                    return false;
                }
                at a = at.a();
                if (a.c() != 1 || a.b(this.charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean isBoundary(int i) {
        checkOffsetIsValid(i);
        if (!this.iterator.isBoundary(i)) {
            return false;
        }
        if (isOnLetterOrDigitOrEmoji(i) && isOnLetterOrDigitOrEmoji(i - 1) && isOnLetterOrDigitOrEmoji(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.charSequence.length() - 1 || !(isHiraganaKatakanaBoundary(i) || isHiraganaKatakanaBoundary(i + 1));
    }

    private final boolean isHiraganaKatakanaBoundary(int i) {
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(this.charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (q10.b(of, unicodeBlock) && q10.b(Character.UnicodeBlock.of(this.charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return q10.b(Character.UnicodeBlock.of(this.charSequence.charAt(i)), unicodeBlock) && q10.b(Character.UnicodeBlock.of(this.charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean isOnLetterOrDigitOrEmoji(int i) {
        int i2 = this.start;
        if (i >= this.end || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i)) && !Character.isSurrogate(this.charSequence.charAt(i))) {
            if (!at.d()) {
                return false;
            }
            at a = at.a();
            if (a.c() != 1 || a.b(this.charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    private final boolean isPunctuationEndBoundary(int i) {
        return !isOnPunctuation(i) && isAfterPunctuation(i);
    }

    private final boolean isPunctuationStartBoundary(int i) {
        return isOnPunctuation(i) && !isAfterPunctuation(i);
    }

    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i) {
        return getEnd(i, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i) {
        return getBeginning(i, true);
    }

    public final int getPunctuationBeginning(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationStartBoundary(i)) {
            i = prevBoundary(i);
        }
        return i;
    }

    public final int getPunctuationEnd(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationEndBoundary(i)) {
            i = nextBoundary(i);
        }
        return i;
    }

    public final boolean isAfterPunctuation(int i) {
        int i2 = this.start + 1;
        if (i > this.end || i2 > i) {
            return false;
        }
        return Companion.isPunctuation$ui_text(Character.codePointBefore(this.charSequence, i));
    }

    public final boolean isOnPunctuation(int i) {
        int i2 = this.start;
        if (i >= this.end || i2 > i) {
            return false;
        }
        return Companion.isPunctuation$ui_text(Character.codePointAt(this.charSequence, i));
    }

    public final int nextBoundary(int i) {
        checkOffsetIsValid(i);
        int following = this.iterator.following(i);
        return (isOnLetterOrDigitOrEmoji(following + (-1)) && isOnLetterOrDigitOrEmoji(following) && !isHiraganaKatakanaBoundary(following)) ? nextBoundary(following) : following;
    }

    public final int prevBoundary(int i) {
        checkOffsetIsValid(i);
        int preceding = this.iterator.preceding(i);
        return (isOnLetterOrDigitOrEmoji(preceding) && isAfterLetterOrDigitOrEmoji(preceding) && !isHiraganaKatakanaBoundary(preceding)) ? prevBoundary(preceding) : preceding;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final boolean isPunctuation$ui_text(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private Companion() {
        }
    }
}
