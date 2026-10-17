package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface SnapshotMutationPolicy<T> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T merge(SnapshotMutationPolicy<T> snapshotMutationPolicy, T t, T t2, T t3) {
            return (T) SnapshotMutationPolicy.super.merge(t, t2, t3);
        }
    }

    boolean equivalent(T t, T t2);

    default T merge(T t, T t2, T t3) {
        return null;
    }
}
