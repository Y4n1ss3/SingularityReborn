package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g6 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g6(boolean z, ky kyVar) {
        this.d = 2;
        this.e = z;
        this.f = kyVar;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier drawSelectionHandle$lambda$0;
        long m1765getOnSurfaceVariant0d7_KjU;
        MeasureResult interactionZIndex$lambda$19;
        int i = this.d;
        w01 w01Var = w01.a;
        boolean z = this.e;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                drawSelectionHandle$lambda$0 = AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0((iy) obj4, z, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return drawSelectionHandle$lambda$0;
            case 1:
                String str = (String) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1027088700, intValue, -1, "com.lumi.singularity.ui.activities.UpdateOptionsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:2535)");
                    }
                    if (str.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf = String.valueOf(str.charAt(0));
                        valueOf.getClass();
                        String upperCase = valueOf.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        sb.append((Object) upperCase);
                        sb.append(str.substring(1));
                        str = sb.toString();
                    }
                    String str2 = str;
                    if (z) {
                        composer.startReplaceGroup(-810230898);
                        m1765getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1757getOnPrimaryContainer0d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-810228276);
                        m1765getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1765getOnSurfaceVariant0d7_KjU();
                        composer.endReplaceGroup();
                    }
                    TextKt.m2607TextNvy7gAk(str2, null, m1765getOnSurfaceVariant0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262138);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 2:
                ky kyVar = (ky) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1976005994, intValue2, -1, "com.lumi.singularity.ui.activities.UpdateOptionsDialog.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:2549)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m763paddingVpY3zN4);
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
                    Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                    uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Check on startup", null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i2).getBodyMedium(), composer2, 1572870, 0, 131006);
                    TextKt.m2607TextNvy7gAk("Automatically check for updates", null, materialTheme.getColorScheme(composer2, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i2).getBodySmall(), composer2, 6, 0, 131066);
                    composer2.endNode();
                    SwitchKt.Switch(this.e, kyVar, null, null, false, null, null, composer2, 0, 124);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            case 3:
                ie ieVar = (ie) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1684531572, intValue3, -1, "com.lumi.singularity.ui.activities.PayloadSelectorDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:2384)");
                    }
                    Modifier m763paddingVpY3zN42 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(6.0f));
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer3, 48);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m763paddingVpY3zN42);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
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
                    uo.h(companion4, m3878constructorimpl3, columnMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion4, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    String str3 = ieVar.e;
                    TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium();
                    FontWeight.Companion companion5 = FontWeight.Companion;
                    TextKt.m2607TextNvy7gAk(str3, null, 0L, null, 0L, null, z ? companion5.getBold() : companion5.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer3, 0, 0, 131006);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return w01Var;
            case 4:
                interactionZIndex$lambda$19 = SegmentedButtonKt.interactionZIndex$lambda$19((State) obj4, z, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return interactionZIndex$lambda$19;
            default:
                MutableState mutableState = (MutableState) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1469866524, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3470)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState.getValue()).booleanValue() ? "..." : z ? "Update" : "Install", null, 0L, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 24576, 0, 262126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return w01Var;
        }
    }

    public /* synthetic */ g6(int i, boolean z, Object obj) {
        this.d = i;
        this.f = obj;
        this.e = z;
    }
}
