package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.j50;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 implements MeasurePolicy {
    public static final TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 INSTANCE = new TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$3(boolean z, int i, Placeable placeable, int i2, Placeable placeable2, int i3, int i4, int i5, MeasureScope measureScope, Placeable placeable3, int i6, int i7, int i8, int i9, Placeable.PlacementScope placementScope) {
        if (z) {
            int height = i4 - ((placeable2.getHeight() + ((placeable.getHeight() + i) + i2)) + i3);
            int mo361roundToPx0680j_4 = i4 >= i5 ? measureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(16.0f)) : 0;
            Placeable.PlacementScope.place$default(placementScope, placeable3, i6, i6, 0.0f, 4, null);
            int i10 = height / 2;
            int i11 = i + i10;
            Placeable.PlacementScope.place$default(placementScope, placeable, i7, i11, 0.0f, 4, null);
            Placeable.PlacementScope.place$default(placementScope, placeable2, i7, (((placeable.getHeight() + i11) + i2) - mo361roundToPx0680j_4) + i10, 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(placementScope, placeable3, i6, i8, 0.0f, 4, null);
            int p = j50.p(i9, 2, placeable);
            int height2 = placeable3.getHeight() + i8;
            Placeable.PlacementScope.place$default(placementScope, placeable, p, height2, 0.0f, 4, null);
            Placeable.PlacementScope.place$default(placementScope, placeable2, j50.p(i9, 2, placeable2), placeable.getHeight() + height2, 0.0f, 4, null);
        }
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult mo5measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        boolean z;
        final boolean z2;
        int height;
        MeasureScope measureScope2 = measureScope;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = list.get(i2);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), "title")) {
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable2), "timePickerContent")) {
                        int size3 = list.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Measurable measurable3 = list.get(i4);
                            if (q10.b(LayoutIdKt.getLayoutId(measurable3), "actions")) {
                                final int mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(24.0f));
                                final int mo361roundToPx0680j_42 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(384.0f));
                                final int mo361roundToPx0680j_43 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(24.0f));
                                final int mo361roundToPx0680j_44 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(16.0f));
                                final int mo361roundToPx0680j_45 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(4.0f));
                                final int mo361roundToPx0680j_46 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(8.0f));
                                final int mo361roundToPx0680j_47 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(24.0f));
                                int mo361roundToPx0680j_48 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(24.0f));
                                final Placeable mo6234measureBRTryo0 = measurable2.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                if (mo6234measureBRTryo0.getWidth() > mo6234measureBRTryo0.getHeight()) {
                                    float height2 = mo6234measureBRTryo0.getHeight();
                                    float mo367toPx0680j_4 = measureScope2.mo367toPx0680j_4(TimePickerKt.getClockDialMinContainerSize());
                                    if (!Float.isNaN(mo367toPx0680j_4) && !Float.isInfinite(mo367toPx0680j_4)) {
                                        mo367toPx0680j_4 = (float) (mo367toPx0680j_4 > 0.0f ? Math.floor(mo367toPx0680j_4) : Math.ceil(mo367toPx0680j_4));
                                    }
                                    if (height2 >= mo367toPx0680j_4) {
                                        i = mo361roundToPx0680j_48;
                                        z = true;
                                        final int width = (mo361roundToPx0680j_4 * 2) + (!z ? mo6234measureBRTryo0.getWidth() : mo6234measureBRTryo0.getWidth());
                                        z2 = z;
                                        final Placeable mo6234measureBRTryo02 = measurable3.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, mo6234measureBRTryo0.getWidth(), 0, 0, 8, null));
                                        final Placeable mo6234measureBRTryo03 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, mo6234measureBRTryo0.getWidth(), 0, 0, 8, null));
                                        if (z2) {
                                            height = mo6234measureBRTryo02.getHeight() + mo6234measureBRTryo0.getHeight() + mo6234measureBRTryo03.getHeight() + mo361roundToPx0680j_47 + i;
                                        } else {
                                            height = mo6234measureBRTryo02.getHeight() + mo6234measureBRTryo0.getHeight() + mo361roundToPx0680j_46 + mo361roundToPx0680j_44 + mo361roundToPx0680j_45;
                                            if (Constraints.m7559getHasBoundedHeightimpl(j)) {
                                                height = Constraints.m7563getMaxHeightimpl(j);
                                            }
                                        }
                                        final int i5 = height;
                                        return MeasureScope.layout$default(measureScope, width, i5, null, new ky() { // from class: androidx.compose.material3.n1
                                            @Override // defpackage.ky
                                            public final Object invoke(Object obj) {
                                                w01 measure_3p2s80s$lambda$3;
                                                measure_3p2s80s$lambda$3 = TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1.measure_3p2s80s$lambda$3(z2, mo361roundToPx0680j_44, mo6234measureBRTryo0, mo361roundToPx0680j_45, mo6234measureBRTryo02, mo361roundToPx0680j_46, i5, mo361roundToPx0680j_42, measureScope, mo6234measureBRTryo03, mo361roundToPx0680j_43, mo361roundToPx0680j_4, mo361roundToPx0680j_47, width, (Placeable.PlacementScope) obj);
                                                return measure_3p2s80s$lambda$3;
                                            }
                                        }, 4, null);
                                    }
                                }
                                i = mo361roundToPx0680j_48;
                                z = false;
                                final int width2 = (mo361roundToPx0680j_4 * 2) + (!z ? mo6234measureBRTryo0.getWidth() : mo6234measureBRTryo0.getWidth());
                                z2 = z;
                                final Placeable mo6234measureBRTryo022 = measurable3.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, mo6234measureBRTryo0.getWidth(), 0, 0, 8, null));
                                final Placeable mo6234measureBRTryo032 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, mo6234measureBRTryo0.getWidth(), 0, 0, 8, null));
                                if (z2) {
                                }
                                final int i52 = height;
                                return MeasureScope.layout$default(measureScope, width2, i52, null, new ky() { // from class: androidx.compose.material3.n1
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj) {
                                        w01 measure_3p2s80s$lambda$3;
                                        measure_3p2s80s$lambda$3 = TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1.measure_3p2s80s$lambda$3(z2, mo361roundToPx0680j_44, mo6234measureBRTryo0, mo361roundToPx0680j_45, mo6234measureBRTryo022, mo361roundToPx0680j_46, i52, mo361roundToPx0680j_42, measureScope, mo6234measureBRTryo032, mo361roundToPx0680j_43, mo361roundToPx0680j_4, mo361roundToPx0680j_47, width2, (Placeable.PlacementScope) obj);
                                        return measure_3p2s80s$lambda$3;
                                    }
                                }, 4, null);
                            }
                            i4++;
                            measureScope2 = measureScope;
                        }
                        throw k4.m("Collection contains no element matching the predicate.");
                    }
                    i3++;
                    measureScope2 = measureScope;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i2++;
            measureScope2 = measureScope;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }
}
