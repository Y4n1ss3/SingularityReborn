package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotMutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotState_androidKt {
    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(t, snapshotMutationPolicy);
    }
}
