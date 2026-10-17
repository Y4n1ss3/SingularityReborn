package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int maxSlotsToRetainForReuse;

    public FixedCountSubcomposeSlotReusePolicy(int i) {
        this.maxSlotsToRetainForReuse = i;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return true;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        int size = slotIdsSet.size();
        int i = this.maxSlotsToRetainForReuse;
        if (size > i) {
            slotIdsSet.trimToSize(i);
        }
    }
}
