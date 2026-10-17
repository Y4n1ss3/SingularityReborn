package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.internal.IntRef;
import defpackage.dq;
import defpackage.gy;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    private static final int invalidGroupLocation = -2;
    private ChangeList changeList;
    private final GapComposer composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;
    private final ArrayList<Object> pendingDownNodes = Stack.m3862constructorimpl$default(null, 1, null);
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    public ComposerChangeListWriter(GapComposer gapComposer, ChangeList changeList) {
        this.composer = gapComposer;
        this.changeList = changeList;
    }

    private final void ensureGroupStarted(GapAnchor gapAnchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(gapAnchor);
        this.startedGroup = true;
    }

    private final void ensureRootStarted() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
    }

    private final SlotReader getReader() {
        return this.composer.getReader$runtime();
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i, Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushPendingUpsAndDowns() {
        int i = this.pendingUps;
        if (i > 0) {
            this.changeList.pushUps(i);
            this.pendingUps = 0;
        }
        if (Stack.m3868isNotEmptyimpl(this.pendingDownNodes)) {
            this.changeList.pushDowns(Stack.m3873toArrayimpl(this.pendingDownNodes));
            Stack.m3860clearimpl(this.pendingDownNodes);
        }
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    private final void pushSlotTableOperationPreamble(boolean z) {
        realizeOperationLocation(z);
    }

    public static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z);
    }

    private final void realizeMoveNode(int i, int i2, int i3) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i, i2, i3);
    }

    private final void realizeNodeMovementOperations() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFrom;
            if (i2 >= 0) {
                realizeRemoveNode(i2, i);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeOperationLocation(boolean z) {
        int parent = z ? getReader().getParent() : getReader().getCurrentGroup();
        int i = parent - this.writersReaderDelta;
        if (!(i >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i > 0) {
            this.changeList.pushAdvanceSlotsBy(i);
            this.writersReaderDelta = parent;
        }
    }

    public static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.realizeOperationLocation(z);
    }

    private final void realizeRemoveNode(int i, int i2) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i, i2);
    }

    public final void appendValue(GapAnchor gapAnchor, Object obj) {
        this.changeList.pushAppendValue(gapAnchor, obj);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(IntRef intRef, GapAnchor gapAnchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, gapAnchor);
    }

    public final void endCompositionScope(ky kyVar, Composition composition) {
        this.changeList.pushEndCompositionScope(kyVar, composition);
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.startedGroups.pop();
            this.changeList.pushEndCurrentGroup();
        }
    }

    public final void endMovableContentPlacement() {
        pushPendingUpsAndDowns();
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i, int i2) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int nodeCount = getReader().isNode(i2) ? 1 : getReader().nodeCount(i2);
        if (nodeCount > 0) {
            removeNode(i, nodeCount);
        }
    }

    public final void endResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushEndResumingScope(recomposeScopeImpl);
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.tos == 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean getPastParent() {
        return getReader().getParent() - this.writersReaderDelta < 0;
    }

    public final void includeOperationsIn(ChangeList changeList, IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void insertSlots(GapAnchor gapAnchor, SlotTable slotTable) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(gapAnchor, slotTable);
    }

    public final void moveCurrentGroup(int i) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(i);
    }

    public final void moveDown(Object obj) {
        realizeNodeMovementOperations();
        Stack.m3872pushimpl(this.pendingDownNodes, obj);
    }

    public final void moveNode(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.moveCount;
            if (i4 > 0 && this.moveFrom == i - i4 && this.moveTo == i2 - i4) {
                this.moveCount = i4 + i3;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = i;
            this.moveTo = i2;
            this.moveCount = i3;
        }
    }

    public final void moveReaderRelativeTo(int i) {
        this.writersReaderDelta = (i - getReader().getCurrentGroup()) + this.writersReaderDelta;
    }

    public final void moveReaderToAbsolute(int i) {
        this.writersReaderDelta = i;
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (Stack.m3868isNotEmptyimpl(this.pendingDownNodes)) {
            Stack.m3871popimpl(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            GapAnchor anchor = reader.anchor(parent);
            this.startedGroups.push(parent);
            ensureGroupStarted(anchor);
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference);
    }

    public final void remember(RememberObserverHolder rememberObserverHolder) {
        this.changeList.pushRemember(rememberObserverHolder);
    }

    public final void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushRememberPausingScope(recomposeScopeImpl);
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta = getReader().getGroupSize() + this.writersReaderDelta;
    }

    public final void removeNode(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                gy.h(i, "Invalid remove index ");
            }
            if (this.removeFrom == i) {
                this.moveCount += i2;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFrom = i;
            this.moveCount = i2;
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
        this.implicitRootStart = true;
        this.pendingUps = 0;
        Stack.m3860clearimpl(this.pendingDownNodes);
        this.removeFrom = -1;
        this.moveFrom = -1;
        this.moveTo = -1;
        this.moveCount = 0;
    }

    public final void setChangeList(ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z) {
        this.implicitRootStart = z;
    }

    public final void sideEffect(iy iyVar) {
        this.changeList.pushSideEffect(iyVar);
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void startResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushStartResumingScope(recomposeScopeImpl);
    }

    public final void trimValues(int i) {
        if (i > 0) {
            pushSlotEditingOperationPreamble();
            this.changeList.pushTrimValues(i);
        }
    }

    public final void updateAnchoredValue(Object obj, GapAnchor gapAnchor, int i) {
        this.changeList.pushUpdateAnchoredValue(obj, gapAnchor, i);
    }

    public final void updateAuxData(Object obj) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v, my myVar) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v, myVar);
    }

    public final void updateValue(Object obj, int i) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(obj, i);
    }

    public final void useNode(Object obj) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(obj);
    }

    public final void withChangeList(ChangeList changeList, iy iyVar) {
        ChangeList changeList2 = getChangeList();
        try {
            setChangeList(changeList);
            iyVar.invoke();
        } finally {
            setChangeList(changeList2);
        }
    }

    public final void withoutImplicitRootStart(iy iyVar) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            iyVar.invoke();
        } finally {
            setImplicitRootStart(implicitRootStart);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public final void insertSlots(GapAnchor gapAnchor, SlotTable slotTable, FixupList fixupList) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(gapAnchor, slotTable, fixupList);
    }
}
