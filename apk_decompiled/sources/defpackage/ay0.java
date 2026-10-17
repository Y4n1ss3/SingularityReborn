package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay0 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ un g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ boolean i;

    public /* synthetic */ ay0(un unVar, ky kyVar, boolean z, MutableState mutableState, SharedPreferences sharedPreferences) {
        this.g = unVar;
        this.h = kyVar;
        this.i = z;
        this.e = mutableState;
        this.f = sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
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
                        ComposerKt.traceEventStart(41409306, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1878)");
                    }
                    MutableState mutableState = this.e;
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    SharedPreferences sharedPreferences = this.f;
                    boolean changedInstance = composer.changedInstance(sharedPreferences);
                    un unVar = this.g;
                    boolean changedInstance2 = changedInstance | composer.changedInstance(unVar);
                    ky kyVar = this.h;
                    boolean changed = changedInstance2 | composer.changed(kyVar);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        ax0 ax0Var = new ax0(sharedPreferences, unVar, mutableState, kyVar, 2);
                        composer.updateRememberedValue(ax0Var);
                        rememberedValue = ax0Var;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, this.i, null, null, composer, 0, 108);
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
                        ComposerKt.traceEventStart(-16147083, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3612)");
                    }
                    MutableState mutableState2 = this.e;
                    boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                    boolean changed2 = composer2.changed(mutableState2);
                    SharedPreferences sharedPreferences2 = this.f;
                    boolean changedInstance3 = changed2 | composer2.changedInstance(sharedPreferences2);
                    un unVar2 = this.g;
                    boolean changedInstance4 = changedInstance3 | composer2.changedInstance(unVar2);
                    ky kyVar2 = this.h;
                    boolean changed3 = changedInstance4 | composer2.changed(kyVar2);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        ax0 ax0Var2 = new ax0(sharedPreferences2, unVar2, mutableState2, kyVar2, 4);
                        composer2.updateRememberedValue(ax0Var2);
                        rememberedValue2 = ax0Var2;
                    }
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue2, null, null, this.i, null, null, composer2, 0, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1779075686, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3490)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
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
                    uo.h(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MutableState mutableState3 = this.e;
                    boolean booleanValue3 = ((Boolean) mutableState3.getValue()).booleanValue();
                    un unVar3 = this.g;
                    boolean changedInstance5 = composer3.changedInstance(unVar3) | composer3.changed(mutableState3);
                    SharedPreferences sharedPreferences3 = this.f;
                    boolean changedInstance6 = changedInstance5 | composer3.changedInstance(sharedPreferences3);
                    ky kyVar3 = this.h;
                    boolean changed4 = changedInstance6 | composer3.changed(kyVar3);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed4 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new ax0(unVar3, sharedPreferences3, kyVar3, mutableState3, 1);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    SwitchKt.Switch(booleanValue3, (ky) rememberedValue3, null, null, this.i, null, null, composer3, 0, 108);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(382565684, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2743)");
                    }
                    Alignment.Companion companion3 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f));
                    Modifier.Companion companion4 = Modifier.Companion;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m647spacedBy0680j_4, centerVertically, composer4, 54);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    iy constructor2 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor2);
                    } else {
                        composer4.useNode();
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer4);
                    uo.h(companion5, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion5, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer4, 48);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, companion4);
                    iy constructor3 = companion5.getConstructor();
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
                    uo.h(companion5, m3878constructorimpl3, columnMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion5, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme.getColorScheme(composer4, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i2).getLabelMedium(), composer4, 6, 0, 131066);
                    MutableState mutableState4 = this.e;
                    boolean booleanValue4 = ((Boolean) mutableState4.getValue()).booleanValue();
                    boolean changed5 = composer4.changed(mutableState4);
                    SharedPreferences sharedPreferences4 = this.f;
                    boolean changedInstance7 = changed5 | composer4.changedInstance(sharedPreferences4);
                    ky kyVar4 = this.h;
                    boolean changed6 = changedInstance7 | composer4.changed(kyVar4);
                    Object rememberedValue4 = composer4.rememberedValue();
                    if (changed6 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new dy0(sharedPreferences4, kyVar4, mutableState4, 0);
                        composer4.updateRememberedValue(rememberedValue4);
                    }
                    boolean z = this.i;
                    SwitchKt.Switch(booleanValue4, (ky) rememberedValue4, null, null, z, null, null, composer4, 0, 108);
                    composer4.endNode();
                    Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(companion4, Dp.m7611constructorimpl(90.0f));
                    RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    un unVar4 = this.g;
                    boolean changedInstance8 = composer4.changedInstance(unVar4) | composer4.changed(kyVar4);
                    Object rememberedValue5 = composer4.rememberedValue();
                    if (changedInstance8 || rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new hu0(unVar4, kyVar4, 2);
                        composer4.updateRememberedValue(rememberedValue5);
                    }
                    ButtonKt.Button((iy) rememberedValue5, m812width3ABfNKs, z, m1056RoundedCornerShape0680j_4, null, null, null, null, null, gl.k, composer4, 805306416, 496);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ ay0(un unVar, MutableState mutableState, SharedPreferences sharedPreferences, ky kyVar, boolean z) {
        this.g = unVar;
        this.e = mutableState;
        this.f = sharedPreferences;
        this.h = kyVar;
        this.i = z;
    }

    public /* synthetic */ ay0(SharedPreferences sharedPreferences, un unVar, ky kyVar, boolean z, MutableState mutableState) {
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = kyVar;
        this.i = z;
        this.e = mutableState;
    }

    public /* synthetic */ ay0(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, ky kyVar, boolean z) {
        this.e = mutableState;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = kyVar;
        this.i = z;
    }
}
