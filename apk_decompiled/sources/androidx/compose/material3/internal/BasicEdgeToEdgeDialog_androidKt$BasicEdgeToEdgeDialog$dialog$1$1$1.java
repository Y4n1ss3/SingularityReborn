package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
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
public final class BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1 implements my {
    final /* synthetic */ State<ny> $currentContent$delegate;
    final /* synthetic */ State<Boolean> $currentDismissOnBackPress$delegate;
    final /* synthetic */ State<iy> $currentOnDismissRequest$delegate;
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: Multi-variable type inference failed */
    public BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1(Modifier modifier, State<Boolean> state, State<? extends iy> state2, State<? extends ny> state3) {
        this.$modifier = modifier;
        this.$currentDismissOnBackPress$delegate = state;
        this.$currentOnDismissRequest$delegate = state2;
        this.$currentContent$delegate = state3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        boolean BasicEdgeToEdgeDialog$lambda$4;
        iy BasicEdgeToEdgeDialog$lambda$3;
        ny BasicEdgeToEdgeDialog$lambda$2;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-635938462, i, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog.<anonymous>.<anonymous>.<anonymous> (BasicEdgeToEdgeDialog.android.kt:115)");
        }
        PredictiveBackState rememberPredictiveBackState = BasicEdgeToEdgeDialogKt.rememberPredictiveBackState(composer, 0);
        BasicEdgeToEdgeDialog$lambda$4 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$4(this.$currentDismissOnBackPress$delegate);
        BasicEdgeToEdgeDialog$lambda$3 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$3(this.$currentOnDismissRequest$delegate);
        BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler(rememberPredictiveBackState, BasicEdgeToEdgeDialog$lambda$4, BasicEdgeToEdgeDialog$lambda$3, composer, 0, 0);
        Modifier modifier = this.$modifier;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new g();
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (ky) rememberedValue, 1, null);
        State<ny> state = this.$currentContent$delegate;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        iy constructor = companion.getConstructor();
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
        my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BasicEdgeToEdgeDialog$lambda$2 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$2(state);
        BasicEdgeToEdgeDialog$lambda$2.invoke(rememberPredictiveBackState, composer, 0);
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
