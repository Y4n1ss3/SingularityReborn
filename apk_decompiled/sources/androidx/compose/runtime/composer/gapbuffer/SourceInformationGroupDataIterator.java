package androidx.compose.runtime.composer.gapbuffer;

import defpackage.n20;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, n20 {
    private final int base;
    private final int end;
    private final BitVector filter;
    private int index;
    private final int start;
    private final SlotTable table;

    public SourceInformationGroupDataIterator(SlotTable slotTable, int i, GapGroupSourceInformation gapGroupSourceInformation) {
        this.table = slotTable;
        int i2 = slotTable.getGroups()[(i * 5) + 4];
        this.base = i2;
        this.start = gapGroupSourceInformation.getDataStartOffset();
        int dataEndOffset = gapGroupSourceInformation.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i3 = i + 1;
            dataEndOffset = (i3 < slotTable.getGroupsSize() ? slotTable.getGroups()[(i3 * 5) + 4] : slotTable.getSlotsSize()) - i2;
        }
        this.end = dataEndOffset;
        BitVector bitVector = new BitVector();
        ArrayList<Object> groups = gapGroupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = groups.get(i4);
                if (obj instanceof GapGroupSourceInformation) {
                    GapGroupSourceInformation gapGroupSourceInformation2 = (GapGroupSourceInformation) obj;
                    bitVector.setRange(gapGroupSourceInformation2.getDataStartOffset(), gapGroupSourceInformation2.getDataEndOffset());
                }
            }
        }
        this.filter = bitVector;
        this.index = bitVector.nextClear(this.start);
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
        Object obj;
        int i = this.end;
        int i2 = this.index;
        if (i2 < 0 || i2 >= i) {
            obj = null;
        } else {
            Object[] m3964getSlots = this.table.m3964getSlots();
            int i3 = this.base;
            int i4 = this.index;
            obj = m3964getSlots[i3 + i4];
            i2 = i4;
        }
        this.index = this.filter.nextClear(i2 + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }
}
