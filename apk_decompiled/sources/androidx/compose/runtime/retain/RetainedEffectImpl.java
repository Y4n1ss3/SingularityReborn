package androidx.compose.runtime.retain;

import defpackage.ky;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RetainedEffectImpl implements RetainObserver {
    private final ky effect;
    private RetainedEffectResult onRetire;

    public RetainedEffectImpl(ky kyVar) {
        this.effect = kyVar;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetained() {
        RetainedEffectScope retainedEffectScope;
        ky kyVar = this.effect;
        retainedEffectScope = RetainedEffectKt.InternalRetainedEffectScope;
        this.onRetire = (RetainedEffectResult) kyVar.invoke(retainedEffectScope);
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetired() {
        RetainedEffectResult retainedEffectResult = this.onRetire;
        if (retainedEffectResult != null) {
            retainedEffectResult.retire();
        }
        this.onRetire = null;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onExitedComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onUnused() {
    }
}
