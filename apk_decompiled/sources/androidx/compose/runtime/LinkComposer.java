package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.composer.GroupKind;
import androidx.compose.runtime.composer.ThrowingRememberManagerStub;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsSpec;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.KeyInfo;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableBuilder;
import androidx.compose.runtime.composer.linkbuffer.SlotTableBuilderKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTableReader;
import androidx.compose.runtime.composer.linkbuffer.SlotTableReaderKt;
import androidx.compose.runtime.composer.linkbuffer.changelist.ChangeList;
import androidx.compose.runtime.composer.linkbuffer.changelist.ChangeListKt;
import androidx.compose.runtime.composer.linkbuffer.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.composer.linkbuffer.changelist.ComposerChangeListWriterAddressMode;
import androidx.compose.runtime.composer.linkbuffer.changelist.FixupList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.runtime.tooling.ObjectLocation;
import defpackage.az;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.gy;
import defpackage.iy;
import defpackage.kn;
import defpackage.ky;
import defpackage.la0;
import defpackage.m50;
import defpackage.my;
import defpackage.na0;
import defpackage.oa0;
import defpackage.p01;
import defpackage.q10;
import defpackage.rl0;
import defpackage.st;
import defpackage.ut;
import defpackage.v4;
import defpackage.w01;
import defpackage.xe0;
import defpackage.y80;
import defpackage.yi;
import defpackage.zy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@ComposeCompilerApi
/* loaded from: classes.dex */
public final class LinkComposer extends InternalComposer {
    public static final int $stable = 8;
    private CompositionData _compositionData;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final kn applyCoroutineContext;
    private SlotTableBuilder builder;
    private boolean builderHasAProvider;
    private final ComposerChangeListWriter changeListWriter;
    private Changes changes;
    private int childrenComposing;
    private long compositeKeyHashCode;
    private final CompositionImpl composition;
    private int compositionToken;
    private Changes deferredChanges;
    private final LinkComposer$derivedStateObserver$1 derivedStateObserver;
    private final CompositionErrorContextImpl errorContext;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private FixupList insertFixups;
    private boolean inserting;
    private final ArrayList<RecomposeScopeImpl> invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;
    private int lastPlacedChildGroup;
    private Changes lateChanges;
    private la0 nodeCountOverrides;
    private la0 nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parentContext;
    private LinkPending pending;
    private PersistentCompositionLocalMap providerCache;
    private na0 providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;
    private SlotTableReader reader;
    private boolean reusing;
    private ShouldPauseCallback shouldPauseCallback;
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;
    private final fb0 invalidations = ScopeMap.m3918constructorimpl$default(null, 1, null);
    private final ArrayList<LinkPending> pendingStack = Stack.m3862constructorimpl$default(null, 1, null);
    private final IntStack parentStateStack = new IntStack();
    private final IntStack entersStack = new IntStack();
    private PersistentCompositionLocalMap rootProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final long compositeKeyHashCode;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;
        private final Set<LinkComposer> composers = new LinkedHashSet();
        private final MutableState compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());

        public CompositionContextImpl(long j, boolean z, boolean z2, CompositionObserverHolder compositionObserverHolder) {
            this.compositeKeyHashCode = j;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = compositionObserverHolder;
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime(ControlledComposition controlledComposition, my myVar) {
            LinkComposer.this.parentContext.composeInitial$runtime(controlledComposition, myVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public rl0 composeInitialPaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, my myVar) {
            return LinkComposer.this.parentContext.composeInitialPaused$runtime(controlledComposition, shouldPauseCallback, myVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
            LinkComposer.this.parentContext.deletedMovableContent$runtime(movableContentStateReference);
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (LinkComposer linkComposer : this.composers) {
                    Iterator<Set<CompositionData>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(linkComposer.getCompositionData());
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime() {
            LinkComposer.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime() {
            return LinkComposer.this.parentContext.getCollectingCallByInformation$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime() {
            return this.collectingSourceInformation;
        }

        public final Set<LinkComposer> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public long getCompositeKeyHashCode$runtime() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public Composition getComposition$runtime() {
            return LinkComposer.this.getComposition();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public kn getEffectCoroutineContext() {
            return LinkComposer.this.parentContext.getEffectCoroutineContext();
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CompositionObserverHolder getObserverHolder$runtime() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getStackTraceEnabled$runtime() {
            return LinkComposer.this.parentContext.getStackTraceEnabled$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
            LinkComposer.this.parentContext.insertMovableContent$runtime(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime(ControlledComposition controlledComposition) {
            LinkComposer.this.parentContext.invalidate$runtime(LinkComposer.this.getComposition());
            LinkComposer.this.parentContext.invalidate$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
            LinkComposer.this.parentContext.invalidateScope$runtime(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier<?> applier) {
            LinkComposer.this.parentContext.movableContentStateReleased$runtime(movableContentStateReference, movableContentState, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
            return LinkComposer.this.parentContext.movableContentStateResolve$runtime(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public rl0 recomposePaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, rl0 rl0Var) {
            return LinkComposer.this.parentContext.recomposePaused$runtime(controlledComposition, shouldPauseCallback, rl0Var);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime(Set<CompositionData> set) {
            Set set2 = this.inspectionTables;
            if (set2 == null) {
                set2 = new HashSet();
                this.inspectionTables = set2;
            }
            set2.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime(Composer composer) {
            super.registerComposer$runtime(composer);
            this.composers.add(LinkComposerKt.asLinkComposer(composer));
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime(ControlledComposition controlledComposition) {
            LinkComposer.this.parentContext.registerComposition$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
            LinkComposer.this.parentContext.reportPausedScope$runtime(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime(ControlledComposition controlledComposition) {
            LinkComposer.this.parentContext.reportRemovedComposition$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CancellationHandle scheduleFrameEndCallback(iy iyVar) {
            return LinkComposer.this.parentContext.scheduleFrameEndCallback(iyVar);
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime() {
            LinkComposer.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime(Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(LinkComposerKt.asLinkComposer(composer).getCompositionData());
                }
            }
            p01.b(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime(ControlledComposition controlledComposition) {
            LinkComposer.this.parentContext.unregisterComposition$runtime(controlledComposition);
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            setCompositionLocalScope(persistentCompositionLocalMap);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.runtime.LinkComposer$derivedStateObserver$1] */
    public LinkComposer(Applier<?> applier, CompositionContext compositionContext, Set<RememberObserver> set, SlotTable slotTable, Changes changes, Changes changes2, CompositionObserverHolder compositionObserverHolder, CompositionImpl compositionImpl) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.abandonSet = set;
        this.slotTable = slotTable;
        this.changes = changes;
        this.lateChanges = changes2;
        this.observerHolder = compositionObserverHolder;
        this.composition = compositionImpl;
        SlotTableReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(slotTable.getAddressSpace(), false, false);
        slotTableBuilder.close();
        this.builder = slotTableBuilder;
        this.changeListWriter = new ComposerChangeListWriter(this, ChangeListKt.asLinkBufferChangeList(this.changes));
        this.lastPlacedChildGroup = -1;
        this.insertFixups = new FixupList();
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation$runtime() || compositionContext.getCollectingCallByInformation$runtime();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.LinkComposer$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                LinkComposer.this.childrenComposing--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                LinkComposer.this.childrenComposing++;
            }
        };
        this.invalidateStack = Stack.m3862constructorimpl$default(null, 1, null);
        this.errorContext = new CompositionErrorContextImpl(this);
        kn effectCoroutineContext = compositionContext.getEffectCoroutineContext();
        kn errorContext$runtime = getErrorContext$runtime();
        this.applyCoroutineContext = effectCoroutineContext.plus(errorContext$runtime == null ? st.d : errorContext$runtime);
    }

    private final void abortRoot() {
        cleanUpCompose();
        Stack.m3860clearimpl(this.pendingStack);
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compositeKeyHashCode = 0L;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.isClosed()) {
            this.reader.close();
        }
        resetInsertBuilder(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addRecomposeScope() {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (getInserting()) {
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl(getComposition());
            Stack.m3872pushimpl(this.invalidateStack, recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            enterRecomposeScope(recomposeScopeImpl2);
            return;
        }
        int parentGroup = this.reader.getParentGroup();
        RecomposeScopeImpl recomposeScopeOrNull = LinkComposerKt.getRecomposeScopeOrNull(this.reader, parentGroup);
        Object m3930removeimpl = recomposeScopeOrNull != null ? ScopeMap.m3930removeimpl(this.invalidations, recomposeScopeOrNull) : null;
        boolean recomposeRequired = this.reader.recomposeRequired(parentGroup);
        if (recomposeRequired) {
            this.reader.removeFlag(GroupFlagsKt.IsRecompositionRequiredFlag);
        }
        Object next = this.reader.next();
        if (q10.b(next, Composer.Companion.getEmpty())) {
            recomposeScopeImpl = new RecomposeScopeImpl(getComposition());
            updateValue(recomposeScopeImpl);
        } else {
            next.getClass();
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        if (!recomposeRequired && m3930removeimpl == null) {
            boolean forcedRecompose = recomposeScopeImpl.getForcedRecompose();
            if (forcedRecompose) {
                recomposeScopeImpl.setForcedRecompose(false);
            }
            if (!forcedRecompose) {
                z = false;
                recomposeScopeImpl.setRequiresRecompose(z);
                Stack.m3872pushimpl(this.invalidateStack, recomposeScopeImpl);
                enterRecomposeScope(recomposeScopeImpl);
                if (recomposeScopeImpl.getPaused()) {
                    return;
                }
                recomposeScopeImpl.setPaused(false);
                recomposeScopeImpl.setResuming(true);
                this.changeListWriter.startResumingScope(recomposeScopeImpl);
                if (this.reusing || !recomposeScopeImpl.getReusing()) {
                    return;
                }
                this.reusing = true;
                this.reusingGroup = this.reader.getParentGroup();
                recomposeScopeImpl.setResetReusing(true);
                return;
            }
        }
        z = true;
        recomposeScopeImpl.setRequiresRecompose(z);
        Stack.m3872pushimpl(this.invalidateStack, recomposeScopeImpl);
        enterRecomposeScope(recomposeScopeImpl);
        if (recomposeScopeImpl.getPaused()) {
        }
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        Stack.m3860clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.builderHasAProvider) {
            int parentGroup = this.builder.getParentGroup();
            while (parentGroup >= 0) {
                if (this.builder.groupKey(parentGroup) == 202 && q10.b(this.builder.groupObjectKey(parentGroup), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.builder.groupAux(parentGroup);
                    groupAux.getClass();
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parentGroup = this.builder.parent(parentGroup);
            }
        }
        if (!this.reader.isEmpty()) {
            while (i >= 0) {
                if (this.reader.groupKey(i) == 202 && q10.b(this.reader.groupObjectKey(i), ComposerKt.getCompositionLocalMap())) {
                    na0 na0Var = this.providerUpdates;
                    if (na0Var == null || (persistentCompositionLocalMap = (PersistentCompositionLocalMap) na0Var.b(i)) == null) {
                        Object groupAux2 = this.reader.groupAux(i);
                        groupAux2.getClass();
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i = this.reader.parentOf(i);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.rootProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeStackTrace currentStackTrace() {
        if (!getSourceMarkersEnabled$runtime()) {
            return null;
        }
        m50 o = y80.o();
        o.addAll(SlotTableBuilderKt.buildTrace(this.builder));
        o.addAll(SlotTableReaderKt.buildTrace(this.reader));
        o.addAll(parentStackTrace$runtime());
        return new ComposeStackTrace(y80.d(o), getSourceMarkersEnabled$runtime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m3846doComposeaFTiNEg(fb0 fb0Var, my myVar) {
        if (isComposing$runtime()) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        CompositionObserver current = this.observerHolder.current();
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            this.providerUpdates = null;
            mo3843updateComposerInvalidationsRY85e9Y$runtime(fb0Var);
            this.nodeIndex = 0;
            this.isComposing = true;
            if (current != null) {
                current.onBeginComposition(getComposition());
            }
            try {
                startRoot();
                Object nextSlot$runtime = nextSlot$runtime();
                if (nextSlot$runtime != myVar && myVar != null) {
                    updateValue(myVar);
                }
                LinkComposer$derivedStateObserver$1 linkComposer$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    derivedStateObservers.add(linkComposer$derivedStateObserver$1);
                    if (myVar != null) {
                        startGroup(ComposerKt.invocationKey, ComposerKt.getInvocation());
                        Expect_jvmKt.invokeComposable(this, myVar);
                        endGroup();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || nextSlot$runtime == null || nextSlot$runtime.equals(Composer.Companion.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        startGroup(ComposerKt.invocationKey, ComposerKt.getInvocation());
                        p01.f(2, nextSlot$runtime);
                        Expect_jvmKt.invokeComposable(this, (my) nextSlot$runtime);
                        endGroup();
                    }
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    endRoot();
                    if (current != null) {
                        current.onEndComposition(getComposition());
                    }
                    this.isComposing = false;
                    resetInsertBuilder(false);
                    trace.endSection(beginSection);
                } catch (Throwable th) {
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(beginSection);
            throw th2;
        }
    }

    private final void end(boolean z) {
        long rotateRight;
        long j;
        long insertAddress;
        List<KeyInfo> list;
        List<KeyInfo> list2;
        long rotateRight2;
        long j2;
        int peek2 = this.parentStateStack.peek2() - 1;
        if (getInserting()) {
            int parentGroup = this.builder.getParentGroup();
            int groupKey = this.builder.groupKey(parentGroup);
            Object groupObjectKey = this.builder.groupObjectKey(parentGroup);
            Object groupAux = this.builder.groupAux(parentGroup);
            if (groupObjectKey != null) {
                int ordinal = groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode();
                rotateRight2 = Long.rotateRight(getCompositeKeyHashCode(), 3);
                j2 = ordinal;
            } else if (groupAux == null || groupKey != 207 || groupAux.equals(Composer.Companion.getEmpty())) {
                rotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3);
                j2 = groupKey;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(groupAux.hashCode() ^ Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(rotateRight2 ^ j2, 3);
        } else {
            int parentGroup2 = this.reader.getParentGroup();
            int groupKey2 = this.reader.groupKey(parentGroup2);
            Object groupObjectKey2 = this.reader.groupObjectKey(parentGroup2);
            Object groupAux2 = this.reader.groupAux(parentGroup2);
            if (groupObjectKey2 != null) {
                int ordinal2 = groupObjectKey2 instanceof Enum ? ((Enum) groupObjectKey2).ordinal() : groupObjectKey2.hashCode();
                rotateRight = Long.rotateRight(getCompositeKeyHashCode(), 3);
                j = ordinal2;
            } else if (groupAux2 == null || groupKey2 != 207 || groupAux2.equals(Composer.Companion.getEmpty())) {
                rotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3);
                j = groupKey2;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(groupAux2.hashCode() ^ Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(rotateRight ^ j, 3);
        }
        int i = this.groupNodeCount;
        LinkPending linkPending = this.pending;
        if (linkPending != null && !linkPending.getKeyInfos().isEmpty()) {
            List<KeyInfo> keyInfos = linkPending.getKeyInfos();
            List<KeyInfo> used = linkPending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size2) {
                KeyInfo keyInfo = keyInfos.get(i2);
                if (!fastToSet.contains(keyInfo)) {
                    this.changeListWriter.removeNode(linkPending.nodePositionOf(keyInfo) + linkPending.getStartIndex(), keyInfo.getNodes());
                    linkPending.updateNodeCount(GroupHandleKt.getGroup(keyInfo.getHandle()), 0);
                    this.reader.reposition(keyInfo.getHandle());
                    recordDelete();
                    this.reader.skipGroup();
                } else if (!linkedHashSet.contains(keyInfo)) {
                    if (i3 < size) {
                        KeyInfo keyInfo2 = used.get(i3);
                        if (keyInfo2 != keyInfo) {
                            int nodePositionOf = linkPending.nodePositionOf(keyInfo2);
                            linkedHashSet.add(keyInfo2);
                            if (nodePositionOf != i4) {
                                int updatedNodeCountOf = linkPending.updatedNodeCountOf(keyInfo2);
                                list = keyInfos;
                                list2 = used;
                                this.changeListWriter.moveNode(nodePositionOf + linkPending.getStartIndex(), i4 + linkPending.getStartIndex(), updatedNodeCountOf);
                                linkPending.registerMoveNode(nodePositionOf, i4, updatedNodeCountOf);
                            } else {
                                list = keyInfos;
                                list2 = used;
                            }
                        } else {
                            list = keyInfos;
                            list2 = used;
                            i2++;
                        }
                        i3++;
                        i4 += linkPending.updatedNodeCountOf(keyInfo2);
                        keyInfos = list;
                        used = list2;
                    }
                }
                i2++;
            }
            this.changeListWriter.endNodeMovement();
            if (!keyInfos.isEmpty()) {
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting) {
            int i5 = this.nodeIndex;
            int previousSibling = this.reader.getPreviousSibling();
            SlotTable readerTable$runtime = getReaderTable$runtime();
            int currentGroup = this.reader.getCurrentGroup();
            int[] groups = readerTable$runtime.getAddressSpace().getGroups();
            while (true) {
                int i6 = currentGroup;
                int i7 = previousSibling;
                previousSibling = i6;
                if (previousSibling < 0) {
                    break;
                }
                reportFreeMovableContent(GroupHandleKt.makeGroupHandle(this.reader.getParentGroup(), i7, previousSibling));
                this.changeListWriter.removeNode(i5, this.reader.nodeCount(previousSibling));
                this.changeListWriter.endNodeMovement();
                currentGroup = groups[previousSibling + 1];
            }
            this.changeListWriter.removeTailGroupsAndValues(this.reader.getCurrentGroup(), this.reader.getRemainingSlots());
        }
        if (inserting) {
            if (z) {
                this.insertFixups.endNodeInsert();
                i = 1;
            }
            this.lastPlacedChildGroup = this.builder.getParentGroup();
            this.reader.endEmpty();
            this.builder.endGroup();
            if (!this.reader.getInEmpty()) {
                long lastRoot = this.builder.lastRoot();
                recordInsert(lastRoot);
                this.inserting = false;
                if (!getReaderTable$runtime().isEmpty()) {
                    insertAddress = LinkComposerKt.toInsertAddress(lastRoot);
                    updateChildNodeCount(insertAddress, 0);
                    updateNodeCountOverrides(insertAddress, i);
                }
            }
        } else {
            if (z) {
                this.changeListWriter.moveUp();
            }
            long parentHandle = this.reader.getParentHandle();
            if (i != updatedNodeCount(parentHandle)) {
                updateNodeCountOverrides(parentHandle, i);
            }
            int i8 = z ? 1 : i;
            this.lastPlacedChildGroup = GroupHandleKt.getGroup(parentHandle);
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
            i = i8;
        }
        exitGroup(i, inserting);
    }

    private final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        boolean asBool;
        endGroup();
        this.parentContext.doneComposing$runtime();
        endGroup();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        asBool = LinkComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
    }

    private final void ensureBuilder() {
        if (this.builder.isClosed()) {
            SlotTableBuilder slotTableBuilder = new SlotTableBuilder(this.slotTable.getAddressSpace(), this.slotTable.getRecordSourceInformation(), this.slotTable.getRecordCallByInformation());
            this.builder = slotTableBuilder;
            slotTableBuilder.buildStart();
            this.builderHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z, LinkPending linkPending) {
        Stack.m3872pushimpl(this.pendingStack, this.pending);
        this.pending = linkPending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
        this.lastPlacedChildGroup = -1;
    }

    private final void enterRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        recomposeScopeImpl.start(this.compositionToken);
        CompositionObserver current = this.observerHolder.current();
        if (current != null) {
            current.onScopeEnter(recomposeScopeImpl);
        }
    }

    private final void executeChangesImmediatelyWithoutApplier() {
        SlotTableEditor openEditor = this.slotTable.openEditor();
        try {
            ChangeListKt.asLinkBufferChangeList(this.changes).executeAndFlushAllPendingChanges(ThrowingApplierStub.INSTANCE, openEditor, ThrowingRememberManagerStub.INSTANCE, getErrorContext$runtime());
        } finally {
            openEditor.close();
        }
    }

    private final void exitGroup(int i, boolean z) {
        LinkPending linkPending = (LinkPending) Stack.m3871popimpl(this.pendingStack);
        if (linkPending != null && !z) {
            linkPending.setGroupIndex(linkPending.getGroupIndex() + 1);
        }
        this.pending = linkPending;
        this.nodeIndex = this.parentStateStack.pop() + i;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + i;
    }

    private final ky exitRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        CompositionObserver current = this.observerHolder.current();
        if (current != null) {
            current.onScopeExit(recomposeScopeImpl);
        }
        return recomposeScopeImpl.end(this.compositionToken);
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (!Stack.m3867isEmptyimpl(this.pendingStack)) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(28:(2:53|(49:55|56|57|58|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|(1:95)(1:128)|96|97|98|100|101|102|103|104|105|106))|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|(0)(0)|96|97|98|100|101|102|103|104|105|106)|72|73|74|75|76|77) */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0262, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0263, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dd  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void insertMovableContentGuarded(List<xe0> list) {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        SlotTable asLinkBufferSlotTable;
        List<? extends Object> collectNodesFrom;
        SlotTableReader openReader;
        SlotTableReader slotTableReader;
        SlotTableReader slotTableReader2;
        la0 la0Var;
        na0 na0Var;
        na0 na0Var2;
        ComposerChangeListWriter composerChangeListWriter3;
        ChangeList changeList3;
        ComposerChangeListWriter composerChangeListWriter4;
        int i;
        ComposerChangeListWriter composerChangeListWriter5;
        boolean implicitRootStart;
        ComposerChangeListWriter composerChangeListWriter6;
        int i2;
        ComposerChangeListWriterAddressMode addressMode$runtime;
        long j;
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode;
        SlotStorage slotStorage$runtime;
        SlotTable asLinkBufferSlotTable2;
        SlotStorage slotStorage$runtime2;
        SlotTableReader slotTableReader3;
        LinkComposer linkComposer = this;
        ComposerChangeListWriter composerChangeListWriter7 = linkComposer.changeListWriter;
        ChangeList asLinkBufferChangeList = ChangeListKt.asLinkBufferChangeList(linkComposer.lateChanges);
        ChangeList changeList4 = composerChangeListWriter7.getChangeList();
        try {
            composerChangeListWriter7.setChangeList(asLinkBufferChangeList);
            linkComposer.changeListWriter.resetSlots();
            int size = list.size();
            boolean z = 0;
            int i3 = 0;
            final LinkComposer linkComposer2 = linkComposer;
            while (i3 < size) {
                try {
                    xe0 xe0Var = list.get(i3);
                    final MovableContentStateReference movableContentStateReference = (MovableContentStateReference) xe0Var.d;
                    MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) xe0Var.e;
                    final long address = LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime()).getAddress() & 4294967295L;
                    IntRef intRef = new IntRef(z, 1, null);
                    linkComposer2.changeListWriter.determineMovableContentNodeIndex(intRef, address);
                    if (movableContentStateReference2 == null) {
                        SlotTable asLinkBufferSlotTable3 = SlotTableKt.asLinkBufferSlotTable(movableContentStateReference.getSlotStorage$runtime());
                        if (q10.b(asLinkBufferSlotTable3, linkComposer2.builder.getTable())) {
                            linkComposer2.resetInsertBuilder(z);
                        }
                        final SlotTableReader openReader2 = asLinkBufferSlotTable3.openReader();
                        try {
                            openReader2.reposition(address);
                            try {
                                final ChangeList changeList5 = new ChangeList();
                                iy iyVar = new iy() { // from class: i50
                                    @Override // defpackage.iy
                                    public final Object invoke() {
                                        w01 insertMovableContentGuarded$lambda$0$0$0$0;
                                        insertMovableContentGuarded$lambda$0$0$0$0 = LinkComposer.insertMovableContentGuarded$lambda$0$0$0$0(LinkComposer.this, changeList5, openReader2, address, movableContentStateReference);
                                        return insertMovableContentGuarded$lambda$0$0$0$0;
                                    }
                                };
                                slotTableReader3 = openReader2;
                                linkComposer2 = this;
                                try {
                                    recomposeMovableContent$default(linkComposer2, null, null, 0, null, iyVar, 15, null);
                                    linkComposer2.changeListWriter.includeOperationsIn(changeList5, intRef);
                                    slotTableReader3.close();
                                    composerChangeListWriter2 = composerChangeListWriter7;
                                    changeList2 = changeList4;
                                    i = size;
                                    i2 = i3;
                                } catch (Throwable th) {
                                    th = th;
                                    slotTableReader3.close();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                slotTableReader3 = openReader2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            slotTableReader3 = openReader2;
                        }
                    } else {
                        MovableContentState movableContentStateResolve$runtime = linkComposer2.parentContext.movableContentStateResolve$runtime(movableContentStateReference2);
                        if (movableContentStateResolve$runtime == null || (slotStorage$runtime2 = movableContentStateResolve$runtime.getSlotStorage$runtime()) == null || (asLinkBufferSlotTable = SlotTableKt.asLinkBufferSlotTable(slotStorage$runtime2)) == null) {
                            asLinkBufferSlotTable = SlotTableKt.asLinkBufferSlotTable(movableContentStateReference2.getSlotStorage$runtime());
                        }
                        int address2 = (movableContentStateResolve$runtime == null || (slotStorage$runtime = movableContentStateResolve$runtime.getSlotStorage$runtime()) == null || (asLinkBufferSlotTable2 = SlotTableKt.asLinkBufferSlotTable(slotStorage$runtime)) == null) ? LinkAnchorKt.asLinkAnchor(movableContentStateReference2.getAnchor$runtime()).getAddress() : asLinkBufferSlotTable2.getRoot();
                        collectNodesFrom = LinkComposerKt.collectNodesFrom(asLinkBufferSlotTable, address2);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (!collectNodesFrom.isEmpty()) {
                                                                                            linkComposer2.changeListWriter.copyNodesToNewAnchorLocation(collectNodesFrom, intRef);
                                                                                            if (q10.b(movableContentStateReference.getSlotStorage$runtime(), linkComposer2.slotTable)) {
                                                                                                composerChangeListWriter = composerChangeListWriter7;
                                                                                                try {
                                                                                                    linkComposer2.updateChildNodeCount(LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime()).getAddress() & 4294967295L, linkComposer2.updatedNodeCount(LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime()).getAddress() & 4294967295L) + collectNodesFrom.size());
                                                                                                    linkComposer2.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime, linkComposer2.parentContext, movableContentStateReference2, movableContentStateReference);
                                                                                                    openReader = asLinkBufferSlotTable.openReader();
                                                                                                    slotTableReader2 = linkComposer2.reader;
                                                                                                    la0Var = linkComposer2.nodeCountOverrides;
                                                                                                    na0Var = linkComposer2.providerUpdates;
                                                                                                    linkComposer2.nodeCountOverrides = null;
                                                                                                    linkComposer2.providerUpdates = null;
                                                                                                    linkComposer2.reader = openReader;
                                                                                                    openReader.reposition(address2);
                                                                                                    ChangeList changeList6 = new ChangeList();
                                                                                                    composerChangeListWriter3 = linkComposer2.changeListWriter;
                                                                                                    slotTableReader = openReader;
                                                                                                    changeList3 = composerChangeListWriter3.getChangeList();
                                                                                                    composerChangeListWriter3.setChangeList(changeList6);
                                                                                                    i = size;
                                                                                                    composerChangeListWriter5 = linkComposer2.changeListWriter;
                                                                                                    composerChangeListWriter2 = composerChangeListWriter;
                                                                                                    implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                                                                                    composerChangeListWriter5.setImplicitRootStart(false);
                                                                                                    int i4 = i3;
                                                                                                    composerChangeListWriter6 = linkComposer2.changeListWriter;
                                                                                                    i2 = i4;
                                                                                                    composerChangeListWriter6.editorCurrentPosition = linkComposer2.reader.handle();
                                                                                                    ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode2 = ComposerChangeListWriterAddressMode.RelativeAddressing;
                                                                                                    addressMode$runtime = composerChangeListWriter6.getAddressMode$runtime();
                                                                                                    j = composerChangeListWriter6.editorCurrentPosition;
                                                                                                    composerChangeListWriter6.setAddressMode$runtime(composerChangeListWriterAddressMode2);
                                                                                                    movableContentStateReference2.transferPendingInvalidations$runtime();
                                                                                                    ChangeList changeList7 = changeList4;
                                                                                                    composerChangeListWriter4 = composerChangeListWriter3;
                                                                                                    changeList2 = changeList7;
                                                                                                    composerChangeListWriterAddressMode = addressMode$runtime;
                                                                                                    linkComposer2.recomposeMovableContent(movableContentStateReference2.getComposition$runtime(), movableContentStateReference.getComposition$runtime(), linkComposer2.reader.getCurrentGroup(), movableContentStateReference2.getInvalidations$runtime(), new v4(22, linkComposer2, movableContentStateReference));
                                                                                                    composerChangeListWriter6.setAddressMode$runtime(composerChangeListWriterAddressMode);
                                                                                                    composerChangeListWriter6.editorCurrentPosition = composerChangeListWriterAddressMode != composerChangeListWriterAddressMode2 ? j : -1L;
                                                                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                                                                    composerChangeListWriter4.setChangeList(changeList3);
                                                                                                    linkComposer2.changeListWriter.includeOperationsIn(changeList6, intRef);
                                                                                                    linkComposer2.reader = slotTableReader2;
                                                                                                    linkComposer2.nodeCountOverrides = la0Var;
                                                                                                    linkComposer2.providerUpdates = na0Var;
                                                                                                    slotTableReader.close();
                                                                                                    linkComposer2.changeListWriter.disposeResolvedMovableState(movableContentStateResolve$runtime);
                                                                                                } catch (Throwable th4) {
                                                                                                    th = th4;
                                                                                                    changeList = changeList4;
                                                                                                    composerChangeListWriter.setChangeList(changeList);
                                                                                                    throw th;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        slotTableReader.close();
                                                                                        linkComposer2.changeListWriter.disposeResolvedMovableState(movableContentStateResolve$runtime);
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                        composerChangeListWriter = composerChangeListWriter2;
                                                                                        changeList = changeList2;
                                                                                        composerChangeListWriter.setChangeList(changeList);
                                                                                        throw th;
                                                                                    }
                                                                                    linkComposer2.reader = slotTableReader2;
                                                                                    linkComposer2.nodeCountOverrides = la0Var;
                                                                                    linkComposer2.providerUpdates = na0Var;
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    slotTableReader.close();
                                                                                    throw th;
                                                                                }
                                                                                composerChangeListWriter4.setChangeList(changeList3);
                                                                                linkComposer2.changeListWriter.includeOperationsIn(changeList6, intRef);
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                na0Var2 = na0Var;
                                                                                la0Var = la0Var;
                                                                                linkComposer2.reader = slotTableReader2;
                                                                                linkComposer2.nodeCountOverrides = la0Var;
                                                                                linkComposer2.providerUpdates = na0Var2;
                                                                                throw th;
                                                                            }
                                                                            composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                            na0Var2 = na0Var;
                                                                            la0Var = la0Var;
                                                                            try {
                                                                                composerChangeListWriter4.setChangeList(changeList3);
                                                                                throw th;
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                linkComposer2.reader = slotTableReader2;
                                                                                linkComposer2.nodeCountOverrides = la0Var;
                                                                                linkComposer2.providerUpdates = na0Var2;
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        composerChangeListWriter6.setAddressMode$runtime(composerChangeListWriterAddressMode);
                                                                        composerChangeListWriter6.editorCurrentPosition = composerChangeListWriterAddressMode != composerChangeListWriterAddressMode2 ? j : -1L;
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                        na0Var2 = na0Var;
                                                                        la0Var = la0Var;
                                                                        try {
                                                                            composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                                            throw th;
                                                                        } catch (Throwable th11) {
                                                                            th = th11;
                                                                            composerChangeListWriter4.setChangeList(changeList3);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    linkComposer2.recomposeMovableContent(movableContentStateReference2.getComposition$runtime(), movableContentStateReference.getComposition$runtime(), linkComposer2.reader.getCurrentGroup(), movableContentStateReference2.getInvalidations$runtime(), new v4(22, linkComposer2, movableContentStateReference));
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    na0Var2 = na0Var;
                                                                    la0Var = la0Var;
                                                                    try {
                                                                        composerChangeListWriter6.setAddressMode$runtime(composerChangeListWriterAddressMode);
                                                                        composerChangeListWriter6.editorCurrentPosition = composerChangeListWriterAddressMode == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
                                                                        throw th;
                                                                    } catch (Throwable th13) {
                                                                        th = th13;
                                                                        composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                                        throw th;
                                                                    }
                                                                }
                                                                ChangeList changeList72 = changeList4;
                                                                composerChangeListWriter4 = composerChangeListWriter3;
                                                                changeList2 = changeList72;
                                                                composerChangeListWriterAddressMode = addressMode$runtime;
                                                            } catch (Throwable th14) {
                                                                th = th14;
                                                                na0Var2 = na0Var;
                                                                la0Var = la0Var;
                                                                composerChangeListWriterAddressMode = addressMode$runtime;
                                                                composerChangeListWriter4 = composerChangeListWriter3;
                                                                composerChangeListWriter6.setAddressMode$runtime(composerChangeListWriterAddressMode);
                                                                composerChangeListWriter6.editorCurrentPosition = composerChangeListWriterAddressMode == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
                                                                throw th;
                                                            }
                                                        } catch (Throwable th15) {
                                                            th = th15;
                                                            composerChangeListWriterAddressMode = addressMode$runtime;
                                                            na0Var2 = na0Var;
                                                            la0Var = la0Var;
                                                            composerChangeListWriter4 = composerChangeListWriter3;
                                                            composerChangeListWriter6.setAddressMode$runtime(composerChangeListWriterAddressMode);
                                                            composerChangeListWriter6.editorCurrentPosition = composerChangeListWriterAddressMode == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
                                                            throw th;
                                                        }
                                                        movableContentStateReference2.transferPendingInvalidations$runtime();
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        composerChangeListWriterAddressMode = addressMode$runtime;
                                                    }
                                                    composerChangeListWriter6.editorCurrentPosition = linkComposer2.reader.handle();
                                                    ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode22 = ComposerChangeListWriterAddressMode.RelativeAddressing;
                                                    addressMode$runtime = composerChangeListWriter6.getAddressMode$runtime();
                                                    j = composerChangeListWriter6.editorCurrentPosition;
                                                    composerChangeListWriter6.setAddressMode$runtime(composerChangeListWriterAddressMode22);
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                    na0Var2 = na0Var;
                                                    la0Var = la0Var;
                                                    composerChangeListWriter4 = composerChangeListWriter3;
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                }
                                                implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                                composerChangeListWriter5.setImplicitRootStart(false);
                                                int i42 = i3;
                                                composerChangeListWriter6 = linkComposer2.changeListWriter;
                                                i2 = i42;
                                            } catch (Throwable th18) {
                                                th = th18;
                                                na0Var2 = na0Var;
                                                composerChangeListWriter4 = composerChangeListWriter3;
                                                composerChangeListWriter4.setChangeList(changeList3);
                                                throw th;
                                            }
                                            composerChangeListWriter3.setChangeList(changeList6);
                                            i = size;
                                            composerChangeListWriter5 = linkComposer2.changeListWriter;
                                            composerChangeListWriter2 = composerChangeListWriter;
                                        } catch (Throwable th19) {
                                            th = th19;
                                            na0Var2 = na0Var;
                                        }
                                        changeList3 = composerChangeListWriter3.getChangeList();
                                    } catch (Throwable th20) {
                                        th = th20;
                                        na0Var2 = na0Var;
                                        linkComposer2.reader = slotTableReader2;
                                        linkComposer2.nodeCountOverrides = la0Var;
                                        linkComposer2.providerUpdates = na0Var2;
                                        throw th;
                                    }
                                    linkComposer2.reader = openReader;
                                    openReader.reposition(address2);
                                    ChangeList changeList62 = new ChangeList();
                                    composerChangeListWriter3 = linkComposer2.changeListWriter;
                                    slotTableReader = openReader;
                                } catch (Throwable th21) {
                                    th = th21;
                                    na0Var2 = na0Var;
                                    slotTableReader = openReader;
                                }
                                slotTableReader2 = linkComposer2.reader;
                                la0Var = linkComposer2.nodeCountOverrides;
                                na0Var = linkComposer2.providerUpdates;
                                linkComposer2.nodeCountOverrides = null;
                                linkComposer2.providerUpdates = null;
                            } catch (Throwable th22) {
                                th = th22;
                                slotTableReader = openReader;
                            }
                            linkComposer2.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime, linkComposer2.parentContext, movableContentStateReference2, movableContentStateReference);
                            openReader = asLinkBufferSlotTable.openReader();
                        } catch (Throwable th23) {
                            th = th23;
                            changeList2 = changeList4;
                            changeList = changeList2;
                            composerChangeListWriter.setChangeList(changeList);
                            throw th;
                        }
                        composerChangeListWriter = composerChangeListWriter7;
                    }
                    i3 = i2 + 1;
                    size = i;
                    composerChangeListWriter7 = composerChangeListWriter2;
                    changeList4 = changeList2;
                    z = 0;
                    linkComposer2 = linkComposer2;
                } catch (Throwable th24) {
                    th = th24;
                    composerChangeListWriter2 = composerChangeListWriter7;
                    changeList2 = changeList4;
                }
            }
            ComposerChangeListWriter composerChangeListWriter8 = composerChangeListWriter7;
            ChangeList changeList8 = changeList4;
            linkComposer2.resetInsertBuilder(z);
            linkComposer2.changeListWriter.endMovableContentPlacement();
            composerChangeListWriter8.setChangeList(changeList8);
        } catch (Throwable th25) {
            th = th25;
            composerChangeListWriter = composerChangeListWriter7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 insertMovableContentGuarded$lambda$0$0$0$0(LinkComposer linkComposer, ChangeList changeList, SlotTableReader slotTableReader, long j, MovableContentStateReference movableContentStateReference) {
        long j2;
        ComposerChangeListWriter composerChangeListWriter = linkComposer.changeListWriter;
        ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            SlotTableReader slotTableReader2 = linkComposer.reader;
            la0 la0Var = linkComposer.nodeCountOverrides;
            na0 na0Var = linkComposer.providerUpdates;
            linkComposer.nodeCountOverrides = null;
            linkComposer.providerUpdates = null;
            try {
                linkComposer.reader = slotTableReader;
                ComposerChangeListWriter composerChangeListWriter2 = linkComposer.changeListWriter;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    ComposerChangeListWriter composerChangeListWriter3 = linkComposer.changeListWriter;
                    composerChangeListWriter3.editorCurrentPosition = j;
                    ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.RelativeAddressing;
                    ComposerChangeListWriterAddressMode addressMode$runtime = composerChangeListWriter3.getAddressMode$runtime();
                    long j3 = composerChangeListWriter3.editorCurrentPosition;
                    composerChangeListWriter3.setAddressMode$runtime(composerChangeListWriterAddressMode);
                    try {
                        j2 = j3;
                    } catch (Throwable th) {
                        th = th;
                        j2 = j3;
                    }
                    try {
                        linkComposer.invokeMovableContentLambda(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals$runtime(), movableContentStateReference.getParameter$runtime(), true);
                        composerChangeListWriter3.setAddressMode$runtime(addressMode$runtime);
                        composerChangeListWriter3.editorCurrentPosition = addressMode$runtime == composerChangeListWriterAddressMode ? j2 : -1L;
                        composerChangeListWriter.setChangeList(changeList2);
                        return w01.a;
                    } catch (Throwable th2) {
                        th = th2;
                        composerChangeListWriter3.setAddressMode$runtime(addressMode$runtime);
                        composerChangeListWriter3.editorCurrentPosition = addressMode$runtime == ComposerChangeListWriterAddressMode.RelativeAddressing ? j2 : -1L;
                        throw th;
                    }
                } finally {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                }
            } finally {
                linkComposer.reader = slotTableReader2;
                linkComposer.nodeCountOverrides = la0Var;
                linkComposer.providerUpdates = na0Var;
            }
        } catch (Throwable th3) {
            composerChangeListWriter.setChangeList(changeList2);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 insertMovableContentGuarded$lambda$0$0$1$0$0$0$0$0(LinkComposer linkComposer, MovableContentStateReference movableContentStateReference) {
        linkComposer.invokeMovableContentLambda(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals$runtime(), movableContentStateReference.getParameter$runtime(), true);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        recordProviderUpdate(r16);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void invokeMovableContentLambda(MovableContent<Object> movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, Object obj, boolean z) {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        updateSlot(obj);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i = 1;
        try {
            this.compositeKeyHashCode = 126665345L;
            if (getInserting()) {
                this.builder.addFlags(GroupFlagsKt.IsMovableContentFlag);
            }
            boolean z2 = false;
            if (!getInserting() && !q10.b(this.reader.getGroupAux(), persistentCompositionLocalMap)) {
                z2 = true;
            }
            m3847startAzEfcrM(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3947getGroup9udXigM(), persistentCompositionLocalMap);
            this.providerCache = null;
            if (!getInserting() || z) {
                boolean z3 = this.providersInvalid;
                this.providersInvalid = z2;
                this.changeListWriter.seekTo(this.reader.handle(), true);
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                composerChangeListWriter.editorCurrentPosition = -1L;
                ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.AnchorAddressing;
                ComposerChangeListWriterAddressMode addressMode$runtime = composerChangeListWriter.getAddressMode$runtime();
                long j = composerChangeListWriter.editorCurrentPosition;
                composerChangeListWriter.setAddressMode$runtime(composerChangeListWriterAddressMode);
                try {
                    Expect_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(-1241221479, true, new az(movableContent, obj, i)));
                    composerChangeListWriter.setAddressMode$runtime(addressMode$runtime);
                    composerChangeListWriter.editorCurrentPosition = addressMode$runtime == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
                    this.providersInvalid = z3;
                } catch (Throwable th) {
                    composerChangeListWriter.setAddressMode$runtime(addressMode$runtime);
                    composerChangeListWriter.editorCurrentPosition = addressMode$runtime == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
                    throw th;
                }
            } else {
                this.builderHasAProvider = true;
                SlotTableBuilder slotTableBuilder = this.builder;
                this.parentContext.insertMovableContent$runtime(new MovableContentStateReference(movableContent, obj, getComposition(), this.builder.getTable(), this.builder.getTable().getAddressSpace().anchorOfAddress(slotTableBuilder.parent(slotTableBuilder.getParentGroup())), ut.d, currentCompositionLocalScope(), null));
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeMovableContentLambda$lambda$0$0(MovableContent movableContent, Object obj, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1241221479, i, -1, "androidx.compose.runtime.LinkComposer.invokeMovableContentLambda.<anonymous>.<anonymous> (LinkComposer.kt:2031)");
            }
            movableContent.getContent().invoke(obj, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    private final boolean isGroupAfterCurrentReaderPosition(long j) {
        long firstGroupInTopologicalOrder;
        long handle = this.reader.handle();
        if (handle == -1) {
            return true;
        }
        firstGroupInTopologicalOrder = LinkComposerKt.firstGroupInTopologicalOrder(getReaderTable$runtime(), j, handle);
        return firstGroupInTopologicalOrder == handle;
    }

    private final int rGroupIndexOf(int i) {
        int parentOf = this.reader.parentOf(i);
        int[] groups = getReaderTable$runtime().getAddressSpace().getGroups();
        int i2 = 0;
        for (int root = parentOf < 0 ? getReaderTable$runtime().getRoot() : this.reader.firstChildOf(parentOf); root >= 0 && root != i; root = groups[root + 1]) {
            if (!this.reader.hasObjectKey(root)) {
                i2++;
            }
        }
        return i2;
    }

    private final <R> R recomposeMovableContent(ControlledComposition controlledComposition, ControlledComposition controlledComposition2, int i, List<? extends xe0> list, iy iyVar) {
        R r;
        boolean isComposing$runtime = isComposing$runtime();
        int i2 = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                xe0 xe0Var = list.get(i3);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) xe0Var.d;
                Object obj = xe0Var.e;
                if (obj != null) {
                    tryImminentInvalidation$runtime(recomposeScopeImpl, obj);
                } else {
                    tryImminentInvalidation$runtime(recomposeScopeImpl, null);
                }
            }
            if (controlledComposition == null || (r = (R) controlledComposition.delegateInvalidations(controlledComposition2, i, iyVar)) == null) {
                r = (R) iyVar.invoke();
            }
            this.isComposing = isComposing$runtime;
            this.nodeIndex = i2;
            return r;
        } catch (Throwable th) {
            this.isComposing = isComposing$runtime;
            this.nodeIndex = i2;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object recomposeMovableContent$default(LinkComposer linkComposer, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, int i, List list, iy iyVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            controlledComposition = null;
        }
        if ((i2 & 2) != 0) {
            controlledComposition2 = null;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        if ((i2 & 8) != 0) {
            list = ut.d;
        }
        return linkComposer.recomposeMovableContent(controlledComposition, controlledComposition2, i, list, iyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void recomposeToGroupEnd() {
        long j;
        int i;
        int i2;
        int firstChildOf;
        int i3;
        int i4;
        int i5;
        long rotateLeft;
        int i6;
        boolean isComposing$runtime = isComposing$runtime();
        int i7 = 1;
        this.isComposing = true;
        SlotTableReader slotTableReader = this.reader;
        int parentGroup = slotTableReader.getParentGroup();
        int i8 = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i9 = this.groupNodeCount;
        int i10 = this.rGroupIndex;
        int firstChildOf2 = slotTableReader.firstChildOf(parentGroup);
        int i11 = 0;
        loop0: while (firstChildOf2 != -1) {
            if (slotTableReader.recomposeRequired(firstChildOf2)) {
                slotTableReader.reposition(firstChildOf2);
                i = i7;
                RecomposeScopeImpl requireRecomposeScope = requireRecomposeScope(firstChildOf2);
                j = 4294967295L;
                if (requireRecomposeScope.isInvalidFor(ScopeMap.m3925getimpl(this.invalidations, requireRecomposeScope))) {
                    this.providerCache = null;
                    rGroupIndexOf(firstChildOf2);
                    requireRecomposeScope.compose(this);
                    this.providerCache = null;
                    i2 = i;
                    i11 = i2;
                    firstChildOf = slotTableReader.firstChildOf(firstChildOf2);
                    if (i2 == 0 || firstChildOf == -1) {
                        i3 = i2;
                        i4 = i11;
                        i5 = -1;
                    } else {
                        boolean hasRecomposeRequired = slotTableReader.hasRecomposeRequired(firstChildOf2);
                        if (hasRecomposeRequired) {
                            if (slotTableReader.groupObjectKey(firstChildOf2) instanceof MovableContent) {
                                this.compositeKeyHashCode = 126665345L;
                                i3 = i2;
                                i4 = i11;
                            } else {
                                int i12 = i11;
                                int groupKey = slotTableReader.groupKey(firstChildOf2);
                                int i13 = this.rGroupIndex;
                                Object groupObjectKey = slotTableReader.groupObjectKey(firstChildOf2);
                                i3 = i2;
                                Object groupAux = slotTableReader.groupAux(firstChildOf2);
                                if (groupObjectKey != null) {
                                    i4 = i12;
                                    rotateLeft = Long.rotateLeft((groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode()) ^ Long.rotateLeft(getCompositeKeyHashCode(), 3), 3);
                                } else if (groupAux == null || groupKey != 207 || groupAux.equals(Composer.Companion.getEmpty())) {
                                    i4 = i12;
                                    rotateLeft = i13 ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupKey, 3);
                                } else {
                                    i4 = i12;
                                    this.compositeKeyHashCode = i13 ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupAux.hashCode(), 3);
                                }
                                this.compositeKeyHashCode = rotateLeft;
                            }
                            this.parentStateStack.push(this.nodeIndex);
                            this.parentStateStack.push(this.rGroupIndex);
                            if (slotTableReader.isNode(firstChildOf2)) {
                                this.changeListWriter.moveDown(slotTableReader.node(firstChildOf2));
                                i6 = 0;
                                this.nodeIndex = 0;
                            } else {
                                i6 = 0;
                            }
                            this.rGroupIndex = i6;
                        } else {
                            i3 = i2;
                            i4 = i11;
                            this.nodeIndex += slotTableReader.isNode(firstChildOf2) ? i : updatedNodeCount(firstChildOf2 & j);
                            if (!slotTableReader.hasObjectKey(firstChildOf2)) {
                                this.rGroupIndex++;
                            }
                        }
                        if (hasRecomposeRequired) {
                            firstChildOf2 = firstChildOf;
                            i7 = i;
                            i11 = i4;
                        } else {
                            i5 = -1;
                        }
                    }
                    if (firstChildOf == i5 && i3 == 0) {
                        this.nodeIndex += !slotTableReader.isNode(firstChildOf2) ? i : updatedNodeCount(firstChildOf2 & j);
                        if (!slotTableReader.hasObjectKey(firstChildOf2)) {
                            this.rGroupIndex++;
                        }
                    }
                    int i14 = firstChildOf2;
                    firstChildOf2 = slotTableReader.nextSiblingOf(firstChildOf2);
                    while (firstChildOf2 == -1) {
                        i14 = slotTableReader.parentOf(i14);
                        if (i14 == -1 || i14 == parentGroup) {
                            i11 = i4;
                            break loop0;
                        }
                        if (slotTableReader.isNode(i14)) {
                            this.changeListWriter.moveUp();
                        }
                        this.rGroupIndex = this.parentStateStack.pop();
                        this.nodeIndex = this.parentStateStack.pop() + updatedNodeCount(i14 & j);
                        int groupKey2 = slotTableReader.groupKey(i14);
                        int i15 = this.rGroupIndex;
                        Object groupObjectKey2 = slotTableReader.groupObjectKey(i14);
                        Object groupAux2 = slotTableReader.groupAux(i14);
                        if (groupObjectKey2 != null) {
                            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ (groupObjectKey2 instanceof Enum ? ((Enum) groupObjectKey2).ordinal() : groupObjectKey2.hashCode()), 3);
                        } else if (groupAux2 == null || groupKey2 != 207 || groupAux2.equals(Composer.Companion.getEmpty())) {
                            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ i15, 3) ^ groupKey2, 3);
                        } else {
                            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ i15, 3) ^ groupAux2.hashCode(), 3);
                        }
                        if (!slotTableReader.hasObjectKey(i14)) {
                            this.rGroupIndex++;
                        }
                        firstChildOf2 = slotTableReader.nextSiblingOf(i14);
                    }
                    i7 = i;
                    i11 = i4;
                } else {
                    Stack.m3872pushimpl(this.invalidateStack, requireRecomposeScope);
                    CompositionObserver current = this.observerHolder.current();
                    if (current != null) {
                        try {
                            current.onScopeEnter(requireRecomposeScope);
                            requireRecomposeScope.rereadTrackedInstances();
                        } finally {
                            current.onScopeExit(requireRecomposeScope);
                        }
                    } else {
                        requireRecomposeScope.rereadTrackedInstances();
                    }
                    Stack.m3871popimpl(this.invalidateStack);
                }
            } else {
                i = i7;
                j = 4294967295L;
            }
            i2 = 0;
            firstChildOf = slotTableReader.firstChildOf(firstChildOf2);
            if (i2 == 0) {
            }
            i3 = i2;
            i4 = i11;
            i5 = -1;
            if (firstChildOf == i5) {
                this.nodeIndex += !slotTableReader.isNode(firstChildOf2) ? i : updatedNodeCount(firstChildOf2 & j);
                if (!slotTableReader.hasObjectKey(firstChildOf2)) {
                }
            }
            int i142 = firstChildOf2;
            firstChildOf2 = slotTableReader.nextSiblingOf(firstChildOf2);
            while (firstChildOf2 == -1) {
            }
            i7 = i;
            i11 = i4;
        }
        j = 4294967295L;
        slotTableReader.restoreParent(parentGroup);
        if (i11 != 0) {
            slotTableReader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parentGroup & j);
            this.nodeIndex = i8 + updatedNodeCount;
            this.groupNodeCount = i9 + updatedNodeCount;
            this.rGroupIndex = i10;
        } else {
            skipReaderToGroupEnd();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = isComposing$runtime;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.handle());
        this.changeListWriter.removeGroup();
    }

    private final void recordInsert(long j) {
        boolean isEmpty = this.insertFixups.isEmpty();
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        if (isEmpty) {
            composerChangeListWriter.insertSlots(this.builder.getTable(), j);
        } else {
            composerChangeListWriter.insertSlots(this.builder.getTable(), j, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        na0 na0Var = this.providerUpdates;
        if (na0Var == null) {
            na0Var = new na0();
            this.providerUpdates = na0Var;
        }
        na0Var.i(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsFlags(GroupFlagsKt.HasMovableContentFlag)) {
            getComposition().updateMovingInvalidations$runtime();
            ChangeList changeList = new ChangeList();
            setDeferredChanges$runtime(changeList);
            SlotTableReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(openReader.rootHandle());
                } finally {
                    composerChangeListWriter.setChangeList(changeList2);
                }
            } finally {
                openReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(long j) {
        int group = GroupHandleKt.getGroup(j);
        boolean z = (this.reader.flagsOf(group) & GroupFlagsKt.IsNodeFlag) == 8388608;
        if (z) {
            this.changeListWriter.endNodeMovement();
            this.changeListWriter.moveDown(this.reader.node(group));
        }
        reportFreeMovableContent$reportGroup(this, j, z, 0);
        this.changeListWriter.endNodeMovement();
        if (z) {
            this.changeListWriter.moveUp();
        }
    }

    private static final MovableContentStateReference reportFreeMovableContent$createMovableContentReferenceForGroup(LinkComposer linkComposer, int i, List<MovableContentStateReference> list) {
        Object groupObjectKey = linkComposer.reader.groupObjectKey(i);
        groupObjectKey.getClass();
        MovableContent movableContent = (MovableContent) groupObjectKey;
        Object obj = linkComposer.reader.get(i, 0);
        List<xe0> m3848findInvalidationsVpaz1Sg = LinkComposerKt.m3848findInvalidationsVpaz1Sg(linkComposer.reader, i, linkComposer.invalidations);
        return new MovableContentStateReference(movableContent, obj, linkComposer.getComposition(), linkComposer.getReaderTable$runtime(), linkComposer.getReaderTable$runtime().getAddressSpace().anchorOfAddress(i), m3848findInvalidationsVpaz1Sg, linkComposer.currentCompositionLocalScope(i), list);
    }

    private static final MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor(LinkComposer linkComposer, int i) {
        boolean z;
        int flagsOf = linkComposer.reader.flagsOf(i);
        m50 m50Var = null;
        if ((flagsOf & GroupFlagsKt.IsMovableContentFlag) != 268435456) {
            return null;
        }
        if ((flagsOf & GroupFlagsKt.HasMovableContentFlag) == 536870912) {
            m50 o = y80.o();
            SlotTableReader slotTableReader = linkComposer.reader;
            int firstChildOf = slotTableReader.firstChildOf(i);
            loop0: while (firstChildOf != -1) {
                if ((linkComposer.reader.flagsOf(firstChildOf) & GroupFlagsKt.IsMovableContentFlag) == 268435456) {
                    MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(linkComposer, firstChildOf);
                    if (reportFreeMovableContent$movableContentReferenceFor != null) {
                        o.add(reportFreeMovableContent$movableContentReferenceFor);
                    }
                    z = true;
                } else {
                    z = false;
                }
                int firstChildOf2 = slotTableReader.firstChildOf(firstChildOf);
                if (z || firstChildOf2 == -1 || (linkComposer.reader.flagsOf(firstChildOf) & GroupFlagsKt.HasMovableContentFlag) != 536870912) {
                    int i2 = firstChildOf;
                    firstChildOf = slotTableReader.nextSiblingOf(firstChildOf);
                    while (firstChildOf == -1) {
                        i2 = slotTableReader.parentOf(i2);
                        if (i2 == -1 || i2 == i) {
                            break loop0;
                        }
                        firstChildOf = slotTableReader.nextSiblingOf(i2);
                    }
                } else {
                    firstChildOf = firstChildOf2;
                }
            }
            m50Var = y80.d(o);
        }
        return reportFreeMovableContent$createMovableContentReferenceForGroup(linkComposer, i, m50Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if ((r0 & androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt.IsNodeFlag) == 8388608) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r3 = r0 & androidx.compose.runtime.composer.linkbuffer.GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if ((r0 & androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt.IsNodeFlag) == 8388608) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
    
        if ((r0 & androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt.IsNodeFlag) == 8388608) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int reportFreeMovableContent$reportGroup(LinkComposer linkComposer, long j, boolean z, int i) {
        int flagsOf;
        int group = GroupHandleKt.getGroup(j);
        int i2 = 0;
        if (group < 0) {
            return 0;
        }
        int flagsOf2 = linkComposer.reader.flagsOf(group);
        if ((flagsOf2 & GroupFlagsKt.IsMovableContentFlag) == 268435456) {
            MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(linkComposer, group);
            if (reportFreeMovableContent$movableContentReferenceFor != null) {
                linkComposer.parentContext.deletedMovableContent$runtime(reportFreeMovableContent$movableContentReferenceFor);
                linkComposer.changeListWriter.releaseMovableGroup(linkComposer.getComposition(), linkComposer.parentContext, reportFreeMovableContent$movableContentReferenceFor);
            }
            if (z) {
                linkComposer.changeListWriter.endNodeMovementAndDeleteNode(i, group);
            } else {
                flagsOf = linkComposer.reader.flagsOf(group);
            }
        } else if ((flagsOf2 & GroupFlagsKt.IsSubcompositionContextFlag) == 1073741824) {
            Object obj = linkComposer.reader.get(group, 0);
            RememberObserverHolder rememberObserverHolder = obj instanceof RememberObserverHolder ? (RememberObserverHolder) obj : null;
            Object wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
            CompositionContextHolder compositionContextHolder = wrapped instanceof CompositionContextHolder ? (CompositionContextHolder) wrapped : null;
            if (compositionContextHolder != null) {
                for (LinkComposer linkComposer2 : compositionContextHolder.getRef().getComposers()) {
                    linkComposer2.reportAllMovableContent();
                    linkComposer.parentContext.reportRemovedComposition$runtime(linkComposer2.getComposition());
                }
            }
            flagsOf = linkComposer.reader.flagsOf(group);
        } else if ((flagsOf2 & GroupFlagsKt.HasMovableContentFlag) == 536870912 || (flagsOf2 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            SlotTableReader slotTableReader = linkComposer.reader;
            int i3 = 0;
            for (long firstChildOf = (slotTableReader.firstChildOf(group) & 4294967295L) | (-4294967296L); GroupHandleKt.getGroup(firstChildOf) != -1; firstChildOf = (slotTableReader.nextSiblingOf(GroupHandleKt.getGroup(firstChildOf)) & 4294967295L) | (GroupHandleKt.getGroup(firstChildOf) << 32)) {
                int group2 = GroupHandleKt.getGroup(firstChildOf);
                boolean z2 = (linkComposer.reader.flagsOf(group2) & GroupFlagsKt.IsNodeFlag) == 8388608;
                if (z2) {
                    linkComposer.changeListWriter.endNodeMovement();
                    linkComposer.changeListWriter.moveDown(linkComposer.reader.node(group2));
                }
                i3 += reportFreeMovableContent$reportGroup(linkComposer, firstChildOf, z2 || z, z2 ? 0 : i + i3);
                if (z2) {
                    linkComposer.changeListWriter.endNodeMovement();
                    linkComposer.changeListWriter.moveUp();
                }
            }
            i2 = i3;
        } else {
            flagsOf = linkComposer.reader.flagsOf(group);
        }
        if ((flagsOf2 & GroupFlagsKt.IsNodeFlag) == 8388608) {
            return 1;
        }
        return i2;
    }

    private final RecomposeScopeImpl requireRecomposeScope(int i) {
        Object obj = this.reader.get(i, 0);
        if (q10.b(obj, Composer.Companion.getEmpty())) {
            ComposerKt.composeImmediateRuntimeError("Cannot obtain RecomposeScope. Group does not have a corresponding slot.");
        }
        if (!(obj instanceof RecomposeScopeImpl)) {
            ComposerKt.composeImmediateRuntimeError("Expected a RecomposeScope in the first non-utility slot, found " + obj + '.');
        }
        return (RecomposeScopeImpl) obj;
    }

    private final boolean requiresRecomposition(int i) {
        return this.reader.hasRecomposeRequired(i);
    }

    private final void resetInsertBuilder(boolean z) {
        if (!this.builder.isClosed()) {
            SlotTable build = this.builder.build();
            if (z) {
                build.dispose();
            }
        }
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(this.slotTable.getAddressSpace(), false, false);
        slotTableBuilder.close();
        this.builder = slotTableBuilder;
    }

    private final void skipGroup() {
        this.groupNodeCount = this.reader.skipGroup() + this.groupNodeCount;
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodeCount();
        this.reader.skipToGroupEnd();
    }

    private final List<ComposeStackTraceFrame> stackTraceForGroup(int i, Integer num) {
        if (!getSourceMarkersEnabled$runtime()) {
            return ut.d;
        }
        SlotTableReader openReader = this.slotTable.openReader();
        try {
            return SlotTableReaderKt.traceForGroup(openReader, i, num);
        } finally {
            openReader.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stackTraceForValue$lambda$0(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        RememberObserverHolder rememberObserverHolder = obj2 instanceof RememberObserverHolder ? (RememberObserverHolder) obj2 : null;
        return (rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null) == obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* renamed from: start-AzEfcrM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m3847startAzEfcrM(int i, Object obj, int i2, Object obj2) {
        long rotateLeft;
        long insertAddress;
        long insertAddress2;
        validateNodeNotExpected();
        int i3 = this.rGroupIndex;
        if (obj != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ (obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(Composer.Companion.getEmpty())) {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ obj2.hashCode(), 3) ^ i3;
                if (obj == null) {
                    this.rGroupIndex++;
                }
                GroupKind.Companion companion = GroupKind.Companion;
                boolean z = i2 == companion.m3947getGroup9udXigM();
                LinkPending linkPending = null;
                if (!getInserting()) {
                    this.reader.beginEmpty();
                    SlotTableBuilder slotTableBuilder = this.builder;
                    if (z) {
                        Composer.Companion companion2 = Composer.Companion;
                        Object empty = companion2.getEmpty();
                        slotTableBuilder.startNewGroup(i, empty == companion2.getEmpty() ? 8388608 : 25165824, empty, null, companion2.getEmpty());
                    } else if (obj2 != null) {
                        Object empty2 = obj == null ? Composer.Companion.getEmpty() : obj;
                        slotTableBuilder.startNewGroup(i, empty2 == Composer.Companion.getEmpty() ? 33554432 : 50331648, empty2, obj2, null);
                    } else {
                        Object empty3 = obj == null ? Composer.Companion.getEmpty() : obj;
                        slotTableBuilder.startNewGroup(i, empty3 == Composer.Companion.getEmpty() ? 0 : GroupFlagsKt.HasObjectKeyFlag, empty3, null, null);
                    }
                    LinkPending linkPending2 = this.pending;
                    if (linkPending2 != null) {
                        insertAddress2 = LinkComposerKt.toInsertAddress(slotTableBuilder.getParentHandle());
                        KeyInfo keyInfo = new KeyInfo(i, -1, insertAddress2, -1, 0);
                        linkPending2.registerInsert(keyInfo, this.nodeIndex - linkPending2.getStartIndex());
                        linkPending2.recordUsed(keyInfo);
                    }
                    enterGroup(z, null);
                    return;
                }
                boolean z2 = i2 == companion.m3948getNode9udXigM() && this.reusing;
                if (this.pending == null) {
                    int groupKey = this.reader.getGroupKey();
                    if (!z2 && groupKey == i && q10.b(obj, this.reader.getGroupObjectKey())) {
                        startReaderGroup(z, obj2);
                    } else {
                        this.pending = new LinkPending(this.reader.extractKeys(), this.nodeIndex);
                    }
                }
                LinkPending linkPending3 = this.pending;
                if (linkPending3 != null) {
                    KeyInfo next = linkPending3.getNext(i, obj);
                    if (z2 || next == null) {
                        this.reader.beginEmpty();
                        this.inserting = true;
                        this.providerCache = null;
                        ensureBuilder();
                        SlotTableBuilder slotTableBuilder2 = this.builder;
                        if (z) {
                            Composer.Companion companion3 = Composer.Companion;
                            Object empty4 = companion3.getEmpty();
                            slotTableBuilder2.startNewGroup(i, empty4 == companion3.getEmpty() ? 8388608 : 25165824, empty4, null, companion3.getEmpty());
                        } else if (obj2 != null) {
                            Object empty5 = obj == null ? Composer.Companion.getEmpty() : obj;
                            slotTableBuilder2.startNewGroup(i, empty5 == Composer.Companion.getEmpty() ? 33554432 : 50331648, empty5, obj2, null);
                        } else {
                            Object empty6 = obj == null ? Composer.Companion.getEmpty() : obj;
                            slotTableBuilder2.startNewGroup(i, empty6 == Composer.Companion.getEmpty() ? 0 : GroupFlagsKt.HasObjectKeyFlag, empty6, null, null);
                        }
                        insertAddress = LinkComposerKt.toInsertAddress(slotTableBuilder2.getParentHandle());
                        KeyInfo keyInfo2 = new KeyInfo(i, -1, insertAddress, -1, 0);
                        linkPending3.registerInsert(keyInfo2, this.nodeIndex - linkPending3.getStartIndex());
                        linkPending3.recordUsed(keyInfo2);
                        linkPending = new LinkPending(new ArrayList(), z ? 0 : this.nodeIndex);
                    } else {
                        linkPending3.recordUsed(next);
                        long handle = next.getHandle();
                        this.nodeIndex = linkPending3.nodePositionOf(next) + linkPending3.getStartIndex();
                        int slotPositionOf = linkPending3.slotPositionOf(next);
                        int groupIndex = slotPositionOf - linkPending3.getGroupIndex();
                        linkPending3.registerMoveSlot(slotPositionOf, linkPending3.getGroupIndex());
                        if (groupIndex > 0) {
                            this.reader.reposition(linkPending3.groupHandleOfNextUnmovedGroup());
                            this.changeListWriter.moveGroup(groupIndex);
                        }
                        linkPending3.markGroupLocationReconciled(next.getIndex());
                        this.reader.reposition(handle);
                        startReaderGroup(z, obj2);
                    }
                }
                enterGroup(z, linkPending);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i, 3) ^ i3;
        }
        this.compositeKeyHashCode = rotateLeft;
        if (obj == null) {
        }
        GroupKind.Companion companion4 = GroupKind.Companion;
        if (i2 == companion4.m3947getGroup9udXigM()) {
        }
        LinkPending linkPending4 = null;
        if (!getInserting()) {
        }
    }

    private final void startGroup(int i) {
        m3847startAzEfcrM(i, null, GroupKind.Companion.m3947getGroup9udXigM(), null);
    }

    private final void startReaderGroup(boolean z, Object obj) {
        if (z) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.changeListWriter.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        int asInt;
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        GroupKind.Companion companion = GroupKind.Companion;
        m3847startAzEfcrM(100, null, companion.m3947getGroup9udXigM(), null);
        this.parentContext.startComposing$runtime();
        PersistentCompositionLocalMap compositionLocalScope$runtime = this.parentContext.getCompositionLocalScope$runtime();
        IntStack intStack = this.providersInvalidStack;
        asInt = LinkComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(compositionLocalScope$runtime);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime();
        }
        if (!getSourceMarkersEnabled$runtime()) {
            setSourceMarkersEnabled$runtime(this.parentContext.getCollectingSourceInformation$runtime());
        }
        if (getSourceMarkersEnabled$runtime()) {
            CompositionLocal<CompositionErrorContext> localCompositionErrorContext = CompositionErrorContextKt.getLocalCompositionErrorContext();
            localCompositionErrorContext.getClass();
            compositionLocalScope$runtime = compositionLocalScope$runtime.putValue(localCompositionErrorContext, new StaticValueHolder(getErrorContext$runtime()));
        }
        this.rootProvider = compositionLocalScope$runtime;
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(compositionLocalScope$runtime, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            this.parentContext.recordInspectionTable$runtime(set);
        }
        m3847startAzEfcrM(Long.hashCode(this.parentContext.getCompositeKeyHashCode$runtime()), null, companion.m3947getGroup9udXigM(), null);
    }

    private final Object unwrapRememberObserverHolder(Object obj) {
        return obj instanceof RememberObserverHolder ? ((RememberObserverHolder) obj).getWrapped() : obj;
    }

    private final void updateChildNodeCount(long j, int i) {
        if (updatedNodeCount(j) != i) {
            if (LinkComposerKt.isInsertHandle(j)) {
                la0 la0Var = this.nodeCountVirtualOverrides;
                if (la0Var == null) {
                    la0Var = new la0();
                    this.nodeCountVirtualOverrides = la0Var;
                }
                la0Var.g(GroupHandleKt.getGroup(j), i);
                return;
            }
            la0 la0Var2 = this.nodeCountOverrides;
            if (la0Var2 == null) {
                la0Var2 = new la0();
                this.nodeCountOverrides = la0Var2;
            }
            LinkComposerKt.isInsertHandle(j);
            la0Var2.g(GroupHandleKt.getGroup(j), i);
        }
    }

    private final void updateCompositeKeyWhenWeEnterGroup(int i, int i2, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((Enum) obj).ordinal(), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ obj.hashCode(), 3);
                return;
            }
        }
        if (obj2 == null || i != 207 || obj2.equals(Composer.Companion.getEmpty())) {
            this.compositeKeyHashCode = i2 ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i, 3);
        } else {
            this.compositeKeyHashCode = i2 ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ obj2.hashCode(), 3);
        }
    }

    private final void updateCompositeKeyWhenWeEnterGroupKeyHash(int i, int i2) {
        this.compositeKeyHashCode = i2 ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i, 3);
    }

    private final void updateCompositeKeyWhenWeExitGroup(int i, int i2, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ ((Enum) obj).ordinal(), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ obj.hashCode(), 3);
                return;
            }
        }
        if (obj2 == null || i != 207 || obj2.equals(Composer.Companion.getEmpty())) {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ i2, 3) ^ i, 3);
        } else {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ i2, 3) ^ obj2.hashCode(), 3);
        }
    }

    private final void updateCompositeKeyWhenWeExitGroupKeyHash(int i, int i2) {
        this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ i2, 3) ^ i, 3);
    }

    private final void updateNodeCountOverrides(long j, int i) {
        int updatedNodeCount = updatedNodeCount(j);
        if (updatedNodeCount != i) {
            int i2 = i - updatedNodeCount;
            int m3865getSizeimpl = Stack.m3865getSizeimpl(this.pendingStack) - 1;
            while (GroupHandleKt.getGroup(j) != -1) {
                int updatedNodeCount2 = updatedNodeCount(j) + i2;
                updateChildNodeCount(j, updatedNodeCount2);
                int i3 = m3865getSizeimpl;
                while (true) {
                    if (-1 < i3) {
                        LinkPending linkPending = (LinkPending) Stack.m3870peekimpl(this.pendingStack, i3);
                        if (linkPending != null && linkPending.updateNodeCount(GroupHandleKt.getGroup(j), updatedNodeCount2)) {
                            m3865getSizeimpl = i3 - 1;
                            break;
                        }
                        i3--;
                    } else {
                        break;
                    }
                }
                if (LinkComposerKt.isInsertHandle(j)) {
                    j = this.reader.getParentHandle();
                } else {
                    if ((getReaderTable$runtime().getAddressSpace().getGroups()[GroupHandleKt.getGroup(j) + 4] & GroupFlagsKt.IsNodeFlag) == 8388608) {
                        return;
                    } else {
                        j = r1[r7 + 2] & 4294967295L;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2 = persistentCompositionLocalMap.builder2();
        builder2.putAll(persistentCompositionLocalMap2);
        ?? build2 = builder2.build2();
        startGroup(ComposerKt.providerMapsKey, ComposerKt.getProviderMaps());
        updateSlot(build2);
        updateSlot(persistentCompositionLocalMap2);
        endGroup();
        return build2;
    }

    private final void updateSlot(Object obj) {
        nextSlot$runtime();
        updateValue(obj);
    }

    private final int updatedNodeCount(long j) {
        int e;
        if (LinkComposerKt.isInsertHandle(j)) {
            la0 la0Var = this.nodeCountVirtualOverrides;
            if (la0Var != null) {
                return la0Var.e(GroupHandleKt.getGroup(j), 0);
            }
            return 0;
        }
        LinkComposerKt.isInsertHandle(j);
        int group = GroupHandleKt.getGroup(j);
        la0 la0Var2 = this.nodeCountOverrides;
        return (la0Var2 == null || (e = la0Var2.e(group, -1)) < 0) ? getReaderTable$runtime().getAddressSpace().getGroups()[group + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK : e;
    }

    private final void validateNodeExpected() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final <R> R withReader(SlotTableReader slotTableReader, iy iyVar) {
        SlotTableReader slotTableReader2 = this.reader;
        la0 la0Var = this.nodeCountOverrides;
        na0 na0Var = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            this.reader = slotTableReader;
            return (R) iyVar.invoke();
        } finally {
            this.reader = slotTableReader2;
            this.nodeCountOverrides = la0Var;
            this.providerUpdates = na0Var;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v, my myVar) {
        if (getInserting()) {
            this.insertFixups.updateNode(v, myVar);
        } else {
            this.changeListWriter.updateNode(v, myVar);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        LinkComposer linkComposer;
        startGroup(ComposerKt.referenceKey, ComposerKt.getReference());
        if (getInserting()) {
            this.builder.addFlags(GroupFlagsKt.IsSubcompositionContextFlag);
        }
        Object nextSlot$runtime = nextSlot$runtime();
        ReusableRememberObserverHolder reusableRememberObserverHolder = nextSlot$runtime instanceof ReusableRememberObserverHolder ? (ReusableRememberObserverHolder) nextSlot$runtime : null;
        if (reusableRememberObserverHolder == null) {
            linkComposer = this;
            reusableRememberObserverHolder = new ReusableLinkRememberObserverHolder(new CompositionContextHolder(linkComposer.new CompositionContextImpl(getCompositeKeyHashCode(), this.forceRecomposeScopes, getSourceMarkersEnabled$runtime(), getComposition().getObserverHolder$runtime())), LinkAnchorKt.getNullAnchor());
            linkComposer.updateValue(reusableRememberObserverHolder);
        } else {
            linkComposer = this;
        }
        RememberObserver wrapped = reusableRememberObserverHolder.getWrapped();
        wrapped.getClass();
        CompositionContextHolder compositionContextHolder = (CompositionContextHolder) wrapped;
        compositionContextHolder.getRef().updateCompositionLocalScope(linkComposer.currentCompositionLocalScope());
        linkComposer.endGroup();
        return compositionContextHolder.getRef();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(long j) {
        Object nextSlot$runtime = nextSlot$runtime();
        if ((nextSlot$runtime instanceof Long) && j == ((Number) nextSlot$runtime).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changedInstance(Object obj) {
        if (nextSlot$runtime() == obj) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void changesApplied$runtime() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        setSourceMarkersEnabled$runtime(true);
        this.slotTable.collectSourceInformation();
        this.builder.collectSourceInformation();
    }

    @Override // androidx.compose.runtime.InternalComposer
    /* renamed from: composeContent--ZbOJvo$runtime */
    public void mo3841composeContentZbOJvo$runtime(fb0 fb0Var, my myVar, ShouldPauseCallback shouldPauseCallback) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPauseCallback;
        try {
            m3846doComposeaFTiNEg(fb0Var, myVar);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T consume(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), compositionLocal);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(iy iyVar) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int peek = this.parentStateStack.peek();
        this.groupNodeCount++;
        long parentHandle = this.builder.getParentHandle();
        if (!this.changeListWriter.isInAnchorMode()) {
            this.insertFixups.createAndInsertNode(iyVar, peek, this.builder.getParentHandle());
        } else {
            this.insertFixups.createAndInsertNodeByAnchor(iyVar, peek, this.builder.getTable().getAddressSpace().anchorOfAddress(GroupHandleKt.getGroup(parentHandle)));
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void deactivate$runtime() {
        Stack.m3860clearimpl(this.invalidateStack);
        ScopeMap.m3916clearimpl(this.invalidations);
        this.changes.clear();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void deactivateToEndGroup(boolean z) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!z) {
            skipReaderToGroupEnd();
        } else {
            this.changeListWriter.deactivateCurrentGroup();
            this.reader.skipToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        setSourceMarkersEnabled$runtime(false);
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void dispose$runtime() {
        this.slotTable.dispose();
        this.parentContext.unregisterComposer$runtime(this);
        deactivate$runtime();
        getApplier().clear();
        this.isDisposed = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime == null || !currentRecomposeScope$runtime.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProvider() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = LinkComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = LinkComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public ScopeUpdateScope endRestartGroup() {
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.m3868isNotEmptyimpl(this.invalidateStack) ? (RecomposeScopeImpl) Stack.m3871popimpl(this.invalidateStack) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.setRequiresRecompose(false);
            ky exitRecomposeScope = exitRecomposeScope(recomposeScopeImpl2);
            if (exitRecomposeScope != null) {
                this.changeListWriter.endCompositionScope(exitRecomposeScope, getComposition());
            }
            if (recomposeScopeImpl2.getResuming()) {
                recomposeScopeImpl2.setResuming(false);
                this.changeListWriter.endResumingScope(recomposeScopeImpl2);
                recomposeScopeImpl2.setReusing(false);
                if (recomposeScopeImpl2.getResetReusing() && this.reusingGroup == this.reader.getParentGroup()) {
                    recomposeScopeImpl2.setResetReusing(false);
                    this.reusingGroup = -1;
                    this.reusing = false;
                }
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime() && (recomposeScopeImpl2.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                recomposeScopeImpl2.setAnchor(getInserting() ? this.builder.getParentAnchor() : this.reader.getParentAnchor());
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParentGroup() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void endReuseFromRoot$runtime() {
        int i = this.reusingGroup;
        if (!(!isComposing$runtime() && (i < 0 ? 100 : this.reader.groupKey(i)) == 100)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i) {
        if (i < 0) {
            int i2 = -i;
            SlotTableBuilder slotTableBuilder = this.builder;
            oa0 oa0Var = new oa0();
            int[] groups = getReaderTable$runtime().getAddressSpace().getGroups();
            int i3 = i2;
            while (i3 > 0) {
                oa0Var.b(i3);
                i3 = groups[i3 + 2];
            }
            if (i3 == 0) {
                gy.h(i2, "Traversing parent of group not in the slot table: ");
            }
            while (!oa0Var.a(slotTableBuilder.getParentGroup())) {
                end(slotTableBuilder.isNode());
            }
            return;
        }
        if (getInserting()) {
            SlotTableBuilder slotTableBuilder2 = this.builder;
            while (getInserting()) {
                end(slotTableBuilder2.isNode());
            }
        }
        oa0 oa0Var2 = new oa0();
        int[] groups2 = getReaderTable$runtime().getAddressSpace().getGroups();
        int i4 = i;
        while (i4 > 0) {
            oa0Var2.b(i4);
            i4 = groups2[i4 + 2];
        }
        if (i4 == 0) {
            gy.h(i, "Traversing parent of group not in the slot table: ");
        }
        SlotTableReader slotTableReader = this.reader;
        for (int parentGroup = slotTableReader.getParentGroup(); !oa0Var2.a(parentGroup); parentGroup = slotTableReader.getParentGroup()) {
            end((slotTableReader.flagsOf(parentGroup) & GroupFlagsKt.IsNodeFlag) == 8388608);
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean forceRecomposeScopes$runtime() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public kn getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean getAreChildrenComposing$runtime() {
        return this.childrenComposing > 0;
    }

    @Override // androidx.compose.runtime.Composer
    public long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        CompositionData compositionData = this._compositionData;
        if (compositionData != null) {
            return compositionData;
        }
        LinkCompositionDataImpl linkCompositionDataImpl = new LinkCompositionDataImpl(getComposition());
        this._compositionData = linkCompositionDataImpl;
        return linkCompositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.builder.getParentGroup() : this.reader.getParentGroup();
    }

    @Override // androidx.compose.runtime.InternalComposer
    public RecomposeScopeImpl getCurrentRecomposeScope$runtime() {
        ArrayList<RecomposeScopeImpl> arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && Stack.m3868isNotEmptyimpl(arrayList)) {
            return (RecomposeScopeImpl) Stack.m3869peekimpl(arrayList);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return !getSkipping() || this.providersInvalid || ((currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) != null && currentRecomposeScope$runtime.getDefaultsInvalid());
    }

    @Override // androidx.compose.runtime.InternalComposer
    public Changes getDeferredChanges$runtime() {
        return this.deferredChanges;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public CompositionErrorContextImpl getErrorContext$runtime() {
        if (getSourceMarkersEnabled$runtime()) {
            return this.errorContext;
        }
        return null;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean getHasPendingChanges$runtime() {
        return this.changes.isNotEmpty();
    }

    public final SlotTable getInsertTable$runtime() {
        return this.builder.getTable();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    public final SlotTableReader getReader$runtime() {
        return this.reader;
    }

    public final SlotTable getReaderTable$runtime() {
        return this.reader.getTable();
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            return currentRecomposeScope$runtime.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || currentRecomposeScope$runtime.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean getSourceMarkersEnabled$runtime() {
        return this.sourceMarkersEnabled;
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContent(MovableContent<?> movableContent, Object obj) {
        movableContent.getClass();
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContentReferences(List<xe0> list) {
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean isComposing$runtime() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    public Object joinKey(Object obj, Object obj2) {
        Object key;
        key = LinkComposerKt.getKey(getInserting() ? null : this.reader.getGroupObjectKey(), obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    public final Object nextSlot$runtime() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserverHolder)) ? next : Composer.Companion.getEmpty();
    }

    public final Object nextSlotForCache$runtime() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        if (this.reusing && !(next instanceof ReusableRememberObserverHolder)) {
            return Composer.Companion.getEmpty();
        }
        if (next instanceof RememberObserverHolder) {
            this.changeListWriter.updateRememberOrdering(LinkComposerKt.asLinkRememberObserverHolder((RememberObserverHolder) next), getReaderTable$runtime().getAddressSpace().anchorOfAddress(this.lastPlacedChildGroup));
        }
        return next;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public int parentKey$runtime() {
        if (getInserting()) {
            SlotTableBuilder slotTableBuilder = this.builder;
            return slotTableBuilder.groupKey(slotTableBuilder.getParentGroup());
        }
        SlotTableReader slotTableReader = this.reader;
        return slotTableReader.groupKey(slotTableReader.getParentGroup());
    }

    @Override // androidx.compose.runtime.InternalComposer
    public List<ComposeStackTraceFrame> parentStackTrace$runtime() {
        Integer findSubcompositionContextGroup;
        Composition composition$runtime = this.parentContext.getComposition$runtime();
        CompositionImpl compositionImpl = composition$runtime instanceof CompositionImpl ? (CompositionImpl) composition$runtime : null;
        if (compositionImpl == null || (findSubcompositionContextGroup = LinkComposerKt.findSubcompositionContextGroup(SlotTableKt.asLinkBufferSlotTable(compositionImpl.getSlotStorage$runtime()), this.parentContext)) == null) {
            return ut.d;
        }
        SlotTableReader openReader = SlotTableKt.asLinkBufferSlotTable(compositionImpl.getSlotStorage$runtime()).openReader();
        try {
            List<ComposeStackTraceFrame> traceForGroup = SlotTableReaderKt.traceForGroup(openReader, findSubcompositionContextGroup.intValue(), 0);
            openReader.close();
            return yi.A0(traceForGroup, compositionImpl.getComposer$runtime().parentStackTrace$runtime());
        } catch (Throwable th) {
            openReader.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void prepareCompose$runtime(iy iyVar) {
        if (isComposing$runtime()) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            iyVar.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    /* renamed from: recompose-aFTiNEg$runtime */
    public boolean mo3842recomposeaFTiNEg$runtime(fb0 fb0Var, ShouldPauseCallback shouldPauseCallback) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (ScopeMap.m3926getSizeimpl(fb0Var) <= 0 && !ScopeMap.m3929isNotEmptyimpl(this.invalidations) && ((this.slotTable.getRoot() < 0 || !requiresRecomposition(this.slotTable.getRoot())) && !this.forciblyRecompose)) {
            return false;
        }
        this.shouldPauseCallback = shouldPauseCallback;
        try {
            this.changeListWriter.startComposition();
            m3846doComposeaFTiNEg(fb0Var, null);
            this.shouldPauseCallback = null;
            if (ChangeListKt.asLinkBufferChangeList(this.changes).hasChangesRequiringApplication()) {
                return true;
            }
            if (!this.changes.isNotEmpty()) {
                return false;
            }
            executeChangesImmediatelyWithoutApplier();
            return false;
        } catch (Throwable th) {
            this.shouldPauseCallback = null;
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(iy iyVar) {
        this.changeListWriter.sideEffect(iyVar);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return unwrapRememberObserverHolder(nextSlotForCache$runtime());
    }

    @Override // androidx.compose.runtime.Composer
    public CancellationHandle scheduleFrameEndCallback(iy iyVar) {
        return this.parentContext.scheduleFrameEndCallback(iyVar);
    }

    public void setDeferredChanges$runtime(Changes changes) {
        this.deferredChanges = changes;
    }

    public final void setReader$runtime(SlotTableReader slotTableReader) {
        this.reader = slotTableReader;
    }

    public void setSourceMarkersEnabled$runtime(boolean z) {
        this.sourceMarkersEnabled = z;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean shouldExecute(boolean z, int i) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        if ((i & 1) == 0 && (getInserting() || this.reusing)) {
            ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
            if (shouldPauseCallback != null && (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) != null && shouldPauseCallback.shouldPause() && !currentRecomposeScope$runtime.getResuming()) {
                currentRecomposeScope$runtime.setUsed(true);
                currentRecomposeScope$runtime.setReusing(this.reusing);
                currentRecomposeScope$runtime.setPaused(true);
                this.changeListWriter.rememberPausingScope(currentRecomposeScope$runtime);
                this.parentContext.reportPausedScope$runtime(currentRecomposeScope$runtime);
                return false;
            }
        } else if (!z && getSkipping()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void skipCurrentGroup() {
        long rotateLeft;
        if (!requiresRecomposition(this.reader.getCurrentGroup())) {
            skipGroup();
            return;
        }
        SlotTableReader slotTableReader = this.reader;
        int groupKey = slotTableReader.getGroupKey();
        Object groupObjectKey = slotTableReader.getGroupObjectKey();
        Object groupAux = slotTableReader.getGroupAux();
        int i = this.rGroupIndex;
        if (groupObjectKey != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ (groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode()), 3);
        } else {
            if (groupAux != null && groupKey == 207 && !groupAux.equals(Composer.Companion.getEmpty())) {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupAux.hashCode(), 3) ^ i;
                startReaderGroup(slotTableReader.isNode(), null);
                recomposeToGroupEnd();
                slotTableReader.endGroup();
                if (groupObjectKey == null) {
                    if (groupObjectKey instanceof Enum) {
                        this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ ((Enum) groupObjectKey).ordinal(), 3);
                        return;
                    } else {
                        this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ groupObjectKey.hashCode(), 3);
                        return;
                    }
                }
                if (groupAux == null || groupKey != 207 || groupAux.equals(Composer.Companion.getEmpty())) {
                    this.compositeKeyHashCode = Long.rotateRight(groupKey ^ Long.rotateRight(getCompositeKeyHashCode() ^ i, 3), 3);
                    return;
                } else {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ i, 3) ^ groupAux.hashCode(), 3);
                    return;
                }
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupKey, 3) ^ i;
        }
        this.compositeKeyHashCode = rotateLeft;
        startReaderGroup(slotTableReader.isNode(), null);
        recomposeToGroupEnd();
        slotTableReader.endGroup();
        if (groupObjectKey == null) {
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            currentRecomposeScope$runtime.scopeSkipped();
        }
        if (this.reader.getCurrentGroup() < 0 || !requiresRecomposition(this.reader.getParentGroup())) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void sourceInformation(String str) {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.builder.recordGroupSourceInformation(str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void sourceInformationMarkerEnd() {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.builder.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void sourceInformationMarkerStart(int i, String str) {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.builder.recordGrouplessCallSourceInformationStart(i, str);
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public ComposeStackTrace stackTraceForValue$runtime(Object obj) {
        boolean sourceMarkersEnabled$runtime = getSourceMarkersEnabled$runtime();
        List list = ut.d;
        if (!sourceMarkersEnabled$runtime) {
            return new ComposeStackTrace(list, false);
        }
        ObjectLocation findLocation = SlotTableKt.findLocation(this.slotTable, new zy(obj, 7));
        if (findLocation != null) {
            list = yi.A0(stackTraceForGroup(findLocation.component1(), findLocation.component2()), parentStackTrace$runtime());
        }
        return new ComposeStackTrace(list, getSourceMarkersEnabled$runtime());
    }

    @Override // androidx.compose.runtime.InternalComposer
    public int stacksSize$runtime() {
        return Stack.m3865getSizeimpl(this.pendingStack) + Stack.m3865getSizeimpl(this.invalidateStack) + this.entersStack.tos + this.providersInvalidStack.tos + this.parentStateStack.tos;
    }

    @Override // androidx.compose.runtime.Composer
    public void startDefaults() {
        m3847startAzEfcrM(ComposerKt.defaultsKey, null, GroupKind.Companion.m3947getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startMovableGroup(int i, Object obj) {
        m3847startAzEfcrM(i, obj, GroupKind.Companion.m3947getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m3847startAzEfcrM(GapComposerKt.nodeKey, null, GroupKind.Companion.m3948getNode9udXigM(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProvider(ProvidedValue<?> providedValue) {
        ValueHolder<?> valueHolder;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        Object rememberedValue = rememberedValue();
        if (q10.b(rememberedValue, Composer.Companion.getEmpty())) {
            valueHolder = null;
        } else {
            rememberedValue.getClass();
            valueHolder = (ValueHolder) rememberedValue;
        }
        CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
        compositionLocal.getClass();
        ValueHolder<?> updatedStateOf$runtime = compositionLocal.updatedStateOf$runtime(providedValue, valueHolder);
        boolean b = q10.b(updatedStateOf$runtime, valueHolder);
        if (!b) {
            updateRememberedValue(updatedStateOf$runtime);
        }
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            if (providedValue.getCanOverride() || !CompositionLocalMapKt.contains(currentCompositionLocalScope, compositionLocal)) {
                currentCompositionLocalScope = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime);
            }
            this.builderHasAProvider = true;
        } else {
            SlotTableReader slotTableReader = this.reader;
            Object groupAux = slotTableReader.groupAux(slotTableReader.getCurrentGroup());
            groupAux.getClass();
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux;
            if (!(getSkipping() && b) && (providedValue.getCanOverride() || !CompositionLocalMapKt.contains(currentCompositionLocalScope, compositionLocal))) {
                currentCompositionLocalScope = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime);
            } else if ((b && !this.providersInvalid) || !this.providersInvalid) {
                currentCompositionLocalScope = persistentCompositionLocalMap;
            }
            if (!this.reusing && persistentCompositionLocalMap == currentCompositionLocalScope) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && !getInserting()) {
            recordProviderUpdate(currentCompositionLocalScope);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = LinkComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z2;
        this.providerCache = currentCompositionLocalScope;
        m3847startAzEfcrM(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3947getGroup9udXigM(), currentCompositionLocalScope);
    }

    @Override // androidx.compose.runtime.Composer
    public void startProviders(ProvidedValue<?>[] providedValueArr) {
        PersistentCompositionLocalMap updateProviderMapGroup;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(providedValueArr, currentCompositionLocalScope, null, 4, null));
            this.builderHasAProvider = true;
        } else {
            Object obj = this.reader.get(0);
            obj.getClass();
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) obj;
            Object obj2 = this.reader.get(1);
            obj2.getClass();
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) obj2;
            PersistentCompositionLocalMap updateCompositionMap = CompositionLocalMapKt.updateCompositionMap(providedValueArr, currentCompositionLocalScope, persistentCompositionLocalMap2);
            if (getSkipping() && !this.reusing && persistentCompositionLocalMap2.equals(updateCompositionMap)) {
                skipGroup();
                updateProviderMapGroup = persistentCompositionLocalMap;
            } else {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, updateCompositionMap);
                if (!this.reusing && q10.b(updateProviderMapGroup, persistentCompositionLocalMap)) {
                    z = false;
                }
                z2 = z;
            }
        }
        if (z2 && !getInserting()) {
            recordProviderUpdate(updateProviderMapGroup);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = LinkComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z2;
        this.providerCache = updateProviderMapGroup;
        m3847startAzEfcrM(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3947getGroup9udXigM(), updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceGroup(int i) {
        if (this.pending != null) {
            m3847startAzEfcrM(i, null, GroupKind.Companion.m3947getGroup9udXigM(), null);
            return;
        }
        validateNodeNotExpected();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i, 3) ^ this.rGroupIndex;
        this.rGroupIndex++;
        SlotTableReader slotTableReader = this.reader;
        if (getInserting()) {
            slotTableReader.beginEmpty();
            SlotTableBuilder slotTableBuilder = this.builder;
            Composer.Companion companion = Composer.Companion;
            Object empty = companion.getEmpty();
            slotTableBuilder.startNewGroup(i, empty == companion.getEmpty() ? 0 : 16777216, empty, null, null);
            enterGroup(false, null);
            return;
        }
        if (slotTableReader.getGroupKey() == i && !slotTableReader.getHasObjectKey()) {
            slotTableReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotTableReader.isGroupEnd()) {
            int i2 = this.nodeIndex;
            recordDelete();
            this.changeListWriter.removeNode(i2, slotTableReader.skipGroup());
        }
        slotTableReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureBuilder();
        SlotTableBuilder slotTableBuilder2 = this.builder;
        Composer.Companion companion2 = Composer.Companion;
        Object empty2 = companion2.getEmpty();
        slotTableBuilder2.startNewGroup(i, empty2 == companion2.getEmpty() ? 0 : 16777216, empty2, null, null);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceableGroup(int i) {
        m3847startAzEfcrM(i, null, GroupKind.Companion.m3947getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public Composer startRestartGroup(int i) {
        startReplaceGroup(i);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i, Object obj) {
        if (!getInserting() && this.reader.getGroupKey() == i && !q10.b(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m3847startAzEfcrM(i, null, GroupKind.Companion.m3947getGroup9udXigM(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m3847startAzEfcrM(GapComposerKt.nodeKey, null, GroupKind.Companion.m3949getReusableNode9udXigM(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void startReuseFromRoot$runtime() {
        this.reusingGroup = this.slotTable.getRoot();
        this.reusing = true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean tryImminentInvalidation$runtime(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int address;
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || (address = LinkAnchorKt.asLinkAnchor(anchor).getAddress()) < 0 || !isComposing$runtime() || !isGroupAfterCurrentReaderPosition(address & 4294967295L)) {
            return false;
        }
        this.reader.addFlag(address, GroupFlagsKt.IsRecompositionRequiredFlag);
        if (obj != null) {
            ScopeInvalidated scopeInvalidated = ScopeInvalidated.INSTANCE;
            if (!obj.equals(scopeInvalidated)) {
                boolean z = obj instanceof rl0;
                fb0 fb0Var = this.invalidations;
                if (z) {
                    ScopeMap.m3912addAllimpl(fb0Var, recomposeScopeImpl, (rl0) obj);
                    return true;
                }
                if (q10.b(ScopeMap.m3925getimpl(fb0Var, recomposeScopeImpl), scopeInvalidated)) {
                    return true;
                }
                ScopeMap.m3911addimpl(this.invalidations, recomposeScopeImpl, obj);
                return true;
            }
        }
        ScopeMap.m3935setimpl(this.invalidations, recomposeScopeImpl, ScopeInvalidated.INSTANCE);
        return true;
    }

    public final void updateCachedValue$runtime(Object obj) {
        if (obj instanceof RememberObserver) {
            LinkRememberObserverHolder linkRememberObserverHolder = new LinkRememberObserverHolder((RememberObserver) obj, getReaderTable$runtime().getAddressSpace().anchorOfAddress(this.lastPlacedChildGroup));
            if (getInserting()) {
                this.changeListWriter.remember(linkRememberObserverHolder);
            }
            this.abandonSet.add(obj);
            obj = linkRememberObserverHolder;
        }
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.InternalComposer
    /* renamed from: updateComposerInvalidations-RY85e9Y$runtime */
    public void mo3843updateComposerInvalidationsRY85e9Y$runtime(fb0 fb0Var) {
        int i;
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        obj.getClass();
                        Anchor anchor = ((RecomposeScopeImpl) obj).getAnchor();
                        LinkAnchor asLinkAnchor = anchor != null ? LinkAnchorKt.asLinkAnchor(anchor) : null;
                        if (asLinkAnchor != null && asLinkAnchor.getValid()) {
                            int address = asLinkAnchor.getAddress();
                            this.reader.addFlag(address, GroupFlagsKt.IsRecompositionRequiredFlag);
                            ScopeInvalidated scopeInvalidated = ScopeInvalidated.INSTANCE;
                            if (q10.b(obj2, scopeInvalidated)) {
                                ScopeMap.m3935setimpl(this.invalidations, obj, scopeInvalidated);
                                i = i3;
                            } else {
                                boolean z = obj2 instanceof gb0;
                                i = i3;
                                fb0 fb0Var2 = this.invalidations;
                                if (z) {
                                    ScopeMap.m3912addAllimpl(fb0Var2, obj, (rl0) obj2);
                                } else {
                                    ScopeMap.m3911addimpl(fb0Var2, obj, obj2);
                                }
                            }
                            this.reader.addFlag(address, GroupFlagsKt.IsRecompositionRequiredFlag);
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object obj) {
        updateCachedValue$runtime(obj);
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.builder.append(obj);
            return;
        }
        boolean hadNext = this.reader.getHadNext();
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        if (hadNext) {
            composerChangeListWriter.updateValue(this.reader.getParentCurrentSlotOffset() - 1, obj);
        } else {
            composerChangeListWriter.appendValue(obj);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object parentNode = this.reader.getParentNode();
        this.changeListWriter.moveDown(parentNode);
        if (this.reusing && (parentNode instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(parentNode);
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void verifyConsistent$runtime() {
        if (isComposing$runtime()) {
            return;
        }
        getInsertTable$runtime().verifyWellFormed();
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionImpl getComposition() {
        return this.composition;
    }

    private final void startGroup(int i, Object obj) {
        m3847startAzEfcrM(i, obj, GroupKind.Companion.m3947getGroup9udXigM(), null);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class CompositionContextHolder implements RememberObserver {
        public static final int $stable = 8;
        private final CompositionContextImpl ref;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    public static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    public static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(char c) {
        Object nextSlot$runtime = nextSlot$runtime();
        if ((nextSlot$runtime instanceof Character) && c == ((Character) nextSlot$runtime).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(byte b) {
        Object nextSlot$runtime = nextSlot$runtime();
        if ((nextSlot$runtime instanceof Byte) && b == ((Number) nextSlot$runtime).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(short s) {
        Object nextSlot$runtime = nextSlot$runtime();
        if ((nextSlot$runtime instanceof Short) && s == ((Number) nextSlot$runtime).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(boolean z) {
        Object nextSlot$runtime = nextSlot$runtime();
        if ((nextSlot$runtime instanceof Boolean) && z == ((Boolean) nextSlot$runtime).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(float f) {
        Object nextSlot$runtime = nextSlot$runtime();
        if ((nextSlot$runtime instanceof Float) && q10.a((Float) nextSlot$runtime, f)) {
            return false;
        }
        updateValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(Object obj) {
        if (q10.b(nextSlot$runtime(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(double d) {
        Object nextSlot$runtime = nextSlot$runtime();
        if ((nextSlot$runtime instanceof Double) && d == ((Double) nextSlot$runtime).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(int i) {
        Object nextSlot$runtime = nextSlot$runtime();
        if ((nextSlot$runtime instanceof Integer) && i == ((Number) nextSlot$runtime).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i));
        return true;
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParentGroup());
    }
}
