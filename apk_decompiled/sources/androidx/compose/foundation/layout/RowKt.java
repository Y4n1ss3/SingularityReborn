package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.iy;
import defpackage.k4;
import defpackage.ny;
import defpackage.q10;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RowKt {
    private static final MeasurePolicy DefaultRowMeasurePolicy = new RowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop());

    public static final void Row(Modifier modifier, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, ny nyVar, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i2 & 4) != 0) {
            vertical = Alignment.Companion.getTop();
        }
        MeasurePolicy rowMeasurePolicy = rowMeasurePolicy(horizontal, vertical, composer, (i >> 3) & 126);
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
        uo.h(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
        nyVar.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endNode();
    }

    public static final long createRowConstraints(boolean z, int i, int i2, int i3, int i4) {
        return !z ? ConstraintsKt.Constraints(i, i3, i2, i4) : Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA(i, i3, i2, i4);
    }

    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return DefaultRowMeasurePolicy;
    }

    public static final MeasurePolicy rowMeasurePolicy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Composer composer, int i) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-837807694, i, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:118)");
        }
        if (q10.b(horizontal, Arrangement.INSTANCE.getStart()) && q10.b(vertical, Alignment.Companion.getTop())) {
            composer.startReplaceGroup(-1073830487);
            composer.endReplaceGroup();
            measurePolicy = DefaultRowMeasurePolicy;
        } else {
            composer.startReplaceGroup(-1073779616);
            boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new RowMeasurePolicy(horizontal, vertical);
                composer.updateRememberedValue(rememberedValue);
            }
            measurePolicy = (RowMeasurePolicy) rememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }
}
