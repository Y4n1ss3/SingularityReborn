package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.hi0;
import defpackage.ky;
import defpackage.w01;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogFlowRow$1$1 implements MeasurePolicy {
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ float $mainAxisSpacing;

    public AlertDialogKt$AlertDialogFlowRow$1$1(float f, float f2) {
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
    }

    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, hi0 hi0Var, MeasureScope measureScope, float f, long j, Placeable placeable) {
        if (list.isEmpty()) {
            return true;
        }
        return placeable.getWidth() + (measureScope.mo361roundToPx0680j_4(f) + hi0Var.d) <= Constraints.m7564getMaxWidthimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$4(List list, MeasureScope measureScope, float f, int i, List list2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list3 = (List) list.get(i2);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i3 = 0;
            while (i3 < size2) {
                iArr[i3] = ((Placeable) list3.get(i3)).getWidth() + (i3 < list3.size() + (-1) ? measureScope.mo361roundToPx0680j_4(f) : 0);
                i3++;
            }
            int[] iArr2 = new int[size2];
            Arrangement.INSTANCE.getEnd().arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Placeable.PlacementScope.place$default(placementScope, (Placeable) list3.get(i4), iArr2[i4], ((Number) list2.get(i2)).intValue(), 0.0f, 4, null);
            }
        }
        return w01.a;
    }

    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, hi0 hi0Var, MeasureScope measureScope, float f, List<Placeable> list2, List<Integer> list3, hi0 hi0Var2, List<Integer> list4, hi0 hi0Var3, hi0 hi0Var4) {
        if (!list.isEmpty()) {
            hi0Var.d = measureScope.mo361roundToPx0680j_4(f) + hi0Var.d;
        }
        list.add(0, yi.I0(list2));
        list3.add(Integer.valueOf(hi0Var2.d));
        list4.add(Integer.valueOf(hi0Var.d));
        hi0Var.d += hi0Var2.d;
        hi0Var3.d = Math.max(hi0Var3.d, hi0Var4.d);
        list2.clear();
        hi0Var4.d = 0;
        hi0Var2.d = 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        hi0 hi0Var = new hi0();
        hi0 hi0Var2 = new hi0();
        ArrayList arrayList4 = new ArrayList();
        hi0 hi0Var3 = new hi0();
        hi0 hi0Var4 = new hi0();
        float f = this.$mainAxisSpacing;
        float f2 = this.$crossAxisSpacing;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ArrayList arrayList5 = arrayList;
            hi0 hi0Var5 = hi0Var2;
            Placeable mo6234measureBRTryo0 = list.get(i).mo6234measureBRTryo0(j);
            int i2 = i;
            hi0 hi0Var6 = hi0Var3;
            hi0Var3 = hi0Var6;
            int i3 = size;
            if (measure_3p2s80s$canAddToCurrentSequence(arrayList4, hi0Var6, measureScope, f, j, mo6234measureBRTryo0)) {
                arrayList = arrayList5;
                hi0Var2 = hi0Var5;
            } else {
                arrayList = arrayList5;
                hi0Var2 = hi0Var5;
                measure_3p2s80s$startNewSequence(arrayList, hi0Var2, measureScope, f2, arrayList4, arrayList2, hi0Var4, arrayList3, hi0Var, hi0Var3);
            }
            if (!arrayList4.isEmpty()) {
                hi0Var3.d = measureScope.mo361roundToPx0680j_4(f) + hi0Var3.d;
            }
            arrayList4.add(mo6234measureBRTryo0);
            hi0Var3.d = mo6234measureBRTryo0.getWidth() + hi0Var3.d;
            hi0Var4.d = Math.max(hi0Var4.d, mo6234measureBRTryo0.getHeight());
            i = i2 + 1;
            size = i3;
        }
        if (!arrayList4.isEmpty()) {
            measure_3p2s80s$startNewSequence(arrayList, hi0Var2, measureScope, this.$crossAxisSpacing, arrayList4, arrayList2, hi0Var4, arrayList3, hi0Var, hi0Var3);
        }
        final int max = Math.max(hi0Var.d, Constraints.m7566getMinWidthimpl(j));
        int max2 = Math.max(hi0Var2.d, Constraints.m7565getMinHeightimpl(j));
        final float f3 = this.$mainAxisSpacing;
        return MeasureScope.layout$default(measureScope, max, max2, null, new ky() { // from class: androidx.compose.material3.a
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$4;
                measure_3p2s80s$lambda$4 = AlertDialogKt$AlertDialogFlowRow$1$1.measure_3p2s80s$lambda$4(arrayList, measureScope, f3, max, arrayList3, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$4;
            }
        }, 4, null);
    }
}
