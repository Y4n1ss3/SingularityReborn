package androidx.compose.runtime.composer;

import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThrowingRememberManagerStub implements RememberManager {
    public static final int $stable = 0;
    public static final ThrowingRememberManagerStub INSTANCE = new ThrowingRememberManagerStub();

    private ThrowingRememberManagerStub() {
    }

    private final void throwIllegalOperationException() {
        ComposerKt.composeImmediateRuntimeError("ChangeList cannot call the RememberManager when executing pending changes outside of the applier phase.");
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void endResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void forgetting(RememberObserverHolder rememberObserverHolder) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void remembering(RememberObserverHolder rememberObserverHolder) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void sideEffect(iy iyVar) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void startResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        throwIllegalOperationException();
    }
}
