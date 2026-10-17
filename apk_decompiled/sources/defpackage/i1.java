package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements ny {
    public final /* synthetic */ int d;

    public /* synthetic */ i1(int i) {
        this.d = i;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(208764838, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$208764838.<anonymous> (AppsActivity.kt:1030)");
            }
            TextKt.m2607TextNvy7gAk("Uninstall", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-833537925, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-833537925.<anonymous> (AppsActivity.kt:828)");
            }
            TextKt.m2607TextNvy7gAk("Launch", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScope) obj).getClass();
        if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2091989575, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-2091989575.<anonymous> (AppsActivity.kt:873)");
            }
            Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(24.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m762padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
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
            uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer, 0, 63);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1240012093, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1240012093.<anonymous> (AppsActivity.kt:1120)");
            }
            TextKt.m2607TextNvy7gAk("Hard Reboot", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1527203305, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1527203305.<anonymous> (AppsActivity.kt:1104)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(16.0f));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composer, 54);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m762padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
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
            uo.h(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i = MaterialTheme.$stable;
            TextKt.m2607TextNvy7gAk("Reboot after you have installed the magisk modules that you want.\nYou will lose root.", PaddingKt.m766paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m7611constructorimpl(8.0f), 0.0f, 11, null), materialTheme.getColorScheme(composer, i).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i).getBodyMedium(), composer, 6, 0, 131064);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new e1(13);
                composer.updateRememberedValue(rememberedValue);
            }
            ButtonKt.Button((iy) rememberedValue, null, false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), ButtonDefaults.INSTANCE.m1658buttonColorsro_MJ88(materialTheme.getColorScheme(composer, i).m1748getError0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, wk.n, composer, 805306374, 486);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScope) obj).getClass();
        if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362739831, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1362739831.<anonymous> (AppsActivity.kt:1100)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, wk.o, composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScope) obj).getClass();
        if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1705005780, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1705005780.<anonymous> (AppsActivity.kt:1143)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i = MaterialTheme.$stable;
            TextKt.m2607TextNvy7gAk("Changes take effect after a reboot", PaddingKt.m766paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m7611constructorimpl(4.0f), 7, null), materialTheme.getColorScheme(composer, i).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i).getLabelSmall(), composer, 54, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureResult IncreaseHorizontalSemanticsBounds$lambda$1;
        MeasureResult IncreaseVerticalSemanticsBounds$lambda$4;
        Modifier drawCursorHandle$lambda$0;
        MeasureResult badgeBounds$lambda$7;
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                IncreaseHorizontalSemanticsBounds$lambda$1 = AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$1((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return IncreaseHorizontalSemanticsBounds$lambda$1;
            case 1:
                IncreaseVerticalSemanticsBounds$lambda$4 = AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$4((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return IncreaseVerticalSemanticsBounds$lambda$4;
            case 2:
                drawCursorHandle$lambda$0 = AndroidCursorHandle_androidKt.drawCursorHandle$lambda$0((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return drawCursorHandle$lambda$0;
            case 3:
                badgeBounds$lambda$7 = BadgeKt.badgeBounds$lambda$7((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return badgeBounds$lambda$7;
            case 4:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1247468838, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbActivityKt.lambda$-1247468838.<anonymous> (AdbActivity.kt:129)");
                    }
                    Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(6.0f)), Alignment.Companion.getStart(), composer, 6);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m762padding3ABfNKs);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
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
                    uo.h(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2607TextNvy7gAk("Quest 1 doesn't expose Wireless Debugging, so root setup needs a computer.", null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1572870, 0, 262078);
                    TextKt.m2607TextNvy7gAk("1. Connect the headset to a computer with a USB cable.", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
                    TextKt.m2607TextNvy7gAk("2. On that computer, open a terminal with ADB installed and run:", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 5:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1955672246, intValue2, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbRootActivityKt.lambda$1955672246.<anonymous> (AdbRootActivity.kt:273)");
                    }
                    TextKt.m2607TextNvy7gAk("1. Open Android Settings", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            case 6:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1453490360, intValue3, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbRootActivityKt.lambda$1453490360.<anonymous> (AdbRootActivity.kt:281)");
                    }
                    Modifier m762padding3ABfNKs2 = PaddingKt.m762padding3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m762padding3ABfNKs2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor2 = companion2.getConstructor();
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
                    uo.h(companion2, m3878constructorimpl2, columnMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion2, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2607TextNvy7gAk("What to do next:", null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 1572870, 0, 262078);
                    TextKt.m2607TextNvy7gAk("1. Tap 'Open' to launch settings.\n2. About headset → Tap 'Build number' 7-8 times.\n3. System → Developer options → Enable 'Wireless Debugging' (Always allow).", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return w01Var;
            case 7:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(59942827, intValue4, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbRootActivityKt.lambda$59942827.<anonymous> (AdbRootActivity.kt:315)");
                    }
                    TextKt.m2607TextNvy7gAk("Re-pair", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return w01Var;
            case 8:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer5.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1082940297, intValue5, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbRootActivityKt.lambda$-1082940297.<anonymous> (AdbRootActivity.kt:496)");
                    }
                    Modifier m762padding3ABfNKs3 = PaddingKt.m762padding3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer5, 0);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer5, m762padding3ABfNKs3);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor3 = companion3.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor3);
                    } else {
                        composer5.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer5);
                    uo.h(companion3, m3878constructorimpl3, columnMeasurePolicy3, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Bootloader is LOCKED", null, materialTheme.getColorScheme(composer5, i2).m1755getOnErrorContainer0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7073copyp1EtxEg$default(materialTheme.getTypography(composer5, i2).getBodyLarge(), 0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer5, 6, 0, 131066);
                    TextKt.m2607TextNvy7gAk("Patching boot.img writes to the boot partition and requires an unlocked bootloader. On locked devices, use the FUGU flow instead.", null, materialTheme.getColorScheme(composer5, i2).m1755getOnErrorContainer0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i2).getBodySmall(), composer5, 0, 0, 131066);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return w01Var;
            case 9:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer6.shouldExecute((intValue6 & 17) != 16, intValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1508878755, intValue6, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-1508878755.<anonymous> (AppsActivity.kt:652)");
                    }
                    TextKt.m2607TextNvy7gAk("Confirm", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return w01Var;
            case 10:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer7.shouldExecute((intValue7 & 17) != 16, intValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(612936267, intValue7, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$612936267.<anonymous> (AppsActivity.kt:1163)");
                    }
                    TextKt.m2607TextNvy7gAk("Retry", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return w01Var;
            case 11:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer8.shouldExecute((intValue8 & 17) != 16, intValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(183160428, intValue8, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$183160428.<anonymous> (AppsActivity.kt:655)");
                    }
                    TextKt.m2607TextNvy7gAk("Cancel", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateX /* 12 */:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer9.shouldExecute((intValue9 & 17) != 16, intValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1991442038, intValue9, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1991442038.<anonymous> (AppsActivity.kt:1168)");
                    }
                    Modifier m762padding3ABfNKs4 = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer9, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer9.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer9, m762padding3ABfNKs4);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    iy constructor4 = companion4.getConstructor();
                    if (composer9.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer9.startReusableNode();
                    if (composer9.getInserting()) {
                        composer9.createNode(constructor4);
                    } else {
                        composer9.useNode();
                    }
                    Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer9);
                    uo.h(companion4, m3878constructorimpl4, maybeCachedBoxMeasurePolicy, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion4, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("No modules available for this device.", null, materialTheme2.getColorScheme(composer9, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer9, i3).getBodyMedium(), composer9, 6, 0, 131066);
                    composer9.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateY /* 13 */:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer10.shouldExecute((intValue10 & 17) != 16, intValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1660720306, intValue10, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1660720306.<anonymous> (AppsActivity.kt:1220)");
                    }
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Newly installed modules still need scoping to a target app. Open Vector to finish setup", PaddingKt.m766paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m7611constructorimpl(4.0f), 7, null), materialTheme3.getColorScheme(composer10, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer10, i4).getLabelSmall(), composer10, 54, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateZ /* 14 */:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer11.shouldExecute((intValue11 & 17) != 16, intValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(942620886, intValue11, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$942620886.<anonymous> (AppsActivity.kt:1229)");
                    }
                    Modifier m762padding3ABfNKs5 = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(24.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer11.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer11, m762padding3ABfNKs5);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    iy constructor5 = companion5.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor5);
                    } else {
                        composer11.useNode();
                    }
                    Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer11);
                    uo.h(companion5, m3878constructorimpl5, maybeCachedBoxMeasurePolicy2, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion5, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer11, 0, 63);
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return w01Var;
            case 15:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer12.shouldExecute((intValue12 & 17) != 16, intValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1075096563, intValue12, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1075096563.<anonymous> (AppsActivity.kt:1240)");
                    }
                    TextKt.m2607TextNvy7gAk("Retry", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return w01Var;
            case 16:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer13.shouldExecute((intValue13 & 17) != 16, intValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1384910558, intValue13, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1384910558.<anonymous> (AppsActivity.kt:1245)");
                    }
                    Modifier m762padding3ABfNKs6 = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0));
                    CompositionLocalMap currentCompositionLocalMap6 = composer13.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer13, m762padding3ABfNKs6);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                    iy constructor6 = companion6.getConstructor();
                    if (composer13.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer13.startReusableNode();
                    if (composer13.getInserting()) {
                        composer13.createNode(constructor6);
                    } else {
                        composer13.useNode();
                    }
                    Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer13);
                    uo.h(companion6, m3878constructorimpl6, maybeCachedBoxMeasurePolicy3, m3878constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion6, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("No modules available for this device.", null, materialTheme4.getColorScheme(composer13, i5).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer13, i5).getBodyMedium(), composer13, 6, 0, 131066);
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return w01Var;
            case 17:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer14.shouldExecute((intValue14 & 17) != 16, intValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-405018848, intValue14, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-405018848.<anonymous> (AppsActivity.kt:1445)");
                    }
                    TextKt.m2607TextNvy7gAk("Cancel", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer14, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return w01Var;
            case 18:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer15.shouldExecute((intValue15 & 17) != 16, intValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1300919603, intValue15, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1300919603.<anonymous> (AppsActivity.kt:975)");
                    }
                    Modifier m762padding3ABfNKs7 = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0));
                    CompositionLocalMap currentCompositionLocalMap7 = composer15.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer15, m762padding3ABfNKs7);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    iy constructor7 = companion7.getConstructor();
                    if (composer15.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer15.startReusableNode();
                    if (composer15.getInserting()) {
                        composer15.createNode(constructor7);
                    } else {
                        composer15.useNode();
                    }
                    Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer15);
                    uo.h(companion7, m3878constructorimpl7, maybeCachedBoxMeasurePolicy4, m3878constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion7, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("No default apps found to uninstall.", null, materialTheme5.getColorScheme(composer15, i6).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer15, i6).getBodyMedium(), composer15, 6, 0, 131066);
                    composer15.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return w01Var;
            case 19:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer16.shouldExecute((intValue16 & 17) != 16, intValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(818367099, intValue16, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$818367099.<anonymous> (AppsActivity.kt:791)");
                    }
                    TextKt.m2607TextNvy7gAk("Launch", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer16, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return w01Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer17.shouldExecute((intValue17 & 17) != 16, intValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836793852, intValue17, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$836793852.<anonymous> (AppsActivity.kt:800)");
                    }
                    TextKt.m2607TextNvy7gAk("Launch", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer17, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return w01Var;
            case 21:
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer18.shouldExecute((intValue18 & 17) != 16, intValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-775855319, intValue18, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-775855319.<anonymous> (AppsActivity.kt:819)");
                    }
                    TextKt.m2607TextNvy7gAk("Launch", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer18, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return w01Var;
            case 22:
                return b(obj, obj2, obj3);
            case 23:
                return c(obj, obj2, obj3);
            case 24:
                return a(obj, obj2, obj3);
            case RectListKt.BitOffsetForParentId /* 25 */:
                return d(obj, obj2, obj3);
            case 26:
                return e(obj, obj2, obj3);
            case 27:
                return f(obj, obj2, obj3);
            case 28:
                return g(obj, obj2, obj3);
            default:
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer19.shouldExecute((intValue19 & 17) != 16, intValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2142137746, intValue19, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-2142137746.<anonymous> (AppsActivity.kt:1152)");
                    }
                    Modifier m762padding3ABfNKs8 = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(24.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    int hashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer19, 0));
                    CompositionLocalMap currentCompositionLocalMap8 = composer19.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer19, m762padding3ABfNKs8);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                    iy constructor8 = companion8.getConstructor();
                    if (composer19.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer19.startReusableNode();
                    if (composer19.getInserting()) {
                        composer19.createNode(constructor8);
                    } else {
                        composer19.useNode();
                    }
                    Composer m3878constructorimpl8 = Updater.m3878constructorimpl(composer19);
                    uo.h(companion8, m3878constructorimpl8, maybeCachedBoxMeasurePolicy5, m3878constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, k4.c(companion8, m3878constructorimpl8, Integer.valueOf(hashCode8), m3878constructorimpl8));
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer19, 0, 63);
                    composer19.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return w01Var;
        }
    }
}
