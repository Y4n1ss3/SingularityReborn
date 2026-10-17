package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import defpackage.a10;
import defpackage.gj;
import defpackage.gy;
import defpackage.j50;
import defpackage.p01;
import defpackage.un;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;
    private Animatable<Integer, AnimationVector1D> animatable;
    private final AnimationSpec<Integer> animationSpec;
    private Integer initialOffset;
    private final un scope;

    public SegmentedButtonContentMeasurePolicy(un unVar, AnimationSpec<Integer> animationSpec) {
        this.scope = unVar;
        this.animationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$8(List list, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i, List list2, int i2, Placeable.PlacementScope placementScope) {
        float f;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, j50.c(i2, 2, placeable), 0.0f, 4, null);
        }
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m2356getIconSizeD9Ej5fM());
        f = SegmentedButtonKt.IconSpacing;
        int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(f) + mo361roundToPx0680j_4;
        Animatable<Integer, AnimationVector1D> animatable = segmentedButtonContentMeasurePolicy.animatable;
        int intValue = mo361roundToPx0680j_42 + (animatable != null ? animatable.getValue().intValue() : i);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable placeable2 = (Placeable) list2.get(i4);
            Placeable.PlacementScope.place$default(placementScope, placeable2, intValue, j50.c(i2, 2, placeable2), 0.0f, 4, null);
        }
        return w01.a;
    }

    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    public final AnimationSpec<Integer> getAnimationSpec() {
        return this.animationSpec;
    }

    public final un getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo709measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        float f;
        float f2;
        int i = 0;
        List<? extends Measurable> list2 = list.get(0);
        int i2 = 1;
        List<? extends Measurable> list3 = list.get(1);
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            i3 = gy.a(list2.get(i3), j, arrayList, i3, 1);
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i4);
                    int width2 = ((Placeable) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
                    }
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size3 = list3.size();
        int i5 = 0;
        while (i5 < size3) {
            ArrayList arrayList3 = arrayList2;
            i5 = gy.a(list3.get(i5), j, arrayList3, i5, 1);
            arrayList2 = arrayList3;
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int width4 = ((Placeable) obj2).getWidth();
            int size4 = arrayList2.size() - 1;
            if (1 <= size4) {
                int i6 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i6);
                    int width5 = ((Placeable) obj5).getWidth();
                    if (width4 < width5) {
                        obj2 = obj5;
                        width4 = width5;
                    }
                    if (i6 == size4) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer valueOf = placeable2 != null ? Integer.valueOf(placeable2.getWidth()) : null;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int height = ((Placeable) obj3).getHeight();
            int size5 = arrayList2.size() - 1;
            if (1 <= size5) {
                while (true) {
                    Object obj6 = arrayList2.get(i2);
                    int height2 = ((Placeable) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i2 == size5) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int height3 = placeable3 != null ? placeable3.getHeight() : 0;
        SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.INSTANCE;
        int max = Math.max(measureScope.mo361roundToPx0680j_4(segmentedButtonDefaults.m2356getIconSizeD9Ej5fM()), width3);
        f = SegmentedButtonKt.IconSpacing;
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(f) + max + (valueOf != null ? valueOf.intValue() : 0);
        if (width3 == 0) {
            int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(segmentedButtonDefaults.m2356getIconSizeD9Ej5fM());
            f2 = SegmentedButtonKt.IconSpacing;
            i = (-(measureScope.mo361roundToPx0680j_4(f2) + mo361roundToPx0680j_42)) / 2;
        }
        int i7 = i;
        Integer num = this.initialOffset;
        if (num == null) {
            this.initialOffset = Integer.valueOf(i7);
        } else {
            Animatable<Integer, AnimationVector1D> animatable = this.animatable;
            if (animatable == null) {
                Animatable<Integer, AnimationVector1D> animatable2 = new Animatable<>(num, VectorConvertersKt.getVectorConverter(a10.a), null, null, 12, null);
                this.animatable = animatable2;
                animatable = animatable2;
            }
            if (animatable.getTargetValue().intValue() != i7) {
                p01.t(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i7, this, null), 3);
            }
        }
        return MeasureScope.layout$default(measureScope, mo361roundToPx0680j_4, height3, null, new gj(arrayList, measureScope, this, i7, arrayList2, height3), 4, null);
    }

    public final void setAnimatable(Animatable<Integer, AnimationVector1D> animatable) {
        this.animatable = animatable;
    }
}
