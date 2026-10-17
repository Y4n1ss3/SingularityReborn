package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.j60;
import defpackage.ky;
import defpackage.l60;
import defpackage.m60;
import defpackage.o;
import defpackage.ra0;
import defpackage.w01;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MultiSelectionLayout implements SelectionLayout {
    private final int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final j60 selectableIdToInfoListIndex;
    private final int startSlot;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiSelectionLayout(j60 j60Var, List<SelectableInfo> list, int i, int i2, boolean z, Selection selection) {
        this.selectableIdToInfoListIndex = j60Var;
        this.infoList = list;
        this.startSlot = i;
        this.endSlot = i2;
        this.isStartHandle = z;
        this.previousSelection = selection;
        if (list.size() > 1) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    private final void createAndPutSubSelection(ra0 ra0Var, Selection selection, SelectableInfo selectableInfo, int i, int i2) {
        Selection makeSingleLayoutSelection = selection.getHandlesCrossed() ? selectableInfo.makeSingleLayoutSelection(i2, i) : selectableInfo.makeSingleLayoutSelection(i, i2);
        if (i > i2) {
            InlineClassHelperKt.throwIllegalStateException("minOffset should be less than or equal to maxOffset: " + makeSingleLayoutSelection);
        }
        long selectableId = selectableInfo.getSelectableId();
        int d = ra0Var.d(selectableId);
        Object[] objArr = ra0Var.c;
        Object obj = objArr[d];
        ra0Var.b[d] = selectableId;
        objArr[d] = makeSingleLayoutSelection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 createSubSelections$lambda$1$1(MultiSelectionLayout multiSelectionLayout, ra0 ra0Var, Selection selection, SelectableInfo selectableInfo) {
        multiSelectionLayout.createAndPutSubSelection(ra0Var, selection, selectableInfo, 0, selectableInfo.getTextLength());
        return w01.a;
    }

    private final int getInfoListIndexBySelectableId(long j) {
        try {
            return this.selectableIdToInfoListIndex.b(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("Invalid selectableId: " + j, e);
        }
    }

    private final boolean shouldAnyInfoRecomputeSelection(MultiSelectionLayout multiSelectionLayout) {
        if (getSize() != multiSelectionLayout.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i = 0; i < size; i++) {
            if (this.infoList.get(i).shouldRecomputeSelection(multiSelectionLayout.infoList.get(i))) {
                return true;
            }
        }
        return false;
    }

    private final int slotToIndex(int i, boolean z) {
        return (i - (!z ? 1 : 0)) / 2;
    }

    private final int startOrEndSlotToIndex(int i, boolean z) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[getCrossStatus().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    o.n();
                    return 0;
                }
                if (z) {
                    z = false;
                }
            }
            return slotToIndex(i, z);
        }
        z = true;
        return slotToIndex(i, z);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public l60 createSubSelections(final Selection selection) {
        if (selection.getStart().getSelectableId() != selection.getEnd().getSelectableId()) {
            ra0 ra0Var = m60.a;
            final ra0 ra0Var2 = new ra0();
            createAndPutSubSelection(ra0Var2, selection, getFirstInfo(), (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset(), getFirstInfo().getTextLength());
            forEachMiddleInfo(new ky() { // from class: androidx.compose.foundation.text.selection.a
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 createSubSelections$lambda$1$1;
                    createSubSelections$lambda$1$1 = MultiSelectionLayout.createSubSelections$lambda$1$1(MultiSelectionLayout.this, ra0Var2, selection, (SelectableInfo) obj);
                    return createSubSelections$lambda$1$1;
                }
            });
            createAndPutSubSelection(ra0Var2, selection, getLastInfo(), 0, (selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset());
            return ra0Var2;
        }
        if ((!selection.getHandlesCrossed() || selection.getStart().getOffset() < selection.getEnd().getOffset()) && (selection.getHandlesCrossed() || selection.getStart().getOffset() > selection.getEnd().getOffset())) {
            InlineClassHelperKt.throwIllegalStateException("unexpectedly miss-crossed selection: " + selection);
        }
        long selectableId = selection.getStart().getSelectableId();
        ra0 ra0Var3 = m60.a;
        ra0 ra0Var4 = new ra0();
        ra0Var4.h(selectableId, selection);
        return ra0Var4;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(ky kyVar) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i = infoListIndexBySelectableId + 1;
        if (i >= infoListIndexBySelectableId2) {
            return;
        }
        while (i < infoListIndexBySelectableId2) {
            kyVar.invoke(this.infoList.get(i));
            i++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getCurrentInfo() {
        return isStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getFirstInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    public final List<SelectableInfo> getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getLastInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final j60 getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(SelectionLayout selectionLayout) {
        if (getPreviousSelection() == null || selectionLayout == null || !(selectionLayout instanceof MultiSelectionLayout)) {
            return true;
        }
        MultiSelectionLayout multiSelectionLayout = (MultiSelectionLayout) selectionLayout;
        return (isStartHandle() == multiSelectionLayout.isStartHandle() && getStartSlot() == multiSelectionLayout.getStartSlot() && getEndSlot() == multiSelectionLayout.getEndSlot() && !shouldAnyInfoRecomputeSelection(multiSelectionLayout)) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(isStartHandle());
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((getStartSlot() + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((getEndSlot() + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(getCrossStatus());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List<SelectableInfo> list = this.infoList;
        int size = list.size();
        int i = 0;
        while (i < size) {
            SelectableInfo selectableInfo = list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(selectableInfo);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
