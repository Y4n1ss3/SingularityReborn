package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.gy;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ iy $sheetOffset;
    final /* synthetic */ SheetState $sheetState;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(SheetState sheetState, iy iyVar) {
        this.$sheetState = sheetState;
        this.$sheetOffset = iyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$12(List list, int i, List list2, SheetState sheetState, iy iyVar, int i2, List list3, List list4, int i3, Placeable.PlacementScope placementScope) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        int P;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((Placeable) list.get(0)).getWidth());
            int size = list.size() - 1;
            if (1 <= size) {
                int i4 = 1;
                while (true) {
                    Integer valueOf4 = Integer.valueOf(((Placeable) list.get(i4)).getWidth());
                    if (valueOf4.compareTo(valueOf) > 0) {
                        valueOf = valueOf4;
                    }
                    if (i4 == size) {
                        break;
                    }
                    i4++;
                }
            }
        }
        int max = Math.max(0, (i - (valueOf != null ? valueOf.intValue() : 0)) / 2);
        if (list2.isEmpty()) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(((Placeable) list2.get(0)).getWidth());
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                int i5 = 1;
                while (true) {
                    Integer valueOf5 = Integer.valueOf(((Placeable) list2.get(i5)).getWidth());
                    if (valueOf5.compareTo(valueOf2) > 0) {
                        valueOf2 = valueOf5;
                    }
                    if (i5 == size2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        int intValue = valueOf2 != null ? valueOf2.intValue() : 0;
        if (list2.isEmpty()) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(((Placeable) list2.get(0)).getHeight());
            int size3 = list2.size() - 1;
            if (1 <= size3) {
                int i6 = 1;
                while (true) {
                    Integer valueOf6 = Integer.valueOf(((Placeable) list2.get(i6)).getHeight());
                    if (valueOf6.compareTo(valueOf3) > 0) {
                        valueOf3 = valueOf6;
                    }
                    if (i6 == size3) {
                        break;
                    }
                    i6++;
                }
            }
        }
        int intValue2 = valueOf3 != null ? valueOf3.intValue() : 0;
        int i7 = (i - intValue) / 2;
        int i8 = WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
        if (i8 == 1) {
            P = y80.P(((Number) iyVar.invoke()).floatValue()) - intValue2;
        } else {
            if (i8 != 2 && i8 != 3) {
                defpackage.o.n();
                return null;
            }
            P = i2 - intValue2;
        }
        int size4 = list3.size();
        for (int i9 = 0; i9 < size4; i9++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list3.get(i9), 0, i3, 0.0f, 4, null);
        }
        int size5 = list4.size();
        for (int i10 = 0; i10 < size5; i10++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list4.get(i10), 0, 0, 0.0f, 4, null);
        }
        int size6 = list.size();
        for (int i11 = 0; i11 < size6; i11++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i11), max, 0, 0.0f, 4, null);
        }
        int size7 = list2.size();
        for (int i12 = 0; i12 < size7; i12++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list2.get(i12), i7, P, 0.0f, 4, null);
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo709measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        Integer valueOf;
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list.get(3);
        final int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        final ArrayList arrayList = new ArrayList(list4.size());
        int size = list4.size();
        int i = 0;
        while (i < size) {
            i = gy.a(list4.get(i), m7554copyZbe2FdA$default, arrayList, i, 1);
            m7563getMaxHeightimpl = m7563getMaxHeightimpl;
        }
        final int i2 = m7563getMaxHeightimpl;
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3 = gy.a(list2.get(i3), m7554copyZbe2FdA$default, arrayList2, i3, 1)) {
        }
        if (arrayList2.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
            int size3 = arrayList2.size() - 1;
            if (1 <= size3) {
                int i4 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i4)).getHeight());
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == size3) {
                        break;
                    }
                    i4++;
                }
            }
        }
        final int intValue = valueOf != null ? valueOf.intValue() : 0;
        long m7554copyZbe2FdA$default2 = Constraints.m7554copyZbe2FdA$default(m7554copyZbe2FdA$default, 0, 0, 0, i2 - intValue, 7, null);
        final ArrayList arrayList3 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i5 = 0; i5 < size4; i5 = gy.a(list3.get(i5), m7554copyZbe2FdA$default2, arrayList3, i5, 1)) {
        }
        final ArrayList arrayList4 = new ArrayList(list5.size());
        int size5 = list5.size();
        for (int i6 = 0; i6 < size5; i6 = gy.a(list5.get(i6), m7554copyZbe2FdA$default, arrayList4, i6, 1)) {
        }
        final SheetState sheetState = this.$sheetState;
        final iy iyVar = this.$sheetOffset;
        return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, i2, null, new ky() { // from class: androidx.compose.material3.g
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$12;
                measure_3p2s80s$lambda$12 = BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.measure_3p2s80s$lambda$12(arrayList, m7564getMaxWidthimpl, arrayList4, sheetState, iyVar, i2, arrayList3, arrayList2, intValue, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$12;
            }
        }, 4, null);
    }
}
