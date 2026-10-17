package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface MultiContentMeasurePolicy {
    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return mo709measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return mo709measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo709measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return mo709measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return mo709measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}
