package androidx.compose.runtime.composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupInfo {
    public static final int $stable = 8;
    private int nodeCount;
    private int nodeIndex;
    private int slotIndex;

    public GroupInfo(int i, int i2, int i3) {
        this.slotIndex = i;
        this.nodeIndex = i2;
        this.nodeCount = i3;
    }

    public final int getNodeCount() {
        return this.nodeCount;
    }

    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void setNodeCount(int i) {
        this.nodeCount = i;
    }

    public final void setNodeIndex(int i) {
        this.nodeIndex = i;
    }

    public final void setSlotIndex(int i) {
        this.slotIndex = i;
    }
}
