package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ey0 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ un g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ky i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ey0(un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, boolean z) {
        this.e = mutableState;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = z;
        this.j = context;
        this.i = kyVar;
        this.k = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                AtomicLong atomicLong = (AtomicLong) obj4;
                my myVar = (my) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-922302841, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3558)");
                    }
                    Alignment.Horizontal end = Alignment.Companion.getEnd();
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer, 48);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
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
                    uo.h(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MutableState mutableState = this.e;
                    TextKt.m2607TextNvy7gAk(((Number) mutableState.getValue()).intValue() == 1 ? "Navigator UI" : "Dock UI", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 131070);
                    boolean z = ((Number) mutableState.getValue()).intValue() == 1;
                    boolean changed = composer.changed(mutableState) | composer.changedInstance(atomicLong);
                    SharedPreferences sharedPreferences = this.f;
                    boolean changedInstance = changed | composer.changedInstance(sharedPreferences);
                    un unVar = this.g;
                    boolean changedInstance2 = changedInstance | composer.changedInstance(unVar) | composer.changedInstance(myVar);
                    ky kyVar = this.i;
                    boolean changed2 = changedInstance2 | composer.changed(kyVar);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
                        g70 g70Var = new g70(atomicLong, sharedPreferences, unVar, mutableState, myVar, kyVar, 1);
                        composer.updateRememberedValue(g70Var);
                        rememberedValue = g70Var;
                    }
                    SwitchKt.Switch(z, (ky) rememberedValue, null, null, this.h, null, null, composer, 0, 108);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Context context = (Context) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-421849581, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2796)");
                    }
                    MutableState mutableState3 = this.e;
                    boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean changed3 = composer2.changed(mutableState3);
                    SharedPreferences sharedPreferences2 = this.f;
                    boolean changedInstance3 = changed3 | composer2.changedInstance(sharedPreferences2);
                    un unVar2 = this.g;
                    boolean changedInstance4 = changedInstance3 | composer2.changedInstance(unVar2);
                    boolean z2 = this.h;
                    boolean changed4 = changedInstance4 | composer2.changed(z2) | composer2.changedInstance(context);
                    ky kyVar2 = this.i;
                    boolean changed5 = composer2.changed(kyVar2) | changed4;
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed5 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        pu puVar = new pu(unVar2, kyVar2, context, sharedPreferences2, mutableState3, mutableState2, z2);
                        composer2.updateRememberedValue(puVar);
                        rememberedValue2 = puVar;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue2, null, null, !((Boolean) mutableState2.getValue()).booleanValue(), null, null, composer2, 0, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                AtomicLong atomicLong2 = (AtomicLong) obj4;
                rw0 rw0Var = (rw0) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(255338943, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3189)");
                    }
                    MutableState mutableState4 = this.e;
                    boolean booleanValue2 = ((Boolean) mutableState4.getValue()).booleanValue();
                    boolean changedInstance5 = composer3.changedInstance(atomicLong2);
                    SharedPreferences sharedPreferences3 = this.f;
                    boolean changedInstance6 = changedInstance5 | composer3.changedInstance(sharedPreferences3);
                    un unVar3 = this.g;
                    boolean changedInstance7 = changedInstance6 | composer3.changedInstance(unVar3) | composer3.changedInstance(rw0Var);
                    ky kyVar3 = this.i;
                    boolean changed6 = changedInstance7 | composer3.changed(kyVar3);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed6 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        g70 g70Var2 = new g70(atomicLong2, sharedPreferences3, unVar3, mutableState4, rw0Var, kyVar3, 2);
                        composer3.updateRememberedValue(g70Var2);
                        rememberedValue3 = g70Var2;
                    }
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue3, null, null, this.h, null, null, composer3, 0, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ ey0(MutableState mutableState, AtomicLong atomicLong, SharedPreferences sharedPreferences, un unVar, my myVar, ky kyVar, boolean z) {
        this.e = mutableState;
        this.j = atomicLong;
        this.f = sharedPreferences;
        this.g = unVar;
        this.k = myVar;
        this.i = kyVar;
        this.h = z;
    }

    public /* synthetic */ ey0(AtomicLong atomicLong, SharedPreferences sharedPreferences, un unVar, rw0 rw0Var, ky kyVar, boolean z, MutableState mutableState) {
        this.j = atomicLong;
        this.f = sharedPreferences;
        this.g = unVar;
        this.k = rw0Var;
        this.i = kyVar;
        this.h = z;
        this.e = mutableState;
    }
}
