package androidx.compose.material3;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.internal.SwipeEdge;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBarKt$FullScreenSearchBarLayout$2$1 implements MeasurePolicy {
    final /* synthetic */ MutableState<BackEventProgress.InProgress> $firstInProgressValue;
    final /* synthetic */ MutableState<BackEventProgress.InProgress> $lastInProgressValue;
    final /* synthetic */ SearchBarState $state;
    final /* synthetic */ MutableWindowInsets $unconsumedInsets;

    public SearchBarKt$FullScreenSearchBarLayout$2$1(MutableState<BackEventProgress.InProgress> mutableState, SearchBarState searchBarState, MutableWindowInsets mutableWindowInsets, MutableState<BackEventProgress.InProgress> mutableState2) {
        this.$lastInProgressValue = mutableState;
        this.$state = searchBarState;
        this.$unconsumedInsets = mutableWindowInsets;
        this.$firstInProgressValue = mutableState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$6(MutableState mutableState, float f, SearchBarState searchBarState, Placeable placeable, Placeable placeable2, int i, Placeable placeable3, int i2, long j, MeasureScope measureScope, int i3, MutableState mutableState2, int i4, int i5, Placeable.PlacementScope placementScope) {
        IntRect collapsedBounds;
        IntRect collapsedBounds2;
        BackEventProgress.InProgress inProgress = (BackEventProgress.InProgress) mutableState.getValue();
        int lerp = MathHelpersKt.lerp(0, inProgress != null ? measure_3p2s80s$lambda$6$endOffsetX(inProgress, j, measureScope, i3, searchBarState) : 0, f);
        BackEventProgress.InProgress inProgress2 = (BackEventProgress.InProgress) mutableState.getValue();
        int lerp2 = MathHelpersKt.lerp(0, inProgress2 != null ? measure_3p2s80s$lambda$6$endOffsetY(inProgress2, mutableState2, j, i4, measureScope, i5, searchBarState) : 0, f);
        collapsedBounds = SearchBarKt.getCollapsedBounds(searchBarState);
        int lerp3 = MathHelpersKt.lerp(collapsedBounds.getLeft(), lerp, searchBarState.getProgress());
        collapsedBounds2 = SearchBarKt.getCollapsedBounds(searchBarState);
        int lerp4 = MathHelpersKt.lerp(collapsedBounds2.getTop(), lerp2, searchBarState.getProgress());
        Placeable.PlacementScope.place$default(placementScope, placeable, lerp3, lerp4, 0.0f, 4, null);
        int i6 = lerp4 + i;
        Placeable.PlacementScope.place$default(placementScope, placeable2, lerp3, i6, 0.0f, 4, null);
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable3, lerp3, placeable2.getHeight() + i6 + i2, 0.0f, new o(searchBarState, 5), 4, (Object) null);
        return w01.a;
    }

    private static final int measure_3p2s80s$lambda$6$endOffsetX(BackEventProgress.InProgress inProgress, long j, MeasureScope measureScope, int i, SearchBarState searchBarState) {
        float f;
        int mo361roundToPx0680j_4;
        IntRect collapsedBounds;
        IntRect collapsedBounds2;
        float f2;
        if (inProgress.getSwipeEdge() == SwipeEdge.Left) {
            int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
            f2 = SearchBarKt.SearchBarPredictiveBackMinMargin;
            mo361roundToPx0680j_4 = (m7564getMaxWidthimpl - measureScope.mo361roundToPx0680j_4(f2)) - i;
        } else {
            f = SearchBarKt.SearchBarPredictiveBackMinMargin;
            mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(f);
        }
        collapsedBounds = SearchBarKt.getCollapsedBounds(searchBarState);
        int right = collapsedBounds.getRight() - i;
        if (mo361roundToPx0680j_4 < right) {
            mo361roundToPx0680j_4 = right;
        }
        collapsedBounds2 = SearchBarKt.getCollapsedBounds(searchBarState);
        int left = collapsedBounds2.getLeft();
        return mo361roundToPx0680j_4 > left ? left : mo361roundToPx0680j_4;
    }

    private static final int measure_3p2s80s$lambda$6$endOffsetY(BackEventProgress.InProgress inProgress, MutableState<BackEventProgress.InProgress> mutableState, long j, int i, MeasureScope measureScope, int i2, SearchBarState searchBarState) {
        float f;
        float f2;
        IntRect collapsedBounds;
        float touchY = inProgress.getTouchY();
        BackEventProgress.InProgress value = mutableState.getValue();
        if (value == null) {
            return 0;
        }
        float touchY2 = touchY - value.getTouchY();
        float abs = Math.abs(touchY2) / Constraints.m7563getMaxHeightimpl(j);
        int m7563getMaxHeightimpl = (Constraints.m7563getMaxHeightimpl(j) - i) / 2;
        f = SearchBarKt.SearchBarPredictiveBackMinMargin;
        int mo361roundToPx0680j_4 = m7563getMaxHeightimpl - measureScope.mo361roundToPx0680j_4(f);
        if (mo361roundToPx0680j_4 < 0) {
            mo361roundToPx0680j_4 = 0;
        }
        f2 = SearchBarKt.SearchBarPredictiveBackMaxOffsetY;
        int lerp = (MathHelpersKt.lerp(0, Math.min(mo361roundToPx0680j_4, measureScope.mo361roundToPx0680j_4(f2)), abs) * ((int) Math.signum(touchY2))) + i2;
        collapsedBounds = SearchBarKt.getCollapsedBounds(searchBarState);
        int top = collapsedBounds.getTop();
        return lerp > top ? top : lerp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$6$lambda$5(SearchBarState searchBarState, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(searchBarState.getProgress());
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        float transform;
        IntRect collapsedBounds;
        IntRect collapsedBounds2;
        final MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        final long j2 = j;
        transform = SearchBarKt.transform(this.$lastInProgressValue.getValue());
        collapsedBounds = SearchBarKt.getCollapsedBounds(this.$state);
        int width = collapsedBounds.getWidth();
        Integer valueOf = Integer.valueOf(width);
        if (width == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : measureScope2.mo361roundToPx0680j_4(SearchBarKt.getSearchBarMinWidth());
        collapsedBounds2 = SearchBarKt.getCollapsedBounds(this.$state);
        int height = collapsedBounds2.getHeight();
        Integer valueOf2 = height != 0 ? Integer.valueOf(height) : null;
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : measureScope2.mo361roundToPx0680j_4(SearchBarDefaults.INSTANCE.m2309getInputFieldHeightD9Ej5fM());
        int P = y80.P(Constraints.m7564getMaxWidthimpl(j2) * 0.9f);
        final int i = P < intValue ? intValue : P;
        int P2 = y80.P(Constraints.m7563getMaxHeightimpl(j2) * 0.9f);
        final int i2 = P2 < intValue2 ? intValue2 : P2;
        int lerp = MathHelpersKt.lerp(Constraints.m7564getMaxWidthimpl(j2), i, transform);
        int lerp2 = MathHelpersKt.lerp(Constraints.m7563getMaxHeightimpl(j2), i2, transform);
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j2, MathHelpersKt.lerp(intValue, lerp, this.$state.getProgress()));
        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j2, MathHelpersKt.lerp(intValue2, lerp2, this.$state.getProgress()));
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable = list2.get(i3);
            final float f = transform;
            if (q10.b(LayoutIdKt.getLayoutId(measurable), "Surface")) {
                Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(m7581constrainWidthK40F9xA, m7580constrainHeightK40F9xA));
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = list2.get(i4);
                    final Placeable placeable = mo6234measureBRTryo0;
                    if (q10.b(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                        final Placeable mo6234measureBRTryo02 = measurable2.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(m7581constrainWidthK40F9xA, intValue2));
                        final int mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding()) + this.$unconsumedInsets.getTop(measureScope2);
                        int mo361roundToPx0680j_42 = measureScope2.mo361roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding());
                        final int lerp3 = MathHelpersKt.lerp(0, mo361roundToPx0680j_4, Math.min(this.$state.getProgress(), 1.0f - f));
                        final int lerp4 = MathHelpersKt.lerp(0, mo361roundToPx0680j_42, this.$state.getProgress());
                        int height2 = mo6234measureBRTryo02.getHeight() + lerp3 + lerp4;
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Measurable measurable3 = list2.get(i5);
                            int i6 = i5;
                            int i7 = height2;
                            if (q10.b(LayoutIdKt.getLayoutId(measurable3), "Content")) {
                                int i8 = m7580constrainHeightK40F9xA - i7;
                                if (i8 < 0) {
                                    i8 = 0;
                                }
                                final Placeable mo6234measureBRTryo03 = measurable3.mo6234measureBRTryo0(ConstraintsKt.Constraints(m7581constrainWidthK40F9xA, m7581constrainWidthK40F9xA, 0, i8));
                                int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j2);
                                int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j2);
                                final MutableState<BackEventProgress.InProgress> mutableState = this.$lastInProgressValue;
                                final SearchBarState searchBarState = this.$state;
                                final MutableState<BackEventProgress.InProgress> mutableState2 = this.$firstInProgressValue;
                                return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, m7563getMaxHeightimpl, null, new ky() { // from class: androidx.compose.material3.y0
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj) {
                                        w01 measure_3p2s80s$lambda$6;
                                        measure_3p2s80s$lambda$6 = SearchBarKt$FullScreenSearchBarLayout$2$1.measure_3p2s80s$lambda$6(MutableState.this, f, searchBarState, placeable, mo6234measureBRTryo02, lerp3, mo6234measureBRTryo03, lerp4, j2, measureScope2, i, mutableState2, i2, mo361roundToPx0680j_4, (Placeable.PlacementScope) obj);
                                        return measure_3p2s80s$lambda$6;
                                    }
                                }, 4, null);
                            }
                            measureScope2 = measureScope;
                            j2 = j;
                            i5 = i6 + 1;
                            height2 = i7;
                            list2 = list;
                        }
                        throw k4.m("Collection contains no element matching the predicate.");
                    }
                    i4++;
                    measureScope2 = measureScope;
                    list2 = list;
                    j2 = j;
                    mo6234measureBRTryo0 = placeable;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i3++;
            measureScope2 = measureScope;
            list2 = list;
            j2 = j;
            transform = f;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }
}
