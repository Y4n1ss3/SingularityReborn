package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface SnapshotObserver {
    default SnapshotInstanceObservers onPreCreate(Snapshot snapshot, boolean z) {
        return null;
    }

    default void onPreDispose(Snapshot snapshot) {
    }

    default void onApplied(Snapshot snapshot, Set<? extends Object> set) {
    }

    default void onCreated(Snapshot snapshot, Snapshot snapshot2, SnapshotInstanceObservers snapshotInstanceObservers) {
    }
}
