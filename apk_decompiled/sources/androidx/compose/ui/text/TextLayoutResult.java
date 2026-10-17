package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import defpackage.bv;
import defpackage.dq;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List<Rect> placeholderRects;
    private final long size;

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m7028copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i & 2) != 0) {
            j = textLayoutResult.size;
        }
        return textLayoutResult.m7029copyO0kMr_c(textLayoutInput, j);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.getLineEnd(i, z);
    }

    /* renamed from: copy-O0kMr_c, reason: not valid java name */
    public final TextLayoutResult m7029copyO0kMr_c(TextLayoutInput textLayoutInput, long j) {
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return q10.b(this.layoutInput, textLayoutResult.layoutInput) && q10.b(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m7780equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && q10.b(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final ResolvedTextDirection getBidiRunDirection(int i) {
        return this.multiParagraph.getBidiRunDirection(i);
    }

    public final Rect getBoundingBox(int i) {
        return this.multiParagraph.getBoundingBox(i);
    }

    public final Rect getCursorRect(int i) {
        return this.multiParagraph.getCursorRect(i);
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & 4294967295L))) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i, boolean z) {
        return this.multiParagraph.getHorizontalPosition(i, z);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBaseline(int i) {
        return this.multiParagraph.getLineBaseline(i);
    }

    public final float getLineBottom(int i) {
        return this.multiParagraph.getLineBottom(i);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i, boolean z) {
        return this.multiParagraph.getLineEnd(i, z);
    }

    public final int getLineForOffset(int i) {
        return this.multiParagraph.getLineForOffset(i);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.multiParagraph.getLineForVerticalPosition(f);
    }

    public final float getLineLeft(int i) {
        return this.multiParagraph.getLineLeft(i);
    }

    public final float getLineRight(int i) {
        return this.multiParagraph.getLineRight(i);
    }

    public final int getLineStart(int i) {
        return this.multiParagraph.getLineStart(i);
    }

    public final float getLineTop(int i) {
        return this.multiParagraph.getLineTop(i);
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m7030getOffsetForPositionk4lQ0M(long j) {
        return this.multiParagraph.m6921getOffsetForPositionk4lQ0M(j);
    }

    public final ResolvedTextDirection getParagraphDirection(int i) {
        return this.multiParagraph.getParagraphDirection(i);
    }

    public final Path getPathForRange(int i, int i2) {
        return this.multiParagraph.getPathForRange(i, i2);
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m7031getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m7032getWordBoundaryjx7JFs(int i) {
        return this.multiParagraph.m6923getWordBoundaryjx7JFs(i);
    }

    public int hashCode() {
        return this.placeholderRects.hashCode() + bv.a(this.lastBaseline, bv.a(this.firstBaseline, (IntSize.m7783hashCodeimpl(this.size) + ((this.multiParagraph.hashCode() + (this.layoutInput.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final boolean isLineEllipsized(int i) {
        return this.multiParagraph.isLineEllipsized(i);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m7785toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j, dq dqVar) {
        this(textLayoutInput, multiParagraph, j);
    }
}
