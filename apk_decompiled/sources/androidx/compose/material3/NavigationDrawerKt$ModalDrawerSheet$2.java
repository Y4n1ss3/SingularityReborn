package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalDrawerSheet$2 implements ny {
    final /* synthetic */ ny $content;
    final /* synthetic */ long $drawerContainerColor;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $drawerTonalElevation;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ WindowInsets $windowInsets;

    public NavigationDrawerKt$ModalDrawerSheet$2(WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, DrawerState drawerState, ny nyVar) {
        this.$windowInsets = windowInsets;
        this.$modifier = modifier;
        this.$drawerShape = shape;
        this.$drawerContainerColor = j;
        this.$drawerContentColor = j2;
        this.$drawerTonalElevation = f;
        this.$drawerState = drawerState;
        this.$content = nyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1$lambda$0(DrawerState drawerState) {
        return drawerState.getAnchoredDraggableState$material3().getOffset();
    }

    public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer, int i) {
        DrawerPredictiveBackState drawerPredictiveBackState2;
        int i2;
        if ((i & 6) == 0) {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i2 = i | (composer.changed(drawerPredictiveBackState2) ? 4 : 2);
        } else {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i2 = i;
        }
        int i3 = 1;
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(797187326, i2, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:643)");
        }
        int i4 = i2;
        WindowInsets windowInsets = this.$windowInsets;
        Modifier modifier = this.$modifier;
        Shape shape = this.$drawerShape;
        long j = this.$drawerContainerColor;
        long j2 = this.$drawerContentColor;
        float f = this.$drawerTonalElevation;
        boolean changed = composer.changed(this.$drawerState);
        DrawerState drawerState = this.$drawerState;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new r0(drawerState, i3);
            composer.updateRememberedValue(rememberedValue);
        }
        NavigationDrawerKt.m2180DrawerSheetcm3T3N0(drawerPredictiveBackState2, windowInsets, modifier, shape, j, j2, f, (FloatProducer) rememberedValue, this.$content, composer, i4 & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((DrawerPredictiveBackState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return w01.a;
    }
}
