package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ky0 implements my {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ un e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ rw0 h;
    public final /* synthetic */ ky i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ky0(un unVar, SharedPreferences sharedPreferences, MutableState mutableState, rw0 rw0Var, ky kyVar, boolean z, MutableState mutableState2, ArrayList arrayList, MutableState mutableState3, MutableState mutableState4) {
        this.e = unVar;
        this.f = sharedPreferences;
        this.g = mutableState;
        this.h = rw0Var;
        this.i = kyVar;
        this.j = z;
        this.k = mutableState2;
        this.n = arrayList;
        this.l = mutableState3;
        this.m = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        long m1748getError0d7_KjU;
        Alignment.Companion companion;
        Composer composer;
        ky kyVar;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        long m1772getPrimary0d7_KjU;
        RoundedCornerShape roundedCornerShape;
        MutableState mutableState4;
        int i = this.d;
        MutableState mutableState5 = this.g;
        w01 w01Var = w01.a;
        ?? r12 = 0;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                Composer composer2 = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1567421224, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2523)");
                    }
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Horizontal end = companion2.getEnd();
                    Modifier.Companion companion3 = Modifier.Companion;
                    Modifier width = IntrinsicKt.width(companion3, IntrinsicSize.Max);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), end, composer2, 48);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, width);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    iy constructor = companion4.getConstructor();
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
                    uo.h(companion4, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion4, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    boolean booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                    MutableState mutableState6 = this.k;
                    if (booleanValue && ((String) mutableState6.getValue()) == null) {
                        composer2.startReplaceGroup(1581719246);
                        ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(SizeKt.m807size3ABfNKs(companion3, Dp.m7611constructorimpl(14.0f)), 0L, Dp.m7611constructorimpl(2.0f), 0L, 0, 0.0f, composer2, 390, 58);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1582109877);
                        String str = (String) mutableState6.getValue();
                        if (str == null) {
                            str = "Not Installed";
                        }
                        boolean z = ((String) mutableState6.getValue()) != null;
                        MutableState mutableState7 = this.l;
                        boolean z2 = (!z || ((String) mutableState7.getValue()) == null || str.equals((String) mutableState7.getValue())) ? false : true;
                        if (z) {
                            str = "Ver: ".concat(str);
                        }
                        String str2 = str;
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i2 = MaterialTheme.$stable;
                        TextStyle bodySmall = materialTheme.getTypography(composer2, i2).getBodySmall();
                        if (z) {
                            composer2.startReplaceGroup(-1472969323);
                            m1748getError0d7_KjU = materialTheme.getColorScheme(composer2, i2).m1772getPrimary0d7_KjU();
                        } else {
                            composer2.startReplaceGroup(-1472968077);
                            m1748getError0d7_KjU = materialTheme.getColorScheme(composer2, i2).m1748getError0d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        TextKt.m2607TextNvy7gAk(str2, null, m1748getError0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer2, 0, 0, 131066);
                        if (z2) {
                            composer2.startReplaceGroup(1582759482);
                            TextKt.m2607TextNvy7gAk(uo.c("Update Available: ", (String) mutableState7.getValue()), null, materialTheme.getColorScheme(composer2, i2).m1791getTertiary0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i2).getBodySmall(), composer2, 0, 0, 131066);
                        } else {
                            composer2.startReplaceGroup(1421695572);
                        }
                        composer2.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(4.0f)), composer2, 6);
                        Object rememberedValue = composer2.rememberedValue();
                        Composer.Companion companion5 = Composer.Companion;
                        if (rememberedValue == companion5.getEmpty()) {
                            companion = companion2;
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer2.updateRememberedValue(rememberedValue);
                        } else {
                            companion = companion2;
                        }
                        MutableState mutableState8 = (MutableState) rememberedValue;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion.getTop(), composer2, 6);
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion3);
                        iy constructor2 = companion4.getConstructor();
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
                        uo.h(companion4, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion4, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        boolean z3 = this.j;
                        rw0 rw0Var = this.h;
                        SharedPreferences sharedPreferences = this.f;
                        ky kyVar2 = this.i;
                        if (z) {
                            composer2.startReplaceGroup(-506641772);
                            boolean z4 = z3 && !((Boolean) mutableState8.getValue()).booleanValue();
                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                            mutableState = mutableState6;
                            MutableState mutableState9 = this.m;
                            if (((Boolean) mutableState9.getValue()).booleanValue()) {
                                composer2.startReplaceGroup(1092085147);
                                m1772getPrimary0d7_KjU = materialTheme.getColorScheme(composer2, i2).m1748getError0d7_KjU();
                            } else {
                                composer2.startReplaceGroup(1092086333);
                                m1772getPrimary0d7_KjU = materialTheme.getColorScheme(composer2, i2).m1772getPrimary0d7_KjU();
                            }
                            composer2.endReplaceGroup();
                            ButtonColors m1658buttonColorsro_MJ88 = buttonDefaults.m1658buttonColorsro_MJ88(m1772getPrimary0d7_KjU, 0L, 0L, 0L, composer2, ButtonDefaults.$stable << 12, 14);
                            RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            boolean changedInstance = composer2.changedInstance(rw0Var) | composer2.changedInstance(sharedPreferences) | composer2.changed(kyVar2);
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changedInstance || rememberedValue2 == companion5.getEmpty()) {
                                roundedCornerShape = m1056RoundedCornerShape0680j_4;
                                kyVar = kyVar2;
                                rememberedValue2 = new ud(rw0Var, sharedPreferences, kyVar2, mutableState9, 7);
                                mutableState4 = mutableState9;
                                composer2.updateRememberedValue(rememberedValue2);
                            } else {
                                roundedCornerShape = m1056RoundedCornerShape0680j_4;
                                kyVar = kyVar2;
                                mutableState4 = mutableState9;
                            }
                            mutableState2 = mutableState7;
                            ButtonKt.Button((iy) rememberedValue2, null, z4, roundedCornerShape, m1658buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1805582047, true, new s2(mutableState4, 7), composer2, 54), composer2, 805306368, 482);
                            composer = composer2;
                        } else {
                            composer = composer2;
                            kyVar = kyVar2;
                            mutableState = mutableState6;
                            mutableState2 = mutableState7;
                            composer.startReplaceGroup(-668577588);
                        }
                        composer.endReplaceGroup();
                        un unVar = this.e;
                        boolean changedInstance2 = composer.changedInstance(unVar) | composer.changedInstance(context) | composer.changedInstance(rw0Var) | composer.changedInstance(sharedPreferences) | composer.changed(kyVar);
                        Object rememberedValue3 = composer.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == companion5.getEmpty()) {
                            mutableState3 = mutableState8;
                            l3 l3Var = new l3(unVar, context, rw0Var, sharedPreferences, kyVar, mutableState3, mutableState, mutableState2);
                            composer.updateRememberedValue(l3Var);
                            rememberedValue3 = l3Var;
                        } else {
                            mutableState3 = mutableState8;
                        }
                        Composer composer3 = composer;
                        ButtonKt.Button((iy) rememberedValue3, null, z3 && !((Boolean) mutableState3.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1663729606, true, new s70(z2, z, mutableState3), composer, 54), composer3, 805306368, 498);
                        composer2 = composer3;
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj3;
                Composer composer4 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer4.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2042756978, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:4104)");
                    }
                    Alignment.Companion companion6 = Alignment.Companion;
                    Alignment.Horizontal end2 = companion6.getEnd();
                    Modifier.Companion companion7 = Modifier.Companion;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), end2, composer4, 48);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, companion7);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                    iy constructor3 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer4);
                    uo.h(companion8, m3878constructorimpl3, columnMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion8, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion6.getCenterVertically(), composer4, 54);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, companion7);
                    iy constructor4 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer4);
                    uo.h(companion8, m3878constructorimpl4, rowMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion8, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion7, companion6.getTopStart(), false, 2, null);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, wrapContentSize$default);
                    iy constructor5 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor5);
                    } else {
                        composer4.useNode();
                    }
                    Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer4);
                    uo.h(companion8, m3878constructorimpl5, maybeCachedBoxMeasurePolicy, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion8, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Object rememberedValue4 = composer4.rememberedValue();
                    Composer.Companion companion9 = Composer.Companion;
                    Object empty = companion9.getEmpty();
                    MutableState mutableState10 = this.k;
                    if (rememberedValue4 == empty) {
                        rememberedValue4 = new j3(mutableState10, 22);
                        composer4.updateRememberedValue(rememberedValue4);
                    }
                    PaddingValues m756PaddingValuesYgX7TsA = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(4.0f));
                    MutableState mutableState11 = this.g;
                    ButtonKt.TextButton((iy) rememberedValue4, null, false, null, null, null, null, m756PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(1070316751, true, new t2(mutableState11, mutableState10, 3), composer4, 54), composer4, 817889286, 382);
                    boolean booleanValue2 = ((Boolean) mutableState10.getValue()).booleanValue();
                    Object rememberedValue5 = composer4.rememberedValue();
                    if (rememberedValue5 == companion9.getEmpty()) {
                        rememberedValue5 = new j3(mutableState10, 23);
                        composer4.updateRememberedValue(rememberedValue5);
                    }
                    SharedPreferences sharedPreferences2 = this.f;
                    rw0 rw0Var2 = this.h;
                    ky kyVar3 = this.i;
                    MutableState mutableState12 = this.l;
                    AndroidMenu_androidKt.m1603DropdownMenuIlH_yew(booleanValue2, (iy) rememberedValue5, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1943510839, true, new cs(arrayList, mutableState11, sharedPreferences2, rw0Var2, kyVar3, mutableState10, mutableState12), composer4, 54), composer4, 48, 48, 2044);
                    composer4.endNode();
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion6.getCenterHorizontally(), composer4, 48);
                    int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer4, companion7);
                    iy constructor6 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor6);
                    } else {
                        composer4.useNode();
                    }
                    Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer4);
                    uo.h(companion8, m3878constructorimpl6, columnMeasurePolicy3, m3878constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion8, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme2.getColorScheme(composer4, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer4, i3).getLabelMedium(), composer4, 6, 0, 131066);
                    MutableState mutableState13 = this.m;
                    boolean booleanValue3 = ((Boolean) mutableState13.getValue()).booleanValue();
                    boolean changed = composer4.changed(mutableState13) | composer4.changedInstance(sharedPreferences2) | composer4.changed(kyVar3);
                    Object rememberedValue6 = composer4.rememberedValue();
                    if (changed || rememberedValue6 == companion9.getEmpty()) {
                        rememberedValue6 = new dy0(sharedPreferences2, kyVar3, mutableState13, 3);
                        composer4.updateRememberedValue(rememberedValue6);
                    }
                    boolean z5 = this.j;
                    SwitchKt.Switch(booleanValue3, (ky) rememberedValue6, null, null, z5, null, null, composer4, 0, 108);
                    composer4.endNode();
                    composer4.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion7, Dp.m7611constructorimpl(8.0f)), composer4, 6);
                    RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    Modifier m814widthInVpY3zN4$default = SizeKt.m814widthInVpY3zN4$default(companion7, Dp.m7611constructorimpl(80.0f), 0.0f, 2, null);
                    un unVar2 = this.e;
                    boolean changedInstance3 = composer4.changedInstance(unVar2) | composer4.changedInstance(sharedPreferences2) | composer4.changed(mutableState11) | composer4.changedInstance(rw0Var2) | composer4.changed(kyVar3);
                    Object rememberedValue7 = composer4.rememberedValue();
                    if (changedInstance3 || rememberedValue7 == companion9.getEmpty()) {
                        rememberedValue7 = new r2(unVar2, kyVar3, rw0Var2, sharedPreferences2, mutableState12, mutableState11);
                        composer4.updateRememberedValue(rememberedValue7);
                    }
                    ButtonKt.Button((iy) rememberedValue7, m814widthInVpY3zN4$default, z5, m1056RoundedCornerShape0680j_42, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(648644184, true, new s2(mutableState12, 10), composer4, 54), composer4, 805306416, 496);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                MutableState mutableState14 = (MutableState) obj3;
                Composer composer5 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer5.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1853497551, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3825)");
                    }
                    Alignment.Companion companion10 = Alignment.Companion;
                    Alignment.Horizontal end3 = companion10.getEnd();
                    Modifier.Companion companion11 = Modifier.Companion;
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), end3, composer5, 48);
                    int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                    CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer5, companion11);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.Companion;
                    iy constructor7 = companion12.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor7);
                    } else {
                        composer5.useNode();
                    }
                    Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer5);
                    uo.h(companion12, m3878constructorimpl7, columnMeasurePolicy4, m3878constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion12, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.m647spacedBy0680j_4(Dp.m7611constructorimpl(4.0f)), companion10.getCenterVertically(), composer5, 54);
                    int hashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                    CompositionLocalMap currentCompositionLocalMap8 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer5, companion11);
                    iy constructor8 = companion12.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor8);
                    } else {
                        composer5.useNode();
                    }
                    Composer m3878constructorimpl8 = Updater.m3878constructorimpl(composer5);
                    uo.h(companion12, m3878constructorimpl8, rowMeasurePolicy3, m3878constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, k4.c(companion12, m3878constructorimpl8, Integer.valueOf(hashCode8), m3878constructorimpl8));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    composer5.startReplaceGroup(-2022445124);
                    Iterator it = yi.C0((List) mutableState5.getValue()).iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        SharedPreferences sharedPreferences3 = this.f;
                        rw0 rw0Var3 = this.h;
                        ky kyVar4 = this.i;
                        MutableState mutableState15 = this.m;
                        if (!hasNext) {
                            composer5.endReplaceGroup();
                            composer5.endNode();
                            Modifier.Companion companion13 = Modifier.Companion;
                            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion13, Dp.m7611constructorimpl(8.0f)), composer5, 6);
                            Alignment.Companion companion14 = Alignment.Companion;
                            Alignment.Vertical centerVertically = companion14.getCenterVertically();
                            Arrangement arrangement4 = Arrangement.INSTANCE;
                            MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement4.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), centerVertically, composer5, 54);
                            int hashCode9 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                            CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer5, companion13);
                            ComposeUiNode.Companion companion15 = ComposeUiNode.Companion;
                            iy constructor9 = companion15.getConstructor();
                            if (composer5.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor9);
                            } else {
                                composer5.useNode();
                            }
                            Composer m3878constructorimpl9 = Updater.m3878constructorimpl(composer5);
                            uo.h(companion15, m3878constructorimpl9, rowMeasurePolicy4, m3878constructorimpl9, currentCompositionLocalMap9);
                            Updater.m3886setimpl(m3878constructorimpl9, materializeModifier9, k4.c(companion15, m3878constructorimpl9, Integer.valueOf(hashCode9), m3878constructorimpl9));
                            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                            MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion14.getCenterHorizontally(), composer5, 48);
                            int hashCode10 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                            CompositionLocalMap currentCompositionLocalMap10 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer5, companion13);
                            iy constructor10 = companion15.getConstructor();
                            if (composer5.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor10);
                            } else {
                                composer5.useNode();
                            }
                            Composer m3878constructorimpl10 = Updater.m3878constructorimpl(composer5);
                            uo.h(companion15, m3878constructorimpl10, columnMeasurePolicy5, m3878constructorimpl10, currentCompositionLocalMap10);
                            Updater.m3886setimpl(m3878constructorimpl10, materializeModifier10, k4.c(companion15, m3878constructorimpl10, Integer.valueOf(hashCode10), m3878constructorimpl10));
                            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                            MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                            int i4 = MaterialTheme.$stable;
                            TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme3.getColorScheme(composer5, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer5, i4).getLabelMedium(), composer5, 6, 0, 131066);
                            boolean booleanValue4 = ((Boolean) mutableState14.getValue()).booleanValue();
                            boolean changed2 = composer5.changed(mutableState14) | composer5.changedInstance(sharedPreferences3) | composer5.changed(kyVar4);
                            Object rememberedValue8 = composer5.rememberedValue();
                            if (changed2 || rememberedValue8 == Composer.Companion.getEmpty()) {
                                rememberedValue8 = new dy0(sharedPreferences3, kyVar4, mutableState14, 6);
                                composer5.updateRememberedValue(rememberedValue8);
                            }
                            boolean z6 = this.j;
                            SwitchKt.Switch(booleanValue4, (ky) rememberedValue8, null, null, z6, null, null, composer5, 0, 108);
                            composer5.endNode();
                            boolean z7 = z6 && !((List) mutableState5.getValue()).isEmpty();
                            RoundedCornerShape m1056RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            Modifier m814widthInVpY3zN4$default2 = SizeKt.m814widthInVpY3zN4$default(companion13, Dp.m7611constructorimpl(80.0f), 0.0f, 2, null);
                            un unVar3 = this.e;
                            boolean changedInstance4 = composer5.changedInstance(unVar3) | composer5.changedInstance(rw0Var3) | composer5.changed(kyVar4) | composer5.changedInstance(sharedPreferences3);
                            Object rememberedValue9 = composer5.rememberedValue();
                            if (changedInstance4 || rememberedValue9 == Composer.Companion.getEmpty()) {
                                rememberedValue9 = new ty0(unVar3, rw0Var3, sharedPreferences3, mutableState15, kyVar4, 2);
                                composer5.updateRememberedValue(rememberedValue9);
                            }
                            ButtonKt.Button((iy) rememberedValue9, m814widthInVpY3zN4$default2, z7, m1056RoundedCornerShape0680j_43, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1733295986, true, new s2(mutableState15, 14), composer5, 54), composer5, 805306416, 496);
                            composer5.endNode();
                            composer5.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                break;
                            }
                        } else {
                            xe0 xe0Var = (xe0) it.next();
                            String str3 = (String) xe0Var.d;
                            List list = (List) xe0Var.e;
                            Modifier.Companion companion16 = Modifier.Companion;
                            Alignment.Companion companion17 = Alignment.Companion;
                            Iterator it2 = it;
                            Modifier wrapContentSize$default2 = SizeKt.wrapContentSize$default(companion16, companion17.getTopStart(), r12, 2, null);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion17.getTopStart(), r12);
                            int hashCode11 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, r12));
                            CompositionLocalMap currentCompositionLocalMap11 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(composer5, wrapContentSize$default2);
                            ComposeUiNode.Companion companion18 = ComposeUiNode.Companion;
                            iy constructor11 = companion18.getConstructor();
                            if (composer5.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor11);
                            } else {
                                composer5.useNode();
                            }
                            Composer m3878constructorimpl11 = Updater.m3878constructorimpl(composer5);
                            uo.h(companion18, m3878constructorimpl11, maybeCachedBoxMeasurePolicy2, m3878constructorimpl11, currentCompositionLocalMap11);
                            Updater.m3886setimpl(m3878constructorimpl11, materializeModifier11, k4.c(companion18, m3878constructorimpl11, Integer.valueOf(hashCode11), m3878constructorimpl11));
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            boolean changed3 = composer5.changed(str3);
                            Object rememberedValue10 = composer5.rememberedValue();
                            MutableState mutableState16 = this.k;
                            if (changed3 || rememberedValue10 == Composer.Companion.getEmpty()) {
                                rememberedValue10 = new qu(str3, mutableState16, 1);
                                composer5.updateRememberedValue(rememberedValue10);
                            }
                            PaddingValues m756PaddingValuesYgX7TsA2 = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(6.0f), Dp.m7611constructorimpl(4.0f));
                            MutableState mutableState17 = this.l;
                            ButtonKt.TextButton((iy) rememberedValue10, null, false, null, null, null, null, m756PaddingValuesYgX7TsA2, null, ComposableLambdaKt.rememberComposableLambda(2143190785, true, new pm(str3, list, mutableState17, mutableState16, 8), composer5, 54), composer5, 817889280, 382);
                            boolean b = q10.b((String) mutableState16.getValue(), str3);
                            Object rememberedValue11 = composer5.rememberedValue();
                            if (rememberedValue11 == Composer.Companion.getEmpty()) {
                                rememberedValue11 = new j3(mutableState16, 21);
                                composer5.updateRememberedValue(rememberedValue11);
                            }
                            AndroidMenu_androidKt.m1603DropdownMenuIlH_yew(b, (iy) rememberedValue11, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-987011687, true, new n3(list, str3, sharedPreferences3, rw0Var3, kyVar4, mutableState17, mutableState16, mutableState15), composer5, 54), composer5, 48, 48, 2044);
                            composer5.endNode();
                            it = it2;
                            r12 = 0;
                        }
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ ky0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SharedPreferences sharedPreferences, rw0 rw0Var, ky kyVar, MutableState mutableState4, boolean z, un unVar, MutableState mutableState5) {
        this.g = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.f = sharedPreferences;
        this.h = rw0Var;
        this.i = kyVar;
        this.m = mutableState4;
        this.j = z;
        this.e = unVar;
        this.n = mutableState5;
    }

    public /* synthetic */ ky0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, boolean z, rw0 rw0Var, SharedPreferences sharedPreferences, ky kyVar, un unVar, Context context, MutableState mutableState4) {
        this.g = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.j = z;
        this.h = rw0Var;
        this.f = sharedPreferences;
        this.i = kyVar;
        this.e = unVar;
        this.n = context;
        this.m = mutableState4;
    }
}
