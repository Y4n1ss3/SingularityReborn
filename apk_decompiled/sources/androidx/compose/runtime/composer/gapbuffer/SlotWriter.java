package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import defpackage.ac;
import defpackage.dq;
import defpackage.j50;
import defpackage.k10;
import defpackage.ky;
import defpackage.ma0;
import defpackage.my;
import defpackage.n10;
import defpackage.na0;
import defpackage.oa0;
import defpackage.q10;
import defpackage.ut;
import defpackage.xa0;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotWriter {
    private ArrayList<GapAnchor> anchors;
    private na0 calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private na0 deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private ma0 pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<GapAnchor, GapGroupSourceInformation> sourceInformationMap;
    private final SlotTable table;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.m3964getSlots();
        this.anchors = slotTable.getAnchors$runtime();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime();
        this.calledByMap = slotTable.getCalledByMap$runtime();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static /* synthetic */ GapAnchor anchor$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    private final int auxIndex(int[] iArr, int i) {
        return Integer.bitCount(iArr[(i * 5) + 1] >> 29) + dataIndex(iArr, i);
    }

    private final boolean childContainsAnyMarks(int i) {
        int i2 = i + 1;
        int groupSize = groupSize(i) + i;
        while (i2 < groupSize) {
            if ((this.groups[(groupIndexToAddress(i2) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            i2 += groupSize(i2);
        }
        return false;
    }

    private final int childGroupAtIndex(int i, int i2) {
        int groupSize;
        int groupSize2 = groupSize(i) + i;
        int i3 = i + 1;
        int i4 = 0;
        while (i3 < groupSize2 && i4 < i2) {
            int groupIndexToAddress = groupIndexToAddress(i3);
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
            i3 += groupSize;
            if (i3 < groupSize2 && (this.groups[(groupIndexToAddress * 5) + 1] & GroupFlagsKt.HasMovableContentFlag) == 0) {
                i4++;
            }
        }
        return i3;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        ac.X(this.slots, i, this.slotsGapLen + i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int i) {
        return i >= 0 && (this.groups[(groupIndexToAddress(i) * 5) + 1] & 201326592) != 0;
    }

    private final boolean containsGroupMark(int i) {
        return i >= 0 && (this.groups[(groupIndexToAddress(i) * 5) + 1] & GroupFlagsKt.IsRecompositionRequiredFlag) != 0;
    }

    private final int dataAnchorToDataIndex(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i) {
        return (this.slotsGapLen * (i < this.slotsGapStart ? 0 : 1)) + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        k10 W = y80.W(0, this.groupGapStart);
        dataAnchors$default.getClass();
        W.getClass();
        boolean isEmpty = W.isEmpty();
        List list = ut.d;
        List I0 = isEmpty ? list : yi.I0(dataAnchors$default.subList(W.d, W.e + 1));
        k10 W2 = y80.W(this.groupGapStart + this.groupGapLen, iArr.length / 5);
        W2.getClass();
        if (!W2.isEmpty()) {
            list = yi.I0(dataAnchors$default.subList(W2.d, W2.e + 1));
        }
        ArrayList A0 = yi.A0(I0, list);
        ArrayList arrayList = new ArrayList(A0.size());
        int size = A0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) A0.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i, int i2, int i3) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i, this.groupGapStart);
        while (i3 < i2) {
            this.groups[(groupIndexToAddress(i3) * 5) + 2] = parentIndexToAnchor;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i3));
            int i4 = groupSize + i3;
            fixParentAnchorsFor(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int getCurrentGroupSlotIndex() {
        return groupSlotIndex(this.parent);
    }

    private final void groupAsString(StringBuilder sb, int i) {
        int groupSize;
        String summarize;
        String summarize2;
        int groupIndexToAddress = groupIndexToAddress(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (groupIndexToAddress != i) {
            sb.append("(");
            sb.append(groupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb.append(groupSize);
        sb.append('^');
        int i2 = groupIndexToAddress * 5;
        int i3 = i2 + 2;
        sb.append(parentAnchorToIndex(this.groups[i3]));
        sb.append(": key=");
        sb.append(this.groups[i2]);
        sb.append(", nodes=");
        int i4 = i2 + 1;
        sb.append(this.groups[i4] & 67108863);
        sb.append(", dataAnchor=");
        sb.append(this.groups[i2 + 4]);
        sb.append(", parentAnchor=");
        sb.append(this.groups[i3]);
        if ((this.groups[i4] & GroupFlagsKt.IsSubcompositionContextFlag) != 0) {
            StringBuilder sb2 = new StringBuilder(", node=");
            summarize2 = SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]), 10);
            sb2.append(summarize2);
            sb.append(sb2.toString());
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        if (dataIndex > slotIndex) {
            sb.append(", [");
            for (int i5 = slotIndex; i5 < dataIndex; i5++) {
                if (i5 != slotIndex) {
                    sb.append(", ");
                }
                summarize = SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(i5)]), 10);
                sb.append(summarize);
            }
            sb.append(']');
        }
        sb.append(")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int i) {
        return (this.groupGapLen * (i < this.groupGapStart ? 0 : 1)) + i;
    }

    private final GapGroupSourceInformation groupSourceInformationFor(int i, String str) {
        int groupSize;
        HashMap<GapAnchor, GapGroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null) {
            return null;
        }
        GapAnchor anchor = anchor(i);
        GapGroupSourceInformation gapGroupSourceInformation = hashMap.get(anchor);
        if (gapGroupSourceInformation == null) {
            gapGroupSourceInformation = new GapGroupSourceInformation(0, str, 0);
            if (str == null) {
                int i2 = i + 1;
                int i3 = this.currentGroup;
                while (i2 < i3) {
                    gapGroupSourceInformation.reportGroup(this, i2);
                    groupSize = SlotTableKt.groupSize(this.groups, i2);
                    i2 += groupSize;
                }
            }
            hashMap.put(anchor, gapGroupSourceInformation);
        }
        return gapGroupSourceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int i) {
        if (i > 0) {
            int i2 = this.currentGroup;
            moveGroupGapTo(i2);
            int i3 = this.groupGapStart;
            int i4 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                ac.O(iArr, iArr2, 0, 0, i3 * 5);
                ac.O(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.groups = iArr2;
                i4 = i6;
            }
            int i7 = this.currentGroupEnd;
            if (i7 >= i3) {
                this.currentGroupEnd = i7 + i;
            }
            int i8 = i3 + i;
            this.groupGapStart = i8;
            this.groupGapLen = i4 - i;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i5 > 0 ? dataIndex(i2 + i) : 0, this.slotsGapOwner >= i3 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.groups[(i9 * 5) + 4] = dataIndexToDataAnchor;
            }
            int i10 = this.slotsGapOwner;
            if (i10 >= i3) {
                this.slotsGapOwner = i10 + i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int i, int i2) {
        if (i > 0) {
            moveSlotGapTo(this.currentSlot, i2);
            int i3 = this.slotsGapStart;
            int i4 = this.slotsGapLen;
            if (i4 < i) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.slots = objArr2;
                i4 = i7;
            }
            int i9 = this.currentSlotEnd;
            if (i9 >= i3) {
                this.currentSlotEnd = i9 + i;
            }
            this.slotsGapStart = i3 + i;
            this.slotsGapLen = i4 - i;
        }
    }

    private final List<Integer> keys() {
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        for (int i = 0; i < size; i++) {
            Object obj = keys$default.get(i);
            ((Number) obj).intValue();
            int i2 = this.groupGapStart;
            if (i < i2 || i >= i2 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    private final void moveAnchors(int i, int i2, int i3) {
        int locationOf;
        int locationOf2;
        GapAnchor gapAnchor;
        int anchorIndex;
        int i4 = i3 + i;
        int size$runtime = getSize$runtime();
        locationOf = SlotTableKt.locationOf(this.anchors, i, size$runtime);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size() && (anchorIndex = anchorIndex((gapAnchor = this.anchors.get(locationOf)))) >= i && anchorIndex < i4) {
                arrayList.add(gapAnchor);
                this.anchors.remove(locationOf);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            GapAnchor gapAnchor2 = (GapAnchor) arrayList.get(i6);
            int anchorIndex2 = anchorIndex(gapAnchor2) + i5;
            if (anchorIndex2 >= this.groupGapStart) {
                gapAnchor2.setLocation$runtime(-(size$runtime - anchorIndex2));
            } else {
                gapAnchor2.setLocation$runtime(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime);
            this.anchors.add(locationOf2, gapAnchor2);
        }
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return slotWriter.moveFrom(slotTable, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int i) {
        int i2 = this.groupGapLen;
        int i3 = this.groupGapStart;
        if (i3 != i) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.groups;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    ac.O(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    ac.O(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int capacity = getCapacity();
            if (i3 >= capacity) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i3 < capacity) {
                int i7 = (i3 * 5) + 2;
                int i8 = this.groups[i7];
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i8), i);
                if (parentIndexToAnchor != i8) {
                    this.groups[i7] = parentIndexToAnchor;
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.groupGapStart = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int i, int i2) {
        int i3 = this.slotsGapLen;
        int i4 = this.slotsGapStart;
        int i5 = this.slotsGapOwner;
        if (i4 != i) {
            Object[] objArr = this.slots;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, getSize$runtime());
        if (i5 != min) {
            int length = this.slots.length - i3;
            if (min < i5) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i5);
                int i7 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    int i8 = (groupIndexToAddress * 5) + 4;
                    int i9 = this.groups[i8];
                    if (!(i9 >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i8] = -((length - i9) + 1);
                    groupIndexToAddress++;
                    if (groupIndexToAddress == i7) {
                        groupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i5);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    int i10 = (groupIndexToAddress3 * 5) + 4;
                    int i11 = this.groups[i10];
                    if (!(i11 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i10] = i11 + length + 1;
                    groupIndexToAddress3++;
                    if (groupIndexToAddress3 == this.groupGapStart) {
                        groupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i;
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int parentAnchorToIndex(int i) {
        return i > -2 ? i : (getSize$runtime() + i) - (-2);
    }

    private final int parentIndexToAnchor(int i, int i2) {
        return i < i2 ? i : -((getSize$runtime() - i) + 2);
    }

    private final Object rawUpdate(Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    private final void recalculateMarks() {
        ma0 ma0Var = this.pendingRecalculateMarks;
        if (ma0Var != null) {
            while (PrioritySet.m3958isNotEmptyimpl(ma0Var)) {
                m3965updateContainsMarkNowqrM0pCk(PrioritySet.m3960takeMaximpl(ma0Var), ma0Var);
            }
        }
    }

    private final boolean removeAnchors(int i, int i2, HashMap<GapAnchor, GapGroupSourceInformation> hashMap) {
        int locationOf;
        int i3 = i2 + i;
        locationOf = SlotTableKt.locationOf(this.anchors, i3, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i4 = locationOf + 1;
        int i5 = 0;
        while (locationOf >= 0) {
            GapAnchor gapAnchor = this.anchors.get(locationOf);
            int anchorIndex = anchorIndex(gapAnchor);
            if (anchorIndex < i) {
                break;
            }
            if (anchorIndex < i3) {
                gapAnchor.setLocation$runtime(Integer.MIN_VALUE);
                if (hashMap != null) {
                    hashMap.remove(gapAnchor);
                }
                if (i5 == 0) {
                    i5 = locationOf + 1;
                }
                i4 = locationOf;
            }
            locationOf--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.anchors.subList(i4, i5).clear();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int i, int i2) {
        if (i2 > 0) {
            ArrayList<GapAnchor> arrayList = this.anchors;
            moveGroupGapTo(i);
            r0 = arrayList.isEmpty() ? false : removeAnchors(i, i2, this.sourceInformationMap);
            this.groupGapStart = i;
            this.groupGapLen += i2;
            int i3 = this.slotsGapOwner;
            if (i3 > i) {
                this.slotsGapOwner = Math.max(i, i3 - i2);
            }
            int i4 = this.currentGroupEnd;
            if (i4 >= this.groupGapStart) {
                this.currentGroupEnd = i4 - i2;
            }
            int i5 = this.parent;
            if (containsGroupMark(i5)) {
                updateContainsMark(i5);
            }
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.slotsGapLen;
            int i5 = i + i2;
            moveSlotGapTo(i5, i3);
            this.slotsGapStart = i;
            this.slotsGapLen = i4 + i2;
            ac.X(this.slots, i, i5, null);
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 - i2;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i) {
        int slotAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        slotAnchor = SlotTableKt.slotAnchor(iArr, i);
        return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void startGroup(int i, Object obj, boolean z, Object obj2) {
        int groupSize;
        int i2;
        GapGroupSourceInformation sourceInformationOf$runtime;
        int i3 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr == true) {
            int i4 = this.currentGroup;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i4));
            insertGroups(1);
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            int groupIndexToAddress = groupIndexToAddress(i4);
            Composer.Companion companion = Composer.Companion;
            ?? r12 = obj != companion.getEmpty() ? 1 : 0;
            ?? r13 = (z || obj2 == companion.getEmpty()) ? 0 : 1;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(dataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (dataIndexToDataAnchor >= 0 && this.slotsGapOwner < i4) {
                dataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - dataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i, z, r12, r13, this.parent, dataIndexToDataAnchor);
            int i5 = (z ? 1 : 0) + r12 + r13;
            if (i5 > 0) {
                insertSlots(i5, i4);
                Object[] objArr2 = this.slots;
                int i6 = this.currentSlot;
                if (z) {
                    objArr2[i6] = obj2;
                    i6++;
                }
                if (r12 != 0) {
                    objArr2[i6] = obj;
                    i6++;
                }
                if (r13 != 0) {
                    objArr2[i6] = obj2;
                    i6++;
                }
                this.currentSlot = i6;
            }
            this.nodeCount = 0;
            i2 = i4 + 1;
            this.parent = i4;
            this.currentGroup = i2;
            if (i3 >= 0 && (sourceInformationOf$runtime = sourceInformationOf$runtime(i3)) != null) {
                sourceInformationOf$runtime.reportGroup(this, i4);
            }
        } else {
            this.startStack.push(i3);
            saveCurrentGroupEnd();
            int i7 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i7);
            if (!q10.b(obj2, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(groupIndexToAddress2 * 5) + 1] & 67108863;
            this.parent = i7;
            this.currentGroup = i7 + 1;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress2);
            i2 = i7 + groupSize;
        }
        this.currentGroupEnd = i2;
    }

    private final void updateAnchors(int i, int i2) {
        int locationOf;
        GapAnchor gapAnchor;
        int location$runtime;
        int locationOf2;
        GapAnchor gapAnchor2;
        int location$runtime2;
        int i3;
        int capacity = getCapacity() - this.groupGapLen;
        ArrayList<GapAnchor> arrayList = this.anchors;
        if (i >= i2) {
            for (locationOf = SlotTableKt.locationOf(arrayList, i2, capacity); locationOf < this.anchors.size() && (location$runtime = (gapAnchor = this.anchors.get(locationOf)).getLocation$runtime()) >= 0; locationOf++) {
                gapAnchor.setLocation$runtime(-(capacity - location$runtime));
            }
            return;
        }
        for (locationOf2 = SlotTableKt.locationOf(arrayList, i, capacity); locationOf2 < this.anchors.size() && (location$runtime2 = (gapAnchor2 = this.anchors.get(locationOf2)).getLocation$runtime()) < 0 && (i3 = location$runtime2 + capacity) < i2; locationOf2++) {
            gapAnchor2.setLocation$runtime(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int i) {
        if (i >= 0) {
            ma0 ma0Var = this.pendingRecalculateMarks;
            if (ma0Var == null) {
                ma0Var = PrioritySet.m3953constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = ma0Var;
            }
            PrioritySet.m3950addimpl(ma0Var, i);
        }
    }

    /* renamed from: updateContainsMarkNow-qrM0pCk, reason: not valid java name */
    private final void m3965updateContainsMarkNowqrM0pCk(int i, ma0 ma0Var) {
        int groupIndexToAddress = groupIndexToAddress(i);
        boolean childContainsAnyMarks = childContainsAnyMarks(i);
        int[] iArr = this.groups;
        if (((iArr[(groupIndexToAddress * 5) + 1] & GroupFlagsKt.IsRecompositionRequiredFlag) != 0) != childContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(i);
            if (parent >= 0) {
                PrioritySet.m3950addimpl(ma0Var, parent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt.IsSubcompositionContextFlag) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateNodeOfGroup(int i, Object obj) {
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        boolean z = groupIndexToAddress < iArr.length;
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))] = obj;
    }

    public final void advanceBy(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.currentGroup + i;
        if (i2 >= this.parent && i2 <= this.currentGroupEnd) {
            z = true;
        }
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i2;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
    }

    public final GapAnchor anchor(int i) {
        ArrayList<GapAnchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i, getSize$runtime());
        if (search >= 0) {
            return arrayList.get(search);
        }
        if (i > this.groupGapStart) {
            i = -(getSize$runtime() - i);
        }
        GapAnchor gapAnchor = new GapAnchor(i);
        arrayList.add(-(search + 1), gapAnchor);
        return gapAnchor;
    }

    public final int anchorIndex(GapAnchor gapAnchor) {
        int location$runtime = gapAnchor.getLocation$runtime();
        return location$runtime < 0 ? getSize$runtime() + location$runtime : location$runtime;
    }

    public final void appendSlot(GapAnchor gapAnchor, Object obj) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i = this.currentSlot;
        int i2 = this.currentSlotEnd;
        int anchorIndex = anchorIndex(gapAnchor);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(anchorIndex + 1));
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
        insertSlots(1, anchorIndex);
        if (i >= dataIndex) {
            i++;
            i2++;
        }
        this.slots[dataIndex] = obj;
        this.currentSlot = i;
        this.currentSlotEnd = i2;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final Object clear(int i) {
        int dataIndexToDataAddress = dataIndexToDataAddress(i);
        Object[] objArr = this.slots;
        Object obj = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = Composer.Companion.getEmpty();
        return obj;
    }

    public final void close(boolean z) {
        this.closed = true;
        if (z && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int endGroup() {
        int groupSize;
        int groupSize2;
        xa0 xa0Var;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        int i6 = (groupIndexToAddress * 5) + 1;
        boolean z2 = (this.groups[i6] & GroupFlagsKt.IsSubcompositionContextFlag) != 0;
        if (z) {
            na0 na0Var = this.deferredSlotWrites;
            if (na0Var != null && (xa0Var = (xa0) na0Var.b(i3)) != null) {
                Object[] objArr = xa0Var.a;
                int i7 = xa0Var.b;
                for (int i8 = 0; i8 < i7; i8++) {
                    rawUpdate(objArr[i8]);
                }
            }
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i5);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
            this.nodeCount = this.nodeCountStack.pop() + (z2 ? 1 : i4);
            int parent = parent(this.groups, i3);
            this.parent = parent;
            int size$runtime = parent < 0 ? getSize$runtime() : groupIndexToAddress(parent + 1);
            int dataIndex = size$runtime >= 0 ? dataIndex(this.groups, size$runtime) : 0;
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            return i4;
        }
        if (!(i == i2)) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int[] iArr = this.groups;
        int i9 = iArr[i6] & 67108863;
        SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, i5);
        SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
        int pop = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = pop;
        int parent2 = parent(this.groups, i3);
        int pop2 = this.nodeCountStack.pop();
        this.nodeCount = pop2;
        if (parent2 == pop) {
            this.nodeCount = pop2 + (z2 ? 0 : i4 - i9);
            return i4;
        }
        int i10 = i5 - groupSize;
        int i11 = z2 ? 0 : i4 - i9;
        if (i10 != 0 || i11 != 0) {
            while (parent2 != 0 && parent2 != pop && (i11 != 0 || i10 != 0)) {
                int groupIndexToAddress2 = groupIndexToAddress(parent2);
                if (i10 != 0) {
                    groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                    SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i10);
                }
                if (i11 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress2, (iArr2[(groupIndexToAddress2 * 5) + 1] & 67108863) + i11);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(groupIndexToAddress2 * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0) {
                    i11 = 0;
                }
                parent2 = parent(iArr3, parent2);
            }
        }
        this.nodeCount += i11;
        return i4;
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i = this.insertCount - 1;
        this.insertCount = i;
        if (i == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void ensureStarted(int i) {
        boolean z = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.parent;
        if (i2 != i) {
            if (i >= i2 && i < this.currentGroupEnd) {
                z = true;
            }
            if (!z) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.currentGroup;
            int i4 = this.currentSlot;
            int i5 = this.currentSlotEnd;
            this.currentGroup = i;
            startGroup();
            this.currentGroup = i3;
            this.currentSlot = i4;
            this.currentSlotEnd = i5;
        }
    }

    public final void forAllData(int i, my myVar) {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(groupSize(getCurrentGroup()) + getCurrentGroup()));
        for (int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i)); dataIndex2 < dataIndex; dataIndex2++) {
            myVar.invoke(Integer.valueOf(dataIndex2), this.slots[dataIndexToDataAddress(dataIndex2)]);
        }
    }

    public final void forAllDataInRememberOrder(int i, my myVar) {
        int i2;
        int afterGroupIndex;
        my myVar2 = myVar;
        int parent = parent(i);
        int size$runtime = getSize$runtime();
        int groupSize = groupSize(i) + i;
        oa0 oa0Var = null;
        int i3 = i;
        ma0 ma0Var = null;
        while (i3 < groupSize) {
            int i4 = i3 + 1;
            int dataIndex = dataIndex(i4);
            for (int dataIndex2 = dataIndex(i3); dataIndex2 < dataIndex; dataIndex2++) {
                Object obj = this.slots[dataIndexToDataAddress(dataIndex2)];
                if (!(obj instanceof RememberObserverHolder) || (afterGroupIndex = GapComposerKt.asGapRememberObserverHolder((RememberObserverHolder) obj).getAfterGroupIndex()) < 0) {
                    myVar2.invoke(Integer.valueOf(dataIndex2), obj);
                } else {
                    int childGroupAtIndex = childGroupAtIndex(i3, afterGroupIndex);
                    if (oa0Var == null) {
                        int[] iArr = n10.a;
                        oa0Var = new oa0();
                    }
                    if (ma0Var == null) {
                        ma0Var = new ma0();
                    }
                    oa0Var.b(childGroupAtIndex);
                    ma0Var.e(childGroupAtIndex);
                    ma0Var.e(dataIndex2);
                }
            }
            int parent2 = i4 < size$runtime ? parent(i4) : -1;
            if (parent2 != i3) {
                while (true) {
                    if (ma0Var == null || oa0Var == null || !oa0Var.h(i3)) {
                        i2 = size$runtime;
                    } else {
                        int i5 = ma0Var.b;
                        int i6 = i5 / 2;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < i6) {
                            int i9 = i7 * 2;
                            int i10 = size$runtime;
                            int b = ma0Var.b(i9);
                            if (b == i3) {
                                int b2 = ma0Var.b(i9 + 1);
                                myVar2.invoke(Integer.valueOf(b2), this.slots[dataIndexToDataAddress(b2)]);
                            } else if (i9 != i8) {
                                int i11 = i8 + 1;
                                ma0Var.i(i8, b);
                                i8 += 2;
                                ma0Var.i(i11, ma0Var.b(i9 + 1));
                            } else {
                                i8 += 2;
                            }
                            i7++;
                            myVar2 = myVar;
                            size$runtime = i10;
                        }
                        i2 = size$runtime;
                        if (i8 != i5) {
                            ma0Var.h(i8, i5);
                        }
                    }
                    if (i3 != i && parent != parent2) {
                        i3 = parent;
                        size$runtime = i2;
                        parent = parent(parent);
                        myVar2 = myVar;
                    }
                }
            } else {
                i2 = size$runtime;
            }
            myVar2 = myVar;
            parent = parent2;
            i3 = i4;
            size$runtime = i2;
        }
    }

    public final void forEachTailSlot(int i, int i2, my myVar) {
        int slotsStartIndex$runtime = slotsStartIndex$runtime(i);
        int slotsEndIndex$runtime = slotsEndIndex$runtime(i);
        for (int max = Math.max(slotsStartIndex$runtime, slotsEndIndex$runtime - i2); max < slotsEndIndex$runtime; max++) {
            myVar.invoke(Integer.valueOf(max), this.slots[dataIndexToDataAddress(max)]);
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime() {
        return getCapacity() - this.groupGapLen;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    public final SlotTable getTable$runtime() {
        return this.table;
    }

    public final Object groupAux(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        return (iArr[(groupIndexToAddress * 5) + 1] & GroupFlagsKt.IsMovableContentFlag) != 0 ? this.slots[auxIndex(iArr, groupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final int groupKey(int i) {
        return this.groups[groupIndexToAddress(i) * 5];
    }

    public final Object groupObjectKey(int i) {
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if ((iArr[(groupIndexToAddress * 5) + 1] & GroupFlagsKt.HasMovableContentFlag) == 0) {
            return null;
        }
        Object[] objArr = this.slots;
        objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, groupIndexToAddress);
        return objArr[objectKeyIndex];
    }

    public final int groupSize(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i));
        return groupSize;
    }

    public final int groupSlotIndex(int i) {
        xa0 xa0Var;
        int slotsStartIndex$runtime = this.currentSlot - slotsStartIndex$runtime(i);
        na0 na0Var = this.deferredSlotWrites;
        return slotsStartIndex$runtime + ((na0Var == null || (xa0Var = (xa0) na0Var.b(i)) == null) ? 0 : xa0Var.b);
    }

    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(groupSize(i) + i)), this);
    }

    public final boolean hasObjectKey(int i) {
        return (this.groups[(groupIndexToAddress(i) * 5) + 1] & GroupFlagsKt.HasMovableContentFlag) != 0;
    }

    public final boolean inGroup(GapAnchor gapAnchor, GapAnchor gapAnchor2) {
        int groupSize;
        int anchorIndex = anchorIndex(gapAnchor);
        groupSize = SlotTableKt.groupSize(this.groups, anchorIndex);
        int i = groupSize + anchorIndex;
        int location$runtime = gapAnchor2.getLocation$runtime();
        return anchorIndex <= location$runtime && location$runtime < i;
    }

    public final boolean indexInCurrentGroup(int i) {
        return indexInGroup(i, this.currentGroup);
    }

    public final boolean indexInGroup(int i, int i2) {
        int capacity;
        int groupSize;
        if (i2 == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (i2 > this.startStack.peekOr(0)) {
                groupSize = groupSize(i2);
            } else {
                int indexOf = this.startStack.indexOf(i2);
                if (indexOf < 0) {
                    groupSize = groupSize(i2);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + i2;
        }
        return i > i2 && i < capacity;
    }

    public final boolean indexInParent(int i) {
        int i2 = this.parent;
        if (i <= i2 || i >= this.currentGroupEnd) {
            return i2 == 0 && i == 0;
        }
        return true;
    }

    public final void insertAux(Object obj) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i);
        if ((this.groups[(groupIndexToAddress * 5) + 1] & GroupFlagsKt.IsMovableContentFlag) != 0) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i);
        int auxIndex = auxIndex(this.groups, groupIndexToAddress);
        int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
        int i2 = this.currentSlot;
        if (i2 > auxIndex) {
            int i3 = i2 - auxIndex;
            if (!(i3 < 3)) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i3 > 1) {
                Object[] objArr = this.slots;
                objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, groupIndexToAddress);
        this.slots[dataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i) * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0;
    }

    public final boolean isValid(int i) {
        return groupIndexToAddress(i) * 5 < this.groups.length;
    }

    public final void markGroup(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        int i2 = (groupIndexToAddress * 5) + 1;
        if ((iArr[i2] & GroupFlagsKt.HasRecompositionRequiredFlag) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, groupIndexToAddress, true);
        if ((this.groups[i2] & GroupFlagsKt.IsRecompositionRequiredFlag) != 0) {
            return;
        }
        updateContainsMark(parent(i));
    }

    public final List<GapAnchor> moveFrom(SlotTable slotTable, int i, boolean z) {
        int groupSize;
        if (!(this.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (i == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            groupSize = SlotTableKt.groupSize(slotTable.getGroups(), i);
            if (groupSize == slotTable.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<GapAnchor> arrayList = this.anchors;
                HashMap<GapAnchor, GapGroupSourceInformation> hashMap = this.sourceInformationMap;
                na0 na0Var = this.calledByMap;
                int[] groups = slotTable.getGroups();
                int groupsSize = slotTable.getGroupsSize();
                Object[] m3964getSlots = slotTable.m3964getSlots();
                int slotsSize = slotTable.getSlotsSize();
                HashMap<GapAnchor, GapGroupSourceInformation> sourceInformationMap$runtime = slotTable.getSourceInformationMap$runtime();
                na0 calledByMap$runtime = slotTable.getCalledByMap$runtime();
                this.groups = groups;
                this.slots = m3964getSlots;
                this.anchors = slotTable.getAnchors$runtime();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = m3964getSlots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = sourceInformationMap$runtime;
                this.calledByMap = calledByMap$runtime;
                slotTable.setTo$runtime(iArr, 0, objArr, 0, arrayList, hashMap, na0Var);
                return this.anchors;
            }
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            List<GapAnchor> moveGroup = Companion.moveGroup(openWriter, i, this, true, true, z);
            openWriter.close(true);
            return moveGroup;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final void moveGroup(int i) {
        int[] iArr;
        int groupSize;
        int groupSize2;
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (i < 0) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.currentGroup;
        int i3 = this.parent;
        int i4 = this.currentGroupEnd;
        int i5 = i;
        int i6 = i2;
        while (true) {
            iArr = this.groups;
            if (i5 <= 0) {
                break;
            }
            groupSize2 = SlotTableKt.groupSize(iArr, groupIndexToAddress(i6));
            i6 += groupSize2;
            if (i6 > i4) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
            i5--;
        }
        groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress(i6));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i6));
        int i7 = i6 + groupSize;
        int dataIndex3 = dataIndex(this.groups, groupIndexToAddress(i7));
        int i8 = dataIndex3 - dataIndex2;
        insertSlots(i8, Math.max(this.currentGroup - 1, 0));
        insertGroups(groupSize);
        int[] iArr2 = this.groups;
        int groupIndexToAddress = groupIndexToAddress(i7) * 5;
        ac.O(iArr2, iArr2, groupIndexToAddress(i2) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
        if (i8 > 0) {
            Object[] objArr = this.slots;
            int dataIndexToDataAddress = dataIndexToDataAddress(dataIndex2 + i8);
            System.arraycopy(objArr, dataIndexToDataAddress, objArr, dataIndex, dataIndexToDataAddress(dataIndex3 + i8) - dataIndexToDataAddress);
        }
        int i9 = dataIndex2 + i8;
        int i10 = i9 - dataIndex;
        int i11 = this.slotsGapStart;
        int i12 = this.slotsGapLen;
        int length = this.slots.length;
        int i13 = this.slotsGapOwner;
        int i14 = i2 + groupSize;
        int i15 = i2;
        while (i15 < i14) {
            int groupIndexToAddress2 = groupIndexToAddress(i15);
            int i16 = i10;
            int dataIndex4 = dataIndex(iArr2, groupIndexToAddress2) - i16;
            int i17 = i11;
            if (i13 < groupIndexToAddress2) {
                i11 = 0;
            }
            updateDataIndex(iArr2, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex4, i11, i12, length));
            i15++;
            i11 = i17;
            i10 = i16;
        }
        moveAnchors(i7, i2, groupSize);
        if (removeGroups(i7, groupSize)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i3, this.currentGroupEnd, i2);
        if (i8 > 0) {
            removeSlots(i9, i8, i7 - 1);
        }
    }

    public final List<GapAnchor> moveIntoGroupFrom(int i, SlotTable slotTable, int i2) {
        if (!(this.insertCount <= 0 && groupSize(this.currentGroup + i) == 1)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i3 = this.currentGroup;
        int i4 = this.currentSlot;
        int i5 = this.currentSlotEnd;
        advanceBy(i);
        startGroup();
        beginInsert();
        SlotWriter openWriter = slotTable.openWriter();
        try {
            List<GapAnchor> moveGroup$default = Companion.moveGroup$default(Companion, openWriter, i2, this, false, true, false, 32, null);
            openWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i3;
            this.currentSlot = i4;
            this.currentSlotEnd = i5;
            return moveGroup$default;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final List<GapAnchor> moveTo(GapAnchor gapAnchor, int i, SlotWriter slotWriter) {
        int groupSize;
        if (!(slotWriter.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!gapAnchor.getValid()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int anchorIndex = anchorIndex(gapAnchor) + i;
        int i2 = this.currentGroup;
        if (!(i2 <= anchorIndex && anchorIndex < this.currentGroupEnd)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int parent = parent(anchorIndex);
        int groupSize2 = groupSize(anchorIndex);
        int nodeCount = isNode(anchorIndex) ? 1 : nodeCount(anchorIndex);
        List<GapAnchor> moveGroup$default = Companion.moveGroup$default(Companion, this, anchorIndex, slotWriter, false, false, false, 32, null);
        updateContainsMark(parent);
        boolean z = nodeCount > 0;
        while (parent >= i2) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress);
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
            if (z) {
                int[] iArr2 = this.groups;
                int i3 = iArr2[(groupIndexToAddress * 5) + 1];
                if ((1073741824 & i3) != 0) {
                    z = false;
                } else {
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, (i3 & 67108863) - nodeCount);
                }
            }
            parent = parent(parent);
        }
        if (z) {
            if (!(this.nodeCount >= nodeCount)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            this.nodeCount -= nodeCount;
        }
        return moveGroup$default;
    }

    public final Object node(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if ((iArr[(groupIndexToAddress * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, groupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int i) {
        return this.groups[(groupIndexToAddress(i) * 5) + 1] & 67108863;
    }

    public final int parent(GapAnchor gapAnchor) {
        if (gapAnchor.getValid()) {
            return parent(this.groups, anchorIndex(gapAnchor));
        }
        return -1;
    }

    public final void recordGroupSourceInformation(String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, str);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GapGroupSourceInformation groupSourceInformationFor;
        if (this.insertCount <= 0 || (groupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    public final void recordGrouplessCallSourceInformationStart(int i, String str) {
        if (this.insertCount > 0) {
            na0 na0Var = this.calledByMap;
            if (na0Var != null) {
                SlotTableKt.add(na0Var, i, groupKey(this.parent));
            }
            GapGroupSourceInformation groupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (groupSourceInformationFor != null) {
                groupSourceInformationFor.startGrouplessCall(i, str, getCurrentGroupSlotIndex());
            }
        }
    }

    public final boolean removeGroup() {
        GapAnchor tryAnchor$runtime;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        int skipGroup = skipGroup();
        GapGroupSourceInformation sourceInformationOf$runtime = sourceInformationOf$runtime(this.parent);
        if (sourceInformationOf$runtime != null && (tryAnchor$runtime = tryAnchor$runtime(i)) != null) {
            sourceInformationOf$runtime.removeAnchor(tryAnchor$runtime);
        }
        ma0 ma0Var = this.pendingRecalculateMarks;
        if (ma0Var != null) {
            while (PrioritySet.m3958isNotEmptyimpl(ma0Var) && PrioritySet.m3959peekimpl(ma0Var) >= i) {
                PrioritySet.m3960takeMaximpl(ma0Var);
            }
        }
        boolean removeGroups = removeGroups(i, this.currentGroup - i);
        removeSlots(dataIndex, this.currentSlot - dataIndex, i - 1);
        this.currentGroup = i;
        this.currentSlot = i2;
        this.nodeCount -= skipGroup;
        return removeGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(GapAnchor gapAnchor) {
        advanceBy(gapAnchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(Object obj) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = obj;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final int skipGroup() {
        int groupSize;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i2 = groupSize + i;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
        int i3 = this.groups[(groupIndexToAddress * 5) + 1];
        if ((1073741824 & i3) != 0) {
            return 1;
        }
        return i3 & 67108863;
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final Object slot(int i, int i2) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        int i3 = i2 + slotIndex;
        if (slotIndex > i3 || i3 >= dataIndex) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i3)];
    }

    public final int slotIndexOfGroupSlotIndex(int i, int i2) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int i3 = slotIndex + i2;
        if (!(i3 >= slotIndex && i3 < dataIndex(this.groups, groupIndexToAddress(i + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + i2 + " for group " + i);
        }
        return i3;
    }

    public final int slotsEndAllIndex$runtime(int i) {
        return dataIndex(this.groups, groupIndexToAddress(groupSize(i) + i));
    }

    public final int slotsEndIndex$runtime(int i) {
        return dataIndex(this.groups, groupIndexToAddress(i + 1));
    }

    public final int slotsStartIndex$runtime(int i) {
        return slotIndex(this.groups, groupIndexToAddress(i));
    }

    public final GapGroupSourceInformation sourceInformationOf$runtime(int i) {
        GapAnchor tryAnchor$runtime;
        HashMap<GapAnchor, GapGroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime = tryAnchor$runtime(i)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor$runtime);
    }

    public final void startData(int i, Object obj) {
        startGroup(i, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(int i, Object obj) {
        startGroup(i, obj, true, Composer.Companion.getEmpty());
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        sb.append("  parent:    " + this.parent);
        sb.append('\n');
        sb.append("  current:   " + this.currentGroup);
        sb.append('\n');
        sb.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        sb.append('\n');
        sb.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("  gap owner: ");
        sb2.append(this.slotsGapOwner);
        sb.append(sb2.toString());
        sb.append('\n');
        int size$runtime = getSize$runtime();
        for (int i = 0; i < size$runtime; i++) {
            groupAsString(sb, i);
            sb.append('\n');
        }
        return sb.toString();
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void traverseGroupAndChildren(int i, ky kyVar, ky kyVar2) {
        int parent = parent(i);
        int size$runtime = getSize$runtime();
        int groupSize = groupSize(i) + i;
        int i2 = i;
        while (i2 < groupSize) {
            kyVar.invoke(Integer.valueOf(i2));
            int i3 = i2 + 1;
            int parent2 = i3 < size$runtime ? parent(i3) : -1;
            if (parent2 != i2) {
                while (true) {
                    kyVar2.invoke(Integer.valueOf(i2));
                    if (i2 != i && parent != parent2) {
                        i2 = parent;
                        parent = parent(parent);
                    }
                }
            }
            i2 = i3;
            parent = parent2;
        }
    }

    public final void trimTailSlots(int i) {
        if (!(i > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i2 = this.parent;
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i2));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i2 + 1)) - i;
        if (!(dataIndex >= slotIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(dataIndex, i, i2);
        int i3 = this.currentSlot;
        if (i3 >= slotIndex) {
            this.currentSlot = i3 - i;
        }
    }

    public final GapAnchor tryAnchor$runtime(int i) {
        GapAnchor find;
        if (i < 0 || i >= getSize$runtime()) {
            return null;
        }
        find = SlotTableKt.find(this.anchors, i, getSize$runtime());
        return find;
    }

    public final Object update(Object obj) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return rawUpdate(obj);
        }
        na0 na0Var = this.deferredSlotWrites;
        if (na0Var == null) {
            na0Var = new na0();
        }
        this.deferredSlotWrites = na0Var;
        int i = this.parent;
        Object b = na0Var.b(i);
        if (b == null) {
            b = new xa0();
            na0Var.i(i, b);
        }
        ((xa0) b).g(obj);
        return Composer.Companion.getEmpty();
    }

    public final void updateAux(Object obj) {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!((this.groups[(groupIndexToAddress * 5) + 1] & GroupFlagsKt.IsMovableContentFlag) != 0)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
    }

    public final void updateNode(GapAnchor gapAnchor, Object obj) {
        updateNodeOfGroup(gapAnchor.toIndexFor(this), obj);
    }

    public final void updateParentNode(Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime();
        this.calledByMap = this.table.getCalledByMap$runtime();
    }

    public final void verifyDataAnchors$runtime() {
        int i = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime = getSize$runtime();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < size$runtime) {
            int groupIndexToAddress = groupIndexToAddress(i2);
            int[] iArr = this.groups;
            int i4 = iArr[(groupIndexToAddress * 5) + 4];
            int dataIndex = dataIndex(iArr, groupIndexToAddress);
            if (!(dataIndex >= i3)) {
                StringBuilder j = j50.j("Data index out of order at ", i2, ", previous = ", i3, ", current = ");
                j.append(dataIndex);
                PreconditionsKt.throwIllegalStateException(j.toString());
            }
            if (!(dataIndex <= length)) {
                PreconditionsKt.throwIllegalStateException("Data index, " + dataIndex + ", out of bound at " + i2);
            }
            if (i4 < 0 && !z) {
                if (!(i == i2)) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i + " found gap at " + i2);
                }
                z = true;
            }
            i2++;
            i3 = dataIndex;
        }
    }

    public final void verifyParentAnchors$runtime() {
        int i = this.groupGapStart;
        int i2 = this.groupGapLen;
        int capacity = getCapacity();
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            if (!(this.groups[(i3 * 5) + 2] > -2)) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i3);
            }
            i3++;
        }
        for (int i4 = i2 + i; i4 < capacity; i4++) {
            int i5 = this.groups[(i4 * 5) + 2];
            if (parentAnchorToIndex(i5) < i) {
                if (!(i5 > -2)) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i4);
                }
            } else if (!(i5 <= -2)) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i4);
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final List<GapAnchor> moveGroup(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
            boolean z4;
            int locationOf;
            int locationOf2;
            ut utVar;
            int groupSize;
            int locationOf3;
            int groupSize2 = slotWriter.groupSize(i);
            int i2 = i + groupSize2;
            int dataIndex = slotWriter.dataIndex(i);
            int dataIndex2 = slotWriter.dataIndex(i2);
            int i3 = dataIndex2 - dataIndex;
            boolean containsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i);
            slotWriter2.insertGroups(groupSize2);
            slotWriter2.insertSlots(i3, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i2) {
                slotWriter.moveGroupGapTo(i2);
            }
            if (slotWriter.slotsGapStart < dataIndex2) {
                slotWriter.moveSlotGapTo(dataIndex2, i2);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            int i4 = currentGroup * 5;
            ac.O(slotWriter.groups, iArr, i4, i * 5, i2 * 5);
            Object[] objArr = slotWriter2.slots;
            int i5 = slotWriter2.currentSlot;
            System.arraycopy(slotWriter.slots, dataIndex, objArr, i5, i3);
            int parent = slotWriter2.getParent();
            iArr[i4 + 2] = parent;
            int i6 = currentGroup - i;
            int i7 = currentGroup + groupSize2;
            int dataIndex3 = i5 - slotWriter2.dataIndex(iArr, currentGroup);
            int i8 = slotWriter2.slotsGapOwner;
            int i9 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i10 = i8;
            int i11 = currentGroup;
            while (true) {
                z4 = false;
                if (i11 >= i7) {
                    break;
                }
                if (i11 != currentGroup) {
                    int i12 = (i11 * 5) + 2;
                    iArr[i12] = iArr[i12] + i6;
                }
                int[] iArr2 = iArr;
                int i13 = currentGroup;
                iArr2[(i11 * 5) + 4] = slotWriter2.dataIndexToDataAnchor(slotWriter2.dataIndex(iArr, i11) + dataIndex3, i10 >= i11 ? slotWriter2.slotsGapStart : 0, i9, length);
                if (i11 == i10) {
                    i10++;
                }
                i11++;
                currentGroup = i13;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            slotWriter2.slotsGapOwner = i10;
            locationOf = SlotTableKt.locationOf(slotWriter.anchors, i, slotWriter.getSize$runtime());
            locationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i2, slotWriter.getSize$runtime());
            if (locationOf < locationOf2) {
                ArrayList arrayList = slotWriter.anchors;
                ArrayList arrayList2 = new ArrayList(locationOf2 - locationOf);
                for (int i14 = locationOf; i14 < locationOf2; i14++) {
                    GapAnchor gapAnchor = (GapAnchor) arrayList.get(i14);
                    gapAnchor.setLocation$runtime(gapAnchor.getLocation$runtime() + i6);
                    arrayList2.add(gapAnchor);
                }
                locationOf3 = SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime());
                slotWriter2.anchors.addAll(locationOf3, arrayList2);
                arrayList.subList(locationOf, locationOf2).clear();
                utVar = arrayList2;
            } else {
                utVar = ut.d;
            }
            if (!utVar.isEmpty()) {
                HashMap hashMap = slotWriter.sourceInformationMap;
                HashMap hashMap2 = slotWriter2.sourceInformationMap;
                if (hashMap != null && hashMap2 != null) {
                    int size = utVar.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        GapAnchor gapAnchor2 = (GapAnchor) utVar.get(i15);
                        GapGroupSourceInformation gapGroupSourceInformation = (GapGroupSourceInformation) hashMap.get(gapAnchor2);
                        if (gapGroupSourceInformation != null) {
                            hashMap.remove(gapAnchor2);
                            hashMap2.put(gapAnchor2, gapGroupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = slotWriter2.getParent();
            GapGroupSourceInformation sourceInformationOf$runtime = slotWriter2.sourceInformationOf$runtime(parent);
            if (sourceInformationOf$runtime != null) {
                int i16 = parent2 + 1;
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int i17 = -1;
                while (i16 < currentGroup2) {
                    groupSize = SlotTableKt.groupSize(slotWriter2.groups, i16);
                    int i18 = groupSize + i16;
                    i17 = i16;
                    i16 = i18;
                }
                sourceInformationOf$runtime.addGroupAfter(slotWriter2, i17, currentGroup2);
            }
            int parent3 = slotWriter.parent(i);
            if (z3) {
                if (z) {
                    boolean z5 = parent3 >= 0;
                    if (z5) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(parent3 - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i - slotWriter.getCurrentGroup());
                    boolean removeGroup = slotWriter.removeGroup();
                    if (z5) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    z4 = removeGroup;
                } else {
                    z4 = slotWriter.removeGroups(i, groupSize2);
                    slotWriter.removeSlots(dataIndex, i3, i - 1);
                }
            }
            if (z4) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int i19 = slotWriter2.nodeCount;
            int i20 = iArr3[i4 + 1];
            slotWriter2.nodeCount = i19 + ((1073741824 & i20) == 0 ? i20 & 67108863 : 1);
            if (z2) {
                slotWriter2.currentGroup = i7;
                slotWriter2.currentSlot = i5 + i3;
            }
            if (containsAnyGroupMarks) {
                slotWriter2.updateContainsMark(parent);
            }
            return utVar;
        }

        public static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z2, z3);
        }

        private Companion() {
        }
    }

    public final void updateNode(Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void startData(int i, Object obj, Object obj2) {
        startGroup(i, obj, false, obj2);
    }

    public final void startNode(int i, Object obj, Object obj2) {
        startGroup(i, obj, true, obj2);
    }

    public final int parent(int i) {
        return parent(this.groups, i);
    }

    private final int parent(int[] iArr, int i) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i) * 5) + 2]);
    }

    public final boolean isNode(int i) {
        return (this.groups[(groupIndexToAddress(i) * 5) + 1] & GroupFlagsKt.IsSubcompositionContextFlag) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int i) {
        return dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final Object set(int i, Object obj) {
        return set(getCurrentGroup(), i, obj);
    }

    public final Object set(int i, int i2, Object obj) {
        int dataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(i, i2));
        Object[] objArr = this.slots;
        Object obj2 = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = obj;
        return obj2;
    }

    public final Object node(GapAnchor gapAnchor) {
        return node(gapAnchor.toIndexFor(this));
    }

    public final Object slot(GapAnchor gapAnchor, int i) {
        return slot(anchorIndex(gapAnchor), i);
    }

    public final void ensureStarted(GapAnchor gapAnchor) {
        ensureStarted(gapAnchor.toIndexFor(this));
    }

    public final void startGroup(int i) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i, Object obj) {
        startGroup(i, obj, false, Composer.Companion.getEmpty());
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.Companion;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }
}
