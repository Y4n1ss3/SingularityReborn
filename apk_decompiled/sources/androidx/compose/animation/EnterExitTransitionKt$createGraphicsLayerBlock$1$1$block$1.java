package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 extends f30 implements ky {
    final /* synthetic */ State<Float> $alpha;
    final /* synthetic */ State<Float> $scale;
    final /* synthetic */ State<TransformOrigin> $transformOrigin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
        super(1);
        this.$alpha = state;
        this.$scale = state2;
        this.$transformOrigin = state3;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        State<Float> state = this.$alpha;
        graphicsLayerScope.setAlpha(state != null ? state.getValue().floatValue() : 1.0f);
        State<Float> state2 = this.$scale;
        graphicsLayerScope.setScaleX(state2 != null ? state2.getValue().floatValue() : 1.0f);
        State<Float> state3 = this.$scale;
        graphicsLayerScope.setScaleY(state3 != null ? state3.getValue().floatValue() : 1.0f);
        State<TransformOrigin> state4 = this.$transformOrigin;
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(state4 != null ? state4.getValue().m5173unboximpl() : TransformOrigin.Companion.m5174getCenterSzJe1aQ());
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return w01.a;
    }
}
