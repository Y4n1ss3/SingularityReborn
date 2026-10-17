package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Anchor;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkAnchorKt {
    private static final LinkAnchor NullAnchor = new LinkAnchor(-1);
    private static final LinkAnchor LazyAnchor = new LinkAnchor(0);

    public static final AnchorHandle anchorHandle(SlotTableAddressSpace slotTableAddressSpace, long j) {
        return new AnchorHandle(anchorHandle$anchorOf(slotTableAddressSpace, GroupHandleKt.getGroup(j)), anchorHandle$anchorOf(slotTableAddressSpace, GroupHandleKt.getContext(j)));
    }

    private static final LinkAnchor anchorHandle$anchorOf(SlotTableAddressSpace slotTableAddressSpace, int i) {
        return i != -1 ? i != 0 ? slotTableAddressSpace.anchorOfAddress(i) : LazyAnchor : NullAnchor;
    }

    public static final LinkAnchor asLinkAnchor(Anchor anchor) {
        LinkAnchor linkAnchor = anchor instanceof LinkAnchor ? (LinkAnchor) anchor : null;
        if (linkAnchor != null) {
            return linkAnchor;
        }
        throw uf.a("Inconsistent composition");
    }

    public static final LinkAnchor getLazyAnchor() {
        return LazyAnchor;
    }

    public static final LinkAnchor getNullAnchor() {
        return NullAnchor;
    }

    public static final boolean ownsHandle(SlotTableAddressSpace slotTableAddressSpace, AnchorHandle anchorHandle) {
        return anchorHandle.ownedBy$runtime(slotTableAddressSpace);
    }
}
