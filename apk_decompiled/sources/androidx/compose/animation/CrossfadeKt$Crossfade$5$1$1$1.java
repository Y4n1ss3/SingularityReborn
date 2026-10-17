package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$5$1$1$1 extends f30 implements ky {
    final /* synthetic */ State<Float> $alpha$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$1$1(State<Float> state) {
        super(1);
        this.$alpha$delegate = state;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        float invoke$lambda$1;
        invoke$lambda$1 = CrossfadeKt$Crossfade$5$1.invoke$lambda$1(this.$alpha$delegate);
        graphicsLayerScope.setAlpha(invoke$lambda$1);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return w01.a;
    }
}
