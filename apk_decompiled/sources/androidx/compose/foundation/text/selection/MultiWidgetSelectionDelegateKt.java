package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m1485appendSelectableInfoParwq6A(SelectionLayoutBuilder selectionLayoutBuilder, TextLayoutResult textLayoutResult, long j, long j2, long j3) {
        Direction direction;
        Direction direction2;
        long j4;
        Direction appendSelectableInfo_Parwq6A$otherDirection;
        Direction direction3;
        Direction direction4;
        Direction direction5;
        Direction direction6;
        int m1486getOffsetForPosition3MmeM6k;
        int previousAdjustedOffset;
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Rect rect = new Rect(0.0f, 0.0f, (int) (textLayoutResult.m7031getSizeYbymL2g() >> 32), (int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L));
        Direction m1487getXDirection3MmeM6k = m1487getXDirection3MmeM6k(j, rect);
        Direction m1488getYDirection3MmeM6k = m1488getYDirection3MmeM6k(j, rect);
        if (selectionLayoutBuilder.isStartHandle()) {
            Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            direction = m1488getYDirection3MmeM6k;
            direction2 = m1487getXDirection3MmeM6k;
            j4 = j3;
            direction5 = direction2;
            direction4 = appendSelectableInfo_Parwq6A$otherDirection(direction2, direction, selectionLayoutBuilder, j3, previousSelection != null ? previousSelection.getEnd() : null);
            direction3 = direction4;
            direction6 = direction3;
            appendSelectableInfo_Parwq6A$otherDirection = direction;
        } else {
            direction = m1488getYDirection3MmeM6k;
            direction2 = m1487getXDirection3MmeM6k;
            Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            j4 = j3;
            appendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(direction2, direction, selectionLayoutBuilder, j4, previousSelection2 != null ? previousSelection2.getStart() : null);
            direction3 = direction2;
            direction4 = direction;
            direction5 = appendSelectableInfo_Parwq6A$otherDirection;
            direction6 = direction5;
        }
        if (isSelected(SelectionLayoutKt.resolve2dDirection(direction2, direction), direction6)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.isStartHandle()) {
                previousAdjustedOffset = m1486getOffsetForPosition3MmeM6k(j, textLayoutResult);
                Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                m1486getOffsetForPosition3MmeM6k = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? previousAdjustedOffset : getPreviousAdjustedOffset(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j4, length);
            } else {
                m1486getOffsetForPosition3MmeM6k = m1486getOffsetForPosition3MmeM6k(j, textLayoutResult);
                Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                previousAdjustedOffset = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? m1486getOffsetForPosition3MmeM6k : getPreviousAdjustedOffset(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j4, length);
            }
            selectionLayoutBuilder.appendInfo(j4, previousAdjustedOffset, direction5, appendSelectableInfo_Parwq6A$otherDirection, m1486getOffsetForPosition3MmeM6k, direction3, direction4, (InlineClassHelperKt.DualUnsignedFloatMask & j2) == InlineClassHelperKt.UnspecifiedPackedFloats ? -1 : m1486getOffsetForPosition3MmeM6k(j2, textLayoutResult), textLayoutResult);
        }
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j, Selection.AnchorInfo anchorInfo) {
        Direction directionById;
        return (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j)) == null) ? SelectionLayoutKt.resolve2dDirection(direction, direction2) : directionById;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder selectionLayoutBuilder, long j, long j2) {
        int compare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j), Long.valueOf(j2));
        return compare < 0 ? Direction.BEFORE : compare > 0 ? Direction.AFTER : Direction.ON;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m1486getOffsetForPosition3MmeM6k(long j, TextLayoutResult textLayoutResult) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i) >= textLayoutResult.getMultiParagraph().getHeight() ? textLayoutResult.getLayoutInput().getText().length() : textLayoutResult.m7030getOffsetForPositionk4lQ0M(j);
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j, int i) {
        int compare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j));
        if (compare < 0) {
            return 0;
        }
        return compare > 0 ? i : anchorInfo.getOffset();
    }

    /* renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1487getXDirection3MmeM6k(long j, Rect rect) {
        int i = (int) (j >> 32);
        return Float.intBitsToFloat(i) < rect.getLeft() ? Direction.BEFORE : Float.intBitsToFloat(i) > rect.getRight() ? Direction.AFTER : Direction.ON;
    }

    /* renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1488getYDirection3MmeM6k(long j, Rect rect) {
        int i = (int) (j & 4294967295L);
        return Float.intBitsToFloat(i) < rect.getTop() ? Direction.BEFORE : Float.intBitsToFloat(i) > rect.getBottom() ? Direction.AFTER : Direction.ON;
    }

    private static final boolean isSelected(Direction direction, Direction direction2) {
        return direction == Direction.ON || direction != direction2;
    }
}
