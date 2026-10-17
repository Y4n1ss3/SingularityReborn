package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.st;
import defpackage.un;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRowWithSubcomposeImpl$1 implements my {
    final /* synthetic */ my $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ ny $indicator;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ my $tabs;

    public TabRowKt$ScrollableTabRowWithSubcomposeImpl$1(ScrollState scrollState, float f, my myVar, my myVar2, ny nyVar, int i) {
        this.$scrollState = scrollState;
        this.$edgePadding = f;
        this.$tabs = myVar;
        this.$divider = myVar2;
        this.$indicator = nyVar;
        this.$selectedTabIndex = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult invoke$lambda$9$lambda$8(float f, my myVar, final my myVar2, final ScrollableTabData scrollableTabData, final int i, final ny nyVar, final SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        int mo361roundToPx0680j_4 = subcomposeMeasureScope.mo361roundToPx0680j_4(TabRowDefaults.INSTANCE.m2508getScrollableTabRowMinTabWidthD9Ej5fM());
        final int mo361roundToPx0680j_42 = subcomposeMeasureScope.mo361roundToPx0680j_4(f);
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, myVar);
        Integer num = 0;
        int size = subcompose.size();
        for (int i2 = 0; i2 < size; i2++) {
            num = Integer.valueOf(Math.max(num.intValue(), subcompose.get(i2).maxIntrinsicHeight(Integer.MAX_VALUE)));
        }
        final int intValue = num.intValue();
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(constraints.m7570unboximpl(), mo361roundToPx0680j_4, 0, intValue, intValue, 2, null);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int size2 = subcompose.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Measurable measurable = subcompose.get(i3);
            Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(m7554copyZbe2FdA$default);
            float m7611constructorimpl = Dp.m7611constructorimpl(subcomposeMeasureScope.mo364toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo6234measureBRTryo0.getHeight()), mo6234measureBRTryo0.getWidth())) - Dp.m7611constructorimpl(TabKt.getHorizontalTextPadding() * 2.0f));
            arrayList.add(mo6234measureBRTryo0);
            arrayList2.add(Dp.m7609boximpl(m7611constructorimpl));
        }
        Integer valueOf = Integer.valueOf(mo361roundToPx0680j_42 * 2);
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            valueOf = Integer.valueOf(((Placeable) arrayList.get(i4)).getWidth() + valueOf.intValue());
        }
        final int intValue2 = valueOf.intValue();
        return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new ky() { // from class: androidx.compose.material3.g1
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 invoke$lambda$9$lambda$8$lambda$7;
                invoke$lambda$9$lambda$8$lambda$7 = TabRowKt$ScrollableTabRowWithSubcomposeImpl$1.invoke$lambda$9$lambda$8$lambda$7(mo361roundToPx0680j_42, arrayList, subcomposeMeasureScope, myVar2, scrollableTabData, i, arrayList2, constraints, intValue2, intValue, nyVar, (Placeable.PlacementScope) obj);
                return invoke$lambda$9$lambda$8$lambda$7;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$9$lambda$8$lambda$7(int i, List list, SubcomposeMeasureScope subcomposeMeasureScope, my myVar, ScrollableTabData scrollableTabData, int i2, List list2, Constraints constraints, int i3, int i4, final ny nyVar, Placeable.PlacementScope placementScope) {
        final ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i5 = i;
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = (Placeable) list.get(i6);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i5, 0, 0.0f, 4, null);
            arrayList.add(new TabPosition(subcomposeMeasureScope.mo364toDpu2uoSUM(i5), subcomposeMeasureScope.mo364toDpu2uoSUM(placeable.getWidth()), ((Dp) list2.get(i6)).m7625unboximpl(), null));
            i5 += placeable.getWidth();
        }
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Divider, myVar);
        int size2 = subcompose.size();
        for (int i7 = 0; i7 < size2; i7++) {
            Placeable mo6234measureBRTryo0 = subcompose.get(i7).mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(constraints.m7570unboximpl(), i3, i3, 0, 0, 8, null));
            Placeable.PlacementScope.placeRelative$default(placementScope, mo6234measureBRTryo0, 0, i4 - mo6234measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(2125766411, true, new my() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1$2$3
            public final void invoke(Composer composer, int i8) {
                if (!composer.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2125766411, i8, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:920)");
                }
                ny.this.invoke(arrayList, composer, 0);
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
        for (int i8 = 0; i8 < size3; i8++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i8).mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(i3, i4)), 0, 0, 0.0f, 4, null);
        }
        scrollableTabData.onLaidOut(subcomposeMeasureScope, i, arrayList, i2);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2077251399, i, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:836)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        un unVar = (un) rememberedValue;
        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        boolean changed = composer.changed(this.$scrollState) | composer.changed(unVar);
        ScrollState scrollState = this.$scrollState;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ScrollableTabData(scrollState, unVar, value);
            composer.updateRememberedValue(rememberedValue2);
        }
        final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
        Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), this.$scrollState, false, null, false, 14, null)));
        boolean changed2 = composer.changed(this.$edgePadding) | composer.changed(this.$tabs) | composer.changed(this.$divider) | composer.changed(this.$indicator) | composer.changedInstance(scrollableTabData) | composer.changed(this.$selectedTabIndex);
        final float f = this.$edgePadding;
        final my myVar = this.$tabs;
        final my myVar2 = this.$divider;
        final int i2 = this.$selectedTabIndex;
        final ny nyVar = this.$indicator;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion.getEmpty()) {
            Object obj = new my() { // from class: androidx.compose.material3.h1
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    MeasureResult invoke$lambda$9$lambda$8;
                    invoke$lambda$9$lambda$8 = TabRowKt$ScrollableTabRowWithSubcomposeImpl$1.invoke$lambda$9$lambda$8(f, myVar, myVar2, scrollableTabData, i2, nyVar, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
                    return invoke$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue3 = obj;
        }
        SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (my) rememberedValue3, composer, 0, 0);
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
