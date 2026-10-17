package androidx.compose.runtime.composer.linkbuffer;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RelativeGroupPath extends SourceInformationGroupPath {
    private final int index;
    private final SourceInformationGroupPath parent;

    public RelativeGroupPath(SourceInformationGroupPath sourceInformationGroupPath, int i) {
        super(null);
        this.parent = sourceInformationGroupPath;
        this.index = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RelativeGroupPath)) {
            return false;
        }
        RelativeGroupPath relativeGroupPath = (RelativeGroupPath) obj;
        return q10.b(relativeGroupPath.parent, this.parent) && relativeGroupPath.index == this.index;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SourceInformationGroupPath
    public Object getIdentity(SlotTableAddressSpace slotTableAddressSpace) {
        return new SourceInformationSlotTableGroupIdentity(this.parent.getIdentity(slotTableAddressSpace), this.index);
    }

    public final int getIndex() {
        return this.index;
    }

    public final SourceInformationGroupPath getParent() {
        return this.parent;
    }

    public int hashCode() {
        return this.parent.hashCode() + (this.index * 31);
    }
}
