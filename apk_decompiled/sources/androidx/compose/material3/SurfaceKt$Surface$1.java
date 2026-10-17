package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import defpackage.fc;
import defpackage.hm;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SurfaceKt$Surface$1 implements my {
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ long $color;
    final /* synthetic */ my $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ Shape $shape;

    public SurfaceKt$Surface$1(Modifier modifier, Shape shape, long j, float f, BorderStroke borderStroke, float f2, my myVar) {
        this.$modifier = modifier;
        this.$shape = shape;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$border = borderStroke;
        this.$shadowElevation = f2;
        this.$content = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$2$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        long m2471surfaceColorAtElevationCLU3JFs;
        Modifier m2470surfaceXOJAsU;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(421772006, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:110)");
        }
        Modifier modifier = this.$modifier;
        Shape shape = this.$shape;
        m2471surfaceColorAtElevationCLU3JFs = SurfaceKt.m2471surfaceColorAtElevationCLU3JFs(this.$color, this.$absoluteElevation, composer, 0);
        m2470surfaceXOJAsU = SurfaceKt.m2470surfaceXOJAsU(modifier, shape, m2471surfaceColorAtElevationCLU3JFs, this.$border, ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(this.$shadowElevation));
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new d(21);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics = SemanticsModifierKt.semantics(m2470surfaceXOJAsU, false, (ky) rememberedValue);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new PointerInputEventHandler() { // from class: androidx.compose.material3.SurfaceKt$Surface$1$3$1
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                    return w01.a;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics, w01.a, (PointerInputEventHandler) rememberedValue2);
        my myVar = this.$content;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, pointerInput);
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        iy constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
        my b = k4.b(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (fc.l(myVar, composer, 0)) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
