package androidx.compose.ui.text.input;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(String str) {
        this.text = str;
    }

    public final char get(int i) {
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

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        String str = this.text;
        return gapBuffer == null ? str.length() : (str.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public final String getText() {
        return this.text;
    }

    public final void replace(int i, int i2, String str) {
        if (!(i <= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i);
        }
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer != null) {
            int i3 = this.bufStart;
            int i4 = i - i3;
            int i5 = i2 - i3;
            if (i4 >= 0 && i5 <= gapBuffer.length()) {
                gapBuffer.replace(i4, i5, str);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i, i2, str);
            return;
        }
        int max = Math.max(255, str.length() + Fields.SpotShadowColor);
        char[] cArr = new char[max];
        int min = Math.min(i, 64);
        int min2 = Math.min(this.text.length() - i2, 64);
        int i6 = i - min;
        GapBuffer_jvmAndAndroidKt.toCharArray(this.text, cArr, 0, i6, i);
        int i7 = max - min2;
        int i8 = min2 + i2;
        GapBuffer_jvmAndAndroidKt.toCharArray(this.text, cArr, i7, i2, i8);
        GapBufferKt.toCharArray(str, cArr, min);
        this.buffer = new GapBuffer(cArr, str.length() + min, i7);
        this.bufStart = i6;
        this.bufEnd = i8;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        String str = this.text;
        if (gapBuffer == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.bufStart);
        gapBuffer.append(sb);
        String str2 = this.text;
        sb.append((CharSequence) str2, this.bufEnd, str2.length());
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
