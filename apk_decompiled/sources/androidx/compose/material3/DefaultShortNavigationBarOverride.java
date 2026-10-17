package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.ShortNavigationBarArrangement;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.iy;
import defpackage.k4;
import defpackage.my;
import defpackage.q10;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultShortNavigationBarOverride implements ShortNavigationBarOverride {
    public static final int $stable = 0;
    public static final DefaultShortNavigationBarOverride INSTANCE = new DefaultShortNavigationBarOverride();

    private DefaultShortNavigationBarOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ShortNavigationBar$lambda$0(DefaultShortNavigationBarOverride defaultShortNavigationBarOverride, ShortNavigationBarOverrideScope shortNavigationBarOverrideScope, int i, Composer composer, int i2) {
        defaultShortNavigationBarOverride.ShortNavigationBar(shortNavigationBarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.material3.ShortNavigationBarOverride
    public void ShortNavigationBar(final ShortNavigationBarOverrideScope shortNavigationBarOverrideScope, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(256157474);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(shortNavigationBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(256157474, i2, -1, "androidx.compose.material3.DefaultShortNavigationBarOverride.ShortNavigationBar (ShortNavigationBar.kt:122)");
            }
            SurfaceKt.m2464SurfaceT9BRK9s(shortNavigationBarOverrideScope.getModifier(), null, shortNavigationBarOverrideScope.m2388getContainerColor0d7_KjU(), shortNavigationBarOverrideScope.m2389getContentColor0d7_KjU(), 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(236236519, true, new my() { // from class: androidx.compose.material3.DefaultShortNavigationBarOverride$ShortNavigationBar$1
                public final void invoke(Composer composer2, int i3) {
                    MeasurePolicy centeredContentMeasurePolicy;
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(236236519, i3, -1, "androidx.compose.material3.DefaultShortNavigationBarOverride.ShortNavigationBar.<anonymous> (ShortNavigationBar.kt:124)");
                    }
                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m792defaultMinSizeVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, ShortNavigationBarOverrideScope.this.getWindowInsets()), 0.0f, NavigationBarTokens.INSTANCE.m3433getContainerHeightD9Ej5fM(), 1, null));
                    my content = ShortNavigationBarOverrideScope.this.getContent();
                    int m2387getArrangementLnnQw40 = ShortNavigationBarOverrideScope.this.m2387getArrangementLnnQw40();
                    ShortNavigationBarArrangement.Companion companion = ShortNavigationBarArrangement.Companion;
                    if (ShortNavigationBarArrangement.m2377equalsimpl0(m2387getArrangementLnnQw40, companion.m2382getEqualWeightLnnQw40())) {
                        centeredContentMeasurePolicy = new EqualWeightContentMeasurePolicy();
                    } else {
                        if (!ShortNavigationBarArrangement.m2377equalsimpl0(m2387getArrangementLnnQw40, companion.m2381getCenteredLnnQw40())) {
                            defpackage.o.m("Invalid ItemsArrangement value.");
                            return;
                        }
                        centeredContentMeasurePolicy = new CenteredContentMeasurePolicy();
                    }
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, selectableGroup);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                    my b = k4.b(companion2, m3878constructorimpl, centeredContentMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                    content.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, 12582912, 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, shortNavigationBarOverrideScope, i, 17));
        }
    }
}
