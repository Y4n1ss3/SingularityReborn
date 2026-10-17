package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.dq;
import defpackage.gy;
import defpackage.n20;
import defpackage.q10;
import defpackage.yi;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, n20 {
    private final int group;
    private final SlotTable table;
    private final int version;

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i, int i2, int i3, dq dqVar) {
        this(slotTable, i, (i3 & 4) != 0 ? slotTable.getVersion() : i2);
    }

    private static final CompositionGroup find$findAnchoredGroup(SlotTableGroup slotTableGroup, LinkAnchor linkAnchor) {
        SlotTableAddressSpace addressSpace = slotTableGroup.table.getAddressSpace();
        if (!addressSpace.ownsAnchor(linkAnchor)) {
            return null;
        }
        int address = linkAnchor.getAddress();
        if (address == slotTableGroup.group) {
            return slotTableGroup;
        }
        int[] groups = addressSpace.getGroups();
        int i = groups[address + 2];
        while (i > 0) {
            if (i == slotTableGroup.group) {
                return new SlotTableGroup(slotTableGroup.table, address, slotTableGroup.version);
            }
            i = groups[i + 2];
        }
        if (i != 0) {
            return null;
        }
        gy.h(address, "Traversing parent of group not in the slot table: ");
        return null;
    }

    private static final CompositionGroup find$findRelativeGroup(CompositionGroup compositionGroup, int i) {
        return (CompositionGroup) yi.q0(yi.o0(compositionGroup.getCompositionGroups(), i));
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SlotTableGroup)) {
            return false;
        }
        SlotTableGroup slotTableGroup = (SlotTableGroup) obj;
        return slotTableGroup.group == this.group && slotTableGroup.version == this.version && q10.b(slotTableGroup.table, this.table);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        if (obj instanceof LinkAnchor) {
            return find$findAnchoredGroup(this, (LinkAnchor) obj);
        }
        if (obj instanceof SourceInformationSlotTableGroupIdentity) {
            SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
            CompositionGroup find = find(sourceInformationSlotTableGroupIdentity.getParentIdentity());
            if (find != null) {
                return find$findRelativeGroup(find, sourceInformationSlotTableGroupIdentity.getIndex());
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        LinkGroupSourceInformation sourceInformationOf = this.table.getAddressSpace().sourceInformationOf(this.group);
        SlotTable slotTable = this.table;
        return sourceInformationOf != null ? new SourceInformationGroupDataIterator(slotTable, this.group, sourceInformationOf) : new DataIterator(slotTable, this.group);
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int i;
        SlotTableAddressSpace addressSpace = this.table.getAddressSpace();
        int i2 = this.group;
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        int i4 = i2;
        while (true) {
            i3++;
            if (i4 != i2 && (i = groups[i4 + 1]) >= 0) {
                intStack.push(i);
            }
            i4 = groups[i4 + 3];
            if (i4 < 0) {
                if (intStack.tos == 0) {
                    return i3;
                }
                i4 = intStack.pop();
            }
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        validateRead();
        return this.table.getAddressSpace().anchorOfAddress(this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        Object groupObjectKey$runtime = this.table.groupObjectKey$runtime(this.group);
        return groupObjectKey$runtime == null ? Integer.valueOf(this.table.groupKeyOf$runtime(this.group)) : groupObjectKey$runtime;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        return this.table.groupNode$runtime(this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int i;
        int i2;
        SlotTableAddressSpace addressSpace = this.table.getAddressSpace();
        int i3 = this.group;
        if (i3 < 0) {
            return 0;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = this.table.getAddressSpace().getGroups()[i4 + 5];
            if (i6 != -1) {
                SlotTableAddressSpace addressSpace2 = this.table.getAddressSpace();
                if (i6 == -1) {
                    i2 = 0;
                } else {
                    i2 = (i6 & 15) + 1;
                    if (i2 > 15) {
                        i2 = addressSpace2.getLargeSizes().d(i6 >> 4);
                    }
                }
                i5 += i2;
            }
            if (i4 != i3 && (i = groups[i4 + 1]) >= 0) {
                intStack.push(i);
            }
            i4 = groups[i4 + 3];
            if (i4 < 0) {
                if (intStack.tos == 0) {
                    return i5;
                }
                i4 = intStack.pop();
            }
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        boolean groupHasAux$runtime = this.table.groupHasAux$runtime(this.group);
        SlotTable slotTable = this.table;
        if (groupHasAux$runtime) {
            Object groupAux$runtime = slotTable.groupAux$runtime(this.group);
            if (groupAux$runtime instanceof String) {
                return (String) groupAux$runtime;
            }
            return null;
        }
        LinkGroupSourceInformation sourceInformationOf = slotTable.getAddressSpace().sourceInformationOf(this.group);
        if (sourceInformationOf != null) {
            return sourceInformationOf.getSourceInformation();
        }
        return null;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.table.hashCode() * 31) + this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.table.firstChildOf$runtime(this.group) == -1;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        validateRead();
        LinkGroupSourceInformation sourceInformationOf = this.table.getAddressSpace().sourceInformationOf(this.group);
        SlotTable slotTable = this.table;
        if (sourceInformationOf == null) {
            return new GroupIterator(slotTable, slotTable.firstChildOf$runtime(this.group));
        }
        int i = this.group;
        return new SourceInformationGroupIterator(slotTable, i, sourceInformationOf, new AnchoredGroupPath(i));
    }

    public SlotTableGroup(SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.group = i;
        this.version = i2;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}
