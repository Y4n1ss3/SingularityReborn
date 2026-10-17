package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.composer.GroupKind;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.GapAnchorKt;
import androidx.compose.runtime.composer.gapbuffer.KeyInfo;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeList;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeListKt;
import androidx.compose.runtime.composer.gapbuffer.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.FixupList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.runtime.tooling.ObjectLocation;
import defpackage.ac;
import defpackage.az;
import defpackage.bz;
import defpackage.cj;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.iy;
import defpackage.kn;
import defpackage.ky;
import defpackage.la0;
import defpackage.m50;
import defpackage.my;
import defpackage.na0;
import defpackage.p01;
import defpackage.q10;
import defpackage.rl0;
import defpackage.sl0;
import defpackage.st;
import defpackage.ud;
import defpackage.ut;
import defpackage.v4;
import defpackage.w01;
import defpackage.xe0;
import defpackage.y80;
import defpackage.yi;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GapComposer extends InternalComposer {
    public static final int $stable = 8;
    private CompositionData _compositionData;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final kn applyCoroutineContext;
    private final ComposerChangeListWriter changeListWriter;
    private Changes changes;
    private int childrenComposing;
    private long compositeKeyHashCode;
    private final CompositionImpl composition;
    private int compositionToken;
    private ChangeList deferredChanges;
    private final GapComposer$derivedStateObserver$1 derivedStateObserver;
    private final CompositionErrorContextImpl errorContext;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private GapAnchor insertAnchor;
    private FixupList insertFixups;
    private SlotTable insertTable;
    private boolean inserting;
    private final ArrayList<RecomposeScopeImpl> invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;
    private Changes lateChanges;
    private int[] nodeCountOverrides;
    private la0 nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parentContext;
    private boolean pausable;
    private GapPending pending;
    private PersistentCompositionLocalMap providerCache;
    private na0 providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;
    private SlotReader reader;
    private boolean reusing;
    private ShouldPauseCallback shouldPauseCallback;
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private final ArrayList<GapPending> pendingStack = Stack.m3862constructorimpl$default(null, 1, null);
    private final IntStack parentStateStack = new IntStack();
    private final List<Invalidation> invalidations = new ArrayList();
    private final IntStack entersStack = new IntStack();
    private PersistentCompositionLocalMap rootProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final gb0 composers;
        private final long compositeKeyHashCode;
        private final MutableState compositionLocalScope$delegate;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;

        public CompositionContextImpl(long j, boolean z, boolean z2, CompositionObserverHolder compositionObserverHolder) {
            this.compositeKeyHashCode = j;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = compositionObserverHolder;
            gb0 gb0Var = sl0.a;
            this.composers = new gb0();
            this.compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime(ControlledComposition controlledComposition, my myVar) {
            GapComposer.this.parentContext.composeInitial$runtime(controlledComposition, myVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public rl0 composeInitialPaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, my myVar) {
            return GapComposer.this.parentContext.composeInitialPaused$runtime(controlledComposition, shouldPauseCallback, myVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
            GapComposer.this.parentContext.deletedMovableContent$runtime(movableContentStateReference);
        }

        public final void dispose() {
            if (this.composers.c()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    gb0 gb0Var = this.composers;
                    Object[] objArr = gb0Var.b;
                    long[] jArr = gb0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        GapComposer gapComposer = (GapComposer) objArr[(i << 3) + i3];
                                        Iterator<Set<CompositionData>> it = set.iterator();
                                        while (it.hasNext()) {
                                            it.next().remove(gapComposer.getCompositionData());
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                this.composers.f();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime() {
            GapComposer.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime() {
            return GapComposer.this.parentContext.getCollectingCallByInformation$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime() {
            return this.collectingSourceInformation;
        }

        public final gb0 getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public long getCompositeKeyHashCode$runtime() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public Composition getComposition$runtime() {
            return GapComposer.this.getComposition();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public kn getEffectCoroutineContext() {
            return GapComposer.this.parentContext.getEffectCoroutineContext();
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
            return GapComposer.this.parentContext.getStackTraceEnabled$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
            GapComposer.this.parentContext.insertMovableContent$runtime(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime(ControlledComposition controlledComposition) {
            GapComposer.this.parentContext.invalidate$runtime(GapComposer.this.getComposition());
            GapComposer.this.parentContext.invalidate$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
            GapComposer.this.parentContext.invalidateScope$runtime(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier<?> applier) {
            GapComposer.this.parentContext.movableContentStateReleased$runtime(movableContentStateReference, movableContentState, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
            return GapComposer.this.parentContext.movableContentStateResolve$runtime(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public rl0 recomposePaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, rl0 rl0Var) {
            return GapComposer.this.parentContext.recomposePaused$runtime(controlledComposition, shouldPauseCallback, rl0Var);
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
            composer.getClass();
            super.registerComposer$runtime((GapComposer) composer);
            this.composers.d(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime(ControlledComposition controlledComposition) {
            GapComposer.this.parentContext.registerComposition$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
            GapComposer.this.parentContext.reportPausedScope$runtime(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime(ControlledComposition controlledComposition) {
            GapComposer.this.parentContext.reportRemovedComposition$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CancellationHandle scheduleFrameEndCallback(iy iyVar) {
            return GapComposer.this.parentContext.scheduleFrameEndCallback(iyVar);
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime() {
            GapComposer.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime(Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    composer.getClass();
                    set2.remove(((GapComposer) composer).getCompositionData());
                }
            }
            if (composer instanceof GapComposer) {
                this.composers.m(composer);
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime(ControlledComposition controlledComposition) {
            GapComposer.this.parentContext.unregisterComposition$runtime(controlledComposition);
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            setCompositionLocalScope(persistentCompositionLocalMap);
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.runtime.GapComposer$derivedStateObserver$1] */
    public GapComposer(Applier<?> applier, CompositionContext compositionContext, SlotTable slotTable, Set<RememberObserver> set, Changes changes, Changes changes2, CompositionObserverHolder compositionObserverHolder, CompositionImpl compositionImpl) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changes;
        this.lateChanges = changes2;
        this.observerHolder = compositionObserverHolder;
        this.composition = compositionImpl;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation$runtime() || compositionContext.getCollectingCallByInformation$runtime();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.GapComposer$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                GapComposer.this.childrenComposing--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                GapComposer.this.childrenComposing++;
            }
        };
        this.invalidateStack = Stack.m3862constructorimpl$default(null, 1, null);
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation$runtime()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close(true);
        this.writer = openWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, ChangeListKt.asGapBufferChangeList(this.changes));
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            GapAnchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
            this.errorContext = new CompositionErrorContextImpl(this);
            kn effectCoroutineContext = compositionContext.getEffectCoroutineContext();
            kn errorContext$runtime = getErrorContext$runtime();
            this.applyCoroutineContext = effectCoroutineContext.plus(errorContext$runtime == null ? st.d : errorContext$runtime);
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
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
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.writer.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addRecomposeScope() {
        Invalidation removeLocation;
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (getInserting()) {
            CompositionImpl composition = getComposition();
            composition.getClass();
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl(composition);
            Stack.m3872pushimpl(this.invalidateStack, recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            enterRecomposeScope(recomposeScopeImpl2);
            return;
        }
        removeLocation = GapComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        if (q10.b(next, Composer.Companion.getEmpty())) {
            CompositionImpl composition2 = getComposition();
            composition2.getClass();
            recomposeScopeImpl = new RecomposeScopeImpl(composition2);
            updateValue(recomposeScopeImpl);
        } else {
            next.getClass();
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        if (removeLocation == null) {
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
                this.reusingGroup = this.reader.getParent();
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
        this.changeListWriter.resetTransientState();
        Stack.m3860clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final long compositeKeyOf(int i, int i2, long j) {
        long rotateLeft;
        int i3 = 3;
        long j2 = 0;
        int i4 = 0;
        while (i >= 0) {
            if (i == i2) {
                rotateLeft = Long.rotateLeft(j, i4);
            } else {
                int groupCompositeKeyPart = groupCompositeKeyPart(this.reader, i);
                if (groupCompositeKeyPart == 126665345) {
                    rotateLeft = Long.rotateLeft(groupCompositeKeyPart, i4);
                } else {
                    j2 = (j2 ^ Long.rotateLeft(groupCompositeKeyPart, i3)) ^ Long.rotateLeft(this.reader.hasObjectKey(i) ? 0 : rGroupIndexOf(i), i4);
                    i3 = (i3 + 6) % 64;
                    i4 = (i4 + 6) % 64;
                    i = this.reader.parent(i);
                }
            }
            return rotateLeft ^ j2;
        }
        return j2;
    }

    private final void createFreshInsertTable() {
        if (!this.writer.getClosed()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        forceFreshInsertTable();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && q10.b(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    groupAux.getClass();
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getSize() > 0) {
            while (i > 0) {
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
                i = this.reader.parent(i);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.rootProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeStackTrace currentStackTrace() {
        if (!this.parentContext.getStackTraceEnabled$runtime()) {
            return null;
        }
        m50 o = y80.o();
        o.addAll(ComposeStackTraceBuilderKt.buildTrace$default(this.writer, null, 0, null, 7, null));
        o.addAll(ComposeStackTraceBuilderKt.buildTrace(this.reader));
        o.addAll(parentStackTrace$runtime());
        return new ComposeStackTrace(y80.d(o), getSourceMarkersEnabled$runtime());
    }

    /* renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m3839doComposeaFTiNEg(fb0 fb0Var, my myVar) {
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
                Object nextSlot = nextSlot();
                if (nextSlot != myVar && myVar != null) {
                    updateValue(myVar);
                }
                GapComposer$derivedStateObserver$1 gapComposer$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    derivedStateObservers.add(gapComposer$derivedStateObserver$1);
                    if (myVar != null) {
                        startGroup(ComposerKt.invocationKey, ComposerKt.getInvocation());
                        Expect_jvmKt.invokeComposable(this, myVar);
                        endGroup();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || nextSlot == null || nextSlot.equals(Composer.Companion.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        startGroup(ComposerKt.invocationKey, ComposerKt.getInvocation());
                        p01.f(2, nextSlot);
                        Expect_jvmKt.invokeComposable(this, (my) nextSlot);
                        endGroup();
                    }
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    endRoot();
                    if (current != null) {
                        current.onEndComposition(getComposition());
                    }
                    this.isComposing = false;
                    this.invalidations.clear();
                    createFreshInsertTable();
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

    private final void doRecordDownsFor(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i), i2);
        if (this.reader.isNode(i)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, i));
        }
    }

    private final void end(boolean z) {
        long rotateRight;
        long j;
        int remainingSlots;
        List<KeyInfo> list;
        List<KeyInfo> list2;
        long rotateRight2;
        long j2;
        int peek2 = this.parentStateStack.peek2() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int groupKey = this.writer.groupKey(parent);
            Object groupObjectKey = this.writer.groupObjectKey(parent);
            Object groupAux = this.writer.groupAux(parent);
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
            int parent2 = this.reader.getParent();
            int groupKey2 = this.reader.groupKey(parent2);
            Object groupObjectKey2 = this.reader.groupObjectKey(parent2);
            Object groupAux2 = this.reader.groupAux(parent2);
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
        GapPending gapPending = this.pending;
        if (gapPending != null && gapPending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = gapPending.getKeyInfos();
            List<KeyInfo> used = gapPending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            gb0 gb0Var = sl0.a;
            gb0 gb0Var2 = new gb0();
            int size = used.size();
            int size2 = keyInfos.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size2) {
                KeyInfo keyInfo = keyInfos.get(i2);
                if (fastToSet.contains(keyInfo)) {
                    list = keyInfos;
                    if (!gb0Var2.a(keyInfo)) {
                        if (i3 < size) {
                            KeyInfo keyInfo2 = used.get(i3);
                            if (keyInfo2 != keyInfo) {
                                int nodePositionOf = gapPending.nodePositionOf(keyInfo2);
                                gb0Var2.d(keyInfo2);
                                if (nodePositionOf != i4) {
                                    int updatedNodeCountOf = gapPending.updatedNodeCountOf(keyInfo2);
                                    list2 = used;
                                    this.changeListWriter.moveNode(gapPending.getStartIndex() + nodePositionOf, i4 + gapPending.getStartIndex(), updatedNodeCountOf);
                                    gapPending.registerMoveNode(nodePositionOf, i4, updatedNodeCountOf);
                                } else {
                                    list2 = used;
                                }
                            } else {
                                list2 = used;
                                i2++;
                            }
                            i3++;
                            i4 += gapPending.updatedNodeCountOf(keyInfo2);
                            keyInfos = list;
                            used = list2;
                        }
                        keyInfos = list;
                    }
                } else {
                    this.changeListWriter.removeNode(gapPending.nodePositionOf(keyInfo) + gapPending.getStartIndex(), keyInfo.getNodes());
                    gapPending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    list = keyInfos;
                    GapComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), this.reader.groupSize(keyInfo.getLocation()) + keyInfo.getLocation());
                }
                i2++;
                keyInfos = list;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (remainingSlots = this.reader.getRemainingSlots()) > 0) {
            this.changeListWriter.trimValues(remainingSlots);
        }
        int i5 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i5, this.reader.skipGroup());
            GapComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        if (inserting) {
            if (z) {
                this.insertFixups.endNodeInsert();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close(true);
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (z) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (z) {
                i = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
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
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        asBool = GapComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z, GapPending gapPending) {
        Stack.m3872pushimpl(this.pendingStack, this.pending);
        this.pending = gapPending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void enterRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        recomposeScopeImpl.start(this.compositionToken);
        CompositionObserver current = this.observerHolder.current();
        if (current != null) {
            current.onScopeEnter(recomposeScopeImpl);
        }
    }

    private final void exitGroup(int i, boolean z) {
        GapPending gapPending = (GapPending) Stack.m3871popimpl(this.pendingStack);
        if (gapPending != null && !z) {
            gapPending.setGroupIndex(gapPending.getGroupIndex() + 1);
        }
        this.pending = gapPending;
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

    private final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (getSourceMarkersEnabled$runtime()) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close(true);
        this.writer = openWriter;
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final int groupCompositeKeyPart(SlotReader slotReader, int i) {
        Object groupAux;
        if (!slotReader.hasObjectKey(i)) {
            int groupKey = slotReader.groupKey(i);
            return (groupKey != 207 || (groupAux = slotReader.groupAux(i)) == null || groupAux.equals(Composer.Companion.getEmpty())) ? groupKey : groupAux.hashCode();
        }
        Object groupObjectKey = slotReader.groupObjectKey(i);
        if (groupObjectKey != null) {
            return groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : groupObjectKey.hashCode();
        }
        return 0;
    }

    private final void insertMovableContentGuarded(List<xe0> list) {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        Anchor anchor$runtime;
        List<? extends Object> collectNodesFrom;
        SlotReader slotReader;
        SlotReader slotReader2;
        int[] iArr;
        na0 na0Var;
        ChangeList changeList3;
        ComposerChangeListWriter composerChangeListWriter3;
        ChangeList changeList4;
        ChangeList changeList5;
        int i;
        ControlledComposition composition$runtime;
        int i2;
        SlotStorage slotStorage$runtime;
        SlotReader slotReader3;
        GapComposer gapComposer = this;
        ComposerChangeListWriter composerChangeListWriter4 = gapComposer.changeListWriter;
        ChangeList asGapBufferChangeList = ChangeListKt.asGapBufferChangeList(gapComposer.lateChanges);
        ChangeList changeList6 = composerChangeListWriter4.getChangeList();
        try {
            composerChangeListWriter4.setChangeList(asGapBufferChangeList);
            gapComposer.changeListWriter.resetSlots();
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                try {
                    xe0 xe0Var = list.get(i4);
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) xe0Var.d;
                    MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) xe0Var.e;
                    GapAnchor asGapAnchor = GapAnchorKt.asGapAnchor(movableContentStateReference.getAnchor$runtime());
                    SlotTable asGapBufferSlotTable = SlotTableKt.asGapBufferSlotTable(movableContentStateReference.getSlotStorage$runtime());
                    int anchorIndex = asGapBufferSlotTable.anchorIndex(asGapAnchor);
                    IntRef intRef = new IntRef(i3, 1, null);
                    gapComposer.changeListWriter.determineMovableContentNodeIndex(intRef, asGapAnchor);
                    if (movableContentStateReference2 == null) {
                        if (asGapBufferSlotTable == gapComposer.insertTable) {
                            gapComposer.createFreshInsertTable();
                        }
                        SlotReader openReader = asGapBufferSlotTable.openReader();
                        try {
                            openReader.reposition(anchorIndex);
                            gapComposer.changeListWriter.moveReaderToAbsolute(anchorIndex);
                            ChangeList changeList7 = new ChangeList();
                            ud udVar = new ud(gapComposer, changeList7, openReader, movableContentStateReference, 2);
                            slotReader3 = openReader;
                            gapComposer = this;
                            try {
                                recomposeMovableContent$default(gapComposer, null, null, null, null, udVar, 15, null);
                                gapComposer.changeListWriter.includeOperationsIn(changeList7, intRef);
                                slotReader3.close();
                                composerChangeListWriter2 = composerChangeListWriter4;
                                changeList2 = changeList6;
                                i = size;
                                i2 = i4;
                            } catch (Throwable th) {
                                th = th;
                                slotReader3.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            slotReader3 = openReader;
                        }
                    } else {
                        MovableContentState movableContentStateResolve$runtime = gapComposer.parentContext.movableContentStateResolve$runtime(movableContentStateReference2);
                        SlotTable asGapBufferSlotTable2 = (movableContentStateResolve$runtime == null || (slotStorage$runtime = movableContentStateResolve$runtime.getSlotStorage$runtime()) == null) ? null : SlotTableKt.asGapBufferSlotTable(slotStorage$runtime);
                        SlotTable asGapBufferSlotTable3 = asGapBufferSlotTable2 == null ? SlotTableKt.asGapBufferSlotTable(movableContentStateReference2.getSlotStorage$runtime()) : asGapBufferSlotTable2;
                        if (asGapBufferSlotTable2 == null || (anchor$runtime = asGapBufferSlotTable2.anchor(i3)) == null) {
                            anchor$runtime = movableContentStateReference2.getAnchor$runtime();
                        }
                        GapAnchor asGapAnchor2 = GapAnchorKt.asGapAnchor(anchor$runtime);
                        collectNodesFrom = GapComposerKt.collectNodesFrom(asGapBufferSlotTable3, asGapAnchor2);
                        if (!collectNodesFrom.isEmpty()) {
                            gapComposer.changeListWriter.copyNodesToNewAnchorLocation(collectNodesFrom, intRef);
                            SlotTable slotTable = gapComposer.slotTable;
                            if (asGapBufferSlotTable == slotTable) {
                                int anchorIndex2 = slotTable.anchorIndex(asGapAnchor);
                                gapComposer.updateNodeCount(anchorIndex2, gapComposer.updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                            }
                        }
                        gapComposer.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime, gapComposer.parentContext, movableContentStateReference2, movableContentStateReference);
                        SlotReader openReader2 = asGapBufferSlotTable3.openReader();
                        try {
                            SlotReader slotReader4 = gapComposer.reader;
                            int[] iArr2 = gapComposer.nodeCountOverrides;
                            na0 na0Var2 = gapComposer.providerUpdates;
                            gapComposer.nodeCountOverrides = null;
                            gapComposer.providerUpdates = null;
                            try {
                                gapComposer.reader = openReader2;
                                int anchorIndex3 = asGapBufferSlotTable3.anchorIndex(GapAnchorKt.asGapAnchor(asGapAnchor2));
                                openReader2.reposition(anchorIndex3);
                                gapComposer.changeListWriter.moveReaderToAbsolute(anchorIndex3);
                                changeList3 = new ChangeList();
                                composerChangeListWriter3 = gapComposer.changeListWriter;
                                changeList4 = composerChangeListWriter3.getChangeList();
                            } catch (Throwable th3) {
                                th = th3;
                                slotReader2 = slotReader4;
                                iArr = iArr2;
                                slotReader = openReader2;
                                na0Var = na0Var2;
                            }
                            try {
                                composerChangeListWriter3.setChangeList(changeList3);
                                i = size;
                                ComposerChangeListWriter composerChangeListWriter5 = gapComposer.changeListWriter;
                                slotReader = openReader2;
                                try {
                                    boolean implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                    try {
                                        composerChangeListWriter5.setImplicitRootStart(false);
                                        try {
                                            composition$runtime = movableContentStateReference2.getComposition$runtime();
                                        } catch (Throwable th4) {
                                            th = th4;
                                            iArr = iArr2;
                                            slotReader2 = slotReader4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        slotReader2 = slotReader4;
                                        iArr = iArr2;
                                        na0Var = na0Var2;
                                    }
                                    try {
                                        ControlledComposition composition$runtime2 = movableContentStateReference.getComposition$runtime();
                                        Integer valueOf = Integer.valueOf(slotReader.getCurrentGroup());
                                        List<xe0> invalidations$runtime = movableContentStateReference2.getInvalidations$runtime();
                                        try {
                                            ComposerChangeListWriter composerChangeListWriter6 = composerChangeListWriter4;
                                            na0Var = na0Var2;
                                            composerChangeListWriter2 = composerChangeListWriter6;
                                            i2 = i4;
                                            slotReader2 = slotReader4;
                                            iArr = iArr2;
                                            changeList2 = changeList6;
                                            changeList5 = changeList4;
                                            try {
                                                gapComposer.recomposeMovableContent(composition$runtime, composition$runtime2, valueOf, invalidations$runtime, new v4(17, gapComposer, movableContentStateReference));
                                                try {
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    try {
                                                        composerChangeListWriter3.setChangeList(changeList5);
                                                        gapComposer.changeListWriter.includeOperationsIn(changeList3, intRef);
                                                        try {
                                                            gapComposer.reader = slotReader2;
                                                            gapComposer.nodeCountOverrides = iArr;
                                                            gapComposer.providerUpdates = na0Var;
                                                            try {
                                                                slotReader.close();
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                composerChangeListWriter = composerChangeListWriter2;
                                                                changeList = changeList2;
                                                                composerChangeListWriter.setChangeList(changeList);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            slotReader.close();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        gapComposer.reader = slotReader2;
                                                        gapComposer.nodeCountOverrides = iArr;
                                                        gapComposer.providerUpdates = na0Var;
                                                        throw th;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    composerChangeListWriter3.setChangeList(changeList5);
                                                    throw th;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                throw th;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            slotReader2 = slotReader4;
                                            iArr = iArr2;
                                            na0Var = na0Var2;
                                            changeList5 = changeList4;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        slotReader2 = slotReader4;
                                        iArr = iArr2;
                                        na0Var = na0Var2;
                                        changeList5 = changeList4;
                                        composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                        throw th;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    slotReader2 = slotReader4;
                                    iArr = iArr2;
                                    na0Var = na0Var2;
                                    changeList5 = changeList4;
                                    composerChangeListWriter3.setChangeList(changeList5);
                                    throw th;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                slotReader2 = slotReader4;
                                iArr = iArr2;
                                slotReader = openReader2;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            slotReader = openReader2;
                        }
                    }
                    gapComposer.changeListWriter.skipToEndOfCurrentGroup();
                    i4 = i2 + 1;
                    size = i;
                    composerChangeListWriter4 = composerChangeListWriter2;
                    changeList6 = changeList2;
                    i3 = 0;
                } catch (Throwable th16) {
                    th = th16;
                    composerChangeListWriter2 = composerChangeListWriter4;
                    changeList2 = changeList6;
                }
            }
            ComposerChangeListWriter composerChangeListWriter7 = composerChangeListWriter4;
            ChangeList changeList8 = changeList6;
            gapComposer.changeListWriter.endMovableContentPlacement();
            gapComposer.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter7.setChangeList(changeList8);
        } catch (Throwable th17) {
            th = th17;
            composerChangeListWriter = composerChangeListWriter4;
            changeList = changeList6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 insertMovableContentGuarded$lambda$0$0$0$0(GapComposer gapComposer, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        ComposerChangeListWriter composerChangeListWriter = gapComposer.changeListWriter;
        ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            SlotReader slotReader2 = gapComposer.reader;
            int[] iArr = gapComposer.nodeCountOverrides;
            na0 na0Var = gapComposer.providerUpdates;
            gapComposer.nodeCountOverrides = null;
            gapComposer.providerUpdates = null;
            try {
                gapComposer.reader = slotReader;
                ComposerChangeListWriter composerChangeListWriter2 = gapComposer.changeListWriter;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    gapComposer.invokeMovableContentLambda(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals$runtime(), movableContentStateReference.getParameter$runtime(), true);
                    composerChangeListWriter.setChangeList(changeList2);
                    return w01.a;
                } finally {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                }
            } finally {
                gapComposer.reader = slotReader2;
                gapComposer.nodeCountOverrides = iArr;
                gapComposer.providerUpdates = na0Var;
            }
        } catch (Throwable th) {
            composerChangeListWriter.setChangeList(changeList2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 insertMovableContentGuarded$lambda$0$0$1$0$0$0$0(GapComposer gapComposer, MovableContentStateReference movableContentStateReference) {
        gapComposer.invokeMovableContentLambda(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals$runtime(), movableContentStateReference.getParameter$runtime(), true);
        return w01.a;
    }

    private final int insertedGroupVirtualIndex(int i) {
        return (-2) - i;
    }

    private final void invokeMovableContentLambda(MovableContent<Object> movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, Object obj, boolean z) {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        updateSlot(obj);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i = 0;
        try {
            this.compositeKeyHashCode = 126665345L;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            boolean z2 = (getInserting() || q10.b(this.reader.getGroupAux(), persistentCompositionLocalMap)) ? false : true;
            if (z2) {
                recordProviderUpdate(persistentCompositionLocalMap);
            }
            m3840startAzEfcrM(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3947getGroup9udXigM(), persistentCompositionLocalMap);
            this.providerCache = null;
            if (!getInserting() || z) {
                boolean z3 = this.providersInvalid;
                this.providersInvalid = z2;
                Expect_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(-59194059, true, new az(movableContent, obj, i)));
                this.providersInvalid = z3;
            } else {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime(new MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), ut.d, currentCompositionLocalScope(), null));
            }
        } catch (Throwable th) {
            try {
                throw ComposeStackTraceKt.attachComposeStackTrace(th, new bz(this, i));
            } finally {
                endGroup();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                endMovableGroup();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeMovableContentLambda$lambda$0(MovableContent movableContent, Object obj, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-59194059, i, -1, "androidx.compose.runtime.GapComposer.invokeMovableContentLambda.<anonymous> (GapComposer.kt:2265)");
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

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final int nodeIndexOf(int i, int i2, int i3, int i4) {
        int parent = this.reader.parent(i2);
        while (parent != i3 && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            i4 = 0;
        }
        if (parent == i2) {
            return i4;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(i2)) + i4;
        loop1: while (i4 < updatedNodeCount && parent != i) {
            parent++;
            while (parent < i) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (i >= groupSize) {
                    i4 += this.reader.isNode(parent) ? 1 : updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return i4;
    }

    private final int rGroupIndexOf(int i) {
        int parent = this.reader.parent(i) + 1;
        int i2 = 0;
        while (parent < i) {
            if (!this.reader.hasObjectKey(parent)) {
                i2++;
            }
            parent += this.reader.groupSize(parent);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r7 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <R> R recomposeMovableContent(ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List<? extends xe0> list, iy iyVar) {
        R r;
        boolean isComposing$runtime = isComposing$runtime();
        int i = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                xe0 xe0Var = list.get(i2);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) xe0Var.d;
                Object obj = xe0Var.e;
                if (obj != null) {
                    tryImminentInvalidation$runtime(recomposeScopeImpl, obj);
                } else {
                    tryImminentInvalidation$runtime(recomposeScopeImpl, null);
                }
            }
            if (controlledComposition != null) {
                r = (R) controlledComposition.delegateInvalidations(controlledComposition2, num != null ? num.intValue() : -1, iyVar);
            }
            r = (R) iyVar.invoke();
            this.isComposing = isComposing$runtime;
            this.nodeIndex = i;
            return r;
        } catch (Throwable th) {
            this.isComposing = isComposing$runtime;
            this.nodeIndex = i;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object recomposeMovableContent$default(GapComposer gapComposer, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            controlledComposition = null;
        }
        if ((i & 2) != 0) {
            controlledComposition2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list = ut.d;
        }
        return gapComposer.recomposeMovableContent(controlledComposition, controlledComposition2, num, list, iyVar);
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean isComposing$runtime = isComposing$runtime();
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i2 = this.groupNodeCount;
        int i3 = this.rGroupIndex;
        firstInRange = GapComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z = false;
        int i4 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            RecomposeScopeImpl scope = firstInRange.getScope();
            GapComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i4, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.rGroupIndex = rGroupIndexOf(currentGroup);
                this.compositeKeyHashCode = compositeKeyOf(this.reader.parent(currentGroup), parent, compositeKeyHashCode);
                this.providerCache = null;
                scope.compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                z = true;
                i4 = currentGroup;
            } else {
                Stack.m3872pushimpl(this.invalidateStack, scope);
                CompositionObserver current = this.observerHolder.current();
                if (current != null) {
                    try {
                        current.onScopeEnter(scope);
                        scope.rereadTrackedInstances();
                    } finally {
                        current.onScopeExit(scope);
                    }
                } else {
                    scope.rereadTrackedInstances();
                }
                Stack.m3871popimpl(this.invalidateStack);
            }
            firstInRange = GapComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z) {
            recordUpsAndDowns(i4, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + updatedNodeCount;
            this.groupNodeCount = i2 + updatedNodeCount;
            this.rGroupIndex = i3;
        } else {
            skipReaderToGroupEnd();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = isComposing$runtime;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private final void recordInsert(GapAnchor gapAnchor) {
        boolean isEmpty = this.insertFixups.isEmpty();
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        if (isEmpty) {
            composerChangeListWriter.insertSlots(gapAnchor, this.insertTable);
        } else {
            composerChangeListWriter.insertSlots(gapAnchor, this.insertTable, this.insertFixups);
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

    private final void recordUpsAndDowns(int i, int i2, int i3) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = GapComposerKt.nearestCommonRootOf(slotReader, i, i2, i3);
        while (i > 0 && i != nearestCommonRootOf) {
            if (slotReader.isNode(i)) {
                this.changeListWriter.moveUp();
            }
            i = slotReader.parent(i);
        }
        doRecordDownsFor(i2, nearestCommonRootOf);
    }

    private final int rememberObserverGroupIndex() {
        return this.rGroupIndex - 1;
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            getComposition().updateMovingInvalidations$runtime();
            ChangeList changeList = new ChangeList();
            setDeferredChanges$runtime(changeList);
            SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                } finally {
                    composerChangeListWriter.setChangeList(changeList2);
                }
            } finally {
                openReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int i) {
        boolean isNode = this.reader.isNode(i);
        if (isNode) {
            this.changeListWriter.endNodeMovement();
            this.changeListWriter.moveDown(this.reader.node(i));
        }
        reportFreeMovableContent$reportGroup(this, i, i, isNode, 0);
        this.changeListWriter.endNodeMovement();
        if (isNode) {
            this.changeListWriter.moveUp();
        }
    }

    private static final MovableContentStateReference reportFreeMovableContent$createMovableContentReferenceForGroup(GapComposer gapComposer, int i, List<MovableContentStateReference> list) {
        Object groupObjectKey = gapComposer.reader.groupObjectKey(i);
        groupObjectKey.getClass();
        MovableContent movableContent = (MovableContent) groupObjectKey;
        Object groupGet = gapComposer.reader.groupGet(i, 0);
        GapAnchor anchor = gapComposer.reader.anchor(i);
        int groupSize = gapComposer.reader.groupSize(i) + i;
        ArrayList arrayList = new ArrayList();
        List<Invalidation> list2 = gapComposer.invalidations;
        for (int findInsertLocation = GapComposerKt.findInsertLocation(list2, i); findInsertLocation < list2.size(); findInsertLocation++) {
            Invalidation invalidation = list2.get(findInsertLocation);
            if (invalidation.getLocation() >= groupSize) {
                break;
            }
            arrayList.add(new xe0(invalidation.getScope(), invalidation.getInstances()));
        }
        return new MovableContentStateReference(movableContent, groupGet, gapComposer.getComposition(), gapComposer.slotTable, anchor, arrayList, gapComposer.currentCompositionLocalScope(i), list);
    }

    private static final MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor(GapComposer gapComposer, int i) {
        int groupKey = gapComposer.reader.groupKey(i);
        Object groupObjectKey = gapComposer.reader.groupObjectKey(i);
        ArrayList arrayList = null;
        if (groupKey != 126665345 || !(groupObjectKey instanceof MovableContent)) {
            return null;
        }
        if (gapComposer.reader.containsMark(i)) {
            ArrayList arrayList2 = new ArrayList();
            reportFreeMovableContent$movableContentReferenceFor$traverseGroups(gapComposer, arrayList2, i);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return reportFreeMovableContent$createMovableContentReferenceForGroup(gapComposer, i, arrayList);
    }

    private static final void reportFreeMovableContent$movableContentReferenceFor$traverseGroups(GapComposer gapComposer, List<MovableContentStateReference> list, int i) {
        int groupSize = gapComposer.reader.groupSize(i) + i;
        int i2 = i + 1;
        while (i2 < groupSize) {
            if (gapComposer.reader.hasMark(i2)) {
                MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(gapComposer, i2);
                if (reportFreeMovableContent$movableContentReferenceFor != null) {
                    list.add(reportFreeMovableContent$movableContentReferenceFor);
                }
            } else if (gapComposer.reader.containsMark(i2)) {
                reportFreeMovableContent$movableContentReferenceFor$traverseGroups(gapComposer, list, i2);
            }
            i2 += gapComposer.reader.groupSize(i2);
        }
    }

    private static final int reportFreeMovableContent$reportGroup(GapComposer gapComposer, int i, int i2, boolean z, int i3) {
        SlotReader slotReader = gapComposer.reader;
        if (!slotReader.hasMark(i2)) {
            if (!slotReader.containsMark(i2)) {
                if (slotReader.isNode(i2)) {
                    return 1;
                }
                return slotReader.nodeCount(i2);
            }
            int groupSize = slotReader.groupSize(i2) + i2;
            int i4 = 0;
            for (int i5 = i2 + 1; i5 < groupSize; i5 += slotReader.groupSize(i5)) {
                boolean isNode = slotReader.isNode(i5);
                if (isNode) {
                    gapComposer.changeListWriter.endNodeMovement();
                    gapComposer.changeListWriter.moveDown(slotReader.node(i5));
                }
                i4 += reportFreeMovableContent$reportGroup(gapComposer, i, i5, isNode || z, isNode ? 0 : i3 + i4);
                if (isNode) {
                    gapComposer.changeListWriter.endNodeMovement();
                    gapComposer.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return i4;
        }
        int groupKey = slotReader.groupKey(i2);
        Object groupObjectKey = slotReader.groupObjectKey(i2);
        if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
            MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(gapComposer, i2);
            if (reportFreeMovableContent$movableContentReferenceFor != null) {
                gapComposer.parentContext.deletedMovableContent$runtime(reportFreeMovableContent$movableContentReferenceFor);
                gapComposer.changeListWriter.recordSlotEditing();
                gapComposer.changeListWriter.releaseMovableGroupAtCurrent(gapComposer.getComposition(), gapComposer.parentContext, reportFreeMovableContent$movableContentReferenceFor);
            }
            if (!z || i2 == i) {
                return slotReader.nodeCount(i2);
            }
            gapComposer.changeListWriter.endNodeMovementAndDeleteNode(i3, i2);
            return 0;
        }
        if (groupKey != 206 || !q10.b(groupObjectKey, ComposerKt.getReference())) {
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return slotReader.nodeCount(i2);
        }
        Object groupGet = slotReader.groupGet(i2, 0);
        RememberObserverHolder rememberObserverHolder = groupGet instanceof RememberObserverHolder ? (RememberObserverHolder) groupGet : null;
        Object wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
        CompositionContextHolder compositionContextHolder = wrapped instanceof CompositionContextHolder ? (CompositionContextHolder) wrapped : null;
        if (compositionContextHolder != null) {
            gb0 composers = compositionContextHolder.getRef().getComposers();
            Object[] objArr = composers.b;
            long[] jArr = composers.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j = jArr[i6];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((255 & j) < 128) {
                                GapComposer gapComposer2 = (GapComposer) objArr[(i6 << 3) + i8];
                                gapComposer2.reportAllMovableContent();
                                gapComposer.parentContext.reportRemovedComposition$runtime(gapComposer2.getComposition());
                            }
                            j >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                }
            }
        }
        return slotReader.nodeCount(i2);
    }

    private final void skipGroup() {
        this.groupNodeCount = this.reader.skipGroup() + this.groupNodeCount;
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    private final List<ComposeStackTraceFrame> stackTraceForGroup(int i, Integer num) {
        SlotReader openReader = this.slotTable.openReader();
        try {
            return ComposeStackTraceBuilderKt.traceForGroup(openReader, i, num);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007d  */
    /* renamed from: start-AzEfcrM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m3840startAzEfcrM(int i, Object obj, int i2, Object obj2) {
        long rotateLeft;
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
                GapPending gapPending = null;
                if (!getInserting()) {
                    this.reader.beginEmpty();
                    int currentGroup = this.writer.getCurrentGroup();
                    if (z) {
                        this.writer.startNode(i, Composer.Companion.getEmpty());
                    } else {
                        SlotWriter slotWriter = this.writer;
                        if (obj2 != null) {
                            if (obj == null) {
                                obj = Composer.Companion.getEmpty();
                            }
                            slotWriter.startData(i, obj, obj2);
                        } else {
                            if (obj == null) {
                                obj = Composer.Companion.getEmpty();
                            }
                            slotWriter.startGroup(i, obj);
                        }
                    }
                    GapPending gapPending2 = this.pending;
                    if (gapPending2 != null) {
                        KeyInfo keyInfo = new KeyInfo(i, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                        gapPending2.registerInsert(keyInfo, this.nodeIndex - gapPending2.getStartIndex());
                        gapPending2.recordUsed(keyInfo);
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
                        this.pending = new GapPending(this.reader.extractKeys(), this.nodeIndex);
                    }
                }
                GapPending gapPending3 = this.pending;
                if (gapPending3 != null) {
                    KeyInfo next = gapPending3.getNext(i, obj);
                    if (z2 || next == null) {
                        this.reader.beginEmpty();
                        this.inserting = true;
                        this.providerCache = null;
                        ensureWriter();
                        this.writer.beginInsert();
                        int currentGroup2 = this.writer.getCurrentGroup();
                        if (z) {
                            this.writer.startNode(i, Composer.Companion.getEmpty());
                        } else {
                            SlotWriter slotWriter2 = this.writer;
                            if (obj2 != null) {
                                if (obj == null) {
                                    obj = Composer.Companion.getEmpty();
                                }
                                slotWriter2.startData(i, obj, obj2);
                            } else {
                                if (obj == null) {
                                    obj = Composer.Companion.getEmpty();
                                }
                                slotWriter2.startGroup(i, obj);
                            }
                        }
                        this.insertAnchor = this.writer.anchor(currentGroup2);
                        KeyInfo keyInfo2 = new KeyInfo(i, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                        gapPending3.registerInsert(keyInfo2, this.nodeIndex - gapPending3.getStartIndex());
                        gapPending3.recordUsed(keyInfo2);
                        gapPending = new GapPending(new ArrayList(), z ? 0 : this.nodeIndex);
                    } else {
                        gapPending3.recordUsed(next);
                        int location = next.getLocation();
                        this.nodeIndex = gapPending3.nodePositionOf(next) + gapPending3.getStartIndex();
                        int slotPositionOf = gapPending3.slotPositionOf(next);
                        int groupIndex = slotPositionOf - gapPending3.getGroupIndex();
                        gapPending3.registerMoveSlot(slotPositionOf, gapPending3.getGroupIndex());
                        this.changeListWriter.moveReaderRelativeTo(location);
                        this.reader.reposition(location);
                        if (groupIndex > 0) {
                            this.changeListWriter.moveCurrentGroup(groupIndex);
                        }
                        startReaderGroup(z, obj2);
                    }
                }
                enterGroup(z, gapPending);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i, 3) ^ i3;
        }
        this.compositeKeyHashCode = rotateLeft;
        if (obj == null) {
        }
        GroupKind.Companion companion2 = GroupKind.Companion;
        if (i2 == companion2.m3947getGroup9udXigM()) {
        }
        GapPending gapPending4 = null;
        if (!getInserting()) {
        }
    }

    private final void startGroup(int i) {
        m3840startAzEfcrM(i, null, GroupKind.Companion.m3947getGroup9udXigM(), null);
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
        startGroup(100);
        this.parentContext.startComposing$runtime();
        PersistentCompositionLocalMap compositionLocalScope$runtime = this.parentContext.getCompositionLocalScope$runtime();
        IntStack intStack = this.providersInvalidStack;
        asInt = GapComposerKt.asInt(this.providersInvalid);
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
        startGroup(Long.hashCode(this.parentContext.getCompositeKeyHashCode$runtime()));
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

    private final void updateNodeCount(int i, int i2) {
        if (updatedNodeCount(i) != i2) {
            if (i < 0) {
                la0 la0Var = this.nodeCountVirtualOverrides;
                if (la0Var == null) {
                    la0Var = new la0();
                    this.nodeCountVirtualOverrides = la0Var;
                }
                la0Var.g(i, i2);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getSize()];
                ac.Y(iArr, -1, 0, 6);
                this.nodeCountOverrides = iArr;
            }
            iArr[i] = i2;
        }
    }

    private final void updateNodeCountOverrides(int i, int i2) {
        int updatedNodeCount = updatedNodeCount(i);
        if (updatedNodeCount != i2) {
            int i3 = i2 - updatedNodeCount;
            int m3865getSizeimpl = Stack.m3865getSizeimpl(this.pendingStack) - 1;
            while (i != -1) {
                int updatedNodeCount2 = updatedNodeCount(i) + i3;
                updateNodeCount(i, updatedNodeCount2);
                int i4 = m3865getSizeimpl;
                while (true) {
                    if (-1 < i4) {
                        GapPending gapPending = (GapPending) Stack.m3870peekimpl(this.pendingStack, i4);
                        if (gapPending != null && gapPending.updateNodeCount(i, updatedNodeCount2)) {
                            m3865getSizeimpl = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                SlotReader slotReader = this.reader;
                if (i < 0) {
                    i = slotReader.getParent();
                } else if (slotReader.isNode(i)) {
                    return;
                } else {
                    i = this.reader.parent(i);
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
        nextSlot();
        updateValue(obj);
    }

    private final int updatedNodeCount(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.reader.nodeCount(i) : i2;
        }
        la0 la0Var = this.nodeCountVirtualOverrides;
        if (la0Var == null || la0Var.c(i) < 0) {
            return 0;
        }
        return la0Var.d(i);
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

    private final <R> R withReader(SlotReader slotReader, iy iyVar) {
        SlotReader slotReader2 = this.reader;
        int[] iArr = this.nodeCountOverrides;
        na0 na0Var = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            this.reader = slotReader;
            return (R) iyVar.invoke();
        } finally {
            this.reader = slotReader2;
            this.nodeCountOverrides = iArr;
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
        GapComposer gapComposer;
        startGroup(ComposerKt.referenceKey, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object nextSlot = nextSlot();
        RememberObserverHolder rememberObserverHolder = nextSlot instanceof RememberObserverHolder ? (RememberObserverHolder) nextSlot : null;
        if (rememberObserverHolder == null) {
            gapComposer = this;
            rememberObserverHolder = new ReusableGapRememberObserverHolder(new CompositionContextHolder(gapComposer.new CompositionContextImpl(getCompositeKeyHashCode(), this.forceRecomposeScopes, getSourceMarkersEnabled$runtime(), getComposition().getObserverHolder$runtime())), -1);
            gapComposer.updateValue(rememberObserverHolder);
        } else {
            gapComposer = this;
        }
        RememberObserver wrapped = rememberObserverHolder.getWrapped();
        wrapped.getClass();
        CompositionContextHolder compositionContextHolder = (CompositionContextHolder) wrapped;
        compositionContextHolder.getRef().updateCompositionLocalScope(gapComposer.currentCompositionLocalScope());
        gapComposer.endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z, iy iyVar) {
        T t = (T) nextSlotForCache();
        if (t != Composer.Companion.getEmpty() && !z) {
            return t;
        }
        T t2 = (T) iyVar.invoke();
        updateCachedValue(t2);
        return t2;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Float) && f == ((Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(Object obj) {
        if (nextSlot() == obj) {
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
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    @Override // androidx.compose.runtime.InternalComposer
    /* renamed from: composeContent--ZbOJvo$runtime, reason: not valid java name */
    public void mo3841composeContentZbOJvo$runtime(fb0 fb0Var, my myVar, ShouldPauseCallback shouldPauseCallback) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPauseCallback;
        try {
            m3839doComposeaFTiNEg(fb0Var, myVar);
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
        SlotWriter slotWriter = this.writer;
        GapAnchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(iyVar, peek, anchor);
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void deactivate$runtime() {
        Stack.m3860clearimpl(this.invalidateStack);
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!z) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.changeListWriter.deactivateCurrentGroup();
        GapComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
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
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime(this);
            deactivate$runtime();
            getApplier().clear();
            this.isDisposed = true;
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime == null || !currentRecomposeScope$runtime.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
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
        asBool = GapComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = GapComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        GapAnchor anchor;
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
                if (recomposeScopeImpl2.getResetReusing()) {
                    recomposeScopeImpl2.setResetReusing(false);
                    if (this.reusingGroup == this.reader.getParent()) {
                        this.reusing = false;
                        this.reusingGroup = -1;
                    }
                }
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime() && (recomposeScopeImpl2.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl2.setAnchor(anchor);
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void endReuseFromRoot$runtime() {
        if (!(!isComposing$runtime() && this.reusingGroup == 0)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i) {
        if (i < 0) {
            int i2 = -i;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i2) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= i) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
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
        GapCompositionDataImpl gapCompositionDataImpl = new GapCompositionDataImpl(getComposition());
        this._compositionData = gapCompositionDataImpl;
        return gapCompositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
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
    public CompositionErrorContextImpl getErrorContext$runtime() {
        if (this.parentContext.getStackTraceEnabled$runtime()) {
            return this.errorContext;
        }
        return null;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean getHasPendingChanges$runtime() {
        return this.changes.isNotEmpty();
    }

    public final SlotTable getInsertTable$runtime() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    public final SlotReader getReader$runtime() {
        return this.reader;
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
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:insertMovableContent");
        try {
            try {
                insertMovableContentGuarded(list);
                cleanUpCompose();
                trace.endSection(beginSection);
            } catch (Throwable th) {
                abortRoot();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(beginSection);
            throw th2;
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
    @ComposeCompilerApi
    public Object joinKey(Object obj, Object obj2) {
        Object key;
        key = GapComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserverHolder)) ? next : Composer.Companion.getEmpty();
    }

    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserverHolder)) ? next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next : Composer.Companion.getEmpty();
    }

    @Override // androidx.compose.runtime.InternalComposer
    public int parentKey$runtime() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    @Override // androidx.compose.runtime.InternalComposer
    public List<ComposeStackTraceFrame> parentStackTrace$runtime() {
        Integer findSubcompositionContextGroup;
        Composition composition$runtime = this.parentContext.getComposition$runtime();
        CompositionImpl compositionImpl = composition$runtime instanceof CompositionImpl ? (CompositionImpl) composition$runtime : null;
        if (compositionImpl == null || (findSubcompositionContextGroup = ComposeStackTraceBuilderKt.findSubcompositionContextGroup(SlotTableKt.asGapBufferSlotTable(compositionImpl.getSlotStorage$runtime()), this.parentContext)) == null) {
            return ut.d;
        }
        SlotReader openReader = SlotTableKt.asGapBufferSlotTable(compositionImpl.getSlotStorage$runtime()).openReader();
        try {
            List<ComposeStackTraceFrame> traceForGroup = ComposeStackTraceBuilderKt.traceForGroup(openReader, findSubcompositionContextGroup.intValue(), 0);
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
    /* renamed from: recompose-aFTiNEg$runtime, reason: not valid java name */
    public boolean mo3842recomposeaFTiNEg$runtime(fb0 fb0Var, ShouldPauseCallback shouldPauseCallback) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (ScopeMap.m3926getSizeimpl(fb0Var) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPauseCallback;
        try {
            m3839doComposeaFTiNEg(fb0Var, null);
            this.shouldPauseCallback = null;
            return this.changes.isNotEmpty();
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
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public CancellationHandle scheduleFrameEndCallback(iy iyVar) {
        return this.parentContext.scheduleFrameEndCallback(iyVar);
    }

    public void setDeferredChanges$runtime(ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final void setInsertTable$runtime(SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    public final void setReader$runtime(SlotReader slotReader) {
        this.reader = slotReader;
    }

    public void setSourceMarkersEnabled$runtime(boolean z) {
        this.sourceMarkersEnabled = z;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void skipCurrentGroup() {
        long rotateLeft;
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        int i = this.rGroupIndex;
        if (groupObjectKey != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ (groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode()), 3);
        } else {
            if (groupAux != null && groupKey == 207 && !groupAux.equals(Composer.Companion.getEmpty())) {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupAux.hashCode(), 3) ^ i;
                startReaderGroup(slotReader.isNode(), null);
                recomposeToGroupEnd();
                slotReader.endGroup();
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
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        if (groupObjectKey == null) {
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
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
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String str) {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.writer.recordGroupSourceInformation(str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i, String str) {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.writer.recordGrouplessCallSourceInformationStart(i, str);
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public ComposeStackTrace stackTraceForValue$runtime(Object obj) {
        ObjectLocation findLocation = ComposeStackTraceBuilderKt.findLocation(this.slotTable, new zy(obj, 0));
        return new ComposeStackTrace(findLocation != null ? yi.A0(stackTraceForGroup(findLocation.component1(), findLocation.component2()), parentStackTrace$runtime()) : ut.d, getSourceMarkersEnabled$runtime());
    }

    @Override // androidx.compose.runtime.InternalComposer
    public int stacksSize$runtime() {
        return Stack.m3865getSizeimpl(this.pendingStack) + Stack.m3865getSizeimpl(this.invalidateStack) + this.entersStack.tos + this.providersInvalidStack.tos + this.parentStateStack.tos;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m3840startAzEfcrM(ComposerKt.defaultsKey, null, GroupKind.Companion.m3947getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i, Object obj) {
        m3840startAzEfcrM(i, obj, GroupKind.Companion.m3947getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m3840startAzEfcrM(GapComposerKt.nodeKey, null, GroupKind.Companion.m3948getNode9udXigM(), null);
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
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object groupAux = slotReader.groupAux(slotReader.getCurrentGroup());
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
        asInt = GapComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z2;
        this.providerCache = currentCompositionLocalScope;
        m3840startAzEfcrM(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3947getGroup9udXigM(), currentCompositionLocalScope);
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
            this.writerHasAProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            groupGet.getClass();
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            groupGet2.getClass();
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupGet2;
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
        asInt = GapComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z2;
        this.providerCache = updateProviderMapGroup;
        m3840startAzEfcrM(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3947getGroup9udXigM(), updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceGroup(int i) {
        if (this.pending != null) {
            m3840startAzEfcrM(i, null, GroupKind.Companion.m3947getGroup9udXigM(), null);
            return;
        }
        validateNodeNotExpected();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i, 3) ^ this.rGroupIndex;
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.writer.startGroup(i, Composer.Companion.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == i && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i2 = this.nodeIndex;
            int currentGroup = slotReader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i2, slotReader.skipGroup());
            GapComposerKt.removeRange(this.invalidations, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(i, Composer.Companion.getEmpty());
        this.insertAnchor = slotWriter.anchor(currentGroup2);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i) {
        m3840startAzEfcrM(i, null, GroupKind.Companion.m3947getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
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
        m3840startAzEfcrM(i, null, GroupKind.Companion.m3947getGroup9udXigM(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m3840startAzEfcrM(GapComposerKt.nodeKey, null, GroupKind.Companion.m3949getReusableNode9udXigM(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void startReuseFromRoot$runtime() {
        this.reusingGroup = 0;
        this.reusing = true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean tryImminentInvalidation$runtime(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = GapAnchorKt.asGapAnchor(anchor).toIndexFor(this.reader.getTable$runtime());
        if (!isComposing$runtime() || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        GapComposerKt.insertIfMissing(this.invalidations, indexFor, recomposeScopeImpl, obj);
        return true;
    }

    public final void updateCachedValue(Object obj) {
        if (obj instanceof RememberObserver) {
            GapRememberObserverHolder gapRememberObserverHolder = new GapRememberObserverHolder((RememberObserver) obj, rememberObserverGroupIndex());
            if (getInserting()) {
                this.changeListWriter.remember(gapRememberObserverHolder);
            }
            this.abandonSet.add(obj);
            obj = gapRememberObserverHolder;
        }
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.InternalComposer
    /* renamed from: updateComposerInvalidations-RY85e9Y$runtime, reason: not valid java name */
    public void mo3843updateComposerInvalidationsRY85e9Y$runtime(fb0 fb0Var) {
        Comparator comparator;
        GapAnchor asGapAnchor;
        for (int v = y80.v(this.invalidations); -1 < v; v--) {
            Invalidation invalidation = this.invalidations.get(v);
            Anchor anchor = invalidation.getScope().getAnchor();
            GapAnchor asGapAnchor2 = anchor != null ? GapAnchorKt.asGapAnchor(anchor) : null;
            if (asGapAnchor2 == null || !asGapAnchor2.getValid()) {
                this.invalidations.remove(v);
            } else if (invalidation.getLocation() != asGapAnchor2.getLocation$runtime()) {
                invalidation.setLocation(asGapAnchor2.getLocation$runtime());
            }
        }
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            obj.getClass();
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            Anchor anchor2 = recomposeScopeImpl.getAnchor();
                            if (anchor2 != null && (asGapAnchor = GapAnchorKt.asGapAnchor(anchor2)) != null) {
                                int location$runtime = asGapAnchor.getLocation$runtime();
                                List<Invalidation> list = this.invalidations;
                                if (obj2 == ScopeInvalidated.INSTANCE) {
                                    obj2 = null;
                                }
                                list.add(new Invalidation(recomposeScopeImpl, location$runtime, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        List<Invalidation> list2 = this.invalidations;
        comparator = GapComposerKt.InvalidationLocationAscending;
        cj.b0(list2, comparator);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object obj) {
        updateCachedValue(obj);
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
            return;
        }
        if (!this.reader.getHadNext()) {
            ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
            SlotReader slotReader = this.reader;
            composerChangeListWriter.appendValue(slotReader.anchor(slotReader.getParent()), obj);
            return;
        }
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        boolean pastParent = this.changeListWriter.getPastParent();
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        if (!pastParent) {
            composerChangeListWriter2.updateValue(obj, groupSlotIndex);
        } else {
            SlotReader slotReader2 = this.reader;
            composerChangeListWriter2.updateAnchoredValue(obj, slotReader2.anchor(slotReader2.getParent()), groupSlotIndex);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(node);
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void verifyConsistent$runtime() {
        this.insertTable.verifyWellFormed();
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionImpl getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public ChangeList getDeferredChanges$runtime() {
        return this.deferredChanges;
    }

    private final void startGroup(int i, Object obj) {
        m3840startAzEfcrM(i, obj, GroupKind.Companion.m3947getGroup9udXigM(), null);
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

    public static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && b == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && s == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object obj) {
        if (q10.b(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Double) && d == ((Number) nextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i));
        return true;
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }
}
