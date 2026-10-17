package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import defpackage.gy;
import defpackage.ky;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTableReader {
    public static final int $stable = 8;
    private int _current;
    private int _previousSibling;
    private SlotTableAddressSpace addressSpace;
    private int emptyCount;
    private int[] groups;
    private boolean hadNext;
    private boolean isClosed;
    private int parent;
    private final IntStack previousSlotCurrentOffset;
    private int slotCurrent;
    private int slotEnd;
    private Object[] slots;
    private final SlotTable table;

    public SlotTableReader(SlotTable slotTable) {
        this.table = slotTable;
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        this.addressSpace = addressSpace;
        this.groups = addressSpace.getGroups();
        this.slots = slotTable.getAddressSpace().getSlots();
        this.parent = -1;
        this._current = slotTable.getRoot();
        this.previousSlotCurrentOffset = new IntStack();
        this._previousSibling = -1;
    }

    public static /* synthetic */ void addFlag$default(SlotTableReader slotTableReader, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = slotTableReader.getParentGroup();
        }
        slotTableReader.addFlag(i, i2);
    }

    private final int getCurrent() {
        return this._current;
    }

    private final void setCurrent(int i) {
        this._current = i;
    }

    private final void setPreviousSibling(int i) {
        this._previousSibling = i;
    }

    public static /* synthetic */ void traverseGroupPartially$default(SlotTableReader slotTableReader, int i, boolean z, ky kyVar, int i2, Object obj) {
        int i3;
        if ((i2 & 2) != 0) {
            z = false;
        }
        SlotTableAddressSpace slotTableAddressSpace = slotTableReader.addressSpace;
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = slotTableAddressSpace.getGroups();
        int i4 = i;
        while (true) {
            boolean booleanValue = ((Boolean) kyVar.invoke(Integer.valueOf(i4))).booleanValue();
            if ((i4 != i || z) && (i3 = groups[i4 + 1]) >= 0) {
                intStack.push(i3);
            }
            i4 = groups[i4 + 3];
            if (!booleanValue || i4 < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    i4 = intStack.pop();
                }
            }
        }
    }

    private final Object[] upToDateSlots() {
        if (this.emptyCount > 0) {
            this.slots = this.addressSpace.getSlots();
        }
        return this.slots;
    }

    public final void addFlag(int i, int i2) {
        int propagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i2);
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.table.getAddressSpace().getGroups();
        int i3 = i;
        while (i3 > 0) {
            int i4 = i3 + 4;
            int i5 = groups[i4];
            int i6 = i3 == i ? i2 : propagatingFlagsOf;
            if ((i6 & i5) == i6) {
                return;
            }
            groups[i4] = i5 | i6;
            i3 = groups2[i3 + 2];
        }
        if (i3 != 0) {
            return;
        }
        gy.h(i, "Traversing parent of group not in the slot table: ");
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final int childNodeCountOf(int i) {
        return this.groups[i + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.table.closeReader(this);
    }

    public final void endEmpty() {
        if (!(this.emptyCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unbalanced begin/end empty");
        }
        int i = this.emptyCount - 1;
        this.emptyCount = i;
        if (i == 0) {
            this.slots = this.addressSpace.getSlots();
            int[] groups = this.addressSpace.getGroups();
            this.groups = groups;
            int i2 = this.slotEnd - this.slotCurrent;
            int i3 = groups[this.parent + 5];
            if (i3 != -1) {
                SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
                int i4 = (i3 & 15) + 1;
                int i5 = i3 >> 4;
                if (i4 > 15) {
                    i4 = slotTableAddressSpace.getLargeSizes().d(i5);
                }
                int i6 = i5 + i4;
                this.slotCurrent = i6 - i2;
                this.slotEnd = i6;
            }
        }
    }

    public final void endGroup() {
        int i;
        int i2 = this.parent;
        int[] iArr = this.groups;
        if (i2 + 6 > iArr.length) {
            return;
        }
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2 + 2];
        this.parent = i4;
        setPreviousSibling(i2);
        setCurrent(i3);
        int i5 = this.groups[i4 + 5];
        int i6 = i5 >> 4;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (i5 == -1) {
            i = 0;
        } else {
            i = (i5 & 15) + 1;
            if (i > 15) {
                i = slotTableAddressSpace.getLargeSizes().d(i6);
            }
        }
        int i7 = i6 + i;
        this.slotEnd = i7;
        this.slotCurrent = i7 - this.previousSlotCurrentOffset.popOr(0);
    }

    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (!getInEmpty()) {
            int previousSibling = getPreviousSibling();
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            SlotTable slotTable = this.table;
            int currentGroup = getCurrentGroup();
            int[] groups = slotTable.getAddressSpace().getGroups();
            int i = currentGroup;
            int i2 = previousSibling;
            int i3 = 0;
            while (i >= 0) {
                int i4 = iArr[i + 4];
                int i5 = i3 + 1;
                arrayList.add(new KeyInfo(iArr[i], (i4 & GroupFlagsKt.HasObjectKeyFlag) == 16777216 ? objArr[Integer.bitCount(i4 & GroupFlagsKt.IsNodeFlag) + (iArr[i + 5] >> 4)] : null, (i2 << 32) | (i & 4294967295L), (i4 & GroupFlagsKt.IsNodeFlag) == 8388608 ? 1 : 8388607 & i4, i3));
                int i6 = i;
                i = groups[i + 1];
                i2 = i6;
                i3 = i5;
            }
        }
        return arrayList;
    }

    public final int firstChildOf(int i) {
        return this.groups[i + 3];
    }

    public final int flagsOf(int i) {
        return this.groups[i + 4];
    }

    public final Object get(int i, int i2) {
        if (i2 >= 0) {
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            int i3 = iArr[i + 5];
            if (i3 != -1) {
                int i4 = iArr[i + 4];
                SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
                int i5 = (i3 & 15) + 1;
                int i6 = i3 >> 4;
                if (i5 > 15) {
                    i5 = slotTableAddressSpace.getLargeSizes().d(i6);
                }
                int utilitySlotsCountForFlags = GroupFlagsKt.utilitySlotsCountForFlags(i4) + i2;
                if (utilitySlotsCountForFlags < i5) {
                    return objArr[i6 + utilitySlotsCountForFlags];
                }
            }
        }
        return Composer.Companion.getEmpty();
    }

    public final int getCurrentGroup() {
        return getCurrent();
    }

    public final Object getGroupAux() {
        return groupAux(getCurrent());
    }

    public final int getGroupKey() {
        int current = getCurrent();
        if (current != -1) {
            return this.addressSpace.getGroups()[current];
        }
        return 0;
    }

    public final Object getGroupNode() {
        return groupNode(getCurrent());
    }

    public final Object getGroupObjectKey() {
        return groupObjectKey(getCurrent());
    }

    public final int getGroupReferenceSlotStartAddress() {
        return this.groups[this.parent + 5] >> 4;
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        return hasObjectKey(getCurrent());
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNextParentSlotAddress() {
        return this.slotCurrent;
    }

    public final int getNodeCount() {
        return this.groups[getCurrent() + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final Object getOrNull(int i, int i2) {
        Object obj = get(i, i2);
        if (obj == null || obj.equals(Composer.Companion.getEmpty())) {
            return null;
        }
        return obj;
    }

    public final LinkAnchor getParentAnchor() {
        return this.addressSpace.anchorOfAddress(getParentGroup());
    }

    public final int getParentCurrentSlotOffset() {
        int i = this.groups[this.parent + 5];
        if (i == -1) {
            return 0;
        }
        return this.slotCurrent - (i >> 4);
    }

    public final int getParentGroup() {
        return this.parent;
    }

    public final long getParentHandle() {
        return this.parent & 4294967295L;
    }

    public final Object getParentNode() {
        return groupNode(this.parent);
    }

    public final int getParentNodeCount() {
        int i = this.parent;
        if (i == -1) {
            return 0;
        }
        int i2 = this.groups[i + 4];
        if ((i2 & GroupFlagsKt.IsNodeFlag) == 8388608) {
            return 1;
        }
        return i2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final int getPreviousSibling() {
        return this._previousSibling;
    }

    public final int getRemainingSlots() {
        return this.slotEnd - this.slotCurrent;
    }

    public final int getSlotCurrent() {
        return this.slotCurrent;
    }

    public final int getSlotEnd() {
        return this.slotEnd;
    }

    public final int getSlotIndex() {
        int i = this.parent;
        if (i >= 0) {
            return this.slotCurrent - (this.groups[i + 5] >> 4);
        }
        return 0;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int i) {
        int[] iArr = this.groups;
        int i2 = iArr[i + 4];
        int i3 = iArr[i + 5];
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) != 33554432) {
            return Composer.Companion.getEmpty();
        }
        if (this.emptyCount > 0) {
            this.slots = this.addressSpace.getSlots();
        }
        return this.slots[Integer.bitCount(25165824 & i2) + (i3 >> 4)];
    }

    public final int groupKey(int i) {
        return this.groups[i];
    }

    public final Object groupNode(int i) {
        int[] iArr = this.groups;
        int i2 = iArr[i + 4];
        int i3 = iArr[i + 5];
        if ((i2 & GroupFlagsKt.IsNodeFlag) != 8388608) {
            return null;
        }
        if (this.emptyCount > 0) {
            this.slots = this.addressSpace.getSlots();
        }
        return this.slots[i3 >> 4];
    }

    public final Object groupObjectKey(int i) {
        int[] iArr = this.groups;
        int i2 = iArr[i + 4];
        int i3 = iArr[i + 5];
        if ((i2 & GroupFlagsKt.HasObjectKeyFlag) != 16777216) {
            return null;
        }
        if (this.emptyCount > 0) {
            this.slots = this.addressSpace.getSlots();
        }
        return this.slots[Integer.bitCount(8388608 & i2) + (i3 >> 4)];
    }

    public final long handle() {
        return GroupHandleKt.makeGroupHandle(this.parent, getPreviousSibling(), getCurrent());
    }

    public final boolean hasObjectKey(int i) {
        return (this.groups[i + 4] & GroupFlagsKt.HasObjectKeyFlag) == 16777216;
    }

    public final boolean hasRecomposeRequired(int i) {
        return (this.groups[i + 4] & 201326592) != 0;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public final boolean isEmpty() {
        return this.table.isEmpty();
    }

    public final boolean isGroupEnd() {
        return getCurrent() == -1 && !getInEmpty();
    }

    public final boolean isNode() {
        return (this.groups[getCurrent() + 4] & GroupFlagsKt.IsNodeFlag) == 8388608;
    }

    public final Object maybeNode(int i) {
        if ((this.groups[i + 4] & GroupFlagsKt.IsNodeFlag) != 8388608) {
            return Composer.Companion.getEmpty();
        }
        if (this.emptyCount > 0) {
            this.slots = this.addressSpace.getSlots();
        }
        return this.slots[this.groups[i + 5] >> 4];
    }

    public final Object next() {
        int i;
        if (getInEmpty() || (i = this.slotCurrent) >= this.slotEnd) {
            this.hadNext = false;
            return Composer.Companion.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.slotCurrent = i + 1;
        return objArr[i];
    }

    public final int nextSiblingOf(int i) {
        return this.groups[i + 1];
    }

    public final Object node(int i) {
        return this.slots[this.groups[i + 5] >> 4];
    }

    public final int nodeCount(int i) {
        int i2 = this.groups[i + 4];
        if ((i2 & GroupFlagsKt.IsNodeFlag) == 8388608) {
            return 1;
        }
        return i2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final int parentGroupFlags() {
        return flagsOf(this.parent);
    }

    public final int parentOf(int i) {
        return this.groups[i + 2];
    }

    public final boolean recomposeRequired(int i) {
        return (this.groups[i + 4] & GroupFlagsKt.IsRecompositionRequiredFlag) == 67108864;
    }

    public final void removeFlag(int i, int i2) {
        int[] groups = this.addressSpace.getGroups();
        int i3 = i + 4;
        int i4 = groups[i3];
        if ((i2 & i4) == i2) {
            int i5 = i4 & (~i2);
            groups[i3] = i5;
            int propagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i2);
            if ((i5 & propagatingFlagsOf) != 0) {
                return;
            }
            int i6 = i2 | propagatingFlagsOf;
            int[] groups2 = this.addressSpace.getGroups();
            int i7 = groups2[i + 2];
            while (i7 > 0) {
                int i8 = i7 + 4;
                int i9 = groups[i8];
                if ((i9 & propagatingFlagsOf) == 0) {
                    return;
                }
                int[] groups3 = this.addressSpace.getGroups();
                for (int i10 = groups3[i7 + 3]; i10 > 0; i10 = groups3[i10 + 1]) {
                    if ((groups[i10 + 4] & i6) != 0) {
                        return;
                    }
                }
                groups[i8] = i9 & (~propagatingFlagsOf);
                i7 = groups2[i7 + 2];
            }
            if (i7 != 0) {
                return;
            }
            gy.h(i, "Traversing parent of group not in the slot table: ");
        }
    }

    public final void reposition(long j) {
        if (getInEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        setCurrent(GroupHandleKt.getGroup(j));
        setPreviousSibling(GroupHandleKt.getContext(j));
        this.parent = this.groups[getCurrent() + 2];
    }

    public final void restoreParent(int i) {
        setPreviousSibling(0);
        this.parent = i;
        this.slotCurrent = 0;
        this.slotEnd = 0;
    }

    public final long rootHandle() {
        return (this.table.getRoot() & 4294967295L) | (-4294967296L);
    }

    public final void setSlotCurrent(int i) {
        this.slotCurrent = i;
    }

    public final void setSlotEnd(int i) {
        this.slotEnd = i;
    }

    public final int skipGroup() {
        int current = getCurrent();
        int[] iArr = this.groups;
        if (current + 6 > iArr.length) {
            return 0;
        }
        int i = iArr[current + 4];
        int i2 = (i & GroupFlagsKt.IsNodeFlag) == 8388608 ? 1 : i & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
        setCurrent(iArr[current + 1]);
        setPreviousSibling(current);
        return i2;
    }

    public final void skipToGroupEnd() {
        setCurrent(-1);
        setPreviousSibling(0);
        this.slotCurrent = 0;
        this.slotEnd = 0;
    }

    public final void startGroup() {
        int d;
        int current = getCurrent();
        this.parent = current;
        int[] iArr = this.groups;
        if (current + 6 > iArr.length) {
            return;
        }
        setCurrent(iArr[current + 3]);
        setPreviousSibling(-1);
        this.previousSlotCurrentOffset.push(this.slotEnd - this.slotCurrent);
        int i = iArr[current + 5];
        if (i == -1) {
            this.slotCurrent = -1;
            this.slotEnd = -1;
            return;
        }
        int i2 = iArr[current + 4];
        int i3 = i >> 4;
        this.slotCurrent = GroupFlagsKt.utilitySlotsCountForFlags(i2) + i3;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (i == -1) {
            d = 0;
        } else {
            int i4 = (i & 15) + 1;
            d = i4 > 15 ? slotTableAddressSpace.getLargeSizes().d(i3) : i4;
        }
        this.slotEnd = i3 + d;
    }

    public final void startNode() {
        if (!isNode()) {
            ComposerKt.composeImmediateRuntimeError("Expected a node group");
        }
        startGroup();
    }

    public final void traverseChildrenByHandle(int i, ky kyVar) {
        long firstChildOf = firstChildOf(i) & 4294967295L;
        long j = -4294967296L;
        while (true) {
            long j2 = firstChildOf | j;
            if (GroupHandleKt.getGroup(j2) == -1) {
                return;
            }
            kyVar.invoke(Long.valueOf(j2));
            j = GroupHandleKt.getGroup(j2) << 32;
            firstChildOf = nextSiblingOf(GroupHandleKt.getGroup(j2)) & 4294967295L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r2 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r11.invoke(java.lang.Integer.valueOf(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void traverseChildrenConditionally(int i, ky kyVar, ky kyVar2, ky kyVar3, ky kyVar4) {
        int firstChildOf = firstChildOf(i);
        while (firstChildOf != -1) {
            boolean booleanValue = ((Boolean) kyVar2.invoke(Integer.valueOf(firstChildOf))).booleanValue();
            int firstChildOf2 = firstChildOf(firstChildOf);
            if (booleanValue || firstChildOf2 == -1 || !((Boolean) kyVar.invoke(Integer.valueOf(firstChildOf))).booleanValue()) {
                int i2 = firstChildOf;
                firstChildOf = nextSiblingOf(firstChildOf);
                while (firstChildOf == -1) {
                    i2 = parentOf(i2);
                    if (i2 == -1 || i2 == i) {
                        return;
                    }
                    kyVar3.invoke(Integer.valueOf(i2));
                    firstChildOf = nextSiblingOf(i2);
                }
            } else {
                firstChildOf = firstChildOf2;
            }
        }
    }

    public final void traverseGroupPartially(int i, boolean z, ky kyVar) {
        int i2;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = slotTableAddressSpace.getGroups();
        int i3 = i;
        while (true) {
            boolean booleanValue = ((Boolean) kyVar.invoke(Integer.valueOf(i3))).booleanValue();
            if ((i3 != i || z) && (i2 = groups[i3 + 1]) >= 0) {
                intStack.push(i2);
            }
            i3 = groups[i3 + 3];
            if (!booleanValue || i3 < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    i3 = intStack.pop();
                }
            }
        }
    }

    public final boolean isNode(int i) {
        return (this.groups[i + 4] & GroupFlagsKt.IsNodeFlag) == 8388608;
    }

    public final void reposition(int i) {
        reposition(i & 4294967295L);
    }

    public final Object get(int i) {
        return get(getCurrent(), i);
    }

    public final void removeFlag(int i) {
        removeFlag(this.parent, i);
    }
}
