package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ux0 implements ny {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ un f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ rw0 i;
    public final /* synthetic */ ky j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ux0(MutableState mutableState, un unVar, SharedPreferences sharedPreferences, MutableState mutableState2, rw0 rw0Var, ky kyVar, boolean z, MutableState mutableState3, ArrayList arrayList, MutableState mutableState4, MutableState mutableState5) {
        this.e = mutableState;
        this.f = unVar;
        this.g = sharedPreferences;
        this.h = mutableState2;
        this.i = rw0Var;
        this.j = kyVar;
        this.k = z;
        this.l = mutableState3;
        this.o = arrayList;
        this.m = mutableState4;
        this.n = mutableState5;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                final MutableState mutableState = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1194431076, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1627)");
                    }
                    final MutableState mutableState2 = this.e;
                    final SharedPreferences sharedPreferences = this.g;
                    final rw0 rw0Var = this.i;
                    final ky kyVar = this.j;
                    final MutableState mutableState3 = this.h;
                    final MutableState mutableState4 = this.l;
                    final un unVar = this.f;
                    final boolean z = this.k;
                    final MutableState mutableState5 = this.m;
                    final MutableState mutableState6 = this.n;
                    o01.a("Custom LED Color", "Set a static color for the LED", null, ComposableLambdaKt.rememberComposableLambda(421043478, true, new my() { // from class: hy0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj5, Object obj6) {
                            SharedPreferences sharedPreferences2;
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            if (composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(421043478, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1628)");
                                }
                                Alignment.Companion companion = Alignment.Companion;
                                Alignment.Vertical centerVertically = companion.getCenterVertically();
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f));
                                Modifier.Companion companion2 = Modifier.Companion;
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m647spacedBy0680j_4, centerVertically, composer2, 54);
                                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                                uo.h(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composer2, 48);
                                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                                uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i2 = MaterialTheme.$stable;
                                TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme.getColorScheme(composer2, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i2).getLabelMedium(), composer2, 6, 0, 131066);
                                MutableState mutableState7 = mutableState5;
                                boolean booleanValue = ((Boolean) mutableState7.getValue()).booleanValue();
                                boolean changed = composer2.changed(mutableState7);
                                SharedPreferences sharedPreferences3 = sharedPreferences;
                                boolean changedInstance = changed | composer2.changedInstance(sharedPreferences3);
                                MutableState mutableState8 = mutableState6;
                                boolean changed2 = changedInstance | composer2.changed(mutableState8);
                                MutableState mutableState9 = mutableState;
                                boolean changed3 = changed2 | composer2.changed(mutableState9);
                                ky kyVar2 = kyVar;
                                boolean changed4 = changed3 | composer2.changed(kyVar2);
                                Object rememberedValue = composer2.rememberedValue();
                                if (changed4 || rememberedValue == Composer.Companion.getEmpty()) {
                                    bx0 bx0Var = new bx0(sharedPreferences3, kyVar2, mutableState7, mutableState8, mutableState9, 0);
                                    sharedPreferences2 = sharedPreferences3;
                                    composer2.updateRememberedValue(bx0Var);
                                    rememberedValue = bx0Var;
                                } else {
                                    sharedPreferences2 = sharedPreferences3;
                                }
                                boolean z2 = z;
                                SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z2, null, null, composer2, 0, 108);
                                composer2.endNode();
                                Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(companion2, Dp.m7611constructorimpl(90.0f));
                                RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                MutableState mutableState10 = MutableState.this;
                                boolean changed5 = composer2.changed(mutableState10) | composer2.changedInstance(sharedPreferences2);
                                rw0 rw0Var2 = rw0Var;
                                boolean changedInstance2 = changed5 | composer2.changedInstance(rw0Var2) | composer2.changed(kyVar2);
                                MutableState mutableState11 = mutableState3;
                                boolean changed6 = changedInstance2 | composer2.changed(mutableState11);
                                MutableState mutableState12 = mutableState4;
                                boolean changed7 = changed6 | composer2.changed(mutableState12);
                                un unVar2 = unVar;
                                boolean changedInstance3 = composer2.changedInstance(unVar2) | changed7;
                                Object rememberedValue2 = composer2.rememberedValue();
                                if (changedInstance3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    uw0 uw0Var = new uw0(sharedPreferences2, rw0Var2, kyVar2, unVar2, mutableState10, mutableState11, mutableState12);
                                    composer2.updateRememberedValue(uw0Var);
                                    rememberedValue2 = uw0Var;
                                }
                                ButtonKt.Button((iy) rememberedValue2, m812width3ABfNKs, z2, m1056RoundedCornerShape0680j_4, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(202210154, true, new s2(mutableState10, 6), composer2, 54), composer2, 805306416, 496);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return w01.a;
                        }
                    }, composer, 54), composer, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2056070848, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:4099)");
                    }
                    MutableState mutableState7 = this.e;
                    boolean changed = composer2.changed((List) mutableState7.getValue());
                    Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        Integer num = (Integer) yi.y0((List) mutableState7.getValue());
                        int intValue3 = num != null ? num.intValue() : 0;
                        Integer num2 = (Integer) yi.x0((List) mutableState7.getValue());
                        rememberedValue = "Sets maximum GPU frequency from selection\n(" + intValue3 + "–" + (num2 != null ? num2.intValue() : 0) + " MHz)";
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    o01.a("Set Max Frequency", (String) rememberedValue, null, ComposableLambdaKt.rememberComposableLambda(2042756978, true, new ky0(this.f, this.g, this.h, this.i, this.j, this.k, this.l, arrayList, this.m, this.n), composer2, 54), composer2, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ ux0(MutableState mutableState, SharedPreferences sharedPreferences, rw0 rw0Var, ky kyVar, MutableState mutableState2, MutableState mutableState3, un unVar, boolean z, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.e = mutableState;
        this.g = sharedPreferences;
        this.i = rw0Var;
        this.j = kyVar;
        this.h = mutableState2;
        this.l = mutableState3;
        this.f = unVar;
        this.k = z;
        this.m = mutableState4;
        this.n = mutableState5;
        this.o = mutableState6;
    }
}
