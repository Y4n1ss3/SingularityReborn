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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class l9 implements ny {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ l9(long j, ky kyVar, Density density, PopupPositionProvider popupPositionProvider, MutableState mutableState) {
        this.e = j;
        this.f = kyVar;
        this.g = density;
        this.h = popupPositionProvider;
        this.i = mutableState;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureResult layoutCaret_J5j9r9c$lambda$22;
        int i = this.d;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                String str = (String) obj7;
                my myVar = (my) obj4;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1301167898, intValue, -1, "com.lumi.singularity.ui.activities.AppCard.<anonymous> (AppsActivity.kt:1483)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m762padding3ABfNKs);
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
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
                    uo.h(companion3, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m7611constructorimpl(16.0f), 0.0f, 11, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m766paddingqDBjuR0$default);
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
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk(str2, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodyMedium(), composer, 1572864, 0, 131006);
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(2.0f)), composer, 6);
                    TextKt.m2607TextNvy7gAk(str3, null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 0, 0, 131066);
                    composer.endNode();
                    myVar.invoke(composer, 0);
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer, 6);
                    TextKt.m2607TextNvy7gAk(str, null, this.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getLabelSmall(), composer, 0, 0, 131066);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01.a;
            default:
                layoutCaret_J5j9r9c$lambda$22 = TooltipKt.layoutCaret_J5j9r9c$lambda$22(this.e, (ky) obj7, (Density) obj6, (PopupPositionProvider) obj5, (MutableState) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return layoutCaret_J5j9r9c$lambda$22;
        }
    }

    public /* synthetic */ l9(String str, long j, my myVar, String str2, String str3) {
        this.f = str;
        this.e = j;
        this.i = myVar;
        this.g = str2;
        this.h = str3;
    }
}
