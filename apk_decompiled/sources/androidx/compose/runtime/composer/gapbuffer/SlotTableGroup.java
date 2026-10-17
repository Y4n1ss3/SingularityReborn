package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.dq;
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
        this(slotTable, i, (i3 & 4) != 0 ? slotTable.getVersion$runtime() : i2);
    }

    private static final CompositionGroup find$findAnchoredGroup(SlotTableGroup slotTableGroup, GapAnchor gapAnchor) {
        int anchorIndex;
        int i;
        int groupSize;
        if (!slotTableGroup.table.ownsAnchor(gapAnchor) || (anchorIndex = slotTableGroup.table.anchorIndex(gapAnchor)) < (i = slotTableGroup.group)) {
            return null;
        }
        int i2 = anchorIndex - i;
        groupSize = SlotTableKt.groupSize(slotTableGroup.table.getGroups(), slotTableGroup.group);
        if (i2 < groupSize) {
            return new SlotTableGroup(slotTableGroup.table, anchorIndex, slotTableGroup.version);
        }
        return null;
    }

    private static final CompositionGroup find$findRelativeGroup(CompositionGroup compositionGroup, int i) {
        return (CompositionGroup) yi.q0(yi.o0(compositionGroup.getCompositionGroups(), i));
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime() != this.version) {
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
        if (obj instanceof GapAnchor) {
            return find$findAnchoredGroup(this, (GapAnchor) obj);
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
        GapGroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
        SlotTable slotTable = this.table;
        return sourceInformationOf != null ? new SourceInformationGroupDataIterator(slotTable, this.group, sourceInformationOf) : new DataIterator(slotTable, this.group);
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        validateRead();
        SlotReader openReader = this.table.openReader();
        try {
            return openReader.anchor(this.group);
        } finally {
            openReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        int objectKeyIndex;
        int i = this.table.getGroups()[(this.group * 5) + 1] & GroupFlagsKt.HasMovableContentFlag;
        SlotTable slotTable = this.table;
        if (i == 0) {
            return Integer.valueOf(slotTable.getGroups()[this.group * 5]);
        }
        Object[] m3964getSlots = slotTable.m3964getSlots();
        objectKeyIndex = SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group);
        Object obj = m3964getSlots[objectKeyIndex];
        obj.getClass();
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        if ((this.table.getGroups()[(this.group * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0) {
            return this.table.m3964getSlots()[this.table.getGroups()[(this.group * 5) + 4]];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int groupSize = this.group + getGroupSize();
        int groupsSize = this.table.getGroupsSize();
        SlotTable slotTable = this.table;
        return (groupSize < groupsSize ? slotTable.getGroups()[(groupSize * 5) + 4] : slotTable.getSlotsSize()) - this.table.getGroups()[(this.group * 5) + 4];
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        GapGroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
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
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        int groupSize;
        validateRead();
        GapGroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
        SlotTable slotTable = this.table;
        if (sourceInformationOf != null) {
            int i = this.group;
            return new SourceInformationGroupIterator(slotTable, i, sourceInformationOf, new AnchoredGroupPath(i));
        }
        int i2 = this.group;
        groupSize = SlotTableKt.groupSize(slotTable.getGroups(), this.group);
        return new GroupIterator(slotTable, i2 + 1, groupSize + i2);
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
