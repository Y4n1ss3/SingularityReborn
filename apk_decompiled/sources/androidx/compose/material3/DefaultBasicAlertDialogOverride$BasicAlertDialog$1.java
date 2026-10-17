package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
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
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultBasicAlertDialogOverride$BasicAlertDialog$1 implements my {
    final /* synthetic */ BasicAlertDialogOverrideScope $this_BasicAlertDialog;

    public DefaultBasicAlertDialogOverride$BasicAlertDialog$1(BasicAlertDialogOverrideScope basicAlertDialogOverrideScope) {
        this.$this_BasicAlertDialog = basicAlertDialogOverrideScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 2;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163527043, i, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog.<anonymous> (AlertDialog.kt:165)");
        }
        Strings.Companion companion = Strings.Companion;
        String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_dialog), composer, 0);
        Modifier m811sizeInqDBjuR0$default = SizeKt.m811sizeInqDBjuR0$default(this.$this_BasicAlertDialog.getModifier(), AlertDialogKt.getDialogMinWidth(), 0.0f, AlertDialogKt.getDialogMaxWidth(), 0.0f, 10, null);
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changed = composer.changed(m2983getString2EP1pXo);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new s(m2983getString2EP1pXo, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier then = m811sizeInqDBjuR0$default.then(SemanticsModifierKt.semantics$default(companion2, false, (ky) rememberedValue, 1, null));
        BasicAlertDialogOverrideScope basicAlertDialogOverrideScope = this.$this_BasicAlertDialog;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, then);
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        iy constructor = companion3.getConstructor();
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
        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (fc.l(basicAlertDialogOverrideScope.getContent(), composer, 0)) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
