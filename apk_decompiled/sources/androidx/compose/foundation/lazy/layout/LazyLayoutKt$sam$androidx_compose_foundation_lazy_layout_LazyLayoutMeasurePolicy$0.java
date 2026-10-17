package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import defpackage.my;
import defpackage.q10;
import defpackage.ty;
import defpackage.uy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutKt$sam$androidx_compose_foundation_lazy_layout_LazyLayoutMeasurePolicy$0 implements LazyLayoutMeasurePolicy, uy {
    private final /* synthetic */ my function;

    public LazyLayoutKt$sam$androidx_compose_foundation_lazy_layout_LazyLayoutMeasurePolicy$0(my myVar) {
        this.function = myVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof LazyLayoutMeasurePolicy) && (obj instanceof uy)) {
            return q10.b(getFunctionDelegate(), ((uy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.uy
    public final ty getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw */
    public final /* synthetic */ MeasureResult mo861measure0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        return (MeasureResult) this.function.invoke(lazyLayoutMeasureScope, Constraints.m7551boximpl(j));
    }
}
