package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Changes;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.LinkRememberObserverHolder;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operation;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChangeList extends Changes {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i, Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    @Override // androidx.compose.runtime.Changes
    public void clear() {
        this.operations.clear();
    }

    @Override // androidx.compose.runtime.Changes
    public void execute(SlotStorage slotStorage, Applier<?> applier, RememberManager rememberManager, CompositionErrorContextImpl compositionErrorContextImpl) {
        SlotTableEditor openEditor = SlotTableKt.asLinkBufferSlotTable(slotStorage).openEditor();
        try {
            executeAndFlushAllPendingChanges(applier, openEditor, rememberManager, compositionErrorContextImpl);
        } finally {
            openEditor.close();
        }
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotTableEditor, rememberManager, operationErrorContext);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean hasChangesRequiringApplication() {
        return this.operations.getRequiresApplication();
    }

    @Override // androidx.compose.runtime.Changes
    public boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final void pushAppendValue(Object obj) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), obj);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushClearAllRecompositionRequiredGroups() {
        this.operations.push(Operation.ClearAllRecompositionRequired.INSTANCE);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        if (list.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m4089setObjectsEykTJF8(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(1), list, Operation.ObjectParameter.m4053constructorimpl(0), intRef);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        Operations operations = this.operations;
        Operation.CopySlotTableToHandleLocation copySlotTableToHandleLocation = Operation.CopySlotTableToHandleLocation.INSTANCE;
        operations.pushOp(copySlotTableToHandleLocation);
        Operations.WriteScope.m4091setObjectsUOUgNZM(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), movableContentState, Operation.ObjectParameter.m4053constructorimpl(1), compositionContext, Operation.ObjectParameter.m4053constructorimpl(3), movableContentStateReference2, Operation.ObjectParameter.m4053constructorimpl(2), movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(copySlotTableToHandleLocation);
    }

    public final void pushDeactivateGroup() {
        this.operations.push(Operation.DeactivateGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef intRef, long j) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), intRef);
        Operations.WriteScope.m4087setLongimpl(m4078constructorimpl, 1, 0, j);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushDisposeDisposeMovableContentState(MovableContentState movableContentState) {
        Operations operations = this.operations;
        Operation.DisposeMovableContentState disposeMovableContentState = Operation.DisposeMovableContentState.INSTANCE;
        operations.pushOp(disposeMovableContentState);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), movableContentState);
        operations.ensureAllArgumentsPushedFor(disposeMovableContentState);
    }

    public final void pushDowns(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), objArr);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushEndCompositionScope(ky kyVar, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations.WriteScope.m4089setObjectsEykTJF8(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), kyVar, Operation.ObjectParameter.m4053constructorimpl(1), composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef intRef) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
            Operations.WriteScope.m4089setObjectsEykTJF8(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), changeList, Operation.ObjectParameter.m4053constructorimpl(1), intRef);
            if (changeList.operations.getRequiresApplication()) {
                Operations.WriteScope.m4083requireApplicationimpl(m4078constructorimpl);
            }
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    public final void pushInsertSlots(SlotTable slotTable, long j, FixupList fixupList) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        Operations.WriteScope.m4087setLongimpl(m4078constructorimpl, 0, 1, j);
        Operations.WriteScope.m4089setObjectsEykTJF8(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), slotTable, Operation.ObjectParameter.m4053constructorimpl(1), fixupList);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }

    public final void pushMoveGroup(int i) {
        Operations operations = this.operations;
        Operation.MoveGroup moveGroup = Operation.MoveGroup.INSTANCE;
        operations.pushOp(moveGroup);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        m4078constructorimpl.intArgs[m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts()] = i;
        operations.ensureAllArgumentsPushedFor(moveGroup);
    }

    public final void pushMoveNode(int i, int i2, int i3) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        int ints = m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m4078constructorimpl.intArgs;
        iArr[ints + 1] = i;
        iArr[ints] = i2;
        iArr[ints + 2] = i3;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushReleaseMovableGroup(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroup releaseMovableGroup = Operation.ReleaseMovableGroup.INSTANCE;
        operations.pushOp(releaseMovableGroup);
        Operations.WriteScope.m4090setObjectsGn0XI2A(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), controlledComposition, Operation.ObjectParameter.m4053constructorimpl(1), compositionContext, Operation.ObjectParameter.m4053constructorimpl(2), movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroup);
    }

    public final void pushRemember(RememberObserverHolder rememberObserverHolder) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), rememberObserverHolder);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushRemoveGroup() {
        this.operations.push(Operation.RemoveGroup.INSTANCE);
    }

    public final void pushRemoveNode(int i, int i2) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        int ints = m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m4078constructorimpl.intArgs;
        iArr[ints] = i;
        iArr[ints + 1] = i2;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushRemoveTailGroupsAndValues(int i, int i2) {
        Operations operations = this.operations;
        Operation.RemoveTailGroupsAndValues removeTailGroupsAndValues = Operation.RemoveTailGroupsAndValues.INSTANCE;
        operations.pushOp(removeTailGroupsAndValues);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        int ints = m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m4078constructorimpl.intArgs;
        iArr[ints] = i;
        iArr[ints + 1] = i2;
        operations.ensureAllArgumentsPushedFor(removeTailGroupsAndValues);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSeekToAnchor(SlotTableAddressSpace slotTableAddressSpace, long j) {
        Operations operations = this.operations;
        Operation.SeekToAnchor seekToAnchor = Operation.SeekToAnchor.INSTANCE;
        operations.pushOp(seekToAnchor);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), LinkAnchorKt.anchorHandle(slotTableAddressSpace, j));
        operations.ensureAllArgumentsPushedFor(seekToAnchor);
    }

    public final void pushSeekToGroupHandle(long j) {
        Operations operations = this.operations;
        Operation.SeekToGroupHandle seekToGroupHandle = Operation.SeekToGroupHandle.INSTANCE;
        operations.pushOp(seekToGroupHandle);
        Operations.WriteScope.m4087setLongimpl(Operations.WriteScope.m4078constructorimpl(operations), 0, 1, j);
        operations.ensureAllArgumentsPushedFor(seekToGroupHandle);
    }

    public final void pushSideEffect(iy iyVar) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), iyVar);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushSkipGroup() {
        this.operations.push(Operation.SkipGroup.INSTANCE);
    }

    public final void pushStartGroup() {
        this.operations.push(Operation.StartGroup.INSTANCE);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushUpdateAuxData(Object obj) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m4088setObjectaWHcuVo(Operations.WriteScope.m4078constructorimpl(operations), Operation.ObjectParameter.m4053constructorimpl(0), obj);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final <T, V> void pushUpdateNode(V v, my myVar) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        int m4053constructorimpl = Operation.ObjectParameter.m4053constructorimpl(0);
        int m4053constructorimpl2 = Operation.ObjectParameter.m4053constructorimpl(1);
        myVar.getClass();
        p01.f(2, myVar);
        Operations.WriteScope.m4089setObjectsEykTJF8(m4078constructorimpl, m4053constructorimpl, v, m4053constructorimpl2, myVar);
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushUpdateRelativeValue(int i, Object obj) {
        Operations operations = this.operations;
        Operation.UpdateValueRelative updateValueRelative = Operation.UpdateValueRelative.INSTANCE;
        operations.pushOp(updateValueRelative);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        m4078constructorimpl.intArgs[m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts()] = i;
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), obj);
        operations.ensureAllArgumentsPushedFor(updateValueRelative);
    }

    public final void pushUpdateRememberObserverHolderOrdering(LinkRememberObserverHolder linkRememberObserverHolder, LinkAnchor linkAnchor) {
        Operations operations = this.operations;
        Operation.UpdateRememberObserverHolderOrdering updateRememberObserverHolderOrdering = Operation.UpdateRememberObserverHolderOrdering.INSTANCE;
        operations.pushOp(updateRememberObserverHolderOrdering);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(1), linkRememberObserverHolder);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), linkAnchor);
        operations.ensureAllArgumentsPushedFor(updateRememberObserverHolderOrdering);
    }

    public final void pushUpdateValue(int i, Object obj) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), obj);
        m4078constructorimpl.intArgs[m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts()] = i;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUps(int i) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        m4078constructorimpl.intArgs[m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts()] = i;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushUseNode(Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.composer.DebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(str));
        }
        return sb.toString();
    }

    public final void pushInsertSlots(SlotTable slotTable, long j) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        Operations.WriteScope.m4087setLongimpl(m4078constructorimpl, 0, 1, j);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), slotTable);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }
}
