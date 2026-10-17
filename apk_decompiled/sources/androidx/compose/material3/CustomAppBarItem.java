package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import defpackage.my;
import defpackage.ny;
import defpackage.oi;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CustomAppBarItem implements AppBarItem {
    public static final int $stable = 0;
    private final my appbarContent;
    private final ny menuContent;

    public CustomAppBarItem(my myVar, ny nyVar) {
        this.appbarContent = myVar;
        this.menuContent = nyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AppbarContent$lambda$0(CustomAppBarItem customAppBarItem, int i, Composer composer, int i2) {
        customAppBarItem.AppbarContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MenuContent$lambda$1(CustomAppBarItem customAppBarItem, AppBarMenuState appBarMenuState, int i, Composer composer, int i2) {
        customAppBarItem.MenuContent(appBarMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.material3.AppBarItem
    public void AppbarContent(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1121775917);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121775917, i2, -1, "androidx.compose.material3.CustomAppBarItem.AppbarContent (AppBarDsl.kt:228)");
            }
            this.appbarContent.invoke(startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new oi(this, i, i3));
        }
    }

    @Override // androidx.compose.material3.AppBarItem
    public void MenuContent(AppBarMenuState appBarMenuState, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1853735176);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appBarMenuState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1853735176, i2, -1, "androidx.compose.material3.CustomAppBarItem.MenuContent (AppBarDsl.kt:233)");
            }
            this.menuContent.invoke(appBarMenuState, startRestartGroup, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, appBarMenuState, i, 11));
        }
    }
}
