package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class yx0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ SharedPreferences g;

    public /* synthetic */ yx0(MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = mutableState2;
        this.g = sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.d;
        w01 w01Var = w01.a;
        SharedPreferences sharedPreferences = this.g;
        MutableState mutableState = this.f;
        MutableState mutableState2 = this.e;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1293414044, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3988)");
                    }
                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(16.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1709584362, true, new yx0(mutableState2, mutableState, sharedPreferences, 1), composer, 54), composer, 196614, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1709584362, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3992)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(20.0f)), 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(10.0f)), centerHorizontally, composer2, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                    uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i2 = ((gz) mutableState2.getValue()).a;
                    int i3 = ((i2 * 9) / 5) + 32;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme.getTypography(composer2, i4).getBodyMedium();
                    FontWeight.Companion companion4 = FontWeight.Companion;
                    TextKt.m2607TextNvy7gAk("GPU Monitor", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer2, 1572870, 0, 131006);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        str = i3 + " °F";
                    } else {
                        str = i2 + " °C";
                    }
                    TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, companion4.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getHeadlineMedium(), composer2, 1572864, 0, 131006);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composer2, 54);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                    iy constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion3, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m2607TextNvy7gAk("°C", null, materialTheme.getColorScheme(composer2, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyMedium(), composer2, 6, 0, 131066);
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changedInstance = composer2.changedInstance(sharedPreferences);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new c70(sharedPreferences, mutableState, 13);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, PaddingKt.m764paddingVpY3zN4$default(companion, Dp.m7611constructorimpl(8.0f), 0.0f, 2, null), null, false, null, null, composer2, 384, 120);
                    TextKt.m2607TextNvy7gAk("°F", null, materialTheme.getColorScheme(composer2, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyMedium(), composer2, 6, 0, 131066);
                    composer2.endNode();
                    DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, materialTheme.getColorScheme(composer2, i4).m1771getOutlineVariant0d7_KjU(), composer2, 0, 3);
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion2.getTop(), composer2, 6);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
                    iy constructor3 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion3, m3878constructorimpl3, rowMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion);
                    iy constructor4 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion3, m3878constructorimpl4, columnMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion3, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    TextKt.m2607TextNvy7gAk("Usage", null, materialTheme.getColorScheme(composer2, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getLabelSmall(), composer2, 6, 0, 131066);
                    TextKt.m2607TextNvy7gAk(((gz) mutableState2.getValue()).e + "%", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyMedium(), composer2, 1572864, 0, 131006);
                    composer2.endNode();
                    DividerKt.m1935VerticalDivider9IZ8Weo(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(48.0f)), 0.0f, materialTheme.getColorScheme(composer2, i4).m1771getOutlineVariant0d7_KjU(), composer2, 6, 2);
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion);
                    iy constructor5 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion3, m3878constructorimpl5, columnMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion3, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    TextKt.m2607TextNvy7gAk("Frequency", null, materialTheme.getColorScheme(composer2, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getLabelSmall(), composer2, 6, 0, 131066);
                    TextKt.m2607TextNvy7gAk(((gz) mutableState2.getValue()).c + " - " + ((gz) mutableState2.getValue()).d + " MHz", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyMedium(), composer2, 1572864, 0, 131006);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }
}
