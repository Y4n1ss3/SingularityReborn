package androidx.compose.foundation.text.input.internal;

import defpackage.ac;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i, int i2) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i;
        this.gapEnd = i2;
    }

    private final void delete(int i, int i2) {
        int i3 = this.gapStart;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.buffer;
            ac.M(cArr, cArr, this.gapEnd - i4, i2, i3);
            this.gapStart = i;
            this.gapEnd -= i4;
            return;
        }
        if (i < i3 && i2 >= i3) {
            this.gapEnd = i2 + gapLength();
            this.gapStart = i;
            return;
        }
        int gapLength = i + gapLength();
        int gapLength2 = i2 + gapLength();
        int i5 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ac.M(cArr2, cArr2, this.gapStart, i5, gapLength);
        this.gapStart += gapLength - i5;
        this.gapEnd = gapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i) {
        if (i <= gapLength()) {
            return;
        }
        int gapLength = i - gapLength();
        int i2 = this.capacity;
        do {
            i2 *= 2;
        } while (i2 - this.capacity < gapLength);
        char[] cArr = new char[i2];
        ac.M(this.buffer, cArr, 0, 0, this.gapStart);
        int i3 = this.capacity;
        int i4 = this.gapEnd;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        ac.M(this.buffer, cArr, i6, i4, i5 + i4);
        this.buffer = cArr;
        this.capacity = i2;
        this.gapEnd = i6;
    }

    public static /* synthetic */ void replace$default(GapBuffer gapBuffer, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        gapBuffer.replace(i, i2, charSequence, i6, i4);
    }

    public final void append(StringBuilder sb) {
        sb.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i = this.gapEnd;
        sb.append(cArr, i, this.capacity - i);
    }

    public final char get(int i) {
        int i2 = this.gapStart;
        char[] cArr = this.buffer;
        return i < i2 ? cArr[i] : cArr[(i - i2) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        int i5 = i4 - i3;
        makeSureAvailableSpace(i5 - (i2 - i));
        delete(i, i2);
        ToCharArray_androidKt.toCharArray(charSequence, this.buffer, this.gapStart, i3, i4);
        this.gapStart += i5;
    }

    public String toString() {
        return "";
    }
}
