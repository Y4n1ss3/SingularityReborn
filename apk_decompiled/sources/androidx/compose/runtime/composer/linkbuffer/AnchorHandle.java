package androidx.compose.runtime.composer.linkbuffer;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchorHandle {
    public static final int $stable = 8;
    private final LinkAnchor contextAnchor;
    private final LinkAnchor groupAnchor;

    public AnchorHandle(LinkAnchor linkAnchor, LinkAnchor linkAnchor2) {
        this.groupAnchor = linkAnchor;
        this.contextAnchor = linkAnchor2;
    }

    private final boolean ownedBy(SlotTableAddressSpace slotTableAddressSpace, LinkAnchor linkAnchor) {
        if (q10.b(linkAnchor, LinkAnchorKt.getNullAnchor()) || q10.b(linkAnchor, LinkAnchorKt.getLazyAnchor())) {
            return true;
        }
        return slotTableAddressSpace.ownsAnchor(linkAnchor);
    }

    public final boolean ownedBy$runtime(SlotTableAddressSpace slotTableAddressSpace) {
        return ownedBy(slotTableAddressSpace, this.groupAnchor) && ownedBy(slotTableAddressSpace, this.contextAnchor);
    }

    public final long toHandle() {
        return (this.contextAnchor.getAddress() << 32) | (this.groupAnchor.getAddress() & 4294967295L);
    }

    public String toString() {
        return super.toString() + ": " + this.groupAnchor.getAddress() + ':' + this.contextAnchor.getAddress();
    }
}
