package androidx.compose.runtime;

import defpackage.p10;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;
    private final un coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(un unVar) {
        this.coroutineScope = unVar;
    }

    public final un getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        un unVar = this.coroutineScope;
        if (unVar instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) unVar).cancelIfCreated();
        } else {
            p10.h(unVar, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        un unVar = this.coroutineScope;
        if (unVar instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) unVar).cancelIfCreated();
        } else {
            p10.h(unVar, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
