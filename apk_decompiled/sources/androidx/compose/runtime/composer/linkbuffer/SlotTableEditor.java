package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.LinkComposerKt;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import defpackage.gy;
import defpackage.j50;
import defpackage.ky;
import defpackage.m10;
import defpackage.my;
import defpackage.o;
import defpackage.q10;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTableEditor {
    public static final int $stable = 8;
    private final SlotTableAddressSpace addressSpace;
    private int current;
    private boolean isClosed;
    private int parent = -1;
    private int previousSibling = -1;
    private final SlotTable table;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface VisitSlotsInRememberOrderCallback {
        boolean visit(int i, int i2, Object obj);
    }

    public SlotTableEditor(SlotTable slotTable) {
        this.table = slotTable;
        this.current = slotTable.getRoot();
        this.addressSpace = slotTable.getAddressSpace();
    }

    private final void forEachSlotInRangeIndexed(Object[] objArr, int i, my myVar) {
        if (i != -1) {
            SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
            int i2 = (i & 15) + 1;
            int i3 = i >> 4;
            if (i2 > 15) {
                i2 = slotTableAddressSpace.getLargeSizes().d(i3);
            }
            int i4 = i2 + i3;
            for (int i5 = i3; i5 < i4; i5++) {
                myVar.invoke(Integer.valueOf(i5 - i3), objArr[i5]);
            }
        }
    }

    private final void insertGroup(int i) {
        int i2 = this.previousSibling;
        int i3 = this.parent;
        int[] groups = this.addressSpace.getGroups();
        if (i2 != -1) {
            groups[i2 + 1] = i;
        } else if (i3 == -1) {
            this.table.setRoot(i);
        } else {
            groups[i3 + 3] = i;
        }
        groups[i + 2] = i3;
        groups[i + 1] = this.current;
        int i4 = groups[i + 4];
        int i5 = (i4 & GroupFlagsKt.IsNodeFlag) != 8388608 ? i4 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK : 1;
        this.current = i;
        propagateChanges(i, i5, 0, GroupFlagsKt.propagatingFlagsOf(i4), false);
    }

    public static /* synthetic */ long moveFrom$default(SlotTableEditor slotTableEditor, SlotTableEditor slotTableEditor2, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = -1;
        }
        return slotTableEditor.moveFrom(slotTableEditor2, j, j2);
    }

    private final void propagateChanges(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.addressSpace.getGroups();
        int i7 = groups2[i + 2];
        while (true) {
            if (i7 <= 0) {
                if (i7 != 0) {
                    return;
                }
                gy.h(i, "Traversing parent of group not in the slot table: ");
                return;
            }
            int i8 = i7 + 4;
            int i9 = groups[i8];
            if (i2 != 0) {
                i9 = (i9 & (-8388608)) | ((8388607 & i9) + i2);
                groups[i8] = i9;
                if ((i9 & GroupFlagsKt.IsNodeFlag) == 8388608) {
                    i2 = 0;
                }
            }
            if (i3 != 0) {
                int i10 = (i3 >> 1) | i3;
                int[] groups3 = this.addressSpace.getGroups();
                for (int i11 = groups3[i7 + 3]; i11 > 0; i11 = groups3[i11 + 1]) {
                    if ((z && i11 == i) || (groups[i11 + 4] & i10) == 0) {
                    }
                }
                i5 = i3;
                if ((i5 == 0 || i4 != 0) && (i6 = ((~i5) & i9) | i4) != i9) {
                    groups[i8] = i6;
                    i3 = i5;
                } else {
                    i4 = 0;
                }
                if (i2 != 0 && i3 == 0 && i4 == 0) {
                    return;
                } else {
                    i7 = groups2[i7 + 2];
                }
            }
            i5 = 0;
            if (i5 == 0) {
            }
            groups[i8] = i6;
            i3 = i5;
            if (i2 != 0) {
            }
            i7 = groups2[i7 + 2];
        }
    }

    public static /* synthetic */ void removeGroup$default(SlotTableEditor slotTableEditor, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        slotTableEditor.removeGroup(z);
    }

    public static /* synthetic */ void updateNode$default(SlotTableEditor slotTableEditor, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = slotTableEditor.getCurrentGroup();
        }
        slotTableEditor.updateNode(i, obj);
    }

    public final void addFlagsToAllGroupsIn(m10 m10Var, int i) {
        int[] iArr = m10Var.b;
        long[] jArr = m10Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        propagateChanges(iArr[(i2 << 3) + i4], 0, 0, i, false);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void appendSlot(Object obj) {
        int[] groups = this.addressSpace.getGroups();
        int i = this.parent;
        int i2 = groups[i + 5];
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (i2 == -1) {
            slotTableAddressSpace.writeSlot(i, 0, obj);
            return;
        }
        int i3 = (i2 & 15) + 1;
        int i4 = i2 >> 4;
        if (i3 > 15) {
            i3 = slotTableAddressSpace.getLargeSizes().d(i4);
        }
        this.addressSpace.writeSlot(i, i3, obj);
    }

    public final void bashGroup$runtime(int i) {
        this.addressSpace.getGroups()[getCurrentGroup()] = i;
    }

    public final SlotTable buildInsertTable(ky kyVar) {
        SlotTable.Companion companion = SlotTable.Companion;
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(getAddressSpace$runtime(), false, false);
        slotTableBuilder.buildStart();
        kyVar.invoke(slotTableBuilder);
        return slotTableBuilder.build();
    }

    public final void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.table.closeEditor(this);
    }

    public final boolean containsHandle(long j) {
        int group = GroupHandleKt.getGroup(j);
        if (group == -1) {
            group = GroupHandleKt.getContext(j);
        }
        if (group == -1) {
            return false;
        }
        int root = this.table.getRoot();
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.addressSpace.getGroups();
        int i = group;
        while (true) {
            if (i <= 0) {
                if (!(i != 0)) {
                    gy.h(group, "Traversing parent of group not in the slot table: ");
                }
                return false;
            }
            if (i == root) {
                return true;
            }
            if (i <= 0) {
                return false;
            }
            int i2 = i + 2;
            if (groups[i2] == -1) {
                int[] groups3 = this.addressSpace.getGroups();
                for (int i3 = root; i3 >= 0; i3 = groups3[i3 + 1]) {
                    if (i3 == i) {
                        return true;
                    }
                }
            }
            i = groups2[i2];
        }
    }

    public final void endGroup() {
        int i = this.parent;
        int[] groups = this.addressSpace.getGroups();
        if (i + 6 > groups.length) {
            return;
        }
        int i2 = groups[i + 1];
        this.parent = groups[i + 2];
        this.previousSibling = i;
        this.current = i2;
    }

    public final int firstChildOf(int i) {
        return this.addressSpace.getGroups()[i + 3];
    }

    public final int flagsOf(int i) {
        return this.addressSpace.getGroups()[i + 4];
    }

    public final SlotTableAddressSpace getAddressSpace$runtime() {
        return this.addressSpace;
    }

    public final int getCurrentGroup() {
        return this.current;
    }

    public final int getGroupKey() {
        return this.addressSpace.getGroups()[this.current];
    }

    public final Object getNode() {
        return node(this.current);
    }

    public final Object getObjectKey() {
        return objectKey(this.current);
    }

    public final int getParentGroup() {
        return this.parent;
    }

    public final int getPreviousSibling() {
        return this.previousSibling;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int groupKey(int i) {
        return this.addressSpace.getGroups()[i];
    }

    public final long handle() {
        return (this.previousSibling << 32) | (this.current & 4294967295L);
    }

    public final void insertGroupFrom(SlotTable slotTable, long j) {
        if (!q10.b(slotTable.getAddressSpace(), this.table.getAddressSpace())) {
            o.m("Cannot insert a group from an unrelated table");
            return;
        }
        SlotTableEditor openEditor = slotTable.openEditor();
        try {
            openEditor.seek(j);
            openEditor.removeGroup(false);
            openEditor.close();
            insertGroup(GroupHandleKt.getGroup(j));
        } catch (Throwable th) {
            openEditor.close();
            throw th;
        }
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public final boolean isEmpty() {
        return this.table.isEmpty();
    }

    public final boolean isGroupEnd() {
        return this.current == -1;
    }

    public final boolean isNode() {
        return (this.addressSpace.getGroups()[this.current + 4] & GroupFlagsKt.IsNodeFlag) == 8388608;
    }

    public final boolean isParentGroupANode() {
        return (this.addressSpace.getGroups()[this.parent + 4] & GroupFlagsKt.IsNodeFlag) == 8388608;
    }

    public final long moveFrom(SlotTableEditor slotTableEditor, long j, long j2) {
        int group;
        long j3;
        slotTableEditor.seek(j);
        if (q10.b(slotTableEditor.addressSpace, this.addressSpace)) {
            group = GroupHandleKt.getGroup(j);
            slotTableEditor.removeGroup(false);
        } else {
            group = this.addressSpace.copyTreeFrom(slotTableEditor.addressSpace, GroupHandleKt.getGroup(j));
            slotTableEditor.removeGroup(true);
        }
        if (j2 != -1) {
            j3 = handle();
            seek(j2);
        } else {
            j3 = -1;
        }
        int i = this.previousSibling;
        insertGroup(group);
        this.previousSibling = i;
        this.current = group;
        long j4 = (i << 32) | (group & 4294967295L);
        if (j3 != -1) {
            seek(j3);
        }
        if (this.table.getRecordSourceInformation()) {
            this.addressSpace.recordMovedSourceInformation(group, i);
        }
        return j4;
    }

    public final void moveGroup(long j) {
        int i = this.current;
        int i2 = this.previousSibling;
        int group = GroupHandleKt.getGroup(j);
        int context = GroupHandleKt.getContext(j);
        int[] groups = this.addressSpace.getGroups();
        int i3 = this.parent;
        if ((context == -1 && groups[i3 + 3] != group) || (context != -1 && groups[context + 1] != group)) {
            context = i;
            while (context != -1) {
                int i4 = groups[context + 1];
                if (i4 == group) {
                    break;
                } else {
                    context = i4;
                }
            }
            if (context == -1) {
                throw new IllegalStateException(r6.b("Could not find the group previous to current(", i, ')').toString());
            }
        }
        int i5 = group + 1;
        groups[context + 1] = groups[i5];
        groups[i5] = i;
        if (i2 == -1) {
            groups[i3 + 3] = group;
        } else {
            groups[i2 + 1] = group;
        }
        this.current = group;
    }

    public final Object node(int i) {
        int[] groups = this.addressSpace.getGroups();
        if ((groups[i + 4] & GroupFlagsKt.IsNodeFlag) == 8388608) {
            return this.addressSpace.getSlots()[groups[i + 5] >> 4];
        }
        return null;
    }

    public final int nodeCountOf(int i) {
        int i2 = this.addressSpace.getGroups()[i + 4];
        if ((i2 & GroupFlagsKt.IsNodeFlag) == 8388608) {
            return 1;
        }
        return i2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final Object objectKey(int i) {
        int[] groups = this.addressSpace.getGroups();
        int i2 = groups[i + 4];
        if ((i2 & GroupFlagsKt.HasObjectKeyFlag) != 16777216) {
            return Composer.Companion.getEmpty();
        }
        return this.addressSpace.getSlots()[Integer.bitCount(8388608 & i2) + (groups[i + 5] >> 4)];
    }

    public final int parentGroup(int i) {
        return this.addressSpace.getGroups()[i + 2];
    }

    public final int parentOf(int i) {
        return this.addressSpace.getGroups()[i + 2];
    }

    public final void removeAllInstancesOfFlags(int i) {
        boolean z;
        int propagatingFlagsOf = i | GroupFlagsKt.propagatingFlagsOf(i);
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        int root = this.table.getRoot();
        if (root < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups2 = slotTableAddressSpace.getGroups();
        while (true) {
            int i2 = root + 4;
            int i3 = groups[i2];
            if ((propagatingFlagsOf & i3) == 0) {
                z = false;
            } else {
                groups[i2] = i3 & (~propagatingFlagsOf);
                z = true;
            }
            int i4 = groups2[root + 1];
            if (i4 >= 0) {
                intStack.push(i4);
            }
            root = groups2[root + 3];
            if (!z || root < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    root = intStack.pop();
                }
            }
        }
    }

    public final void removeGroup(boolean z) {
        int[] groups = this.addressSpace.getGroups();
        int i = this.current;
        int i2 = groups[i + 4];
        propagateChanges(i, -((i2 & GroupFlagsKt.IsNodeFlag) == 8388608 ? 1 : 8388607 & i2), GroupFlagsKt.propagatingFlagsOf(i2), 0, true);
        int i3 = groups[i + 1];
        int i4 = this.previousSibling;
        if (i4 == -1) {
            int i5 = this.parent;
            if (i5 == -1) {
                this.table.setRoot(i3);
            } else {
                groups[i5 + 3] = i3;
            }
        } else {
            groups[i4 + 1] = i3;
        }
        if (z) {
            this.addressSpace.freeGroupTree(i);
        }
        this.current = i3;
    }

    public final void reset() {
        this.parent = -1;
        this.previousSibling = -1;
        this.current = this.table.getRoot();
    }

    public final void seek(long j) {
        containsHandle(j);
        int context = GroupHandleKt.getContext(j);
        int[] groups = this.addressSpace.getGroups();
        int group = GroupHandleKt.getGroup(j);
        int i = group == -1 ? context : groups[group + 2];
        if (group == -1) {
            context = -1;
        }
        this.parent = i;
        this.current = group;
        if (context != -1 ? groups[context + 1] != group : !(i != -1 ? groups[i + 3] == group : this.table.getRoot() == group)) {
            int[] groups2 = this.addressSpace.getGroups();
            int i2 = -1;
            for (int root = i == -1 ? this.table.getRoot() : groups[i + 3]; root >= 0 && root != group; root = groups2[root + 1]) {
                i2 = root;
            }
            context = i2;
        }
        if (context != -1) {
            int i3 = groups[context + 1];
        } else if (i == -1) {
            this.table.getRoot();
        } else {
            int i4 = groups[i + 3];
        }
        this.previousSibling = context;
    }

    public final Object setAbsolute(int i, Object obj) {
        Object[] slots = this.addressSpace.getSlots();
        if (i >= 0) {
            int length = slots.length;
        }
        Object obj2 = slots[i];
        slots[i] = obj;
        return obj2;
    }

    public final Object setRelative(int i, Object obj) {
        return setAbsolute((this.addressSpace.getGroups()[this.parent + 5] >> 4) + i, obj);
    }

    public final int skipGroup() {
        int i = this.current;
        if (i == -1) {
            o.f("Skipping past the end of a group");
            return 0;
        }
        this.previousSibling = i;
        this.current = this.addressSpace.getGroups()[i + 1];
        int i2 = this.addressSpace.getGroups()[i + 4];
        if ((i2 & GroupFlagsKt.IsNodeFlag) == 8388608) {
            return 1;
        }
        return i2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final void skipToGroupEnd() {
        int i = this.current;
        if (i != -1) {
            int i2 = this.previousSibling;
            int[] groups = this.addressSpace.getGroups();
            while (i != -1) {
                i2 = i;
                i = groups[i + 1];
            }
            this.previousSibling = i2;
            this.current = -1;
        }
    }

    public final void startGroup() {
        int i = this.current;
        if (!(i > 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a group because current does not refer to a child of a group");
        }
        this.parent = i;
        int[] groups = this.addressSpace.getGroups();
        if (i + 6 > groups.length) {
            return;
        }
        this.current = groups[i + 3];
        this.previousSibling = -1;
    }

    public final void trimSlots(int i) {
        int i2;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int i3 = this.parent;
        int[] groups = slotTableAddressSpace.getGroups();
        int i4 = groups[i3 + 5];
        if (i4 == -1) {
            i2 = 0;
        } else {
            i2 = (i4 & 15) + 1;
            if (i2 > 15) {
                i2 = slotTableAddressSpace.getLargeSizes().d(i4 >> 4);
            }
        }
        int i5 = i2 - i;
        if (!(i5 >= GroupFlagsKt.utilitySlotsCountForFlags(groups[i3 + 4]))) {
            ComposerKt.composeImmediateRuntimeError("Attempted to trim more slots than the group has");
        }
        slotTableAddressSpace.resizeSlotRangeAtGroup(i3, i5);
    }

    public final void updateAux(Object obj) {
        int[] groups = this.addressSpace.getGroups();
        int i = this.current;
        int i2 = groups[i + 4];
        this.addressSpace.getSlots()[Integer.bitCount(25165824 & i2) + (groups[i + 5] >> 4)] = obj;
    }

    public final void updateNode(int i, Object obj) {
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        Object[] slots = slotTableAddressSpace.getSlots();
        int i2 = groups[i + 4];
        slots[groups[i + 5] >> 4] = obj;
    }

    public final void updateParentNode(Object obj) {
        int[] groups = this.addressSpace.getGroups();
        int i = this.parent;
        int i2 = groups[i + 4];
        this.addressSpace.getSlots()[groups[i + 5] >> 4] = obj;
    }

    public final void visitSlotsInRememberOrder(int i, VisitSlotsInRememberOrderCallback visitSlotsInRememberOrderCallback) {
        if (i < 0) {
            return;
        }
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        int i2 = groups[i + 5];
        int i3 = -1;
        if (i2 != -1) {
            SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
            int i4 = (i2 & 15) + 1;
            int i5 = i2 >> 4;
            if (i4 > 15) {
                i4 = slotTableAddressSpace.getLargeSizes().d(i5);
            }
            int i6 = i4 + i5;
            for (int i7 = i5; i7 < i6; i7++) {
                int i8 = i7 - i5;
                Object obj = slots[i7];
                if (obj instanceof RememberObserverHolder) {
                    int address = LinkComposerKt.asLinkRememberObserverHolder((RememberObserverHolder) obj).getAfter().getAddress();
                    while (i3 != address) {
                        i3 = i3 < 0 ? groups[i + 3] : groups[i3 + 1];
                        if (i3 < 0) {
                            ComposerKt.composeImmediateRuntimeError("A RememberObserver cannot be forgotten correctly because its group ordering metadata is inconsistent with the rest of the SlotTable");
                        }
                        visitSlotsInRememberOrder(i3, visitSlotsInRememberOrderCallback);
                    }
                }
                if (visitSlotsInRememberOrderCallback.visit(i, i8, obj)) {
                    slots[i8 + i5] = Composer.Companion.getEmpty();
                }
            }
        }
        for (int i9 = i3 < 0 ? groups[i + 3] : groups[i3 + 1]; i9 >= 0; i9 = groups[i9 + 1]) {
            visitSlotsInRememberOrder(i9, visitSlotsInRememberOrderCallback);
        }
    }

    public final void visitTailSlotsInRememberOrder$runtime(int i, int i2, int i3, VisitSlotsInRememberOrderCallback visitSlotsInRememberOrderCallback) {
        int i4;
        if (i < 0) {
            return;
        }
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        int i5 = groups[i + 5];
        int i6 = i5 >> 4;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int i7 = -1;
        if (i5 == -1) {
            i4 = 0;
        } else {
            i4 = (i5 & 15) + 1;
            if (i4 > 15) {
                i4 = slotTableAddressSpace.getLargeSizes().d(i6);
            }
        }
        int i8 = (i4 + i6) - i3;
        int i9 = i8 + i3;
        boolean z = false;
        for (int i10 = i8; i10 < i9; i10++) {
            int i11 = i10 - i8;
            Object obj = slots[i10];
            if (obj instanceof RememberObserverHolder) {
                int address = LinkComposerKt.asLinkRememberObserverHolder((RememberObserverHolder) obj).getAfter().getAddress();
                while (i7 != address) {
                    i7 = i7 < 0 ? groups[i + 3] : groups[i7 + 1];
                    if (i7 < 0) {
                        ComposerKt.composeImmediateRuntimeError("A RememberObserver cannot be forgotten correctly because its group ordering metadata is inconsistent with the rest of the SlotTable");
                    }
                    z |= i2 == i7;
                    if (z) {
                        visitSlotsInRememberOrder(i7, visitSlotsInRememberOrderCallback);
                    }
                }
            }
            if (visitSlotsInRememberOrderCallback.visit(i, i11, obj)) {
                slots[i11 + i6] = Composer.Companion.getEmpty();
            }
        }
        int i12 = i7 < 0 ? groups[i + 3] : groups[i7 + 1];
        while (i12 >= 0) {
            z |= i2 == i12;
            if (z) {
                visitSlotsInRememberOrder(i12, visitSlotsInRememberOrderCallback);
            }
            i12 = groups[i12 + 1];
        }
    }

    public static /* synthetic */ void moveFrom$default(SlotTableEditor slotTableEditor, SlotTable slotTable, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = -1;
        }
        slotTableEditor.moveFrom(slotTable, j, j2);
    }

    public final boolean isNode(int i) {
        return (flagsOf(i) & GroupFlagsKt.IsNodeFlag) == 8388608;
    }

    private final void forEachSlotInRangeIndexed(Object[] objArr, int i, int i2, my myVar) {
        for (int i3 = i; i3 < i2; i3++) {
            myVar.invoke(Integer.valueOf(i3 - i), objArr[i3]);
        }
    }

    public final void moveGroup(int i) {
        if (i == 0) {
            return;
        }
        int i2 = this.current;
        int i3 = this.previousSibling;
        int[] groups = this.addressSpace.getGroups();
        int i4 = 0;
        int i5 = i2;
        int i6 = i3;
        while (i4 < i) {
            int i7 = groups[i5 + 1];
            if (i7 == -1) {
                throw new IllegalStateException(j50.i(i, "Offset(", ") too large").toString());
            }
            i4++;
            i6 = i5;
            i5 = i7;
        }
        int i8 = i5 + 1;
        groups[i6 + 1] = groups[i8];
        groups[i8] = i2;
        if (i3 == -1) {
            groups[this.parent + 3] = i5;
        } else {
            groups[i3 + 1] = i5;
        }
        this.current = i5;
    }

    public final void moveFrom(SlotTable slotTable, long j, long j2) {
        SlotTableEditor openEditor = slotTable.openEditor();
        try {
            moveFrom(openEditor, j, j2);
        } finally {
            openEditor.close();
        }
    }

    public final void seek(LinkAnchor linkAnchor) {
        seek(linkAnchor.getAddress() & 4294967295L);
    }
}
