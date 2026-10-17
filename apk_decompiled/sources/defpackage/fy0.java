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
public final /* synthetic */ class fy0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ un f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ rw0 i;
    public final /* synthetic */ ky j;
    public final /* synthetic */ MutableState k;

    public /* synthetic */ fy0(un unVar, ky kyVar, rw0 rw0Var, Context context, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.d = 1;
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = z;
        this.h = context;
        this.i = rw0Var;
        this.j = kyVar;
        this.k = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
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
                        ComposerKt.traceEventStart(527577623, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1813)");
                    }
                    MutableState mutableState = this.k;
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changed = composer.changed(mutableState);
                    SharedPreferences sharedPreferences = this.e;
                    boolean changedInstance = changed | composer.changedInstance(sharedPreferences);
                    un unVar = this.f;
                    boolean changedInstance2 = changedInstance | composer.changedInstance(unVar);
                    boolean z3 = this.g;
                    boolean changed2 = changedInstance2 | composer.changed(z3);
                    rw0 rw0Var = this.i;
                    boolean changedInstance3 = changed2 | composer.changedInstance(rw0Var);
                    Context context = this.h;
                    boolean changedInstance4 = changedInstance3 | composer.changedInstance(context);
                    ky kyVar = this.j;
                    boolean changed3 = composer.changed(kyVar) | changedInstance4;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed3 || rememberedValue == Composer.Companion.getEmpty()) {
                        z = z3;
                        sy0 sy0Var = new sy0(2, unVar, kyVar, rw0Var, context, sharedPreferences, mutableState, z);
                        composer.updateRememberedValue(sy0Var);
                        rememberedValue = sy0Var;
                    } else {
                        z = z3;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z, null, null, composer, 0, 108);
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
                        ComposerKt.traceEventStart(-523590074, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2876)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier width = IntrinsicKt.width(companion, IntrinsicSize.Max);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, width);
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
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
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
                    uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    MutableState mutableState2 = this.k;
                    boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                    SharedPreferences sharedPreferences2 = this.e;
                    boolean changedInstance5 = composer2.changedInstance(sharedPreferences2);
                    un unVar2 = this.f;
                    boolean changedInstance6 = changedInstance5 | composer2.changedInstance(unVar2);
                    boolean z4 = this.g;
                    boolean changed4 = changedInstance6 | composer2.changed(z4);
                    Context context2 = this.h;
                    boolean changedInstance7 = changed4 | composer2.changedInstance(context2);
                    rw0 rw0Var2 = this.i;
                    boolean changedInstance8 = changedInstance7 | composer2.changedInstance(rw0Var2);
                    ky kyVar2 = this.j;
                    boolean changed5 = composer2.changed(kyVar2) | changedInstance8;
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed5 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        sy0 sy0Var2 = new sy0(unVar2, kyVar2, rw0Var2, context2, sharedPreferences2, mutableState2, z4);
                        composer2.updateRememberedValue(sy0Var2);
                        rememberedValue2 = sy0Var2;
                    }
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue2, null, null, true, null, null, composer2, 24576, 108);
                    composer2.endNode();
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
                        ComposerKt.traceEventStart(1307285691, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1845)");
                    }
                    MutableState mutableState3 = this.k;
                    boolean booleanValue3 = ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean changed6 = composer3.changed(mutableState3);
                    SharedPreferences sharedPreferences3 = this.e;
                    boolean changedInstance9 = changed6 | composer3.changedInstance(sharedPreferences3);
                    un unVar3 = this.f;
                    boolean changedInstance10 = changedInstance9 | composer3.changedInstance(unVar3);
                    boolean z5 = this.g;
                    boolean changed7 = changedInstance10 | composer3.changed(z5);
                    rw0 rw0Var3 = this.i;
                    boolean changedInstance11 = changed7 | composer3.changedInstance(rw0Var3);
                    Context context3 = this.h;
                    boolean changedInstance12 = changedInstance11 | composer3.changedInstance(context3);
                    ky kyVar3 = this.j;
                    boolean changed8 = changedInstance12 | composer3.changed(kyVar3);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed8 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        z2 = z5;
                        sy0 sy0Var3 = new sy0(0, unVar3, kyVar3, rw0Var3, context3, sharedPreferences3, mutableState3, z2);
                        composer3.updateRememberedValue(sy0Var3);
                        rememberedValue3 = sy0Var3;
                    } else {
                        z2 = z5;
                    }
                    SwitchKt.Switch(booleanValue3, (ky) rememberedValue3, null, null, z2, null, null, composer3, 0, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ fy0(int i, un unVar, ky kyVar, rw0 rw0Var, Context context, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.d = i;
        this.k = mutableState;
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = z;
        this.i = rw0Var;
        this.h = context;
        this.j = kyVar;
    }
}
