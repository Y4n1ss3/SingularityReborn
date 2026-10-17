package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.n20;
import defpackage.uf;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, n20 {
    private final LinkGroupSourceInformation group;
    private int index;
    private final int parent;
    private final SourceInformationGroupPath path;
    private final SlotTable table;
    private final int version;

    public SourceInformationGroupIterator(SlotTable slotTable, int i, LinkGroupSourceInformation linkGroupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.table = slotTable;
        this.parent = i;
        this.group = linkGroupSourceInformation;
        this.path = sourceInformationGroupPath;
        this.version = slotTable.getVersion();
    }

    public final LinkGroupSourceInformation getGroup() {
        return this.group;
    }

    public final int getParent() {
        return this.parent;
    }

    public final SourceInformationGroupPath getPath() {
        return this.path;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> groups = this.group.getGroups();
        return groups != null && this.index < groups.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        Object obj;
        ArrayList<Object> groups = this.group.getGroups();
        if (groups != null) {
            int i = this.index;
            this.index = i + 1;
            obj = groups.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof LinkAnchor) {
            return new SlotTableGroup(this.table, ((LinkAnchor) obj).getAddress(), this.version);
        }
        if (obj instanceof LinkGroupSourceInformation) {
            return new SourceInformationSlotTableGroup(this.table, this.parent, (LinkGroupSourceInformation) obj, new RelativeGroupPath(this.path, this.index - 1));
        }
        throw uf.a("Unexpected group information structure");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
