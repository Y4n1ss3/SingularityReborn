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
public final class BottomSheetScaffoldKt$StandardBottomSheet$3$1$1 implements my {
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ my $dragHandle;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ String $partialExpandActionLabel;
    final /* synthetic */ un $scope;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ SheetState $state;

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

    public BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(SheetState sheetState, un unVar, boolean z, String str, String str2, String str3, my myVar) {
        this.$state = sheetState;
        this.$scope = unVar;
        this.$sheetSwipeEnabled = z;
        this.$expandActionLabel = str;
        this.$partialExpandActionLabel = str2;
        this.$dismissActionLabel = str3;
        this.$dragHandle = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SheetState sheetState, un unVar) {
        int i = WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
        if (i == 1) {
            p01.t(unVar, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1(sheetState, null), 3);
        } else if (i != 2) {
            p01.t(unVar, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3(sheetState, null), 3);
        } else {
            p01.t(unVar, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2(sheetState, null), 3);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$7$lambda$6(SheetState sheetState, boolean z, String str, String str2, String str3, un unVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        int i = 1;
        if (sheetState.getAnchoredDraggableState$material3().getAnchors().getSize() > 1 && z) {
            SheetValue currentValue = sheetState.getCurrentValue();
            SheetValue sheetValue = SheetValue.PartiallyExpanded;
            if (currentValue == sheetValue) {
                if (((Boolean) sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(SheetValue.Expanded)).booleanValue()) {
                    SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new h(0, unVar, sheetState));
                }
            } else if (((Boolean) sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(sheetValue)).booleanValue()) {
                SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new h(i, unVar, sheetState));
            }
            if (!sheetState.getSkipHiddenState$material3()) {
                SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new h(2, unVar, sheetState));
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7$lambda$6$lambda$5$lambda$2(un unVar, SheetState sheetState) {
        p01.t(unVar, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$1$1(sheetState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7$lambda$6$lambda$5$lambda$3(un unVar, SheetState sheetState) {
        p01.t(unVar, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$2$1(sheetState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7$lambda$6$lambda$5$lambda$4(un unVar, SheetState sheetState) {
        p01.t(unVar, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$3$1(sheetState, null), 3);
        return true;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511691176, i, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:336)");
        }
        Modifier.Companion companion = Modifier.Companion;
        boolean changed = composer.changed(this.$state) | composer.changedInstance(this.$scope);
        SheetState sheetState = this.$state;
        un unVar = this.$scope;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new h(sheetState, unVar, 3);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier m260clickableXHw0xAI$default = ClickableKt.m260clickableXHw0xAI$default(companion, false, null, null, (iy) rememberedValue, 7, null);
        boolean changed2 = composer.changed(this.$state) | composer.changed(this.$sheetSwipeEnabled) | composer.changed(this.$expandActionLabel) | composer.changedInstance(this.$scope) | composer.changed(this.$partialExpandActionLabel) | composer.changed(this.$dismissActionLabel);
        final SheetState sheetState2 = this.$state;
        final boolean z = this.$sheetSwipeEnabled;
        final String str = this.$expandActionLabel;
        final String str2 = this.$partialExpandActionLabel;
        final String str3 = this.$dismissActionLabel;
        final un unVar2 = this.$scope;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            ky kyVar = new ky() { // from class: androidx.compose.material3.i
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.invoke$lambda$7$lambda$6(SheetState.this, z, str, str2, str3, unVar2, (SemanticsPropertyReceiver) obj);
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
