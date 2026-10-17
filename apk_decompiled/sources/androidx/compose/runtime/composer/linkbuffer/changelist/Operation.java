package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.LinkRememberObserverHolder;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.linkbuffer.AnchorHandle;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.System_jvmKt;
import defpackage.dq;
import defpackage.iy;
import defpackage.ki0;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.r6;
import defpackage.uf;
import defpackage.w01;
import defpackage.wd0;
import defpackage.xk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final boolean isExternallyVisible;
    private final int objects;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AppendValue extends Operation {
        public static final int $stable = 0;
        public static final AppendValue INSTANCE = new AppendValue();

        private AppendValue() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object mo4075getObjectgvac4VY = operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0));
            if (mo4075getObjectgvac4VY instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo4075getObjectgvac4VY);
            }
            slotTableEditor.appendSlot(mo4075getObjectgvac4VY);
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m4031getValues5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "value" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, false, 1, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            IntRef intRef = (IntRef) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0));
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotTableEditor, rememberManager, operationErrorContext != null ? OperationKt.withCurrentStackTrace(operationErrorContext, slotTableEditor) : null);
        }

        /* renamed from: getChanges-s5KIjrA, reason: not valid java name */
        public final int m4032getChangess5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        /* renamed from: getEffectiveNodeIndex-s5KIjrA, reason: not valid java name */
        public final int m4033getEffectiveNodeIndexs5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "changes" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "effectiveNodeIndex" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ClearAllRecompositionRequired extends Operation {
        public static final int $stable = 0;
        public static final ClearAllRecompositionRequired INSTANCE = new ClearAllRecompositionRequired();

        private ClearAllRecompositionRequired() {
            super(0, 0, false, 3, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.removeAllInstancesOfFlags(GroupFlagsKt.IsRecompositionRequiredFlag);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int element = ((IntRef) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                applier.getClass();
                int i2 = element + i;
                applier.insertBottomUp(i2, obj);
                applier.insertTopDown(i2, obj);
            }
        }

        /* renamed from: getEffectiveNodeIndex-s5KIjrA, reason: not valid java name */
        public final int m4034getEffectiveNodeIndexs5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        /* renamed from: getNodes-s5KIjrA, reason: not valid java name */
        public final int m4035getNodess5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "effectiveNodeIndex" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "nodes" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class CopySlotTableToHandleLocation extends Operation {
        public static final int $stable = 0;
        public static final CopySlotTableToHandleLocation INSTANCE = new CopySlotTableToHandleLocation();

        private CopySlotTableToHandleLocation() {
            super(0, 4, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1));
            MovableContentState movableContentState = (MovableContentState) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0));
            if (movableContentState == null && (movableContentState = compositionContext.movableContentStateResolve$runtime(movableContentStateReference)) == null) {
                throw uf.a("Could not resolve state for movable content");
            }
            SlotTableEditor openEditor = SlotTableKt.asLinkBufferSlotTable(movableContentState.getSlotStorage$runtime()).openEditor();
            try {
                openEditor.startGroup();
                openEditor.startGroup();
                long moveFrom = slotTableEditor.moveFrom(openEditor, openEditor.handle(), (slotTableEditor.firstChildOf(slotTableEditor.getCurrentGroup()) << 32) | 4294967295L);
                openEditor.close();
                SlotTable table = slotTableEditor.getTable();
                int group = GroupHandleKt.getGroup(moveFrom);
                ControlledComposition composition$runtime = movableContentStateReference2.getComposition$runtime();
                composition$runtime.getClass();
                SlotTableKt.adoptScopesInGroupToNewParent(table, group, (RecomposeScopeOwner) composition$runtime);
            } catch (Throwable th) {
                openEditor.close();
                throw th;
            }
        }

        /* renamed from: getFrom-s5KIjrA, reason: not valid java name */
        public final int m4036getFroms5KIjrA() {
            return ObjectParameter.m4053constructorimpl(2);
        }

        /* renamed from: getParentCompositionContext-s5KIjrA, reason: not valid java name */
        public final int m4037getParentCompositionContexts5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        /* renamed from: getResolvedState-s5KIjrA, reason: not valid java name */
        public final int m4038getResolvedStates5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        /* renamed from: getTo-s5KIjrA, reason: not valid java name */
        public final int m4039getTos5KIjrA() {
            return ObjectParameter.m4053constructorimpl(3);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "resolvedState" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "resolvedCompositionContext" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(2)) ? "from" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(3)) ? "to" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DeactivateGroup extends Operation {
        public static final int $stable = 0;
        public static final DeactivateGroup INSTANCE = new DeactivateGroup();

        private DeactivateGroup() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTableEditorKt.deactivateGroup(slotTableEditor, rememberManager);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(2, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int positionToInsert;
            IntRef intRef = (IntRef) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0));
            long j = OperationArgContainerKt.getLong(operationArgContainer, 1, 0);
            applier.getClass();
            positionToInsert = OperationKt.positionToInsert(slotTableEditor, j, applier);
            intRef.setElement(positionToInsert);
        }

        /* renamed from: getEffectiveNodeIndexOut-s5KIjrA, reason: not valid java name */
        public final int m4040getEffectiveNodeIndexOuts5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        public final int getGroupHandleHighBits() {
            return 1;
        }

        public final int getGroupHandleLowBits() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "groupHandle[32..63]" : i == 1 ? "groupHandle[0..31]" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "effectiveNodeIndexOut" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DisposeMovableContentState extends Operation {
        public static final int $stable = 0;
        public static final DisposeMovableContentState INSTANCE = new DisposeMovableContentState();

        private DisposeMovableContentState() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((MovableContentState) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0))).dispose$runtime();
        }

        /* renamed from: getResolvedState-s5KIjrA, reason: not valid java name */
        public final int m4041getResolvedStates5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "resolvedState" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Downs extends Operation {
        public static final int $stable = 0;
        public static final Downs INSTANCE = new Downs();

        private Downs() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.getClass();
            for (Object obj : (Object[]) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0))) {
                applier.down(obj);
            }
        }

        /* renamed from: getNodes-s5KIjrA, reason: not valid java name */
        public final int m4042getNodess5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "nodes" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((ky) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0))).invoke((Composition) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1)));
        }

        /* renamed from: getAction-s5KIjrA, reason: not valid java name */
        public final int m4043getActions5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        /* renamed from: getComposition-s5KIjrA, reason: not valid java name */
        public final int m4044getCompositions5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "anchor" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "composition" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        private EndMovableContentPlacement() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            while (slotTableEditor.getParentGroup() >= 0) {
                if (slotTableEditor.isParentGroupANode()) {
                    applier.up();
                }
                slotTableEditor.endGroup();
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EndResumingScope extends Operation {
        public static final int $stable = 0;
        public static final EndResumingScope INSTANCE = new EndResumingScope();

        private EndResumingScope() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.endResumingScope((RecomposeScopeImpl) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)));
        }

        /* renamed from: getScope-s5KIjrA, reason: not valid java name */
        public final int m4045getScopes5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "scope" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(3, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object invoke = ((iy) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0))).invoke();
            int i = operationArgContainer.getInt(0);
            int group = GroupHandleKt.getGroup(getGroupHandle(operationArgContainer, slotTableEditor));
            applier.getClass();
            slotTableEditor.updateNode(group, invoke);
            applier.insertTopDown(i, invoke);
            applier.down(invoke);
        }

        /* renamed from: getFactory-s5KIjrA, reason: not valid java name */
        public final int m4046getFactorys5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public long getGroupHandle(OperationArgContainer operationArgContainer, SlotTableEditor slotTableEditor) {
            return OperationArgContainerKt.getLong(operationArgContainer, 1, 2);
        }

        public final int getGroupHandleHigh() {
            return 1;
        }

        public final int getGroupHandleLow() {
            return 2;
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "insertIndex" : i == 1 ? "groupHandleHigh" : i == 2 ? "groupHandleLow" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "factory" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InsertNodeFixupByAnchor extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixupByAnchor INSTANCE = new InsertNodeFixupByAnchor();

        private InsertNodeFixupByAnchor() {
            super(1, 2, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object invoke = ((iy) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0))).invoke();
            int i = operationArgContainer.getInt(0);
            int address = ((LinkAnchor) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1))).getAddress();
            applier.getClass();
            slotTableEditor.updateNode(address, invoke);
            applier.insertTopDown(i, invoke);
            applier.down(invoke);
        }

        /* renamed from: getAnchor-s5KIjrA, reason: not valid java name */
        public final int m4047getAnchors5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        /* renamed from: getFactory-s5KIjrA, reason: not valid java name */
        public final int m4048getFactorys5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "insertIndex" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "factory" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "anchor" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(2, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTableEditor.moveFrom$default(slotTableEditor, (SlotTable) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)), OperationArgContainerKt.getLong(operationArgContainer, 0, 1), 0L, 4, (Object) null);
            slotTableEditor.skipGroup();
        }

        /* renamed from: getFromSlotTable-s5KIjrA, reason: not valid java name */
        public final int m4049getFromSlotTables5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        public final int getSourceHighBits() {
            return 0;
        }

        public final int getSourceLowBits() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "source[32..63]" : i == 1 ? "source[0..31]" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "from" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(2, 2, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            OperationErrorContext withCurrentStackTrace;
            SlotTable slotTable = (SlotTable) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1));
            SlotTableEditor openEditor = slotTable.openEditor();
            if (operationErrorContext != null) {
                try {
                    withCurrentStackTrace = OperationKt.withCurrentStackTrace(operationErrorContext, slotTableEditor);
                } catch (Throwable th) {
                    openEditor.close();
                    throw th;
                }
            } else {
                withCurrentStackTrace = null;
            }
            fixupList.executeAndFlushAllPendingFixups(applier, openEditor, rememberManager, withCurrentStackTrace);
            openEditor.close();
            SlotTableEditor.moveFrom$default(slotTableEditor, slotTable, OperationArgContainerKt.getLong(operationArgContainer, 0, 1), 0L, 4, (Object) null);
            slotTableEditor.skipGroup();
        }

        /* renamed from: getFixups-s5KIjrA, reason: not valid java name */
        public final int m4050getFixupss5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        /* renamed from: getFromSlotTable-s5KIjrA, reason: not valid java name */
        public final int m4051getFromSlotTables5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        public final int getSourceHighBits() {
            return 0;
        }

        public final int getSourceLowBits() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "sourceHandle[32..63]" : i == 1 ? "sourceHandle[0..31]" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "from" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "fixups" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MoveGroup extends Operation {
        public static final int $stable = 0;
        public static final MoveGroup INSTANCE = new MoveGroup();

        private MoveGroup() {
            super(1, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.moveGroup(operationArgContainer.getInt(0));
        }

        public final int getOffset() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "offset" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.move(operationArgContainer.getInt(0), operationArgContainer.getInt(1), operationArgContainer.getInt(2));
        }

        public final int getCount() {
            return 2;
        }

        public final int getFrom() {
            return 0;
        }

        public final int getTo() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "from" : i == 1 ? "to" : i == 2 ? "count" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        private PostInsertNodeFixup() {
            super(3, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i = operationArgContainer.getInt(0);
            int group = GroupHandleKt.getGroup(OperationArgContainerKt.getLong(operationArgContainer, 1, 2));
            applier.up();
            applier.insertBottomUp(i, slotTableEditor.node(group));
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public long getGroupHandle(OperationArgContainer operationArgContainer, SlotTableEditor slotTableEditor) {
            return OperationArgContainerKt.getLong(operationArgContainer, 1, 2);
        }

        public final int getGroupHandleHigh() {
            return 1;
        }

        public final int getGroupHandleLow() {
            return 2;
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "insertIndex" : i == 1 ? "groupHandleHigh" : i == 2 ? "groupHandleLow" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PostInsertNodeFixupByAnchor extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixupByAnchor INSTANCE = new PostInsertNodeFixupByAnchor();

        private PostInsertNodeFixupByAnchor() {
            super(1, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i = operationArgContainer.getInt(0);
            int address = ((LinkAnchor) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0))).getAddress();
            applier.up();
            applier.insertBottomUp(i, slotTableEditor.node(address));
        }

        /* renamed from: getAnchor-s5KIjrA, reason: not valid java name */
        public final int m4059getAnchors5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "insertIndex" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "anchor" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ReleaseMovableGroup extends Operation {
        public static final int $stable = 0;
        public static final ReleaseMovableGroup INSTANCE = new ReleaseMovableGroup();

        private ReleaseMovableGroup() {
            super(0, 3, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            OperationKt.releaseMovableGroup((ControlledComposition) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)), (CompositionContext) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1)), (MovableContentStateReference) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(2)), slotTableEditor, applier);
        }

        /* renamed from: getComposition-s5KIjrA, reason: not valid java name */
        public final int m4060getCompositions5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-s5KIjrA, reason: not valid java name */
        public final int m4061getParentCompositionContexts5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        /* renamed from: getReference-s5KIjrA, reason: not valid java name */
        public final int m4062getReferences5KIjrA() {
            return ObjectParameter.m4053constructorimpl(2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "composition" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "parentCompositionContext" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(2)) ? "reference" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Remember extends Operation {
        public static final int $stable = 0;
        public static final Remember INSTANCE = new Remember();

        private Remember() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.remembering((RememberObserverHolder) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)));
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m4063getValues5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "value" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RememberPausingScope extends Operation {
        public static final int $stable = 0;
        public static final RememberPausingScope INSTANCE = new RememberPausingScope();

        private RememberPausingScope() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.rememberPausingScope((RecomposeScopeImpl) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)));
        }

        /* renamed from: getScope-s5KIjrA, reason: not valid java name */
        public final int m4064getScopes5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "scope" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RemoveGroup extends Operation {
        public static final int $stable = 0;
        public static final RemoveGroup INSTANCE = new RemoveGroup();

        private RemoveGroup() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTableEditorKt.removeGroupAndForgetSlots(slotTableEditor, rememberManager);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;
        public static final RemoveNode INSTANCE = new RemoveNode();

        private RemoveNode() {
            super(2, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.remove(operationArgContainer.getInt(0), operationArgContainer.getInt(1));
        }

        public final int getCount() {
            return 1;
        }

        public final int getRemoveIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "removeIndex" : i == 1 ? "count" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RemoveTailGroupsAndValues extends Operation {
        public static final int $stable = 0;
        public static final RemoveTailGroupsAndValues INSTANCE = new RemoveTailGroupsAndValues();

        private RemoveTailGroupsAndValues() {
            super(2, 0, false, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean execute$lambda$0(RememberManager rememberManager, int i, int i2, Object obj) {
            if (obj instanceof ComposeNodeLifecycleCallback) {
                ((ComposeNodeLifecycleCallback) obj).onRelease();
                return false;
            }
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) obj);
                return false;
            }
            if (!(obj instanceof RecomposeScopeImpl)) {
                return false;
            }
            ((RecomposeScopeImpl) obj).release();
            return false;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i = operationArgContainer.getInt(1);
            int i2 = operationArgContainer.getInt(0);
            slotTableEditor.visitTailSlotsInRememberOrder$runtime(slotTableEditor.getParentGroup(), i2, i, new wd0(rememberManager, 0));
            slotTableEditor.trimSlots(i);
            while (slotTableEditor.getCurrentGroup() != i2) {
                slotTableEditor.skipGroup();
            }
            while (slotTableEditor.getCurrentGroup() >= 0) {
                slotTableEditor.removeGroup(true);
            }
        }

        public final int getFirstTailGroupToRemove() {
            return 0;
        }

        public final int getTailSlotCount() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "firstTailGroupToRemove" : i == 1 ? "tailSlotCount" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;
        public static final ResetSlots INSTANCE = new ResetSlots();

        private ResetSlots() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.reset();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SeekToAnchor extends Operation {
        public static final int $stable = 0;
        public static final SeekToAnchor INSTANCE = new SeekToAnchor();

        private SeekToAnchor() {
            super(0, 1, false, 1, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.seek(((AnchorHandle) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0))).toHandle());
        }

        /* renamed from: getAnchorHandle-s5KIjrA, reason: not valid java name */
        public final int m4065getAnchorHandles5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "anchorHandle" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SeekToGroupHandle extends Operation {
        public static final int $stable = 0;
        public static final SeekToGroupHandle INSTANCE = new SeekToGroupHandle();

        private SeekToGroupHandle() {
            super(2, 0, false, 2, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.seek(OperationArgContainerKt.getLong(operationArgContainer, 0, 1));
        }

        public final int getGroupHandleHighBits() {
            return 0;
        }

        public final int getGroupHandleLowBits() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "group[32..63]" : i == 1 ? "group[0..31]" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;
        public static final SideEffect INSTANCE = new SideEffect();

        private SideEffect() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.sideEffect((iy) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)));
        }

        /* renamed from: getEffect-s5KIjrA, reason: not valid java name */
        public final int m4066getEffects5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "effect" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SkipGroup extends Operation {
        public static final int $stable = 0;
        public static final SkipGroup INSTANCE = new SkipGroup();

        private SkipGroup() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.skipGroup();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class StartGroup extends Operation {
        public static final int $stable = 0;
        public static final StartGroup INSTANCE = new StartGroup();

        private StartGroup() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.startGroup();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class StartResumingScope extends Operation {
        public static final int $stable = 0;
        public static final StartResumingScope INSTANCE = new StartResumingScope();

        private StartResumingScope() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.startResumingScope((RecomposeScopeImpl) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)));
        }

        /* renamed from: getScope-s5KIjrA, reason: not valid java name */
        public final int m4067getScopes5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "scope" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        private UpdateAuxData() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.updateAux(operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)));
        }

        /* renamed from: getData-s5KIjrA, reason: not valid java name */
        public final int m4068getDatas5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "data" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.apply((my) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1)), operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)));
        }

        /* renamed from: getBlock-s5KIjrA, reason: not valid java name */
        public final int m4069getBlocks5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m4070getValues5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "value" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "block" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateRememberObserverHolderOrdering extends Operation {
        public static final int $stable = 0;
        public static final UpdateRememberObserverHolderOrdering INSTANCE = new UpdateRememberObserverHolderOrdering();

        private UpdateRememberObserverHolderOrdering() {
            super(0, 2, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((LinkRememberObserverHolder) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(1))).setAfter((LinkAnchor) operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0)));
        }

        /* renamed from: getAfter-s5KIjrA, reason: not valid java name */
        public final int m4071getAfters5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        /* renamed from: getHolder-s5KIjrA, reason: not valid java name */
        public final int m4072getHolders5KIjrA() {
            return ObjectParameter.m4053constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "after" : ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(1)) ? "rememberObserverHolder" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateValue INSTANCE = new UpdateValue();

        private UpdateValue() {
            super(1, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object mo4075getObjectgvac4VY = operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0));
            int i = operationArgContainer.getInt(0);
            if (mo4075getObjectgvac4VY instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo4075getObjectgvac4VY);
            }
            Object absolute = slotTableEditor.setAbsolute(i, mo4075getObjectgvac4VY);
            if (absolute instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) absolute);
            } else if (absolute instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) absolute).release();
            }
        }

        public final int getSlotAddress() {
            return 0;
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m4073getValues5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "slotAddress" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "value" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateValueRelative extends Operation {
        public static final int $stable = 0;
        public static final UpdateValueRelative INSTANCE = new UpdateValueRelative();

        private UpdateValueRelative() {
            super(1, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object mo4075getObjectgvac4VY = operationArgContainer.mo4075getObjectgvac4VY(ObjectParameter.m4053constructorimpl(0));
            int i = operationArgContainer.getInt(0);
            if (mo4075getObjectgvac4VY instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo4075getObjectgvac4VY);
            }
            Object relative = slotTableEditor.setRelative(i, mo4075getObjectgvac4VY);
            if (relative instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) relative);
            } else if (relative instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) relative).release();
            }
        }

        public final int getSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m4074getValues5KIjrA() {
            return ObjectParameter.m4053constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "slotIndex" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo4030objectParamNamegvac4VY(int i) {
            return ObjectParameter.m4055equalsimpl0(i, ObjectParameter.m4053constructorimpl(0)) ? "value" : super.mo4030objectParamNamegvac4VY(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Ups extends Operation {
        public static final int $stable = 0;
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i = operationArgContainer.getInt(0);
            for (int i2 = 0; i2 < i; i2++) {
                applier.up();
            }
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "count" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        private UseCurrentNode() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.reuse();
        }
    }

    public /* synthetic */ Operation(int i, int i2, boolean z, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? true : z, null);
    }

    public abstract void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext);

    public final void executeWithComposeStackTrace(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        long groupHandle = getGroupHandle(operationArgContainer, slotTableEditor);
        try {
            execute(operationArgContainer, applier, slotTableEditor, rememberManager, operationErrorContext);
        } catch (Throwable th) {
            throw OperationKt.attachComposeStackTrace(th, operationErrorContext, slotTableEditor, groupHandle);
        }
    }

    public long getGroupHandle(OperationArgContainer operationArgContainer, SlotTableEditor slotTableEditor) {
        return -1L;
    }

    public final int getInts() {
        return this.ints;
    }

    public final String getName() {
        String b = ki0.a(getClass()).b();
        return b == null ? "" : b;
    }

    public final int getObjects() {
        return this.objects;
    }

    public String intParamName(int i) {
        return r6.b("IntParameter(", i, ')');
    }

    public final boolean isExternallyVisible() {
        return this.isExternallyVisible;
    }

    /* renamed from: objectParamName-gvac4VY, reason: not valid java name */
    public String mo4030objectParamNamegvac4VY(int i) {
        return r6.b("ObjectParameter(", i, ')');
    }

    public String toString() {
        return getName();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;
        private final ny block;
        private final List<Integer> intParams;
        private final List<ObjectParameter<Object>> objParams;

        public TestOperation(int i, int i2, ny nyVar) {
            super(i, i2, false, 4, null);
            this.block = nyVar;
            ArrayList arrayList = new ArrayList(i);
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(Integer.valueOf(i3));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList2.add(ObjectParameter.m4052boximpl(ObjectParameter.m4053constructorimpl(i4)));
            }
            this.objParams = arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 _init_$lambda$0(Applier applier, SlotTableEditor slotTableEditor, RememberManager rememberManager) {
            return w01.a;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            this.block.invoke(applier, slotTableEditor, rememberManager);
        }

        public final ny getBlock() {
            return this.block;
        }

        public final List<Integer> getIntParams() {
            return this.intParams;
        }

        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + System_jvmKt.identityHashCode(this);
        }

        public static /* synthetic */ void getIntParams$annotations() {
        }

        public static /* synthetic */ void getObjParams$annotations() {
        }

        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        public /* synthetic */ TestOperation(int i, int i2, ny nyVar, int i3, dq dqVar) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new xk(28) : nyVar);
        }
    }

    private Operation(int i, int i2, boolean z) {
        this.ints = i;
        this.objects = i2;
        this.isExternallyVisible = z;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ObjectParameter<T> {
        private final int offset;

        private /* synthetic */ ObjectParameter(int i) {
            this.offset = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m4052boximpl(int i) {
            return new ObjectParameter(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4054equalsimpl(int i, Object obj) {
            return (obj instanceof ObjectParameter) && i == ((ObjectParameter) obj).m4058unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4055equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4056hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4057toStringimpl(int i) {
            return r6.b("ObjectParameter(offset=", i, ')');
        }

        public boolean equals(Object obj) {
            return m4054equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m4056hashCodeimpl(this.offset);
        }

        public String toString() {
            return m4057toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4058unboximpl() {
            return this.offset;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m4053constructorimpl(int i) {
            return i;
        }
    }

    public /* synthetic */ Operation(int i, int i2, boolean z, dq dqVar) {
        this(i, i2, z);
    }
}
