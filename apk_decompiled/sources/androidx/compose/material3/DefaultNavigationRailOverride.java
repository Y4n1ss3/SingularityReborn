package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultNavigationRailOverride implements NavigationRailOverride {
    public static final int $stable = 0;
    public static final DefaultNavigationRailOverride INSTANCE = new DefaultNavigationRailOverride();

    private DefaultNavigationRailOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationRail$lambda$0(DefaultNavigationRailOverride defaultNavigationRailOverride, NavigationRailOverrideScope navigationRailOverrideScope, int i, Composer composer, int i2) {
        defaultNavigationRailOverride.NavigationRail(navigationRailOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.material3.NavigationRailOverride
    public void NavigationRail(NavigationRailOverrideScope navigationRailOverrideScope, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-433653496);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(navigationRailOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-433653496, i2, -1, "androidx.compose.material3.DefaultNavigationRailOverride.NavigationRail (NavigationRail.kt:147)");
            }
            SurfaceKt.m2464SurfaceT9BRK9s(navigationRailOverrideScope.getModifier(), null, navigationRailOverrideScope.m2238getContainerColor0d7_KjU(), navigationRailOverrideScope.m2239getContentColor0d7_KjU(), 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1027527987, true, new DefaultNavigationRailOverride$NavigationRail$1(navigationRailOverrideScope), startRestartGroup, 54), startRestartGroup, 12582912, 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, navigationRailOverrideScope, i, 16));
        }
    }
}
