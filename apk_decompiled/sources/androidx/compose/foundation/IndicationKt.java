package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ms;
import defpackage.xl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IndicationKt {
    private static final String IndicationInstanceDeprecationMessage = "IndicationInstance has been deprecated along with the rememberUpdatedInstance that returns it. Indication implementations should instead use Modifier.Node APIs, and should be returned from IndicationNodeFactory#create. For a migration guide and background information, please visit developer.android.com";
    private static final ProvidableCompositionLocal<Indication> LocalIndication = CompositionLocalKt.compositionLocalOf$default(null, new ms(4), 1, null);
    private static final String RememberUpdatedInstanceDeprecationMessage = "rememberUpdatedInstance has been deprecated - implementers should instead implement IndicationNodeFactory#create for improved performance and efficiency. Callers should check if the Indication is an IndicationNodeFactory, and call that API instead. For a migration guide and background information, please visit developer.android.com";

    public static final ProvidableCompositionLocal<Indication> getLocalIndication() {
        return LocalIndication;
    }

    public static final Modifier indication(Modifier modifier, InteractionSource interactionSource, Indication indication) {
        if (indication == null) {
            return modifier;
        }
        if (indication instanceof IndicationNodeFactory) {
            return modifier.then(new IndicationModifierElement(interactionSource, (IndicationNodeFactory) indication));
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new IndicationKt$indication$$inlined$debugInspectorInfo$1(interactionSource, indication) : InspectableValueKt.getNoInspectorInfo(), new xl(1, indication, interactionSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier indication$lambda$1(Indication indication, InteractionSource interactionSource, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-353972293);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
        }
        IndicationInstance rememberUpdatedInstance = indication.rememberUpdatedInstance(interactionSource, composer, 0);
        boolean changed = composer.changed(rememberUpdatedInstance);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new IndicationModifier(rememberUpdatedInstance);
            composer.updateRememberedValue(rememberedValue);
        }
        IndicationModifier indicationModifier = (IndicationModifier) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return indicationModifier;
    }
}
