package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustmentKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import defpackage.g30;
import defpackage.g40;
import defpackage.iy;
import defpackage.wg;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection adjustToBoundaries(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z, false, selectionLayout.getEndSlot(), boundaryFunction), z);
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z, boolean z2, int i, BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z2 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long mo1482getBoundaryfzxv0v0 = boundaryFunction.mo1482getBoundaryfzxv0v0(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z ^ z2 ? TextRange.m7060getStartimpl(mo1482getBoundaryfzxv0v0) : TextRange.m7055getEndimpl(mo1482getBoundaryfzxv0v0));
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i) {
        return Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i), i, 0L, 4, null);
    }

    public static final Selection ensureAtLeastOneChar(Selection selection, SelectionLayout selectionLayout) {
        if (SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null) ? selection : selectionLayout.getCurrentInfo().getInputText().length() == 0 ? selection : expandOneChar(selection, selectionLayout);
        }
        return selection;
    }

    private static final Selection expandOneChar(Selection selection, SelectionLayout selectionLayout) {
        SelectableInfo currentInfo = selectionLayout.getCurrentInfo();
        String inputText = currentInfo.getInputText();
        int rawStartHandleOffset = currentInfo.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int findFollowingBreak = StringHelpers_androidKt.findFollowingBreak(inputText, 0);
            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findFollowingBreak), null, true, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findFollowingBreak), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int findPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, length);
            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findPrecedingBreak), null, false, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findPrecedingBreak), true, 1, null);
        }
        Selection previousSelection = selectionLayout.getPreviousSelection();
        boolean z = previousSelection != null && previousSelection.getHandlesCrossed();
        int findPrecedingBreak2 = selectionLayout.isStartHandle() ^ z ? StringHelpers_androidKt.findPrecedingBreak(inputText, rawStartHandleOffset) : StringHelpers_androidKt.findFollowingBreak(inputText, rawStartHandleOffset);
        return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findPrecedingBreak2), null, z, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findPrecedingBreak2), z, 1, null);
    }

    private static final boolean isExpanding(SelectableInfo selectableInfo, int i, boolean z) {
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        return z ^ (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED) ? i < selectableInfo.getRawPreviousHandleOffset() : i > selectableInfo.getRawPreviousHandleOffset();
    }

    private static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo selectableInfo, int i, int i2, int i3, boolean z, boolean z2) {
        long m7032getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m7032getWordBoundaryjx7JFs(i2);
        int m7060getStartimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m7060getStartimpl(m7032getWordBoundaryjx7JFs)) == i ? TextRange.m7060getStartimpl(m7032getWordBoundaryjx7JFs) : i >= selectableInfo.getTextLayoutResult().getLineCount() ? selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1) : selectableInfo.getTextLayoutResult().getLineStart(i);
        int m7055getEndimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m7055getEndimpl(m7032getWordBoundaryjx7JFs)) == i ? TextRange.m7055getEndimpl(m7032getWordBoundaryjx7JFs) : i >= selectableInfo.getTextLayoutResult().getLineCount() ? TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null) : TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), i, false, 2, null);
        if (m7060getStartimpl == i3) {
            return selectableInfo.anchorForOffset(m7055getEndimpl);
        }
        if (m7055getEndimpl == i3) {
            return selectableInfo.anchorForOffset(m7060getStartimpl);
        }
        if (!(z ^ z2) ? i2 >= m7060getStartimpl : i2 > m7055getEndimpl) {
            m7060getStartimpl = m7055getEndimpl;
        }
        return selectableInfo.anchorForOffset(m7060getStartimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo updateSelectionBoundary(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if ((selectionLayout.isStartHandle() ? selectionLayout.getStartSlot() : selectionLayout.getEndSlot()) != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        wg wgVar = new wg(selectableInfo, rawStartHandleOffset, 2);
        g40 g40Var = g40.e;
        final g30 B = y80.B(g40Var, wgVar);
        final int rawEndHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        g30 B2 = y80.B(g40Var, new iy() { // from class: jn0
            @Override // defpackage.iy
            public final Object invoke() {
                Selection.AnchorInfo updateSelectionBoundary$lambda$2;
                updateSelectionBoundary$lambda$2 = SelectionAdjustmentKt.updateSelectionBoundary$lambda$2(SelectableInfo.this, rawStartHandleOffset, rawEndHandleOffset, selectionLayout, B);
                return updateSelectionBoundary$lambda$2;
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$3(B2);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$1(B) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$3(B2);
        }
        int offset = anchorInfo.getOffset();
        long m7032getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m7032getWordBoundaryjx7JFs(offset);
        return !isExpanding(selectableInfo, rawStartHandleOffset, selectionLayout.isStartHandle()) ? selectableInfo.anchorForOffset(rawStartHandleOffset) : (offset == TextRange.m7060getStartimpl(m7032getWordBoundaryjx7JFs) || offset == TextRange.m7055getEndimpl(m7032getWordBoundaryjx7JFs)) ? updateSelectionBoundary$lambda$3(B2) : selectableInfo.anchorForOffset(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateSelectionBoundary$lambda$0(SelectableInfo selectableInfo, int i) {
        return selectableInfo.getTextLayoutResult().getLineForOffset(i);
    }

    private static final int updateSelectionBoundary$lambda$1(g30 g30Var) {
        return ((Number) g30Var.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo updateSelectionBoundary$lambda$2(SelectableInfo selectableInfo, int i, int i2, SelectionLayout selectionLayout, g30 g30Var) {
        return snapToWordBoundary(selectableInfo, updateSelectionBoundary$lambda$1(g30Var), i, i2, selectionLayout.isStartHandle(), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$3(g30 g30Var) {
        return (Selection.AnchorInfo) g30Var.getValue();
    }
}
