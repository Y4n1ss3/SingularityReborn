package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.iy;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {
    public static final int $stable = 8;
    private TextLayoutResult _previousTextLayoutResult;
    private final iy coordinatesCallback;
    private final iy layoutResultCallback;
    private final long selectableId;
    private final Object lock = this;
    private int _previousLastVisibleOffset = -1;

    public MultiWidgetSelectionDelegate(long j, iy iyVar, iy iyVar2) {
        this.selectableId = j;
        this.coordinatesCallback = iyVar;
        this.layoutResultCallback = iyVar2;
    }

    private final int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int i;
        int lineCount;
        synchronized (this.lock) {
            try {
                if (this._previousTextLayoutResult != textLayoutResult) {
                    if (textLayoutResult.getDidOverflowHeight() && !textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                        lineCount = textLayoutResult.getLineForVerticalPosition((int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L));
                        int lineCount2 = textLayoutResult.getLineCount() - 1;
                        if (lineCount > lineCount2) {
                            lineCount = lineCount2;
                        }
                        while (lineCount >= 0 && textLayoutResult.getLineTop(lineCount) >= ((int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L))) {
                            lineCount--;
                        }
                        if (lineCount < 0) {
                            lineCount = 0;
                        }
                        this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                        this._previousTextLayoutResult = textLayoutResult;
                    }
                    lineCount = textLayoutResult.getLineCount() - 1;
                    this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                i = this._previousLastVisibleOffset;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public void appendSelectableInfoToBuilder(SelectionLayoutBuilder selectionLayoutBuilder) {
        TextLayoutResult textLayoutResult;
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke()) == null) {
            return;
        }
        LayoutCoordinates containerCoordinates = selectionLayoutBuilder.getContainerCoordinates();
        Offset.Companion companion = Offset.Companion;
        long mo6243localPositionOfR5De75A = containerCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates, companion.m4532getZeroF1C5BW0());
        MultiWidgetSelectionDelegateKt.m1485appendSelectableInfoParwq6A(selectionLayoutBuilder, textLayoutResult, Offset.m4520minusMKHz9U(selectionLayoutBuilder.m1507getCurrentPositionF1C5BW0(), mo6243localPositionOfR5De75A), (selectionLayoutBuilder.m1508getPreviousHandlePositionF1C5BW0() & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats ? companion.m4531getUnspecifiedF1C5BW0() : Offset.m4520minusMKHz9U(selectionLayoutBuilder.m1508getPreviousHandlePositionF1C5BW0(), mo6243localPositionOfR5De75A), getSelectableId());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Rect getBoundingBox(int i) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Rect.Companion.getZero();
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        return length < 1 ? Rect.Companion.getZero() : textLayoutResult.getBoundingBox(y80.h(i, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getCenterYForOffset(int i) {
        int lineForOffset;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null || (lineForOffset = textLayoutResult.getLineForOffset(i)) >= textLayoutResult.getLineCount()) {
            return -1.0f;
        }
        float lineTop = textLayoutResult.getLineTop(lineForOffset);
        return ((textLayoutResult.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo1483getHandlePositiondBAh8RU(Selection selection, boolean z) {
        if ((z && selection.getStart().getSelectableId() != getSelectableId()) || (!z && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult, y80.h((z ? selection.getStart() : selection.getEnd()).getOffset(), 0, getLastVisibleOffset(textLayoutResult)), z, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.coordinatesCallback.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineHeight(int i) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null) {
            return TextLayoutHelperKt.getLineHeight(textLayoutResult, i);
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineLeft(int i) {
        int lineForOffset;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null && (lineForOffset = textLayoutResult.getLineForOffset(i)) < textLayoutResult.getLineCount()) {
            return textLayoutResult.getLineLeft(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineRight(int i) {
        int lineForOffset;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null && (lineForOffset = textLayoutResult.getLineForOffset(i)) < textLayoutResult.getLineCount()) {
            return textLayoutResult.getLineRight(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo1484getRangeOfLineContainingjx7JFs(int i) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return TextRange.Companion.m7065getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(textLayoutResult);
        if (lastVisibleOffset < 1) {
            return TextRange.Companion.m7065getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResult.getLineForOffset(y80.h(i, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(textLayoutResult.getLineStart(lineForOffset), textLayoutResult.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(0), 0, getSelectableId()), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        return textLayoutResult == null ? new AnnotatedString("", null, 2, null) : textLayoutResult.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public TextLayoutResult textLayoutResult() {
        return (TextLayoutResult) this.layoutResultCallback.invoke();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return getLastVisibleOffset(textLayoutResult);
    }
}
