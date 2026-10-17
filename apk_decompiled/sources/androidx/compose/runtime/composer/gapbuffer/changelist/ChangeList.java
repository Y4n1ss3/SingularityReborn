package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Changes;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operation;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operations;
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
        SlotWriter openWriter = SlotTableKt.asGapBufferSlotTable(slotStorage).openWriter();
        try {
            executeAndFlushAllPendingChanges(applier, openWriter, rememberManager, compositionErrorContextImpl);
            openWriter.close(true);
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager, operationErrorContext);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    @Override // androidx.compose.runtime.Changes
    public boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final void pushAdvanceSlotsBy(int i) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        m4015constructorimpl.intArgs[m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts()] = i;
        operations.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushAppendValue(GapAnchor gapAnchor, Object obj) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations.WriteScope.m4024setObjectsEsEZvaA(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), gapAnchor, Operation.ObjectParameter.m3992constructorimpl(1), obj);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        if (list.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m4024setObjectsEsEZvaA(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(1), list, Operation.ObjectParameter.m3992constructorimpl(0), intRef);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations.WriteScope.m4026setObjectsfiWQlIY(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), movableContentState, Operation.ObjectParameter.m3992constructorimpl(1), compositionContext, Operation.ObjectParameter.m3992constructorimpl(3), movableContentStateReference2, Operation.ObjectParameter.m3992constructorimpl(2), movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef intRef, GapAnchor gapAnchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations.WriteScope.m4024setObjectsEsEZvaA(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), intRef, Operation.ObjectParameter.m3992constructorimpl(1), gapAnchor);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushDowns(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m4023setObjectsGr0YRc(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), objArr);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushEndCompositionScope(ky kyVar, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations.WriteScope.m4024setObjectsEsEZvaA(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), kyVar, Operation.ObjectParameter.m3992constructorimpl(1), composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        Operations.WriteScope.m4023setObjectsGr0YRc(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushEnsureGroupStarted(GapAnchor gapAnchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m4023setObjectsGr0YRc(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), gapAnchor);
        operations.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef intRef) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations.WriteScope.m4024setObjectsEsEZvaA(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), changeList, Operation.ObjectParameter.m3992constructorimpl(1), intRef);
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    public final void pushInsertSlots(GapAnchor gapAnchor, SlotTable slotTable, FixupList fixupList) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations.WriteScope.m4025setObjectsJOGOPjs(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), gapAnchor, Operation.ObjectParameter.m3992constructorimpl(1), slotTable, Operation.ObjectParameter.m3992constructorimpl(2), fixupList);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }

    public final void pushMoveCurrentGroup(int i) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        m4015constructorimpl.intArgs[m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts()] = i;
        operations.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushMoveNode(int i, int i2, int i3) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        int ints = m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m4015constructorimpl.intArgs;
        iArr[ints + 1] = i;
        iArr[ints] = i2;
        iArr[ints + 2] = i3;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations.WriteScope.m4025setObjectsJOGOPjs(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), controlledComposition, Operation.ObjectParameter.m3992constructorimpl(1), compositionContext, Operation.ObjectParameter.m3992constructorimpl(2), movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushRemember(RememberObserverHolder rememberObserverHolder) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m4023setObjectsGr0YRc(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), rememberObserverHolder);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        Operations.WriteScope.m4023setObjectsGr0YRc(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int i, int i2) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        int ints = m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m4015constructorimpl.intArgs;
        iArr[ints] = i;
        iArr[ints + 1] = i2;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(iy iyVar) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m4023setObjectsGr0YRc(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), iyVar);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        Operations.WriteScope.m4023setObjectsGr0YRc(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushTrimValues(int i) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        m4015constructorimpl.intArgs[m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts()] = i;
        operations.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushUpdateAnchoredValue(Object obj, GapAnchor gapAnchor, int i) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        Operations.WriteScope.m4024setObjectsEsEZvaA(m4015constructorimpl, Operation.ObjectParameter.m3992constructorimpl(0), obj, Operation.ObjectParameter.m3992constructorimpl(1), gapAnchor);
        m4015constructorimpl.intArgs[m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts()] = i;
        operations.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushUpdateAuxData(Object obj) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m4023setObjectsGr0YRc(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), obj);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final <T, V> void pushUpdateNode(V v, my myVar) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        int m3992constructorimpl = Operation.ObjectParameter.m3992constructorimpl(0);
        int m3992constructorimpl2 = Operation.ObjectParameter.m3992constructorimpl(1);
        myVar.getClass();
        p01.f(2, myVar);
        Operations.WriteScope.m4024setObjectsEsEZvaA(m4015constructorimpl, m3992constructorimpl, v, m3992constructorimpl2, myVar);
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushUpdateValue(Object obj, int i) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        Operations.WriteScope.m4023setObjectsGr0YRc(m4015constructorimpl, Operation.ObjectParameter.m3992constructorimpl(0), obj);
        m4015constructorimpl.intArgs[m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts()] = i;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUps(int i) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        m4015constructorimpl.intArgs[m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts()] = i;
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

    public final void pushInsertSlots(GapAnchor gapAnchor, SlotTable slotTable) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations.WriteScope.m4024setObjectsEsEZvaA(Operations.WriteScope.m4015constructorimpl(operations), Operation.ObjectParameter.m3992constructorimpl(0), gapAnchor, Operation.ObjectParameter.m3992constructorimpl(1), slotTable);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }
}
