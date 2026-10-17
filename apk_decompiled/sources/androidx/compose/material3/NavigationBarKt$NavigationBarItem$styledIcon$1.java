package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$styledIcon$1 implements my {
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ FiniteAnimationSpec<Color> $colorAnimationSpec;
    final /* synthetic */ NavigationBarItemColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ my $icon;
    final /* synthetic */ my $label;
    final /* synthetic */ boolean $selected;

    public NavigationBarKt$NavigationBarItem$styledIcon$1(NavigationBarItemColors navigationBarItemColors, boolean z, boolean z2, FiniteAnimationSpec<Color> finiteAnimationSpec, my myVar, boolean z3, my myVar2) {
        this.$colors = navigationBarItemColors;
        this.$selected = z;
        this.$enabled = z2;
        this.$colorAnimationSpec = finiteAnimationSpec;
        this.$label = myVar;
        this.$alwaysShowLabel = z3;
        this.$icon = myVar2;
    }

    private static final long invoke$lambda$0(State<Color> state) {
        return state.getValue().m4771unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$2$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        Modifier modifier;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-876637252, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:212)");
        }
        State<Color> m100animateColorAsStateeuL9pac = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(this.$colors.m2165iconColorWaAFU9c$material3(this.$selected, this.$enabled), this.$colorAnimationSpec, null, null, composer, 0, 12);
        if (this.$label == null || !(this.$alwaysShowLabel || this.$selected)) {
            composer.startReplaceGroup(-634793532);
            composer.endReplaceGroup();
            modifier = Modifier.Companion;
        } else {
            composer.startReplaceGroup(-634794445);
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new d(15);
                composer.updateRememberedValue(rememberedValue);
            }
            modifier = SemanticsModifierKt.clearAndSetSemantics(companion, (ky) rememberedValue);
            composer.endReplaceGroup();
        }
        my myVar = this.$icon;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(invoke$lambda$0(m100animateColorAsStateeuL9pac))), myVar, composer, ProvidedValue.$stable);
        composer.endNode();
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
