package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.TextRange;
import defpackage.bv;
import defpackage.dq;
import defpackage.j50;
import defpackage.k4;
import defpackage.q10;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2, int i5, dq dqVar) {
        this(paragraph, i, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? -1.0f : f2);
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i5 & 2) != 0) {
            i = paragraphInfo.startIndex;
        }
        if ((i5 & 4) != 0) {
            i2 = paragraphInfo.endIndex;
        }
        if ((i5 & 8) != 0) {
            i3 = paragraphInfo.startLineIndex;
        }
        if ((i5 & 16) != 0) {
            i4 = paragraphInfo.endLineIndex;
        }
        if ((i5 & 32) != 0) {
            f = paragraphInfo.top;
        }
        if ((i5 & 64) != 0) {
            f2 = paragraphInfo.bottom;
        }
        float f3 = f;
        float f4 = f2;
        int i6 = i4;
        int i7 = i2;
        return paragraphInfo.copy(paragraph, i, i7, i3, i6, f3, f4);
    }

    /* renamed from: toGlobal-xdX6-G0$default, reason: not valid java name */
    public static /* synthetic */ long m6934toGlobalxdX6G0$default(ParagraphInfo paragraphInfo, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return paragraphInfo.m6935toGlobalxdX6G0(j, z);
    }

    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2) {
        return new ParagraphInfo(paragraph, i, i2, i3, i4, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return q10.b(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Float.hashCode(this.bottom) + bv.a(this.top, j50.b(this.endLineIndex, j50.b(this.startLineIndex, j50.b(this.endIndex, j50.b(this.startIndex, this.paragraph.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setEndLineIndex(int i) {
        this.endLineIndex = i;
    }

    public final void setStartLineIndex(int i) {
        this.startLineIndex = i;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    public final Rect toGlobal(Rect rect) {
        float f = this.top;
        return rect.m4553translatek4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
    }

    /* renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m6935toGlobalxdX6G0(long j, boolean z) {
        if (z) {
            TextRange.Companion companion = TextRange.Companion;
            if (TextRange.m7053equalsimpl0(j, companion.m7065getZerod9O1mEE())) {
                return companion.m7065getZerod9O1mEE();
            }
        }
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m7060getStartimpl(j)), toGlobalIndex(TextRange.m7055getEndimpl(j)));
    }

    public final int toGlobalIndex(int i) {
        return i + this.startIndex;
    }

    public final int toGlobalLineIndex(int i) {
        return i + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f) {
        return f + this.top;
    }

    public final Rect toLocal(Rect rect) {
        float f = -this.top;
        return rect.m4553translatek4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m6936toLocalMKHz9U(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - this.top;
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int toLocalIndex(int i) {
        return y80.h(i, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toLocalLineIndex(int i) {
        return i - this.startLineIndex;
    }

    public final float toLocalYPosition(float f) {
        return f - this.top;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.paragraph);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        sb.append(this.endIndex);
        sb.append(", startLineIndex=");
        sb.append(this.startLineIndex);
        sb.append(", endLineIndex=");
        sb.append(this.endLineIndex);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", bottom=");
        return k4.g(sb, this.bottom, ')');
    }

    public ParagraphInfo(Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2) {
        this.paragraph = paragraph;
        this.startIndex = i;
        this.endIndex = i2;
        this.startLineIndex = i3;
        this.endLineIndex = i4;
        this.top = f;
        this.bottom = f2;
    }

    public final Path toGlobal(Path path) {
        float f = this.top;
        path.mo4653translatek4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
        return path;
    }
}
