package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailKt$ModalWideNavigationRailContent$5 implements my {
    final /* synthetic */ Arrangement.Vertical $arrangement;
    final /* synthetic */ WideNavigationRailColors $colors;
    final /* synthetic */ my $content;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ my $header;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
    final /* synthetic */ RailPredictiveBackState $predictiveBackState;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ WindowInsets $windowInsets;

    public WideNavigationRailKt$ModalWideNavigationRailContent$5(Animatable<Float, AnimationVector1D> animatable, RailPredictiveBackState railPredictiveBackState, boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, my myVar, WindowInsets windowInsets, Arrangement.Vertical vertical, my myVar2) {
        this.$predictiveBackProgress = animatable;
        this.$predictiveBackState = railPredictiveBackState;
        this.$isRtl = z;
        this.$expanded = z2;
        this.$colors = wideNavigationRailColors;
        this.$shape = shape;
        this.$header = myVar;
        this.$windowInsets = windowInsets;
        this.$arrangement = vertical;
        this.$content = myVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(Animatable animatable, RailPredictiveBackState railPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float calculatePredictiveBackScaleX;
        float calculatePredictiveBackScaleY;
        float floatValue = ((Number) animatable.getValue()).floatValue();
        w01 w01Var = w01.a;
        if (floatValue <= 0.0f) {
            return w01Var;
        }
        calculatePredictiveBackScaleX = WideNavigationRailKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue, railPredictiveBackState.getSwipeEdgeMatchesRail());
        calculatePredictiveBackScaleY = WideNavigationRailKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
        graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX == 0.0f ? 1.0f : calculatePredictiveBackScaleY / calculatePredictiveBackScaleX);
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.5f));
        return w01Var;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1043835354, i, -1, "androidx.compose.material3.ModalWideNavigationRailContent.<anonymous> (WideNavigationRail.kt:1044)");
        }
        Modifier.Companion companion = Modifier.Companion;
        boolean changedInstance = composer.changedInstance(this.$predictiveBackProgress) | composer.changed(this.$predictiveBackState) | composer.changed(this.$isRtl);
        Animatable<Float, AnimationVector1D> animatable = this.$predictiveBackProgress;
        RailPredictiveBackState railPredictiveBackState = this.$predictiveBackState;
        boolean z = this.$isRtl;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d1(animatable, railPredictiveBackState, z);
            composer.updateRememberedValue(rememberedValue);
        }
        WideNavigationRailKt.WideNavigationRailLayout(GraphicsLayerModifierKt.graphicsLayer(companion, (ky) rememberedValue), true, this.$expanded, this.$colors, this.$shape, this.$header, this.$windowInsets, this.$arrangement, this.$content, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
