package androidx.compose.runtime.composer.linkbuffer;

import defpackage.n20;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DataIterator implements Iterable<Object>, Iterator<Object>, n20 {
    private final int end;
    private final int group;
    private int index;
    private final SlotTable table;

    public DataIterator(SlotTable slotTable, int i) {
        int d;
        this.table = slotTable;
        this.group = i;
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        int groupSlotRange$runtime = slotTable.groupSlotRange$runtime(i);
        if (groupSlotRange$runtime == -1) {
            d = 0;
        } else {
            int i2 = (groupSlotRange$runtime & 15) + 1;
            d = i2 > 15 ? addressSpace.getLargeSizes().d(groupSlotRange$runtime >> 4) : i2;
        }
        this.end = d;
        this.index = GroupFlagsKt.utilitySlotsCountForFlags(slotTable.groupFlags$runtime(i));
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getIndex() {
        return this.index;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public Object next() {
        SlotTable slotTable = this.table;
        int i = this.group;
        int i2 = this.index;
        this.index = i2 + 1;
        return slotTable.groupSlotAtIndex$runtime(i, i2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }
}
