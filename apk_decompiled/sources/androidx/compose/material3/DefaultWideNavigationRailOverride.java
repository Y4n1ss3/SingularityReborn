package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultWideNavigationRailOverride implements WideNavigationRailOverride {
    public static final int $stable = 0;
    public static final DefaultWideNavigationRailOverride INSTANCE = new DefaultWideNavigationRailOverride();

    private DefaultWideNavigationRailOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 WideNavigationRail$lambda$0(DefaultWideNavigationRailOverride defaultWideNavigationRailOverride, WideNavigationRailOverrideScope wideNavigationRailOverrideScope, int i, Composer composer, int i2) {
        defaultWideNavigationRailOverride.WideNavigationRail(wideNavigationRailOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.material3.WideNavigationRailOverride
    public void WideNavigationRail(WideNavigationRailOverrideScope wideNavigationRailOverrideScope, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1829525426);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(wideNavigationRailOverrideScope) : startRestartGroup.changedInstance(wideNavigationRailOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829525426, i2, -1, "androidx.compose.material3.DefaultWideNavigationRailOverride.WideNavigationRail (WideNavigationRail.kt:192)");
            }
            WideNavigationRailKt.WideNavigationRailLayout(wideNavigationRailOverrideScope.getModifier(), false, WideNavigationRailStateKt.isExpanded(wideNavigationRailOverrideScope.getState().getTargetValue()), wideNavigationRailOverrideScope.getColors(), wideNavigationRailOverrideScope.getShape(), wideNavigationRailOverrideScope.getHeader(), wideNavigationRailOverrideScope.getWindowInsets(), wideNavigationRailOverrideScope.getArrangement(), wideNavigationRailOverrideScope.getContent(), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, wideNavigationRailOverrideScope, i, 21));
        }
    }
}
