package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.ReusableRememberObserverHolder;
import androidx.compose.runtime.ScopeInvalidated;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.ObjectLocation;
import defpackage.gy;
import defpackage.ks0;
import defpackage.ky;
import defpackage.q10;
import defpackage.uf;
import defpackage.w01;
import defpackage.wd0;
import defpackage.xe0;
import defpackage.yi;
import java.util.ConcurrentModificationException;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int LIVE_EDIT_INVALID_KEY = -3;

    public static final void adoptScopesInGroupToNewParent(SlotTable slotTable, int i, RecomposeScopeOwner recomposeScopeOwner) {
        int i2;
        int[] groups = slotTable.getAddressSpace().getGroups();
        Object[] slots = slotTable.getAddressSpace().getSlots();
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        if (i < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups2 = addressSpace.getGroups();
        int i3 = i;
        while (true) {
            RecomposeScopeImpl recomposeScopeOrNullInRegion = recomposeScopeOrNullInRegion(slots, groups[i3 + 5]);
            if (recomposeScopeOrNullInRegion != null) {
                recomposeScopeOrNullInRegion.adoptedBy(recomposeScopeOwner);
            }
            if (i3 != i && (i2 = groups2[i3 + 1]) >= 0) {
                intStack.push(i2);
            }
            i3 = groups2[i3 + 3];
            if (i3 < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    i3 = intStack.pop();
                }
            }
        }
    }

    public static final SlotTable asLinkBufferSlotTable(SlotStorage slotStorage) {
        SlotTable slotTable = slotStorage instanceof SlotTable ? (SlotTable) slotStorage : null;
        if (slotTable != null) {
            return slotTable;
        }
        throw uf.a("Inconsistent composer");
    }

    public static final CompositionGroup compositionGroupOf(SlotTable slotTable, int i) {
        return new SlotTableGroup(slotTable, i, slotTable.getVersion());
    }

    public static final void deactivateCurrentGroup(SlotTableEditor slotTableEditor, RememberManager rememberManager) {
        slotTableEditor.visitSlotsInRememberOrder(slotTableEditor.getCurrentGroup(), new wd0(rememberManager, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deactivateCurrentGroup$lambda$0(RememberManager rememberManager, int i, int i2, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.deactivating((ComposeNodeLifecycleCallback) obj);
            return false;
        }
        if (obj instanceof ReusableRememberObserverHolder) {
            return false;
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj);
            return true;
        }
        if (!(obj instanceof RecomposeScopeImpl)) {
            return false;
        }
        ((RecomposeScopeImpl) obj).release();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotTableEditor slotTableEditor, Applier<?> applier) {
        int currentGroup = slotTableEditor.getCurrentGroup();
        if (applier != null && slotTableEditor.nodeCountOf(currentGroup) > 0) {
            SlotTableAddressSpace addressSpace = slotTableEditor.getTable().getAddressSpace();
            int parentGroup = slotTableEditor.getParentGroup();
            int[] groups = addressSpace.getGroups();
            int i = groups[parentGroup + 2];
            while (true) {
                if (i <= 0) {
                    if (!(i != 0)) {
                        gy.h(parentGroup, "Traversing parent of group not in the slot table: ");
                    }
                    i = -1;
                } else {
                    if (slotTableEditor.isNode(i)) {
                        break;
                    }
                    i = groups[i + 2];
                }
            }
            if (i >= 0 && slotTableEditor.isNode(i)) {
                Object node = slotTableEditor.node(i);
                if (node == null) {
                    ComposerKt.composeImmediateRuntimeError("Invalid slot table structure");
                    node = w01.a;
                }
                int nodeIndexOf = nodeIndexOf(currentGroup, slotTableEditor.getTable());
                int nodeCountOf = slotTableEditor.nodeCountOf(currentGroup);
                applier.down(node);
                applier.remove(nodeIndexOf, nodeCountOf);
                applier.up();
            }
        }
        SlotTable table = slotTableEditor.getTable();
        SlotTable.Companion companion = SlotTable.Companion;
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(table.getAddressSpace(), false, false);
        slotTableBuilder.buildStart();
        MovableContent<Object> content$runtime = movableContentStateReference.getContent$runtime();
        slotTableBuilder.startNewGroup(MovableContentKt.movableContentKey, content$runtime == Composer.Companion.getEmpty() ? 0 : 16777216, content$runtime, null, null);
        slotTableBuilder.addFlags(GroupFlagsKt.IsMovableContentFlag);
        slotTableBuilder.append(movableContentStateReference.getParameter$runtime());
        slotTableBuilder.moveFrom(slotTableEditor, slotTableEditor.firstChildOf(LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime()).getAddress()) & 4294967295L);
        slotTableBuilder.endGroup();
        SlotTable build = slotTableBuilder.build();
        MovableContentState movableContentState = new MovableContentState(build);
        if (build.getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot read while an editor is pending");
        }
        SlotTableAddressSpace addressSpace2 = build.getAddressSpace();
        int root = build.getRoot();
        if (root < 0) {
            return movableContentState;
        }
        IntStack intStack = new IntStack();
        int[] groups2 = addressSpace2.getGroups();
        RecomposeScopeOwner recomposeScopeOwner = null;
        while (true) {
            int i2 = build.getGroups()[root + 5];
            if (i2 != -1) {
                SlotTableAddressSpace addressSpace3 = build.getAddressSpace();
                int i3 = (i2 & 15) + 1;
                int i4 = i2 >> 4;
                if (i3 > 15) {
                    i3 = addressSpace3.getLargeSizes().d(i4);
                }
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj = build.getSlots()[i4 + i5];
                    if (q10.b(obj, Composer.Companion.getEmpty())) {
                        break;
                    }
                    if (obj instanceof RecomposeScopeImpl) {
                        if (recomposeScopeOwner == null) {
                            recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.composer.linkbuffer.SlotTableKt$extractMovableContentAtCurrent$1$owner$1
                                @Override // androidx.compose.runtime.RecomposeScopeOwner
                                public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj2) {
                                    InvalidationResult invalidationResult;
                                    ControlledComposition controlledComposition2 = ControlledComposition.this;
                                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                                    if (recomposeScopeOwner2 == null || (invalidationResult = recomposeScopeOwner2.invalidate(recomposeScopeImpl, obj2)) == null) {
                                        invalidationResult = InvalidationResult.IGNORED;
                                    }
                                    if (invalidationResult != InvalidationResult.IGNORED) {
                                        return invalidationResult;
                                    }
                                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                                    List<xe0> invalidations$runtime = movableContentStateReference2.getInvalidations$runtime();
                                    if (obj2 == null) {
                                        obj2 = ScopeInvalidated.INSTANCE;
                                    }
                                    movableContentStateReference2.setInvalidations$runtime(yi.B0(invalidations$runtime, new xe0(recomposeScopeImpl, obj2)));
                                    return InvalidationResult.SCHEDULED;
                                }

                                @Override // androidx.compose.runtime.RecomposeScopeOwner
                                public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
                                }

                                @Override // androidx.compose.runtime.RecomposeScopeOwner
                                public void recordReadOf(Object obj2) {
                                }
                            };
                        }
                        ((RecomposeScopeImpl) obj).adoptedBy(recomposeScopeOwner);
                        recomposeScopeOwner = recomposeScopeOwner;
                    }
                }
            }
            int i6 = groups2[root + 1];
            if (i6 >= 0) {
                intStack.push(i6);
            }
            root = groups2[root + 3];
            if (root < 0) {
                if (intStack.tos == 0) {
                    return movableContentState;
                }
                root = intStack.pop();
            }
        }
    }

    public static final ObjectLocation findLocation(SlotTable slotTable, ky kyVar) {
        int i;
        SlotTableReader openReader = slotTable.openReader();
        try {
            int root = slotTable.getRoot();
            SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
            if (root >= 0) {
                IntStack intStack = new IntStack();
                int[] groups = addressSpace.getGroups();
                int i2 = root;
                while (true) {
                    if (openReader.isNode(i2) && ((Boolean) kyVar.invoke(openReader.node(i2))).booleanValue()) {
                        return new ObjectLocation(i2, null);
                    }
                    int i3 = slotTable.getGroups()[i2 + 5];
                    if (i3 != -1) {
                        SlotTableAddressSpace addressSpace2 = slotTable.getAddressSpace();
                        int i4 = (i3 & 15) + 1;
                        int i5 = i3 >> 4;
                        if (i4 > 15) {
                            i4 = addressSpace2.getLargeSizes().d(i5);
                        }
                        for (int i6 = 0; i6 < i4; i6++) {
                            Object obj = slotTable.getSlots()[i5 + i6];
                            if (q10.b(obj, Composer.Companion.getEmpty())) {
                                break;
                            }
                            if (((Boolean) kyVar.invoke(obj)).booleanValue()) {
                                return new ObjectLocation(i2, Integer.valueOf(i6));
                            }
                        }
                    }
                    if (i2 != root && (i = groups[i2 + 1]) >= 0) {
                        intStack.push(i);
                    }
                    i2 = groups[i2 + 3];
                    if (i2 < 0) {
                        if (intStack.tos == 0) {
                            break;
                        }
                        i2 = intStack.pop();
                    }
                }
            }
            return null;
        } finally {
            openReader.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flagsNames(int i) {
        String str = (i & GroupFlagsKt.IsNodeFlag) == 8388608 ? "N" : "";
        if ((i & GroupFlagsKt.HasObjectKeyFlag) == 16777216) {
            str = str.concat("O");
        }
        if ((i & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
            str = str.concat("A");
        }
        if ((i & GroupFlagsKt.IsRecompositionRequiredFlag) == 67108864) {
            str = str.concat("R");
        }
        if ((i & GroupFlagsKt.HasRecompositionRequiredFlag) == 134217728) {
            str = str.concat("r");
        }
        if ((i & GroupFlagsKt.IsMovableContentFlag) == 268435456) {
            str = str.concat("C");
        }
        if ((i & GroupFlagsKt.HasMovableContentFlag) == 536870912) {
            str = str.concat("c");
        }
        if ((i & GroupFlagsKt.IsSubcompositionContextFlag) == 1073741824) {
            str = str.concat("S");
        }
        if ((i & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            str = str.concat("s");
        }
        int i2 = 8388607 & i;
        if (i2 == 0) {
            return str;
        }
        if ((i & (-8388608)) != 0) {
            str = str.concat(" ");
        }
        return str + "CC(" + i2 + ')';
    }

    public static final int nodeIndexOf(int i, SlotTable slotTable) {
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        int[] groups = addressSpace.getGroups();
        int i2 = 0;
        while (i > 0) {
            int i3 = groups[i + 2];
            int[] groups2 = addressSpace.getGroups();
            for (int i4 = groups2[i3 + 3]; i4 > 0 && i4 != i; i4 = groups2[i4 + 1]) {
                int i5 = groups[i + 4];
                i2 += (i5 & GroupFlagsKt.IsNodeFlag) == 8388608 ? 1 : 8388607 & i5;
            }
            if ((groups[i3 + 4] & GroupFlagsKt.IsNodeFlag) == 8388608) {
                return i2;
            }
            i = i3;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecomposeScopeImpl recomposeScopeOrNullInRegion(Object[] objArr, int i) {
        if (i < 0) {
            return null;
        }
        Object obj = objArr[i >> 4];
        if (obj instanceof RecomposeScopeImpl) {
            return (RecomposeScopeImpl) obj;
        }
        return null;
    }

    public static final void removeCurrentGroup(SlotTableEditor slotTableEditor, RememberManager rememberManager) {
        slotTableEditor.visitSlotsInRememberOrder(slotTableEditor.getCurrentGroup(), new wd0(rememberManager, 3));
        SlotTableEditor.removeGroup$default(slotTableEditor, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeCurrentGroup$lambda$0(RememberManager rememberManager, int i, int i2, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.releasing((ComposeNodeLifecycleCallback) obj);
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj);
        }
        if (!(obj instanceof RecomposeScopeImpl)) {
            return false;
        }
        ((RecomposeScopeImpl) obj).release();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(Object obj, int i) {
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return str;
        }
        String b0 = ks0.b0(ks0.b0(ks0.b0(ks0.b0(ks0.b0(ks0.b0(ks0.b0(ks0.b0(ks0.b0(ks0.b0(ks0.b0(String.valueOf(obj), "androidx.", "a."), "compose.", "c."), "runtime.", "r."), "internal.", "ι."), "ui.", "u."), "foundation.", "f."), "Modifier", "μ"), "material.", "m."), "Function", "λ"), "OpaqueKey", "κ"), "MutableState", "σ");
        return b0.substring(0, Math.min(i, b0.length()));
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }

    private static final long toGroupHandle(int i) {
        return i & 4294967295L;
    }
}
