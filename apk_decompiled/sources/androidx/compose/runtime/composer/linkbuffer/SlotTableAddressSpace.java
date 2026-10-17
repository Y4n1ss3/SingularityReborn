package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import defpackage.ac;
import defpackage.b10;
import defpackage.dq;
import defpackage.fb0;
import defpackage.gy;
import defpackage.h10;
import defpackage.kp0;
import defpackage.ky;
import defpackage.la0;
import defpackage.my;
import defpackage.n10;
import defpackage.na0;
import defpackage.o;
import defpackage.oa0;
import defpackage.q10;
import defpackage.ql0;
import defpackage.uf;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTableAddressSpace {
    private static final int[] EmptyGroupData;
    private static final Object[] EmptySlotData;
    private la0 _largeSizes;
    private na0 anchors;
    private na0 calledByMap;
    private int freeSlotCount;
    private int[] groups;
    private Object[] slots;
    private fb0 sourceInformationMap;
    private int unallocatedEnd;
    private int unallocatedStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        int[] newGroupsArray;
        Object[] newSlotsArray;
        newGroupsArray = SlotTableAddresSpaceKt.newGroupsArray(6);
        EmptyGroupData = newGroupsArray;
        newSlotsArray = SlotTableAddresSpaceKt.newSlotsArray(0);
        EmptySlotData = newSlotsArray;
    }

    public SlotTableAddressSpace() {
        this(EmptyGroupData, EmptySlotData);
        int[] iArr = this.groups;
        if (iArr[0] == 0 && iArr[1] == -1 && iArr[2] == 0 && iArr[3] == 6 && iArr[4] == 0) {
            int i = iArr[5];
        }
    }

    private final int allocateSlots(int i) {
        int i2 = this.unallocatedStart;
        int i3 = i2 + i;
        if (i3 <= this.unallocatedEnd) {
            this.unallocatedStart = i3;
            if (i > 15) {
                getLargeSizes().g(i2, i);
            }
            ac.X(this.slots, i2, i3, Composer.Companion.getEmpty());
            return SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i2, i);
        }
        compactAndMaybeGrow(i);
        int i4 = this.unallocatedStart;
        int i5 = i4 + i;
        if (i5 > this.unallocatedEnd) {
            throw uf.a("compactAndMaybeGrow did not grow enough");
        }
        this.unallocatedStart = i5;
        if (i > 15) {
            getLargeSizes().g(i4, i);
        }
        ac.X(this.slots, i4, i5, Composer.Companion.getEmpty());
        return SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i4, i);
    }

    private final void compactAndMaybeGrow(int i) {
        Object[] objArr;
        Object[] objArr2 = this.slots;
        int length = objArr2.length;
        int length2 = objArr2.length - ((this.unallocatedEnd - this.unallocatedStart) + this.freeSlotCount);
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros((i + length2) + (objArr2.length >> 5)));
        if (numberOfLeadingZeros < length) {
            numberOfLeadingZeros = length;
        }
        if (numberOfLeadingZeros != length) {
            if (numberOfLeadingZeros < 256) {
                numberOfLeadingZeros = 256;
            }
            objArr = SlotTableAddresSpaceKt.newSlotsArray(numberOfLeadingZeros);
        } else {
            objArr = objArr2;
        }
        int i2 = b10.a;
        la0 la0Var = new la0();
        int i3 = this.groups[3];
        SlotMoveManager slotMoveManager = new SlotMoveManager(objArr2, objArr);
        int i4 = 6;
        int s = q10.s(6, i3 - 1, 6);
        int i5 = 0;
        if (6 <= s) {
            while (true) {
                int i6 = i4 + 5;
                int i7 = this.groups[i6];
                if (i7 != -1) {
                    int i8 = (i7 & 15) + 1;
                    int i9 = i7 >> 4;
                    if (i8 > 15) {
                        i8 = getLargeSizes().d(i9);
                    }
                    slotMoveManager.move(i5, i9, i9 + i8);
                    if (i8 > 15) {
                        la0Var.g(i5, i8);
                    }
                    this.groups[i6] = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i5, i8);
                    i5 += i8;
                }
                if (i4 == s) {
                    break;
                } else {
                    i4 += 6;
                }
            }
        }
        if (i5 != length2) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot compaction result, computed we had " + length2 + " slots, but copied " + i5 + " slots");
        }
        this.slots = slotMoveManager.done();
        if (la0Var.e == 0) {
            la0Var = null;
        }
        this._largeSizes = la0Var;
        this.unallocatedStart = i5;
        this.unallocatedEnd = objArr.length;
        this.freeSlotCount = 0;
    }

    private static final int copyTreeFrom$copyGroup(SlotTableAddressSpace slotTableAddressSpace, SlotTableAddressSpace slotTableAddressSpace2, int i, int i2) {
        int groupAllocate;
        int[] iArr = slotTableAddressSpace.groups;
        Object[] objArr = slotTableAddressSpace.slots;
        int i3 = iArr[i2 + 4];
        int i4 = iArr[i2];
        groupAllocate = SlotTableAddresSpaceKt.groupAllocate(slotTableAddressSpace2.getGroups(), i4, i, i3);
        if (groupAllocate < 0) {
            slotTableAddressSpace2.growGroups();
            groupAllocate = SlotTableAddresSpaceKt.groupAllocate(slotTableAddressSpace2.getGroups(), i4, i, i3);
        }
        slotTableAddressSpace2.moveSourceInformation(slotTableAddressSpace, slotTableAddressSpace2.moveAnchorFrom(slotTableAddressSpace, i2, groupAllocate));
        int i5 = iArr[i2 + 5];
        if (i5 != -1) {
            int i6 = (i5 & 15) + 1;
            int i7 = i5 >> 4;
            if (i6 > 15) {
                i6 = slotTableAddressSpace.getLargeSizes().d(i7);
            }
            int allocateSlots = slotTableAddressSpace2.allocateSlots(i6);
            ac.Q(objArr, slotTableAddressSpace2.slots, allocateSlots >> 4, i7, i6 + i7);
            slotTableAddressSpace2.groups[groupAllocate + 5] = allocateSlots;
        }
        int i8 = iArr[i2 + 3];
        int i9 = -1;
        while (i8 != -1) {
            int copyTreeFrom$copyGroup = copyTreeFrom$copyGroup(slotTableAddressSpace, slotTableAddressSpace2, groupAllocate, i8);
            int[] iArr2 = slotTableAddressSpace2.groups;
            if (i9 == -1) {
                iArr2[groupAllocate + 3] = copyTreeFrom$copyGroup;
            } else {
                iArr2[i9 + 1] = copyTreeFrom$copyGroup;
            }
            i8 = iArr[i8 + 1];
            i9 = copyTreeFrom$copyGroup;
        }
        return groupAllocate;
    }

    private final void freeGroup(int i) {
        int[] iArr = this.groups;
        if (i + 6 > iArr.length) {
            return;
        }
        int i2 = i + 4;
        if ((iArr[i2] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK) == 8388607) {
            gy.h(i, "Recursive loop in group structure detected at ");
        }
        LinkAnchor linkAnchor = (LinkAnchor) this.anchors.b(i);
        if (linkAnchor != null) {
            linkAnchor.setAddress(-1);
            this.anchors.g(i);
            fb0 fb0Var = this.sourceInformationMap;
            if (fb0Var != null) {
            }
        }
        int i3 = i + 5;
        freeSlots(iArr[i3]);
        iArr[i3] = -1;
        int i4 = iArr[i + 3];
        while (i4 != -1) {
            if (i4 + 6 > iArr.length) {
                return;
            }
            int i5 = iArr[i4 + 1];
            freeGroup(i4);
            i4 = i5;
        }
        iArr[i + 1] = iArr[1];
        iArr[i + 2] = -1;
        iArr[1] = i;
        iArr[i2] = 8388607;
    }

    private final void freeSlots(int i) {
        if (i != -1) {
            int i2 = (i & 15) + 1;
            int i3 = i >> 4;
            if (i2 > 15) {
                i2 = getLargeSizes().d(i3);
            }
            freeSlotsAt(i3, i2);
        }
    }

    private final void freeSlotsAt(int i, int i2) {
        la0 largeSizes;
        int c;
        Object[] objArr = this.slots;
        int i3 = i + i2;
        if (i3 == i + 1) {
            objArr[i] = SlotTableAddresSpaceKt.Unallocated;
        } else {
            ac.X(objArr, i, i3, SlotTableAddresSpaceKt.Unallocated);
        }
        this.freeSlotCount += i2;
        if (i2 <= 15 || (c = (largeSizes = getLargeSizes()).c(i)) < 0) {
            return;
        }
        largeSizes.e--;
        long[] jArr = largeSizes.a;
        int i4 = largeSizes.d;
        int i5 = c >> 3;
        int i6 = (c & 7) << 3;
        long j = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j;
        jArr[(((c - 7) & i4) + (i4 & 7)) >> 3] = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final la0 getLargeSizes() {
        la0 la0Var = this._largeSizes;
        if (la0Var != null) {
            return la0Var;
        }
        int i = b10.a;
        la0 la0Var2 = new la0();
        this._largeSizes = la0Var2;
        return la0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void growGroups() {
        int[] iArr = this.groups;
        int length = iArr.length;
        int length2 = iArr.length * 2;
        if (length2 < 768) {
            length2 = 768;
        }
        int[] copyOf = Arrays.copyOf(iArr, length2);
        this.groups = copyOf;
        SlotTableAddresSpaceKt.initGroups(copyOf, length);
    }

    private final int growSlotRangeAtGroup(int i, int i2, int i3) {
        int i4;
        int i5 = this.unallocatedStart;
        int i6 = this.unallocatedEnd;
        int i7 = i + 5;
        int i8 = this.groups[i7] >> 4;
        int i9 = i8 + i2;
        if (i9 == i5 && (i4 = i8 + i3) <= i6) {
            this.unallocatedStart = (i3 - i2) + i5;
            if (i3 > 15) {
                getLargeSizes().g(i8, i3);
            }
            int slotRangeFromAddressAndSize = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i8, i3);
            Object[] objArr = this.slots;
            if (i4 == i9 + 1) {
                objArr[i9] = SlotTableAddresSpaceKt.Unallocated;
            } else {
                ac.X(objArr, i9, i4, SlotTableAddresSpaceKt.Unallocated);
            }
            this.groups[i7] = slotRangeFromAddressAndSize;
            return slotRangeFromAddressAndSize;
        }
        int i10 = i3 - i2;
        Object[] objArr2 = this.slots;
        int i11 = i9 + i10;
        if (i11 < objArr2.length) {
            for (int i12 = i9; i12 < i11; i12++) {
                if (objArr2[i12] == SlotTableAddresSpaceKt.Unallocated) {
                }
            }
            if (i3 > 15) {
                getLargeSizes().g(i8, i3);
            }
            int slotRangeFromAddressAndSize2 = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i8, i3);
            Object[] objArr3 = this.slots;
            int i13 = i8 + i3;
            if (i13 == i9 + 1) {
                objArr3[i9] = SlotTableAddresSpaceKt.Unallocated;
            } else {
                ac.X(objArr3, i9, i13, SlotTableAddresSpaceKt.Unallocated);
            }
            this.groups[i7] = slotRangeFromAddressAndSize2;
            this.freeSlotCount -= i10;
            return slotRangeFromAddressAndSize2;
        }
        int i14 = i3 + 8;
        int shrinkSlotRange = shrinkSlotRange(allocateSlots(i14), i14, i3);
        int i15 = shrinkSlotRange >> 4;
        int i16 = this.groups[i7] >> 4;
        if (i15 != i16) {
            Object[] objArr4 = this.slots;
            ac.Q(objArr4, objArr4, i15, i16, i16 + i2);
            freeSlotsAt(i16, i2);
        }
        this.groups[i7] = shrinkSlotRange;
        return shrinkSlotRange;
    }

    private final void removeSourceInformation(int i) {
        LinkAnchor linkAnchor;
        LinkAnchor linkAnchor2;
        LinkGroupSourceInformation linkGroupSourceInformation;
        fb0 fb0Var = this.sourceInformationMap;
        if (fb0Var == null || (linkAnchor = (LinkAnchor) this.anchors.b(i)) == null || (linkAnchor2 = (LinkAnchor) this.anchors.b(this.groups[i + 2])) == null || (linkGroupSourceInformation = (LinkGroupSourceInformation) fb0Var.d(linkAnchor2)) == null) {
            return;
        }
        linkGroupSourceInformation.removeGroup(linkAnchor);
    }

    private final int shrinkSlotRange(int i, int i2, int i3) {
        int i4 = i >> 4;
        if (i3 == 0) {
            if (i != -1) {
                freeSlotsAt(i4, i2);
            }
            return -1;
        }
        int i5 = i2 - i3;
        int i6 = i4 + i3;
        if (i5 > 0) {
            freeSlotsAt(i6, i5);
        }
        if (i3 > 15) {
            getLargeSizes().g(i4, i3);
        }
        return SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i4, i3);
    }

    private final int shrinkSlotRangeAtGroup(int i, int i2, int i3) {
        int i4 = i + 5;
        int shrinkSlotRange = shrinkSlotRange(this.groups[i4], i2, i3);
        this.groups[i4] = shrinkSlotRange;
        return shrinkSlotRange;
    }

    public static /* synthetic */ void traverseGroup$runtime$default(SlotTableAddressSpace slotTableAddressSpace, int i, boolean z, ky kyVar, int i2, Object obj) {
        int i3;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = slotTableAddressSpace.getGroups();
        int i4 = i;
        while (true) {
            kyVar.invoke(Integer.valueOf(i4));
            if ((i4 != i || z) && (i3 = groups[i4 + 1]) >= 0) {
                intStack.push(i3);
            }
            i4 = groups[i4 + 3];
            if (i4 < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    i4 = intStack.pop();
                }
            }
        }
    }

    public static /* synthetic */ void traverseGroupAndParents$runtime$default(SlotTableAddressSpace slotTableAddressSpace, int i, boolean z, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        int[] groups = slotTableAddressSpace.getGroups();
        int i3 = !z ? groups[i + 2] : i;
        while (i3 > 0) {
            kyVar.invoke(Integer.valueOf(i3));
            i3 = groups[i3 + 2];
        }
        if (i3 != 0) {
            return;
        }
        gy.h(i, "Traversing parent of group not in the slot table: ");
    }

    public static /* synthetic */ void traverseGroupPartially$runtime$default(SlotTableAddressSpace slotTableAddressSpace, int i, boolean z, ky kyVar, int i2, Object obj) {
        int i3;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = slotTableAddressSpace.getGroups();
        int i4 = i;
        while (true) {
            boolean booleanValue = ((Boolean) kyVar.invoke(Integer.valueOf(i4))).booleanValue();
            if ((i4 != i || z) && (i3 = groups[i4 + 1]) >= 0) {
                intStack.push(i3);
            }
            i4 = groups[i4 + 3];
            if (!booleanValue || i4 < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    i4 = intStack.pop();
                }
            }
        }
    }

    private final void validateSlotReferences(int[] iArr) {
        int i = b10.a;
        la0 la0Var = new la0();
        int length = this.slots.length;
        int i2 = 6;
        int s = q10.s(6, iArr[3] - 1, 6);
        if (6 <= s) {
            while (true) {
                int i3 = iArr[i2 + 5];
                if (i3 != -1) {
                    int i4 = (i3 & 15) + 1;
                    int i5 = i3 >> 4;
                    if (i4 > 15) {
                        i4 = getLargeSizes().d(i5);
                    }
                    if (i5 < 0) {
                        o.g("Group ", i2, " has an invalid slot address");
                        return;
                    }
                    int i6 = i4 + i5;
                    if (i6 > length) {
                        o.g("Group ", i2, " slot range extends beyond the slot size");
                        return;
                    }
                    while (i5 < i6) {
                        if (la0Var.c(i5) >= 0) {
                            int d = la0Var.d(i5);
                            StringBuilder f = kp0.f(i2, "Group ", " contains a slot address (");
                            f.append(validateSlotReferences$slotRangeTextOf(this, iArr, i2));
                            f.append(") that overlaps with group ");
                            f.append(d);
                            f.append("'s address (");
                            f.append(validateSlotReferences$slotRangeTextOf(this, iArr, d));
                            f.append(')');
                            throw new IllegalStateException(f.toString().toString());
                        }
                        la0Var.g(i5, i2);
                        i5++;
                    }
                }
                if (i2 == s) {
                    break;
                } else {
                    i2 += 6;
                }
            }
        }
        int length2 = (this.slots.length - la0Var.e) - (this.unallocatedEnd - this.unallocatedStart);
        if (this.freeSlotCount == length2) {
            return;
        }
        throw new IllegalStateException(("Unexpected freeSlotCount, " + this.freeSlotCount + ", expected " + length2).toString());
    }

    private static final String validateSlotReferences$slotRangeTextOf(SlotTableAddressSpace slotTableAddressSpace, int[] iArr, int i) {
        int i2 = iArr[i + 5];
        int i3 = (i2 & 15) + 1;
        int i4 = i2 >> 4;
        if (i3 > 15) {
            i3 = slotTableAddressSpace.getLargeSizes().d(i4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        sb.append('-');
        sb.append(i4 + i3);
        return sb.toString();
    }

    public final int allocateGroup(int i, int i2, int i3) {
        int groupAllocate;
        int groupAllocate2;
        groupAllocate = SlotTableAddresSpaceKt.groupAllocate(getGroups(), i, i2, i3);
        if (groupAllocate >= 0) {
            return groupAllocate;
        }
        growGroups();
        groupAllocate2 = SlotTableAddresSpaceKt.groupAllocate(getGroups(), i, i2, i3);
        return groupAllocate2;
    }

    public final LinkAnchor anchorOfAddress(int i) {
        if (i == -1) {
            return LinkAnchorKt.getNullAnchor();
        }
        if (i == 0) {
            return LinkAnchorKt.getLazyAnchor();
        }
        if (!(i >= 0)) {
            gy.h(i, "Invalid anchor address ");
        }
        na0 na0Var = this.anchors;
        Object b = na0Var.b(i);
        if (b == null) {
            b = new LinkAnchor(i);
            na0Var.i(i, b);
        }
        return (LinkAnchor) b;
    }

    public final boolean contains(int i) {
        return i > 0 && i < this.groups[3];
    }

    public final int copyTreeFrom(SlotTableAddressSpace slotTableAddressSpace, int i) {
        return copyTreeFrom$copyGroup(slotTableAddressSpace, this, -1, i);
    }

    public final int distanceFrom$runtime(int i, int i2) {
        int[] iArr = this.groups;
        int i3 = 0;
        while (i != i2 && i >= 0) {
            i3++;
            i = iArr[i + 2];
        }
        return i3;
    }

    public final void freeGroupTree(int i) {
        removeSourceInformation(i);
        freeGroup(i);
    }

    public final na0 getCalledByMap$runtime() {
        return this.calledByMap;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final fb0 getSourceInformationMap() {
        return this.sourceInformationMap;
    }

    public final LinkAnchor moveAnchorFrom(SlotTableAddressSpace slotTableAddressSpace, int i, int i2) {
        this.anchors.a(i2);
        LinkAnchor linkAnchor = (LinkAnchor) slotTableAddressSpace.anchors.g(i);
        if (linkAnchor == null) {
            return null;
        }
        linkAnchor.setAddress(i2);
        this.anchors.i(i2, linkAnchor);
        return linkAnchor;
    }

    public final void moveSourceInformation(SlotTableAddressSpace slotTableAddressSpace, LinkAnchor linkAnchor) {
        fb0 fb0Var;
        LinkGroupSourceInformation linkGroupSourceInformation;
        if (linkAnchor == null || (fb0Var = slotTableAddressSpace.sourceInformationMap) == null || (linkGroupSourceInformation = (LinkGroupSourceInformation) fb0Var.d(linkAnchor)) == null) {
            return;
        }
        fb0 fb0Var2 = this.sourceInformationMap;
        if (fb0Var2 == null) {
            long[] jArr = ql0.a;
            fb0Var2 = new fb0();
            this.sourceInformationMap = fb0Var2;
        } else {
            fb0Var2.a(linkAnchor);
        }
        fb0Var2.l(linkAnchor, linkGroupSourceInformation);
        fb0Var.j(linkAnchor);
    }

    public final boolean ownsAnchor(LinkAnchor linkAnchor) {
        return this.anchors.b(linkAnchor.getAddress()) == linkAnchor;
    }

    public final Object readSlot(int i, int i2) {
        return this.slots[(this.groups[i + 5] >> 4) + i2];
    }

    public final void recordCalledBy(int i, int i2) {
        na0 na0Var = this.calledByMap;
        if (na0Var == null) {
            na0 na0Var2 = h10.a;
            na0Var = new na0();
            this.calledByMap = na0Var;
        }
        Object b = na0Var.b(i);
        if (b == null) {
            int[] iArr = n10.a;
            b = new oa0();
            na0Var.i(i, b);
        }
        ((oa0) b).b(i2);
    }

    public final void recordLargeBlock(int i, int i2) {
        getLargeSizes().g(i, i2);
    }

    public final void recordMovedSourceInformation(int i, int i2) {
        LinkGroupSourceInformation linkGroupSourceInformation;
        fb0 fb0Var = this.sourceInformationMap;
        if (fb0Var == null) {
            return;
        }
        LinkAnchor linkAnchor = (LinkAnchor) this.anchors.b(this.groups[i + 2]);
        if (linkAnchor == null || (linkGroupSourceInformation = (LinkGroupSourceInformation) fb0Var.d(linkAnchor)) == null) {
            return;
        }
        linkGroupSourceInformation.addGroupAfter(i2 != -1 ? anchorOfAddress(i2) : null, anchorOfAddress(i));
    }

    public final LinkGroupSourceInformation recordSourceInformation(int i, String str, int i2) {
        fb0 fb0Var = this.sourceInformationMap;
        fb0 fb0Var2 = fb0Var;
        if (fb0Var == null) {
            long[] jArr = ql0.a;
            fb0 fb0Var3 = new fb0();
            this.sourceInformationMap = fb0Var3;
            fb0Var2 = fb0Var3;
        }
        LinkAnchor anchorOfAddress = anchorOfAddress(i);
        Object d = fb0Var2.d(anchorOfAddress);
        Object obj = d;
        if (d == null) {
            LinkGroupSourceInformation linkGroupSourceInformation = new LinkGroupSourceInformation(0, str, 0);
            if (str == null) {
                int i3 = this.groups[i + 3];
                while (i3 != i2 && i3 != -1) {
                    linkGroupSourceInformation.reportGroup(anchorOfAddress(i3));
                    i3 = this.groups[i3 + 1];
                }
            }
            fb0Var2.l(anchorOfAddress, linkGroupSourceInformation);
            obj = linkGroupSourceInformation;
        }
        return (LinkGroupSourceInformation) obj;
    }

    public final long reserveSlots() {
        int i = this.unallocatedStart;
        int i2 = this.unallocatedEnd;
        this.unallocatedStart = i2;
        return ((i2 & 4294967295L) << 32) | (i & 4294967295L);
    }

    public final int resizeSlotRangeAtGroup(int i, int i2) {
        int d;
        int i3 = this.groups[i + 5];
        if (i3 == -1 && i2 == 0) {
            return i3;
        }
        if (i3 == -1) {
            d = 0;
        } else {
            int i4 = (i3 & 15) + 1;
            d = i4 > 15 ? getLargeSizes().d(i3 >> 4) : i4;
        }
        return resizeSlotRangeAtGroup(i, d, i2);
    }

    public final void restoreSlots(int i, int i2) {
        if (i2 == this.unallocatedEnd) {
            this.unallocatedStart = i;
        }
    }

    public final void setCalledByMap$runtime(na0 na0Var) {
        this.calledByMap = na0Var;
    }

    public final void setGroups(int[] iArr) {
        this.groups = iArr;
    }

    public final void setSlots(Object[] objArr) {
        this.slots = objArr;
    }

    public final void setSourceInformationMap(fb0 fb0Var) {
        this.sourceInformationMap = fb0Var;
    }

    public final <R> R slotAddressAndSize(int i, my myVar) {
        int i2 = (i & 15) + 1;
        int i3 = i >> 4;
        if (i2 > 15) {
            i2 = getLargeSizes().d(i3);
        }
        return (R) myVar.invoke(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final int slotSize(int i) {
        if (i == -1) {
            return 0;
        }
        int i2 = (i & 15) + 1;
        return i2 > 15 ? getLargeSizes().d(i >> 4) : i2;
    }

    public final LinkGroupSourceInformation sourceInformationOf(int i) {
        LinkAnchor linkAnchor;
        fb0 fb0Var = this.sourceInformationMap;
        if (fb0Var == null || (linkAnchor = (LinkAnchor) this.anchors.b(i)) == null) {
            return null;
        }
        return (LinkGroupSourceInformation) fb0Var.d(linkAnchor);
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder("SlotTableAddressSpace:\n  Group size: ");
        int[] iArr = this.groups;
        sb.append(iArr.length);
        sb.append("\n  Slots size: ");
        sb.append(this.slots.length);
        sb.append("\n\n Groups:\n  Unallocated groups: ");
        int length = (iArr.length - iArr[3]) / 6;
        sb.append(length);
        sb.append('\n');
        int i = 0;
        for (int i2 = iArr[1]; i2 != -1; i2 = iArr[i2 + 1]) {
            i++;
        }
        sb.append("  Free groups:        ");
        sb.append(i);
        sb.append("\n  Total free groups:  ");
        sb.append(i + length);
        sb.append("\n  Used group%:        ");
        sb.append(((iArr.length / 6) - r5) / (iArr.length / 6));
        sb.append("\n\n Slots:\n  Unallocated slots: ");
        sb.append(this.unallocatedEnd - this.unallocatedStart);
        sb.append("\n  Slot used%:    ");
        sb.append(((r3 - this.freeSlotCount) - r1) / this.slots.length);
        sb.append('\n');
        return sb.toString();
    }

    public final void traverseAllChildren$runtime(int i, ky kyVar) {
        int i2;
        if (i < 0 || (i2 = getGroups()[i + 3]) < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = getGroups();
        while (true) {
            kyVar.invoke(Integer.valueOf(i2));
            int i3 = groups[i2 + 1];
            if (i3 >= 0) {
                intStack.push(i3);
            }
            i2 = groups[i2 + 3];
            if (i2 < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    i2 = intStack.pop();
                }
            }
        }
    }

    public final void traverseChildren$runtime(int i, ky kyVar) {
        int[] groups = getGroups();
        for (int i2 = groups[i + 3]; i2 > 0; i2 = groups[i2 + 1]) {
            kyVar.invoke(Integer.valueOf(i2));
        }
    }

    public final void traverseGroup$runtime(int i, boolean z, ky kyVar) {
        int i2;
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = getGroups();
        int i3 = i;
        while (true) {
            kyVar.invoke(Integer.valueOf(i3));
            if ((i3 != i || z) && (i2 = groups[i3 + 1]) >= 0) {
                intStack.push(i2);
            }
            i3 = groups[i3 + 3];
            if (i3 < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    i3 = intStack.pop();
                }
            }
        }
    }

    public final void traverseGroupAndParents$runtime(int i, boolean z, ky kyVar) {
        int[] groups = getGroups();
        int i2 = !z ? groups[i + 2] : i;
        while (i2 > 0) {
            kyVar.invoke(Integer.valueOf(i2));
            i2 = groups[i2 + 2];
        }
        if (i2 != 0) {
            return;
        }
        gy.h(i, "Traversing parent of group not in the slot table: ");
    }

    public final void traverseGroupPartially$runtime(int i, boolean z, ky kyVar) {
        int i2;
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = getGroups();
        int i3 = i;
        while (true) {
            boolean booleanValue = ((Boolean) kyVar.invoke(Integer.valueOf(i3))).booleanValue();
            if ((i3 != i || z) && (i2 = groups[i3 + 1]) >= 0) {
                intStack.push(i2);
            }
            i3 = groups[i3 + 3];
            if (!booleanValue || i3 < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    i3 = intStack.pop();
                }
            }
        }
    }

    public final void traverseParents$runtime(int i, ky kyVar) {
        int[] groups = getGroups();
        int i2 = groups[i + 2];
        while (i2 > 0) {
            kyVar.invoke(Integer.valueOf(i2));
            i2 = groups[i2 + 2];
        }
        if (i2 != 0) {
            return;
        }
        gy.h(i, "Traversing parent of group not in the slot table: ");
    }

    public final void traverseSiblings$runtime(int i, ky kyVar) {
        int[] groups = getGroups();
        while (i >= 0) {
            kyVar.invoke(Integer.valueOf(i));
            i = groups[i + 1];
        }
    }

    public final void traverseSiblingsAfter$runtime(int i, ky kyVar) {
        int[] groups = getGroups();
        for (int i2 = groups[i + 1]; i2 >= 0; i2 = groups[i2 + 1]) {
            kyVar.invoke(Integer.valueOf(i2));
        }
    }

    public final void validate() {
        SlotTableAddresSpaceKt.validateFreeList(this.groups);
        validateSlotReferences(this.groups);
    }

    public final int writeSlot(int i, int i2, Object obj) {
        int i3;
        int[] iArr = this.groups;
        int i4 = i + 5;
        int i5 = iArr[i4];
        if (i5 == -1) {
            i3 = allocateSlots(i2 + 1);
            iArr[i4] = i3;
        } else {
            int i6 = (i5 & 15) + 1;
            int i7 = i5 >> 4;
            if (i6 > 15) {
                i6 = getLargeSizes().d(i7);
            }
            if (i2 >= i6) {
                i5 = growSlotRangeAtGroup(i, i6, i2 + 1);
            }
            i3 = i5;
        }
        this.slots[(i3 >> 4) + i2] = obj;
        return i3;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getSourceInformationMap$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SlotTableAddressSpace(int i, int i2) {
        this(r1, r2);
        int[] newGroupsArray;
        Object[] newSlotsArray;
        newGroupsArray = SlotTableAddresSpaceKt.newGroupsArray(i);
        newSlotsArray = SlotTableAddresSpaceKt.newSlotsArray(i2);
    }

    public SlotTableAddressSpace(int[] iArr, Object[] objArr) {
        this.groups = iArr;
        this.slots = objArr;
        this.unallocatedEnd = objArr.length;
        na0 na0Var = h10.a;
        this.anchors = new na0();
    }

    public final int resizeSlotRangeAtGroup(int i, int i2, int i3) {
        if (i3 == i2) {
            return this.groups[i + 5];
        }
        if (i3 > i2) {
            return growSlotRangeAtGroup(i, i2, i3);
        }
        return shrinkSlotRangeAtGroup(i, i2, i3);
    }
}
