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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ExpandLessKt;
import androidx.compose.material.icons.filled.ExpandMoreKt;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.DragHandleSizes;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.carousel.CarouselItemScopeImpl;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b9(ky kyVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 0;
        this.e = mutableState;
        this.g = kyVar;
        this.f = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 rememberMaskShape$lambda$1$lambda$0;
        MeasureResult VerticalDragHandle$lambda$13$lambda$12;
        String name;
        String str;
        String d;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj5;
                ky kyVar = (ky) obj6;
                MutableState mutableState2 = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1539164254, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:832)");
                    }
                    String str2 = (String) mutableState.getValue();
                    kb.a("Start App on Boot", uo.c("Select an app to automatically launch on boot\nCurrent: ", (str2 == null || ds0.n0(str2)) ? "Meta Store (Default)" : (String) mutableState.getValue()), ComposableLambdaKt.rememberComposableLambda(1037448838, true, new m6(kyVar, mutableState, mutableState2, 2), composer, 54), composer, 390);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                my myVar = (my) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj6;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1553714043, intValue2, -1, "com.lumi.singularity.ui.activities.AppCard.<anonymous> (AppsActivity.kt:1452)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(16.0f));
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer2, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m762padding3ABfNKs);
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
                    Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m7611constructorimpl(8.0f), 0.0f, 11, null);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m766paddingqDBjuR0$default);
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
                    TextKt.m2607TextNvy7gAk(str3, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i2).getBodyMedium(), composer2, 1572864, 0, 131006);
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(2.0f)), composer2, 6);
                    TextKt.m2607TextNvy7gAk(str4, null, materialTheme.getColorScheme(composer2, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i2).getBodySmall(), composer2, 0, 0, 131066);
                    composer2.endNode();
                    myVar.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                rememberMaskShape$lambda$1$lambda$0 = CarouselItemScopeImpl.rememberMaskShape$lambda$1$lambda$0((CarouselItemScopeImpl) obj5, (Shape) obj4, (Density) obj6, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
                break;
            case 3:
                VerticalDragHandle$lambda$13$lambda$12 = DragHandleKt.VerticalDragHandle$lambda$13$lambda$12((DragHandleSizes) obj4, (State) obj6, (MutableState) obj5, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                break;
            case 4:
                MutableState mutableState3 = (MutableState) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                MutableState mutableState5 = (MutableState) obj6;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1097032913, intValue3, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1718)");
                    }
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        d = "Rooting...";
                    } else {
                        if (((Boolean) mutableState4.getValue()).booleanValue()) {
                            name = ((ku) mutableState5.getValue()).name();
                            str = "Retry Root (";
                        } else {
                            name = ((ku) mutableState5.getValue()).name();
                            str = "Root Now (";
                        }
                        d = uo.d(str, name, ")");
                    }
                    TextKt.m2607TextNvy7gAk(d, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                String str5 = (String) obj6;
                MutableState mutableState6 = (MutableState) obj5;
                MutableState mutableState7 = (MutableState) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1477979982, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2277)");
                    }
                    TextKt.m2607TextNvy7gAk(((Number) mutableState6.getValue()).intValue() + " " + str5, null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 1572864, 0, 131006);
                    IconKt.m2055Iconww6aTOc(((Boolean) mutableState7.getValue()).booleanValue() ? ExpandLessKt.getExpandLess(Icons.INSTANCE.getDefault()) : ExpandMoreKt.getExpandMore(Icons.INSTANCE.getDefault()), (String) null, PaddingKt.m766paddingqDBjuR0$default(SizeKt.m807size3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(18.0f)), Dp.m7611constructorimpl(4.0f), 0.0f, 0.0f, 0.0f, 14, null), 0L, composer4, 432, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ b9(DragHandleSizes dragHandleSizes, State state, MutableState mutableState) {
        this.d = 3;
        this.f = dragHandleSizes;
        this.g = state;
        this.e = mutableState;
    }

    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    public /* synthetic */ b9(String str, MutableState mutableState, MutableState mutableState2) {
        this.d = 5;
        this.g = str;
        this.e = mutableState;
        this.f = mutableState2;
    }
}
