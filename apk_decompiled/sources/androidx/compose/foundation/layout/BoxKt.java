package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fb0;
import defpackage.iy;
import defpackage.k4;
import defpackage.lf;
import defpackage.ny;
import defpackage.q10;
import defpackage.uo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoxKt {
    private static final fb0 Cache1 = cacheFor(true);
    private static final fb0 Cache2 = cacheFor(false);
    private static final MeasurePolicy DefaultBoxMeasurePolicy = new BoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
    private static final MeasurePolicy EmptyBoxMeasurePolicy = BoxKt$EmptyBoxMeasurePolicy$1.INSTANCE;

    public static final void Box(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-211209833);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            Updater.m3886setimpl(m3878constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            Updater.m3882initimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new lf(modifier, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Box$lambda$1(Modifier modifier, int i, Composer composer, int i2) {
        Box(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final fb0 cacheFor(boolean z) {
        fb0 fb0Var = new fb0(9);
        Alignment.Companion companion = Alignment.Companion;
        fb0Var.l(companion.getTopStart(), new BoxMeasurePolicy(companion.getTopStart(), z));
        fb0Var.l(companion.getTopCenter(), new BoxMeasurePolicy(companion.getTopCenter(), z));
        fb0Var.l(companion.getTopEnd(), new BoxMeasurePolicy(companion.getTopEnd(), z));
        fb0Var.l(companion.getCenterStart(), new BoxMeasurePolicy(companion.getCenterStart(), z));
        fb0Var.l(companion.getCenter(), new BoxMeasurePolicy(companion.getCenter(), z));
        fb0Var.l(companion.getCenterEnd(), new BoxMeasurePolicy(companion.getCenterEnd(), z));
        fb0Var.l(companion.getBottomStart(), new BoxMeasurePolicy(companion.getBottomStart(), z));
        fb0Var.l(companion.getBottomCenter(), new BoxMeasurePolicy(companion.getBottomCenter(), z));
        fb0Var.l(companion.getBottomEnd(), new BoxMeasurePolicy(companion.getBottomEnd(), z));
        return fb0Var;
    }

    private static final BoxChildDataNode getBoxChildDataNode(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildDataNode) {
            return (BoxChildDataNode) parentData;
        }
        return null;
    }

    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        if (boxChildDataNode != null) {
            return boxChildDataNode.getMatchParentSize();
        }
        return false;
    }

    public static final MeasurePolicy maybeCachedBoxMeasurePolicy(Alignment alignment, boolean z) {
        MeasurePolicy measurePolicy = (MeasurePolicy) (z ? Cache1 : Cache2).d(alignment);
        return measurePolicy == null ? new BoxMeasurePolicy(alignment, z) : measurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i, int i2, Alignment alignment) {
        Alignment alignment2;
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        Placeable.PlacementScope.m6303place70tqf50$default(placementScope, placeable, ((boxChildDataNode == null || (alignment2 = boxChildDataNode.getAlignment()) == null) ? alignment : alignment2).mo4178alignKFBX0sM(IntSize.m7777constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L)), IntSize.m7777constructorimpl((i2 & 4294967295L) | (i << 32)), layoutDirection), 0.0f, 2, null);
    }

    public static final MeasurePolicy rememberBoxMeasurePolicy(Alignment alignment, boolean z, Composer composer, int i) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (!q10.b(alignment, Alignment.Companion.getTopStart()) || z) {
            composer.startReplaceGroup(244380021);
            boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(alignment)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BoxMeasurePolicy(alignment, z);
                composer.updateRememberedValue(rememberedValue);
            }
            measurePolicy = (BoxMeasurePolicy) rememberedValue;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(244332343);
            composer.endReplaceGroup();
            measurePolicy = DefaultBoxMeasurePolicy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final void Box(Modifier modifier, Alignment alignment, boolean z, ny nyVar, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        MeasurePolicy maybeCachedBoxMeasurePolicy = maybeCachedBoxMeasurePolicy(alignment, z);
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
        uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
        nyVar.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endNode();
    }
}
