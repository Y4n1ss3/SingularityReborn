package androidx.compose.runtime.composer;

import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface RememberManager {
    void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback);

    void endResumingScope(RecomposeScopeImpl recomposeScopeImpl);

    void forgetting(RememberObserverHolder rememberObserverHolder);

    void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback);

    void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl);

    void remembering(RememberObserverHolder rememberObserverHolder);

    void sideEffect(iy iyVar);

    void startResumingScope(RecomposeScopeImpl recomposeScopeImpl);
}
