package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTableBuilderKt {
    public static final List<ComposeStackTraceFrame> buildTrace(SlotTableBuilder slotTableBuilder) {
        return (slotTableBuilder.isClosed() || slotTableBuilder.isEmpty()) ? ut.d : SlotTableAddresSpaceKt.buildTrace(slotTableBuilder.getTable().getAddressSpace(), slotTableBuilder.getParentGroup(), Integer.valueOf(slotTableBuilder.getSlotIndex()), new BuilderTraceBuilder(slotTableBuilder));
    }

    public static final boolean contains(int i, int i2) {
        return (i & i2) == i2;
    }

    private static final int lastSiblingOf(int i, SlotTableAddressSpace slotTableAddressSpace) {
        int i2 = -1;
        if (i == -1) {
            return -1;
        }
        int[] groups = slotTableAddressSpace.getGroups();
        while (i >= 0) {
            i2 = i;
            i = groups[i + 1];
        }
        return i2;
    }
}
