package androidx.compose.runtime.composer.linkbuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupFlagsKt {
    public static final int HasAuxSlotFlag = 33554432;
    public static final int HasMarkFlags = -1476395008;
    public static final int HasMovableContentFlag = 536870912;
    public static final int HasObjectKeyFlag = 16777216;
    public static final int HasRecompositionRequiredFlag = 134217728;
    public static final int HasSubcompositionContextFlag = Integer.MIN_VALUE;
    public static final int IsMarkFlags = 1409286144;
    public static final int IsMovableContentFlag = 268435456;
    public static final int IsNodeFlag = 8388608;
    public static final int IsRecompositionRequiredFlag = 67108864;
    public static final int IsSubcompositionContextFlag = 1073741824;
    public static final int UtilitySlotsMask = 58720256;

    public static final int auxSlotIndex(int i) {
        return Integer.bitCount(i & 25165824);
    }

    public static final int groupFlagsChildNodeCount(int i) {
        return i & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public static final boolean groupFlagsIsMarkedDeleted(int i) {
        return (i & GroupFlagsSpec.CHILD_NODE_COUNT_MASK) == 8388607;
    }

    public static final int groupFlagsNodeCount(int i) {
        if ((i & IsNodeFlag) == 8388608) {
            return 1;
        }
        return i & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public static final int nodeSlotIndex(int i) {
        return 0;
    }

    public static final int objectKeySlotIndex(int i) {
        return Integer.bitCount(i & IsNodeFlag);
    }

    public static final int propagatingFlagsOf(int i) {
        return ((i & IsMarkFlags) << 1) | ((-1476395008) & i);
    }

    public static final int utilitySlotsCountForFlags(int i) {
        return Integer.bitCount(i & UtilitySlotsMask);
    }

    public static final int groupFlagsChildNodeCount(int i, int i2) {
        return (i & (-8388608)) | i2;
    }
}
