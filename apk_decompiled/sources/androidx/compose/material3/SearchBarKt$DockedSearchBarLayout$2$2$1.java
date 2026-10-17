package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.gy;
import defpackage.ky;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBarKt$DockedSearchBarLayout$2$2$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ SearchBarState $state;

    public SearchBarKt$DockedSearchBarLayout$2$2$1(SearchBarState searchBarState, float f, float f2) {
        this.$state = searchBarState;
        this.$maxHeight = f;
        this.$minHeight = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$8(List list, List list2, int i, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(i2), 0, 0, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list2.get(i3), 0, i, 0.0f, 4, null);
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo709measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        IntRect collapsedBounds;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        List<? extends Measurable> list2 = list.get(0);
        int i = 1;
        List<? extends Measurable> list3 = list.get(1);
        collapsedBounds = SearchBarKt.getCollapsedBounds(this.$state);
        int lerp = MathHelpersKt.lerp(collapsedBounds.getHeight(), measureScope.mo361roundToPx0680j_4(this.$maxHeight), this.$state.getProgress());
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(this.$minHeight);
        long m7579constrainN9IONVI = ConstraintsKt.m7579constrainN9IONVI(j, ConstraintsKt.Constraints$default(0, 0, mo361roundToPx0680j_4 > lerp ? lerp : mo361roundToPx0680j_4, lerp, 3, null));
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(m7579constrainN9IONVI, 0, 0, 0, 0, 10, null);
        final ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2 = gy.a(list2.get(i2), m7554copyZbe2FdA$default, arrayList, i2, 1)) {
        }
        Integer num = null;
        if (arrayList.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((Placeable) arrayList.get(0)).getWidth());
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Integer valueOf4 = Integer.valueOf(((Placeable) arrayList.get(i3)).getWidth());
                    if (valueOf4.compareTo(valueOf) > 0) {
                        valueOf = valueOf4;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        if (arrayList.isEmpty()) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(((Placeable) arrayList.get(0)).getHeight());
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                int i4 = 1;
                while (true) {
                    Integer valueOf5 = Integer.valueOf(((Placeable) arrayList.get(i4)).getHeight());
                    if (valueOf5.compareTo(valueOf2) > 0) {
                        valueOf2 = valueOf5;
                    }
                    if (i4 == size3) {
                        break;
                    }
                    i4++;
                }
            }
        }
        final int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
        long m7554copyZbe2FdA$default2 = Constraints.m7554copyZbe2FdA$default(ConstraintsKt.m7584offsetNN6EwU$default(m7554copyZbe2FdA$default, 0, -intValue2, 1, null), 0, intValue, 0, 0, 13, null);
        final ArrayList arrayList2 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i5 = 0; i5 < size4; i5 = gy.a(list3.get(i5), m7554copyZbe2FdA$default2, arrayList2, i5, 1)) {
        }
        if (arrayList2.isEmpty()) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
            int size5 = arrayList2.size() - 1;
            if (1 <= size5) {
                int i6 = 1;
                while (true) {
                    Integer valueOf6 = Integer.valueOf(((Placeable) arrayList2.get(i6)).getHeight());
                    if (valueOf6.compareTo(valueOf3) > 0) {
                        valueOf3 = valueOf6;
                    }
                    if (i6 == size5) {
                        break;
                    }
                    i6++;
                }
            }
        }
        int intValue3 = (valueOf3 != null ? valueOf3.intValue() : 0) + intValue2;
        if (!arrayList2.isEmpty()) {
            num = Integer.valueOf(((Placeable) arrayList2.get(0)).getWidth());
            int size6 = arrayList2.size() - 1;
            if (1 <= size6) {
                while (true) {
                    Integer valueOf7 = Integer.valueOf(((Placeable) arrayList2.get(i)).getWidth());
                    if (valueOf7.compareTo(num) > 0) {
                        num = valueOf7;
                    }
                    if (i == size6) {
                        break;
                    }
                    i++;
                }
            }
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m7581constrainWidthK40F9xA(m7579constrainN9IONVI, Math.max(intValue, num != null ? num.intValue() : 0)), ConstraintsKt.m7580constrainHeightK40F9xA(m7579constrainN9IONVI, intValue3), null, new ky() { // from class: androidx.compose.material3.x0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$8;
                measure_3p2s80s$lambda$8 = SearchBarKt$DockedSearchBarLayout$2$2$1.measure_3p2s80s$lambda$8(arrayList, arrayList2, intValue2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$8;
            }
        }, 4, null);
    }
}
