package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface SnapshotMutableState<T> extends MutableState<T> {
    SnapshotMutationPolicy<T> getPolicy();
}
