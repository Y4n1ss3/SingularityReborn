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
public final class ColumnKt {
    private static final MeasurePolicy DefaultColumnMeasurePolicy = new ColumnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart());

    public static final void Column(Modifier modifier, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, ny nyVar, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i2 & 4) != 0) {
            horizontal = Alignment.Companion.getStart();
        }
        MeasurePolicy columnMeasurePolicy = columnMeasurePolicy(vertical, horizontal, composer, (i >> 3) & 126);
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
        uo.h(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
        nyVar.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endNode();
    }

    public static final MeasurePolicy columnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Composer composer, int i) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (q10.b(vertical, Arrangement.INSTANCE.getTop()) && q10.b(horizontal, Alignment.Companion.getStart())) {
            composer.startReplaceGroup(-1446604504);
            composer.endReplaceGroup();
            measurePolicy = DefaultColumnMeasurePolicy;
        } else {
            composer.startReplaceGroup(-1446550657);
            boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(vertical)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ColumnMeasurePolicy(vertical, horizontal);
                composer.updateRememberedValue(rememberedValue);
            }
            measurePolicy = (ColumnMeasurePolicy) rememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final long createColumnConstraints(boolean z, int i, int i2, int i3, int i4) {
        return !z ? ConstraintsKt.Constraints(i2, i4, i, i3) : Constraints.Companion.m7572fitPrioritizingHeightZbe2FdA(i2, i4, i, i3);
    }

    public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
        return DefaultColumnMeasurePolicy;
    }

    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }
}
