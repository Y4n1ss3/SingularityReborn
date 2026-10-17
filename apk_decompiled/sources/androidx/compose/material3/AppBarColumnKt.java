package androidx.compose.material3;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.t6;
import defpackage.u6;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBarColumnKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppBarColumn(ny nyVar, Modifier modifier, int i, ky kyVar, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1484836710);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(nyVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : Fields.SpotShadowColor;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(kyVar) ? Fields.CameraDistance : Fields.RotationZ;
                }
                int i8 = 0;
                if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
                    modifier3 = i7 != 0 ? Modifier.Companion : modifier2;
                    if (i5 != 0) {
                        i6 = Integer.MAX_VALUE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1484836710, i4, -1, "androidx.compose.material3.AppBarColumn (AppBarColumn.kt:54)");
                    }
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, startRestartGroup, (i4 >> 9) & 14);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = SnapshotStateKt.derivedStateOf(new t6(rememberUpdatedState, i8));
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final State state = (State) rememberedValue;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new AppBarMenuState();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    AppBarMenuState appBarMenuState = (AppBarMenuState) rememberedValue2;
                    AppBarOverflowState rememberAppBarOverflowState = AppBarDslKt.rememberAppBarOverflowState(startRestartGroup, 0);
                    boolean changed = ((i4 & 896) == 256) | startRestartGroup.changed(rememberAppBarOverflowState);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new OverflowMeasurePolicy(rememberAppBarOverflowState, i6, true);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    OverflowMeasurePolicy overflowMeasurePolicy = (OverflowMeasurePolicy) rememberedValue3;
                    my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(y80.E(ComposableLambdaKt.rememberComposableLambda(979489399, true, new my() { // from class: androidx.compose.material3.AppBarColumnKt$AppBarColumn$1
                        public final void invoke(Composer composer2, int i9) {
                            AppBarColumnScopeImpl AppBarColumn$lambda$2;
                            if (!composer2.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(979489399, i9, -1, "androidx.compose.material3.AppBarColumn.<anonymous> (AppBarColumn.kt:69)");
                            }
                            AppBarColumn$lambda$2 = AppBarColumnKt.AppBarColumn$lambda$2(state);
                            List<AppBarItem> items = AppBarColumn$lambda$2.getItems();
                            int size = items.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                items.get(i10).AppbarContent(composer2, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1681423992, true, new AppBarColumnKt$AppBarColumn$2(nyVar, appBarMenuState, rememberAppBarOverflowState, state), startRestartGroup, 54)));
                    boolean changed2 = startRestartGroup.changed(overflowMeasurePolicy);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = MultiContentMeasurePolicyKt.createMeasurePolicy(overflowMeasurePolicy);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue4;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                    my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                    combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                int i9 = i6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new u6(nyVar, modifier3, i9, kyVar, i2, i3, 0));
                    return;
                }
                return;
            }
            i6 = i;
            if ((i3 & 8) != 0) {
            }
            int i82 = 0;
            if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            }
            int i92 = i6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i3 & 8) != 0) {
        }
        int i822 = 0;
        if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
        }
        int i922 = i6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppBarColumnScopeImpl AppBarColumn$lambda$1$lambda$0(State state) {
        AppBarColumnScopeImpl appBarColumnScopeImpl = new AppBarColumnScopeImpl(new AppBarScopeImpl());
        ((ky) state.getValue()).invoke(appBarColumnScopeImpl);
        return appBarColumnScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppBarColumnScopeImpl AppBarColumn$lambda$2(State<AppBarColumnScopeImpl> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AppBarColumn$lambda$5(ny nyVar, Modifier modifier, int i, ky kyVar, int i2, int i3, Composer composer, int i4) {
        AppBarColumn(nyVar, modifier, i, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }
}
