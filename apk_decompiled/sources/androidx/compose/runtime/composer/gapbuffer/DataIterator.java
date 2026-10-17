package androidx.compose.runtime.composer.gapbuffer;

import defpackage.n20;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DataIterator implements Iterable<Object>, Iterator<Object>, n20 {
    private final int end;
    private int index;
    private final int start;
    private final SlotTable table;

    public DataIterator(SlotTable slotTable, int i) {
        this.table = slotTable;
        int i2 = slotTable.getGroups()[(i * 5) + 4];
        this.start = i2;
        int i3 = i + 1;
        this.end = i3 < slotTable.getGroupsSize() ? slotTable.getGroups()[(i3 * 5) + 4] : slotTable.getSlotsSize();
        this.index = i2;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getStart() {
        return this.start;
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
        int i = this.index;
        Object obj = (i < 0 || i >= this.table.m3964getSlots().length) ? null : this.table.m3964getSlots()[this.index];
        this.index++;
        return obj;
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
