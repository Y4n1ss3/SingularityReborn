package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class b3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final SharedPreferences sharedPreferences, final ky kyVar, iy iyVar, Composer composer, int i) {
        int i2;
        Composer composer2;
        un unVar;
        int i3;
        sharedPreferences.getClass();
        kyVar.getClass();
        iyVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(1016665139);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(sharedPreferences) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1016665139, i2, -1, "com.lumi.singularity.ui.activities.AdbScreen (AdbActivity.kt:82)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            un unVar2 = (un) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState = (MutableState) rememberedValue2;
            final ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            final ScrollState rememberScrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue5;
            String str2 = (String) mutableState.getValue();
            boolean changed = startRestartGroup.changed(rememberScrollState2);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue6 == companion.getEmpty()) {
                unVar = unVar2;
                i3 = 0;
                rememberedValue6 = new v2(rememberScrollState2, null, i3);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                unVar = unVar2;
                i3 = 0;
            }
            EffectsKt.LaunchedEffect(str2, (my) rememberedValue6, startRestartGroup, i3);
            final un unVar3 = unVar;
            composer2 = startRestartGroup;
            ScaffoldKt.m2300ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1002662135, true, new l2(i3, iyVar), startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1078872002, true, new ny() { // from class: o2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    un unVar4;
                    MutableState mutableState5;
                    MutableState mutableState6;
                    MutableState mutableState7;
                    MutableState mutableState8;
                    MutableState mutableState9;
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer3 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    paddingValues.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if (composer3.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1078872002, intValue, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous> (AdbActivity.kt:116)");
                        }
                        Modifier.Companion companion2 = Modifier.Companion;
                        Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.m763paddingVpY3zN4(PaddingKt.padding(companion2, paddingValues), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(8.0f)), 0.0f, 1, null), ScrollState.this, false, null, false, 14, null);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f)), Alignment.Companion.getStart(), composer3, 6);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, verticalScroll$default);
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
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                        CardDefaults cardDefaults = CardDefaults.INSTANCE;
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i4 = MaterialTheme.$stable;
                        long m1778getSecondaryContainer0d7_KjU = materialTheme.getColorScheme(composer3, i4).m1778getSecondaryContainer0d7_KjU();
                        int i5 = CardDefaults.$stable << 12;
                        CardKt.Card(fillMaxWidth$default, m1056RoundedCornerShape0680j_4, cardDefaults.m1678cardColorsro_MJ88(m1778getSecondaryContainer0d7_KjU, 0L, 0L, 0L, composer3, i5, 14), null, null, uk.c, composer3, 196614, 24);
                        CardKt.Card(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), cardDefaults.m1678cardColorsro_MJ88(materialTheme.getColorScheme(composer3, i4).m1790getSurfaceVariant0d7_KjU(), 0L, 0L, 0L, composer3, i5, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1779672387, true, new q2(str, 0), composer3, 54), composer3, 196614, 24);
                        TextKt.m2607TextNvy7gAk("3. That command returns almost instantly on its own -- it starts a background helper on the headset and exits. You can leave the cable connected or unplug it. Once it's done, tap Check below.", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 0, 0, 131070);
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                        MutableState mutableState10 = mutableState2;
                        boolean booleanValue = ((Boolean) mutableState10.getValue()).booleanValue();
                        MutableState mutableState11 = mutableState3;
                        boolean z = (booleanValue || ((Boolean) mutableState11.getValue()).booleanValue()) ? false : true;
                        un unVar5 = unVar3;
                        boolean changedInstance = composer3.changedInstance(unVar5);
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        boolean changedInstance2 = changedInstance | composer3.changedInstance(sharedPreferences2);
                        Object rememberedValue7 = composer3.rememberedValue();
                        MutableState mutableState12 = mutableState4;
                        MutableState mutableState13 = mutableState;
                        if (changedInstance2 || rememberedValue7 == Composer.Companion.getEmpty()) {
                            unVar4 = unVar5;
                            mutableState5 = mutableState11;
                            mutableState6 = mutableState12;
                            mutableState7 = mutableState13;
                            rememberedValue7 = new r2(unVar4, mutableState10, mutableState5, mutableState6, sharedPreferences2, mutableState7, 0);
                            composer3.updateRememberedValue(rememberedValue7);
                        } else {
                            unVar4 = unVar5;
                            mutableState5 = mutableState11;
                            mutableState6 = mutableState12;
                            mutableState7 = mutableState13;
                        }
                        un unVar6 = unVar4;
                        ButtonKt.Button((iy) rememberedValue7, fillMaxWidth$default2, z, m1056RoundedCornerShape0680j_42, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1085156964, true, new s2(mutableState10, 0), composer3, 54), composer3, 805306416, 496);
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        RoundedCornerShape m1056RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                        boolean z2 = (((Boolean) mutableState10.getValue()).booleanValue() || ((Boolean) mutableState5.getValue()).booleanValue() || !((Boolean) mutableState6.getValue()).booleanValue()) ? false : true;
                        boolean changedInstance3 = composer3.changedInstance(unVar6);
                        ky kyVar2 = kyVar;
                        boolean changedInstance4 = changedInstance3 | composer3.changedInstance(kyVar2);
                        Object rememberedValue8 = composer3.rememberedValue();
                        if (changedInstance4 || rememberedValue8 == Composer.Companion.getEmpty()) {
                            rememberedValue8 = new r2(unVar6, mutableState10, mutableState5, mutableState6, kyVar2, mutableState7, 1);
                            mutableState8 = mutableState5;
                            mutableState9 = mutableState6;
                            composer3.updateRememberedValue(rememberedValue8);
                        } else {
                            mutableState8 = mutableState5;
                            mutableState9 = mutableState6;
                        }
                        ButtonKt.Button((iy) rememberedValue8, fillMaxWidth$default3, z2, m1056RoundedCornerShape0680j_43, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1152406651, true, new t2(mutableState9, mutableState8, 0), composer3, 54), composer3, 805306416, 496);
                        TextKt.m2607TextNvy7gAk("Logs", null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getLabelSmall(), composer3, 6, 0, 131066);
                        CardKt.Card(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m7611constructorimpl(250.0f)), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), cardDefaults.m1678cardColorsro_MJ88(materialTheme.getColorScheme(composer3, i4).m1790getSurfaceVariant0d7_KjU(), 0L, 0L, 0L, composer3, i5, 14), null, null, ComposableLambdaKt.rememberComposableLambda(399887074, true, new u2(rememberScrollState2, mutableState7, 0), composer3, 54), composer3, 196614, 24);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return w01.a;
                }
            }, startRestartGroup, 54), composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p2(str, sharedPreferences, kyVar, iyVar, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(MutableState mutableState, String str) {
        mutableState.setValue(((String) mutableState.getValue()) + "> " + str + "\n");
        Log.i("SingularitySetup", str);
    }
}
