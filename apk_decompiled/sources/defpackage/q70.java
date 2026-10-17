package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SyncKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class q70 implements my {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ q70(un unVar, ky kyVar, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.g = sharedPreferences;
        this.h = unVar;
        this.i = rw0Var;
        this.e = kyVar;
        this.f = z;
        this.j = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        long m1790getSurfaceVariant0d7_KjU;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj3 = this.j;
        Object obj4 = this.e;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                String str = (String) obj7;
                iy iyVar = (iy) obj5;
                String str2 = (String) obj6;
                ky kyVar = (ky) obj4;
                ky kyVar2 = (ky) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-876761214, intValue, -1, "com.lumi.singularity.ui.activities.UpdateOptionsDialog.<anonymous> (MainActivity.kt:2504)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f)), centerHorizontally, composer, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
                    Modifier clip = ClipKt.clip(SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(72.0f)), RoundedCornerShapeKt.getCircleShape());
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(clip, materialTheme.getColorScheme(composer, i2).m1773getPrimaryContainer0d7_KjU(), null, 2, null);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m227backgroundbw27NRU$default);
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
                    uo.h(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    IconKt.m2055Iconww6aTOc(SyncKt.getSync(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(36.0f)), materialTheme.getColorScheme(composer, i2).m1757getOnPrimaryContainer0d7_KjU(), composer, 432, 0);
                    composer.endNode();
                    TextStyle titleLarge = materialTheme.getTypography(composer, i2).getTitleLarge();
                    FontWeight semiBold = FontWeight.Companion.getSemiBold();
                    TextAlign.Companion companion4 = TextAlign.Companion;
                    TextKt.m2607TextNvy7gAk("Update Options", null, 0L, null, 0L, null, semiBold, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, titleLarge, composer, 1572870, 0, 129982);
                    TextKt.m2607TextNvy7gAk("v".concat(str), null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 0, 0, 130042);
                    TextKt.m2607TextNvy7gAk("Update Channel", null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getLabelSmall(), composer, 6, 0, 131066);
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion2.getTop(), composer, 6);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
                    iy constructor3 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer);
                    uo.h(companion3, m3878constructorimpl3, rowMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer.startReplaceGroup(-1912333951);
                    for (String str3 : y80.E("stable", "dev")) {
                        boolean b = q10.b(str2, str3);
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
                        RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        if (b) {
                            composer.startReplaceGroup(-1224411684);
                            m1790getSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1773getPrimaryContainer0d7_KjU();
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-1224409126);
                            m1790getSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1790getSurfaceVariant0d7_KjU();
                            composer.endReplaceGroup();
                        }
                        ButtonColors m1658buttonColorsro_MJ88 = buttonDefaults.m1658buttonColorsro_MJ88(m1790getSurfaceVariant0d7_KjU, 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14);
                        RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                        boolean changed = composer.changed(kyVar) | composer.changed(str3);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new mm(2, str3, kyVar);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        ButtonKt.Button((iy) rememberedValue, weight$default, false, m1056RoundedCornerShape0680j_4, m1658buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1027088700, true, new g6(1, b, str3), composer, 54), composer, 805306368, 484);
                        rowScopeInstance = rowScopeInstance2;
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    Modifier.Companion companion5 = Modifier.Companion;
                    ButtonKt.Button(iyVar, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, el.e, composer, 805306416, 500);
                    CardKt.Card(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1976005994, true, new g6(this.f, kyVar2), composer, 54), composer, 196614, 28);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer.skipToGroupEnd();
                    break;
                }
                break;
            case 1:
                un unVar = (un) obj7;
                my myVar = (my) obj6;
                MutableState mutableState = (MutableState) obj5;
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                ky kyVar3 = (ky) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1250015225, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3518)");
                    }
                    Alignment.Horizontal centerHorizontally2 = Alignment.Companion.getCenterHorizontally();
                    Modifier.Companion companion6 = Modifier.Companion;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion6);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    iy constructor4 = companion7.getConstructor();
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
                    uo.h(companion7, m3878constructorimpl4, columnMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion7, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changedInstance = composer2.changedInstance(unVar) | composer2.changedInstance(myVar) | composer2.changed(mutableState) | composer2.changedInstance(sharedPreferences) | composer2.changed(kyVar3);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                        y4 y4Var = new y4(unVar, myVar, sharedPreferences, kyVar3, mutableState);
                        composer2.updateRememberedValue(y4Var);
                        rememberedValue2 = y4Var;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue2, null, null, this.f, null, null, composer2, 0, 108);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer2.skipToGroupEnd();
                    break;
                }
                break;
            case 2:
                MutableState mutableState2 = (MutableState) obj7;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj6;
                ky kyVar4 = (ky) obj4;
                un unVar2 = (un) obj5;
                MutableState mutableState3 = (MutableState) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(502870426, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2024)");
                    }
                    Modifier.Companion companion8 = Modifier.Companion;
                    Modifier width = IntrinsicKt.width(companion8, IntrinsicSize.Max);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement2.getTop();
                    Alignment.Companion companion9 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top, companion9.getStart(), composer3, 0);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer3, width);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                    iy constructor5 = companion10.getConstructor();
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
                    uo.h(companion10, m3878constructorimpl5, columnMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion10, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally3 = companion9.getCenterHorizontally();
                    Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally3, composer3, 48);
                    int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default3);
                    iy constructor6 = companion10.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer3);
                    uo.h(companion10, m3878constructorimpl6, columnMeasurePolicy4, m3878constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion10, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Enable on Boot", null, materialTheme2.getColorScheme(composer3, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i3).getLabelMedium(), composer3, 6, 0, 131066);
                    boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                    boolean changed2 = composer3.changed(mutableState2) | composer3.changedInstance(sharedPreferences2) | composer3.changed(kyVar4);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new dy0(sharedPreferences2, kyVar4, mutableState2, 2);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    boolean z = this.f;
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue3, null, null, z, null, null, composer3, 0, 108);
                    composer3.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion8, Dp.m7611constructorimpl(8.0f)), composer3, 6);
                    Alignment.Horizontal centerHorizontally4 = companion9.getCenterHorizontally();
                    Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                    MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally4, composer3, 48);
                    int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default4);
                    iy constructor7 = companion10.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer3);
                    uo.h(companion10, m3878constructorimpl7, columnMeasurePolicy5, m3878constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion10, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                    TextKt.m2607TextNvy7gAk("ADB Status", null, materialTheme2.getColorScheme(composer3, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i3).getLabelMedium(), composer3, 6, 0, 131066);
                    boolean booleanValue3 = ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean changedInstance2 = composer3.changedInstance(sharedPreferences2) | composer3.changedInstance(unVar2) | composer3.changed(kyVar4);
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new ax0(sharedPreferences2, unVar2, mutableState3, kyVar4, 3);
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    SwitchKt.Switch(booleanValue3, (ky) rememberedValue4, null, null, z, null, null, composer3, 0, 108);
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer3.skipToGroupEnd();
                    break;
                }
                break;
            case 3:
                MutableState mutableState4 = (MutableState) obj7;
                SharedPreferences sharedPreferences3 = (SharedPreferences) obj6;
                un unVar3 = (un) obj5;
                MutableState mutableState5 = (MutableState) obj4;
                my myVar2 = (my) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-809074100, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3589)");
                    }
                    Alignment.Horizontal end = Alignment.Companion.getEnd();
                    Modifier.Companion companion11 = Modifier.Companion;
                    MeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer4, 48);
                    int hashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap8 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer4, companion11);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.Companion;
                    iy constructor8 = companion12.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor8);
                    } else {
                        composer4.useNode();
                    }
                    Composer m3878constructorimpl8 = Updater.m3878constructorimpl(composer4);
                    uo.h(companion12, m3878constructorimpl8, columnMeasurePolicy6, m3878constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, k4.c(companion12, m3878constructorimpl8, Integer.valueOf(hashCode8), m3878constructorimpl8));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState4.getValue()).booleanValue() ? "Void Transition" : "Immersive Transition", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyMedium(), composer4, 0, 0, 131070);
                    boolean booleanValue4 = ((Boolean) mutableState4.getValue()).booleanValue();
                    boolean changed3 = composer4.changed(mutableState4) | composer4.changedInstance(sharedPreferences3) | composer4.changedInstance(unVar3) | composer4.changed(mutableState5) | composer4.changedInstance(myVar2);
                    Object rememberedValue5 = composer4.rememberedValue();
                    if (changed3 || rememberedValue5 == Composer.Companion.getEmpty()) {
                        y4 y4Var2 = new y4(sharedPreferences3, unVar3, mutableState4, myVar2, mutableState5, 6);
                        composer4.updateRememberedValue(y4Var2);
                        rememberedValue5 = y4Var2;
                    }
                    SwitchKt.Switch(booleanValue4, (ky) rememberedValue5, null, null, this.f, null, null, composer4, 0, 108);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer4.skipToGroupEnd();
                    break;
                }
                break;
            default:
                SharedPreferences sharedPreferences4 = (SharedPreferences) obj7;
                un unVar4 = (un) obj6;
                rw0 rw0Var = (rw0) obj5;
                ky kyVar5 = (ky) obj4;
                MutableState mutableState6 = (MutableState) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((intValue5 & 3) != 2, intValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1010537442, intValue5, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3220)");
                    }
                    boolean booleanValue5 = ((Boolean) mutableState6.getValue()).booleanValue();
                    boolean changedInstance3 = composer5.changedInstance(sharedPreferences4) | composer5.changedInstance(unVar4) | composer5.changedInstance(rw0Var) | composer5.changed(kyVar5);
                    Object rememberedValue6 = composer5.rememberedValue();
                    if (changedInstance3 || rememberedValue6 == Composer.Companion.getEmpty()) {
                        rememberedValue6 = new y4((Object) sharedPreferences4, (Object) unVar4, (Object) mutableState6, (Object) rw0Var, kyVar5, 8);
                        composer5.updateRememberedValue(rememberedValue6);
                    }
                    SwitchKt.Switch(booleanValue5, (ky) rememberedValue6, null, null, this.f, null, null, composer5, 0, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer5.skipToGroupEnd();
                    break;
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ q70(un unVar, my myVar, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, boolean z) {
        this.g = mutableState;
        this.h = sharedPreferences;
        this.i = unVar;
        this.e = mutableState2;
        this.j = myVar;
        this.f = z;
    }

    public /* synthetic */ q70(un unVar, my myVar, MutableState mutableState, SharedPreferences sharedPreferences, ky kyVar, boolean z) {
        this.g = unVar;
        this.h = myVar;
        this.i = mutableState;
        this.j = sharedPreferences;
        this.e = kyVar;
        this.f = z;
    }

    public /* synthetic */ q70(MutableState mutableState, SharedPreferences sharedPreferences, ky kyVar, boolean z, un unVar, MutableState mutableState2) {
        this.g = mutableState;
        this.h = sharedPreferences;
        this.e = kyVar;
        this.f = z;
        this.i = unVar;
        this.j = mutableState2;
    }

    public /* synthetic */ q70(String str, iy iyVar, String str2, ky kyVar, boolean z, ky kyVar2) {
        this.g = str;
        this.i = iyVar;
        this.h = str2;
        this.e = kyVar;
        this.f = z;
        this.j = kyVar2;
    }
}
