package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectableInfo {
    public static final int $stable = TextLayoutResult.$stable;
    private final int rawEndHandleOffset;
    private final int rawPreviousHandleOffset;
    private final int rawStartHandleOffset;
    private final long selectableId;
    private final int slot;
    private final TextLayoutResult textLayoutResult;

    public SelectableInfo(long j, int i, int i2, int i3, int i4, TextLayoutResult textLayoutResult) {
        this.selectableId = j;
        this.slot = i;
        this.rawStartHandleOffset = i2;
        this.rawEndHandleOffset = i3;
        this.rawPreviousHandleOffset = i4;
        this.textLayoutResult = textLayoutResult;
    }

    private final ResolvedTextDirection getEndRunDirection() {
        return SelectionHelpersKt.getTextDirectionForOffset(this.textLayoutResult, this.rawEndHandleOffset);
    }

    private final ResolvedTextDirection getStartRunDirection() {
        return SelectionHelpersKt.getTextDirectionForOffset(this.textLayoutResult, this.rawStartHandleOffset);
    }

    public final Selection.AnchorInfo anchorForOffset(int i) {
        return new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(this.textLayoutResult, i), i, this.selectableId);
    }

    public final String getInputText() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public final CrossStatus getRawCrossStatus() {
        int i = this.rawStartHandleOffset;
        int i2 = this.rawEndHandleOffset;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final int getTextLength() {
        return getInputText().length();
    }

    public final Selection makeSingleLayoutSelection(int i, int i2) {
        return new Selection(anchorForOffset(i), anchorForOffset(i2), i > i2);
    }

    public final boolean shouldRecomputeSelection(SelectableInfo selectableInfo) {
        return (this.selectableId == selectableInfo.selectableId && this.rawStartHandleOffset == selectableInfo.rawStartHandleOffset && this.rawEndHandleOffset == selectableInfo.rawEndHandleOffset) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.selectableId);
        sb.append(", range=(");
        sb.append(this.rawStartHandleOffset);
        sb.append('-');
        sb.append(getStartRunDirection());
        sb.append(',');
        sb.append(this.rawEndHandleOffset);
        sb.append('-');
        sb.append(getEndRunDirection());
        sb.append("), prevOffset=");
        return fc.e(sb, this.rawPreviousHandleOffset, ')');
    }
}
