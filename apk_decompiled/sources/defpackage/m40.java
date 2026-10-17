package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class m40 {
    public static final void a(final String str, final float f, final long j, final ky kyVar, Composer composer, final int i) {
        int i2;
        float f2;
        kyVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-307635616);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-307635616, i2, -1, "com.lumi.singularity.ui.activities.ColorSlider (LedColorActivity.kt:153)");
            }
            final float f3 = f2;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1159165906, true, new ny() { // from class: h40
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ColumnScope) obj).getClass();
                    if (composer2.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1159165906, intValue, -1, "com.lumi.singularity.ui.activities.ColorSlider.<anonymous> (LedColorActivity.kt:158)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(companion, Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(4.0f));
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m647spacedBy0680j_4, companion2.getStart(), composer2, 6);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m763paddingVpY3zN4);
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
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer2, 54);
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i3 = MaterialTheme.$stable;
                        TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodyMedium(), composer2, 1572864, 0, 131006);
                        float f4 = f3;
                        TextKt.m2607TextNvy7gAk(String.valueOf((int) f4), null, materialTheme.getColorScheme(composer2, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodyMedium(), composer2, 0, 0, 131066);
                        composer2.endNode();
                        ti tiVar = new ti(0.0f, 255.0f);
                        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                        long j2 = j;
                        SliderKt.Slider(f4, kyVar, null, false, tiVar, 254, null, sliderDefaults.m2418colorsq0g_0yA(j2, j2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 6, 1020), null, composer2, 196608, 332);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: i40
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m40.a(str, f, j, kyVar, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return w01.a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2126163649);
        if (startRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126163649, i, -1, "com.lumi.singularity.ui.activities.LedColorScreen (LedColorActivity.kt:47)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = context.getSharedPreferences("singularity_prefs", 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final SharedPreferences sharedPreferences = (SharedPreferences) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            int i3 = 2;
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(sharedPreferences.getInt("led_red", 255)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(sharedPreferences.getInt("led_green", 255)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(sharedPreferences.getInt("led_blue", 255)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue4;
            final long Color$default = ColorKt.Color$default((int) ((Number) mutableState.getValue()).floatValue(), (int) ((Number) mutableState2.getValue()).floatValue(), (int) ((Number) mutableState3.getValue()).floatValue(), 0, 8, null);
            final String format = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((Number) mutableState.getValue()).floatValue()), Integer.valueOf((int) ((Number) mutableState2.getValue()).floatValue()), Integer.valueOf((int) ((Number) mutableState3.getValue()).floatValue())}, 3));
            final Activity activity2 = activity;
            i2 = 0;
            ScaffoldKt.m2300ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(104275325, true, new g8(activity, i3), startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1243614638, true, new ny() { // from class: j40
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    paddingValues.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= composer2.changed(paddingValues) ? 4 : 2;
                    }
                    if (composer2.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1243614638, intValue, -1, "com.lumi.singularity.ui.activities.LedColorScreen.<anonymous> (LedColorActivity.kt:71)");
                        }
                        Modifier.Companion companion2 = Modifier.Companion;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m762padding3ABfNKs(PaddingKt.padding(companion2, paddingValues), Dp.m7611constructorimpl(16.0f)), 0.0f, 1, null);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f)), Alignment.Companion.getStart(), composer2, 6);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(16.0f));
                        final String str = format;
                        final long j = Color$default;
                        CardKt.Card(fillMaxWidth$default, m1056RoundedCornerShape0680j_4, null, null, null, ComposableLambdaKt.rememberComposableLambda(1869306938, true, new ny() { // from class: l40
                            @Override // defpackage.ny
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((ColumnScope) obj4).getClass();
                                if (composer3.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1869306938, intValue2, -1, "com.lumi.singularity.ui.activities.LedColorScreen.<anonymous>.<anonymous>.<anonymous> (LedColorActivity.kt:82)");
                                    }
                                    Modifier.Companion companion4 = Modifier.Companion;
                                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m762padding3ABfNKs(companion4, Dp.m7611constructorimpl(20.0f)), 0.0f, 1, null);
                                    Alignment.Companion companion5 = Alignment.Companion;
                                    Alignment.Horizontal centerHorizontally = companion5.getCenterHorizontally();
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(10.0f)), centerHorizontally, composer3, 54);
                                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                                    iy constructor2 = companion6.getConstructor();
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
                                    uo.h(companion6, m3878constructorimpl2, columnMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion6, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    BoxKt.Box(BackgroundKt.m227backgroundbw27NRU$default(ClipKt.clip(SizeKt.m807size3ABfNKs(companion4, Dp.m7611constructorimpl(72.0f)), RoundedCornerShapeKt.getCircleShape()), j, null, 2, null), composer3, 0);
                                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getCenterHorizontally(), composer3, 48);
                                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion4);
                                    iy constructor3 = companion6.getConstructor();
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
                                    uo.h(companion6, m3878constructorimpl3, columnMeasurePolicy3, m3878constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion6, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i4 = MaterialTheme.$stable;
                                    TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getTitleMedium(), composer3, 1572864, 0, 130878);
                                    TextKt.m2607TextNvy7gAk("LED Color Preview", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodyMedium(), composer3, 6, 0, 131066);
                                    composer3.endNode();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return w01.a;
                            }
                        }, composer2, 54), composer2, 196614, 28);
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i4 = MaterialTheme.$stable;
                        TextKt.m2607TextNvy7gAk("Channels", null, materialTheme.getColorScheme(composer2, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyLarge(), composer2, 6, 0, 131066);
                        MutableState mutableState4 = mutableState;
                        float floatValue = ((Number) mutableState4.getValue()).floatValue();
                        Color.Companion companion4 = Color.Companion;
                        long m4795getRed0d7_KjU = companion4.m4795getRed0d7_KjU();
                        Object rememberedValue5 = composer2.rememberedValue();
                        Composer.Companion companion5 = Composer.Companion;
                        if (rememberedValue5 == companion5.getEmpty()) {
                            rememberedValue5 = new i3(mutableState4, 9);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        m40.a("Red", floatValue, m4795getRed0d7_KjU, (ky) rememberedValue5, composer2, 3462);
                        MutableState mutableState5 = mutableState2;
                        float floatValue2 = ((Number) mutableState5.getValue()).floatValue();
                        long m4792getGreen0d7_KjU = companion4.m4792getGreen0d7_KjU();
                        Object rememberedValue6 = composer2.rememberedValue();
                        if (rememberedValue6 == companion5.getEmpty()) {
                            rememberedValue6 = new i3(mutableState5, 10);
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        m40.a("Green", floatValue2, m4792getGreen0d7_KjU, (ky) rememberedValue6, composer2, 3462);
                        MutableState mutableState6 = mutableState3;
                        float floatValue3 = ((Number) mutableState6.getValue()).floatValue();
                        long m4788getBlue0d7_KjU = companion4.m4788getBlue0d7_KjU();
                        Object rememberedValue7 = composer2.rememberedValue();
                        if (rememberedValue7 == companion5.getEmpty()) {
                            rememberedValue7 = new i3(mutableState6, 11);
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        m40.a("Blue", floatValue3, m4788getBlue0d7_KjU, (ky) rememberedValue7, composer2, 3462);
                        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, companion2, 1.0f, false, 2, null), composer2, 0);
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        boolean changedInstance = composer2.changedInstance(sharedPreferences2);
                        Activity activity3 = activity2;
                        boolean changedInstance2 = changedInstance | composer2.changedInstance(activity3);
                        Object rememberedValue8 = composer2.rememberedValue();
                        if (changedInstance2 || rememberedValue8 == companion5.getEmpty()) {
                            o9 o9Var = new o9(sharedPreferences2, activity3, mutableState4, mutableState5, mutableState6, 1);
                            composer2.updateRememberedValue(o9Var);
                            rememberedValue8 = o9Var;
                        }
                        ButtonKt.Button((iy) rememberedValue8, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, dl.f, composer2, 805306416, 500);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i2 = 0;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k40(i, i2));
        }
    }
}
