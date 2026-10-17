package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ObservableComposition;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionKt {
    private static final int DEACTIVATED = 1;
    private static final int DISPOSED = 3;
    private static final int INCONSISTENT = 2;
    private static final int RUNNING = 0;
    private static final Object PendingApplyNoModifications = new Object();
    private static final CompositionServiceKey<ObservableComposition> ObservableCompositionServiceKey = new CompositionServiceKey<ObservableComposition>() { // from class: androidx.compose.runtime.CompositionKt$ObservableCompositionServiceKey$1
    };

    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier);
    }

    public static final ReusableComposition ReusableComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier);
    }

    public static final <T> T getCompositionService(Composition composition, CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    public static final CompositionServiceKey<ObservableComposition> getObservableCompositionServiceKey() {
        return ObservableCompositionServiceKey;
    }

    public static final <R> R pausable(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, iy iyVar) {
        ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
        try {
            return (R) iyVar.invoke();
        } finally {
            controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
        }
    }

    public static /* synthetic */ void getObservableCompositionServiceKey$annotations() {
    }
}
