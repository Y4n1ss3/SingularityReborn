package androidx.compose.runtime;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;
    private final SnapshotMutationPolicy<T> policy;

    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy<T> snapshotMutationPolicy, iy iyVar) {
        super(iyVar);
        this.policy = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public ProvidedValue<T> defaultProvidedValue$runtime(T t) {
        return new ProvidedValue<>(this, t, t == null, this.policy, null, null, true);
    }
}
