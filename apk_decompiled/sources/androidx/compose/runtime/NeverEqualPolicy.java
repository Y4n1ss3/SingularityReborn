package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class NeverEqualPolicy implements SnapshotMutationPolicy<Object> {
    public static final NeverEqualPolicy INSTANCE = new NeverEqualPolicy();

    private NeverEqualPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}
