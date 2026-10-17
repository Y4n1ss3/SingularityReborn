package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.iy;
import defpackage.my;
import defpackage.ny;
import defpackage.oi;
import defpackage.q6;
import defpackage.v4;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClickableAppBarItem implements AppBarItem {
    public static final int $stable = 0;
    private final boolean enabled;
    private final my icon;
    private final String label;
    private final iy onClick;

    public ClickableAppBarItem(iy iyVar, my myVar, boolean z, String str) {
        this.onClick = iyVar;
        this.icon = myVar;
        this.enabled = z;
        this.label = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AppbarContent$lambda$0(ClickableAppBarItem clickableAppBarItem, int i, Composer composer, int i2) {
        clickableAppBarItem.AppbarContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MenuContent$lambda$2$lambda$1(ClickableAppBarItem clickableAppBarItem, AppBarMenuState appBarMenuState) {
        clickableAppBarItem.onClick.invoke();
        appBarMenuState.dismiss();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MenuContent$lambda$3(ClickableAppBarItem clickableAppBarItem, AppBarMenuState appBarMenuState, int i, Composer composer, int i2) {
        clickableAppBarItem.MenuContent(appBarMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.material3.AppBarItem
    public void AppbarContent(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1170649368);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170649368, i2, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent (AppBarDsl.kt:158)");
            }
            TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m2786rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.Companion.m2773getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(-816691117, true, new ny() { // from class: androidx.compose.material3.ClickableAppBarItem$AppbarContent$1
                public final void invoke(TooltipScope tooltipScope, Composer composer2, int i4) {
                    int i5;
                    if ((i4 & 6) == 0) {
                        i5 = i4 | ((i4 & 8) == 0 ? composer2.changed(tooltipScope) : composer2.changedInstance(tooltipScope) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if (!composer2.shouldExecute((i5 & 19) != 18, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-816691117, i5, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:163)");
                    }
                    final ClickableAppBarItem clickableAppBarItem = ClickableAppBarItem.this;
                    TooltipKt.m2789PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(837175745, true, new my() { // from class: androidx.compose.material3.ClickableAppBarItem$AppbarContent$1.1
                        public final void invoke(Composer composer3, int i6) {
                            String str;
                            if (!composer3.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(837175745, i6, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous>.<anonymous> (AppBarDsl.kt:163)");
                            }
                            str = ClickableAppBarItem.this.label;
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
                    }, composer2, 54), composer2, (i5 & 14) | 805306368, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((TooltipScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-592360853, true, new my() { // from class: androidx.compose.material3.ClickableAppBarItem$AppbarContent$2
                public final void invoke(Composer composer2, int i4) {
                    iy iyVar;
                    boolean z;
                    my myVar;
                    if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-592360853, i4, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:166)");
                    }
                    iyVar = ClickableAppBarItem.this.onClick;
                    z = ClickableAppBarItem.this.enabled;
                    myVar = ClickableAppBarItem.this.icon;
                    IconButtonKt.IconButton(iyVar, null, z, null, null, null, myVar, composer2, 0, 58);
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
            endRestartGroup.updateScope(new oi(this, i, i3));
        }
    }

    @Override // androidx.compose.material3.AppBarItem
    public void MenuContent(AppBarMenuState appBarMenuState, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-791598787);
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
                ComposerKt.traceEventStart(-791598787, i2, -1, "androidx.compose.material3.ClickableAppBarItem.MenuContent (AppBarDsl.kt:171)");
            }
            boolean z = false;
            boolean z2 = this.enabled;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(900574477, true, new my() { // from class: androidx.compose.material3.ClickableAppBarItem$MenuContent$1
                public final void invoke(Composer composer2, int i3) {
                    String str;
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(900574477, i3, -1, "androidx.compose.material3.ClickableAppBarItem.MenuContent.<anonymous> (AppBarDsl.kt:174)");
                    }
                    str = ClickableAppBarItem.this.label;
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
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean z4 = z | z3;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new v4(9, this, appBarMenuState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (iy) rememberedValue, null, null, null, z2, null, null, null, startRestartGroup, 6, 476);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, appBarMenuState, i, 3));
        }
    }
}
