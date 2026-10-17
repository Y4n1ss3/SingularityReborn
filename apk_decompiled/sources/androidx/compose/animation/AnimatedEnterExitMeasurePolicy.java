package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private boolean hasLookaheadOccurred;
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.scope = animatedVisibilityScopeImpl;
    }

    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int maxIntrinsicHeight = list.get(0).maxIntrinsicHeight(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int maxIntrinsicHeight2 = list.get(i2).maxIntrinsicHeight(i);
                if (maxIntrinsicHeight2 > maxIntrinsicHeight) {
                    maxIntrinsicHeight = maxIntrinsicHeight2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return maxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int maxIntrinsicWidth = list.get(0).maxIntrinsicWidth(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int maxIntrinsicWidth2 = list.get(i2).maxIntrinsicWidth(i);
                if (maxIntrinsicWidth2 > maxIntrinsicWidth) {
                    maxIntrinsicWidth = maxIntrinsicWidth2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable mo6234measureBRTryo0 = list.get(i3).mo6234measureBRTryo0(j);
            i = Math.max(i, mo6234measureBRTryo0.getWidth());
            i2 = Math.max(i2, mo6234measureBRTryo0.getHeight());
            arrayList.add(mo6234measureBRTryo0);
        }
        if (measureScope.isLookingAhead()) {
            this.hasLookaheadOccurred = true;
            this.scope.getTargetSize$animation().setValue(IntSize.m7774boximpl(IntSize.m7777constructorimpl((i2 & 4294967295L) | (i << 32))));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.getTargetSize$animation().setValue(IntSize.m7774boximpl(IntSize.m7777constructorimpl((i2 & 4294967295L) | (i << 32))));
        }
        return MeasureScope.layout$default(measureScope, i, i2, null, new AnimatedEnterExitMeasurePolicy$measure$1(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int minIntrinsicHeight = list.get(0).minIntrinsicHeight(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int minIntrinsicHeight2 = list.get(i2).minIntrinsicHeight(i);
                if (minIntrinsicHeight2 > minIntrinsicHeight) {
                    minIntrinsicHeight = minIntrinsicHeight2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return minIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int minIntrinsicWidth = list.get(0).minIntrinsicWidth(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int minIntrinsicWidth2 = list.get(i2).minIntrinsicWidth(i);
                if (minIntrinsicWidth2 > minIntrinsicWidth) {
                    minIntrinsicWidth = minIntrinsicWidth2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return minIntrinsicWidth;
    }

    public final void setHasLookaheadOccurred(boolean z) {
        this.hasLookaheadOccurred = z;
    }
}
