package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ExpandLessKt;
import androidx.compose.material.icons.filled.ExpandMoreKt;
import androidx.compose.material.icons.filled.TerminalKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class pm implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pm(un unVar, ky kyVar, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.d = 6;
        this.f = mutableState;
        this.e = unVar;
        this.g = sharedPreferences;
        this.h = kyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnapshotMutationPolicy snapshotMutationPolicy;
        w01 LazyLayout$lambda$1;
        Modifier cursor$lambda$0;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.g;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                un unVar = (un) obj7;
                jm jmVar = (jm) obj6;
                MutableState mutableState = (MutableState) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-813395855, intValue, -1, "com.lumi.singularity.ui.activities.ControllerInfoScreen.<anonymous>.<anonymous> (ControllerInfoActivity.kt:142)");
                    }
                    boolean changedInstance = composer.changedInstance(unVar) | composer.changedInstance(jmVar);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ud(unVar, jmVar, mutableState, mutableState2);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    IconButtonKt.IconButton((iy) rememberedValue, null, !((Boolean) mutableState.getValue()).booleanValue(), null, null, null, zk.c, composer, 1572864, 58);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj6;
                Context context = (Context) obj4;
                un unVar2 = (un) obj7;
                MutableState mutableState3 = (MutableState) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1368120429, intValue2, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DomainBlockerActivity.kt:262)");
                    }
                    Object rememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue2 == companion.getEmpty()) {
                        snapshotMutationPolicy = null;
                        rememberedValue2 = uo.a(sharedPreferences.getBoolean("block_category_custom_domains", false), null, 2, null, composer2);
                    } else {
                        snapshotMutationPolicy = null;
                    }
                    MutableState mutableState4 = (MutableState) rememberedValue2;
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(hs.d(context), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    MutableState mutableState5 = (MutableState) rememberedValue3;
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, 2, snapshotMutationPolicy);
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, snapshotMutationPolicy), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), CardDefaults.INSTANCE.m1678cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1781getSurface0d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-115569439, true, new cs(sharedPreferences, unVar2, context, mutableState5, mutableState4, mutableState3, (MutableState) rememberedValue4), composer2, 54), composer2, 196614, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                LazyLayout$lambda$1 = LazyLayoutKt.LazyLayout$lambda$1((LazyLayoutPrefetchState) obj7, (Modifier) obj6, (LazyLayoutMeasurePolicy) obj5, (State) obj4, (SaveableStateHolder) obj, (Composer) obj2, ((Integer) obj3).intValue());
                break;
            case 3:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj7;
                LazyListState lazyListState = (LazyListState) obj6;
                iy iyVar = (iy) obj4;
                MutableState mutableState6 = (MutableState) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= composer3.changed(paddingValues) ? 4 : 2;
                }
                if (!composer3.shouldExecute((intValue3 & 19) != 18, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1102198020, intValue3, -1, "com.lumi.singularity.ui.activities.TerminalScreen.<anonymous> (TerminalActivity.kt:135)");
                    }
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m763paddingVpY3zN4(PaddingKt.padding(companion2, paddingValues), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f)), 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(0.0f));
                    Alignment.Companion companion3 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m647spacedBy0680j_4, companion3.getStart(), composer3, 6);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    iy constructor = companion4.getConstructor();
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
                    uo.h(companion4, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion4, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion3.getCenterVertically(), composer3, 54);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion2);
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
                    uo.h(companion4, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion4, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageVector terminal = TerminalKt.getTerminal(Icons.INSTANCE.getDefault());
                    Modifier m807size3ABfNKs = SizeKt.m807size3ABfNKs(companion2, Dp.m7611constructorimpl(30.0f));
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    IconKt.m2055Iconww6aTOc(terminal, (String) null, m807size3ABfNKs, materialTheme.getColorScheme(composer3, i2).m1765getOnSurfaceVariant0d7_KjU(), composer3, 432, 0);
                    TextKt.m2607TextNvy7gAk("Output", null, materialTheme.getColorScheme(composer3, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i2).getBodyMedium(), composer3, 6, 0, 131066);
                    composer3.endNode();
                    CardKt.Card(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), CardDefaults.INSTANCE.m1678cardColorsro_MJ88(ColorKt.Color(4279309080L), 0L, 0L, 0L, composer3, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(2103819284, true, new xl(8, snapshotStateList, lazyListState), composer3, 54), composer3, 196608, 24);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion3.getCenterVertically(), composer3, 54);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
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
                    uo.h(companion4, m3878constructorimpl3, rowMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion4, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    String str = (String) mutableState6.getValue();
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m7242getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (dq) null);
                    boolean changed = composer3.changed(iyVar);
                    Object rememberedValue5 = composer3.rememberedValue();
                    if (changed || rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new g7(10, iyVar);
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    KeyboardActions keyboardActions = new KeyboardActions((ky) rememberedValue5, null, null, null, null, null, 62, null);
                    RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    TextStyle m7073copyp1EtxEg$default = TextStyle.m7073copyp1EtxEg$default((TextStyle) composer3.consume(TextKt.getLocalTextStyle()), 0L, TextUnitKt.getSp(13), null, null, null, FontFamily.Companion.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777181, null);
                    Object rememberedValue6 = composer3.rememberedValue();
                    if (rememberedValue6 == Composer.Companion.getEmpty()) {
                        rememberedValue6 = new i3(mutableState6, 21);
                        composer3.updateRememberedValue(rememberedValue6);
                    }
                    OutlinedTextFieldKt.OutlinedTextField(str, (ky) rememberedValue6, weight$default, false, false, m7073copyp1EtxEg$default, (my) null, (my) fl.c, (my) null, (my) null, (my) null, (my) null, (my) null, false, (VisualTransformation) null, keyboardOptions, keyboardActions, true, 0, 0, (MutableInteractionSource) null, (Shape) m1056RoundedCornerShape0680j_4, (TextFieldColors) null, composer3, 12582960, 12779520, 0, 6061912);
                    IconButtonKt.FilledIconButton(iyVar, SizeKt.m807size3ABfNKs(companion2, Dp.m7611constructorimpl(52.0f)), !ds0.n0((String) mutableState6.getValue()), null, null, null, fl.d, composer3, 1572912, 56);
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 4:
                cursor$lambda$0 = TextFieldCursorKt.cursor$lambda$0((Brush) obj7, (LegacyTextFieldState) obj6, (TextFieldValue) obj5, (OffsetMapping) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                break;
            case 5:
                un unVar3 = (un) obj7;
                ky kyVar = (ky) obj6;
                MutableState mutableState7 = (MutableState) obj5;
                MutableState mutableState8 = (MutableState) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(226325708, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2482)");
                    }
                    o01.a("Services Patcher Cleanup", "Services patcher folder still present at /data/adb/singularity/services/", null, ComposableLambdaKt.rememberComposableLambda(654051710, true, new q8(unVar3, kyVar, mutableState7, mutableState8), composer4, 54), composer4, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 6:
                MutableState mutableState9 = (MutableState) obj5;
                un unVar4 = (un) obj7;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj6;
                ky kyVar2 = (ky) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer5.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1197034937, intValue5, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1914)");
                    }
                    o01.a("Disable OTA Updates", ((Boolean) mutableState9.getValue()).booleanValue() ? "Updater and Accounts Center disabled · OTA URLs redirected to localhost\nReboot required for package state to take full effect" : "Disables the OTA updater and Accounts Center, and redirects update URLs to localhost so firmware cannot download.", null, ComposableLambdaKt.rememberComposableLambda(-1224467079, true, new q8(unVar4, kyVar2, sharedPreferences2, mutableState9), composer5, 54), composer5, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 7:
                my myVar = (my) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                ny nyVar = (ny) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer6.shouldExecute((intValue6 & 17) != 16, intValue6 & 1)) {
                    composer6.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(273404581, intValue6, -1, "com.lumi.singularity.ui.activities.TweakCard.<anonymous> (TweaksActivity.kt:4261)");
                    }
                    Modifier.Companion companion5 = Modifier.Companion;
                    Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(companion5, Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(14.0f));
                    Alignment.Companion companion6 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion6.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), centerVertically, composer6, 54);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer6, m763paddingVpY3zN4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    iy constructor4 = companion7.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor4);
                    } else {
                        composer6.useNode();
                    }
                    Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer6);
                    uo.h(companion7, m3878constructorimpl4, rowMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion7, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, companion5, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m7611constructorimpl(12.0f), 0.0f, 11, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composer6, 0);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer6, m766paddingqDBjuR0$default);
                    iy constructor5 = companion7.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor5);
                    } else {
                        composer6.useNode();
                    }
                    Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer6);
                    uo.h(companion7, m3878constructorimpl5, columnMeasurePolicy2, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion7, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    Object obj8 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk(str2, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer6, i3).getBodyMedium(), composer6, 1572864, 0, 131006);
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion5, Dp.m7611constructorimpl(2.0f)), composer6, 6);
                    TextKt.m2607TextNvy7gAk(str3, null, materialTheme2.getColorScheme(composer6, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer6, i3).getBodySmall(), composer6, 0, 0, 131066);
                    if (nyVar == null) {
                        composer6.startReplaceGroup(-718421111);
                    } else {
                        composer6.startReplaceGroup(-718421110);
                        SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion5, Dp.m7611constructorimpl(8.0f)), composer6, 6);
                        nyVar.invoke(obj8, composer6, 6);
                    }
                    composer6.endReplaceGroup();
                    composer6.endNode();
                    myVar.invoke(composer6, 0);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                String str4 = (String) obj7;
                List list = (List) obj6;
                MutableState mutableState10 = (MutableState) obj5;
                MutableState mutableState11 = (MutableState) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer7.shouldExecute((intValue7 & 17) != 16, intValue7 & 1)) {
                    composer7.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2143190785, intValue7, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3836)");
                    }
                    Alignment.Companion companion8 = Alignment.Companion;
                    Alignment.Horizontal centerHorizontally = companion8.getCenterHorizontally();
                    Modifier.Companion companion9 = Modifier.Companion;
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), centerHorizontally, composer7, 48);
                    int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                    CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer7, companion9);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                    iy constructor6 = companion10.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor6);
                    } else {
                        composer7.useNode();
                    }
                    Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer7);
                    uo.h(companion10, m3878constructorimpl6, columnMeasurePolicy3, m3878constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion10, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk(str4, null, materialTheme3.getColorScheme(composer7, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer7, i4).getLabelSmall(), composer7, 0, 0, 131066);
                    MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion8.getCenterVertically(), composer7, 48);
                    int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                    CompositionLocalMap currentCompositionLocalMap7 = composer7.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer7, companion9);
                    iy constructor7 = companion10.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor7);
                    } else {
                        composer7.useNode();
                    }
                    Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer7);
                    uo.h(companion10, m3878constructorimpl7, rowMeasurePolicy4, m3878constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion10, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Integer num = (Integer) ((Map) mutableState10.getValue()).get(str4);
                    TextKt.m2607TextNvy7gAk(((num == null && (num = (Integer) yi.x0(list)) == null) ? 0 : num.intValue()) + " MHz", null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer7, i4).getBodySmall(), composer7, 1572864, 0, 131006);
                    IconKt.m2055Iconww6aTOc(q10.b((String) mutableState11.getValue(), str4) ? ExpandLessKt.getExpandLess(Icons.INSTANCE.getDefault()) : ExpandMoreKt.getExpandMore(Icons.INSTANCE.getDefault()), (String) null, PaddingKt.m766paddingqDBjuR0$default(SizeKt.m807size3ABfNKs(companion9, Dp.m7611constructorimpl(16.0f)), Dp.m7611constructorimpl(2.0f), 0.0f, 0.0f, 0.0f, 14, null), 0L, composer7, 432, 8);
                    composer7.endNode();
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ pm(SharedPreferences sharedPreferences, Context context, un unVar, MutableState mutableState) {
        this.d = 1;
        this.g = sharedPreferences;
        this.h = context;
        this.e = unVar;
        this.f = mutableState;
    }

    public /* synthetic */ pm(SnapshotStateList snapshotStateList, LazyListState lazyListState, iy iyVar, MutableState mutableState) {
        this.d = 3;
        this.e = snapshotStateList;
        this.g = lazyListState;
        this.h = iyVar;
        this.f = mutableState;
    }

    public /* synthetic */ pm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.f = obj3;
        this.h = obj4;
    }
}
