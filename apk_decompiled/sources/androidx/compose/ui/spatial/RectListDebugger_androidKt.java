package androidx.compose.ui.spatial;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectListDebugger_androidKt {
    public static final void RectListDebugger(Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(949081399);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(949081399, i3, -1, "androidx.compose.ui.spatial.RectListDebugger (RectListDebugger.android.kt:39)");
            }
            Modifier then = modifier.then(RectListDebuggerModifierElement.INSTANCE);
            EmptyFillMeasurePolicy emptyFillMeasurePolicy = EmptyFillMeasurePolicy.INSTANCE;
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            Updater.m3886setimpl(m3878constructorimpl, emptyFillMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new RectListDebugger_androidKt$RectListDebugger$1(modifier, i, i2));
        }
    }
}
