package androidx.compose.foundation.text;

import android.text.Spanned;
import defpackage.at;
import defpackage.c8;
import defpackage.d41;
import defpackage.lt;
import defpackage.o;
import defpackage.s01;
import java.text.BreakIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class StringHelpers_androidKt {
    private static final int findCodePointBefore(CharSequence charSequence, int i, int i2) {
        return i <= 0 ? i2 : Character.offsetByCodePoints(charSequence, i, -1);
    }

    public static final int findCodePointOrEmojiStartBefore(String str, int i, int i2) {
        if (i <= 0) {
            return i2;
        }
        at emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        if (emojiCompatIfLoaded == null) {
            return findCodePointBefore(str, i, i2);
        }
        int b = emojiCompatIfLoaded.b(str, i - 1);
        return b < 0 ? findCodePointBefore(str, i, i2) : b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int findFollowingBreak(String str, int i) {
        String str2;
        int i2;
        at emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            if (!(emojiCompatIfLoaded.c() == 1)) {
                o.f("Not initialized yet");
                return 0;
            }
            d41.e(str, "charSequence cannot be null");
            c8 c8Var = emojiCompatIfLoaded.e.b;
            c8Var.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    s01[] s01VarArr = (s01[]) spanned.getSpans(i, i + 1, s01.class);
                    if (s01VarArr.length > 0) {
                        i2 = spanned.getSpanEnd(s01VarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((lt) c8Var.j(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new lt(i))).c;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int findPrecedingBreak(String str, int i) {
        at emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.b(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    private static final at getEmojiCompatIfLoaded() {
        if (!at.d()) {
            return null;
        }
        at a = at.a();
        if (a.c() == 1) {
            return a;
        }
        return null;
    }
}
