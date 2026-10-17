package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpacerKt {
    public static final void Spacer(Modifier modifier, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-72882467, i, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.INSTANCE;
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
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
        Updater.m3886setimpl(m3878constructorimpl, spacerMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        Updater.m3882initimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
