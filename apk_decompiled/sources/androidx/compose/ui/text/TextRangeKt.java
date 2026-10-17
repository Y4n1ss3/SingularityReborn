package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m7049constructorimpl(packWithCheck(i, i2));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m7066coerceIn8ffj60Q(long j, int i, int i2) {
        int m7060getStartimpl = TextRange.m7060getStartimpl(j);
        if (m7060getStartimpl < i) {
            m7060getStartimpl = i;
        }
        if (m7060getStartimpl > i2) {
            m7060getStartimpl = i2;
        }
        int m7055getEndimpl = TextRange.m7055getEndimpl(j);
        if (m7055getEndimpl >= i) {
            i = m7055getEndimpl;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (m7060getStartimpl == TextRange.m7060getStartimpl(j) && i2 == TextRange.m7055getEndimpl(j)) ? j : TextRange(m7060getStartimpl, i2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m7067substringFDrldGo(CharSequence charSequence, long j) {
        return charSequence.subSequence(TextRange.m7058getMinimpl(j), TextRange.m7057getMaximpl(j)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}
