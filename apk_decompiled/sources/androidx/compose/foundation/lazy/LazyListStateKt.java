package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import defpackage.iy;
import defpackage.p10;
import defpackage.st;
import defpackage.t30;
import defpackage.u30;
import defpackage.ut;
import defpackage.v30;
import defpackage.vt;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListStateKt {
    private static final LazyListMeasureResult EmptyLazyListMeasureResult;
    private static final int NumberOfItemsToTeleport = 100;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1
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
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        EmptyLazyListMeasureResult = new LazyListMeasureResult(null, i, z, f, measureResult, f2, z2, p10.a(st.d), DensityKt.Density$default(1.0f, 0.0f, 2, null), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), ut.d, 0, 0, 0, false, orientation, 0, 0, null);
    }

    public static final LazyListState rememberLazyListState(int i, int i2, LazyListPrefetchStrategy lazyListPrefetchStrategy, Composer composer, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        int i5 = 1;
        if ((i4 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(rememberedValue);
            }
            lazyListPrefetchStrategy = (LazyListPrefetchStrategy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1287535208, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:102)");
        }
        Object[] objArr = {lazyListPrefetchStrategy};
        Saver<LazyListState, ?> saver$foundation = LazyListState.Companion.saver$foundation(lazyListPrefetchStrategy);
        boolean z = ((((i3 & 896) ^ 384) > 256 && composer.changedInstance(lazyListPrefetchStrategy)) || (i3 & 384) == 256) | ((((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32);
        Object rememberedValue2 = composer.rememberedValue();
        if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new v30(i, i2, i5, lazyListPrefetchStrategy);
            composer.updateRememberedValue(rememberedValue2);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver$foundation, (iy) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState rememberLazyListState$lambda$0$0(int i, int i2) {
        return new LazyListState(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState rememberLazyListState$lambda$2$0(int i, int i2, LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        return new LazyListState(i, i2, lazyListPrefetchStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState rememberLazyListState$lambda$3$0(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2) {
        return new LazyListState(lazyLayoutCacheWindow, i, i2);
    }

    public static final LazyListState rememberLazyListState(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2, Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1588550476, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:130)");
        }
        Object[] objArr = {lazyLayoutCacheWindow};
        Saver<LazyListState, ?> saver$foundation = LazyListState.Companion.saver$foundation(lazyLayoutCacheWindow);
        int i5 = 1;
        boolean z = ((((i3 & 896) ^ 384) > 256 && composer.changed(i2)) || (i3 & 384) == 256) | ((((i3 & 14) ^ 6) > 4 && composer.changed(lazyLayoutCacheWindow)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i)) || (i3 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new t30(lazyLayoutCacheWindow, i, i2, i5);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver$foundation, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }

    public static final LazyListState rememberLazyListState(int i, int i2, Composer composer, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470655220, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:78)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyListState, ?> saver = LazyListState.Companion.getSaver();
        int i5 = 1;
        boolean z = ((((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32) | ((((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new u30(i, i2, i5);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }
}
