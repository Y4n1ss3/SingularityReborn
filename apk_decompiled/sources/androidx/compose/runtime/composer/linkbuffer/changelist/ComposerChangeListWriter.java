package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.LinkRememberObserverHolder;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsSpec;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableReader;
import androidx.compose.runtime.internal.IntRef;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.q10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    public static final int $stable = 8;
    private ChangeList changeList;
    private final LinkComposer composer;
    private int pendingUps;
    private boolean implicitRootStart = true;
    private final ArrayList<Object> pendingDownNodes = Stack.m3862constructorimpl$default(null, 1, null);
    private int removeFromNodeIndex = -1;
    private int moveFromNodeIndex = -1;
    private int moveToNodeIndex = -1;
    private int moveCount = -1;
    private ComposerChangeListWriterAddressMode addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
    private long editorCurrentPosition = -1;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerChangeListWriterAddressMode.values().length];
            try {
                iArr[ComposerChangeListWriterAddressMode.AbsoluteAddressing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerChangeListWriterAddressMode.AnchorAddressing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerChangeListWriterAddressMode.RelativeAddressing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ComposerChangeListWriter(LinkComposer linkComposer, ChangeList changeList) {
        this.composer = linkComposer;
        this.changeList = changeList;
    }

    private final SlotTableReader getReader() {
        return this.composer.getReader$runtime();
    }

    private final void inMode(ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode, iy iyVar) {
        ComposerChangeListWriterAddressMode addressMode$runtime = getAddressMode$runtime();
        long j = this.editorCurrentPosition;
        setAddressMode$runtime(composerChangeListWriterAddressMode);
        try {
            iyVar.invoke();
        } finally {
            setAddressMode$runtime(addressMode$runtime);
            if (addressMode$runtime != ComposerChangeListWriterAddressMode.RelativeAddressing) {
                j = -1;
            }
            this.editorCurrentPosition = j;
        }
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

    private final void pushSlotOperationPreamble() {
        long handle = getReader().handle();
        if (this.editorCurrentPosition != handle) {
            seekTo$default(this, handle, false, 2, null);
        }
    }

    private final void pushSlotOperationPreambleUnconditionally() {
        seekTo$default(this, getReader().handle(), false, 2, null);
    }

    private final void realizeMoveNode(int i, int i2, int i3) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i, i2, i3);
    }

    private final void realizeNodeMovementOperations() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFromNodeIndex;
            if (i2 >= 0) {
                realizeRemoveNode(i2, i);
                this.removeFromNodeIndex = -1;
            } else {
                realizeMoveNode(this.moveToNodeIndex, this.moveFromNodeIndex, i);
                this.moveToNodeIndex = -1;
                this.moveFromNodeIndex = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeRemoveNode(int i, int i2) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i, i2);
    }

    public static /* synthetic */ void seekTo$default(ComposerChangeListWriter composerChangeListWriter, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        composerChangeListWriter.seekTo(j, z);
    }

    public final void appendValue(Object obj) {
        pushSlotOperationPreamble();
        this.changeList.pushAppendValue(obj);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void deactivateCurrentGroup() {
        pushSlotOperationPreamble();
        this.changeList.pushDeactivateGroup();
    }

    public final void determineMovableContentNodeIndex(IntRef intRef, long j) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, j);
        this.editorCurrentPosition = j;
    }

    public final void disposeResolvedMovableState(MovableContentState movableContentState) {
        if (movableContentState != null) {
            this.changeList.pushDisposeDisposeMovableContentState(movableContentState);
        }
    }

    public final void endCompositionScope(ky kyVar, Composition composition) {
        this.changeList.pushEndCompositionScope(kyVar, composition);
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.pendingUps = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i, int i2) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int flagsOf = getReader().flagsOf(i2);
        removeNode(i, (flagsOf & GroupFlagsKt.IsNodeFlag) == 8388608 ? 1 : flagsOf & GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
    }

    public final void endResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushEndResumingScope(recomposeScopeImpl);
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        this.changeList.pushClearAllRecompositionRequiredGroups();
        this.editorCurrentPosition = -1L;
    }

    public final ComposerChangeListWriterAddressMode getAddressMode$runtime() {
        return this.addressMode;
    }

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void inAnchorMode(iy iyVar) {
        this.editorCurrentPosition = -1L;
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.AnchorAddressing;
        ComposerChangeListWriterAddressMode addressMode$runtime = getAddressMode$runtime();
        long j = this.editorCurrentPosition;
        setAddressMode$runtime(composerChangeListWriterAddressMode);
        try {
            iyVar.invoke();
        } finally {
            setAddressMode$runtime(addressMode$runtime);
            this.editorCurrentPosition = addressMode$runtime == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
        }
    }

    public final void inRelativeAddressMode(long j, iy iyVar) {
        this.editorCurrentPosition = j;
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.RelativeAddressing;
        ComposerChangeListWriterAddressMode addressMode$runtime = getAddressMode$runtime();
        long j2 = this.editorCurrentPosition;
        setAddressMode$runtime(composerChangeListWriterAddressMode);
        try {
            iyVar.invoke();
            setAddressMode$runtime(addressMode$runtime);
            if (addressMode$runtime != composerChangeListWriterAddressMode) {
                j2 = -1;
            }
            this.editorCurrentPosition = j2;
        } catch (Throwable th) {
            setAddressMode$runtime(addressMode$runtime);
            if (addressMode$runtime != ComposerChangeListWriterAddressMode.RelativeAddressing) {
                j2 = -1;
            }
            this.editorCurrentPosition = j2;
            throw th;
        }
    }

    public final void includeOperationsIn(ChangeList changeList, IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void insertSlots(SlotTable slotTable, long j) {
        if (!(j != -1)) {
            ComposerKt.composeImmediateRuntimeError("Tried moving from an unspecified position");
        }
        pushPendingUpsAndDowns();
        pushSlotOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(slotTable, j);
    }

    public final boolean isInAnchorMode() {
        return this.addressMode == ComposerChangeListWriterAddressMode.AnchorAddressing;
    }

    public final void moveDown(Object obj) {
        realizeNodeMovementOperations();
        Stack.m3872pushimpl(this.pendingDownNodes, obj);
    }

    public final void moveGroup(int i) {
        if (!(i >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Offset must not be negative");
        }
        pushSlotOperationPreambleUnconditionally();
        this.changeList.pushMoveGroup(i);
        this.editorCurrentPosition = -1L;
    }

    public final void moveNode(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.moveCount;
            if (i4 > 0 && this.moveFromNodeIndex == i && this.moveToNodeIndex == i2) {
                this.moveCount = i4 + i3;
                return;
            }
            realizeNodeMovementOperations();
            this.moveToNodeIndex = i2;
            this.moveFromNodeIndex = i;
            this.moveCount = i3;
        }
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (Stack.m3868isNotEmptyimpl(this.pendingDownNodes)) {
            Stack.m3871popimpl(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void releaseMovableGroup(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroup(controlledComposition, compositionContext, movableContentStateReference);
        this.editorCurrentPosition = -1L;
    }

    public final void remember(RememberObserverHolder rememberObserverHolder) {
        pushSlotOperationPreamble();
        this.changeList.pushRemember(rememberObserverHolder);
    }

    public final void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushRememberPausingScope(recomposeScopeImpl);
    }

    public final void removeGroup() {
        pushSlotOperationPreamble();
        this.changeList.pushRemoveGroup();
    }

    public final void removeNode(int i, int i2) {
        if (i2 > 0) {
            if (this.removeFromNodeIndex == i) {
                this.moveCount += i2;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFromNodeIndex = i;
            this.moveCount = i2;
        }
    }

    public final void removeTailGroupsAndValues(int i, int i2) {
        if (i >= 0 || i2 > 0) {
            pushSlotOperationPreamble();
            this.changeList.pushRemoveTailGroupsAndValues(i, i2);
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
        this.editorCurrentPosition = -1L;
    }

    public final void resetTransientState() {
        this.implicitRootStart = true;
        this.pendingUps = 0;
        Stack.m3860clearimpl(this.pendingDownNodes);
        this.removeFromNodeIndex = -1;
        this.moveFromNodeIndex = -1;
        this.moveToNodeIndex = -1;
        this.moveCount = -1;
        this.editorCurrentPosition = -1L;
    }

    public final void seekTo(long j, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.addressMode.ordinal()];
        if (i == 1) {
            this.changeList.pushSeekToGroupHandle(j);
        } else if (i == 2) {
            this.changeList.pushSeekToAnchor(getReader().getTable().getAddressSpace(), j);
        } else {
            if (i != 3) {
                o.n();
                return;
            }
            int group = GroupHandleKt.getGroup(j);
            int context = group == -1 ? GroupHandleKt.getContext(j) : getReader().parentOf(group);
            if (!(context == GroupHandleKt.getGroup(this.editorCurrentPosition))) {
                ComposerKt.composeImmediateRuntimeError("Relative addressing only supports navigating to a child of the current group");
            }
            this.changeList.pushStartGroup();
            int firstChildOf = getReader().firstChildOf(context);
            while (firstChildOf != group) {
                this.changeList.pushSkipGroup();
                firstChildOf = getReader().nextSiblingOf(firstChildOf);
            }
            if (z) {
                this.addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
            }
        }
        this.editorCurrentPosition = j;
    }

    public final void setAddressMode$runtime(ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode) {
        this.addressMode = composerChangeListWriterAddressMode;
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

    public final void startComposition() {
        Stack.m3860clearimpl(this.pendingDownNodes);
        this.pendingUps = 0;
        this.removeFromNodeIndex = -1;
        this.moveFromNodeIndex = -1;
        this.moveToNodeIndex = -1;
        this.addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
        this.editorCurrentPosition = -1L;
    }

    public final void startResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushStartResumingScope(recomposeScopeImpl);
    }

    public final void updateAuxData(Object obj) {
        pushSlotOperationPreamble();
        this.changeList.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v, my myVar) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v, myVar);
    }

    public final void updateRememberOrdering(LinkRememberObserverHolder linkRememberObserverHolder, LinkAnchor linkAnchor) {
        if (q10.b(linkRememberObserverHolder.getAfter(), linkAnchor)) {
            return;
        }
        this.changeList.pushUpdateRememberObserverHolderOrdering(linkRememberObserverHolder, linkAnchor);
    }

    public final void updateValue(int i, Object obj) {
        pushSlotOperationPreamble();
        this.changeList.pushUpdateRelativeValue(i, obj);
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

    public final void insertSlots(SlotTable slotTable, long j, FixupList fixupList) {
        if (!(j != -1)) {
            ComposerKt.composeImmediateRuntimeError("Tried moving from an unspecified position");
        }
        pushPendingUpsAndDowns();
        pushSlotOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(slotTable, j, fixupList);
    }
}
