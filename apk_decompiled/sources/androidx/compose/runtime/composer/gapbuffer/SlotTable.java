package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.ac;
import defpackage.cd0;
import defpackage.ds0;
import defpackage.fb0;
import defpackage.fi0;
import defpackage.hi0;
import defpackage.j50;
import defpackage.ks0;
import defpackage.ky;
import defpackage.mb0;
import defpackage.n20;
import defpackage.na0;
import defpackage.o;
import defpackage.oa0;
import defpackage.pl0;
import defpackage.q10;
import defpackage.ql0;
import defpackage.xa0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTable extends SlotStorage implements CompositionData, Iterable<CompositionGroup>, n20 {
    public static final int $stable = 8;
    private na0 calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<GapAnchor, GapGroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private final Object lock = new Object();
    private ArrayList<GapAnchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        List<Integer> dataAnchors;
        dataAnchors = SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
        return dataAnchors;
    }

    private final int emitGroup(StringBuilder sb, int i, int i2) {
        int groupSize;
        int slotAnchor;
        String summarize;
        int auxIndex;
        String summarize2;
        String summarize3;
        int objectKeyIndex;
        String summarize4;
        String sourceInformation;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(")");
        GapGroupSourceInformation sourceInformationOf = sourceInformationOf(i);
        if (sourceInformationOf != null && (sourceInformation = sourceInformationOf.getSourceInformation()) != null && (ks0.c0(sourceInformation, "C(", false) || ks0.c0(sourceInformation, "CC(", false))) {
            int m0 = ds0.m0(sourceInformation, "(", 0, false, 6) + 1;
            int l0 = ds0.l0(sourceInformation, ')', 0, 6);
            sb.append(" ");
            sb.append(sourceInformation.substring(m0, l0));
            sb.append("()");
        }
        sb.append(" key=");
        int i4 = i * 5;
        sb.append(this.groups[i4]);
        groupSize = SlotTableKt.groupSize(this.groups, i);
        sb.append(", nodes=");
        int i5 = i4 + 1;
        sb.append(this.groups[i5] & 67108863);
        sb.append(", size=");
        sb.append(groupSize);
        if ((this.groups[i5] & GroupFlagsKt.HasRecompositionRequiredFlag) != 0) {
            sb.append(", mark");
        }
        if ((this.groups[i5] & GroupFlagsKt.IsRecompositionRequiredFlag) != 0) {
            sb.append(", contains mark");
        }
        int emitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int i6 = i + 1;
        int emitGroup$dataIndex2 = emitGroup$dataIndex(this, i6);
        if (emitGroup$dataIndex < 0 || emitGroup$dataIndex > emitGroup$dataIndex2 || emitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + emitGroup$dataIndex + '-' + emitGroup$dataIndex2 + '*');
        } else {
            if ((this.groups[i5] & GroupFlagsKt.HasMovableContentFlag) != 0) {
                StringBuilder sb2 = new StringBuilder(" objectKey=");
                Object[] objArr = this.slots;
                objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, i);
                summarize4 = SlotTableKt.summarize(String.valueOf(objArr[objectKeyIndex]), 10);
                sb2.append(summarize4);
                sb.append(sb2.toString());
            }
            if ((this.groups[i5] & GroupFlagsKt.IsSubcompositionContextFlag) != 0) {
                StringBuilder sb3 = new StringBuilder(" node=");
                summarize3 = SlotTableKt.summarize(String.valueOf(this.slots[this.groups[i4 + 4]]), 10);
                sb3.append(summarize3);
                sb.append(sb3.toString());
            }
            if ((this.groups[i5] & GroupFlagsKt.IsMovableContentFlag) != 0) {
                StringBuilder sb4 = new StringBuilder(" aux=");
                Object[] objArr2 = this.slots;
                auxIndex = SlotTableKt.auxIndex(this.groups, i);
                summarize2 = SlotTableKt.summarize(String.valueOf(objArr2[auxIndex]), 10);
                sb4.append(summarize2);
                sb.append(sb4.toString());
            }
            slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
            if (slotAnchor < emitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(slotAnchor);
                sb.append(": ");
                for (int i7 = slotAnchor; i7 < emitGroup$dataIndex2; i7++) {
                    if (i7 != slotAnchor) {
                        sb.append(", ");
                    }
                    summarize = SlotTableKt.summarize(String.valueOf(this.slots[i7]), 10);
                    sb.append(summarize);
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i8 = i + groupSize;
        while (i6 < i8) {
            i6 += emitGroup(sb, i6, i2 + 1);
        }
        return groupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i) {
        return i >= slotTable.groupsSize ? slotTable.slotsSize : slotTable.groups[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer extractNestedStates$lambda$1(SlotTable slotTable, MovableContentStateReference movableContentStateReference) {
        return Integer.valueOf(slotTable.anchorIndex(GapAnchorKt.asGapAnchor(movableContentStateReference.getAnchor$runtime())));
    }

    private static final void extractNestedStates$lambda$2$closeToGroupContaining(SlotWriter slotWriter, int i) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i) {
            slotWriter.skipToGroupEnd();
            slotWriter.endGroup();
        }
    }

    private static final void extractNestedStates$lambda$2$openParent(SlotWriter slotWriter, int i) {
        int nextGroup;
        extractNestedStates$lambda$2$closeToGroupContaining(slotWriter, i);
        while (slotWriter.getCurrentGroup() != i && !slotWriter.isGroupEnd()) {
            nextGroup = SlotTableKt.getNextGroup(slotWriter);
            if (i < nextGroup) {
                slotWriter.startGroup();
            } else {
                slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
        }
        slotWriter.startGroup();
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i) {
        int i2 = i;
        while (i2 > 0) {
            Iterator<Object> it = new DataIterator(this, i2).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i2 != i) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i2 = this.groups[(i2 * 5) + 2];
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        List<Integer> groupSizes;
        groupSizes = SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
        return groupSizes;
    }

    private static final void invalidateGroupsWithKey$lambda$2$scanGroup(SlotReader slotReader, oa0 oa0Var, List<GapAnchor> list, fi0 fi0Var, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        GapAnchor asGapAnchor;
        RecomposeScopeImpl findEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (!oa0Var.a(groupKey)) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$2$scanGroup(slotReader, oa0Var, list, fi0Var, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (fi0Var.d) {
            RecomposeScopeImpl findEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (findEffectiveRecomposeScope2 != null) {
                list2.add(findEffectiveRecomposeScope2);
                Anchor anchor = findEffectiveRecomposeScope2.getAnchor();
                if (anchor != null && (asGapAnchor = GapAnchorKt.asGapAnchor(anchor)) != null && asGapAnchor.getLocation$runtime() == slotReader.getCurrentGroup() && (findEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                    list2.add(findEffectiveRecomposeScope);
                }
            } else {
                fi0Var.d = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        List<Integer> keys;
        keys = SlotTableKt.keys(this.groups, this.groupsSize * 5);
        return keys;
    }

    private final List<Integer> nodes() {
        List<Integer> nodeCounts;
        nodeCounts = SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
        return nodeCounts;
    }

    private final List<Integer> parentIndexes() {
        List<Integer> parentAnchors;
        parentAnchors = SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
        return parentAnchors;
    }

    private final GapAnchor tryAnchor(int i) {
        int i2;
        GapAnchor find;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (i < 0 || i >= (i2 = this.groupsSize)) {
            return null;
        }
        find = SlotTableKt.find(this.anchors, i, i2);
        return find;
    }

    private final void validateRecomposeScopeAnchors() {
        GapAnchor asGapAnchor;
        Object[] objArr = this.slots;
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && (asGapAnchor = GapAnchorKt.asGapAnchor(anchor)) != null && !slotsOf$runtime(asGapAnchor.toIndexFor(this)).contains(recomposeScopeImpl2)) {
                PreconditionsKt.throwIllegalStateException("Misaligned anchor " + asGapAnchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ac.g0(this.slots, recomposeScopeImpl2));
            }
        }
    }

    private static final int verifyWellFormed$validateGroup(hi0 hi0Var, SlotTable slotTable, int i, int i2) {
        int groupSize;
        int slotAnchor;
        int groupSize2;
        int i3 = hi0Var.d;
        int i4 = i3 + 1;
        hi0Var.d = i4;
        int i5 = i3 * 5;
        int i6 = slotTable.groups[i5 + 2];
        if (!(i6 == i)) {
            StringBuilder j = j50.j("Invalid parent index detected at ", i3, ", expected parent index to be ", i, " found ");
            j.append(i6);
            PreconditionsKt.throwIllegalStateException(j.toString());
        }
        groupSize = SlotTableKt.groupSize(slotTable.groups, i3);
        int i7 = groupSize + i3;
        if (!(i7 <= slotTable.groupsSize)) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i3);
        }
        if (!(i7 <= i2)) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i3);
        }
        int[] iArr = slotTable.groups;
        int i8 = i5 + 4;
        int i9 = iArr[i8];
        int i10 = i3 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : iArr[(i4 * 5) + 4];
        if (!(i10 <= slotTable.slots.length)) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i3 + " extend past the end of the slot table");
        }
        if (!(i9 <= i10)) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i3);
        }
        slotAnchor = SlotTableKt.slotAnchor(slotTable.groups, i3);
        if (!(slotAnchor <= i10)) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i3);
        }
        int i11 = i5 + 1;
        int i12 = slotTable.groups[i11];
        if (!(i10 - i9 >= (((i12 & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? 1 : 0) + ((536870912 & i12) != 0 ? 1 : 0)) + ((i12 & GroupFlagsKt.IsMovableContentFlag) != 0 ? 1 : 0))) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i3);
        }
        int[] iArr2 = slotTable.groups;
        boolean z = (iArr2[i11] & GroupFlagsKt.IsSubcompositionContextFlag) != 0;
        if (!((z && slotTable.slots[iArr2[i8]] == null) ? false : true)) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i3);
        }
        int i13 = 0;
        while (hi0Var.d < i7) {
            i13 += verifyWellFormed$validateGroup(hi0Var, slotTable, i3, i7);
        }
        int[] iArr3 = slotTable.groups;
        int i14 = iArr3[i11] & 67108863;
        groupSize2 = SlotTableKt.groupSize(iArr3, i3);
        if (!(i14 == i13)) {
            StringBuilder j2 = j50.j("Incorrect node count detected at ", i3, ", expected ", i14, ", received ");
            j2.append(i13);
            PreconditionsKt.throwIllegalStateException(j2.toString());
        }
        int i15 = hi0Var.d - i3;
        if (!(groupSize2 == i15)) {
            StringBuilder j3 = j50.j("Incorrect slot count detected at ", i3, ", expected ", groupSize2, ", received ");
            j3.append(i15);
            PreconditionsKt.throwIllegalStateException(j3.toString());
        }
        int[] iArr4 = slotTable.groups;
        if ((iArr4[i11] & 201326592) != 0) {
            if (!(i3 <= 0 || (iArr4[(i * 5) + 1] & GroupFlagsKt.IsRecompositionRequiredFlag) != 0)) {
                PreconditionsKt.throwIllegalStateException("Expected group " + i + " to record it contains a mark because " + i3 + " does");
            }
        }
        if (z) {
            return 1;
        }
        return i13;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GapGroupSourceInformation gapGroupSourceInformation) {
        ArrayList<Object> groups = gapGroupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i = 0; i < size; i++) {
                Object obj = groups.get(i);
                if (obj instanceof GapAnchor) {
                    GapAnchor gapAnchor = (GapAnchor) obj;
                    if (!gapAnchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(gapAnchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GapGroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GapGroupSourceInformation) obj);
                }
            }
        }
    }

    public final GapAnchor anchor(int i) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z = false;
        if (i >= 0 && i < this.groupsSize) {
            z = true;
        }
        if (!z) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<GapAnchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i, this.groupsSize);
        if (search >= 0) {
            return arrayList.get(search);
        }
        GapAnchor gapAnchor = new GapAnchor(i);
        arrayList.add(-(search + 1), gapAnchor);
        return gapAnchor;
    }

    public final int anchorIndex(GapAnchor gapAnchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!gapAnchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return gapAnchor.getLocation$runtime();
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void clear(RememberManager rememberManager) {
        SlotWriter openWriter = openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberManager);
            openWriter.close(true);
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final void close$runtime(SlotReader slotReader, HashMap<GapAnchor, GapGroupSourceInformation> hashMap) {
        if (!(slotReader.getTable$runtime() == this && this.readers > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (hashMap != null) {
            synchronized (this.lock) {
                try {
                    HashMap<GapAnchor, GapGroupSourceInformation> hashMap2 = this.sourceInformationMap;
                    if (hashMap2 != null) {
                        hashMap2.putAll(hashMap);
                    } else {
                        this.sourceInformationMap = hashMap;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void collectCalledByInformation() {
        this.calledByMap = new na0();
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && (this.groups[1] & GroupFlagsKt.IsRecompositionRequiredFlag) != 0;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void deactivateAll(RememberManager rememberManager) {
        SlotWriter openWriter = openWriter();
        try {
            GapComposerKt.deactivateCurrentGroup(openWriter, rememberManager);
            openWriter.close(true);
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void disposeUnusedMovableContent(RememberManager rememberManager, MovableContentState movableContentState) {
        SlotWriter openWriter = openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberManager);
            openWriter.close(true);
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public pl0 extractNestedStates(Applier<?> applier, cd0 cd0Var) {
        Object[] objArr = cd0Var.a;
        int i = cd0Var.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (ownsAnchor(GapAnchorKt.asGapAnchor(((MovableContentStateReference) objArr[i2]).getAnchor$runtime()))) {
                i2++;
            } else {
                xa0 xa0Var = new xa0();
                Object[] objArr2 = cd0Var.a;
                int i3 = cd0Var.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object obj = objArr2[i4];
                    if (ownsAnchor(GapAnchorKt.asGapAnchor(((MovableContentStateReference) obj).getAnchor$runtime()))) {
                        xa0Var.g(obj);
                    }
                }
                cd0Var = xa0Var;
            }
        }
        cd0 sortedBy = ExtensionsKt.sortedBy(cd0Var, new mb0(this, 21));
        if (sortedBy.d()) {
            fb0 fb0Var = ql0.b;
            fb0Var.getClass();
            return fb0Var;
        }
        long[] jArr = ql0.a;
        fb0 fb0Var2 = new fb0();
        SlotWriter openWriter = openWriter();
        try {
            Object[] objArr3 = sortedBy.a;
            int i5 = sortedBy.b;
            for (int i6 = 0; i6 < i5; i6++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i6];
                int anchorIndex = openWriter.anchorIndex(GapAnchorKt.asGapAnchor(movableContentStateReference.getAnchor$runtime()));
                int parent = openWriter.parent(anchorIndex);
                extractNestedStates$lambda$2$closeToGroupContaining(openWriter, parent);
                extractNestedStates$lambda$2$openParent(openWriter, parent);
                openWriter.advanceBy(anchorIndex - openWriter.getCurrentGroup());
                fb0Var2.l(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition$runtime(), movableContentStateReference, openWriter, applier));
            }
            extractNestedStates$lambda$2$closeToGroupContaining(openWriter, Integer.MAX_VALUE);
            openWriter.close(true);
            return fb0Var2;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(obj);
    }

    public final ArrayList<GapAnchor> getAnchors$runtime() {
        return this.anchors;
    }

    public final na0 getCalledByMap$runtime() {
        return this.calledByMap;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @Override // androidx.compose.runtime.SlotStorage
    /* renamed from: getSlots */
    public Iterable<Object> mo4029getSlots() {
        return new SlotTable$getSlots$1(this);
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<GapAnchor, GapGroupSourceInformation> getSourceInformationMap$runtime() {
        return this.sourceInformationMap;
    }

    public final int getVersion$runtime() {
        return this.version;
    }

    public final boolean getWriter$runtime() {
        return this.writer;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean groupContainsAnchor(int i, Anchor anchor) {
        int groupSize;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (!(i >= 0 && i < this.groupsSize)) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        GapAnchor asGapAnchor = GapAnchorKt.asGapAnchor(anchor);
        if (ownsAnchor(asGapAnchor)) {
            groupSize = SlotTableKt.groupSize(this.groups, i);
            int i2 = groupSize + i;
            int location$runtime = asGapAnchor.getLocation$runtime();
            if (i <= location$runtime && location$runtime < i2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean inGroup(Anchor anchor, Anchor anchor2) {
        int groupSize;
        int location$runtime = GapAnchorKt.asGapAnchor(anchor).getLocation$runtime();
        groupSize = SlotTableKt.groupSize(this.groups, location$runtime);
        int i = groupSize + location$runtime;
        int location$runtime2 = GapAnchorKt.asGapAnchor(anchor2).getLocation$runtime();
        return location$runtime <= location$runtime2 && location$runtime2 < i;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void invalidateAll() {
        for (Object obj : this.slots) {
            RecomposeScope recomposeScope = obj instanceof RecomposeScope ? (RecomposeScope) obj : null;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
            }
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public List<RecomposeScopeImpl> invalidateGroupsWithKey(int i) {
        oa0 oa0Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        fi0 fi0Var = new fi0();
        fi0Var.d = true;
        oa0 oa0Var2 = new oa0();
        oa0Var2.b(i);
        oa0Var2.b(-3);
        na0 na0Var = this.calledByMap;
        if (na0Var != null && (oa0Var = (oa0) na0Var.b(i)) != null) {
            oa0Var2.c(oa0Var);
        }
        SlotReader openReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$2$scanGroup(openReader, oa0Var2, arrayList, fi0Var, this, arrayList2);
            openReader.close();
            SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    GapAnchor gapAnchor = (GapAnchor) arrayList.get(i2);
                    if (gapAnchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(gapAnchor);
                        openWriter.bashCurrentGroup();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close(true);
                if (fi0Var.d) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                openWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            openReader.close();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.SlotStorage, androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (this.writer) {
            o.f("Cannot read while a writer is pending");
            return null;
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(GapAnchor gapAnchor) {
        int search;
        return gapAnchor.getValid() && (search = SlotTableKt.search(this.anchors, gapAnchor.getLocation$runtime(), this.groupsSize)) >= 0 && q10.b(this.anchors.get(search), gapAnchor);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean ownsRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        return anchor != null && ownsAnchor(GapAnchorKt.asGapAnchor(anchor));
    }

    public final <T> T read(ky kyVar) {
        SlotReader openReader = openReader();
        try {
            return (T) kyVar.invoke(openReader);
        } finally {
            openReader.close();
        }
    }

    public final void setAnchors$runtime(ArrayList<GapAnchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setCalledByMap$runtime(na0 na0Var) {
        this.calledByMap = na0Var;
    }

    public final void setSourceInformationMap$runtime(HashMap<GapAnchor, GapGroupSourceInformation> hashMap) {
        this.sourceInformationMap = hashMap;
    }

    public final void setTo$runtime(int[] iArr, int i, Object[] objArr, int i2, ArrayList<GapAnchor> arrayList, HashMap<GapAnchor, GapGroupSourceInformation> hashMap, na0 na0Var) {
        this.groups = iArr;
        this.groupsSize = i;
        this.slots = objArr;
        this.slotsSize = i2;
        this.anchors = arrayList;
        this.sourceInformationMap = hashMap;
        this.calledByMap = na0Var;
    }

    public final void setVersion$runtime(int i) {
        this.version = i;
    }

    public final Object slot$runtime(int i, int i2) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i3 = i + 1;
        return (i2 < 0 || i2 >= (i3 < this.groupsSize ? this.groups[(i3 * 5) + 4] : this.slots.length) - slotAnchor) ? Composer.Companion.getEmpty() : this.slots[slotAnchor + i2];
    }

    public final List<Object> slotsOf$runtime(int i) {
        int[] iArr = this.groups;
        int i2 = iArr[(i * 5) + 4];
        int i3 = i + 1;
        return ac.n0(this.slots).subList(i2, i3 < this.groupsSize ? iArr[(i3 * 5) + 4] : this.slots.length);
    }

    public final GapGroupSourceInformation sourceInformationOf(int i) {
        GapAnchor tryAnchor;
        HashMap<GapAnchor, GapGroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor = tryAnchor(i)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public String toDebugString() {
        if (this.writer) {
            return toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        int i = this.groupsSize;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                i2 += emitGroup(sb, i2, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        return sb.toString();
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void verifyWellFormed() {
        int i;
        int i2;
        int groupSize;
        hi0 hi0Var = new hi0();
        int i3 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i = hi0Var.d;
                i2 = this.groupsSize;
                if (i >= i2) {
                    break;
                }
                groupSize = SlotTableKt.groupSize(this.groups, i);
                verifyWellFormed$validateGroup(hi0Var, this, -1, groupSize + i);
            }
            if (!(i == i2)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + hi0Var.d + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i4 = this.slotsSize; i4 < length; i4++) {
            if (!(this.slots[i4] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i4);
            }
        }
        ArrayList<GapAnchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int indexFor = arrayList.get(i5).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i3 < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i5++;
            i3 = indexFor;
        }
        HashMap<GapAnchor, GapGroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap != null) {
            for (Map.Entry<GapAnchor, GapGroupSourceInformation> entry : hashMap.entrySet()) {
                GapAnchor key = entry.getKey();
                GapGroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
        validateRecomposeScopeAnchors();
    }

    public final <T> T write(ky kyVar) {
        SlotWriter openWriter = openWriter();
        try {
            T t = (T) kyVar.invoke(openWriter);
            openWriter.close(true);
            return t;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    /* renamed from: getSlots, reason: collision with other method in class */
    public final Object[] m3964getSlots() {
        return this.slots;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void dispose() {
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public final void close$runtime(SlotWriter slotWriter, int[] iArr, int i, Object[] objArr, int i2, ArrayList<GapAnchor> arrayList, HashMap<GapAnchor, GapGroupSourceInformation> hashMap, na0 na0Var) {
        if (!(slotWriter.getTable$runtime() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime(iArr, i, objArr, i2, arrayList, hashMap, na0Var);
    }
}
