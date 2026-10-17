package androidx.compose.runtime.composer.linkbuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AnchoredGroupPath extends SourceInformationGroupPath {
    private final int group;

    public AnchoredGroupPath(int i) {
        super(null);
        this.group = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnchoredGroupPath) && ((AnchoredGroupPath) obj).group == this.group;
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SourceInformationGroupPath
    public Object getIdentity(SlotTableAddressSpace slotTableAddressSpace) {
        return slotTableAddressSpace.anchorOfAddress(this.group);
    }

    public int hashCode() {
        return this.group * 31;
    }
}
