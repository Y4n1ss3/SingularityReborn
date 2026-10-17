package androidx.compose.runtime;

import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.internal.Trace;
import defpackage.gb0;
import defpackage.my;
import defpackage.rl0;
import defpackage.sl0;
import defpackage.tj;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PausedCompositionImpl implements PausedComposition {
    public static final int $stable = 8;
    private final Applier<?> applier;
    private final InternalComposer composer;
    private final CompositionImpl composition;
    private final my content;
    private final CompositionContext context;
    private rl0 invalidScopes;
    private final Object lock;
    private final RecordingApplier<Object> pausableApplier;
    private final RememberEventDispatcher rememberManager;
    private final boolean reusable;
    private AtomicReference<PausedCompositionState> state = new AtomicReference<>(PausedCompositionState.InitialPending);
    private long owningThread = Thread_jvmKt.currentThreadId();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PausedCompositionState.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PausedCompositionState.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PausedCompositionState.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PausedCompositionState.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PausedCompositionState.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PausedCompositionImpl(CompositionImpl compositionImpl, CompositionContext compositionContext, InternalComposer internalComposer, Set<RememberObserver> set, my myVar, boolean z, Applier<?> applier, Object obj) {
        this.composition = compositionImpl;
        this.context = compositionContext;
        this.composer = internalComposer;
        this.content = myVar;
        this.reusable = z;
        this.applier = applier;
        this.lock = obj;
        gb0 gb0Var = sl0.a;
        gb0Var.getClass();
        this.invalidScopes = gb0Var;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher();
        rememberEventDispatcher.prepare(set, internalComposer.getErrorContext$runtime());
        this.rememberManager = rememberEventDispatcher;
        this.pausableApplier = new RecordingApplier<>(applier.getCurrent());
    }

    private final void applyChanges() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.lock) {
                try {
                    RecordingApplier<Object> recordingApplier = this.pausableApplier;
                    Applier<?> applier = this.applier;
                    applier.getClass();
                    recordingApplier.playTo(applier, this.rememberManager);
                    this.rememberManager.dispatchRememberObservers();
                    this.rememberManager.dispatchSideEffects();
                } finally {
                    this.rememberManager.dispatchAbandons();
                    this.composition.pausedCompositionFinished$runtime(null);
                }
            }
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    private final void markComplete() {
        boolean z;
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        AtomicReference<PausedCompositionState> atomicReference = this.state;
        while (true) {
            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                z = true;
                break;
            } else if (atomicReference.get() != pausedCompositionState) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    private final void updateState(PausedCompositionState pausedCompositionState, PausedCompositionState pausedCompositionState2) {
        boolean z;
        AtomicReference<PausedCompositionState> atomicReference = this.state;
        while (true) {
            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                z = true;
                break;
            } else if (atomicReference.get() != pausedCompositionState) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void apply() {
        boolean z;
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    applyChanges();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    AtomicReference<PausedCompositionState> atomicReference = this.state;
                    while (true) {
                        if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                            z = true;
                        } else if (atomicReference.get() != pausedCompositionState) {
                            z = false;
                        }
                    }
                    if (z) {
                        return;
                    }
                    PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new tj();
            }
        } catch (Exception e) {
            this.state.set(PausedCompositionState.Invalid);
            throw e;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void cancel() {
        this.state.set(PausedCompositionState.Cancelled);
        rl0 extractRememberSet = this.rememberManager.extractRememberSet();
        this.rememberManager.dispatchAbandons();
        this.composition.pausedCompositionFinished$runtime(extractRememberSet);
    }

    public final Applier<?> getApplier() {
        return this.applier;
    }

    public final InternalComposer getComposer() {
        return this.composer;
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final my getContent() {
        return this.content;
    }

    public final CompositionContext getContext() {
        return this.context;
    }

    public final Object getLock() {
        return this.lock;
    }

    public final RecordingApplier<Object> getPausableApplier$runtime() {
        return this.pausableApplier;
    }

    public final RememberEventDispatcher getRememberManager$runtime() {
        return this.rememberManager;
    }

    public final boolean getReusable() {
        return this.reusable;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isApplied() {
        return this.state.get() == PausedCompositionState.Applied;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isCancelled() {
        return this.state.get() == PausedCompositionState.Cancelled;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isComplete() {
        return this.state.get().compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    public final boolean isRecomposing$runtime() {
        return this.state.get() == PausedCompositionState.Recomposing && this.owningThread == Thread_jvmKt.currentThreadId();
    }

    public final void markIncomplete$runtime() {
        AtomicReference<PausedCompositionState> atomicReference = this.state;
        PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
        while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2) && atomicReference.get() == pausedCompositionState) {
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean resume(ShouldPauseCallback shouldPauseCallback) {
        boolean z;
        try {
            boolean z2 = false;
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.get().ordinal()]) {
                case 1:
                    if (this.reusable) {
                        this.composer.startReuseFromRoot$runtime();
                    }
                    try {
                        this.invalidScopes = this.context.composeInitialPaused$runtime(this.composition, shouldPauseCallback, this.content);
                        PausedCompositionState pausedCompositionState = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        AtomicReference<PausedCompositionState> atomicReference = this.state;
                        while (true) {
                            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                                z2 = true;
                            } else if (atomicReference.get() != pausedCompositionState) {
                            }
                        }
                        if (!z2) {
                            PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                        }
                        if (this.invalidScopes.b()) {
                            markComplete();
                        }
                        return isComplete();
                    } finally {
                        if (this.reusable) {
                            this.composer.endReuseFromRoot$runtime();
                        }
                    }
                case 2:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Recomposing;
                    AtomicReference<PausedCompositionState> atomicReference2 = this.state;
                    while (true) {
                        if (atomicReference2.compareAndSet(pausedCompositionState3, pausedCompositionState4)) {
                            z = true;
                        } else if (atomicReference2.get() != pausedCompositionState3) {
                            z = false;
                        }
                    }
                    if (!z) {
                        PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + '.');
                    }
                    long j = this.owningThread;
                    try {
                        this.owningThread = Thread_jvmKt.currentThreadId();
                        this.invalidScopes = this.context.recomposePaused$runtime(this.composition, shouldPauseCallback, this.invalidScopes);
                        while (true) {
                        }
                        if (this.invalidScopes.b()) {
                            markComplete();
                        }
                        return isComplete();
                    } finally {
                        this.owningThread = j;
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.RecomposePending;
                        AtomicReference<PausedCompositionState> atomicReference3 = this.state;
                        while (true) {
                            if (atomicReference3.compareAndSet(pausedCompositionState5, pausedCompositionState6)) {
                                z2 = true;
                            } else if (atomicReference3.get() != pausedCompositionState5) {
                            }
                        }
                        if (!z2) {
                            PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + '.');
                        }
                    }
                case 3:
                    ComposerKt.composeRuntimeError("Recursive call to resume()");
                    throw new tj();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new tj();
            }
        } catch (Exception e) {
            this.state.set(PausedCompositionState.Invalid);
            throw e;
        }
    }
}
