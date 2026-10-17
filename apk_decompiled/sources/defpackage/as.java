package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class as implements ny {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ un f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ SnackbarHostState j;

    public /* synthetic */ as(SharedPreferences sharedPreferences, un unVar, Context context, MutableState mutableState, boolean z, SnackbarHostState snackbarHostState) {
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = context;
        this.i = mutableState;
        this.h = z;
        this.j = snackbarHostState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long m1790getSurfaceVariant0d7_KjU;
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= composer.changed(paddingValues) ? 4 : 2;
                }
                if (!composer.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2113113982, intValue, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen.<anonymous> (DomainBlockerActivity.kt:90)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
                    Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(PaddingKt.m764paddingVpY3zN4$default(companion, Dp.m7611constructorimpl(16.0f), 0.0f, 2, null), 0.0f, Dp.m7611constructorimpl(16.0f), 0.0f, Dp.m7611constructorimpl(12.0f), 5, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(4.0f)), companion2.getStart(), composer, 6);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m766paddingqDBjuR0$default);
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
                    TextKt.m2607TextNvy7gAk("Master switch", null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getLabelSmall(), composer, 6, 0, 131066);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    MutableState mutableState = this.i;
                    if (gs.b(mutableState)) {
                        composer.startReplaceGroup(-2079230270);
                        m1790getSurfaceVariant0d7_KjU = materialTheme.getColorScheme(composer, i2).m1773getPrimaryContainer0d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-2079227424);
                        m1790getSurfaceVariant0d7_KjU = materialTheme.getColorScheme(composer, i2).m1790getSurfaceVariant0d7_KjU();
                        composer.endReplaceGroup();
                    }
                    CardColors m1678cardColorsro_MJ88 = cardDefaults.m1678cardColorsro_MJ88(m1790getSurfaceVariant0d7_KjU, 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
                    SharedPreferences sharedPreferences = this.e;
                    un unVar = this.f;
                    Context context = this.g;
                    CardKt.Card(fillMaxWidth$default, m1056RoundedCornerShape0680j_4, m1678cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(1392729056, true, new as(sharedPreferences, unVar, context, this.h, mutableState, this.j), composer, 54), composer, 196614, 24);
                    composer.endNode();
                    TextKt.m2607TextNvy7gAk("Categories", PaddingKt.m764paddingVpY3zN4$default(companion, Dp.m7611constructorimpl(16.0f), 0.0f, 2, null), materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getLabelSmall(), composer, 54, 0, 131064);
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(4.0f)), composer, 6);
                    PaddingValues m756PaddingValuesYgX7TsA = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(8.0f));
                    Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f));
                    boolean changedInstance = composer.changedInstance(sharedPreferences) | composer.changedInstance(unVar) | composer.changedInstance(context);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        x4 x4Var = new x4(sharedPreferences, unVar, context, mutableState, 3);
                        composer.updateRememberedValue(x4Var);
                        rememberedValue = x4Var;
                    }
                    LazyDslKt.LazyColumn(null, null, m756PaddingValuesYgX7TsA, false, m647spacedBy0680j_4, null, null, false, null, (ky) rememberedValue, composer, 24960, 491);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1392729056, intValue2, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DomainBlockerActivity.kt:114)");
                    }
                    Modifier.Companion companion4 = Modifier.Companion;
                    Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
                    Alignment.Companion companion5 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion5.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically, composer2, 48);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m763paddingVpY3zN4);
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
                    uo.h(companion6, m3878constructorimpl3, rowMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion6, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion4, 1.0f, false, 2, null);
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composer2, 0);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                    uo.h(companion6, m3878constructorimpl4, columnMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion6, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme2.getTypography(composer2, i3).getBodyLarge();
                    FontWeight.Companion companion7 = FontWeight.Companion;
                    TextKt.m2607TextNvy7gAk("Domain Blocker", null, 0L, null, 0L, null, companion7.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyLarge, composer2, 1572870, 0, 131006);
                    MutableState mutableState2 = this.i;
                    TextKt.m2607TextNvy7gAk(gs.b(mutableState2) ? "Blocker is active" : "Blocker is disabled", null, materialTheme2.getColorScheme(composer2, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i3).getBodyMedium(), composer2, 0, 0, 131066);
                    boolean z = this.h;
                    if (z) {
                        composer2.startReplaceGroup(-249739257);
                        TextKt.m2607TextNvy7gAk("Toggling will reboot the device.", null, materialTheme2.getColorScheme(composer2, i3).m1748getError0d7_KjU(), null, 0L, null, companion7.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i3).getBodyMedium(), composer2, 1572870, 0, 131002);
                    } else {
                        composer2.startReplaceGroup(-255173092);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                    SharedPreferences sharedPreferences2 = this.e;
                    boolean changedInstance2 = composer2.changedInstance(sharedPreferences2);
                    un unVar2 = this.f;
                    boolean changedInstance3 = changedInstance2 | composer2.changedInstance(unVar2);
                    Context context2 = this.g;
                    boolean changedInstance4 = changedInstance3 | composer2.changedInstance(context2);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changedInstance4 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        zm zmVar = new zm(sharedPreferences2, unVar2, context2, mutableState2, z, this.j);
                        composer2.updateRememberedValue(zmVar);
                        rememberedValue2 = zmVar;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue2, null, null, false, null, null, composer2, 0, 124);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ as(SharedPreferences sharedPreferences, un unVar, Context context, boolean z, MutableState mutableState, SnackbarHostState snackbarHostState) {
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = context;
        this.h = z;
        this.i = mutableState;
        this.j = snackbarHostState;
    }
}
