package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt$Year$2 implements my {
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ boolean $currentYear;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ String $text;

    public DatePickerKt$Year$2(String str, DatePickerColors datePickerColors, boolean z, boolean z2, boolean z3) {
        this.$text = str;
        this.$colors = datePickerColors;
        this.$currentYear = z;
        this.$selected = z2;
        this.$enabled = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$2$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-564400443, i, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2157)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment center = Alignment.Companion.getCenter();
        String str = this.$text;
        DatePickerColors datePickerColors = this.$colors;
        boolean z = this.$currentYear;
        boolean z2 = this.$selected;
        boolean z3 = this.$enabled;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d(5);
            composer.updateRememberedValue(rememberedValue);
        }
        TextKt.m2607TextNvy7gAk(str, SemanticsModifierKt.clearAndSetSemantics(companion, (ky) rememberedValue), datePickerColors.yearContentColor$material3(z, z2, z3, composer, 0).getValue().m4771unboximpl(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(TextAlign.Companion.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, 0, 0, 261112);
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
