package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetContent$7 implements my {
    final /* synthetic */ iy $animateToDismiss;
    final /* synthetic */ ny $content;
    final /* synthetic */ my $contentWindowInsets;
    final /* synthetic */ my $dragHandle;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
    final /* synthetic */ un $scope;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ SheetState $sheetState;

    public ModalBottomSheetKt$ModalBottomSheetContent$7(my myVar, Animatable<Float, AnimationVector1D> animatable, SheetState sheetState, my myVar2, ny nyVar, iy iyVar, un unVar, boolean z) {
        this.$contentWindowInsets = myVar;
        this.$predictiveBackProgress = animatable;
        this.$sheetState = sheetState;
        this.$dragHandle = myVar2;
        this.$content = nyVar;
        this.$animateToDismiss = iyVar;
        this.$scope = unVar;
        this.$sheetGesturesEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        float calculatePredictiveBackScaleX;
        float calculatePredictiveBackScaleY;
        long j;
        float floatValue = ((Number) animatable.getValue()).floatValue();
        calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
        calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
        graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY == 0.0f ? 1.0f : calculatePredictiveBackScaleX / calculatePredictiveBackScaleY);
        j = ModalBottomSheetKt.PredictiveBackChildTransformOrigin;
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(j);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 0;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(728743275, i, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:359)");
        }
        Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), (WindowInsets) this.$contentWindowInsets.invoke(composer, 0));
        boolean changedInstance = composer.changedInstance(this.$predictiveBackProgress);
        Animatable<Float, AnimationVector1D> animatable = this.$predictiveBackProgress;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new j0(animatable, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier verticalScaleDown = BottomSheetScaffoldKt.verticalScaleDown(GraphicsLayerModifierKt.graphicsLayer(windowInsetsPadding, (ky) rememberedValue), this.$sheetState);
        my myVar = this.$dragHandle;
        ny nyVar = this.$content;
        SheetState sheetState = this.$sheetState;
        iy iyVar = this.$animateToDismiss;
        un unVar = this.$scope;
        boolean z = this.$sheetGesturesEnabled;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, verticalScaleDown);
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
        my b = k4.b(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (myVar != null) {
            composer.startReplaceGroup(1352934765);
            Strings.Companion companion2 = Strings.Companion;
            SheetDefaultsKt.DragHandleWithTooltip(columnScopeInstance, ComposableLambdaKt.rememberComposableLambda(2000500644, true, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1(sheetState, iyVar, unVar, z, Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer, 0), Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer, 0), Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer, 0), myVar), composer, 54), composer, 54);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1356009965);
            composer.endReplaceGroup();
        }
        nyVar.invoke(columnScopeInstance, composer, 6);
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
