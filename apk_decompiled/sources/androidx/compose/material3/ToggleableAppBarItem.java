package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.oi;
import defpackage.rn0;
import defpackage.vv0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ToggleableAppBarItem implements AppBarItem {
    public static final int $stable = 0;
    private final boolean checked;
    private final boolean enabled;
    private final my icon;
    private final String label;
    private final ky onCheckedChange;

    public ToggleableAppBarItem(boolean z, ky kyVar, my myVar, boolean z2, String str) {
        this.checked = z;
        this.onCheckedChange = kyVar;
        this.icon = myVar;
        this.enabled = z2;
        this.label = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AppbarContent$lambda$0(ToggleableAppBarItem toggleableAppBarItem, int i, Composer composer, int i2) {
        toggleableAppBarItem.AppbarContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MenuContent$lambda$2$lambda$1(ToggleableAppBarItem toggleableAppBarItem, AppBarMenuState appBarMenuState) {
        toggleableAppBarItem.onCheckedChange.invoke(Boolean.valueOf(!toggleableAppBarItem.checked));
        appBarMenuState.dismiss();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MenuContent$lambda$3(ToggleableAppBarItem toggleableAppBarItem, AppBarMenuState appBarMenuState, int i, Composer composer, int i2) {
        toggleableAppBarItem.MenuContent(appBarMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.material3.AppBarItem
    public void AppbarContent(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-53051696);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-53051696, i2, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent (AppBarDsl.kt:193)");
            }
            TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m2786rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.Companion.m2773getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(-1965247803, true, new ny() { // from class: androidx.compose.material3.ToggleableAppBarItem$AppbarContent$1
                public final void invoke(TooltipScope tooltipScope, Composer composer2, int i3) {
                    int i4;
                    if ((i3 & 6) == 0) {
                        i4 = i3 | ((i3 & 8) == 0 ? composer2.changed(tooltipScope) : composer2.changedInstance(tooltipScope) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if (!composer2.shouldExecute((i4 & 19) != 18, i4 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1965247803, i4, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:198)");
                    }
                    final ToggleableAppBarItem toggleableAppBarItem = ToggleableAppBarItem.this;
                    TooltipKt.m2789PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(2059984663, true, new my() { // from class: androidx.compose.material3.ToggleableAppBarItem$AppbarContent$1.1
                        public final void invoke(Composer composer3, int i5) {
                            String str;
                            if (!composer3.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2059984663, i5, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous>.<anonymous> (AppBarDsl.kt:198)");
                            }
                            str = ToggleableAppBarItem.this.label;
                            TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, composer2, 54), composer2, (i4 & 14) | 805306368, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((TooltipScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(694023085, true, new my() { // from class: androidx.compose.material3.ToggleableAppBarItem$AppbarContent$2
                public final void invoke(Composer composer2, int i3) {
                    boolean z;
                    ky kyVar;
                    boolean z2;
                    my myVar;
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(694023085, i3, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:201)");
                    }
                    z = ToggleableAppBarItem.this.checked;
                    kyVar = ToggleableAppBarItem.this.onCheckedChange;
                    z2 = ToggleableAppBarItem.this.enabled;
                    myVar = ToggleableAppBarItem.this.icon;
                    IconButtonKt.IconToggleButton(z, kyVar, null, z2, null, null, null, myVar, composer2, 0, 116);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, 100663344, 248);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new oi(this, i, 8));
        }
    }

    @Override // androidx.compose.material3.AppBarItem
    public void MenuContent(AppBarMenuState appBarMenuState, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1187385573);
        int i4 = 4;
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
                ComposerKt.traceEventStart(-1187385573, i2, -1, "androidx.compose.material3.ToggleableAppBarItem.MenuContent (AppBarDsl.kt:211)");
            }
            i3 = 0;
            boolean z = this.enabled;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-269621941, true, new my() { // from class: androidx.compose.material3.ToggleableAppBarItem$MenuContent$1
                public final void invoke(Composer composer2, int i5) {
                    String str;
                    if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-269621941, i5, -1, "androidx.compose.material3.ToggleableAppBarItem.MenuContent.<anonymous> (AppBarDsl.kt:214)");
                    }
                    str = ToggleableAppBarItem.this.label;
                    TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new rn0(i4, this, appBarMenuState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (iy) rememberedValue, null, null, null, z, null, null, null, startRestartGroup, 6, 476);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 0;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new vv0(this, appBarMenuState, i, i3));
        }
    }
}
