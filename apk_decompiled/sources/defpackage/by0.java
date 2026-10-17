package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SwitchKt;
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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class by0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ MutableState i;

    public /* synthetic */ by0(un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.d = 1;
        this.e = unVar;
        this.f = context;
        this.g = sharedPreferences;
        this.h = kyVar;
        this.i = mutableState;
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
                        ComposerKt.traceEventStart(-1860487282, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2969)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier width = IntrinsicKt.width(companion, IntrinsicSize.Max);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, width);
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
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
                    MutableState mutableState = this.i;
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    SharedPreferences sharedPreferences = this.g;
                    boolean changedInstance = composer.changedInstance(sharedPreferences);
                    un unVar = this.e;
                    boolean changedInstance2 = changedInstance | composer.changedInstance(unVar);
                    Context context = this.f;
                    boolean changedInstance3 = changedInstance2 | composer.changedInstance(context);
                    ky kyVar = this.h;
                    boolean changed = composer.changed(kyVar) | changedInstance3;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        vw0 vw0Var = new vw0(0, unVar, kyVar, context, sharedPreferences, mutableState);
                        composer.updateRememberedValue(vw0Var);
                        rememberedValue = vw0Var;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, true, null, null, composer, 24576, 108);
                    composer.endNode();
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
                        ComposerKt.traceEventStart(781278451, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1729)");
                    }
                    MutableState mutableState2 = this.i;
                    boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                    un unVar2 = this.e;
                    boolean changedInstance4 = composer2.changedInstance(unVar2);
                    Context context2 = this.f;
                    boolean changedInstance5 = changedInstance4 | composer2.changedInstance(context2);
                    SharedPreferences sharedPreferences2 = this.g;
                    boolean changedInstance6 = changedInstance5 | composer2.changedInstance(sharedPreferences2);
                    ky kyVar2 = this.h;
                    boolean changed2 = composer2.changed(kyVar2) | changedInstance6;
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        vw0 vw0Var2 = new vw0(unVar2, kyVar2, context2, sharedPreferences2, mutableState2);
                        composer2.updateRememberedValue(vw0Var2);
                        rememberedValue2 = vw0Var2;
                    }
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue2, null, null, false, null, null, composer2, 0, 124);
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
                        ComposerKt.traceEventStart(-1056072017, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2931)");
                    }
                    Modifier.Companion companion4 = Modifier.Companion;
                    Modifier width2 = IntrinsicKt.width(companion4, IntrinsicSize.Max);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion5 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top2, companion5.getStart(), composer3, 0);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, width2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
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
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composer3, 48);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                    iy constructor4 = companion6.getConstructor();
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
                    uo.h(companion6, m3878constructorimpl4, columnMeasurePolicy4, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion6, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    MutableState mutableState3 = this.i;
                    boolean booleanValue3 = ((Boolean) mutableState3.getValue()).booleanValue();
                    SharedPreferences sharedPreferences3 = this.g;
                    boolean changedInstance7 = composer3.changedInstance(sharedPreferences3);
                    un unVar3 = this.e;
                    boolean changedInstance8 = changedInstance7 | composer3.changedInstance(unVar3);
                    Context context3 = this.f;
                    boolean changedInstance9 = changedInstance8 | composer3.changedInstance(context3);
                    ky kyVar3 = this.h;
                    boolean changed3 = composer3.changed(kyVar3) | changedInstance9;
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        vw0 vw0Var3 = new vw0(3, unVar3, kyVar3, context3, sharedPreferences3, mutableState3);
                        composer3.updateRememberedValue(vw0Var3);
                        rememberedValue3 = vw0Var3;
                    }
                    SwitchKt.Switch(booleanValue3, (ky) rememberedValue3, null, null, true, null, null, composer3, 24576, 108);
                    composer3.endNode();
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

    public /* synthetic */ by0(int i, un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.d = i;
        this.g = sharedPreferences;
        this.e = unVar;
        this.f = context;
        this.h = kyVar;
        this.i = mutableState;
    }
}
