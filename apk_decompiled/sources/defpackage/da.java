package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class da implements ny {
    public final /* synthetic */ Drawable d;
    public final /* synthetic */ String e;
    public final /* synthetic */ un f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    public da(Drawable drawable, String str, un unVar, String str2, Context context, MutableState mutableState, MutableState mutableState2) {
        this.d = drawable;
        this.e = str;
        this.f = unVar;
        this.g = str2;
        this.h = context;
        this.i = mutableState;
        this.j = mutableState2;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Composer composer;
        Composer composer2 = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ColumnScope) obj).getClass();
        if (composer2.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1020370566, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:991)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(16.0f));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m762padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
            uo.h(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Drawable drawable = this.d;
            String str2 = this.e;
            if (drawable != null) {
                composer2.startReplaceGroup(1050354828);
                kb.k(drawable, str2, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(40.0f)), composer2, 384);
                composer2.endReplaceGroup();
                composer = composer2;
                str = str2;
            } else {
                composer2.startReplaceGroup(1050773328);
                str = str2;
                composer = composer2;
                IconKt.m2055Iconww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(40.0f)), 0L, composer, 432, 8);
                composer.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion, Dp.m7611constructorimpl(16.0f)), composer, 6);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, weight$default);
            iy constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer);
            uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i = MaterialTheme.$stable;
            Composer composer3 = composer;
            TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i).getTitleMedium(), composer3, 0, 0, 131070);
            TextStyle bodySmall = materialTheme.getTypography(composer3, i).getBodySmall();
            long m1765getOnSurfaceVariant0d7_KjU = materialTheme.getColorScheme(composer3, i).m1765getOnSurfaceVariant0d7_KjU();
            String str3 = this.g;
            TextKt.m2607TextNvy7gAk(str3, null, m1765getOnSurfaceVariant0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer3, 0, 0, 131066);
            composer3.endNode();
            un unVar = this.f;
            boolean changedInstance = composer3.changedInstance(unVar) | composer3.changed(str3);
            Context context = this.h;
            boolean changedInstance2 = changedInstance | composer3.changedInstance(context);
            Object rememberedValue = composer3.rememberedValue();
            if (changedInstance2 || rememberedValue == Composer.Companion.getEmpty()) {
                ca caVar = new ca(unVar, str3, context, this.i, this.j);
                composer3.updateRememberedValue(caVar);
                rememberedValue = caVar;
            }
            ButtonKt.Button((iy) rememberedValue, null, false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), ButtonDefaults.INSTANCE.m1658buttonColorsro_MJ88(materialTheme.getColorScheme(composer3, i).m1748getError0d7_KjU(), 0L, 0L, 0L, composer3, ButtonDefaults.$stable << 12, 14), null, null, null, null, wk.l, composer3, 805306368, 486);
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return w01.a;
    }
}
