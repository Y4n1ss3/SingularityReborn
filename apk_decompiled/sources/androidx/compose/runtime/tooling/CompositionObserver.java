package androidx.compose.runtime.tooling;

import androidx.compose.runtime.RecomposeScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface CompositionObserver {
    void onBeginComposition(ObservableComposition observableComposition);

    void onEndComposition(ObservableComposition observableComposition);

    void onReadInScope(RecomposeScope recomposeScope, Object obj);

    void onScopeDisposed(RecomposeScope recomposeScope);

    void onScopeEnter(RecomposeScope recomposeScope);

    void onScopeExit(RecomposeScope recomposeScope);

    void onScopeInvalidated(RecomposeScope recomposeScope, Object obj);
}
