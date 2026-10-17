package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.o;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.mo714calculateTopPaddingD9Ej5fM() : paddingValues.mo711calculateBottomPaddingD9Ej5fM();
        }
        if (i == 2) {
            return z ? PaddingKt.calculateStartPadding(paddingValues, layoutDirection) : PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        o.n();
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.mo711calculateBottomPaddingD9Ej5fM() : paddingValues.mo714calculateTopPaddingD9Ej5fM();
        }
        if (i == 2) {
            return z ? PaddingKt.calculateEndPadding(paddingValues, layoutDirection) : PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        o.n();
        return 0.0f;
    }

    /* renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    public static final LazyLayoutMeasurePolicy m977rememberStaggeredGridMeasurePolicyqKj4JfE(final LazyStaggeredGridState lazyStaggeredGridState, final iy iyVar, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final float f, float f2, final un unVar, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final GraphicsContext graphicsContext, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(234882793, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(iyVar)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(orientation.ordinal())) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) > 131072 && composer.changed(f)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) > 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576) | ((((234881024 & i) ^ 100663296) > 67108864 && composer.changed(lazyGridStaggeredGridSlotsProvider)) || (i & 100663296) == 67108864) | composer.changed(graphicsContext);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = new LazyLayoutMeasurePolicy() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                /* renamed from: measure-0kLqBqw */
                public final MeasureResult mo861measure0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                    float beforePadding;
                    float afterPadding;
                    float startPadding;
                    ObservableScopeInvalidator.m939attachToScopeimpl(LazyStaggeredGridState.this.m982getMeasurementScopeInvalidatorzYiylxw$foundation());
                    boolean z2 = LazyStaggeredGridState.this.getHasLookaheadOccurred$foundation() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraintsKt.m254checkScrollableContainerConstraintsK40F9xA(j, orientation);
                    LazyStaggeredGridSlots mo959invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo959invoke0kLqBqw(lazyLayoutMeasureScope, j);
                    boolean z3 = orientation == Orientation.Vertical;
                    LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = (LazyStaggeredGridItemProvider) iyVar.invoke();
                    beforePadding = LazyStaggeredGridMeasurePolicyKt.beforePadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                    int mo361roundToPx0680j_4 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(beforePadding);
                    afterPadding = LazyStaggeredGridMeasurePolicyKt.afterPadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection());
                    int mo361roundToPx0680j_42 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(afterPadding);
                    startPadding = LazyStaggeredGridMeasurePolicyKt.startPadding(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection());
                    int mo361roundToPx0680j_43 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(startPadding);
                    int m7563getMaxHeightimpl = ((z3 ? Constraints.m7563getMaxHeightimpl(j) : Constraints.m7564getMaxWidthimpl(j)) - mo361roundToPx0680j_4) - mo361roundToPx0680j_42;
                    long m7733constructorimpl = z3 ? IntOffset.m7733constructorimpl((mo361roundToPx0680j_4 & 4294967295L) | (mo361roundToPx0680j_43 << 32)) : IntOffset.m7733constructorimpl((mo361roundToPx0680j_4 << 32) | (mo361roundToPx0680j_43 & 4294967295L));
                    PaddingValues paddingValues2 = paddingValues;
                    int mo361roundToPx0680j_44 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                    PaddingValues paddingValues3 = paddingValues;
                    LazyStaggeredGridMeasureResult m976measureStaggeredGridC6celF4 = LazyStaggeredGridMeasureKt.m976measureStaggeredGridC6celF4(lazyLayoutMeasureScope, LazyStaggeredGridState.this, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProvider, LazyStaggeredGridState.this.getPinnedItems$foundation(), LazyStaggeredGridState.this.getBeyondBoundsInfo$foundation()), lazyStaggeredGridItemProvider, mo959invoke0kLqBqw, Constraints.m7554copyZbe2FdA$default(j, ConstraintsKt.m7581constrainWidthK40F9xA(j, mo361roundToPx0680j_44), 0, ConstraintsKt.m7580constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(paddingValues3.mo711calculateBottomPaddingD9Ej5fM() + paddingValues3.mo714calculateTopPaddingD9Ej5fM()))), 0, 10, null), z3, z, m7733constructorimpl, m7563getMaxHeightimpl, lazyLayoutMeasureScope.mo361roundToPx0680j_4(f), mo361roundToPx0680j_4, mo361roundToPx0680j_42, unVar, z2, lazyLayoutMeasureScope.isLookingAhead(), LazyStaggeredGridState.this.getApproachLayoutInfo$foundation(), graphicsContext);
                    LazyStaggeredGridState.applyMeasureResult$foundation$default(LazyStaggeredGridState.this, m976measureStaggeredGridC6celF4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                    return m976measureStaggeredGridC6celF4;
                }
            };
            composer.updateRememberedValue(lazyLayoutMeasurePolicy);
            rememberedValue = lazyLayoutMeasurePolicy;
        }
        LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = (LazyLayoutMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyLayoutMeasurePolicy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i == 2) {
            return paddingValues.mo714calculateTopPaddingD9Ej5fM();
        }
        o.n();
        return 0.0f;
    }
}
