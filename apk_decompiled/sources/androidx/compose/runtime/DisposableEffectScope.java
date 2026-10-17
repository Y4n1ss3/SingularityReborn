package androidx.compose.runtime;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DisposableEffectScope {
    public static final int $stable = 0;

    public final DisposableEffectResult onDispose(final iy iyVar) {
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.DisposableEffectScope$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                iy.this.invoke();
            }
        };
    }
}
