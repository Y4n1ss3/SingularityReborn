package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.lumi.singularity.ui.activities.AdbRootActivity;
import java.io.File;
import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class j4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.SnapshotMutationPolicy, hm, java.lang.Object] */
    public static final void a(final boolean z, final String str, final boolean z2, final boolean z3, final boolean z4, final c3 c3Var, final SharedPreferences sharedPreferences, final iy iyVar, final iy iyVar2, Composer composer, final int i) {
        int i2;
        boolean z5;
        Composer composer2;
        hm hmVar;
        int i3;
        int i4;
        Boolean bool;
        Composer composer3;
        MutableState mutableState;
        int i5;
        ScrollState scrollState;
        int i6;
        int i7;
        int i8;
        int i9;
        MutableState mutableState2;
        MutableState mutableState3;
        boolean z6;
        iyVar.getClass();
        iyVar2.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-228784869);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i2 |= startRestartGroup.changed(z5) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & Fields.ColorFilter) == 0 ? startRestartGroup.changed(c3Var) : startRestartGroup.changedInstance(c3Var) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(sharedPreferences) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 38339731) != 38339730, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-228784869, i2, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen (AdbRootActivity.kt:149)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final un unVar = (un) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = uo.a(sharedPreferences.getBoolean("use_auto_adb", false), null, 2, null, startRestartGroup);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState5 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState6 = (MutableState) rememberedValue4;
            final ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            ScrollState rememberScrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState7 = (MutableState) rememberedValue5;
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                hmVar = 0;
                i3 = 2;
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                hmVar = 0;
                i3 = 2;
            }
            final MutableState mutableState8 = (MutableState) rememberedValue6;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", hmVar, i3, hmVar);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final MutableState mutableState9 = (MutableState) rememberedValue7;
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", hmVar, i3, hmVar);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            final MutableState mutableState10 = (MutableState) rememberedValue8;
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == companion.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, hmVar, i3, hmVar);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            final MutableState mutableState11 = (MutableState) rememberedValue9;
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", hmVar, i3, hmVar);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState12 = (MutableState) rememberedValue10;
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == companion.getEmpty()) {
                rememberedValue11 = ((AdbRootActivity) c3Var).getDir("adb_keys", 0).getAbsolutePath();
                rememberedValue11.getClass();
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            final String str2 = (String) rememberedValue11;
            boolean changedInstance = startRestartGroup.changedInstance(context);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue12 == companion.getEmpty()) {
                rememberedValue12 = new o3((Object) context, (Serializable) str2, (Object) mutableState6, hmVar, 0);
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue12, startRestartGroup, 6);
            String str3 = (String) mutableState6.getValue();
            boolean changed = startRestartGroup.changed(rememberScrollState2);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue13 == companion.getEmpty()) {
                i4 = 1;
                rememberedValue13 = new v2(rememberScrollState2, hmVar, i4);
                startRestartGroup.updateRememberedValue(rememberedValue13);
            } else {
                i4 = 1;
            }
            EffectsKt.LaunchedEffect(str3, (my) rememberedValue13, startRestartGroup, 0);
            Boolean valueOf = Boolean.valueOf(z5);
            int i10 = i2 & 896;
            int i11 = (i10 == 256 ? i4 : 0) | (startRestartGroup.changedInstance(context) ? 1 : 0);
            int i12 = i2 & 458752;
            int i13 = i11 | ((i12 == 131072 || ((i2 & Fields.ColorFilter) != 0 && startRestartGroup.changedInstance(c3Var))) ? i4 : 0);
            int i14 = i2 & 14;
            int i15 = i13 | (i14 == 4 ? i4 : 0);
            int i16 = i2 & 234881024;
            int i17 = i15 | (i16 == 67108864 ? i4 : 0);
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (i17 != 0 || rememberedValue14 == companion.getEmpty()) {
                bool = valueOf;
                composer3 = startRestartGroup;
                mutableState = mutableState12;
                i5 = i16;
                scrollState = rememberScrollState2;
                i6 = i12;
                i7 = i10;
                i8 = i14;
                i9 = i2;
                mutableState2 = mutableState7;
                r3 r3Var = new r3(z5, context, c3Var, str2, z, iyVar2, mutableState5, mutableState6, mutableState4, mutableState2, mutableState, null, 0);
                mutableState3 = mutableState5;
                mutableState4 = mutableState4;
                composer3.updateRememberedValue(r3Var);
                rememberedValue14 = r3Var;
            } else {
                bool = valueOf;
                composer3 = startRestartGroup;
                mutableState = mutableState12;
                i9 = i2;
                mutableState2 = mutableState7;
                i5 = i16;
                scrollState = rememberScrollState2;
                i6 = i12;
                i7 = i10;
                i8 = i14;
                mutableState3 = mutableState5;
            }
            EffectsKt.LaunchedEffect(bool, (my) rememberedValue14, composer3, (i9 >> 6) & 14);
            Boolean bool2 = (Boolean) mutableState4.getValue();
            bool2.getClass();
            boolean changedInstance2 = composer3.changedInstance(context) | (i7 == 256) | (i6 == 131072 || ((i9 & Fields.ColorFilter) != 0 && composer3.changedInstance(c3Var))) | (i8 == 4) | (i5 == 67108864);
            Object rememberedValue15 = composer3.rememberedValue();
            if (changedInstance2 || rememberedValue15 == companion.getEmpty()) {
                z6 = z;
                r3 r3Var2 = new r3(z2, context, c3Var, str2, z6, iyVar2, mutableState4, mutableState3, mutableState6, mutableState2, mutableState, null, 1);
                composer3.updateRememberedValue(r3Var2);
                rememberedValue15 = r3Var2;
            } else {
                z6 = z;
            }
            EffectsKt.LaunchedEffect(bool2, (my) rememberedValue15, composer3, 0);
            final boolean z7 = z6;
            final MutableState mutableState13 = mutableState4;
            final MutableState mutableState14 = mutableState2;
            final MutableState mutableState15 = mutableState;
            Composer composer4 = composer3;
            final ScrollState scrollState2 = scrollState;
            ScaffoldKt.m2300ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(326132183, true, new f3(0, str, z6, iyVar), composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-146330324, true, new ny() { // from class: k3
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r0v18 */
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MutableState mutableState16;
                    Modifier.Companion companion2;
                    int i18;
                    Object obj4;
                    boolean z8;
                    MutableState mutableState17;
                    un unVar2;
                    SharedPreferences sharedPreferences2;
                    MaterialTheme materialTheme;
                    int i19;
                    boolean z9;
                    Composer composer5;
                    un unVar3;
                    MutableState mutableState18;
                    c3 c3Var2;
                    MutableState mutableState19;
                    boolean z10;
                    boolean z11;
                    boolean changedInstance3;
                    Object rememberedValue16;
                    MutableState mutableState20;
                    MutableState mutableState21;
                    Composer composer6;
                    boolean z12;
                    MaterialTheme materialTheme2;
                    int i20;
                    MutableState mutableState22;
                    ?? r0;
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer7 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    paddingValues.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= composer7.changed(paddingValues) ? 4 : 2;
                    }
                    if (composer7.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-146330324, intValue, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous> (AdbRootActivity.kt:256)");
                        }
                        Modifier.Companion companion3 = Modifier.Companion;
                        Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.m763paddingVpY3zN4(PaddingKt.padding(companion3, paddingValues), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(8.0f)), 0.0f, 1, null), ScrollState.this, false, null, false, 14, null);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f)), Alignment.Companion.getStart(), composer7, 6);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer7, verticalScroll$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                        iy constructor = companion4.getConstructor();
                        if (composer7.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor);
                        } else {
                            composer7.useNode();
                        }
                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer7);
                        uo.h(companion4, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion4, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        MutableState mutableState23 = mutableState13;
                        boolean booleanValue = ((Boolean) mutableState23.getValue()).booleanValue();
                        MutableState mutableState24 = mutableState6;
                        if (booleanValue) {
                            composer7.startReplaceGroup(755611828);
                            MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                            int i21 = MaterialTheme.$stable;
                            mutableState16 = mutableState23;
                            companion2 = companion3;
                            TextKt.m2607TextNvy7gAk("Setting up wireless ADB automatically...", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer7, i21).getBodyMedium(), composer7, 6, 0, 131070);
                            composer6 = composer7;
                            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion2, Dp.m7611constructorimpl(12.0f)), composer6, 6);
                            composer6.endReplaceGroup();
                            i20 = i21;
                            mutableState21 = mutableState24;
                            materialTheme2 = materialTheme3;
                            r0 = 1;
                            obj4 = null;
                        } else {
                            mutableState16 = mutableState23;
                            companion2 = companion3;
                            composer7.startReplaceGroup(756420215);
                            c3 c3Var3 = c3Var;
                            boolean changedInstance4 = composer7.changedInstance(c3Var3);
                            Object rememberedValue17 = composer7.rememberedValue();
                            if (changedInstance4 || rememberedValue17 == Composer.Companion.getEmpty()) {
                                i18 = 1;
                                rememberedValue17 = new i2(c3Var3, 1);
                                composer7.updateRememberedValue(rememberedValue17);
                            } else {
                                i18 = 1;
                            }
                            obj4 = null;
                            ButtonKt.Button((iy) rememberedValue17, SizeKt.fillMaxWidth$default(companion2, 0.0f, i18, null), false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, vk.b, composer7, 805306416, 500);
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            CardDefaults cardDefaults = CardDefaults.INSTANCE;
                            MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                            int i22 = MaterialTheme.$stable;
                            long m1778getSecondaryContainer0d7_KjU = materialTheme4.getColorScheme(composer7, i22).m1778getSecondaryContainer0d7_KjU();
                            int i23 = CardDefaults.$stable << 12;
                            CardKt.Card(fillMaxWidth$default, m1056RoundedCornerShape0680j_4, cardDefaults.m1678cardColorsro_MJ88(m1778getSecondaryContainer0d7_KjU, 0L, 0L, 0L, composer7, i23, 14), null, null, vk.c, composer7, 196614, 24);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            CardColors m1678cardColorsro_MJ88 = cardDefaults.m1678cardColorsro_MJ88(materialTheme4.getColorScheme(composer7, i22).m1778getSecondaryContainer0d7_KjU(), 0L, 0L, 0L, composer7, i23, 14);
                            un unVar4 = unVar;
                            MutableState mutableState25 = mutableState11;
                            MutableState mutableState26 = mutableState10;
                            MutableState mutableState27 = mutableState9;
                            MutableState mutableState28 = mutableState8;
                            String str4 = str2;
                            MutableState mutableState29 = mutableState24;
                            CardKt.Card(fillMaxWidth$default2, m1056RoundedCornerShape0680j_42, m1678cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-364304209, true, new n3(c3Var3, unVar4, mutableState25, mutableState26, mutableState27, mutableState28, mutableState24, str4), composer7, 54), composer7, 196614, 24);
                            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            RoundedCornerShape m1056RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            CardColors m1678cardColorsro_MJ882 = cardDefaults.m1678cardColorsro_MJ88(materialTheme4.getColorScheme(composer7, i22).m1778getSecondaryContainer0d7_KjU(), 0L, 0L, 0L, composer7, i23, 14);
                            Composer composer8 = composer7;
                            MutableState mutableState30 = mutableState15;
                            CardKt.Card(fillMaxWidth$default3, m1056RoundedCornerShape0680j_43, m1678cardColorsro_MJ882, null, null, ComposableLambdaKt.rememberComposableLambda(-2079902800, true, new s2(mutableState30, 2), composer8, 54), composer8, 196614, 24);
                            boolean z13 = z7;
                            SharedPreferences sharedPreferences3 = sharedPreferences;
                            if (z13) {
                                composer8.startReplaceGroup(763832036);
                                Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                RoundedCornerShape m1056RoundedCornerShape0680j_44 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                boolean z14 = !j4.b(mutableState28);
                                boolean changedInstance5 = composer8.changedInstance(unVar4) | composer8.changedInstance(c3Var3) | composer8.changedInstance(sharedPreferences3);
                                iy iyVar3 = iyVar2;
                                boolean changed2 = changedInstance5 | composer8.changed(iyVar3);
                                Object rememberedValue18 = composer8.rememberedValue();
                                if (changed2 || rememberedValue18 == Composer.Companion.getEmpty()) {
                                    rememberedValue18 = new l3(unVar4, mutableState28, mutableState30, mutableState29, c3Var3, str4, sharedPreferences3, iyVar3);
                                    mutableState22 = mutableState28;
                                    composer8.updateRememberedValue(rememberedValue18);
                                } else {
                                    mutableState22 = mutableState28;
                                }
                                ButtonKt.Button((iy) rememberedValue18, fillMaxWidth$default4, z14, m1056RoundedCornerShape0680j_44, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1179420753, true, new s2(mutableState22, 3), composer8, 54), composer8, 805306416, 496);
                                composer6 = composer8;
                                composer6.endReplaceGroup();
                                mutableState21 = mutableState29;
                                materialTheme = materialTheme4;
                                i19 = i22;
                                z12 = true;
                            } else {
                                composer8.startReplaceGroup(768568743);
                                boolean z15 = z3;
                                if (z15) {
                                    z8 = z15;
                                    mutableState17 = mutableState28;
                                    unVar2 = unVar4;
                                    sharedPreferences2 = sharedPreferences3;
                                    materialTheme = materialTheme4;
                                    i19 = i22;
                                    z9 = true;
                                    composer8.startReplaceGroup(745624000);
                                    composer5 = composer8;
                                } else {
                                    composer8.startReplaceGroup(768454632);
                                    Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                    RoundedCornerShape m1056RoundedCornerShape0680j_45 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                    materialTheme = materialTheme4;
                                    i19 = i22;
                                    mutableState17 = mutableState28;
                                    z8 = z15;
                                    unVar2 = unVar4;
                                    sharedPreferences2 = sharedPreferences3;
                                    z9 = true;
                                    CardColors m1678cardColorsro_MJ883 = cardDefaults.m1678cardColorsro_MJ88(materialTheme4.getColorScheme(composer8, i22).m1749getErrorContainer0d7_KjU(), 0L, 0L, 0L, composer8, i23, 14);
                                    Composer composer9 = composer8;
                                    CardKt.Card(fillMaxWidth$default5, m1056RoundedCornerShape0680j_45, m1678cardColorsro_MJ883, null, null, vk.h, composer9, 196614, 24);
                                    composer5 = composer9;
                                }
                                composer5.endReplaceGroup();
                                Modifier fillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion2, 0.0f, z9 ? 1 : 0, null);
                                RoundedCornerShape m1056RoundedCornerShape0680j_46 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                boolean z16 = !j4.b(mutableState17);
                                un unVar5 = unVar2;
                                SharedPreferences sharedPreferences4 = sharedPreferences2;
                                boolean changedInstance6 = composer5.changedInstance(unVar5) | composer5.changedInstance(c3Var3) | composer5.changedInstance(sharedPreferences4);
                                Object rememberedValue19 = composer5.rememberedValue();
                                MutableState mutableState31 = mutableState14;
                                if (changedInstance6 || rememberedValue19 == Composer.Companion.getEmpty()) {
                                    unVar3 = unVar5;
                                    mutableState18 = mutableState31;
                                    MutableState mutableState32 = mutableState17;
                                    c3Var2 = c3Var3;
                                    rememberedValue19 = new l3(unVar3, mutableState32, mutableState30, mutableState29, c3Var2, str4, sharedPreferences4, mutableState18);
                                    mutableState19 = mutableState32;
                                    composer5.updateRememberedValue(rememberedValue19);
                                } else {
                                    unVar3 = unVar5;
                                    mutableState18 = mutableState31;
                                    mutableState19 = mutableState17;
                                    c3Var2 = c3Var3;
                                }
                                Composer composer10 = composer5;
                                MutableState mutableState33 = mutableState19;
                                un unVar6 = unVar3;
                                c3 c3Var4 = c3Var2;
                                ButtonKt.Button((iy) rememberedValue19, fillMaxWidth$default6, z16, m1056RoundedCornerShape0680j_46, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(400426074, z9, new s2(mutableState19, 4), composer5, 54), composer10, 805306416, 496);
                                Modifier fillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion2, 0.0f, z9 ? 1 : 0, null);
                                RoundedCornerShape m1056RoundedCornerShape0680j_47 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                if (((Boolean) mutableState33.getValue()).booleanValue() || !((Boolean) mutableState18.getValue()).booleanValue()) {
                                    z10 = z8;
                                } else {
                                    z10 = z8;
                                    if (z10) {
                                        z11 = z9 ? 1 : 0;
                                        changedInstance3 = composer10.changedInstance(unVar6) | composer10.changedInstance(c3Var4);
                                        rememberedValue16 = composer10.rememberedValue();
                                        if (!changedInstance3 || rememberedValue16 == Composer.Companion.getEmpty()) {
                                            rememberedValue16 = new r2(unVar6, mutableState33, c3Var4, str4, mutableState29, mutableState30);
                                            mutableState20 = mutableState33;
                                            mutableState29 = mutableState29;
                                            composer10.updateRememberedValue(rememberedValue16);
                                        } else {
                                            mutableState20 = mutableState33;
                                        }
                                        mutableState21 = mutableState29;
                                        ButtonKt.Button((iy) rememberedValue16, fillMaxWidth$default7, z11, m1056RoundedCornerShape0680j_47, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1103642065, z9, new g3(z10, mutableState18, mutableState20, 0), composer10, 54), composer10, 805306416, 496);
                                        composer6 = composer10;
                                        composer6.endReplaceGroup();
                                        z12 = z9;
                                    }
                                }
                                z11 = false;
                                changedInstance3 = composer10.changedInstance(unVar6) | composer10.changedInstance(c3Var4);
                                rememberedValue16 = composer10.rememberedValue();
                                if (changedInstance3) {
                                }
                                rememberedValue16 = new r2(unVar6, mutableState33, c3Var4, str4, mutableState29, mutableState30);
                                mutableState20 = mutableState33;
                                mutableState29 = mutableState29;
                                composer10.updateRememberedValue(rememberedValue16);
                                mutableState21 = mutableState29;
                                ButtonKt.Button((iy) rememberedValue16, fillMaxWidth$default7, z11, m1056RoundedCornerShape0680j_47, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1103642065, z9, new g3(z10, mutableState18, mutableState20, 0), composer10, 54), composer10, 805306416, 496);
                                composer6 = composer10;
                                composer6.endReplaceGroup();
                                z12 = z9;
                            }
                            composer6.endReplaceGroup();
                            materialTheme2 = materialTheme;
                            i20 = i19;
                            r0 = z12;
                        }
                        Composer composer11 = composer6;
                        TextKt.m2607TextNvy7gAk(((Boolean) mutableState16.getValue()).booleanValue() ? "Auto-connect logs" : "ADB logs", null, materialTheme2.getColorScheme(composer6, i20).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer6, i20).getLabelSmall(), composer11, 0, 0, 131066);
                        CardKt.Card(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, r0, null), Dp.m7611constructorimpl(250.0f)), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), CardDefaults.INSTANCE.m1678cardColorsro_MJ88(materialTheme2.getColorScheme(composer11, i20).m1790getSurfaceVariant0d7_KjU(), 0L, 0L, 0L, composer11, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-695276780, r0, new u2(scrollState2, mutableState21, r0), composer11, 54), composer11, 196614, 24);
                        composer11.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer7.skipToGroupEnd();
                    }
                    return w01.a;
                }
            }, composer4, 54), composer4, 805306416, 509);
            composer2 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: m3
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j4.a(z, str, z2, z3, z4, c3Var, sharedPreferences, iyVar, iyVar2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return w01.a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void c(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
    }

    public static final void d(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(MutableState mutableState, String str) {
        mutableState.setValue(((String) mutableState.getValue()) + "> " + str + "\n");
    }

    public static final Object f(Context context, File file, String str, boolean z, boolean z2, ky kyVar, iy iyVar, iy iyVar2, iy iyVar3, us0 us0Var) {
        nq nqVar = nr.a;
        Object H = p01.H(hq.d, new x3(file, kyVar, context, str, z2, z, iyVar2, iyVar3, iyVar, null), us0Var);
        return H == vn.d ? H : w01.a;
    }

    public static final Object g(Context context, String str, ky kyVar, us0 us0Var) {
        nq nqVar = nr.a;
        Object H = p01.H(hq.d, new f4(str, kyVar, context, (hm) null, 0), us0Var);
        return H == vn.d ? H : w01.a;
    }

    public static final Object h(File file, String str, String[] strArr, im imVar) {
        nq nqVar = nr.a;
        return p01.H(hq.d, new f4(str, file, strArr, (hm) null, 1), imVar);
    }

    public static final Object i(Context context, String str, hm hmVar) {
        nq nqVar = nr.a;
        return p01.H(hq.d, new u3(context, str, (hm) null, 1), hmVar);
    }
}
