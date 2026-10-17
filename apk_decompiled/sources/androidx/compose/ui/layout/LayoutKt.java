package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import defpackage.er;
import defpackage.fc;
import defpackage.iy;
import defpackage.my;
import defpackage.ny;
import defpackage.uo;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutKt {
    public static final int LargeDimension = 32767;

    public static final void Layout(List<? extends my> list, Modifier modifier, MultiContentMeasurePolicy multiContentMeasurePolicy, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        my combineAsVirtualLayouts = combineAsVirtualLayouts(list);
        boolean z = (((i & 896) ^ 384) > 256 && composer.changed(multiContentMeasurePolicy)) || (i & 384) == 256;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(rememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
        uo.h(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
        Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        combineAsVirtualLayouts.invoke(composer, 0);
        composer.endNode();
    }

    @er
    public static final void MultiMeasureLayout(Modifier modifier, my myVar, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1663319424);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(measurePolicy) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1663319424, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:241)");
            }
            int hashCode = Integer.hashCode(ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0));
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            iy constructor$ui = LayoutNode.Companion.getConstructor$ui();
            int i5 = ((i3 << 3) & 896) | 6;
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            uo.h(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3883initimpl(m3878constructorimpl, LayoutKt$MultiMeasureLayout$1$1.INSTANCE);
            Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
            if (fc.l(myVar, startRestartGroup, (i5 >> 6) & 14)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LayoutKt$MultiMeasureLayout$2(modifier2, myVar, measurePolicy, i, i2));
        }
    }

    public static final my combineAsVirtualLayouts(List<? extends my> list) {
        return ComposableLambdaKt.composableLambdaInstance(1271844412, true, new LayoutKt$combineAsVirtualLayouts$1(list));
    }

    @er
    public static final ny materializerOf(Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-2123382363, true, new LayoutKt$materializerOfWithCompositionLocalInjection$1(modifier));
    }

    public static final ny modifierMaterializerOf(Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-511438721, true, new LayoutKt$materializerOf$1(modifier));
    }

    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
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
        Updater.m3886setimpl(m3878constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
        composer.endNode();
    }

    public static final void Layout(my myVar, Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        iy constructor = companion.getConstructor();
        int i3 = ((i << 6) & 896) | 6;
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
        uo.h(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
        Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        myVar.invoke(composer, Integer.valueOf((i3 >> 6) & 14));
        composer.endNode();
    }
}
