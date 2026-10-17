package androidx.compose.ui.layout;

import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MultiContentMeasurePolicyImpl implements MeasurePolicy {
    public static final int $stable = 0;
    private final MultiContentMeasurePolicy measurePolicy;

    public MultiContentMeasurePolicyImpl(MultiContentMeasurePolicy multiContentMeasurePolicy) {
        this.measurePolicy = multiContentMeasurePolicy;
    }

    public static /* synthetic */ MultiContentMeasurePolicyImpl copy$default(MultiContentMeasurePolicyImpl multiContentMeasurePolicyImpl, MultiContentMeasurePolicy multiContentMeasurePolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            multiContentMeasurePolicy = multiContentMeasurePolicyImpl.measurePolicy;
        }
        return multiContentMeasurePolicyImpl.copy(multiContentMeasurePolicy);
    }

    public final MultiContentMeasurePolicy component1() {
        return this.measurePolicy;
    }

    public final MultiContentMeasurePolicyImpl copy(MultiContentMeasurePolicy multiContentMeasurePolicy) {
        return new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiContentMeasurePolicyImpl) && q10.b(this.measurePolicy, ((MultiContentMeasurePolicyImpl) obj).measurePolicy);
    }

    public final MultiContentMeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public int hashCode() {
        return this.measurePolicy.hashCode();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return this.measurePolicy.maxIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return this.measurePolicy.maxIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return this.measurePolicy.mo709measure3p2s80s(measureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(measureScope), j);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return this.measurePolicy.minIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return this.measurePolicy.minIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.measurePolicy + ')';
    }
}
