package androidx.compose.runtime.retain;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RetainedEffectScope {
    public static final int $stable = 0;

    public final RetainedEffectResult onRetire(final iy iyVar) {
        return new RetainedEffectResult() { // from class: androidx.compose.runtime.retain.RetainedEffectScope$onRetire$1
            @Override // androidx.compose.runtime.retain.RetainedEffectResult
            public void retire() {
                iy.this.invoke();
            }
        };
    }
}
