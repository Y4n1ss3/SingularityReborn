package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import defpackage.fc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack currentSlotStack;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;
    private Object[] slots;
    private final int slotsSize;
    private HashMap<GapAnchor, GapGroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.m3964getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    public static /* synthetic */ GapAnchor anchor$default(SlotReader slotReader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotReader.currentGroup;
        }
        return slotReader.anchor(i);
    }

    private final Object aux(int[] iArr, int i) {
        int auxIndex;
        if ((iArr[(i * 5) + 1] & GroupFlagsKt.IsMovableContentFlag) == 0) {
            return Composer.Companion.getEmpty();
        }
        Object[] objArr = this.slots;
        auxIndex = SlotTableKt.auxIndex(iArr, i);
        return objArr[auxIndex];
    }

    private final Object node(int[] iArr, int i) {
        int i2 = i * 5;
        return (iArr[i2 + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? this.slots[iArr[i2 + 4]] : Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        int objectKeyIndex;
        if ((iArr[(i * 5) + 1] & GroupFlagsKt.HasMovableContentFlag) == 0) {
            return null;
        }
        Object[] objArr = this.slots;
        objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, i);
        return objArr[objectKeyIndex];
    }

    public final GapAnchor anchor(int i) {
        ArrayList<GapAnchor> anchors$runtime = this.table.getAnchors$runtime();
        int search = SlotTableKt.search(anchors$runtime, i, this.groupsSize);
        if (search >= 0) {
            return anchors$runtime.get(search);
        }
        GapAnchor gapAnchor = new GapAnchor(i);
        anchors$runtime.add(-(search + 1), gapAnchor);
        return gapAnchor;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime(this, this.sourceInformationMap);
        this.slots = new Object[0];
    }

    public final boolean containsMark(int i) {
        return (this.groups[(i * 5) + 1] & GroupFlagsKt.IsRecompositionRequiredFlag) != 0;
    }

    public final void endEmpty() {
        if (!(this.emptyCount > 0)) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void endGroup() {
        int groupSize;
        int i;
        if (this.emptyCount == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i2 = iArr[(this.parent * 5) + 2];
            this.parent = i2;
            if (i2 < 0) {
                i = this.groupsSize;
            } else {
                groupSize = SlotTableKt.groupSize(iArr, i2);
                i = groupSize + i2;
            }
            this.currentEnd = i;
            int pop = this.currentSlotStack.pop();
            if (pop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = pop;
                this.currentSlotEnd = i2 >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final List<KeyInfo> extractKeys() {
        int groupSize;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i = 0;
            int i2 = this.currentGroup;
            while (true) {
                int i3 = i;
                if (i2 >= this.currentEnd) {
                    break;
                }
                int[] iArr = this.groups;
                int i4 = i2 * 5;
                int i5 = iArr[i4];
                Object objectKey = objectKey(iArr, i2);
                int i6 = 1;
                int i7 = this.groups[i4 + 1];
                if ((1073741824 & i7) == 0) {
                    i6 = i7 & 67108863;
                }
                i = i3 + 1;
                arrayList.add(new KeyInfo(i5, objectKey, i2, i6, i3));
                groupSize = SlotTableKt.groupSize(this.groups, i2);
                i2 += groupSize;
            }
        }
        return arrayList;
    }

    public final Object get(int i) {
        int i2 = this.currentSlot + i;
        return i2 < this.currentSlotEnd ? this.slots[i2] : Composer.Companion.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(this.groups, i);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return this.groups[i * 5];
        }
        return 0;
    }

    public final Object getGroupNode() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return node(this.groups, i);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    public final int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, this.currentGroup);
        return groupSize;
    }

    public final int getGroupSlotCount() {
        int slotAnchor;
        int i = this.currentGroup;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i2 = i + 1;
        return (i2 < this.groupsSize ? this.groups[(i2 * 5) + 4] : this.slotsSize) - slotAnchor;
    }

    public final int getGroupSlotIndex() {
        int slotAnchor;
        int i = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i - slotAnchor;
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        int i = this.currentGroup;
        return i < this.currentEnd && (this.groups[(i * 5) + 1] & GroupFlagsKt.HasMovableContentFlag) != 0;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return this.groups[(this.currentGroup * 5) + 1] & 67108863;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i = this.parent;
        if (i >= 0) {
            return this.groups[(i * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.currentSlotEnd - this.currentSlot;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        int slotAnchor;
        int i = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i - slotAnchor;
    }

    public final SlotTable getTable$runtime() {
        return this.table;
    }

    public final Object groupAux(int i) {
        return aux(this.groups, i);
    }

    public final int groupEnd(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i);
        return groupSize + i;
    }

    public final Object groupGet(int i, int i2) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i3 = i + 1;
        int i4 = slotAnchor + i2;
        return i4 < (i3 < this.groupsSize ? this.groups[(i3 * 5) + 4] : this.slotsSize) ? this.slots[i4] : Composer.Companion.getEmpty();
    }

    public final int groupKey(GapAnchor gapAnchor) {
        if (gapAnchor.getValid()) {
            return this.groups[this.table.anchorIndex(gapAnchor) * 5];
        }
        return 0;
    }

    public final Object groupObjectKey(int i) {
        return objectKey(this.groups, i);
    }

    public final int groupSize(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i);
        return groupSize;
    }

    public final boolean hasMark(int i) {
        return (this.groups[(i * 5) + 1] & GroupFlagsKt.HasRecompositionRequiredFlag) != 0;
    }

    public final boolean hasObjectKey(int i) {
        return (this.groups[(i * 5) + 1] & GroupFlagsKt.HasMovableContentFlag) != 0;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return (this.groups[(this.currentGroup * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0;
    }

    public final Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.Companion.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final int nodeCount(int i) {
        return this.groups[(i * 5) + 1] & 67108863;
    }

    public final int parent(int i) {
        return this.groups[(i * 5) + 2];
    }

    public final int parentOf(int i) {
        if (!(i >= 0 && i < this.groupsSize)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid group index " + i);
        }
        return this.groups[(i * 5) + 2];
    }

    public final void reposition(int i) {
        int groupSize;
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = i;
        int i2 = this.groupsSize;
        int i3 = i < i2 ? this.groups[(i * 5) + 2] : -1;
        if (i3 != this.parent) {
            this.parent = i3;
            if (i3 < 0) {
                this.currentEnd = i2;
            } else {
                groupSize = SlotTableKt.groupSize(this.groups, i3);
                this.currentEnd = groupSize + i3;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
        }
    }

    public final void restoreParent(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i);
        int i2 = groupSize + i;
        int i3 = this.currentGroup;
        if (!(i3 >= i && i3 <= i2)) {
            ComposerKt.composeImmediateRuntimeError("Index " + i + " is not a parent of " + i3);
        }
        this.parent = i;
        this.currentEnd = i2;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void setCurrentGroup(int i) {
        this.currentGroup = i;
    }

    public final int skipGroup() {
        int groupSize;
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i = this.currentGroup;
        int i2 = (iArr[(i * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        groupSize = SlotTableKt.groupSize(iArr, i);
        this.currentGroup = groupSize + i;
        return i2;
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int slotSize(int i) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i2 = i + 1;
        return (i2 < this.groupsSize ? this.groups[(i2 * 5) + 4] : this.slotsSize) - slotAnchor;
    }

    public final void startGroup() {
        int groupSize;
        int slotAnchor;
        GapGroupSourceInformation gapGroupSourceInformation;
        if (this.emptyCount <= 0) {
            int i = this.parent;
            int i2 = this.currentGroup;
            if (!(this.groups[(i2 * 5) + 2] == i)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<GapAnchor, GapGroupSourceInformation> hashMap = this.sourceInformationMap;
            if (hashMap != null && (gapGroupSourceInformation = hashMap.get(anchor(i))) != null) {
                gapGroupSourceInformation.reportGroup(this.table, i2);
            }
            IntStack intStack = this.currentSlotStack;
            int i3 = this.currentSlot;
            int i4 = this.currentSlotEnd;
            if (i3 == 0 && i4 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i3);
            }
            this.parent = i2;
            groupSize = SlotTableKt.groupSize(this.groups, i2);
            this.currentEnd = groupSize + i2;
            int i5 = i2 + 1;
            this.currentGroup = i5;
            slotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
            this.currentSlot = slotAnchor;
            this.currentSlotEnd = i2 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i5 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.currentGroup * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0)) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.currentGroup);
        sb.append(", key=");
        sb.append(getGroupKey());
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", end=");
        return fc.e(sb, this.currentEnd, ')');
    }

    public final boolean isNode(int i) {
        return (this.groups[(i * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0;
    }

    public final int groupKey(int i) {
        return this.groups[i * 5];
    }

    public final Object node(int i) {
        int[] iArr = this.groups;
        if ((iArr[(i * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0) {
            return node(iArr, i);
        }
        return null;
    }

    public final Object groupGet(int i) {
        return groupGet(this.currentGroup, i);
    }
}
