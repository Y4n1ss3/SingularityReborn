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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.ColorKt;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class n3 implements ny {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ n3(c3 c3Var, un unVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, String str) {
        this.e = mutableState;
        this.h = unVar;
        this.k = c3Var;
        this.f = mutableState2;
        this.g = mutableState3;
        this.i = mutableState4;
        this.j = mutableState5;
        this.l = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        boolean z;
        int i;
        int i2;
        Iterator y;
        PaddingValues paddingValues;
        ButtonColors outlinedButtonColors;
        int i3 = this.d;
        int i4 = 2;
        w01 w01Var = w01.a;
        Object obj4 = this.k;
        Object obj5 = this.h;
        Object obj6 = this.j;
        Object obj7 = this.l;
        Object obj8 = this.i;
        boolean z2 = true;
        switch (i3) {
            case 0:
                un unVar = (un) obj5;
                c3 c3Var = (c3) obj4;
                MutableState mutableState = (MutableState) obj8;
                MutableState mutableState2 = (MutableState) obj6;
                String str = (String) obj7;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-364304209, intValue, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:297)");
                    }
                    MutableState mutableState3 = this.e;
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        composer.startReplaceGroup(395745942);
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
                        Alignment.Companion companion2 = Alignment.Companion;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer, 54);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m763paddingVpY3zN4);
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
                        uo.h(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
                        uo.h(companion3, m3878constructorimpl2, rowMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                        IconKt.m2055Iconww6aTOc(CheckCircleKt.getCheckCircle(Icons.Filled.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1772getPrimary0d7_KjU(), composer, 48, 4);
                        SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer, 6);
                        TextKt.m2607TextNvy7gAk("2. Paired via Wireless ADB", null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1572870, 0, 262078);
                        composer.endNode();
                        Object rememberedValue = composer.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new j3(mutableState3, 0);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        ButtonKt.TextButton((iy) rememberedValue, null, false, null, null, null, null, null, null, vk.d, composer, 805306374, 510);
                        composer.endNode();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(396983927);
                        Modifier.Companion companion4 = Modifier.Companion;
                        Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(companion4, Dp.m7611constructorimpl(16.0f));
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), Alignment.Companion.getStart(), composer, 6);
                        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m762padding3ABfNKs);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                        iy constructor3 = companion5.getConstructor();
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
                        uo.h(companion5, m3878constructorimpl3, columnMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion5, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m2607TextNvy7gAk("2. Pair via Wireless ADB", null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1572870, 0, 262078);
                        TextKt.m2607TextNvy7gAk("Developer Options → Tap on Wireless ADB\n(not the toggle) → 'Pair device with pairing code'. Enter the port and 6-digit code shown on screen.", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
                        MutableState mutableState4 = this.f;
                        String str2 = (String) mutableState4.getValue();
                        KeyboardType.Companion companion6 = KeyboardType.Companion;
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, companion6.m7299getNumberPasswordPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (dq) null);
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        Object rememberedValue2 = composer.rememberedValue();
                        Composer.Companion companion7 = Composer.Companion;
                        if (rememberedValue2 == companion7.getEmpty()) {
                            rememberedValue2 = new i3(mutableState4, 1);
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        OutlinedTextFieldKt.OutlinedTextField(str2, (ky) rememberedValue2, fillMaxWidth$default, false, false, (TextStyle) null, (my) vk.e, (my) null, (my) null, (my) null, (my) null, (my) null, (my) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1573296, 12779520, 0, 8224696);
                        MutableState mutableState5 = this.g;
                        String str3 = (String) mutableState5.getValue();
                        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, companion6.m7298getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (dq) null);
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        Object rememberedValue3 = composer.rememberedValue();
                        if (rememberedValue3 == companion7.getEmpty()) {
                            rememberedValue3 = new i3(mutableState5, 2);
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        OutlinedTextFieldKt.OutlinedTextField(str3, (ky) rememberedValue3, fillMaxWidth$default2, false, false, (TextStyle) null, (my) vk.f, (my) null, (my) null, (my) null, (my) null, (my) null, (my) null, false, (VisualTransformation) null, keyboardOptions2, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1573296, 12779520, 0, 8224696);
                        boolean z3 = !j4.b(mutableState);
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                        boolean changedInstance = composer.changedInstance(unVar) | composer.changedInstance(c3Var);
                        Object rememberedValue4 = composer.rememberedValue();
                        if (changedInstance || rememberedValue4 == companion7.getEmpty()) {
                            l3 l3Var = new l3(c3Var, unVar, mutableState, mutableState5, mutableState4, mutableState2, mutableState3, str);
                            composer.updateRememberedValue(l3Var);
                            rememberedValue4 = l3Var;
                        }
                        ButtonKt.Button((iy) rememberedValue4, fillMaxWidth$default3, z3, m1056RoundedCornerShape0680j_4, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1155705799, true, new s2(mutableState, 1), composer, 54), composer, 805306416, 496);
                        composer.endNode();
                        composer.endReplaceGroup();
                    }
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
                SharedPreferences sharedPreferences = (SharedPreferences) obj6;
                ky kyVar = (ky) obj4;
                un unVar2 = (un) obj5;
                Context context = (Context) obj7;
                MutableState mutableState6 = (MutableState) obj8;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1451910689, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2123)");
                    }
                    Modifier.Companion companion8 = Modifier.Companion;
                    Modifier m763paddingVpY3zN42 = PaddingKt.m763paddingVpY3zN4(companion8, Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(14.0f));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement2.getTop();
                    Alignment.Companion companion9 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, companion9.getStart(), composer2, 0);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m763paddingVpY3zN42);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                    iy constructor4 = companion10.getConstructor();
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
                    uo.h(companion10, m3878constructorimpl4, columnMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion10, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion9.getCenterVertically(), composer2, 48);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default4);
                    iy constructor5 = companion10.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion10, m3878constructorimpl5, rowMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion10, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion8, 1.0f, false, 2, null);
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion9.getStart(), composer2, 0);
                    int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                    iy constructor6 = companion10.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion10, m3878constructorimpl6, columnMeasurePolicy3, m3878constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion10, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("FPS Selector", null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i5).getBodyMedium(), composer2, 1572870, 0, 131006);
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion8, Dp.m7611constructorimpl(2.0f)), composer2, 6);
                    TextKt.m2607TextNvy7gAk("Set the display refresh rate", null, materialTheme.getColorScheme(composer2, i5).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i5).getBodySmall(), composer2, 6, 0, 131066);
                    composer2.endNode();
                    MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.m647spacedBy0680j_4(Dp.m7611constructorimpl(16.0f)), companion9.getTop(), composer2, 6);
                    int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer2, companion8);
                    iy constructor7 = companion10.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion10, m3878constructorimpl7, rowMeasurePolicy4, m3878constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion10, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion9.getCenterHorizontally(), composer2, 48);
                    int hashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, companion8);
                    iy constructor8 = companion10.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor8);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl8 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion10, m3878constructorimpl8, columnMeasurePolicy4, m3878constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, k4.c(companion10, m3878constructorimpl8, Integer.valueOf(hashCode8), m3878constructorimpl8));
                    TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme.getColorScheme(composer2, i5).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i5).getLabelMedium(), composer2, 6, 0, 131066);
                    MutableState mutableState7 = this.e;
                    boolean booleanValue = ((Boolean) mutableState7.getValue()).booleanValue();
                    boolean changed = composer2.changed(mutableState7) | composer2.changedInstance(sharedPreferences);
                    MutableState mutableState8 = this.f;
                    boolean changed2 = changed | composer2.changed(mutableState8) | composer2.changed(kyVar);
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (changed2 || rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new x4(sharedPreferences, kyVar, mutableState7, mutableState8);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue5, null, null, true, null, null, composer2, 24576, 108);
                    composer2.endNode();
                    MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion9.getCenterHorizontally(), composer2, 48);
                    int hashCode9 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer2, companion8);
                    iy constructor9 = companion10.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor9);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl9 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion10, m3878constructorimpl9, columnMeasurePolicy5, m3878constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3886setimpl(m3878constructorimpl9, materializeModifier9, k4.c(companion10, m3878constructorimpl9, Integer.valueOf(hashCode9), m3878constructorimpl9));
                    TextKt.m2607TextNvy7gAk("Display Scaling", null, materialTheme.getColorScheme(composer2, i5).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i5).getLabelMedium(), composer2, 6, 0, 131066);
                    MutableState mutableState9 = this.g;
                    boolean booleanValue2 = ((Boolean) mutableState9.getValue()).booleanValue();
                    boolean changed3 = composer2.changed(mutableState9) | composer2.changedInstance(sharedPreferences) | composer2.changedInstance(unVar2) | composer2.changedInstance(context) | composer2.changed(kyVar);
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (changed3 || rememberedValue6 == Composer.Companion.getEmpty()) {
                        rememberedValue6 = new vw0(1, unVar2, kyVar, context, sharedPreferences, mutableState9);
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    SwitchKt.Switch(booleanValue2, (ky) rememberedValue6, null, null, true, null, null, composer2, 24576, 108);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion8, Dp.m7611constructorimpl(10.0f)), composer2, 6);
                    if (((List) mutableState6.getValue()).isEmpty()) {
                        composer2.startReplaceGroup(1970590115);
                        ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(SizeKt.m807size3ABfNKs(companion8, Dp.m7611constructorimpl(18.0f)), 0L, Dp.m7611constructorimpl(2.0f), 0L, 0, 0.0f, composer2, 390, 58);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1971056572);
                        List list = (List) mutableState6.getValue();
                        list.getClass();
                        d41.f(5, 5);
                        if (list instanceof RandomAccess) {
                            int size = list.size();
                            arrayList = new ArrayList((size / 5) + (size % 5 == 0 ? 0 : 1));
                            for (int i6 = 0; i6 >= 0 && i6 < size; i6 += 5) {
                                int i7 = size - i6;
                                if (5 <= i7) {
                                    i7 = 5;
                                }
                                ArrayList arrayList2 = new ArrayList(i7);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    arrayList2.add(list.get(i8 + i6));
                                }
                                arrayList.add(arrayList2);
                            }
                            z = 5;
                            i = 0;
                            i2 = 1;
                        } else {
                            arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            it.getClass();
                            if (it.hasNext()) {
                                z = 5;
                                i = 0;
                                i2 = 1;
                                y = p10.y(new xq0(5, 5, it, false, true, null));
                            } else {
                                y = tt.d;
                                z = 5;
                                i = 0;
                                i2 = 1;
                            }
                            while (y.hasNext()) {
                                arrayList.add((List) y.next());
                            }
                        }
                        float f = 6.0f;
                        Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(6.0f));
                        Modifier.Companion companion11 = Modifier.Companion;
                        MeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(m647spacedBy0680j_4, Alignment.Companion.getStart(), composer2, 6);
                        int hashCode10 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i));
                        CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer2, companion11);
                        ComposeUiNode.Companion companion12 = ComposeUiNode.Companion;
                        iy constructor10 = companion12.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor10);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3878constructorimpl10 = Updater.m3878constructorimpl(composer2);
                        uo.h(companion12, m3878constructorimpl10, columnMeasurePolicy6, m3878constructorimpl10, currentCompositionLocalMap10);
                        Updater.m3886setimpl(m3878constructorimpl10, materializeModifier10, k4.c(companion12, m3878constructorimpl10, Integer.valueOf(hashCode10), m3878constructorimpl10));
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(898637241);
                        int size2 = arrayList.size();
                        int i9 = i;
                        while (i9 < size2) {
                            Object obj9 = arrayList.get(i9);
                            i9++;
                            List list2 = (List) obj9;
                            Arrangement.HorizontalOrVertical m647spacedBy0680j_42 = Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(f));
                            float f2 = f;
                            Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, i2, null);
                            MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(m647spacedBy0680j_42, Alignment.Companion.getTop(), composer2, 6);
                            int hashCode11 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i));
                            CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default5);
                            ComposeUiNode.Companion companion13 = ComposeUiNode.Companion;
                            iy constructor11 = companion13.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor11);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3878constructorimpl11 = Updater.m3878constructorimpl(composer2);
                            uo.h(companion13, m3878constructorimpl11, rowMeasurePolicy5, m3878constructorimpl11, currentCompositionLocalMap11);
                            Updater.m3886setimpl(m3878constructorimpl11, materializeModifier11, k4.c(companion13, m3878constructorimpl11, Integer.valueOf(hashCode11), m3878constructorimpl11));
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            composer2.startReplaceGroup(1217155864);
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                final int intValue3 = ((Number) it2.next()).intValue();
                                final boolean z4 = ((Number) mutableState8.getValue()).intValue() == intValue3;
                                Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null);
                                RowScopeInstance rowScopeInstance3 = rowScopeInstance2;
                                int i10 = size2;
                                PaddingValues m756PaddingValuesYgX7TsA = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(4.0f), Dp.m7611constructorimpl(8.0f));
                                if (z4) {
                                    composer2.startReplaceGroup(-1988095993);
                                    paddingValues = m756PaddingValuesYgX7TsA;
                                    outlinedButtonColors = ButtonDefaults.INSTANCE.m1668outlinedButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1773getPrimaryContainer0d7_KjU(), 0L, 0L, 0L, composer2, ButtonDefaults.$stable << 12, 14);
                                    composer2.endReplaceGroup();
                                } else {
                                    paddingValues = m756PaddingValuesYgX7TsA;
                                    composer2.startReplaceGroup(-1988088634);
                                    outlinedButtonColors = ButtonDefaults.INSTANCE.outlinedButtonColors(composer2, ButtonDefaults.$stable);
                                    composer2.endReplaceGroup();
                                }
                                boolean changed4 = composer2.changed(mutableState8) | composer2.changed(intValue3) | composer2.changedInstance(sharedPreferences) | composer2.changedInstance(unVar2) | composer2.changedInstance(context) | composer2.changed(kyVar);
                                ButtonColors buttonColors = outlinedButtonColors;
                                Object rememberedValue7 = composer2.rememberedValue();
                                if (changed4 || rememberedValue7 == Composer.Companion.getEmpty()) {
                                    rememberedValue7 = new bp(intValue3, unVar2, kyVar, context, sharedPreferences, mutableState8);
                                    composer2.updateRememberedValue(rememberedValue7);
                                }
                                ButtonKt.OutlinedButton((iy) rememberedValue7, weight$default2, false, null, buttonColors, null, null, paddingValues, null, ComposableLambdaKt.rememberComposableLambda(1150517378, true, new ny() { // from class: zw0
                                    @Override // defpackage.ny
                                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                        Composer composer3 = (Composer) obj11;
                                        int intValue4 = ((Integer) obj12).intValue();
                                        ((RowScope) obj10).getClass();
                                        if (composer3.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1150517378, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2231)");
                                            }
                                            TextKt.m2607TextNvy7gAk(intValue3 + " Hz", null, 0L, null, 0L, null, z4 ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal(), null, 0L, null, null, 0L, 0, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 24576, 114622);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer3.skipToGroupEnd();
                                        }
                                        return w01.a;
                                    }
                                }, composer2, 54), composer2, 817889280, 364);
                                size2 = i10;
                                rowScopeInstance2 = rowScopeInstance3;
                            }
                            int i11 = size2;
                            RowScopeInstance rowScopeInstance4 = rowScopeInstance2;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1217270960);
                            int size3 = 5 - list2.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance4, Modifier.Companion, 1.0f, false, 2, null), composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            f = f2;
                            size2 = i11;
                            i = 0;
                            i2 = 1;
                        }
                        float f3 = f;
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (((Number) mutableState8.getValue()).intValue() > 90) {
                            composer2.startReplaceGroup(1975618098);
                            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(f3)), composer2, 6);
                            TextKt.m2607TextNvy7gAk("Higher framerates can drain the battery quicker", null, ColorKt.Color(4294956544L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 390, 0, 131066);
                        } else {
                            composer2.startReplaceGroup(1836823255);
                        }
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                    }
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
            default:
                List list3 = (List) obj8;
                final String str4 = (String) obj7;
                final SharedPreferences sharedPreferences2 = (SharedPreferences) obj6;
                final rw0 rw0Var = (rw0) obj5;
                final ky kyVar2 = (ky) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer3.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-987011687, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3860)");
                    }
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        final int intValue5 = ((Number) it3.next()).intValue();
                        PaddingValues m756PaddingValuesYgX7TsA2 = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(0.0f));
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1221736831, z2, new k40(intValue5, i4), composer3, 54);
                        boolean changed5 = composer3.changed(str4) | composer3.changed(intValue5) | composer3.changedInstance(sharedPreferences2) | composer3.changedInstance(rw0Var) | composer3.changed(kyVar2);
                        Object rememberedValue8 = composer3.rememberedValue();
                        if (changed5 || rememberedValue8 == Composer.Companion.getEmpty()) {
                            final MutableState mutableState10 = this.e;
                            final MutableState mutableState11 = this.f;
                            final MutableState mutableState12 = this.g;
                            rememberedValue8 = new iy() { // from class: xw0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.iy
                                public final Object invoke() {
                                    Map map;
                                    MutableState mutableState13 = mutableState10;
                                    Map map2 = (Map) mutableState13.getValue();
                                    int i13 = intValue5;
                                    Integer valueOf = Integer.valueOf(i13);
                                    map2.getClass();
                                    boolean isEmpty = map2.isEmpty();
                                    String str5 = str4;
                                    if (isEmpty) {
                                        map = Collections.singletonMap(str5, valueOf);
                                        map.getClass();
                                    } else {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                                        linkedHashMap.put(str5, valueOf);
                                        map = linkedHashMap;
                                    }
                                    mutableState13.setValue(map);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    String lowerCase = str5.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    edit.putString("cpu_max_freq_selection_".concat(lowerCase), String.valueOf(i13 * 1000)).apply();
                                    mutableState11.setValue(null);
                                    boolean booleanValue3 = ((Boolean) mutableState12.getValue()).booleanValue();
                                    ky kyVar3 = kyVar2;
                                    if (booleanValue3) {
                                        rw0.a(rw0Var, "com.lumi.singularity.START_MAX_FREQ");
                                        kyVar3.invoke("CPU Max Freq updated: " + str5 + " = " + i13 + " MHz");
                                    } else {
                                        kyVar3.invoke("CPU Max Freq selection saved");
                                    }
                                    return w01.a;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue8);
                        }
                        AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (iy) rememberedValue8, null, null, null, false, null, m756PaddingValuesYgX7TsA2, null, composer3, 12582918, 380);
                        z2 = true;
                        i4 = 2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer3.skipToGroupEnd();
                    break;
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ n3(MutableState mutableState, SharedPreferences sharedPreferences, MutableState mutableState2, ky kyVar, MutableState mutableState3, un unVar, Context context, MutableState mutableState4) {
        this.e = mutableState;
        this.j = sharedPreferences;
        this.f = mutableState2;
        this.k = kyVar;
        this.g = mutableState3;
        this.h = unVar;
        this.l = context;
        this.i = mutableState4;
    }

    public /* synthetic */ n3(List list, String str, SharedPreferences sharedPreferences, rw0 rw0Var, ky kyVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.i = list;
        this.l = str;
        this.j = sharedPreferences;
        this.h = rw0Var;
        this.k = kyVar;
        this.e = mutableState;
        this.f = mutableState2;
        this.g = mutableState3;
    }
}
