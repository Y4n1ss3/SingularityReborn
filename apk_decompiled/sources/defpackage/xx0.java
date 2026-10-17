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
public final /* synthetic */ class xx0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ MutableState h;

    public /* synthetic */ xx0(MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, MutableState mutableState3, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = mutableState2;
        this.g = sharedPreferences;
        this.h = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Composer composer;
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                boolean z = false;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (!composer2.shouldExecute(z, intValue & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1692126811, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3682)");
                    }
                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(16.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(2108297129, true, new xx0(this.e, this.f, this.g, this.h, 1), composer2, 54), composer2, 196614, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer3.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2108297129, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3686)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(20.0f)), 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(10.0f)), centerHorizontally, composer3, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                    uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MutableState mutableState = this.e;
                    int i2 = ((ao) mutableState.getValue()).a;
                    int i3 = ((i2 * 9) / 5) + 32;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme.getTypography(composer3, i4).getBodyMedium();
                    FontWeight.Companion companion4 = FontWeight.Companion;
                    TextKt.m2607TextNvy7gAk("CPU Monitor", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer3, 1572870, 0, 131006);
                    MutableState mutableState2 = this.f;
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        str = i3 + " °F";
                    } else {
                        str = i2 + " °C";
                    }
                    TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, companion4.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getHeadlineMedium(), composer3, 1572864, 0, 131006);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composer3, 54);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion);
                    iy constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                    uo.h(companion3, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m2607TextNvy7gAk("°C", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodyMedium(), composer3, 6, 0, 131066);
                    boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                    SharedPreferences sharedPreferences = this.g;
                    boolean changedInstance = composer3.changedInstance(sharedPreferences);
                    Object rememberedValue = composer3.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new c70(sharedPreferences, mutableState2, 12);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, PaddingKt.m764paddingVpY3zN4$default(companion, Dp.m7611constructorimpl(8.0f), 0.0f, 2, null), null, false, null, null, composer3, 384, 120);
                    TextKt.m2607TextNvy7gAk("°F", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodyMedium(), composer3, 6, 0, 131066);
                    composer3.endNode();
                    DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, materialTheme.getColorScheme(composer3, i4).m1771getOutlineVariant0d7_KjU(), composer3, 0, 3);
                    if (((Boolean) this.h.getValue()).booleanValue()) {
                        composer3.startReplaceGroup(-1549895647);
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion2.getTop(), composer3, 6);
                        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                        iy constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl3, rowMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer3, 48);
                        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion);
                        iy constructor4 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl4, columnMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion3, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                        TextKt.m2607TextNvy7gAk("Big Core", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getLabelMedium(), composer3, 6, 0, 131066);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).j + "%", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodyMedium(), composer3, 1572864, 0, 131006);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).f + " - " + ((ao) mutableState.getValue()).g + " MHz", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 0, 0, 131066);
                        composer3.endNode();
                        DividerKt.m1935VerticalDivider9IZ8Weo(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(64.0f)), 0.0f, materialTheme.getColorScheme(composer3, i4).m1771getOutlineVariant0d7_KjU(), composer3, 6, 2);
                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer3, 48);
                        int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer3, companion);
                        iy constructor5 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl5, columnMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap5);
                        Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion3, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                        TextKt.m2607TextNvy7gAk("Middle Cores", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getLabelMedium(), composer3, 6, 0, 131066);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).i + "%", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodyMedium(), composer3, 1572864, 0, 131006);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).d + " - " + ((ao) mutableState.getValue()).e + " MHz", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 0, 0, 131066);
                        composer3.endNode();
                        DividerKt.m1935VerticalDivider9IZ8Weo(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(64.0f)), 0.0f, materialTheme.getColorScheme(composer3, i4).m1771getOutlineVariant0d7_KjU(), composer3, 6, 2);
                        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer3, 48);
                        int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer3, companion);
                        iy constructor6 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor6);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl6, columnMeasurePolicy4, m3878constructorimpl6, currentCompositionLocalMap6);
                        Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion3, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                        composer = composer3;
                        TextKt.m2607TextNvy7gAk("Little Cores", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getLabelMedium(), composer, 6, 0, 131066);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).h + "%", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodyMedium(), composer, 1572864, 0, 131006);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).b + " - " + ((ao) mutableState.getValue()).c + " MHz", null, materialTheme.getColorScheme(composer, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodySmall(), composer, 0, 0, 131066);
                        composer.endNode();
                        composer.endNode();
                        composer.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1546952166);
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion2.getTop(), composer3, 6);
                        int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default3);
                        iy constructor7 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor7);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl7, rowMeasurePolicy3, m3878constructorimpl7, currentCompositionLocalMap7);
                        Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion3, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                        MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer3, 48);
                        int hashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer3, companion);
                        iy constructor8 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor8);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl8 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl8, columnMeasurePolicy5, m3878constructorimpl8, currentCompositionLocalMap8);
                        Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, k4.c(companion3, m3878constructorimpl8, Integer.valueOf(hashCode8), m3878constructorimpl8));
                        TextKt.m2607TextNvy7gAk("Big Cores", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getLabelMedium(), composer3, 6, 0, 131066);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).j + "%", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodyMedium(), composer3, 1572864, 0, 131006);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).f + " - " + ((ao) mutableState.getValue()).g + " MHz", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 0, 0, 131066);
                        composer3.endNode();
                        DividerKt.m1935VerticalDivider9IZ8Weo(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(48.0f)), 0.0f, materialTheme.getColorScheme(composer3, i4).m1771getOutlineVariant0d7_KjU(), composer3, 6, 2);
                        MeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer3, 48);
                        int hashCode9 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer3, companion);
                        iy constructor9 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor9);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl9 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl9, columnMeasurePolicy6, m3878constructorimpl9, currentCompositionLocalMap9);
                        Updater.m3886setimpl(m3878constructorimpl9, materializeModifier9, k4.c(companion3, m3878constructorimpl9, Integer.valueOf(hashCode9), m3878constructorimpl9));
                        composer = composer3;
                        TextKt.m2607TextNvy7gAk("LITTLE Cores", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getLabelMedium(), composer, 6, 0, 131066);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).h + "%", null, 0L, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodyMedium(), composer, 1572864, 0, 131006);
                        TextKt.m2607TextNvy7gAk(((ao) mutableState.getValue()).b + " - " + ((ao) mutableState.getValue()).c + " MHz", null, materialTheme.getColorScheme(composer, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodySmall(), composer, 0, 0, 131066);
                        composer.endNode();
                        composer.endNode();
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
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
