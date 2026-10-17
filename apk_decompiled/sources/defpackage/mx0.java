package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.AndroidMenu_androidKt;
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
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class mx0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ un f;
    public final /* synthetic */ rw0 g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ SharedPreferences i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;

    public /* synthetic */ mx0(MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, un unVar, rw0 rw0Var, ky kyVar, MutableState mutableState3, boolean z) {
        this.d = 0;
        this.e = mutableState;
        this.k = mutableState2;
        this.i = sharedPreferences;
        this.f = unVar;
        this.g = rw0Var;
        this.h = kyVar;
        this.l = mutableState3;
        this.j = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        MutableState mutableState = this.e;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-274112697, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2411)");
                    }
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        List list = ce.a;
                        Integer num = (Integer) yi.y0(list);
                        int intValue2 = num != null ? num.intValue() : 0;
                        Integer num2 = (Integer) yi.x0(list);
                        rememberedValue = "Stops charging at a set percentage — tracks the same battery % shown in the UI, applies immediately.\n(" + intValue2 + "–" + (num2 != null ? num2.intValue() : 100) + "%)";
                        composer.updateRememberedValue(rememberedValue);
                    }
                    String str = (String) rememberedValue;
                    final MutableState mutableState2 = this.e;
                    final MutableState mutableState3 = this.k;
                    final SharedPreferences sharedPreferences = this.i;
                    final un unVar = this.f;
                    final rw0 rw0Var = this.g;
                    final ky kyVar = this.h;
                    final MutableState mutableState4 = this.l;
                    final boolean z = this.j;
                    o01.a("Battery Charge Limit", str, null, ComposableLambdaKt.rememberComposableLambda(-301544839, true, new my() { // from class: ny0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj4, Object obj5) {
                            Composer composer2 = (Composer) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            int i2 = 2;
                            if (composer2.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-301544839, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2416)");
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
                                Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion2, companion.getTopStart(), false, 2, null);
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, wrapContentSize$default);
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
                                uo.h(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Object rememberedValue2 = composer2.rememberedValue();
                                Composer.Companion companion4 = Composer.Companion;
                                Object empty = companion4.getEmpty();
                                MutableState mutableState5 = MutableState.this;
                                if (rememberedValue2 == empty) {
                                    rememberedValue2 = new j3(mutableState5, 19);
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                PaddingValues m756PaddingValuesYgX7TsA = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(4.0f));
                                MutableState mutableState6 = mutableState3;
                                ButtonKt.TextButton((iy) rememberedValue2, null, false, null, null, null, null, m756PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(1789018080, true, new t2(mutableState6, mutableState5, i2), composer2, 54), composer2, 817889286, 382);
                                boolean booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                                Object rememberedValue3 = composer2.rememberedValue();
                                if (rememberedValue3 == companion4.getEmpty()) {
                                    rememberedValue3 = new j3(mutableState5, 20);
                                    composer2.updateRememberedValue(rememberedValue3);
                                }
                                un unVar2 = unVar;
                                ky kyVar2 = kyVar;
                                rw0 rw0Var2 = rw0Var;
                                SharedPreferences sharedPreferences2 = sharedPreferences;
                                AndroidMenu_androidKt.m1603DropdownMenuIlH_yew(booleanValue, (iy) rememberedValue3, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-942757304, true, new lx0(unVar2, kyVar2, rw0Var2, sharedPreferences2, mutableState6, mutableState5), composer2, 54), composer2, 48, 48, 2044);
                                composer2.endNode();
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composer2, 48);
                                int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion2);
                                iy constructor3 = companion3.getConstructor();
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
                                uo.h(companion3, m3878constructorimpl3, columnMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                                Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i3 = MaterialTheme.$stable;
                                TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme.getColorScheme(composer2, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getLabelMedium(), composer2, 6, 0, 131066);
                                MutableState mutableState7 = mutableState4;
                                boolean booleanValue2 = ((Boolean) mutableState7.getValue()).booleanValue();
                                boolean changed = composer2.changed(mutableState7) | composer2.changedInstance(sharedPreferences2) | composer2.changed(kyVar2);
                                Object rememberedValue4 = composer2.rememberedValue();
                                if (changed || rememberedValue4 == companion4.getEmpty()) {
                                    rememberedValue4 = new dy0(sharedPreferences2, kyVar2, mutableState7, 1);
                                    composer2.updateRememberedValue(rememberedValue4);
                                }
                                SwitchKt.Switch(booleanValue2, (ky) rememberedValue4, null, null, z, null, null, composer2, 0, 108);
                                composer2.endNode();
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
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-547628010, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3768)");
                    }
                    o01.a("Set Min Frequency", (String) mutableState.getValue(), null, ComposableLambdaKt.rememberComposableLambda(-1321015608, true, new cy0(this.f, this.g, this.h, this.i, this.j, this.k, this.l, 0), composer2, 54), composer2, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer3.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-946340777, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:4049)");
                    }
                    boolean changed = composer3.changed((String) mutableState.getValue());
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = "Sets minimum GPU frequency to " + ((String) mutableState.getValue()) + " MHz";
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    o01.a("Set Min Frequency", (String) rememberedValue2, null, ComposableLambdaKt.rememberComposableLambda(-1719728375, true, new cy0(this.f, this.g, this.h, this.i, this.j, this.k, this.l, 1), composer3, 54), composer3, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ mx0(MutableState mutableState, un unVar, rw0 rw0Var, ky kyVar, SharedPreferences sharedPreferences, boolean z, MutableState mutableState2, MutableState mutableState3, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = unVar;
        this.g = rw0Var;
        this.h = kyVar;
        this.i = sharedPreferences;
        this.j = z;
        this.k = mutableState2;
        this.l = mutableState3;
    }
}
