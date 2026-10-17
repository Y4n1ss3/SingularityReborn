package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.n20;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, n20 {
    private final int end;
    private int index;
    private final SlotTable table;
    private final int version;

    public GroupIterator(SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.end = i2;
        this.index = i;
        this.version = slotTable.getVersion$runtime();
        if (slotTable.getWriter$runtime()) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        int groupSize;
        validateRead();
        int i = this.index;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), i);
        this.index = groupSize + i;
        return new SlotTableGroup(this.table, i, this.version);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
