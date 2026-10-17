package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import defpackage.iy;
import defpackage.kn;
import defpackage.my;
import defpackage.rl0;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime(ControlledComposition controlledComposition, my myVar);

    public abstract rl0 composeInitialPaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, my myVar);

    public abstract void deletedMovableContent$runtime(MovableContentStateReference movableContentStateReference);

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract Composition getComposition$runtime();

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        persistentCompositionLocalMap = CompositionContextKt.EmptyPersistentCompositionLocalMap;
        return persistentCompositionLocalMap;
    }

    public abstract kn getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime() {
        return null;
    }

    public abstract boolean getStackTraceEnabled$runtime();

    public abstract void insertMovableContent$runtime(MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime(ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier<?> applier);

    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public abstract rl0 recomposePaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, rl0 rl0Var);

    public abstract void registerComposition$runtime(ControlledComposition controlledComposition);

    public abstract void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void reportRemovedComposition$runtime(ControlledComposition controlledComposition);

    public abstract CancellationHandle scheduleFrameEndCallback(iy iyVar);

    public abstract void unregisterComposition$runtime(ControlledComposition controlledComposition);

    public void doneComposing$runtime() {
    }

    public void startComposing$runtime() {
    }

    public void recordInspectionTable$runtime(Set<CompositionData> set) {
    }

    public void registerComposer$runtime(Composer composer) {
    }

    public void unregisterComposer$runtime(Composer composer) {
    }
}
