package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.hi0;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowKt$TabRowWithSubcomposeImpl$1 implements my {
    final /* synthetic */ my $divider;
    final /* synthetic */ ny $indicator;
    final /* synthetic */ my $tabs;

    public TabRowKt$TabRowWithSubcomposeImpl$1(my myVar, my myVar2, ny nyVar) {
        this.$tabs = myVar;
        this.$divider = myVar2;
        this.$indicator = nyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult invoke$lambda$8$lambda$7(my myVar, final my myVar2, final ny nyVar, final SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        final int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl());
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, myVar);
        int size = subcompose.size();
        final hi0 hi0Var = new hi0();
        if (size > 0) {
            hi0Var.d = m7564getMaxWidthimpl / size;
        }
        Integer num = 0;
        int size2 = subcompose.size();
        for (int i = 0; i < size2; i++) {
            num = Integer.valueOf(Math.max(subcompose.get(i).maxIntrinsicHeight(hi0Var.d), num.intValue()));
        }
        final int intValue = num.intValue();
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size3 = subcompose.size();
        int i2 = 0;
        while (i2 < size3) {
            Measurable measurable = subcompose.get(i2);
            long m7570unboximpl = constraints.m7570unboximpl();
            int i3 = hi0Var.d;
            long m7553copyZbe2FdA = Constraints.m7553copyZbe2FdA(m7570unboximpl, i3, i3, intValue, intValue);
            ArrayList arrayList2 = arrayList;
            i2 = gy.a(measurable, m7553copyZbe2FdA, arrayList2, i2, 1);
            arrayList = arrayList2;
        }
        final ArrayList arrayList3 = arrayList;
        final ArrayList arrayList4 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList4.add(new TabPosition(Dp.m7611constructorimpl(subcomposeMeasureScope.mo364toDpu2uoSUM(hi0Var.d) * i4), subcomposeMeasureScope.mo364toDpu2uoSUM(hi0Var.d), ((Dp) p01.v(Dp.m7609boximpl(Dp.m7611constructorimpl(subcomposeMeasureScope.mo364toDpu2uoSUM(Math.min(subcompose.get(i4).maxIntrinsicWidth(intValue), hi0Var.d)) - Dp.m7611constructorimpl(TabKt.getHorizontalTextPadding() * 2.0f))), Dp.m7609boximpl(Dp.m7611constructorimpl(24.0f)))).m7625unboximpl(), null));
        }
        return MeasureScope.layout$default(subcomposeMeasureScope, m7564getMaxWidthimpl, intValue, null, new ky() { // from class: androidx.compose.material3.j1
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 invoke$lambda$8$lambda$7$lambda$6;
                invoke$lambda$8$lambda$7$lambda$6 = TabRowKt$TabRowWithSubcomposeImpl$1.invoke$lambda$8$lambda$7$lambda$6(arrayList3, subcomposeMeasureScope, myVar2, hi0Var, constraints, intValue, nyVar, arrayList4, m7564getMaxWidthimpl, (Placeable.PlacementScope) obj);
                return invoke$lambda$8$lambda$7$lambda$6;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$8$lambda$7$lambda$6(List list, SubcomposeMeasureScope subcomposeMeasureScope, my myVar, hi0 hi0Var, Constraints constraints, int i, final ny nyVar, final List list2, int i2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i3), i3 * hi0Var.d, 0, 0.0f, 4, null);
        }
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Divider, myVar);
        int size2 = subcompose.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable mo6234measureBRTryo0 = subcompose.get(i4).mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(constraints.m7570unboximpl(), 0, 0, 0, 0, 11, null));
            Placeable.PlacementScope.placeRelative$default(placementScope, mo6234measureBRTryo0, 0, i - mo6234measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(1918742627, true, new my() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1$3
            public final void invoke(Composer composer, int i5) {
                if (!composer.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1918742627, i5, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:814)");
                }
                ny.this.invoke(list2, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }
        }));
        int size3 = subcompose2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i5).mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(i2, i)), 0, 0, 0.0f, 4, null);
        }
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1815327065, i, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:768)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        boolean changed = composer.changed(this.$tabs) | composer.changed(this.$divider) | composer.changed(this.$indicator);
        final my myVar = this.$tabs;
        final my myVar2 = this.$divider;
        final ny nyVar = this.$indicator;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new my() { // from class: androidx.compose.material3.k1
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    MeasureResult invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = TabRowKt$TabRowWithSubcomposeImpl$1.invoke$lambda$8$lambda$7(my.this, myVar2, nyVar, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (my) rememberedValue, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
