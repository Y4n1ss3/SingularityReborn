package androidx.compose.material3;

import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ChipLayoutMeasurePolicy implements MeasurePolicy {
    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$3(Placeable placeable, int i, int i2, Placeable placeable2, int i3, Placeable placeable3, int i4, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(i, i2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, 0, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, placeable2.getWidth() + i3, Alignment.Companion.getCenterVertically().align(i4, i2), 0.0f, 4, null);
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += list.get(i3).maxIntrinsicWidth(i);
        }
        return i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                break;
            }
            i++;
        }
        Measurable measurable3 = measurable;
        final Placeable mo6234measureBRTryo0 = measurable3 != null ? measurable3.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null)) : null;
        final int widthOrZero = LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo0);
        final int heightOrZero = LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo0);
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i2);
            if (q10.b(LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                break;
            }
            i2++;
        }
        Measurable measurable4 = measurable2;
        Placeable mo6234measureBRTryo02 = measurable4 != null ? measurable4.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null)) : null;
        int widthOrZero2 = LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo02);
        final int heightOrZero2 = LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo02);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Measurable measurable5 = list.get(i3);
            if (q10.b(LayoutIdKt.getLayoutId(measurable5), "label")) {
                final Placeable mo6234measureBRTryo03 = measurable5.mo6234measureBRTryo0(ConstraintsKt.m7584offsetNN6EwU$default(j, -(widthOrZero + widthOrZero2), 0, 2, null));
                int width = mo6234measureBRTryo03.getWidth() + widthOrZero + widthOrZero2;
                final int max = Math.max(heightOrZero, Math.max(mo6234measureBRTryo03.getHeight(), heightOrZero2));
                final Placeable placeable = mo6234measureBRTryo02;
                return MeasureScope.layout$default(measureScope, width, max, null, new ky() { // from class: androidx.compose.material3.m
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 measure_3p2s80s$lambda$3;
                        measure_3p2s80s$lambda$3 = ChipLayoutMeasurePolicy.measure_3p2s80s$lambda$3(Placeable.this, heightOrZero, max, mo6234measureBRTryo03, widthOrZero, placeable, heightOrZero2, (Placeable.PlacementScope) obj);
                        return measure_3p2s80s$lambda$3;
                    }
                }, 4, null);
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).minIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += list.get(i3).minIntrinsicWidth(i);
        }
        return i2;
    }
}
