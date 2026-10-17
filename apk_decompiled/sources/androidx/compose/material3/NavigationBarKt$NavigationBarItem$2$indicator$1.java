package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutIdKt;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$2$indicator$1 implements my {
    final /* synthetic */ State<Float> $alphaAnimationProgress;
    final /* synthetic */ NavigationBarItemColors $colors;

    public NavigationBarKt$NavigationBarItem$2$indicator$1(State<Float> state, NavigationBarItemColors navigationBarItemColors) {
        this.$alphaAnimationProgress = state;
        this.$colors = navigationBarItemColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 1;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-799524251, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:297)");
        }
        Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "indicator");
        boolean changed = composer.changed(this.$alphaAnimationProgress);
        State<Float> state = this.$alphaAnimationProgress;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new g0(state, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        BoxKt.Box(BackgroundKt.m226backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(layoutId, (ky) rememberedValue), this.$colors.m2159getIndicatorColor0d7_KjU$material3(), ShapesKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorShape(), composer, 6)), composer, 0);
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
