package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultNavigationRailOverride$NavigationRail$1 implements my {
    final /* synthetic */ NavigationRailOverrideScope $this_NavigationRail;

    public DefaultNavigationRailOverride$NavigationRail$1(NavigationRailOverrideScope navigationRailOverrideScope) {
        this.$this_NavigationRail = navigationRailOverrideScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        float f;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1027527987, i, -1, "androidx.compose.material3.DefaultNavigationRailOverride.NavigationRail.<anonymous> (NavigationRail.kt:149)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m764paddingVpY3zN4$default(SizeKt.m814widthInVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), this.$this_NavigationRail.getWindowInsets()), NavigationRailCollapsedTokens.INSTANCE.m3457getNarrowContainerWidthD9Ej5fM(), 0.0f, 2, null), 0.0f, NavigationRailKt.getNavigationRailVerticalPadding(), 1, null));
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d(9);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(selectableGroup, false, (ky) rememberedValue, 1, null);
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = Arrangement.INSTANCE.m647spacedBy0680j_4(NavigationRailKt.getNavigationRailVerticalPadding());
        NavigationRailOverrideScope navigationRailOverrideScope = this.$this_NavigationRail;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m647spacedBy0680j_4, centerHorizontally, composer, 54);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
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
        my b = k4.b(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ny header = navigationRailOverrideScope.getHeader();
        if (header != null) {
            composer.startReplaceGroup(-548298554);
            header.invoke(columnScopeInstance, composer, 6);
            f = NavigationRailKt.NavigationRailHeaderPadding;
            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, f), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-548182273);
            composer.endReplaceGroup();
        }
        navigationRailOverrideScope.getContent().invoke(columnScopeInstance, composer, 6);
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
