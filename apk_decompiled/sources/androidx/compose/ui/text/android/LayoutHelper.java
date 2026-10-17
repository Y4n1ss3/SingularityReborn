package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import defpackage.ds0;
import defpackage.j50;
import defpackage.p01;
import defpackage.q10;
import defpackage.uf;
import defpackage.y80;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bidiRun.start;
            }
            if ((i3 & 2) != 0) {
                i2 = bidiRun.end;
            }
            if ((i3 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i, i2, z);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int i, int i2, boolean z) {
            return new BidiRun(i, i2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRtl) + j50.b(this.end, Integer.hashCode(this.start) * 31, 31);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", isRtl=");
            return uf.e(sb, this.isRtl, ')');
        }
    }

    public LayoutHelper(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int l0 = ds0.l0(this.layout.getText(), '\n', i, 4);
            i = l0 < 0 ? this.layout.getText().length() : l0 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i, boolean z) {
        int lineEnd = this.layout.getLineEnd(this.layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        Layout layout = this.layout;
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i, z);
    }

    private final int lineEndToVisibleEnd(int i, int i2) {
        while (i > i2 && isLineEndSpace(this.layout.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3.getRunCount() == 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi analyzeBidi(int i) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[i]) {
            return this.paragraphBidi.get(i);
        }
        int intValue = i == 0 ? 0 : this.paragraphEnds.get(i - 1).intValue();
        int intValue2 = this.paragraphEnds.get(i).intValue();
        int i2 = intValue2 - intValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, isRtlParagraph(i) ? 1 : 0);
        }
        bidi = null;
        this.paragraphBidi.set(i, bidi);
        this.bidiProcessedParagraphs[i] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final float getHorizontalPosition(int i, boolean z, boolean z2) {
        int i2 = i;
        if (!z2) {
            return getDownstreamHorizontal(i, z);
        }
        int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout, i2, z2);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i2 != lineStart && i2 != lineEnd) {
            return getDownstreamHorizontal(i, z);
        }
        if (i2 == 0 || i2 == this.layout.getText().length()) {
            return getDownstreamHorizontal(i, z);
        }
        int paragraphForOffset = getParagraphForOffset(i2, z2);
        boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
        int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i3 = lineStart - paragraphStart;
        int i4 = lineEndToVisibleEnd - paragraphStart;
        Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi createLineBidi = analyzeBidi != null ? analyzeBidi.createLineBidi(i3, i4) : null;
        boolean z3 = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z || isRtlParagraph == isRtlCharAt) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i2 == lineStart) {
                z3 = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z3 = true;
            }
            Layout layout = this.layout;
            return z3 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            bidiRunArr[i5] = new BidiRun(createLineBidi.getRunStart(i5) + lineStart, createLineBidi.getRunLimit(i5) + lineStart, createLineBidi.getRunLevel(i5) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i6 = 0; i6 < runCount2; i6++) {
            bArr[i6] = (byte) createLineBidi.getRunLevel(i6);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i7 = -1;
        if (i2 == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    break;
                }
                if (bidiRunArr[i8].getStart() == i2) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            BidiRun bidiRun = bidiRunArr[i7];
            if (z || isRtlParagraph == bidiRun.isRtl()) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i7 == 0 && isRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            if (i7 == runCount - 1 && !isRtlParagraph) {
                return this.layout.getLineRight(lineForOffset);
            }
            Layout layout2 = this.layout;
            return isRtlParagraph ? layout2.getPrimaryHorizontal(bidiRunArr[i7 - 1].getStart()) : layout2.getPrimaryHorizontal(bidiRunArr[i7 + 1].getStart());
        }
        if (i2 > lineEndToVisibleEnd) {
            i2 = lineEndToVisibleEnd(i2, lineStart);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                break;
            }
            if (bidiRunArr[i9].getEnd() == i2) {
                i7 = i9;
                break;
            }
            i9++;
        }
        BidiRun bidiRun2 = bidiRunArr[i7];
        if (!z && isRtlParagraph != bidiRun2.isRtl()) {
            isRtlParagraph = !isRtlParagraph;
        }
        if (i7 == 0 && isRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        if (i7 == runCount - 1 && !isRtlParagraph) {
            return this.layout.getLineRight(lineForOffset);
        }
        Layout layout3 = this.layout;
        return isRtlParagraph ? layout3.getPrimaryHorizontal(bidiRunArr[i7 - 1].getEnd()) : layout3.getPrimaryHorizontal(bidiRunArr[i7 + 1].getEnd());
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final BidiRun[] getLineBidiRuns$ui_text(int i) {
        Bidi createLineBidi;
        int lineStart = this.layout.getLineStart(i);
        int lineEnd = this.layout.getLineEnd(i);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        int i2 = lineStart - paragraphStart;
        int i3 = lineEnd - paragraphStart;
        Bidi analyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (analyzeBidi == null || (createLineBidi = analyzeBidi.createLineBidi(i2, i3)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i4 = 0; i4 < runCount; i4++) {
            int runStart = createLineBidi.getRunStart(i4) + lineStart;
            int runLimit = createLineBidi.getRunLimit(i4) + lineStart;
            boolean z = true;
            if (createLineBidi.getRunLevel(i4) % 2 != 1) {
                z = false;
            }
            bidiRunArr[i4] = new BidiRun(runStart, runLimit, z);
        }
        return bidiRunArr;
    }

    public final int getLineVisibleEnd(int i) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(i), this.layout.getLineStart(i));
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(int i) {
        return this.paragraphEnds.get(i).intValue();
    }

    public final int getParagraphForOffset(int i, boolean z) {
        int i2;
        List<Integer> list = this.paragraphEnds;
        Integer valueOf = Integer.valueOf(i);
        int size = list.size();
        y80.J(list.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int i5 = p01.i(list.get(i2), valueOf);
            if (i5 >= 0) {
                if (i5 <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        int i6 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z && i6 > 0) {
            int i7 = i6 - 1;
            if (i == this.paragraphEnds.get(i7).intValue()) {
                return i7;
            }
        }
        return i6;
    }

    public final int getParagraphStart(int i) {
        if (i == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i - 1).intValue();
    }

    public final boolean isLineEndSpace(char c) {
        if (c == ' ' || c == '\n' || c == 5760) {
            return true;
        }
        return (q10.h(c, 8192) >= 0 && q10.h(c, 8202) <= 0 && c != 8199) || c == 8287 || c == 12288;
    }

    public final boolean isRtlParagraph(int i) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i))) == -1;
    }
}
