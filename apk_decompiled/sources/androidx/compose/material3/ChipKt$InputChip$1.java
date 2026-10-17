package androidx.compose.material3;

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
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.fc;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChipKt$InputChip$1 implements my {
    final /* synthetic */ my $avatar;
    final /* synthetic */ float $avatarOpacity;
    final /* synthetic */ Shape $avatarShape;

    public ChipKt$InputChip$1(float f, Shape shape, my myVar) {
        this.$avatarOpacity = f;
        this.$avatarShape = shape;
        this.$avatar = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(float f, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(f);
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 0;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-570452295, i, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:654)");
        }
        Modifier.Companion companion = Modifier.Companion;
        boolean changed = composer.changed(this.$avatarOpacity) | composer.changed(this.$avatarShape);
        float f = this.$avatarOpacity;
        Shape shape = this.$avatarShape;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new l(f, i2, shape);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (ky) rememberedValue);
        Alignment center = Alignment.Companion.getCenter();
        my myVar = this.$avatar;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, graphicsLayer);
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
