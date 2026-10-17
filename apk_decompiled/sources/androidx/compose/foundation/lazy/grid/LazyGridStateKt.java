package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.DensityKt;
import defpackage.hz;
import defpackage.iy;
import defpackage.p10;
import defpackage.st;
import defpackage.t30;
import defpackage.u30;
import defpackage.ut;
import defpackage.v30;
import defpackage.vt;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridStateKt {
    private static final LazyGridMeasureResult EmptyLazyGridLayoutInfo;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$1
            private final Map<AlignmentLine, Integer> alignmentLines = vt.d;
            private final int height;
            private final int width;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
        Orientation orientation = Orientation.Vertical;
        EmptyLazyGridLayoutInfo = new LazyGridMeasureResult(null, 0, false, 0.0f, measureResult, 0.0f, false, p10.a(st.d), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, new hz(11), new hz(12), ut.d, 0, 0, 0, false, orientation, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List EmptyLazyGridLayoutInfo$lambda$0(int i) {
        return ut.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EmptyLazyGridLayoutInfo$lambda$1(int i) {
        return -1;
    }

    public static final LazyGridState rememberLazyGridState(int i, int i2, LazyGridPrefetchStrategy lazyGridPrefetchStrategy, Composer composer, int i3, int i4) {
        int i5 = 0;
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        boolean z = true;
        if ((i4 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(rememberedValue);
            }
            lazyGridPrefetchStrategy = (LazyGridPrefetchStrategy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20335728, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:103)");
        }
        Object[] objArr = {lazyGridPrefetchStrategy};
        Saver<LazyGridState, ?> saver$foundation = LazyGridState.Companion.saver$foundation(lazyGridPrefetchStrategy);
        boolean z2 = ((((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32);
        if ((((i3 & 896) ^ 384) <= 256 || !composer.changedInstance(lazyGridPrefetchStrategy)) && (i3 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new v30(i, i2, i5, lazyGridPrefetchStrategy);
            composer.updateRememberedValue(rememberedValue2);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver$foundation, (iy) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState rememberLazyGridState$lambda$0$0(int i, int i2) {
        return new LazyGridState(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState rememberLazyGridState$lambda$2$0(int i, int i2, LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        return new LazyGridState(i, i2, lazyGridPrefetchStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState rememberLazyGridState$lambda$3$0(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2) {
        return new LazyGridState(lazyLayoutCacheWindow, i, i2);
    }

    public static final LazyGridState rememberLazyGridState(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2, Composer composer, int i3, int i4) {
        int i5 = 0;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1537306572, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:131)");
        }
        Object[] objArr = {lazyLayoutCacheWindow};
        Saver<LazyGridState, ?> saver$foundation = LazyGridState.Companion.saver$foundation(lazyLayoutCacheWindow);
        boolean z = true;
        boolean z2 = ((((i3 & 14) ^ 6) > 4 && composer.changed(lazyLayoutCacheWindow)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i)) || (i3 & 48) == 32);
        if ((((i3 & 896) ^ 384) <= 256 || !composer.changed(i2)) && (i3 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new t30(lazyLayoutCacheWindow, i, i2, i5);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver$foundation, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }

    public static final LazyGridState rememberLazyGridState(int i, int i2, Composer composer, int i3, int i4) {
        int i5 = 0;
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(29186956, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:79)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyGridState, ?> saver = LazyGridState.Companion.getSaver();
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new u30(i, i2, i5);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }
}
