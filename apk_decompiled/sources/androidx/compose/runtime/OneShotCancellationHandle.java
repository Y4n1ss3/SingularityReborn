package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicBoolean;
import androidx.compose.runtime.internal.AtomicInt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OneShotCancellationHandle implements CancellationHandle {
    public static final int $stable = 8;
    private final iy action;
    private final AtomicInt didFireCancellation = AtomicBoolean.m4114constructorimpl(false);

    public OneShotCancellationHandle(iy iyVar) {
        this.action = iyVar;
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        if (AtomicBoolean.m4119getAndSetimpl(this.didFireCancellation, true)) {
            return;
        }
        this.action.invoke();
    }
}
