package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AppsKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class q8 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ q8(un unVar, ky kyVar, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.d = 2;
        this.g = unVar;
        this.h = sharedPreferences;
        this.f = kyVar;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ProvideBasicTextContextMenu$lambda$4;
        int i = this.d;
        MutableState mutableState = this.e;
        w01 w01Var = w01.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ky kyVar = (ky) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(868466266, intValue, -1, "com.lumi.singularity.ui.activities.LaunchStartAppOnBootDialog.<anonymous> (AppsActivity.kt:1364)");
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
                    IconKt.m2055Iconww6aTOc(AppsKt.getApps(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(36.0f)), materialTheme.getColorScheme(composer, i2).m1757getOnPrimaryContainer0d7_KjU(), composer, 432, 0);
                    composer.endNode();
                    TextStyle titleLarge = materialTheme.getTypography(composer, i2).getTitleLarge();
                    FontWeight semiBold = FontWeight.Companion.getSemiBold();
                    TextAlign.Companion companion4 = TextAlign.Companion;
                    TextKt.m2607TextNvy7gAk("Launch App on Boot", null, 0L, null, 0L, null, semiBold, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, titleLarge, composer, 1572870, 0, 129982);
                    TextKt.m2607TextNvy7gAk("Select an app to open automatically on startup", null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 6, 0, 130042);
                    Modifier m794heightInVpY3zN4 = SizeKt.m794heightInVpY3zN4(companion, Dp.m7611constructorimpl(300.0f), Dp.m7611constructorimpl(500.0f));
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m794heightInVpY3zN4);
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
                    uo.h(companion3, m3878constructorimpl3, columnMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer.startReplaceGroup(-1583071569);
                        Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f));
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m762padding3ABfNKs);
                        iy constructor4 = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor4);
                        } else {
                            composer.useNode();
                        }
                        Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer);
                        uo.h(companion3, m3878constructorimpl4, maybeCachedBoxMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion3, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                        ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer, 0, 63);
                        composer.endNode();
                        composer.endReplaceGroup();
                    } else {
                        String str = (String) mutableState2.getValue();
                        if (str != null && !ds0.n0(str)) {
                            composer.startReplaceGroup(-1830264971);
                            String str2 = (String) mutableState2.getValue();
                            str2.getClass();
                            TextKt.m2607TextNvy7gAk(str2, null, materialTheme.getColorScheme(composer, i2).m1748getError0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 0, 0, 131066);
                            composer.endReplaceGroup();
                        } else if (((List) mutableState3.getValue()).isEmpty()) {
                            composer.startReplaceGroup(-1583050926);
                            TextKt.m2607TextNvy7gAk("No user-installed apps found.", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodyMedium(), composer, 6, 0, 131070);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-1583043413);
                            boolean changed = composer.changed(kyVar);
                            Object rememberedValue = composer.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new t8(mutableState3, kyVar, 0);
                                composer.updateRememberedValue(rememberedValue);
                            }
                            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (ky) rememberedValue, composer, 0, 511);
                            composer.endReplaceGroup();
                        }
                    }
                    composer.endNode();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                ProvideBasicTextContextMenu$lambda$4 = BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4((Modifier) obj5, this.e, (my) obj4, (BasicTextContextMenuProvider) obj3, (Composer) obj, ((Integer) obj2).intValue());
                break;
            case 2:
                un unVar = (un) obj4;
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                ky kyVar2 = (ky) obj5;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1224467079, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1918)");
                    }
                    MutableState mutableState4 = this.e;
                    boolean booleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
                    boolean changedInstance = composer2.changedInstance(unVar) | composer2.changedInstance(sharedPreferences) | composer2.changed(kyVar2);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                        ax0 ax0Var = new ax0(unVar, sharedPreferences, kyVar2, mutableState4, 0);
                        composer2.updateRememberedValue(ax0Var);
                        rememberedValue2 = ax0Var;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue2, null, null, false, null, null, composer2, 0, 124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 3:
                un unVar2 = (un) obj3;
                ky kyVar3 = (ky) obj5;
                MutableState mutableState5 = (MutableState) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(654051710, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2486)");
                    }
                    boolean z = !((Boolean) mutableState.getValue()).booleanValue();
                    RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    Modifier m814widthInVpY3zN4$default = SizeKt.m814widthInVpY3zN4$default(Modifier.Companion, Dp.m7611constructorimpl(80.0f), 0.0f, 2, null);
                    boolean changedInstance2 = composer3.changedInstance(unVar2) | composer3.changed(kyVar3);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new ud(unVar2, kyVar3, mutableState, mutableState5);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    ButtonKt.Button((iy) rememberedValue3, m814widthInVpY3zN4$default, z, m1056RoundedCornerShape0680j_4, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-954853010, true, new s2(mutableState, 13), composer3, 54), composer3, 805306416, 496);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj5;
                un unVar3 = (un) obj4;
                rw0 rw0Var = (rw0) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1631967344, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2387)");
                    }
                    Alignment.Horizontal centerHorizontally2 = Alignment.Companion.getCenterHorizontally();
                    Modifier.Companion companion5 = Modifier.Companion;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer4, 48);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, companion5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                    iy constructor5 = companion6.getConstructor();
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
                    uo.h(companion6, m3878constructorimpl5, columnMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion6, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Notification", null, materialTheme2.getColorScheme(composer4, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer4, i3).getLabelMedium(), composer4, 6, 0, 131066);
                    MutableState mutableState6 = this.e;
                    boolean booleanValue2 = ((Boolean) mutableState6.getValue()).booleanValue();
                    boolean changed2 = composer4.changed(mutableState6) | composer4.changedInstance(sharedPreferences2) | composer4.changedInstance(unVar3) | composer4.changedInstance(rw0Var);
                    Object rememberedValue4 = composer4.rememberedValue();
                    if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        x4 x4Var = new x4(sharedPreferences2, unVar3, mutableState6, rw0Var, 8);
                        composer4.updateRememberedValue(x4Var);
                        rememberedValue4 = x4Var;
                    }
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue4, null, null, false, null, null, composer4, 0, 124);
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

    public /* synthetic */ q8(un unVar, ky kyVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 3;
        this.h = unVar;
        this.f = kyVar;
        this.e = mutableState;
        this.g = mutableState2;
    }

    public /* synthetic */ q8(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, rw0 rw0Var) {
        this.d = 4;
        this.e = mutableState;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = rw0Var;
    }

    public /* synthetic */ q8(Object obj, MutableState mutableState, Object obj2, Object obj3, int i) {
        this.d = i;
        this.f = obj;
        this.e = mutableState;
        this.g = obj2;
        this.h = obj3;
    }
}
