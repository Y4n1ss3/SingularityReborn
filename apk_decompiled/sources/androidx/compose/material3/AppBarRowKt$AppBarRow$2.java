package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
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
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBarRowKt$AppBarRow$2 implements my {
    final /* synthetic */ AppBarMenuState $menuState;
    final /* synthetic */ ny $overflowIndicator;
    final /* synthetic */ AppBarOverflowState $overflowState;
    final /* synthetic */ State<AppBarRowScopeImpl> $scope$delegate;

    public AppBarRowKt$AppBarRow$2(ny nyVar, AppBarMenuState appBarMenuState, AppBarOverflowState appBarOverflowState, State<AppBarRowScopeImpl> state) {
        this.$overflowIndicator = nyVar;
        this.$menuState = appBarMenuState;
        this.$overflowState = appBarOverflowState;
        this.$scope$delegate = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$2$lambda$1$lambda$0(AppBarMenuState appBarMenuState) {
        appBarMenuState.dismiss();
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 1;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-815780026, i, -1, "androidx.compose.material3.AppBarRow.<anonymous> (AppBarRow.kt:73)");
        }
        ny nyVar = this.$overflowIndicator;
        final AppBarMenuState appBarMenuState = this.$menuState;
        final AppBarOverflowState appBarOverflowState = this.$overflowState;
        final State<AppBarRowScopeImpl> state = this.$scope$delegate;
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
        nyVar.invoke(appBarMenuState, composer, 6);
        boolean isExpanded = appBarMenuState.isExpanded();
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new b(appBarMenuState, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        AndroidMenu_androidKt.m1603DropdownMenuIlH_yew(isExpanded, (iy) rememberedValue, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1786124721, true, new ny() { // from class: androidx.compose.material3.AppBarRowKt$AppBarRow$2$1$2
            public final void invoke(ColumnScope columnScope, Composer composer2, int i3) {
                AppBarRowScopeImpl AppBarRow$lambda$2;
                if (!composer2.shouldExecute((i3 & 17) != 16, i3 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1786124721, i3, -1, "androidx.compose.material3.AppBarRow.<anonymous>.<anonymous>.<anonymous> (AppBarRow.kt:79)");
                }
                AppBarRow$lambda$2 = AppBarRowKt.AppBarRow$lambda$2(state);
                List<AppBarItem> subList = AppBarRow$lambda$2.getItems().subList(AppBarOverflowState.this.getVisibleItemCount(), AppBarOverflowState.this.getTotalItemCount());
                AppBarMenuState appBarMenuState2 = appBarMenuState;
                int size = subList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    subList.get(i4).MenuContent(appBarMenuState2, composer2, 6);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.ny
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return w01.a;
            }
        }, composer, 54), composer, 48, 48, 2044);
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
