package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.ScopeInvalidated;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableBuilder;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.composer.linkbuffer.changelist.OperationKt;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import defpackage.gy;
import defpackage.iy;
import defpackage.n10;
import defpackage.oa0;
import defpackage.xe0;
import defpackage.y80;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OperationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable attachComposeStackTrace(Throwable th, final OperationErrorContext operationErrorContext, final SlotTableEditor slotTableEditor, final long j) {
        return operationErrorContext == null ? th : ComposeStackTraceKt.attachComposeStackTrace(th, new iy() { // from class: xd0
            @Override // defpackage.iy
            public final Object invoke() {
                ComposeStackTrace attachComposeStackTrace$lambda$0;
                attachComposeStackTrace$lambda$0 = OperationKt.attachComposeStackTrace$lambda$0(j, slotTableEditor, operationErrorContext);
                return attachComposeStackTrace$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeStackTrace attachComposeStackTrace$lambda$0(long j, SlotTableEditor slotTableEditor, OperationErrorContext operationErrorContext) {
        if (j != -1) {
            slotTableEditor.seek(j);
        }
        List buildTrace$default = SlotTableEditorKt.buildTrace$default(slotTableEditor, null, 0, 3, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) yi.w0(buildTrace$default);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List<ComposeStackTraceFrame> buildStackTrace = operationErrorContext.buildStackTrace(groupOffset);
        if (groupOffset != null && !buildStackTrace.isEmpty()) {
            buildStackTrace = yi.A0(y80.D(ComposeStackTraceFrame.copy$default((ComposeStackTraceFrame) yi.p0(buildStackTrace), 0, null, groupOffset, 3, null)), yi.o0(buildStackTrace, 1));
        }
        return new ComposeStackTrace(yi.A0(buildTrace$default, buildStackTrace), operationErrorContext.getSourceInformationEnabled());
    }

    private static final int nodeIndex(SlotTableEditor slotTableEditor, int i) {
        if (i < 0) {
            return 0;
        }
        SlotTable table = slotTableEditor.getTable();
        int[] groups = table.getAddressSpace().getGroups();
        int i2 = i;
        int i3 = i2;
        int i4 = 0;
        while (true) {
            if (i2 > 0) {
                if (slotTableEditor.isNode(i2)) {
                    break;
                }
                int parentOf = slotTableEditor.parentOf(i2);
                int[] groups2 = table.getAddressSpace().getGroups();
                for (int root = parentOf < 0 ? table.getRoot() : slotTableEditor.firstChildOf(parentOf); root >= 0 && root != i3; root = groups2[root + 1]) {
                    i4 += slotTableEditor.nodeCountOf(root);
                }
                i2 = groups[i2 + 2];
                i3 = parentOf;
            } else if (!(i2 != 0)) {
                gy.h(i, "Traversing parent of group not in the slot table: ");
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(SlotTableEditor slotTableEditor, long j, Applier<Object> applier) {
        positionToParentOf(slotTableEditor, applier, j);
        int parentGroup = slotTableEditor.getParentGroup();
        int group = GroupHandleKt.getGroup(j);
        IntStack intStack = new IntStack();
        int[] groups = slotTableEditor.getTable().getAddressSpace().getGroups();
        int i = group;
        while (true) {
            if (i <= 0) {
                if (!(i != 0)) {
                    gy.h(group, "Traversing parent of group not in the slot table: ");
                }
            } else {
                if (i == parentGroup) {
                    break;
                }
                intStack.push(i);
                i = groups[i + 2];
            }
        }
        if (!(slotTableEditor.getParentGroup() == parentGroup)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure when inserting movable content");
        }
        int currentGroup = slotTableEditor.getCurrentGroup();
        int i2 = 0;
        boolean z = false;
        while (slotTableEditor.getCurrentGroup() != group) {
            if (intStack.tos == 0 || slotTableEditor.getCurrentGroup() != intStack.peek()) {
                i2 += slotTableEditor.skipGroup();
            } else {
                if (slotTableEditor.isNode()) {
                    applier.down(slotTableEditor.getNode());
                    z = true;
                    i2 = 0;
                }
                slotTableEditor.startGroup();
                intStack.pop();
            }
        }
        return i2 + (z ? 0 : nodeIndex(slotTableEditor, currentGroup));
    }

    private static final void positionToParentOf(SlotTableEditor slotTableEditor, Applier<Object> applier, long j) {
        if (slotTableEditor.getParentGroup() >= 0) {
            int[] iArr = n10.a;
            oa0 oa0Var = new oa0();
            SlotTable table = slotTableEditor.getTable();
            int parentOf = slotTableEditor.parentOf(GroupHandleKt.getGroup(j));
            int[] groups = table.getAddressSpace().getGroups();
            int i = parentOf;
            while (i > 0) {
                oa0Var.b(i);
                i = groups[i + 2];
            }
            if (i == 0) {
                gy.h(parentOf, "Traversing parent of group not in the slot table: ");
            }
            while (slotTableEditor.getParentGroup() >= 0 && !oa0Var.a(slotTableEditor.getParentGroup())) {
                if (slotTableEditor.isParentGroupANode()) {
                    applier.up();
                }
                slotTableEditor.endGroup();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseMovableGroup(final ControlledComposition controlledComposition, CompositionContext compositionContext, final MovableContentStateReference movableContentStateReference, SlotTableEditor slotTableEditor, Applier<?> applier) {
        SlotTable table = slotTableEditor.getTable();
        SlotTable.Companion companion = SlotTable.Companion;
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(table.getAddressSpace(), false, false);
        slotTableBuilder.buildStart();
        MovableContent<Object> content$runtime = movableContentStateReference.getContent$runtime();
        slotTableBuilder.startNewGroup(MovableContentKt.movableContentKey, content$runtime != Composer.Companion.getEmpty() ? GroupFlagsKt.HasObjectKeyFlag : 0, content$runtime, null, null);
        slotTableBuilder.addFlags(GroupFlagsKt.IsMovableContentFlag);
        slotTableBuilder.append(movableContentStateReference.getParameter$runtime());
        slotTableBuilder.moveFrom(slotTableEditor, slotTableEditor.getTable().getAddressSpace().getGroups()[LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime()).getAddress() + 3] & 4294967295L);
        slotTableBuilder.endGroup();
        SlotTable build = slotTableBuilder.build();
        MovableContentState movableContentState = new MovableContentState(build);
        if (build.hasRecomposeScopes(build.getRoot())) {
            SlotTableKt.adoptScopesInGroupToNewParent(build, build.getRoot(), new RecomposeScopeOwner() { // from class: androidx.compose.runtime.composer.linkbuffer.changelist.OperationKt$releaseMovableGroup$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
                    InvalidationResult invalidationResult;
                    ControlledComposition controlledComposition2 = ControlledComposition.this;
                    RecomposeScopeOwner recomposeScopeOwner = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner == null || (invalidationResult = recomposeScopeOwner.invalidate(recomposeScopeImpl, obj)) == null) {
                        invalidationResult = InvalidationResult.IGNORED;
                    }
                    if (invalidationResult != InvalidationResult.IGNORED) {
                        return invalidationResult;
                    }
                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                    List<xe0> invalidations$runtime = movableContentStateReference2.getInvalidations$runtime();
                    if (obj == null) {
                        obj = ScopeInvalidated.INSTANCE;
                    }
                    movableContentStateReference2.setInvalidations$runtime(yi.B0(invalidations$runtime, new xe0(recomposeScopeImpl, obj)));
                    return InvalidationResult.SCHEDULED;
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recordReadOf(Object obj) {
                }
            });
        }
        compositionContext.movableContentStateReleased$runtime(movableContentStateReference, movableContentState, applier);
    }

    private static final void withCurrentStackTrace(OperationErrorContext operationErrorContext, SlotTableEditor slotTableEditor, long j, iy iyVar) {
        try {
            iyVar.invoke();
        } catch (Throwable th) {
            throw attachComposeStackTrace(th, operationErrorContext, slotTableEditor, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperationErrorContext withCurrentStackTrace(final OperationErrorContext operationErrorContext, final SlotTableEditor slotTableEditor) {
        return new OperationErrorContext() { // from class: androidx.compose.runtime.composer.linkbuffer.changelist.OperationKt$withCurrentStackTrace$1
            @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
            public List<ComposeStackTraceFrame> buildStackTrace(Integer num) {
                List<ComposeStackTraceFrame> buildStackTrace = OperationErrorContext.this.buildStackTrace(null);
                int parentGroup = slotTableEditor.getParentGroup();
                return parentGroup < 0 ? buildStackTrace : yi.A0(SlotTableEditorKt.buildTrace(slotTableEditor, num, parentGroup), buildStackTrace);
            }

            @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
            public boolean getSourceInformationEnabled() {
                return OperationErrorContext.this.getSourceInformationEnabled();
            }
        };
    }
}
