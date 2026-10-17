package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PartialGapBuffer implements CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private CharSequence text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(CharSequence charSequence) {
        this.text = charSequence;
    }

    public static /* synthetic */ void replace$default(PartialGapBuffer partialGapBuffer, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        partialGapBuffer.replace(i, i2, charSequence, i6, i4);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return q10.b(toString(), charSequence.toString());
    }

    public char get(int i) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i);
        }
        if (i < this.bufStart) {
            return this.text.charAt(i);
        }
        int length = gapBuffer.length();
        int i2 = this.bufStart;
        return i < length + i2 ? gapBuffer.get(i - i2) : this.text.charAt(i - ((length - this.bufEnd) + i2));
    }

    public int getLength() {
        GapBuffer gapBuffer = this.buffer;
        CharSequence charSequence = this.text;
        return gapBuffer == null ? charSequence.length() : (charSequence.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final void replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!(i <= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("start=" + i + " > end=" + i2);
        }
        if (!(i3 <= i4)) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i);
        }
        if (!(i3 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart must be non-negative, but was " + i3);
        }
        GapBuffer gapBuffer = this.buffer;
        int i5 = i4 - i3;
        if (gapBuffer != null) {
            int i6 = this.bufStart;
            int i7 = i - i6;
            int i8 = i2 - i6;
            if (i7 >= 0 && i8 <= gapBuffer.length()) {
                gapBuffer.replace(i7, i8, charSequence, i3, i4);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i, i2, charSequence, i3, i4);
            return;
        }
        int max = Math.max(255, i5 + Fields.SpotShadowColor);
        char[] cArr = new char[max];
        int min = Math.min(i, 64);
        int min2 = Math.min(this.text.length() - i2, 64);
        int i9 = i - min;
        ToCharArray_androidKt.toCharArray(this.text, cArr, 0, i9, i);
        int i10 = max - min2;
        int i11 = min2 + i2;
        ToCharArray_androidKt.toCharArray(this.text, cArr, i10, i2, i11);
        ToCharArray_androidKt.toCharArray(charSequence, cArr, min, i3, i4);
        this.buffer = new GapBuffer(cArr, min + i5, i10);
        this.bufStart = i9;
        this.bufEnd = i11;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        CharSequence charSequence = this.text;
        if (gapBuffer == null) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, this.bufStart);
        gapBuffer.append(sb);
        CharSequence charSequence2 = this.text;
        sb.append(charSequence2, this.bufEnd, charSequence2.length());
        return sb.toString();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
