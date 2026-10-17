package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
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
import defpackage.xk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.advanceBy(operationArgContainer.getInt(0));
        }

        public final int getDistance() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "distance" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AppendValue extends Operation {
        public static final int $stable = 0;
        public static final AppendValue INSTANCE = new AppendValue();

        private AppendValue() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            Object mo4012getObjectPtLUHM = operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            if (mo4012getObjectPtLUHM instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo4012getObjectPtLUHM);
            }
            slotWriter.appendSlot(gapAnchor, mo4012getObjectPtLUHM);
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m3967getAnchorw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m3968getValuew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "anchor" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "value" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            IntRef intRef = (IntRef) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager, operationErrorContext != null ? OperationKt.withCurrentStackTrace(operationErrorContext, slotWriter) : null);
        }

        /* renamed from: getChanges-w8_IdGo, reason: not valid java name */
        public final int m3969getChangesw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        /* renamed from: getEffectiveNodeIndex-w8_IdGo, reason: not valid java name */
        public final int m3970getEffectiveNodeIndexw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "changes" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "effectiveNodeIndex" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int element = ((IntRef) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                applier.getClass();
                int i2 = element + i;
                applier.insertBottomUp(i2, obj);
                applier.insertTopDown(i2, obj);
            }
        }

        /* renamed from: getEffectiveNodeIndex-w8_IdGo, reason: not valid java name */
        public final int m3971getEffectiveNodeIndexw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        /* renamed from: getNodes-w8_IdGo, reason: not valid java name */
        public final int m3972getNodesw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "effectiveNodeIndex" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "nodes" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            MovableContentState movableContentState = (MovableContentState) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            if (movableContentState == null && (movableContentState = compositionContext.movableContentStateResolve$runtime(movableContentStateReference)) == null) {
                throw uf.a("Could not resolve state for movable content");
            }
            List<GapAnchor> moveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, SlotTableKt.asGapBufferSlotTable(movableContentState.getSlotStorage$runtime()), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            ControlledComposition composition$runtime = movableContentStateReference2.getComposition$runtime();
            composition$runtime.getClass();
            companion.adoptAnchoredScopes$runtime(slotWriter, moveIntoGroupFrom, (RecomposeScopeOwner) composition$runtime);
        }

        /* renamed from: getFrom-w8_IdGo, reason: not valid java name */
        public final int m3973getFromw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(2);
        }

        /* renamed from: getParentCompositionContext-w8_IdGo, reason: not valid java name */
        public final int m3974getParentCompositionContextw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        /* renamed from: getResolvedState-w8_IdGo, reason: not valid java name */
        public final int m3975getResolvedStatew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        /* renamed from: getTo-w8_IdGo, reason: not valid java name */
        public final int m3976getTow8_IdGo() {
            return ObjectParameter.m3992constructorimpl(3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "resolvedState" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "resolvedCompositionContext" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(2)) ? "from" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(3)) ? "to" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private DeactivateCurrentGroup() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            GapComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int positionToInsert;
            IntRef intRef = (IntRef) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            applier.getClass();
            positionToInsert = OperationKt.positionToInsert(slotWriter, gapAnchor, applier);
            intRef.setElement(positionToInsert);
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m3977getAnchorw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        /* renamed from: getEffectiveNodeIndexOut-w8_IdGo, reason: not valid java name */
        public final int m3978getEffectiveNodeIndexOutw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "effectiveNodeIndexOut" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "anchor" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Downs extends Operation {
        public static final int $stable = 0;
        public static final Downs INSTANCE = new Downs();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Downs() {
            super(0, r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.getClass();
            for (Object obj : (Object[]) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0))) {
                applier.down(obj);
            }
        }

        /* renamed from: getNodes-w8_IdGo, reason: not valid java name */
        public final int m3979getNodesw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "nodes" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((ky) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0))).invoke((Composition) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1)));
        }

        /* renamed from: getAction-w8_IdGo, reason: not valid java name */
        public final int m3980getActionw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        /* renamed from: getComposition-w8_IdGo, reason: not valid java name */
        public final int m3981getCompositionw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "anchor" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "composition" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EndCurrentGroup() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.endGroup();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EndMovableContentPlacement() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.getClass();
            OperationKt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EndResumingScope extends Operation {
        public static final int $stable = 0;
        public static final EndResumingScope INSTANCE = new EndResumingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EndResumingScope() {
            super(0, r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.endResumingScope((RecomposeScopeImpl) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0)));
        }

        /* renamed from: getScope-w8_IdGo, reason: not valid java name */
        public final int m3982getScopew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "scope" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EnsureGroupStarted() {
            super(0, r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.ensureStarted((GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0)));
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m3983getAnchorw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "anchor" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EnsureRootGroupStarted() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.ensureStarted(0);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object invoke = ((iy) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0))).invoke();
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            int i = operationArgContainer.getInt(0);
            applier.getClass();
            slotWriter.updateNode(gapAnchor, invoke);
            applier.insertTopDown(i, invoke);
            applier.down(invoke);
        }

        /* renamed from: getFactory-w8_IdGo, reason: not valid java name */
        public final int m3984getFactoryw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public GapAnchor getGroupAnchor(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
            return (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
        }

        /* renamed from: getGroupAnchor-w8_IdGo, reason: not valid java name */
        public final int m3985getGroupAnchorw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "insertIndex" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "factory" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "groupAnchor" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, gapAnchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m3986getAnchorw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-w8_IdGo, reason: not valid java name */
        public final int m3987getFromSlotTablew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "anchor" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "from" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            OperationErrorContext withCurrentStackTrace;
            SlotTable slotTable = (SlotTable) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(2));
            SlotWriter openWriter = slotTable.openWriter();
            if (operationErrorContext != null) {
                try {
                    withCurrentStackTrace = OperationKt.withCurrentStackTrace(operationErrorContext, slotWriter);
                } catch (Throwable th) {
                    openWriter.close(false);
                    throw th;
                }
            } else {
                withCurrentStackTrace = null;
            }
            fixupList.executeAndFlushAllPendingFixups(applier, openWriter, rememberManager, withCurrentStackTrace);
            openWriter.close(true);
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, gapAnchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m3988getAnchorw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        /* renamed from: getFixups-w8_IdGo, reason: not valid java name */
        public final int m3989getFixupsw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(2);
        }

        /* renamed from: getFromSlotTable-w8_IdGo, reason: not valid java name */
        public final int m3990getFromSlotTablew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "anchor" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "from" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(2)) ? "fixups" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.moveGroup(operationArgContainer.getInt(0));
        }

        public final int getOffset() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "offset" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
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

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "from" : i == 1 ? "to" : i == 2 ? "count" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private PostInsertNodeFixup() {
            super(r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            int i = operationArgContainer.getInt(0);
            applier.up();
            applier.insertBottomUp(i, slotWriter.node(gapAnchor));
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public GapAnchor getGroupAnchor(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
            return (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
        }

        /* renamed from: getGroupAnchor-w8_IdGo, reason: not valid java name */
        public final int m3998getGroupAnchorw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "insertIndex" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "groupAnchor" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ControlledComposition controlledComposition = (ControlledComposition) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(2));
            ((CompositionContext) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1))).movableContentStateReleased$runtime(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(controlledComposition, movableContentStateReference, slotWriter, null), applier);
        }

        /* renamed from: getComposition-w8_IdGo, reason: not valid java name */
        public final int m3999getCompositionw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-w8_IdGo, reason: not valid java name */
        public final int m4000getParentCompositionContextw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        /* renamed from: getReference-w8_IdGo, reason: not valid java name */
        public final int m4001getReferencew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(2);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "composition" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "parentCompositionContext" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(2)) ? "reference" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Remember extends Operation {
        public static final int $stable = 0;
        public static final Remember INSTANCE = new Remember();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Remember() {
            super(0, r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.remembering((RememberObserverHolder) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0)));
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m4002getValuew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "value" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RememberPausingScope extends Operation {
        public static final int $stable = 0;
        public static final RememberPausingScope INSTANCE = new RememberPausingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private RememberPausingScope() {
            super(0, r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.rememberPausingScope((RecomposeScopeImpl) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0)));
        }

        /* renamed from: getScope-w8_IdGo, reason: not valid java name */
        public final int m4003getScopew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "scope" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private RemoveCurrentGroup() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;
        public static final RemoveNode INSTANCE = new RemoveNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private RemoveNode() {
            super(r2, 0, r2, null);
            int i = 2;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.remove(operationArgContainer.getInt(0), operationArgContainer.getInt(1));
        }

        public final int getCount() {
            return 1;
        }

        public final int getRemoveIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "removeIndex" : i == 1 ? "count" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;
        public static final ResetSlots INSTANCE = new ResetSlots();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ResetSlots() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.reset();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;
        public static final SideEffect INSTANCE = new SideEffect();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private SideEffect() {
            super(0, r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.sideEffect((iy) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0)));
        }

        /* renamed from: getEffect-w8_IdGo, reason: not valid java name */
        public final int m4004getEffectw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "effect" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private SkipToEndOfCurrentGroup() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class StartResumingScope extends Operation {
        public static final int $stable = 0;
        public static final StartResumingScope INSTANCE = new StartResumingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private StartResumingScope() {
            super(0, r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.startResumingScope((RecomposeScopeImpl) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0)));
        }

        /* renamed from: getScope-w8_IdGo, reason: not valid java name */
        public final int m4005getScopew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "scope" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TrimParentValues extends Operation {
        public static final int $stable = 0;
        public static final TrimParentValues INSTANCE = new TrimParentValues();

        private TrimParentValues() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i = operationArgContainer.getInt(0);
            int parent = slotWriter.getParent();
            int slotsStartIndex$runtime = slotWriter.slotsStartIndex$runtime(parent);
            int slotsEndIndex$runtime = slotWriter.slotsEndIndex$runtime(parent);
            for (int max = Math.max(slotsStartIndex$runtime, slotsEndIndex$runtime - i); max < slotsEndIndex$runtime; max++) {
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(max)];
                if (obj instanceof RememberObserverHolder) {
                    rememberManager.forgetting((RememberObserverHolder) obj);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            slotWriter.trimTailSlots(i);
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "count" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateAnchoredValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateAnchoredValue INSTANCE = new UpdateAnchoredValue();

        private UpdateAnchoredValue() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object mo4012getObjectPtLUHM = operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1));
            int i = operationArgContainer.getInt(0);
            if (mo4012getObjectPtLUHM instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo4012getObjectPtLUHM);
            }
            Object obj = slotWriter.set(slotWriter.anchorIndex(gapAnchor), i, mo4012getObjectPtLUHM);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) obj);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m4006getAnchorw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m4007getValuew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "groupSlotIndex" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "value" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "anchor" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private UpdateAuxData() {
            super(0, r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.updateAux(operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0)));
        }

        /* renamed from: getData-w8_IdGo, reason: not valid java name */
        public final int m4008getDataw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "data" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.apply((my) operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(1)), operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0)));
        }

        /* renamed from: getBlock-w8_IdGo, reason: not valid java name */
        public final int m4009getBlockw8_IdGo() {
            return ObjectParameter.m3992constructorimpl(1);
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m4010getValuew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "value" : ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(1)) ? "block" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateValue INSTANCE = new UpdateValue();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private UpdateValue() {
            super(r0, r0, null);
            int i = 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object mo4012getObjectPtLUHM = operationArgContainer.mo4012getObjectPtLUHM(ObjectParameter.m3992constructorimpl(0));
            int i = operationArgContainer.getInt(0);
            if (mo4012getObjectPtLUHM instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo4012getObjectPtLUHM);
            }
            Object obj = slotWriter.set(slotWriter.getCurrentGroup(), i, mo4012getObjectPtLUHM);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) obj);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m4011getValuew8_IdGo() {
            return ObjectParameter.m3992constructorimpl(0);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "groupSlotIndex" : super.intParamName(i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo3966objectParamNamePtLUHM(int i) {
            return ObjectParameter.m3994equalsimpl0(i, ObjectParameter.m3992constructorimpl(0)) ? "value" : super.mo3966objectParamNamePtLUHM(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Ups extends Operation {
        public static final int $stable = 0;
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i = operationArgContainer.getInt(0);
            for (int i2 = 0; i2 < i; i2++) {
                applier.up();
            }
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i) {
            return i == 0 ? "count" : super.intParamName(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private UseCurrentNode() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.reuse();
        }
    }

    public /* synthetic */ Operation(int i, int i2, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, null);
    }

    public abstract void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext);

    public final void executeWithComposeStackTrace(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        GapAnchor groupAnchor = getGroupAnchor(operationArgContainer, slotWriter);
        try {
            execute(operationArgContainer, applier, slotWriter, rememberManager, operationErrorContext);
        } catch (Throwable th) {
            throw OperationKt.attachComposeStackTrace(th, operationErrorContext, slotWriter, groupAnchor);
        }
    }

    public GapAnchor getGroupAnchor(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
        return null;
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

    /* renamed from: objectParamName-PtL-UHM, reason: not valid java name */
    public String mo3966objectParamNamePtLUHM(int i) {
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
            super(i, i2, null);
            this.block = nyVar;
            ArrayList arrayList = new ArrayList(i);
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(Integer.valueOf(i3));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList2.add(ObjectParameter.m3991boximpl(ObjectParameter.m3992constructorimpl(i4)));
            }
            this.objParams = arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 _init_$lambda$0(Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            return w01.a;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            this.block.invoke(applier, slotWriter, rememberManager);
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

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
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
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new xk(29) : nyVar);
        }
    }

    private Operation(int i, int i2) {
        this.ints = i;
        this.objects = i2;
    }

    public /* synthetic */ Operation(int i, int i2, dq dqVar) {
        this(i, i2);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ObjectParameter<T> {
        private final int offset;

        private /* synthetic */ ObjectParameter(int i) {
            this.offset = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m3991boximpl(int i) {
            return new ObjectParameter(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m3993equalsimpl(int i, Object obj) {
            return (obj instanceof ObjectParameter) && i == ((ObjectParameter) obj).m3997unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3994equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m3995hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m3996toStringimpl(int i) {
            return r6.b("ObjectParameter(offset=", i, ')');
        }

        public boolean equals(Object obj) {
            return m3993equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m3995hashCodeimpl(this.offset);
        }

        public String toString() {
            return m3996toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3997unboximpl() {
            return this.offset;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m3992constructorimpl(int i) {
            return i;
        }
    }
}
