package androidx.compose.ui.platform;

import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import defpackage.iy;
import defpackage.q10;
import defpackage.ty;
import defpackage.uy;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class Wrapper_androidKt$setContent$1 implements LifecycleRetainedValuesStoreOwner.FrameEndScheduler, uy {
    final /* synthetic */ CompositionContext $tmp0;

    public Wrapper_androidKt$setContent$1(CompositionContext compositionContext) {
        this.$tmp0 = compositionContext;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof LifecycleRetainedValuesStoreOwner.FrameEndScheduler) && (obj instanceof uy)) {
            return q10.b(getFunctionDelegate(), ((uy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.uy
    public final ty getFunctionDelegate() {
        return new xy(1, this.$tmp0, CompositionContext.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler
    public final CancellationHandle scheduleFrameEndCallback(iy iyVar) {
        return this.$tmp0.scheduleFrameEndCallback(iyVar);
    }
}
