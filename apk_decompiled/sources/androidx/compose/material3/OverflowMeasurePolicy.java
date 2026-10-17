package androidx.compose.material3;

import androidx.compose.material3.OverflowMeasurePolicy;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.dq;
import defpackage.gy;
import defpackage.ky;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OverflowMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;
    private final boolean isVertical;
    private final int maxItemCount;
    private final AppBarOverflowState overflowState;

    public OverflowMeasurePolicy(AppBarOverflowState appBarOverflowState, int i, boolean z) {
        this.overflowState = appBarOverflowState;
        this.maxItemCount = i;
        this.isVertical = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$11(List list, List list2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Placeable placeable = (Placeable) list.get(i);
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, 0, i2, 0.0f, 4, null);
            i2 += placeable.getHeight();
            i++;
            placementScope = placementScope2;
        }
        Placeable.PlacementScope placementScope3 = placementScope;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Placeable.PlacementScope.placeRelative$default(placementScope3, (Placeable) list2.get(i3), 0, i2, 0.0f, 4, null);
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$14(List list, List list2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Placeable placeable = (Placeable) list.get(i);
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, i2, 0, 0.0f, 4, null);
            i2 += placeable.getWidth();
            i++;
            placementScope = placementScope2;
        }
        Placeable.PlacementScope placementScope3 = placementScope;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Placeable.PlacementScope.placeRelative$default(placementScope3, (Placeable) list2.get(i3), i2, 0, 0.0f, 4, null);
            }
        }
        return w01.a;
    }

    public final int getMaxItemCount() {
        return this.maxItemCount;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo709measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        Integer valueOf;
        int intValue;
        int i;
        final ArrayList arrayList;
        final ArrayList arrayList2;
        Integer valueOf2;
        int intValue2;
        Integer valueOf3;
        int i2;
        int max;
        Integer num;
        Integer valueOf4;
        int i3;
        Integer num2;
        Integer valueOf5;
        long m7554copyZbe2FdA$default;
        Integer valueOf6;
        final int i4 = 0;
        long m7554copyZbe2FdA$default2 = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list.get(0);
        int i5 = 1;
        List<? extends Measurable> list3 = list.get(1);
        this.overflowState.setTotalItemCount(list2.size());
        if (this.isVertical) {
            if (list3.isEmpty()) {
                valueOf6 = null;
            } else {
                valueOf6 = Integer.valueOf(list3.get(0).maxIntrinsicHeight(Constraints.m7564getMaxWidthimpl(j)));
                int size = list3.size() - 1;
                if (1 <= size) {
                    int i6 = 1;
                    while (true) {
                        Integer valueOf7 = Integer.valueOf(list3.get(i6).maxIntrinsicHeight(Constraints.m7564getMaxWidthimpl(j)));
                        if (valueOf7.compareTo(valueOf6) > 0) {
                            valueOf6 = valueOf7;
                        }
                        if (i6 == size) {
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (valueOf6 != null) {
                intValue = valueOf6.intValue();
            }
            intValue = 0;
        } else {
            if (list3.isEmpty()) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(list3.get(0).maxIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)));
                int size2 = list3.size() - 1;
                if (1 <= size2) {
                    int i7 = 1;
                    while (true) {
                        Integer valueOf8 = Integer.valueOf(list3.get(i7).maxIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)));
                        if (valueOf8.compareTo(valueOf) > 0) {
                            valueOf = valueOf8;
                        }
                        if (i7 == size2) {
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            }
            intValue = 0;
        }
        int subtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(this.isVertical ? Constraints.m7563getMaxHeightimpl(j) : Constraints.m7564getMaxWidthimpl(j), intValue);
        ArrayList arrayList3 = new ArrayList();
        int size3 = list2.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= size3) {
                i = i5;
                break;
            }
            Placeable mo6234measureBRTryo0 = list2.get(i8).mo6234measureBRTryo0(m7554copyZbe2FdA$default2);
            i = i5;
            int i10 = i8 == list2.size() + (-1) ? i : 0;
            if (i10 == 0 && i8 == this.maxItemCount - 1) {
                break;
            }
            int height = this.isVertical ? mo6234measureBRTryo0.getHeight() : mo6234measureBRTryo0.getWidth();
            if (height > subtractConstraintSafely && (i10 == 0 || height > subtractConstraintSafely + intValue)) {
                break;
            }
            arrayList3.add(mo6234measureBRTryo0);
            i9 += height;
            subtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(subtractConstraintSafely, height);
            i8++;
            i5 = i;
        }
        this.overflowState.setVisibleItemCount(arrayList3.size());
        if (arrayList3.size() != list2.size()) {
            if (this.isVertical) {
                arrayList = arrayList3;
                m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(m7554copyZbe2FdA$default2, 0, 0, 0, subtractConstraintSafely + intValue, 7, null);
            } else {
                arrayList = arrayList3;
                m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(m7554copyZbe2FdA$default2, 0, subtractConstraintSafely + intValue, 0, 0, 13, null);
            }
            long j2 = m7554copyZbe2FdA$default;
            arrayList2 = new ArrayList(list3.size());
            int size4 = list3.size();
            for (int i11 = 0; i11 < size4; i11 = gy.a(list3.get(i11), j2, arrayList2, i11, i)) {
            }
        } else {
            arrayList = arrayList3;
            arrayList2 = null;
        }
        int i12 = i;
        if (this.isVertical) {
            if (arrayList2 != null) {
                if (arrayList2.isEmpty()) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                    int size5 = arrayList2.size() - i12;
                    if (i12 <= size5) {
                        int i13 = i12;
                        while (true) {
                            Integer valueOf9 = Integer.valueOf(((Placeable) arrayList2.get(i13)).getHeight());
                            if (valueOf9.compareTo(valueOf5) > 0) {
                                valueOf5 = valueOf9;
                            }
                            if (i13 == size5) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
                if (valueOf5 != null) {
                    intValue2 = valueOf5.intValue();
                }
            }
            intValue2 = 0;
        } else {
            if (arrayList2 != null) {
                if (arrayList2.isEmpty()) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(((Placeable) arrayList2.get(0)).getWidth());
                    int size6 = arrayList2.size() - i12;
                    if (i12 <= size6) {
                        int i14 = i12;
                        while (true) {
                            Integer valueOf10 = Integer.valueOf(((Placeable) arrayList2.get(i14)).getWidth());
                            if (valueOf10.compareTo(valueOf2) > 0) {
                                valueOf2 = valueOf10;
                            }
                            if (i14 == size6) {
                                break;
                            }
                            i14++;
                        }
                    }
                }
                if (valueOf2 != null) {
                    intValue2 = valueOf2.intValue();
                }
            }
            intValue2 = 0;
        }
        int i15 = i9 + intValue2;
        if (this.isVertical) {
            if (arrayList.isEmpty()) {
                valueOf4 = null;
            } else {
                valueOf4 = Integer.valueOf(((Placeable) arrayList.get(0)).getWidth());
                int size7 = arrayList.size() - i12;
                if (i12 <= size7) {
                    Integer num3 = valueOf4;
                    int i16 = i12;
                    while (true) {
                        Integer valueOf11 = Integer.valueOf(((Placeable) arrayList.get(i16)).getWidth());
                        if (valueOf11.compareTo(num3) > 0) {
                            num3 = valueOf11;
                        }
                        if (i16 == size7) {
                            break;
                        }
                        i16++;
                    }
                    valueOf4 = num3;
                }
            }
            int intValue3 = valueOf4 != null ? valueOf4.intValue() : 0;
            if (arrayList2 != null) {
                if (arrayList2.isEmpty()) {
                    num2 = null;
                } else {
                    Integer valueOf12 = Integer.valueOf(((Placeable) arrayList2.get(0)).getWidth());
                    int size8 = arrayList2.size() - i12;
                    if (i12 <= size8) {
                        while (true) {
                            Integer valueOf13 = Integer.valueOf(((Placeable) arrayList2.get(i12)).getWidth());
                            if (valueOf13.compareTo(valueOf12) > 0) {
                                valueOf12 = valueOf13;
                            }
                            if (i12 == size8) {
                                break;
                            }
                            i12++;
                        }
                    }
                    num2 = valueOf12;
                }
                if (num2 != null) {
                    i3 = num2.intValue();
                    max = Math.max(intValue3, i3);
                }
            }
            i3 = 0;
            max = Math.max(intValue3, i3);
        } else {
            if (arrayList.isEmpty()) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(((Placeable) arrayList.get(0)).getHeight());
                int size9 = arrayList.size() - i12;
                if (i12 <= size9) {
                    Integer num4 = valueOf3;
                    int i17 = i12;
                    while (true) {
                        Integer valueOf14 = Integer.valueOf(((Placeable) arrayList.get(i17)).getHeight());
                        if (valueOf14.compareTo(num4) > 0) {
                            num4 = valueOf14;
                        }
                        if (i17 == size9) {
                            break;
                        }
                        i17++;
                    }
                    valueOf3 = num4;
                }
            }
            int intValue4 = valueOf3 != null ? valueOf3.intValue() : 0;
            if (arrayList2 != null) {
                if (arrayList2.isEmpty()) {
                    num = null;
                } else {
                    Integer valueOf15 = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                    int size10 = arrayList2.size() - i12;
                    if (i12 <= size10) {
                        while (true) {
                            Integer valueOf16 = Integer.valueOf(((Placeable) arrayList2.get(i12)).getHeight());
                            if (valueOf16.compareTo(valueOf15) > 0) {
                                valueOf15 = valueOf16;
                            }
                            if (i12 == size10) {
                                break;
                            }
                            i12++;
                        }
                    }
                    num = valueOf15;
                }
                if (num != null) {
                    i2 = num.intValue();
                    max = Math.max(intValue4, i2);
                }
            }
            i2 = 0;
            max = Math.max(intValue4, i2);
        }
        if (this.isVertical) {
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m7581constrainWidthK40F9xA(j, max), ConstraintsKt.m7580constrainHeightK40F9xA(j, i15), null, new ky() { // from class: ie0
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 measure_3p2s80s$lambda$11;
                    w01 measure_3p2s80s$lambda$14;
                    int i18 = i4;
                    List list4 = arrayList2;
                    ArrayList arrayList4 = arrayList;
                    Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                    switch (i18) {
                        case 0:
                            measure_3p2s80s$lambda$11 = OverflowMeasurePolicy.measure_3p2s80s$lambda$11(arrayList4, list4, placementScope);
                            return measure_3p2s80s$lambda$11;
                        default:
                            measure_3p2s80s$lambda$14 = OverflowMeasurePolicy.measure_3p2s80s$lambda$14(arrayList4, list4, placementScope);
                            return measure_3p2s80s$lambda$14;
                    }
                }
            }, 4, null);
        }
        final int i18 = 1;
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m7581constrainWidthK40F9xA(j, i15), ConstraintsKt.m7580constrainHeightK40F9xA(j, max), null, new ky() { // from class: ie0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$11;
                w01 measure_3p2s80s$lambda$14;
                int i182 = i18;
                List list4 = arrayList2;
                ArrayList arrayList4 = arrayList;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                switch (i182) {
                    case 0:
                        measure_3p2s80s$lambda$11 = OverflowMeasurePolicy.measure_3p2s80s$lambda$11(arrayList4, list4, placementScope);
                        return measure_3p2s80s$lambda$11;
                    default:
                        measure_3p2s80s$lambda$14 = OverflowMeasurePolicy.measure_3p2s80s$lambda$14(arrayList4, list4, placementScope);
                        return measure_3p2s80s$lambda$14;
                }
            }
        }, 4, null);
    }

    public /* synthetic */ OverflowMeasurePolicy(AppBarOverflowState appBarOverflowState, int i, boolean z, int i2, dq dqVar) {
        this(appBarOverflowState, i, (i2 & 4) != 0 ? false : z);
    }
}
