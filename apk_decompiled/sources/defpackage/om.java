package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class om implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ om(iy iyVar, un unVar, jm jmVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 0;
        this.f = iyVar;
        this.g = unVar;
        this.h = jmVar;
        this.e = mutableState;
        this.i = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ProvideBothDefaultProviders$lambda$4;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                iy iyVar = (iy) obj6;
                un unVar = (un) obj5;
                jm jmVar = (jm) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-344171264, intValue, -1, "com.lumi.singularity.ui.activities.ControllerInfoScreen.<anonymous> (ControllerInfoActivity.kt:125)");
                    }
                    ComposableLambda composableLambda = zk.a;
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1535809530, true, new l2(4, iyVar), composer, 54);
                    ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-813395855, true, new pm(unVar, jmVar, this.e, mutableState, 0), composer, 54);
                    TopAppBarDefaults topAppBarDefaults = TopAppBarDefaults.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    AppBarKt.m1624TopAppBarGHTll3U(composableLambda, null, rememberComposableLambda, rememberComposableLambda2, 0.0f, null, topAppBarDefaults.m2822topAppBarColors5tl4gsc(materialTheme.getColorScheme(composer, i2).m1781getSurface0d7_KjU(), 0L, 0L, materialTheme.getColorScheme(composer, i2).m1764getOnSurface0d7_KjU(), 0L, 0L, composer, TopAppBarDefaults.$stable << 18, 54), null, composer, 3462, 178);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                ProvideBothDefaultProviders$lambda$4 = PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$4((Modifier) obj5, this.e, (my) obj4, (BasicTextContextMenuProvider) obj3, (iy) obj6, (Composer) obj, ((Integer) obj2).intValue());
                break;
            case 2:
                Object obj7 = (SharedPreferences) obj6;
                Object obj8 = (un) obj5;
                ky kyVar = (ky) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1226264846, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2841)");
                    }
                    MutableState mutableState3 = this.e;
                    boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean changed = composer2.changed(mutableState3) | composer2.changedInstance(obj7) | composer2.changedInstance(obj8) | composer2.changed(kyVar);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new y4(obj7, obj8, (Object) mutableState3, (Object) mutableState2, kyVar, 7);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, !((Boolean) mutableState2.getValue()).booleanValue(), null, null, composer2, 0, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) obj6;
                ky kyVar2 = (ky) obj5;
                Object obj9 = (rw0) obj4;
                MutableState mutableState4 = (MutableState) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-11648566, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1691)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier width = IntrinsicKt.width(companion, IntrinsicSize.Max);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, width);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
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
                    uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                    iy constructor2 = companion3.getConstructor();
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
                    uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Enable on Boot", null, materialTheme2.getColorScheme(composer3, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i3).getLabelMedium(), composer3, 6, 0, 131066);
                    MutableState mutableState5 = this.e;
                    boolean booleanValue2 = ((Boolean) mutableState5.getValue()).booleanValue();
                    boolean changed2 = composer3.changed(mutableState5) | composer3.changedInstance(sharedPreferences) | composer3.changed(kyVar2);
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new dy0(sharedPreferences, kyVar2, mutableState5, 8);
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue2, null, null, false, null, null, composer3, 0, 124);
                    composer3.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer3, 6);
                    Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer3, 48);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                    iy constructor3 = companion3.getConstructor();
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
                    uo.h(companion3, m3878constructorimpl3, columnMeasurePolicy3, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    TextKt.m2607TextNvy7gAk("Blocker Status", null, materialTheme2.getColorScheme(composer3, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i3).getLabelMedium(), composer3, 6, 0, 131066);
                    boolean booleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
                    boolean changedInstance = composer3.changedInstance(sharedPreferences) | composer3.changedInstance(obj9);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changedInstance || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new uy0(sharedPreferences, obj9, mutableState4, 1);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    SwitchKt.Switch(booleanValue3, (ky) rememberedValue3, null, null, false, null, null, composer3, 0, 124);
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

    public /* synthetic */ om(MutableState mutableState, SharedPreferences sharedPreferences, Object obj, Object obj2, MutableState mutableState2, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = sharedPreferences;
        this.g = obj;
        this.h = obj2;
        this.i = mutableState2;
    }

    public /* synthetic */ om(Modifier modifier, MutableState mutableState, my myVar, BasicTextContextMenuProvider basicTextContextMenuProvider, iy iyVar) {
        this.d = 1;
        this.g = modifier;
        this.e = mutableState;
        this.h = myVar;
        this.i = basicTextContextMenuProvider;
        this.f = iyVar;
    }
}
