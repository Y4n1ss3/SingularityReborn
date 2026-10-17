package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface MeasurePolicy {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            return MeasurePolicy.super.maxIntrinsicHeight(intrinsicMeasureScope, list, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            return MeasurePolicy.super.maxIntrinsicWidth(intrinsicMeasureScope, list, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            return MeasurePolicy.super.minIntrinsicHeight(intrinsicMeasureScope, list, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            return MeasurePolicy.super.minIntrinsicWidth(intrinsicMeasureScope, list, i);
        }
    }

    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo5measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo5measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo5measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo5measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}
