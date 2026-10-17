package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.j50;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $dismissActionTag;
    final /* synthetic */ String $textTag;

    public SnackbarKt$OneRowSnackbar$2$1(String str, String str2, String str3) {
        this.$actionTag = str;
        this.$dismissActionTag = str2;
        this.$textTag = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$4(Placeable placeable, int i, Placeable placeable2, int i2, int i3, Placeable placeable3, int i4, int i5, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2, i3, 0.0f, 4, null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i4, i5, 0.0f, 4, null);
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        float f;
        Measurable measurable;
        Measurable measurable2;
        int i;
        float f2;
        int mo361roundToPx0680j_4;
        int max;
        int c;
        int i2;
        float f3;
        MeasureScope measureScope2 = measureScope;
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        f = SnackbarKt.ContainerMaxWidth;
        int min = Math.min(m7564getMaxWidthimpl, measureScope2.mo361roundToPx0680j_4(f));
        String str = this.$actionTag;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i3);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), str)) {
                break;
            }
            i3++;
        }
        Measurable measurable3 = measurable;
        Placeable mo6234measureBRTryo0 = measurable3 != null ? measurable3.mo6234measureBRTryo0(j) : null;
        String str2 = this.$dismissActionTag;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i4);
            if (q10.b(LayoutIdKt.getLayoutId(measurable2), str2)) {
                break;
            }
            i4++;
        }
        Measurable measurable4 = measurable2;
        final Placeable mo6234measureBRTryo02 = measurable4 != null ? measurable4.mo6234measureBRTryo0(j) : null;
        int width = mo6234measureBRTryo0 != null ? mo6234measureBRTryo0.getWidth() : 0;
        int height = mo6234measureBRTryo0 != null ? mo6234measureBRTryo0.getHeight() : 0;
        int width2 = mo6234measureBRTryo02 != null ? mo6234measureBRTryo02.getWidth() : 0;
        int height2 = mo6234measureBRTryo02 != null ? mo6234measureBRTryo02.getHeight() : 0;
        if (width2 == 0) {
            f3 = SnackbarKt.TextEndExtraSpacing;
            i = measureScope2.mo361roundToPx0680j_4(f3);
        } else {
            i = 0;
        }
        int i5 = ((min - width) - width2) - i;
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        if (i5 < m7566getMinWidthimpl) {
            i5 = m7566getMinWidthimpl;
        }
        String str3 = this.$textTag;
        int size3 = list.size();
        int i6 = 0;
        while (i6 < size3) {
            Measurable measurable5 = list.get(i6);
            if (q10.b(LayoutIdKt.getLayoutId(measurable5), str3)) {
                int i7 = height2;
                final Placeable mo6234measureBRTryo03 = measurable5.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, i5, 0, 0, 9, null));
                int i8 = mo6234measureBRTryo03.get(AlignmentLineKt.getFirstBaseline());
                int i9 = mo6234measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
                boolean z = true;
                boolean z2 = (i8 == Integer.MIN_VALUE || i9 == Integer.MIN_VALUE) ? false : true;
                if (i8 != i9 && z2) {
                    z = false;
                }
                final int i10 = min - width2;
                final int i11 = i10 - width;
                if (z) {
                    max = Math.max(measureScope2.mo361roundToPx0680j_4(SnackbarTokens.INSTANCE.m3639getSingleLineContainerHeightD9Ej5fM()), Math.max(height, i7));
                    mo361roundToPx0680j_4 = j50.c(max, 2, mo6234measureBRTryo03);
                    if (mo6234measureBRTryo0 != null && (i2 = mo6234measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) != Integer.MIN_VALUE) {
                        c = (i8 + mo361roundToPx0680j_4) - i2;
                    }
                    c = 0;
                } else {
                    f2 = SnackbarKt.HeightToFirstLine;
                    mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(f2) - i8;
                    max = Math.max(measureScope2.mo361roundToPx0680j_4(SnackbarTokens.INSTANCE.m3640getTwoLinesContainerHeightD9Ej5fM()), mo6234measureBRTryo03.getHeight() + mo361roundToPx0680j_4);
                    if (mo6234measureBRTryo0 != null) {
                        c = j50.c(max, 2, mo6234measureBRTryo0);
                    }
                    c = 0;
                }
                final int i12 = c;
                int i13 = max;
                final int i14 = mo361roundToPx0680j_4;
                final int c2 = mo6234measureBRTryo02 != null ? j50.c(i13, 2, mo6234measureBRTryo02) : 0;
                final Placeable placeable = mo6234measureBRTryo0;
                return MeasureScope.layout$default(measureScope2, min, i13, null, new ky() { // from class: androidx.compose.material3.e1
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 measure_3p2s80s$lambda$4;
                        measure_3p2s80s$lambda$4 = SnackbarKt$OneRowSnackbar$2$1.measure_3p2s80s$lambda$4(Placeable.this, i14, mo6234measureBRTryo02, i10, c2, placeable, i11, i12, (Placeable.PlacementScope) obj);
                        return measure_3p2s80s$lambda$4;
                    }
                }, 4, null);
            }
            i6++;
            height2 = height2;
            measureScope2 = measureScope;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }
}
