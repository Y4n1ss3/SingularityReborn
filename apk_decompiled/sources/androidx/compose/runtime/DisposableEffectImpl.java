package androidx.compose.runtime;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DisposableEffectImpl implements RememberObserver {
    private final ky effect;
    private DisposableEffectResult onDispose;

    public DisposableEffectImpl(ky kyVar) {
        this.effect = kyVar;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.onDispose;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.onDispose = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        DisposableEffectScope disposableEffectScope;
        ky kyVar = this.effect;
        disposableEffectScope = EffectsKt.InternalDisposableEffectScope;
        this.onDispose = (DisposableEffectResult) kyVar.invoke(disposableEffectScope);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
