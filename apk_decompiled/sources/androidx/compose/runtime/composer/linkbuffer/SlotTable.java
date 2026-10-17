package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.bo0;
import defpackage.cd0;
import defpackage.cq;
import defpackage.dq;
import defpackage.fb0;
import defpackage.gy;
import defpackage.j50;
import defpackage.kp0;
import defpackage.ky;
import defpackage.my;
import defpackage.n10;
import defpackage.n20;
import defpackage.na0;
import defpackage.o;
import defpackage.oa0;
import defpackage.p10;
import defpackage.pl0;
import defpackage.q10;
import defpackage.ql0;
import defpackage.ut;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTable extends SlotStorage implements CompositionData, Iterable<CompositionGroup>, n20 {
    private final SlotTableAddressSpace addressSpace;
    private SlotTableEditor currentEditor;
    private int openReaders;
    private boolean recordCallByInformation;
    private boolean recordSourceInformation;
    private int root;
    private int version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class DebugGroup {
        private final int address;

        public DebugGroup(int i) {
            this.address = i;
        }

        public final int getAddress() {
            return this.address;
        }

        public final Object getAux() {
            if ((getFlags() & GroupFlagsKt.HasAuxSlotFlag) != 33554432) {
                return Composer.Companion.getEmpty();
            }
            return SlotTable.this.getSlots()[Integer.bitCount(getFlags() & 25165824) + getSlotRange().getAddress()];
        }

        public final List<DebugGroup> getChildren() {
            bo0 y = p10.y(new SlotTable$DebugGroup$children$1(SlotTable.this, this, null));
            if (!y.hasNext()) {
                return ut.d;
            }
            Object next = y.next();
            if (!y.hasNext()) {
                return y80.D(next);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(next);
            while (y.hasNext()) {
                arrayList.add(y.next());
            }
            return arrayList;
        }

        public final int getFlags() {
            return SlotTable.this.getGroups()[this.address + 4];
        }

        public final boolean getHasMovableContent() {
            return (getFlags() & GroupFlagsKt.HasMovableContentFlag) == 536870912;
        }

        public final boolean getHasRecomposeRequired() {
            return (getFlags() & GroupFlagsKt.HasRecompositionRequiredFlag) == 134217728;
        }

        public final boolean getHasSubComposition() {
            return (getFlags() & Integer.MIN_VALUE) == Integer.MIN_VALUE;
        }

        public final int getKey() {
            return SlotTable.this.getGroups()[this.address];
        }

        public final Object getNode() {
            if ((getFlags() & GroupFlagsKt.IsNodeFlag) != 8388608) {
                return Composer.Companion.getEmpty();
            }
            Object[] slots = SlotTable.this.getSlots();
            int address = getSlotRange().getAddress();
            getFlags();
            return slots[address];
        }

        public final Object getObjectKey() {
            if ((getFlags() & GroupFlagsKt.HasObjectKeyFlag) != 16777216) {
                return Composer.Companion.getEmpty();
            }
            return SlotTable.this.getSlots()[Integer.bitCount(getFlags() & GroupFlagsKt.IsNodeFlag) + getSlotRange().getAddress()];
        }

        public final DebugSlotRange getSlotRange() {
            SlotTable slotTable = SlotTable.this;
            return slotTable.new DebugSlotRange(slotTable.getGroups()[this.address + 5]);
        }

        public final List<Object> getSlots() {
            bo0 y = p10.y(new SlotTable$DebugGroup$slots$1(this, SlotTable.this, null));
            if (!y.hasNext()) {
                return ut.d;
            }
            Object next = y.next();
            if (!y.hasNext()) {
                return y80.D(next);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(next);
            while (y.hasNext()) {
                arrayList.add(y.next());
            }
            return arrayList;
        }

        public final boolean isMovableContent() {
            return (getFlags() & GroupFlagsKt.IsMovableContentFlag) == 268435456;
        }

        public final boolean isNode() {
            return (getFlags() & GroupFlagsKt.IsNodeFlag) == 8388608;
        }

        public final boolean isRecomposeRequired() {
            return (getFlags() & GroupFlagsKt.IsRecompositionRequiredFlag) == 67108864;
        }

        public final boolean isSubComposition() {
            return (getFlags() & GroupFlagsKt.IsRecompositionRequiredFlag) == 67108864;
        }

        public String toString() {
            SlotTable slotTable = SlotTable.this;
            StringBuilder sb = new StringBuilder("Group(");
            sb.append(getKey());
            if ((getFlags() & (-67108864)) != 0) {
                sb.append(", flags=");
                if (isMovableContent()) {
                    sb.append('C');
                }
                if (getHasMovableContent()) {
                    sb.append('c');
                }
                if (isSubComposition()) {
                    sb.append('S');
                }
                if (getHasSubComposition()) {
                    sb.append('s');
                }
                if (isRecomposeRequired()) {
                    sb.append('R');
                }
                if (getHasRecomposeRequired()) {
                    sb.append('r');
                }
            }
            if ((getFlags() & GroupFlagsKt.HasObjectKeyFlag) == 16777216) {
                sb.append(", object key");
            }
            if ((getFlags() & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
                sb.append(", aux");
            }
            if (isNode()) {
                sb.append(", node");
            }
            int[] groups = slotTable.getGroups();
            int i = this.address;
            if (groups[i + 3] != -1) {
                int[] groups2 = slotTable.getAddressSpace().getGroups();
                int i2 = 0;
                for (int i3 = groups2[i + 3]; i3 > 0; i3 = groups2[i3 + 1]) {
                    i2++;
                }
                sb.append(", ");
                sb.append(i2);
                sb.append(i2 == 1 ? " child" : " children");
            }
            if (slotTable.getGroups()[this.address + 5] != -1) {
                sb.append(", ");
                sb.append(getSlotRange().getSize());
                sb.append(" slots");
            }
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class DebugSlotRange {
        private final int range;

        public DebugSlotRange(int i) {
            this.range = i;
        }

        public final int getAddress() {
            return this.range >> 4;
        }

        public final int getEnd() {
            return getSize() + getAddress();
        }

        public final int getRange() {
            return this.range;
        }

        public final int getSize() {
            SlotTableAddressSpace addressSpace = SlotTable.this.getAddressSpace();
            int i = this.range;
            if (i == -1) {
                return 0;
            }
            int i2 = (i & 15) + 1;
            return i2 > 15 ? addressSpace.getLargeSizes().d(i >> 4) : i2;
        }
    }

    public /* synthetic */ SlotTable(int i, SlotTableAddressSpace slotTableAddressSpace, boolean z, boolean z2, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? new SlotTableAddressSpace() : slotTableAddressSpace, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i) {
        int[] groups = getAddressSpace().getGroups();
        int i2 = i;
        while (true) {
            if (i2 <= 0) {
                if (i2 != 0) {
                    return null;
                }
                gy.h(i, "Traversing parent of group not in the slot table: ");
                return null;
            }
            RecomposeScopeImpl recomposeScopeOrNull$runtime = getRecomposeScopeOrNull$runtime(i2);
            if (recomposeScopeOrNull$runtime != null) {
                if (recomposeScopeOrNull$runtime.getUsed() && i2 != i) {
                    return recomposeScopeOrNull$runtime;
                }
                recomposeScopeOrNull$runtime.setForcedRecompose(true);
            }
            i2 = groups[i2 + 2];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] getGroups() {
        return this.addressSpace.getGroups();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] getSlots() {
        return this.addressSpace.getSlots();
    }

    private static final void toDebugString$lambda$0$dumpGroup(StringBuilder sb, SlotTable slotTable, boolean z, int i, String str) {
        int i2;
        String summarize;
        String summarize2;
        String summarize3;
        String summarize4;
        sb.append(str);
        int[] groups = slotTable.addressSpace.getGroups();
        StringBuilder f = kp0.f(i, "Group(", ") key: ");
        f.append(groups[i]);
        sb.append(f.toString());
        Object[] slots = slotTable.addressSpace.getSlots();
        int i3 = groups[i + 5];
        int i4 = groups[i + 4];
        int i5 = 8388607 & i4;
        if (i5 > 0) {
            sb.append(" Nodes: ");
            sb.append(i5);
        }
        if (((-67108864) & i4) != 0) {
            sb.append(" Marks: ");
            if ((i4 & GroupFlagsKt.IsMovableContentFlag) == 268435456) {
                sb.append('C');
            }
            if ((i4 & GroupFlagsKt.HasMovableContentFlag) == 536870912) {
                sb.append('c');
            }
            if ((i4 & GroupFlagsKt.IsSubcompositionContextFlag) == 1073741824) {
                sb.append('S');
            }
            if ((i4 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                sb.append('s');
            }
            if ((i4 & GroupFlagsKt.IsRecompositionRequiredFlag) == 67108864) {
                sb.append('R');
            }
            if ((i4 & GroupFlagsKt.HasRecompositionRequiredFlag) == 134217728) {
                sb.append('r');
            }
        }
        if (z) {
            int i6 = i3 >> 4;
            if (i3 != -1) {
                SlotTableAddressSpace slotTableAddressSpace = slotTable.addressSpace;
                if (i3 == -1) {
                    i2 = 0;
                } else {
                    i2 = (i3 & 15) + 1;
                    if (i2 > 15) {
                        i2 = slotTableAddressSpace.getLargeSizes().d(i6);
                    }
                }
                int i7 = i2 + i6;
                if ((i4 & GroupFlagsKt.IsNodeFlag) == 8388608) {
                    sb.append(" Node: ");
                    int i8 = i6 + 1;
                    summarize4 = SlotTableKt.summarize(slots[i6], 10);
                    sb.append(summarize4);
                    i6 = i8;
                }
                if ((i4 & GroupFlagsKt.HasObjectKeyFlag) == 16777216) {
                    sb.append(" Key: ");
                    int i9 = i6 + 1;
                    summarize3 = SlotTableKt.summarize(slots[i6], 10);
                    sb.append(summarize3);
                    i6 = i9;
                }
                if ((i4 & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
                    sb.append(" Aux: ");
                    int i10 = i6 + 1;
                    summarize2 = SlotTableKt.summarize(slots[i6], 10);
                    sb.append(summarize2);
                    i6 = i10;
                }
                if (i6 < i7) {
                    sb.append(" (" + i6 + '-' + i7 + ")[");
                    while (i6 < i7) {
                        int i11 = i6 + 1;
                        summarize = SlotTableKt.summarize(slots[i6], 10);
                        sb.append(summarize);
                        if (i11 < i7) {
                            sb.append(", ");
                        }
                        i6 = i11;
                    }
                    sb.append("]");
                }
            }
        }
        sb.append(':');
        sb.append('\n');
        String str2 = str + "  ";
        int[] groups2 = slotTable.getAddressSpace().getGroups();
        for (int i12 = groups2[i + 3]; i12 > 0; i12 = groups2[i12 + 1]) {
            toDebugString$lambda$0$dumpGroup(sb, slotTable, z, i12, str2);
        }
    }

    public static /* synthetic */ void traverseGroup$runtime$default(SlotTable slotTable, int i, boolean z, ky kyVar, int i2, Object obj) {
        int i3;
        if ((i2 & 2) != 0) {
            z = false;
        }
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
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

    private static final int verifyWellFormed$validateGroup(oa0 oa0Var, int[] iArr, SlotTable slotTable, Object[] objArr, int i, int i2) {
        String flagsNames;
        String flagsNames2;
        String flagsNames3;
        if (i2 == -1) {
            return 0;
        }
        if (oa0Var.a(i2)) {
            o.b(i2, "Circular group encountered at ");
            return 0;
        }
        oa0Var.b(i2);
        if (i2 % 6 != 0) {
            o.b(i2, "Invalid group address: ");
            return 0;
        }
        if (iArr[i2 + 2] != i) {
            o.b(i2, "Invalid parent link in group ");
            return 0;
        }
        SlotTable slotTable2 = slotTable;
        Object[] objArr2 = objArr;
        verifyWellFormed$validateSlotRange(slotTable2, objArr2, i2, iArr[i2 + 5]);
        int i3 = i2 + 4;
        int i4 = iArr[i3] & GroupFlagsKt.HasMarkFlags;
        int[] groups = slotTable2.getAddressSpace().getGroups();
        int i5 = groups[i2 + 3];
        int i6 = 0;
        int i7 = 0;
        while (i5 > 0) {
            i6 += verifyWellFormed$validateGroup(oa0Var, iArr, slotTable2, objArr2, i2, i5);
            int propagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(iArr[i5 + 4]);
            i7 |= propagatingFlagsOf;
            if (propagatingFlagsOf != 0 && (i4 & propagatingFlagsOf) == 0) {
                StringBuilder j = j50.j("Group ", i5, " contains a flag that the parent, ", i2, ", is not recorded as having, ");
                cq.f(16);
                String num = Integer.toString(propagatingFlagsOf, 16);
                num.getClass();
                j.append(num);
                j.append(' ');
                flagsNames3 = SlotTableKt.flagsNames(propagatingFlagsOf);
                j.append(flagsNames3);
                throw new IllegalStateException(j.toString().toString());
            }
            i5 = groups[i5 + 1];
            slotTable2 = slotTable;
            objArr2 = objArr;
        }
        int i8 = iArr[i3];
        int i9 = 8388607 & i8;
        if (i9 != i6) {
            StringBuilder j2 = j50.j("Unexpected node count for group ", i2, ", expected ", i6, ", received: ");
            j2.append(i9);
            throw new IllegalStateException(j2.toString().toString());
        }
        if (i4 == i7) {
            if ((i8 & GroupFlagsKt.IsNodeFlag) == 8388608) {
                return 1;
            }
            return i9;
        }
        cq.f(16);
        String num2 = Integer.toString(i7, 16);
        num2.getClass();
        flagsNames = SlotTableKt.flagsNames(i7);
        cq.f(16);
        String num3 = Integer.toString(i4, 16);
        num3.getClass();
        flagsNames2 = SlotTableKt.flagsNames(i4);
        throw new IllegalStateException(("Unexpected has mark flags for group " + i2 + ", expected " + num2 + ' ' + flagsNames + ", received " + num3 + ' ' + flagsNames2).toString());
    }

    private static final void verifyWellFormed$validateSlotRange(SlotTable slotTable, Object[] objArr, int i, int i2) {
        if (i2 == -1) {
            return;
        }
        SlotTableAddressSpace slotTableAddressSpace = slotTable.addressSpace;
        int i3 = (i2 & 15) + 1;
        int i4 = i2 >> 4;
        if (i3 > 15) {
            slotTableAddressSpace.getLargeSizes().d(i4);
        }
        if (i4 < 0 || i4 >= objArr.length) {
            throw new IllegalStateException(("Slot index for group " + i + " out of bounds: " + i4).toString());
        }
    }

    public final SlotTable buildSubTable(ky kyVar) {
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(getAddressSpace(), false, false);
        slotTableBuilder.buildStart();
        kyVar.invoke(slotTableBuilder);
        return slotTableBuilder.build();
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void clear(RememberManager rememberManager) {
        SlotTableEditor openEditor = openEditor();
        try {
            SlotTableKt.removeCurrentGroup(openEditor, rememberManager);
        } finally {
            openEditor.close();
        }
    }

    public final void closeEditor(SlotTableEditor slotTableEditor) {
        if (!(this.currentEditor == slotTableEditor)) {
            ComposerKt.composeImmediateRuntimeError("Attempted to close an editor that was not the current editor");
        }
        this.currentEditor = null;
    }

    public final void closeReader(SlotTableReader slotTableReader) {
        if (!(slotTableReader.getTable() == this && this.openReaders > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.openReaders--;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void collectCalledByInformation() {
        this.recordCallByInformation = true;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void collectSourceInformation() {
        this.recordSourceInformation = true;
    }

    public final boolean contains(int i) {
        if (i >= 0 && this.addressSpace.contains(i)) {
            int[] groups = this.addressSpace.getGroups();
            int i2 = groups[i + 2];
            while (true) {
                if (i2 <= 0) {
                    if (!(i2 != 0)) {
                        gy.h(i, "Traversing parent of group not in the slot table: ");
                    }
                } else {
                    if (i2 == this.root) {
                        return true;
                    }
                    i2 = groups[i2 + 2];
                }
            }
        }
        return false;
    }

    public final boolean containsFlags(int i) {
        return !isEmpty() && (this.addressSpace.getGroups()[this.root + 4] & i) == i;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void deactivateAll(RememberManager rememberManager) {
        SlotTableEditor openEditor = openEditor();
        try {
            SlotTableKt.deactivateCurrentGroup(openEditor, rememberManager);
        } finally {
            openEditor.close();
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void dispose() {
        int i = this.root;
        if (i != -1) {
            this.addressSpace.freeGroupTree(i);
            this.root = -1;
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void disposeUnusedMovableContent(RememberManager rememberManager, MovableContentState movableContentState) {
        SlotTableEditor openEditor = openEditor();
        try {
            SlotTableKt.removeCurrentGroup(openEditor, rememberManager);
        } finally {
            openEditor.close();
        }
    }

    public final <T> T edit(ky kyVar) {
        SlotTableEditor openEditor = openEditor();
        try {
            return (T) kyVar.invoke(openEditor);
        } finally {
            openEditor.close();
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public pl0 extractNestedStates(Applier<?> applier, cd0 cd0Var) {
        MovableContentState extractMovableContentAtCurrent;
        long[] jArr = ql0.a;
        fb0 fb0Var = new fb0();
        SlotTableEditor openEditor = openEditor();
        try {
            Object[] objArr = cd0Var.a;
            int i = cd0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i2];
                LinkAnchor asLinkAnchor = LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime());
                if (openEditor.getTable().contains(asLinkAnchor)) {
                    openEditor.seek(asLinkAnchor);
                    extractMovableContentAtCurrent = SlotTableKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition$runtime(), movableContentStateReference, openEditor, applier);
                    fb0Var.l(movableContentStateReference, extractMovableContentAtCurrent);
                }
            }
            return fb0Var;
        } finally {
            openEditor.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return new SlotTableGroup(this, this.root, this.version).find(obj);
    }

    public final int firstChildOf$runtime(int i) {
        return getGroups()[i + 3];
    }

    public final void forEachGroupSlot$runtime(int i, my myVar) {
        int i2 = getGroups()[i + 5];
        if (i2 != -1) {
            SlotTableAddressSpace addressSpace = getAddressSpace();
            int i3 = (i2 & 15) + 1;
            int i4 = i2 >> 4;
            if (i3 > 15) {
                i3 = addressSpace.getLargeSizes().d(i4);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = getSlots()[i4 + i5];
                if (q10.b(obj, Composer.Companion.getEmpty())) {
                    return;
                }
                myVar.invoke(obj, Integer.valueOf(i5));
            }
        }
    }

    public final void forEachSlot$runtime(ky kyVar) {
        if (getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot read while an editor is pending");
        }
        SlotTableAddressSpace addressSpace = getAddressSpace();
        int root = getRoot();
        if (root < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        while (true) {
            int i = getGroups()[root + 5];
            if (i != -1) {
                SlotTableAddressSpace addressSpace2 = getAddressSpace();
                int i2 = (i & 15) + 1;
                int i3 = i >> 4;
                if (i2 > 15) {
                    i2 = addressSpace2.getLargeSizes().d(i3);
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = getSlots()[i3 + i4];
                    if (q10.b(obj, Composer.Companion.getEmpty())) {
                        break;
                    }
                    kyVar.invoke(obj);
                }
            }
            int i5 = groups[root + 1];
            if (i5 >= 0) {
                intStack.push(i5);
            }
            root = groups[root + 3];
            if (root < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    root = intStack.pop();
                }
            }
        }
    }

    public final SlotTableAddressSpace getAddressSpace() {
        return this.addressSpace;
    }

    public final boolean getHasEditor() {
        return this.currentEditor != null;
    }

    public final RecomposeScopeImpl getRecomposeScopeOrNull$runtime(int i) {
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        Object[] slots = slotTableAddressSpace.getSlots();
        int i2 = groups[i + 5];
        if (i2 == -1) {
            return null;
        }
        int i3 = (i2 & 15) + 1;
        int i4 = i2 >> 4;
        if (i3 > 15) {
            i3 = slotTableAddressSpace.getLargeSizes().d(i4);
        }
        int i5 = i3 + i4;
        int utilitySlotsCountForFlags = GroupFlagsKt.utilitySlotsCountForFlags(groups[i + 4]) + i4;
        if (utilitySlotsCountForFlags <= i5) {
            Object obj = slots[utilitySlotsCountForFlags];
            if (obj instanceof RecomposeScopeImpl) {
                return (RecomposeScopeImpl) obj;
            }
        }
        return null;
    }

    public final boolean getRecordCallByInformation() {
        return this.recordCallByInformation;
    }

    public final boolean getRecordSourceInformation() {
        return this.recordSourceInformation;
    }

    public final int getRoot() {
        return this.root;
    }

    public final int getVersion() {
        return this.version;
    }

    public final Object groupAux$runtime(int i) {
        int i2 = getGroups()[i + 4];
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
            return groupSlotAtIndex$runtime(i, Integer.bitCount(i2 & 25165824));
        }
        return null;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean groupContainsAnchor(int i, Anchor anchor) {
        LinkAnchor asLinkAnchor = LinkAnchorKt.asLinkAnchor(anchor);
        return this.addressSpace.ownsAnchor(asLinkAnchor) && isGroupAChildOf$runtime(asLinkAnchor.getAddress(), i);
    }

    public final int groupFlags$runtime(int i) {
        return getGroups()[i + 4];
    }

    public final boolean groupHasAux$runtime(int i) {
        return (getGroups()[i + 4] & GroupFlagsKt.HasAuxSlotFlag) == 33554432;
    }

    public final int groupKeyOf$runtime(int i) {
        return getGroups()[i];
    }

    public final Object groupNode$runtime(int i) {
        if ((getGroups()[i + 4] & GroupFlagsKt.IsNodeFlag) == 8388608) {
            return groupSlotAtIndex$runtime(i, 0);
        }
        return null;
    }

    public final Object groupObjectKey$runtime(int i) {
        int i2 = getGroups()[i + 4];
        if ((i2 & GroupFlagsKt.HasObjectKeyFlag) == 16777216) {
            return groupSlotAtIndex$runtime(i, Integer.bitCount(i2 & GroupFlagsKt.IsNodeFlag));
        }
        return null;
    }

    public final Object groupSlotAtIndex$runtime(int i, int i2) {
        int i3 = i + 5;
        if (getGroups()[i3] == -1 || i2 < 0) {
            return null;
        }
        int i4 = getGroups()[i3];
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int i5 = (i4 & 15) + 1;
        int i6 = i4 >> 4;
        if (i5 > 15) {
            i5 = slotTableAddressSpace.getLargeSizes().d(i6);
        }
        if (i2 >= i5) {
            return null;
        }
        return getSlots()[i6 + i2];
    }

    public final int groupSlotRange$runtime(int i) {
        return getGroups()[i + 5];
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0024 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasRecomposeScopes(int i) {
        RecomposeScopeImpl recomposeScopeOrNullInRegion;
        int i2;
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        SlotTableAddressSpace addressSpace = getAddressSpace();
        if (i < 0) {
            return false;
        }
        IntStack intStack = new IntStack();
        int[] groups2 = addressSpace.getGroups();
        int i3 = i;
        while (recomposeScopeOrNullInRegion == null) {
            if (i3 != i && (i2 = groups2[i3 + 1]) >= 0) {
                intStack.push(i2);
            }
            i3 = groups2[i3 + 3];
            if (i3 < 0) {
                if (intStack.tos == 0) {
                    return false;
                }
                i3 = intStack.pop();
            }
        }
        return true;
    }

    public final boolean inGroup(LinkAnchor linkAnchor, LinkAnchor linkAnchor2) {
        if (!linkAnchor.getValid() || !linkAnchor2.getValid()) {
            return false;
        }
        if (linkAnchor == linkAnchor2) {
            return true;
        }
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (!slotTableAddressSpace.ownsAnchor(linkAnchor2) || !slotTableAddressSpace.ownsAnchor(linkAnchor)) {
            return false;
        }
        int address = linkAnchor.getAddress();
        int address2 = linkAnchor2.getAddress();
        if (!slotTableAddressSpace.contains(address) || !slotTableAddressSpace.contains(address2)) {
            return false;
        }
        int[] groups = slotTableAddressSpace.getGroups();
        int i = groups[address2 + 2];
        while (i > 0) {
            if (i == address) {
                return true;
            }
            if (address <= 0) {
                return false;
            }
            i = groups[i + 2];
        }
        if (!(i != 0)) {
            gy.h(address2, "Traversing parent of group not in the slot table: ");
        }
        return false;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void invalidateAll() {
        if (getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot read while an editor is pending");
        }
        SlotTableAddressSpace addressSpace = getAddressSpace();
        int root = getRoot();
        if (root < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        while (true) {
            int i = getGroups()[root + 5];
            if (i != -1) {
                SlotTableAddressSpace addressSpace2 = getAddressSpace();
                int i2 = (i & 15) + 1;
                int i3 = i >> 4;
                if (i2 > 15) {
                    i2 = addressSpace2.getLargeSizes().d(i3);
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = getSlots()[i3 + i4];
                    if (q10.b(obj, Composer.Companion.getEmpty())) {
                        break;
                    }
                    RecomposeScope recomposeScope = obj instanceof RecomposeScope ? (RecomposeScope) obj : null;
                    if (recomposeScope != null) {
                        recomposeScope.invalidate();
                    }
                }
            }
            int i5 = groups[root + 1];
            if (i5 >= 0) {
                intStack.push(i5);
            }
            root = groups[root + 3];
            if (root < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    root = intStack.pop();
                }
            }
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public List<RecomposeScopeImpl> invalidateGroupsWithKey(int i) {
        boolean z;
        boolean z2;
        int i2;
        RecomposeScopeImpl findEffectiveRecomposeScope;
        LinkAnchor asLinkAnchor;
        oa0 oa0Var;
        oa0 oa0Var2 = new oa0();
        ArrayList arrayList = new ArrayList();
        oa0 oa0Var3 = new oa0();
        oa0Var3.b(i);
        oa0Var3.b(-3);
        na0 calledByMap$runtime = this.addressSpace.getCalledByMap$runtime();
        if (calledByMap$runtime != null && (oa0Var = (oa0) calledByMap$runtime.b(i)) != null) {
            oa0Var3.c(oa0Var);
        }
        int i3 = this.root;
        SlotTableAddressSpace addressSpace = getAddressSpace();
        boolean z3 = true;
        if (i3 >= 0) {
            IntStack intStack = new IntStack();
            int[] groups = addressSpace.getGroups();
            int i4 = i3;
            while (true) {
                int i5 = this.addressSpace.getGroups()[i4];
                if (oa0Var3.a(i5)) {
                    if (i5 != -3) {
                        oa0Var2.b[oa0Var2.e(i4)] = i4;
                    }
                    if (z3) {
                        RecomposeScopeImpl findEffectiveRecomposeScope2 = findEffectiveRecomposeScope(i4);
                        if (findEffectiveRecomposeScope2 != null) {
                            arrayList.add(findEffectiveRecomposeScope2);
                            Anchor anchor = findEffectiveRecomposeScope2.getAnchor();
                            Integer valueOf = (anchor == null || (asLinkAnchor = LinkAnchorKt.asLinkAnchor(anchor)) == null) ? null : Integer.valueOf(asLinkAnchor.getAddress());
                            if (valueOf != null && valueOf.intValue() == i4 && (findEffectiveRecomposeScope = findEffectiveRecomposeScope(this.addressSpace.getGroups()[i4 + 2])) != null) {
                                arrayList.add(findEffectiveRecomposeScope);
                            }
                        } else {
                            arrayList.clear();
                            z3 = false;
                        }
                    }
                }
                if (i4 != i3 && (i2 = groups[i4 + 1]) >= 0) {
                    intStack.push(i2);
                }
                i4 = groups[i4 + 3];
                if (i4 < 0) {
                    if (intStack.tos == 0) {
                        break;
                    }
                    i4 = intStack.pop();
                }
            }
        }
        SlotTableEditor openEditor = openEditor();
        try {
            int[] iArr = oa0Var2.b;
            long[] jArr = oa0Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j = jArr[i6];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j) < 128) {
                                z2 = z3;
                                openEditor.seek(iArr[(i6 << 3) + i8] & 4294967295L);
                                openEditor.bashGroup$runtime(-3);
                            } else {
                                z2 = z3;
                            }
                            j >>= 8;
                            i8++;
                            z3 = z2;
                        }
                        z = z3;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        z = z3;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    z3 = z;
                }
            } else {
                z = z3;
            }
            if (z) {
                return arrayList;
            }
            return null;
        } finally {
            openEditor.close();
        }
    }

    @Override // androidx.compose.runtime.SlotStorage, androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.root == -1;
    }

    public final boolean isGroupAChildOf$runtime(int i, int i2) {
        int[] groups = getAddressSpace().getGroups();
        int i3 = i;
        while (true) {
            if (i3 <= 0) {
                if (!(i3 != 0)) {
                    gy.h(i, "Traversing parent of group not in the slot table: ");
                }
                return false;
            }
            if (i3 == i2) {
                return true;
            }
            i3 = groups[i3 + 2];
        }
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, this.root);
    }

    public final SlotTable newTableInSameAddressSpace() {
        return new SlotTable(0, this.addressSpace, this.recordSourceInformation, this.recordCallByInformation, 1, null);
    }

    public final int nextSiblingOf$runtime(int i) {
        return getGroups()[i + 1];
    }

    public final SlotTableEditor openEditor() {
        if (getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.openReaders <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.version++;
        SlotTableEditor slotTableEditor = new SlotTableEditor(this);
        this.currentEditor = slotTableEditor;
        return slotTableEditor;
    }

    public final SlotTableReader openReader() {
        if (getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot read while a writer is pending");
        }
        this.openReaders++;
        return new SlotTableReader(this);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean ownsRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor != null) {
            LinkAnchor asLinkAnchor = LinkAnchorKt.asLinkAnchor(anchor);
            if (this.addressSpace.ownsAnchor(asLinkAnchor) && isGroupAChildOf$runtime(asLinkAnchor.getAddress(), this.root)) {
                return true;
            }
        }
        return false;
    }

    public final <T> T read(ky kyVar) {
        SlotTableReader openReader = openReader();
        try {
            return (T) kyVar.invoke(openReader);
        } finally {
            openReader.close();
        }
    }

    public final long rootHandle() {
        return (this.root & 4294967295L) | (-4294967296L);
    }

    public final void setRecordCallByInformation(boolean z) {
        this.recordCallByInformation = z;
    }

    public final void setRecordSourceInformation(boolean z) {
        this.recordSourceInformation = z;
    }

    public final void setRoot(int i) {
        this.root = i;
    }

    public final String toDebugString(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("SlotTable(\n");
        int[] groups = getAddressSpace().getGroups();
        for (int i = this.root; i >= 0; i = groups[i + 1]) {
            toDebugString$lambda$0$dumpGroup(sb, this, z, i, "  ");
        }
        sb.append(")");
        return sb.toString();
    }

    public final Object toDebugTree$runtime() {
        List list;
        bo0 y = p10.y(new SlotTable$toDebugTree$1(this, null));
        if (y.hasNext()) {
            Object next = y.next();
            if (y.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (y.hasNext()) {
                    arrayList.add(y.next());
                }
                list = arrayList;
            } else {
                list = y80.D(next);
            }
        } else {
            list = ut.d;
        }
        return list.size() == 1 ? yi.p0(list) : list;
    }

    public final void traverseChildren$runtime(int i, ky kyVar) {
        int[] groups = getAddressSpace().getGroups();
        for (int i2 = groups[i + 3]; i2 > 0; i2 = groups[i2 + 1]) {
            kyVar.invoke(Integer.valueOf(i2));
        }
    }

    public final void traverseGroup$runtime(int i, boolean z, ky kyVar) {
        int i2;
        SlotTableAddressSpace addressSpace = getAddressSpace();
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
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

    public final void traverseGroupAndParents$runtime(int i, ky kyVar) {
        int[] groups = getAddressSpace().getGroups();
        int i2 = i;
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
        int[] groups = getAddressSpace().getGroups();
        while (i >= 0) {
            kyVar.invoke(Integer.valueOf(i));
            i = groups[i + 1];
        }
    }

    public final void traverseTable$runtime(ky kyVar) {
        SlotTableAddressSpace addressSpace = getAddressSpace();
        int root = getRoot();
        if (root < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        while (true) {
            kyVar.invoke(Integer.valueOf(root));
            int i = groups[root + 1];
            if (i >= 0) {
                intStack.push(i);
            }
            root = groups[root + 3];
            if (root < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    root = intStack.pop();
                }
            }
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void verifyWellFormed() {
        this.addressSpace.validate();
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        int[] iArr = n10.a;
        oa0 oa0Var = new oa0();
        int i = this.root;
        int[] groups2 = getAddressSpace().getGroups();
        for (int i2 = i; i2 >= 0; i2 = groups2[i2 + 1]) {
            verifyWellFormed$validateGroup(oa0Var, groups, this, slots, -1, i2);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public static /* synthetic */ SlotTable build$default(Companion companion, SlotTableAddressSpace slotTableAddressSpace, ky kyVar, int i, Object obj) {
            if ((i & 1) != 0) {
                slotTableAddressSpace = new SlotTableAddressSpace();
            }
            SlotTableBuilder slotTableBuilder = new SlotTableBuilder(slotTableAddressSpace, false, false);
            slotTableBuilder.buildStart();
            kyVar.invoke(slotTableBuilder);
            return slotTableBuilder.build();
        }

        public final SlotTable build(SlotTableAddressSpace slotTableAddressSpace, ky kyVar) {
            SlotTableBuilder slotTableBuilder = new SlotTableBuilder(slotTableAddressSpace, false, false);
            slotTableBuilder.buildStart();
            kyVar.invoke(slotTableBuilder);
            return slotTableBuilder.build();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    /* renamed from: getSlots, reason: collision with other method in class */
    public Iterable<Object> mo4029getSlots() {
        return new SlotTable$getSlots$1(this);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public SlotTable(int i, SlotTableAddressSpace slotTableAddressSpace, boolean z, boolean z2) {
        this.root = i;
        this.addressSpace = slotTableAddressSpace;
        this.recordSourceInformation = z;
        this.recordCallByInformation = z2;
    }

    public SlotTable() {
        this(0, null, false, false, 15, null);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public String toDebugString() {
        return toDebugString(true);
    }

    public final boolean contains(LinkAnchor linkAnchor) {
        return linkAnchor.getValid() && this.addressSpace.ownsAnchor(linkAnchor) && contains(linkAnchor.getAddress());
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean inGroup(Anchor anchor, Anchor anchor2) {
        return inGroup(LinkAnchorKt.asLinkAnchor(anchor), LinkAnchorKt.asLinkAnchor(anchor2));
    }
}
