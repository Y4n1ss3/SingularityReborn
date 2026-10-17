package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextFieldColors;
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
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class s2 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ s2(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.e;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1085156964, intValue, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous>.<anonymous>.<anonymous> (AdbActivity.kt:197)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Checking..." : "Check", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1155705799, intValue2, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:377)");
                    }
                    TextKt.m2607TextNvy7gAk(j4.b(mutableState) ? "Pairing..." : "Pair Device", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2079902800, intValue3, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:389)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), Alignment.Companion.getStart(), composer3, 6);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m762padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
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
                    uo.h(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2607TextNvy7gAk("3. Set Connection Port", null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 1572870, 0, 262078);
                    TextKt.m2607TextNvy7gAk("In Developer Options → Wireless ADB, look at the 'IP address & Port' field.", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 6, 0, 262142);
                    String str = (String) mutableState.getValue();
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m7298getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (dq) null);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Object rememberedValue = composer3.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new i3(mutableState, 0);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    OutlinedTextFieldKt.OutlinedTextField(str, (ky) rememberedValue, fillMaxWidth$default, false, false, (TextStyle) null, (my) vk.g, (my) null, (my) null, (my) null, (my) null, (my) null, (my) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer3, 1573296, 12779520, 0, 8224696);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1179420753, intValue4, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:485)");
                    }
                    TextKt.m2607TextNvy7gAk(j4.b(mutableState) ? "Connecting..." : "4. Complete FUGU Setup", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer5.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(400426074, intValue5, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:592)");
                    }
                    TextKt.m2607TextNvy7gAk(j4.b(mutableState) ? "Processing..." : "4. Escalate Privileges", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer6.shouldExecute((intValue6 & 17) != 16, intValue6 & 1)) {
                    composer6.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1424128955, intValue6, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2377)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Start", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer7.shouldExecute((intValue7 & 17) != 16, intValue7 & 1)) {
                    composer7.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(202210154, intValue7, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1680)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Select", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer8.shouldExecute((intValue8 & 17) != 16, intValue8 & 1)) {
                    composer8.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1805582047, intValue8, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2575)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Start", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer9.shouldExecute((intValue9 & 17) != 16, intValue9 & 1)) {
                    composer9.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-369019189, intValue9, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1621)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Start", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer9, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 9:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer10.shouldExecute((intValue10 & 17) != 16, intValue10 & 1)) {
                    composer10.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-163267294, intValue10, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1563)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Start", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer10, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer11.shouldExecute((intValue11 & 17) != 16, intValue11 & 1)) {
                    composer11.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(648644184, intValue11, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:4196)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Start", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer11, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer12.shouldExecute((intValue12 & 17) != 16, intValue12 & 1)) {
                    composer12.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-666431633, intValue12, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:4093)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Start", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case Matrix.TranslateX /* 12 */:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer13.shouldExecute((intValue13 & 17) != 16, intValue13 & 1)) {
                    composer13.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-267718866, intValue13, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3809)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Start", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer13, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case Matrix.TranslateY /* 13 */:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer14.shouldExecute((intValue14 & 17) != 16, intValue14 & 1)) {
                    composer14.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-954853010, intValue14, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2504)");
                    }
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer14.startReplaceGroup(-457535893);
                        ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(SizeKt.m807size3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer14, MaterialTheme.$stable).m1756getOnPrimary0d7_KjU(), Dp.m7611constructorimpl(2.0f), 0L, 0, 0.0f, composer14, 390, 56);
                        composer14.endReplaceGroup();
                    } else {
                        composer14.startReplaceGroup(-457118044);
                        TextKt.m2607TextNvy7gAk("Clean Up", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer14, 6, 0, 262142);
                        composer14.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer15.shouldExecute((intValue15 & 17) != 16, intValue15 & 1)) {
                    composer15.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1733295986, intValue15, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3934)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "Stop" : "Start", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer15, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }
}
