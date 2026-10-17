package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.fc;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.q10;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetContent$7$2$1 implements my {
    final /* synthetic */ iy $animateToDismiss;
    final /* synthetic */ String $collapseActionLabel;
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ my $dragHandle;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ un $scope;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ SheetState $sheetState;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Expanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ModalBottomSheetKt$ModalBottomSheetContent$7$2$1(SheetState sheetState, iy iyVar, un unVar, boolean z, String str, String str2, String str3, my myVar) {
        this.$sheetState = sheetState;
        this.$animateToDismiss = iyVar;
        this.$scope = unVar;
        this.$sheetGesturesEnabled = z;
        this.$dismissActionLabel = str;
        this.$expandActionLabel = str2;
        this.$collapseActionLabel = str3;
        this.$dragHandle = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SheetState sheetState, iy iyVar, un unVar) {
        int i = WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
        if (i == 1) {
            iyVar.invoke();
        } else if (i != 2) {
            p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2(sheetState, null), 3);
        } else {
            p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1(sheetState, null), 3);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$7$lambda$6(boolean z, SheetState sheetState, String str, String str2, String str3, iy iyVar, un unVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            int i = 4;
            SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new f(iyVar, i));
            if (sheetState.getCurrentValue() == SheetValue.PartiallyExpanded) {
                SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new k0(sheetState, unVar, sheetState));
            } else if (sheetState.getHasPartiallyExpandedState()) {
                SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new h(sheetState, unVar, i));
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7$lambda$6$lambda$5$lambda$2(iy iyVar) {
        iyVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7$lambda$6$lambda$5$lambda$3(SheetState sheetState, un unVar, SheetState sheetState2) {
        if (!((Boolean) sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(SheetValue.Expanded)).booleanValue()) {
            return true;
        }
        p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$2$1(sheetState2, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7$lambda$6$lambda$5$lambda$4(SheetState sheetState, un unVar) {
        if (!((Boolean) sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(SheetValue.PartiallyExpanded)).booleanValue()) {
            return true;
        }
        p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$3$1(sheetState, null), 3);
        return true;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2000500644, i, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:383)");
        }
        Modifier.Companion companion = Modifier.Companion;
        boolean changed = composer.changed(this.$sheetState) | composer.changed(this.$animateToDismiss) | composer.changedInstance(this.$scope);
        SheetState sheetState = this.$sheetState;
        iy iyVar = this.$animateToDismiss;
        un unVar = this.$scope;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new k0(sheetState, unVar, iyVar);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier m260clickableXHw0xAI$default = ClickableKt.m260clickableXHw0xAI$default(companion, false, null, null, (iy) rememberedValue, 7, null);
        boolean changed2 = composer.changed(this.$sheetGesturesEnabled) | composer.changed(this.$sheetState) | composer.changed(this.$dismissActionLabel) | composer.changed(this.$animateToDismiss) | composer.changed(this.$expandActionLabel) | composer.changedInstance(this.$scope) | composer.changed(this.$collapseActionLabel);
        final boolean z = this.$sheetGesturesEnabled;
        final SheetState sheetState2 = this.$sheetState;
        final String str = this.$dismissActionLabel;
        final String str2 = this.$expandActionLabel;
        final String str3 = this.$collapseActionLabel;
        final iy iyVar2 = this.$animateToDismiss;
        final un unVar2 = this.$scope;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            ky kyVar = new ky() { // from class: androidx.compose.material3.l0
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.invoke$lambda$7$lambda$6(z, sheetState2, str, str2, str3, iyVar2, unVar2, (SemanticsPropertyReceiver) obj);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(kyVar);
            rememberedValue2 = kyVar;
        }
        Modifier semantics = SemanticsModifierKt.semantics(m260clickableXHw0xAI$default, true, (ky) rememberedValue2);
        my myVar = this.$dragHandle;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics);
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
        if (fc.l(myVar, composer, 0)) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
