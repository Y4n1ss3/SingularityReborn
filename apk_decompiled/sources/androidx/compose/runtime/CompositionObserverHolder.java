package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionObserver;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionObserverHolder {
    public static final int $stable = 8;
    private CompositionObserver observer;
    private final CompositionContext parent;
    private boolean root;

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, CompositionContext compositionContext, int i, dq dqVar) {
        this((i & 1) != 0 ? null : compositionObserver, (i & 2) != 0 ? false : z, compositionContext);
    }

    public final CompositionObserver current() {
        if (this.root) {
            return this.observer;
        }
        CompositionObserverHolder observerHolder$runtime = this.parent.getObserverHolder$runtime();
        CompositionObserver compositionObserver = observerHolder$runtime != null ? observerHolder$runtime.observer : null;
        if (!q10.b(compositionObserver, this.observer)) {
            this.observer = compositionObserver;
        }
        return compositionObserver;
    }

    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final void setRoot(boolean z) {
        this.root = z;
    }

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, CompositionContext compositionContext) {
        this.observer = compositionObserver;
        this.root = z;
        this.parent = compositionContext;
    }
}
