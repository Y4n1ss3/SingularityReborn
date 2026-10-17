package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.j50;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TopAppBarMeasurePolicy implements MeasurePolicy {
    private final float height;
    private final FloatProducer scrolledOffset;
    private final int titleBottomPadding;
    private final Alignment.Horizontal titleHorizontalAlignment;
    private final Arrangement.Vertical titleVerticalArrangement;

    private TopAppBarMeasurePolicy(FloatProducer floatProducer, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i, float f) {
        this.scrolledOffset = floatProducer;
        this.titleVerticalArrangement = vertical;
        this.titleHorizontalAlignment = horizontal;
        this.titleBottomPadding = i;
        this.height = f;
    }

    /* renamed from: placeTopAppBar-mpW86Vk, reason: not valid java name */
    private final MeasureResult m2824placeTopAppBarmpW86Vk(final MeasureScope measureScope, final long j, final int i, final int i2, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final int i3) {
        return MeasureScope.layout$default(measureScope, Constraints.m7564getMaxWidthimpl(j), i, null, new ky() { // from class: androidx.compose.material3.u1
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 placeTopAppBar_mpW86Vk$lambda$8;
                placeTopAppBar_mpW86Vk$lambda$8 = TopAppBarMeasurePolicy.placeTopAppBar_mpW86Vk$lambda$8(Placeable.this, i, placeable2, placeable3, j, measureScope, this, i3, i2, (Placeable.PlacementScope) obj);
                return placeTopAppBar_mpW86Vk$lambda$8;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w01 placeTopAppBar_mpW86Vk$lambda$8(Placeable placeable, int i, Placeable placeable2, Placeable placeable3, long j, MeasureScope measureScope, TopAppBarMeasurePolicy topAppBarMeasurePolicy, int i2, int i3, Placeable.PlacementScope placementScope) {
        float f;
        int m7564getMaxWidthimpl;
        Arrangement.Vertical vertical;
        Arrangement arrangement;
        int i4;
        int height;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, j50.c(i, 2, placeable), 0.0f, 4, null);
        f = AppBarKt.TopAppBarTitleInset;
        int max = Math.max(measureScope.mo361roundToPx0680j_4(f), placeable.getWidth());
        int width = placeable3.getWidth();
        int align = topAppBarMeasurePolicy.titleHorizontalAlignment.align(placeable2.getWidth(), Constraints.m7564getMaxWidthimpl(j), LayoutDirection.Ltr);
        if (align >= max) {
            if (placeable2.getWidth() + align > Constraints.m7564getMaxWidthimpl(j) - width) {
                m7564getMaxWidthimpl = (Constraints.m7564getMaxWidthimpl(j) - width) - (placeable2.getWidth() + align);
            }
            int i5 = align;
            vertical = topAppBarMeasurePolicy.titleVerticalArrangement;
            arrangement = Arrangement.INSTANCE;
            if (!q10.b(vertical, arrangement.getCenter())) {
                height = j50.c(i, 2, placeable2);
            } else {
                if (!q10.b(vertical, arrangement.getBottom())) {
                    i4 = 0;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i5, i4, 0.0f, 4, null);
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, Constraints.m7564getMaxWidthimpl(j) - placeable3.getWidth(), j50.c(i, 2, placeable3), 0.0f, 4, null);
                    return w01.a;
                }
                int i6 = topAppBarMeasurePolicy.titleBottomPadding;
                if (i6 == 0) {
                    height = i - placeable2.getHeight();
                } else {
                    int height2 = i6 - (placeable2.getHeight() - i2);
                    int height3 = placeable2.getHeight() + height2;
                    if (height3 > i3) {
                        height2 -= height3 - i3;
                    }
                    height = (i - placeable2.getHeight()) - Math.max(0, height2);
                }
            }
            i4 = height;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i5, i4, 0.0f, 4, null);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, Constraints.m7564getMaxWidthimpl(j) - placeable3.getWidth(), j50.c(i, 2, placeable3), 0.0f, 4, null);
            return w01.a;
        }
        m7564getMaxWidthimpl = max - align;
        align += m7564getMaxWidthimpl;
        int i52 = align;
        vertical = topAppBarMeasurePolicy.titleVerticalArrangement;
        arrangement = Arrangement.INSTANCE;
        if (!q10.b(vertical, arrangement.getCenter())) {
        }
        i4 = height;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i52, i4, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, Constraints.m7564getMaxWidthimpl(j) - placeable3.getWidth(), j50.c(i, 2, placeable3), 0.0f, 4, null);
        return w01.a;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2825getHeightD9Ej5fM() {
        return this.height;
    }

    public final FloatProducer getScrolledOffset() {
        return this.scrolledOffset;
    }

    public final int getTitleBottomPadding() {
        return this.titleBottomPadding;
    }

    public final Alignment.Horizontal getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    public final Arrangement.Vertical getTitleVerticalArrangement() {
        return this.titleVerticalArrangement;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        int mo361roundToPx0680j_4 = intrinsicMeasureScope.mo361roundToPx0680j_4(this.height);
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
        return Math.max(mo361roundToPx0680j_4, valueOf != null ? valueOf.intValue() : 0);
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
        int m7564getMaxWidthimpl;
        int i;
        MeasureScope measureScope2;
        int i2;
        TopAppBarMeasurePolicy topAppBarMeasurePolicy = this;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable = list.get(i3);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = list.get(i4);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                        Placeable mo6234measureBRTryo02 = measurable2.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                        if (Constraints.m7564getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                            m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
                        } else {
                            m7564getMaxWidthimpl = (Constraints.m7564getMaxWidthimpl(j) - mo6234measureBRTryo0.getWidth()) - mo6234measureBRTryo02.getWidth();
                            if (m7564getMaxWidthimpl < 0) {
                                m7564getMaxWidthimpl = 0;
                            }
                        }
                        int i5 = m7564getMaxWidthimpl;
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Measurable measurable3 = list.get(i6);
                            if (q10.b(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                Placeable mo6234measureBRTryo03 = measurable3.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, i5, 0, 0, 12, null));
                                int i7 = mo6234measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? mo6234measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                float invoke = topAppBarMeasurePolicy.scrolledOffset.invoke();
                                int P = Float.isNaN(invoke) ? 0 : y80.P(invoke);
                                int max = Math.max(measureScope.mo361roundToPx0680j_4(topAppBarMeasurePolicy.height), mo6234measureBRTryo03.getHeight());
                                if (Constraints.m7563getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                                    i = max;
                                    measureScope2 = measureScope;
                                    i2 = i;
                                } else {
                                    int i8 = P + max;
                                    i = i8 >= 0 ? i8 : 0;
                                    measureScope2 = measureScope;
                                    i2 = max;
                                }
                                return topAppBarMeasurePolicy.m2824placeTopAppBarmpW86Vk(measureScope2, j, i, i2, mo6234measureBRTryo0, mo6234measureBRTryo03, mo6234measureBRTryo02, i7);
                            }
                            i6++;
                            topAppBarMeasurePolicy = this;
                        }
                        throw k4.m("Collection contains no element matching the predicate.");
                    }
                    i4++;
                    topAppBarMeasurePolicy = this;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i3++;
            topAppBarMeasurePolicy = this;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        int mo361roundToPx0680j_4 = intrinsicMeasureScope.mo361roundToPx0680j_4(this.height);
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
        return Math.max(mo361roundToPx0680j_4, valueOf != null ? valueOf.intValue() : 0);
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

    public /* synthetic */ TopAppBarMeasurePolicy(FloatProducer floatProducer, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i, float f, dq dqVar) {
        this(floatProducer, vertical, horizontal, i, f);
    }
}
