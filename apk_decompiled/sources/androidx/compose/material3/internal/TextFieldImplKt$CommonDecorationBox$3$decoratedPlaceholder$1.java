package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 implements ny {
    final /* synthetic */ TextStyle $bodyLarge;
    final /* synthetic */ my $placeholder;
    final /* synthetic */ State<Float> $placeholderAlpha;
    final /* synthetic */ long $placeholderColor;

    public TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(State<Float> state, long j, TextStyle textStyle, my myVar) {
        this.$placeholderAlpha = state;
        this.$placeholderColor = j;
        this.$bodyLarge = textStyle;
        this.$placeholder = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
        return w01.a;
    }

    public final void invoke(Modifier modifier, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(modifier) ? 4 : 2;
        }
        int i2 = 0;
        if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1405547205, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
        }
        boolean changed = composer.changed(this.$placeholderAlpha);
        State<Float> state = this.$placeholderAlpha;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new k(state, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier, (ky) rememberedValue);
        long j = this.$placeholderColor;
        TextStyle textStyle = this.$bodyLarge;
        my myVar = this.$placeholder;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, graphicsLayer);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        iy constructor = companion.getConstructor();
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
        my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TextFieldImplKt.m2985Decoration3JVO9M(j, textStyle, myVar, composer, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        return w01.a;
    }
}
