package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
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
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$4 implements my {
    final /* synthetic */ iy $animateToDismiss;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ ny $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ my $contentWindowInsets;
    final /* synthetic */ my $dragHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
    final /* synthetic */ ModalBottomSheetProperties $properties;
    final /* synthetic */ un $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ ky $settleToDismiss;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetMaxWidth;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ float $tonalElevation;

    public ModalBottomSheetKt$ModalBottomSheet$4(long j, iy iyVar, SheetState sheetState, ModalBottomSheetProperties modalBottomSheetProperties, Animatable<Float, AnimationVector1D> animatable, un unVar, ky kyVar, Modifier modifier, float f, boolean z, Shape shape, long j2, long j3, float f2, my myVar, my myVar2, ny nyVar) {
        this.$scrimColor = j;
        this.$animateToDismiss = iyVar;
        this.$sheetState = sheetState;
        this.$properties = modalBottomSheetProperties;
        this.$predictiveBackProgress = animatable;
        this.$scope = unVar;
        this.$settleToDismiss = kyVar;
        this.$modifier = modifier;
        this.$sheetMaxWidth = f;
        this.$sheetGesturesEnabled = z;
        this.$shape = shape;
        this.$containerColor = j2;
        this.$contentColor = j3;
        this.$tonalElevation = f2;
        this.$dragHandle = myVar;
        this.$contentWindowInsets = myVar2;
        this.$content = nyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d8, code lost:
    
        if (defpackage.q10.b(r6.rememberedValue(), java.lang.Integer.valueOf(r2)) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        ComposeUiNode.Companion companion;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010026864, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:185)");
        }
        Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null));
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d(13);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(imePadding, false, (ky) rememberedValue, 1, null);
        long j = this.$scrimColor;
        iy iyVar = this.$animateToDismiss;
        SheetState sheetState = this.$sheetState;
        ModalBottomSheetProperties modalBottomSheetProperties = this.$properties;
        Animatable<Float, AnimationVector1D> animatable = this.$predictiveBackProgress;
        un unVar = this.$scope;
        ky kyVar = this.$settleToDismiss;
        Modifier modifier = this.$modifier;
        float f = this.$sheetMaxWidth;
        boolean z = this.$sheetGesturesEnabled;
        Shape shape = this.$shape;
        long j2 = this.$containerColor;
        long j3 = this.$contentColor;
        float f2 = this.$tonalElevation;
        my myVar = this.$dragHandle;
        my myVar2 = this.$contentWindowInsets;
        ny nyVar = this.$content;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
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
        if (m3878constructorimpl.getInserting()) {
            companion = companion2;
        } else {
            companion = companion2;
        }
        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ModalBottomSheetKt.m2148ScrimKTwxG1Y(j, iyVar, sheetState.getTargetValue() != SheetValue.Hidden, modalBottomSheetProperties.shouldDismissOnClickOutside(), composer, 0);
        ModalBottomSheetKt.m2147ModalBottomSheetContent7e2Q(boxScopeInstance, animatable, unVar, iyVar, kyVar, modifier, sheetState, f, z, shape, j2, j3, f2, myVar, myVar2, nyVar, composer, (Animatable.$stable << 3) | 6, 0, 0);
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
