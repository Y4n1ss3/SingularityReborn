package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class cy0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ rw0 f;
    public final /* synthetic */ ky g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;

    public /* synthetic */ cy0(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, boolean z, rw0 rw0Var, ky kyVar, MutableState mutableState2) {
        this.d = 2;
        this.j = mutableState;
        this.h = sharedPreferences;
        this.e = unVar;
        this.i = z;
        this.f = rw0Var;
        this.g = kyVar;
        this.k = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        long m1748getError0d7_KjU;
        Object obj3;
        Object obj4;
        boolean z;
        int i = this.d;
        MutableState mutableState = this.j;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1321015608, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3769)");
                    }
                    Alignment.Companion companion = Alignment.Companion;
                    Alignment.Horizontal end = companion.getEnd();
                    Modifier.Companion companion2 = Modifier.Companion;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), end, composer, 48);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
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
                    uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composer, 48);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion2);
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
                    uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getLabelMedium(), composer, 6, 0, 131066);
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changed = composer.changed(mutableState);
                    SharedPreferences sharedPreferences = this.h;
                    boolean changedInstance = changed | composer.changedInstance(sharedPreferences);
                    ky kyVar = this.g;
                    boolean changed2 = changedInstance | composer.changed(kyVar);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new dy0(sharedPreferences, kyVar, mutableState, 5);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    boolean z2 = this.i;
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z2, null, null, composer, 0, 108);
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion2, Dp.m7611constructorimpl(8.0f)), composer, 6);
                    RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    Modifier m814widthInVpY3zN4$default = SizeKt.m814widthInVpY3zN4$default(companion2, Dp.m7611constructorimpl(80.0f), 0.0f, 2, null);
                    un unVar = this.e;
                    boolean changedInstance2 = composer.changedInstance(unVar);
                    rw0 rw0Var = this.f;
                    boolean changedInstance3 = changedInstance2 | composer.changedInstance(rw0Var) | composer.changed(kyVar) | composer.changedInstance(sharedPreferences);
                    Object rememberedValue2 = composer.rememberedValue();
                    MutableState mutableState2 = this.k;
                    if (changedInstance3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        Object ty0Var = new ty0(unVar, rw0Var, sharedPreferences, mutableState2, kyVar, 1);
                        composer.updateRememberedValue(ty0Var);
                        rememberedValue2 = ty0Var;
                    }
                    ButtonKt.Button((iy) rememberedValue2, m814widthInVpY3zN4$default, z2, m1056RoundedCornerShape0680j_4, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-267718866, true, new s2(mutableState2, 12), composer, 54), composer, 805306416, 496);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1719728375, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:4053)");
                    }
                    Alignment.Companion companion4 = Alignment.Companion;
                    Alignment.Horizontal end2 = companion4.getEnd();
                    Modifier.Companion companion5 = Modifier.Companion;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), end2, composer2, 48);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                    iy constructor3 = companion6.getConstructor();
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
                    uo.h(companion6, m3878constructorimpl3, columnMeasurePolicy3, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion6, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion4.getCenterHorizontally(), composer2, 48);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion5);
                    iy constructor4 = companion6.getConstructor();
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
                    uo.h(companion6, m3878constructorimpl4, columnMeasurePolicy4, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion6, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme2.getColorScheme(composer2, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i3).getLabelMedium(), composer2, 6, 0, 131066);
                    boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changed3 = composer2.changed(mutableState);
                    SharedPreferences sharedPreferences2 = this.h;
                    boolean changedInstance4 = changed3 | composer2.changedInstance(sharedPreferences2);
                    ky kyVar2 = this.g;
                    boolean changed4 = changedInstance4 | composer2.changed(kyVar2);
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (changed4 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new dy0(sharedPreferences2, kyVar2, mutableState, 4);
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    boolean z3 = this.i;
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue3, null, null, z3, null, null, composer2, 0, 108);
                    composer2.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion5, Dp.m7611constructorimpl(8.0f)), composer2, 6);
                    RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    Modifier m814widthInVpY3zN4$default2 = SizeKt.m814widthInVpY3zN4$default(companion5, Dp.m7611constructorimpl(80.0f), 0.0f, 2, null);
                    un unVar2 = this.e;
                    boolean changedInstance5 = composer2.changedInstance(unVar2);
                    rw0 rw0Var2 = this.f;
                    boolean changedInstance6 = changedInstance5 | composer2.changedInstance(rw0Var2) | composer2.changed(kyVar2) | composer2.changedInstance(sharedPreferences2);
                    Object rememberedValue4 = composer2.rememberedValue();
                    MutableState mutableState3 = this.k;
                    if (changedInstance6 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new ty0(unVar2, rw0Var2, sharedPreferences2, mutableState3, kyVar2, 0);
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    ButtonKt.Button((iy) rememberedValue4, m814widthInVpY3zN4$default2, z3, m1056RoundedCornerShape0680j_42, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-666431633, true, new s2(mutableState3, 11), composer2, 54), composer2, 805306416, 496);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-23136814, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1760)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                    Modifier.Companion companion7 = Modifier.Companion;
                    Modifier width = IntrinsicKt.width(companion7, IntrinsicSize.Max);
                    MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer3, width);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                    iy constructor5 = companion8.getConstructor();
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
                    uo.h(companion8, m3878constructorimpl5, columnMeasurePolicy5, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion8, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    MutableState mutableState4 = this.j;
                    String str = ((Boolean) mutableState4.getValue()).booleanValue() ? "Protected" : "Unprotected";
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle labelMedium = materialTheme3.getTypography(composer3, i4).getLabelMedium();
                    if (((Boolean) mutableState4.getValue()).booleanValue()) {
                        composer3.startReplaceGroup(-1714410631);
                        composer3.endReplaceGroup();
                        m1748getError0d7_KjU = ColorKt.Color(4281236786L);
                    } else {
                        composer3.startReplaceGroup(-1714409075);
                        m1748getError0d7_KjU = materialTheme3.getColorScheme(composer3, i4).m1748getError0d7_KjU();
                        composer3.endReplaceGroup();
                    }
                    TextKt.m2607TextNvy7gAk(str, null, m1748getError0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelMedium, composer3, 0, 0, 131066);
                    boolean booleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
                    boolean changed5 = composer3.changed(mutableState4);
                    SharedPreferences sharedPreferences3 = this.h;
                    boolean changedInstance7 = changed5 | composer3.changedInstance(sharedPreferences3);
                    un unVar3 = this.e;
                    boolean changedInstance8 = changedInstance7 | composer3.changedInstance(unVar3);
                    boolean z4 = this.i;
                    boolean changed6 = changedInstance8 | composer3.changed(z4);
                    rw0 rw0Var3 = this.f;
                    boolean changedInstance9 = changed6 | composer3.changedInstance(rw0Var3);
                    ky kyVar3 = this.g;
                    boolean changed7 = changedInstance9 | composer3.changed(kyVar3);
                    Object rememberedValue5 = composer3.rememberedValue();
                    if (changed7 || rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new zm(unVar3, kyVar3, rw0Var3, sharedPreferences3, mutableState4, z4);
                        obj3 = unVar3;
                        obj4 = kyVar3;
                        z = z4;
                        composer3.updateRememberedValue(rememberedValue5);
                    } else {
                        obj3 = unVar3;
                        z = z4;
                        obj4 = kyVar3;
                    }
                    SwitchKt.Switch(booleanValue3, (ky) rememberedValue5, null, null, z, null, null, composer3, 0, 108);
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion7, Dp.m7611constructorimpl(8.0f)), composer3, 6);
                    MutableState mutableState5 = this.k;
                    boolean z5 = !((Boolean) mutableState5.getValue()).booleanValue();
                    boolean changedInstance10 = composer3.changedInstance(obj3) | composer3.changed(obj4);
                    Object rememberedValue6 = composer3.rememberedValue();
                    if (changedInstance10 || rememberedValue6 == Composer.Companion.getEmpty()) {
                        rememberedValue6 = new p9(obj3, obj4, mutableState5, 14);
                        composer3.updateRememberedValue(rememberedValue6);
                    }
                    ButtonKt.Button((iy) rememberedValue6, null, z5, null, null, null, null, null, null, gl.c, composer3, 805306368, 506);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ cy0(un unVar, rw0 rw0Var, ky kyVar, SharedPreferences sharedPreferences, boolean z, MutableState mutableState, MutableState mutableState2, int i) {
        this.d = i;
        this.e = unVar;
        this.f = rw0Var;
        this.g = kyVar;
        this.h = sharedPreferences;
        this.i = z;
        this.j = mutableState;
        this.k = mutableState2;
    }
}
