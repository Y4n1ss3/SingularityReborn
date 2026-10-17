package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.iy;
import defpackage.k4;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultNavigationBarOverride implements NavigationBarOverride {
    public static final int $stable = 0;
    public static final DefaultNavigationBarOverride INSTANCE = new DefaultNavigationBarOverride();

    private DefaultNavigationBarOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationBar$lambda$0(DefaultNavigationBarOverride defaultNavigationBarOverride, NavigationBarOverrideScope navigationBarOverrideScope, int i, Composer composer, int i2) {
        defaultNavigationBarOverride.NavigationBar(navigationBarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.material3.NavigationBarOverride
    public void NavigationBar(final NavigationBarOverrideScope navigationBarOverrideScope, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(882141204);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(navigationBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(882141204, i2, -1, "androidx.compose.material3.DefaultNavigationBarOverride.NavigationBar (NavigationBar.kt:139)");
            }
            SurfaceKt.m2464SurfaceT9BRK9s(navigationBarOverrideScope.getModifier(), null, navigationBarOverrideScope.m2174getContainerColor0d7_KjU(), navigationBarOverrideScope.m2175getContentColor0d7_KjU(), navigationBarOverrideScope.m2176getTonalElevationD9Ej5fM(), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1991263321, true, new my() { // from class: androidx.compose.material3.DefaultNavigationBarOverride$NavigationBar$1
                public final void invoke(Composer composer2, int i3) {
                    float f;
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1991263321, i3, -1, "androidx.compose.material3.DefaultNavigationBarOverride.NavigationBar.<anonymous> (NavigationBar.kt:146)");
                    }
                    Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), NavigationBarOverrideScope.this.getWindowInsets());
                    f = NavigationBarKt.NavigationBarHeight;
                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m792defaultMinSizeVpY3zN4$default(windowInsetsPadding, 0.0f, f, 1, null));
                    Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = Arrangement.INSTANCE.m647spacedBy0680j_4(NavigationBarKt.getNavigationBarItemHorizontalPadding());
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    ny content = NavigationBarOverrideScope.this.getContent();
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m647spacedBy0680j_4, centerVertically, composer2, 54);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, selectableGroup);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
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
                    my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                    content.invoke(RowScopeInstance.INSTANCE, composer2, 6);
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
            }, startRestartGroup, 54), startRestartGroup, 12582912, 98);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, navigationBarOverrideScope, i, 15));
        }
    }
}
