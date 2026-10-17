package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorPainterKt$rememberVectorPainter$2$1$1 extends f30 implements ky {
    final /* synthetic */ Composition $composition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$2$1$1(Composition composition) {
        super(1);
        this.$composition = composition;
    }

    @Override // defpackage.ky
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final Composition composition = this.$composition;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Composition.this.dispose();
            }
        };
    }
}
