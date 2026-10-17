package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.IntStack;
import defpackage.ac;
import defpackage.gy;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTableBuilder {
    public static final int $stable = 8;
    private final SlotTableAddressSpace addressSpace;
    private boolean inReservedRange;
    private boolean isClosed;
    private int nodeCount;
    private int parent;
    private final IntStack parentStack;
    private int previousSibling;
    private final IntStack previousSiblingStack;
    private boolean recordCallByInformation;
    private boolean recordSourceInformation;
    private int slotCurrent;
    private int slotEnd;
    private int slotReserveEnd;
    private int slotReserveStart;
    private int slotReserveUsedUpTo;
    private int slotStart;
    private Object[] slots;
    private final SlotTable table;

    public SlotTableBuilder(SlotTable slotTable, boolean z, boolean z2) {
        int i;
        this.table = slotTable;
        this.recordSourceInformation = z;
        this.recordCallByInformation = z2;
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        this.addressSpace = addressSpace;
        int i2 = -1;
        this.parent = -1;
        this.parentStack = new IntStack();
        int root = slotTable.getRoot();
        if (root != -1) {
            int[] groups = addressSpace.getGroups();
            while (true) {
                i = i2;
                i2 = root;
                if (i2 < 0) {
                    break;
                } else {
                    root = groups[i2 + 1];
                }
            }
            i2 = i;
        }
        this.previousSibling = i2;
        this.previousSiblingStack = new IntStack();
        this.slots = this.addressSpace.getSlots();
    }

    private final void buildEnd() {
        int i = this.parent;
        if (i != -1) {
            saveSlotRange(i);
        }
        returnReservedSlotRegion();
    }

    private final void reserveSlotSlotRegion() {
        long reserveSlots = this.addressSpace.reserveSlots();
        int i = (int) reserveSlots;
        this.slotReserveStart = i;
        this.slotReserveUsedUpTo = i;
        this.slotReserveEnd = (int) (reserveSlots >>> 32);
    }

    private final void restoreFromSlotRange(int i) {
        int i2 = this.addressSpace.getGroups()[i + 5];
        if (i2 == -1) {
            int i3 = this.slotReserveUsedUpTo;
            this.slotStart = i3;
            this.slotCurrent = i3;
            this.slotEnd = this.slotReserveEnd;
            this.inReservedRange = true;
            return;
        }
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int i4 = (i2 & 15) + 1;
        int i5 = i2 >> 4;
        if (i4 > 15) {
            i4 = slotTableAddressSpace.getLargeSizes().d(i5);
        }
        this.slotStart = i5;
        int i6 = i5 + i4;
        this.slotEnd = i6;
        this.slotCurrent = i6;
        this.inReservedRange = false;
    }

    private final void returnReservedSlotRegion() {
        int i = this.slotReserveStart;
        int i2 = this.slotReserveEnd;
        if (i != i2) {
            this.addressSpace.restoreSlots(this.slotReserveUsedUpTo, i2);
            this.slotReserveStart = 0;
            this.slotReserveUsedUpTo = 0;
            this.slotReserveEnd = 0;
        }
    }

    private final int saveSlotRange(int i) {
        if (i < 0) {
            return 0;
        }
        int[] groups = this.addressSpace.getGroups();
        int i2 = this.slotCurrent;
        int i3 = this.slotStart;
        if (i2 <= i3) {
            groups[i + 5] = -1;
            return 0;
        }
        if (!this.inReservedRange) {
            int i4 = i2 - i3;
            int i5 = this.slotEnd - i3;
            if (i5 != i4) {
                this.addressSpace.resizeSlotRangeAtGroup(i, i5, i4);
            }
            return i4;
        }
        int i6 = i2 - i3;
        int slotRangeFromAddressAndSize = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i3, i6);
        if (i6 > 15) {
            this.addressSpace.recordLargeBlock(i3, i6);
        }
        this.slotReserveUsedUpTo = i2;
        groups[i + 5] = slotRangeFromAddressAndSize;
        return i6;
    }

    private final void slowAppend(Object obj) {
        int i = this.parent;
        int saveSlotRange = saveSlotRange(i);
        returnReservedSlotRegion();
        this.addressSpace.writeSlot(i, saveSlotRange, obj);
        this.slots = this.addressSpace.getSlots();
        reserveSlotSlotRegion();
        restoreFromSlotRange(i);
    }

    public static /* synthetic */ void startGroup$default(SlotTableBuilder slotTableBuilder, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = Composer.Companion.getEmpty();
        }
        Object obj3 = obj;
        slotTableBuilder.startNewGroup(i, obj3 == Composer.Companion.getEmpty() ? 0 : GroupFlagsKt.HasObjectKeyFlag, obj3, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNewGroup(int i, int i2, Object obj, Object obj2, Object obj3) {
        int groupAllocate;
        int i3 = this.parent;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        groupAllocate = SlotTableAddresSpaceKt.groupAllocate(slotTableAddressSpace.getGroups(), i, i3, i2);
        if (groupAllocate < 0) {
            slotTableAddressSpace.growGroups();
            groupAllocate = SlotTableAddresSpaceKt.groupAllocate(slotTableAddressSpace.getGroups(), i, i3, i2);
        }
        int[] groups = this.addressSpace.getGroups();
        int i4 = this.previousSibling;
        if (i4 != -1) {
            groups[i4 + 1] = groupAllocate;
        } else if (i3 == -1) {
            this.table.setRoot(groupAllocate);
        } else {
            groups[i3 + 3] = groupAllocate;
        }
        this.parentStack.push(i3);
        this.previousSiblingStack.push(i4);
        this.parent = groupAllocate;
        this.previousSibling = -1;
        if (i3 != -1) {
            int i5 = i3 + 4;
            groups[i5] = this.nodeCount | (groups[i5] & (-8388608));
        }
        this.nodeCount = 0;
        saveSlotRange(i3);
        int i6 = this.slotReserveUsedUpTo;
        this.slotStart = i6;
        this.slotCurrent = i6;
        this.slotEnd = this.slotReserveEnd;
        this.inReservedRange = true;
        if ((i2 & GroupFlagsKt.IsNodeFlag) == 8388608) {
            append(obj3);
        }
        if ((i2 & GroupFlagsKt.HasObjectKeyFlag) == 16777216) {
            append(obj);
        }
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
            append(obj2);
        }
        int i7 = this.slotCurrent;
        int i8 = this.slotStart;
        if (i7 > i8) {
            groups[groupAllocate + 5] = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i8, i7 - i8);
        }
        if (!this.recordSourceInformation || i3 < 0) {
            return;
        }
        this.addressSpace.recordSourceInformation(i3, null, groupAllocate).reportGroup(this.addressSpace.anchorOfAddress(groupAllocate));
    }

    public final void addFlags(int i) {
        int[] groups = this.addressSpace.getGroups();
        int i2 = this.parent;
        int i3 = i | groups[i2 + 4];
        groups[i2 + 4] = i3;
        int propagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i3);
        if (propagatingFlagsOf != 0) {
            SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
            int i4 = this.parent;
            int[] groups2 = slotTableAddressSpace.getGroups();
            int i5 = groups2[i4 + 2];
            while (i5 > 0) {
                int i6 = i5 + 4;
                int i7 = groups[i6];
                if ((propagatingFlagsOf & i7) == propagatingFlagsOf) {
                    return;
                }
                groups[i6] = i7 | propagatingFlagsOf;
                i5 = groups2[i5 + 2];
            }
            if (i5 != 0) {
                return;
            }
            gy.h(i4, "Traversing parent of group not in the slot table: ");
        }
    }

    public final void append(Object obj) {
        int i = this.slotCurrent;
        if (i >= this.slotEnd) {
            slowAppend(obj);
            return;
        }
        Object[] objArr = this.slots;
        this.slotCurrent = i + 1;
        objArr[i] = obj;
    }

    public final SlotTable build() {
        buildEnd();
        close();
        return this.table;
    }

    public final void buildStart() {
        reserveSlotSlotRegion();
    }

    public final void close() {
        this.isClosed = true;
    }

    public final void collectCallByInformation() {
        this.recordCallByInformation = true;
        this.table.setRecordCallByInformation(true);
    }

    public final void collectSourceInformation() {
        this.recordSourceInformation = true;
        this.table.setRecordSourceInformation(true);
    }

    public final int endGroup() {
        int i = this.parent;
        int[] groups = this.addressSpace.getGroups();
        int i2 = i + 4;
        groups[i2] = this.nodeCount | (groups[i2] & (-8388608));
        saveSlotRange(i);
        int pop = this.parentStack.pop();
        this.parent = pop;
        int pop2 = this.previousSiblingStack.pop();
        this.previousSibling = pop2 == -1 ? pop == -1 ? this.table.getRoot() : groups[pop + 3] : groups[pop2 + 1];
        restoreFromSlotRange(this.parent);
        int i3 = groups[i2];
        int i4 = (i3 & GroupFlagsKt.IsNodeFlag) != 8388608 ? i3 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK : 1;
        this.nodeCount = (groups[this.parent + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK) + i4;
        return i4;
    }

    public final int flagsOf(int i) {
        return this.addressSpace.getGroups()[i + 4];
    }

    public final LinkAnchor getParentAnchor() {
        return this.addressSpace.anchorOfAddress(getParentGroup());
    }

    public final int getParentGroup() {
        return this.parent;
    }

    public final long getParentHandle() {
        return ((this.previousSiblingStack.tos == 0 ? -1 : r0.peek()) << 32) | (this.parent & 4294967295L);
    }

    public final boolean getRecordCallByInformation() {
        return this.recordCallByInformation;
    }

    public final boolean getRecordSourceInformation() {
        return this.recordSourceInformation;
    }

    public final int getSlotIndex() {
        return this.slotCurrent - this.slotStart;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int i) {
        int[] groups = this.addressSpace.getGroups();
        int i2 = groups[i + 4];
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) != 33554432) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[Integer.bitCount(25165824 & i2) + (groups[i + 5] >> 4)];
    }

    public final int groupKey(int i) {
        return this.addressSpace.getGroups()[i];
    }

    public final Object groupObjectKey(int i) {
        int[] groups = this.addressSpace.getGroups();
        int i2 = groups[i + 4];
        if ((i2 & GroupFlagsKt.HasObjectKeyFlag) != 16777216) {
            return null;
        }
        return this.slots[Integer.bitCount(8388608 & i2) + (groups[i + 5] >> 4)];
    }

    public final void insertAux(Object obj) {
        int parentGroup = getParentGroup();
        int[] groups = this.addressSpace.getGroups();
        int i = parentGroup + 4;
        int i2 = groups[i] | GroupFlagsKt.HasAuxSlotFlag;
        groups[i] = i2;
        append(obj);
        int bitCount = Integer.bitCount(25165824 & i2) + this.slotStart;
        int i3 = bitCount + 1;
        if (i3 != this.slotCurrent) {
            Object[] slots = this.addressSpace.getSlots();
            ac.Q(slots, slots, i3, bitCount, this.slotCurrent - 1);
            slots[bitCount] = obj;
        }
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public final boolean isEmpty() {
        return this.parent == -1;
    }

    public final boolean isNode() {
        int i = this.parent;
        return i != -1 && (this.addressSpace.getGroups()[i + 4] & GroupFlagsKt.IsNodeFlag) == 8388608;
    }

    public final long lastRoot() {
        int root = this.table.getRoot();
        int i = -1;
        if (root != -1) {
            SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
            int root2 = this.table.getRoot();
            int[] groups = slotTableAddressSpace.getGroups();
            int i2 = root;
            for (int i3 = groups[root2 + 1]; i3 >= 0; i3 = groups[i3 + 1]) {
                i = i2;
                i2 = i3;
            }
            root = i2;
        }
        return (i << 32) | (root & 4294967295L);
    }

    public final void moveFrom(SlotTableEditor slotTableEditor, long j) {
        q10.b(slotTableEditor.getAddressSpace$runtime(), this.addressSpace);
        long handle = slotTableEditor.handle();
        slotTableEditor.seek(j);
        slotTableEditor.removeGroup(false);
        slotTableEditor.seek(handle);
        int group = GroupHandleKt.getGroup(j);
        int[] groups = this.addressSpace.getGroups();
        int i = this.parent;
        int i2 = this.previousSibling;
        if (i2 != -1) {
            groups[i2 + 1] = group;
        } else if (i == -1) {
            this.table.setRoot(group);
        } else {
            groups[i + 3] = group;
        }
        groups[group + 2] = i;
        groups[group + 1] = -1;
        this.previousSibling = group;
        int i3 = this.nodeCount;
        int i4 = groups[group + 4];
        this.nodeCount = i3 + ((i4 & GroupFlagsKt.IsNodeFlag) == 8388608 ? 1 : 8388607 & i4);
        int propagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i4);
        if (propagatingFlagsOf != 0) {
            int[] groups2 = this.addressSpace.getGroups();
            int i5 = i;
            while (i5 > 0) {
                int i6 = i5 + 4;
                int i7 = groups[i6];
                if ((i7 & propagatingFlagsOf) == propagatingFlagsOf) {
                    return;
                }
                groups[i6] = i7 | propagatingFlagsOf;
                i5 = groups2[i5 + 2];
            }
            if (i5 != 0) {
                return;
            }
            gy.h(i, "Traversing parent of group not in the slot table: ");
        }
    }

    public final int parent(int i) {
        return this.addressSpace.getGroups()[i + 2];
    }

    public final void recordGroupSourceInformation(String str) {
        if (this.recordSourceInformation) {
            this.addressSpace.recordSourceInformation(this.parent, str, -1);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        if (this.recordSourceInformation) {
            this.addressSpace.recordSourceInformation(this.parent, null, -1).endGrouplessCall(this.slotCurrent - this.slotStart);
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int i, String str) {
        if (this.recordCallByInformation) {
            this.addressSpace.recordCalledBy(i, groupKey(this.parent));
        }
        if (this.recordSourceInformation) {
            this.addressSpace.recordSourceInformation(this.parent, null, -1).startGrouplessCall(i, str, this.slotCurrent - this.slotStart);
        }
    }

    public final void setRecordCallByInformation(boolean z) {
        this.recordCallByInformation = z;
    }

    public final void setRecordSourceInformation(boolean z) {
        this.recordSourceInformation = z;
    }

    public final void startDataGroup(int i, Object obj, Object obj2) {
        startNewGroup(i, obj == Composer.Companion.getEmpty() ? GroupFlagsKt.HasAuxSlotFlag : 50331648, obj, obj2, null);
    }

    public final void startGroup(int i, Object obj) {
        startNewGroup(i, obj == Composer.Companion.getEmpty() ? 0 : GroupFlagsKt.HasObjectKeyFlag, obj, null, null);
    }

    public final void startNodeGroup(int i, Object obj, Object obj2) {
        startNewGroup(i, obj == Composer.Companion.getEmpty() ? GroupFlagsKt.IsNodeFlag : 25165824, obj, null, obj2);
    }

    public SlotTableBuilder(SlotTableAddressSpace slotTableAddressSpace, boolean z, boolean z2) {
        this(new SlotTable(0, slotTableAddressSpace, z, z2, 1, null), z, z2);
    }
}
