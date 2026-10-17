package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.n20;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, n20 {
    private int nextGroup;
    private final SlotTable table;
    private final int version;

    public GroupIterator(SlotTable slotTable, int i) {
        this.table = slotTable;
        this.nextGroup = i;
        this.version = slotTable.getVersion();
        if (slotTable.getHasEditor()) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.nextGroup != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        validateRead();
        int i = this.nextGroup;
        this.nextGroup = this.table.nextSiblingOf$runtime(i);
        return new SlotTableGroup(this.table, i, this.version);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
