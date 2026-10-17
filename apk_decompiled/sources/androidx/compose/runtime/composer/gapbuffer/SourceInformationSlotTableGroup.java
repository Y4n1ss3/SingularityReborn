package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.n20;
import defpackage.q10;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, n20 {
    private final Iterable<CompositionGroup> compositionGroups = this;
    private final SourceInformationGroupPath identityPath;
    private final Object key;
    private final int parent;
    private final GapGroupSourceInformation sourceInformation;
    private final SlotTable table;

    public SourceInformationSlotTableGroup(SlotTable slotTable, int i, GapGroupSourceInformation gapGroupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.table = slotTable;
        this.parent = i;
        this.sourceInformation = gapGroupSourceInformation;
        this.identityPath = sourceInformationGroupPath;
        this.key = Integer.valueOf(gapGroupSourceInformation.getKey());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourceInformationSlotTableGroup)) {
            return false;
        }
        SourceInformationSlotTableGroup sourceInformationSlotTableGroup = (SourceInformationSlotTableGroup) obj;
        return sourceInformationSlotTableGroup.parent == this.parent && q10.b(sourceInformationSlotTableGroup.table, this.table) && q10.b(sourceInformationSlotTableGroup.identityPath, this.identityPath);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        return new SourceInformationGroupDataIterator(this.table, this.parent, this.sourceInformation);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        return this.identityPath.getIdentity(this.table);
    }

    public final SourceInformationGroupPath getIdentityPath() {
        return this.identityPath;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        return null;
    }

    public final int getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        return this.sourceInformation.getSourceInformation();
    }

    public final GapGroupSourceInformation getSourceInformation() {
        return this.sourceInformation;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public int hashCode() {
        return this.identityPath.hashCode() + ((this.table.hashCode() + (this.parent * 31)) * 31);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        ArrayList<Object> groups = this.sourceInformation.getGroups();
        boolean z = false;
        if (groups != null && !groups.isEmpty()) {
            z = true;
        }
        return !z;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.table, this.parent, this.sourceInformation, this.identityPath);
    }
}
