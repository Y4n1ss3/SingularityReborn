package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ExpandMoreKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.lumi.singularity.ui.activities.MainActivity;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class d9 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ d9(jm jmVar, un unVar, ky kyVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 1;
        this.e = unVar;
        this.h = kyVar;
        this.i = jmVar;
        this.f = mutableState;
        this.g = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0734  */
    @Override // defpackage.ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        boolean z;
        final int i;
        w01 FullScreenSearchBarLayout_EQC0FA8$lambda$62$lambda$61;
        int i2 = this.d;
        final MutableState mutableState = this.f;
        w01 w01Var = w01.a;
        Object obj4 = this.g;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.e;
        switch (i2) {
            case 0:
                un unVar = (un) obj7;
                Context context = (Context) obj6;
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1444020514, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:856)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composer2, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
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
                    uo.h(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Apps from Singularity-Apps-repo", null, materialTheme.getColorScheme(composer2, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodySmall(), composer2, 6, 0, 131066);
                    boolean changedInstance = composer2.changedInstance(unVar) | composer2.changedInstance(context);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        o9 o9Var = new o9(unVar, context, this.f, mutableState2, mutableState3, 0);
                        composer2.updateRememberedValue(o9Var);
                        rememberedValue = o9Var;
                    }
                    IconButtonKt.IconButton((iy) rememberedValue, null, false, null, null, null, wk.i, composer2, 1572864, 62);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                un unVar2 = (un) obj7;
                ky kyVar = (ky) obj6;
                jm jmVar = (jm) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= composer3.changed(paddingValues) ? 4 : 2;
                }
                if (!composer3.shouldExecute((intValue2 & 19) != 18, intValue2 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1237945717, intValue2, -1, "com.lumi.singularity.ui.activities.ControllerInfoScreen.<anonymous> (ControllerInfoActivity.kt:153)");
                    }
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier padding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues);
                    Alignment.Companion companion3 = Alignment.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, padding);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    iy constructor2 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                    uo.h(companion4, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion4, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MutableState mutableState5 = this.f;
                    if (((Boolean) mutableState5.getValue()).booleanValue()) {
                        composer3.startReplaceGroup(-953549237);
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
                        iy constructor3 = companion4.getConstructor();
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
                        uo.h(companion4, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion4, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f)), companion3.getCenterHorizontally(), composer3, 54);
                        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion2);
                        iy constructor4 = companion4.getConstructor();
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
                        uo.h(companion4, m3878constructorimpl4, columnMeasurePolicy, m3878constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion4, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(SizeKt.m807size3ABfNKs(companion2, Dp.m7611constructorimpl(40.0f)), 0L, 0.0f, 0L, 0, 0.0f, composer3, 6, 62);
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        int i4 = MaterialTheme.$stable;
                        TextKt.m2607TextNvy7gAk("Loading controllers...", null, materialTheme2.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i4).getBodyMedium(), composer3, 6, 0, 131066);
                        composer3.endNode();
                        composer3.endNode();
                        composer3.endReplaceGroup();
                        composer = composer3;
                    } else {
                        composer3.startReplaceGroup(-952777771);
                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        PaddingValues m756PaddingValuesYgX7TsA = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
                        Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f));
                        boolean changedInstance2 = composer3.changedInstance(unVar2) | composer3.changed(kyVar) | composer3.changedInstance(jmVar);
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                            y4 y4Var = new y4(jmVar, unVar2, kyVar, mutableState4, mutableState5);
                            composer3.updateRememberedValue(y4Var);
                            rememberedValue2 = y4Var;
                        }
                        composer = composer3;
                        LazyDslKt.LazyColumn(fillMaxSize$default2, null, m756PaddingValuesYgX7TsA, false, m647spacedBy0680j_4, null, null, false, null, (ky) rememberedValue2, composer, 24966, 490);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj7;
                cq0 cq0Var = (cq0) obj6;
                MutableState mutableState6 = (MutableState) obj4;
                MutableState mutableState7 = (MutableState) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer4.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(796484437, intValue3, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1605)");
                    }
                    Modifier.Companion companion5 = Modifier.Companion;
                    Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
                    Alignment.Companion companion6 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion6.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer4, 48);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, m763paddingVpY3zN4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    iy constructor5 = companion7.getConstructor();
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
                    uo.h(companion7, m3878constructorimpl5, rowMeasurePolicy2, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion7, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion5, 1.0f, false, 2, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer4, 0);
                    int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer4, weight$default);
                    iy constructor6 = companion7.getConstructor();
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
                    uo.h(companion7, m3878constructorimpl6, columnMeasurePolicy2, m3878constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion7, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Run on boot", null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer4, i5).getBodyMedium(), composer4, 1572870, 0, 131006);
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "App will launch and root on startup" : "App will not launch on startup", null, materialTheme3.getColorScheme(composer4, i5).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer4, i5).getBodySmall(), composer4, 0, 0, 131066);
                    composer4.endNode();
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changedInstance3 = composer4.changedInstance(sharedPreferences);
                    Object rememberedValue3 = composer4.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new c70(sharedPreferences, mutableState, 10);
                        composer4.updateRememberedValue(rememberedValue3);
                    }
                    ky kyVar2 = (ky) rememberedValue3;
                    if (!((Boolean) mutableState6.getValue()).booleanValue()) {
                        if (((MainActivity) cq0Var).p((ku) mutableState7.getValue())) {
                            z = false;
                            SwitchKt.Switch(booleanValue, kyVar2, null, null, z, null, null, composer4, 0, 108);
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                break;
                            }
                        }
                    }
                    z = true;
                    SwitchKt.Switch(booleanValue, kyVar2, null, null, z, null, null, composer4, 0, 108);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                break;
            case 3:
                final SharedPreferences sharedPreferences2 = (SharedPreferences) obj7;
                final MutableState mutableState8 = (MutableState) obj4;
                State state = (State) obj6;
                MutableState mutableState9 = (MutableState) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer5.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1668665935, intValue4, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1733)");
                    }
                    Modifier.Companion companion8 = Modifier.Companion;
                    Modifier m763paddingVpY3zN42 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement2.getTop();
                    Alignment.Companion companion9 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top, companion9.getStart(), composer5, 0);
                    int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                    CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer5, m763paddingVpY3zN42);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                    iy constructor7 = companion10.getConstructor();
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
                    uo.h(companion10, m3878constructorimpl7, columnMeasurePolicy3, m3878constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion10, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                    boolean changedInstance4 = composer5.changedInstance(sharedPreferences2);
                    Object rememberedValue4 = composer5.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        final int i6 = 0;
                        rememberedValue4 = new iy() { // from class: i70
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.iy
                            public final Object invoke() {
                                int i7 = i6;
                                w01 w01Var2 = w01.a;
                                MutableState mutableState10 = mutableState;
                                SharedPreferences sharedPreferences3 = sharedPreferences2;
                                switch (i7) {
                                    case 0:
                                        mutableState10.setValue(Boolean.valueOf(!((Boolean) mutableState10.getValue()).booleanValue()));
                                        sharedPreferences3.edit().putBoolean("timing_expanded", ((Boolean) mutableState10.getValue()).booleanValue()).apply();
                                        break;
                                    default:
                                        sharedPreferences3.edit().putFloat("payload_settle_sec", ((Number) mutableState10.getValue()).floatValue()).apply();
                                        break;
                                }
                                return w01Var2;
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue4);
                    }
                    Modifier m262clickableoSLSa3U$default = ClickableKt.m262clickableoSLSa3U$default(fillMaxWidth$default2, false, null, null, null, (iy) rememberedValue4, 15, null);
                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion9.getCenterVertically(), composer5, 48);
                    int hashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                    CompositionLocalMap currentCompositionLocalMap8 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer5, m262clickableoSLSa3U$default);
                    iy constructor8 = companion10.getConstructor();
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
                    uo.h(companion10, m3878constructorimpl8, rowMeasurePolicy3, m3878constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, k4.c(companion10, m3878constructorimpl8, Integer.valueOf(hashCode8), m3878constructorimpl8));
                    Modifier weight$default2 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion8, 1.0f, false, 2, null);
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion9.getStart(), composer5, 0);
                    int hashCode9 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                    CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer5, weight$default2);
                    iy constructor9 = companion10.getConstructor();
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
                    uo.h(companion10, m3878constructorimpl9, columnMeasurePolicy4, m3878constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3886setimpl(m3878constructorimpl9, materializeModifier9, k4.c(companion10, m3878constructorimpl9, Integer.valueOf(hashCode9), m3878constructorimpl9));
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i7 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme4.getTypography(composer5, i7).getBodyMedium();
                    FontWeight.Companion companion11 = FontWeight.Companion;
                    TextKt.m2607TextNvy7gAk("Exploit Timing", null, 0L, null, 0L, null, companion11.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer5, 1572870, 0, 131006);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer5.startReplaceGroup(-227371609);
                        TextKt.m2607TextNvy7gAk("How long to wait for poisoning. Increase if rooting is unreliable; decrease for a faster run.", null, materialTheme4.getColorScheme(composer5, i7).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer5, i7).getBodySmall(), composer5, 6, 0, 131066);
                    } else {
                        composer5.startReplaceGroup(-308782879);
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    TextKt.m2607TextNvy7gAk(String.format(Locale.US, "%.1fs", Arrays.copyOf(new Object[]{Float.valueOf(((Number) mutableState8.getValue()).floatValue())}, 1)), null, materialTheme4.getColorScheme(composer5, i7).m1772getPrimary0d7_KjU(), null, 0L, null, companion11.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer5, i7).getBodyMedium(), composer5, 1572864, 0, 131002);
                    SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion8, Dp.m7611constructorimpl(8.0f)), composer5, 6);
                    IconKt.m2055Iconww6aTOc(ExpandMoreKt.getExpandMore(Icons.INSTANCE.getDefault()), ((Boolean) mutableState.getValue()).booleanValue() ? "Collapse" : "Expand", RotateKt.rotate(SizeKt.m807size3ABfNKs(companion8, Dp.m7611constructorimpl(20.0f)), ((Number) state.getValue()).floatValue()), materialTheme4.getColorScheme(composer5, i7).m1765getOnSurfaceVariant0d7_KjU(), composer5, 0, 0);
                    composer5.endNode();
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer5.startReplaceGroup(2094665163);
                        SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion8, Dp.m7611constructorimpl(4.0f)), composer5, 6);
                        float floatValue = ((Number) mutableState8.getValue()).floatValue();
                        ti tiVar = new ti(0.3f, 3.0f);
                        boolean z2 = !((Boolean) mutableState9.getValue()).booleanValue();
                        boolean changedInstance5 = composer5.changedInstance(sharedPreferences2);
                        Object rememberedValue5 = composer5.rememberedValue();
                        if (changedInstance5 || rememberedValue5 == Composer.Companion.getEmpty()) {
                            rememberedValue5 = new c70(sharedPreferences2, mutableState8, 11);
                            composer5.updateRememberedValue(rememberedValue5);
                        }
                        ky kyVar3 = (ky) rememberedValue5;
                        boolean changedInstance6 = composer5.changedInstance(sharedPreferences2);
                        Object rememberedValue6 = composer5.rememberedValue();
                        if (changedInstance6 || rememberedValue6 == Composer.Companion.getEmpty()) {
                            i = 1;
                            rememberedValue6 = new iy() { // from class: i70
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.iy
                                public final Object invoke() {
                                    int i72 = i;
                                    w01 w01Var2 = w01.a;
                                    MutableState mutableState10 = mutableState8;
                                    SharedPreferences sharedPreferences3 = sharedPreferences2;
                                    switch (i72) {
                                        case 0:
                                            mutableState10.setValue(Boolean.valueOf(!((Boolean) mutableState10.getValue()).booleanValue()));
                                            sharedPreferences3.edit().putBoolean("timing_expanded", ((Boolean) mutableState10.getValue()).booleanValue()).apply();
                                            break;
                                        default:
                                            sharedPreferences3.edit().putFloat("payload_settle_sec", ((Number) mutableState10.getValue()).floatValue()).apply();
                                            break;
                                    }
                                    return w01Var2;
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue6);
                        } else {
                            i = 1;
                        }
                        SliderKt.Slider(floatValue, kyVar3, null, z2, tiVar, 26, (iy) rememberedValue6, null, null, composer5, 196608, 388);
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion8, 0.0f, i, null);
                        MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion9.getTop(), composer5, 6);
                        int hashCode10 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                        CompositionLocalMap currentCompositionLocalMap10 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default3);
                        iy constructor10 = companion10.getConstructor();
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
                        uo.h(companion10, m3878constructorimpl10, rowMeasurePolicy4, m3878constructorimpl10, currentCompositionLocalMap10);
                        Updater.m3886setimpl(m3878constructorimpl10, materializeModifier10, k4.c(companion10, m3878constructorimpl10, Integer.valueOf(hashCode10), m3878constructorimpl10));
                        TextKt.m2607TextNvy7gAk("0.3s (fast)", null, materialTheme4.getColorScheme(composer5, i7).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer5, i7).getLabelSmall(), composer5, 6, 0, 131066);
                        TextKt.m2607TextNvy7gAk("3.0s (safe)", null, materialTheme4.getColorScheme(composer5, i7).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer5, i7).getLabelSmall(), composer5, 6, 0, 131066);
                        composer5.endNode();
                    } else {
                        composer5.startReplaceGroup(2011862427);
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 4:
                FullScreenSearchBarLayout_EQC0FA8$lambda$62$lambda$61 = SearchBarKt.FullScreenSearchBarLayout_EQC0FA8$lambda$62$lambda$61((Shape) obj7, (Shape) obj6, (Density) obj4, (SearchBarState) obj5, this.f, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
                break;
            case 5:
                SharedPreferences sharedPreferences3 = (SharedPreferences) obj6;
                un unVar3 = (un) obj7;
                ky kyVar4 = (ky) obj5;
                MutableState mutableState10 = (MutableState) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer6.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                    composer6.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1842995392, intValue5, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2837)");
                    }
                    o01.a("Enable Gamepad Mode", "Lets your Touch Plus controllers mimic an Xbox gamepad (Steamlink/Xbox App)", null, ComposableLambdaKt.rememberComposableLambda(-1226264846, true, new om(this.f, sharedPreferences3, unVar3, kyVar4, mutableState10, 2), composer6, 54), composer6, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                SharedPreferences sharedPreferences4 = (SharedPreferences) obj7;
                ky kyVar5 = (ky) obj6;
                rw0 rw0Var = (rw0) obj5;
                MutableState mutableState11 = (MutableState) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer7.shouldExecute((intValue6 & 17) != 16, intValue6 & 1)) {
                    composer7.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1406702184, intValue6, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1690)");
                    }
                    o01.a("Internet Kill Switch", "Blocks internet access on boot (No Root).", null, ComposableLambdaKt.rememberComposableLambda(-11648566, true, new om(this.f, sharedPreferences4, kyVar5, rw0Var, mutableState11, 3), composer7, 54), composer7, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ d9(SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, State state, MutableState mutableState3) {
        this.d = 3;
        this.e = sharedPreferences;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = state;
        this.i = mutableState3;
    }

    public /* synthetic */ d9(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, ky kyVar, MutableState mutableState2) {
        this.d = 5;
        this.f = mutableState;
        this.h = sharedPreferences;
        this.e = unVar;
        this.i = kyVar;
        this.g = mutableState2;
    }

    public /* synthetic */ d9(MutableState mutableState, SharedPreferences sharedPreferences, ky kyVar, rw0 rw0Var, MutableState mutableState2) {
        this.d = 6;
        this.f = mutableState;
        this.e = sharedPreferences;
        this.h = kyVar;
        this.i = rw0Var;
        this.g = mutableState2;
    }

    public /* synthetic */ d9(Shape shape, Shape shape2, Density density, SearchBarState searchBarState, MutableState mutableState) {
        this.d = 4;
        this.e = shape;
        this.h = shape2;
        this.g = density;
        this.i = searchBarState;
        this.f = mutableState;
    }

    public /* synthetic */ d9(Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.d = i;
        this.e = obj;
        this.h = obj2;
        this.f = mutableState;
        this.g = mutableState2;
        this.i = mutableState3;
    }
}
