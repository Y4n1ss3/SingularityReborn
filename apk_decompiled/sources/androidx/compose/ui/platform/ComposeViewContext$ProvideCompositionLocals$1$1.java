package androidx.compose.ui.platform;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeViewContext$ProvideCompositionLocals$1$1 extends f30 implements ky {
    final /* synthetic */ DisposableSaveableStateRegistry $saveableStateRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewContext$ProvideCompositionLocals$1$1(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        super(1);
        this.$saveableStateRegistry = disposableSaveableStateRegistry;
    }

    @Override // defpackage.ky
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final DisposableSaveableStateRegistry disposableSaveableStateRegistry = this.$saveableStateRegistry;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                DisposableSaveableStateRegistry.this.dispose();
            }
        };
    }
}
