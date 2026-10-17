package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.iy;
import defpackage.ky;
import defpackage.yn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class SnapshotFlowManagerImpl {
    public static final int $stable = 8;
    private final Object lock = new Object();

    public abstract void clearWatchSet$runtime(yn0 yn0Var);

    public abstract void commitSubscriptionChanges$runtime();

    public abstract void dispose$runtime();

    public final Object getLock() {
        return this.lock;
    }

    public abstract ky readObserverFor$runtime(yn0 yn0Var);

    public abstract void reportSnapshotFlowCancellation$runtime(yn0 yn0Var);

    public final <T> T runAndWatch$runtime(yn0 yn0Var, iy iyVar) {
        Snapshot takeSnapshot = Snapshot.Companion.takeSnapshot(readObserverFor$runtime(yn0Var));
        clearWatchSet$runtime(yn0Var);
        try {
            Snapshot makeCurrent = takeSnapshot.makeCurrent();
            try {
                T t = (T) iyVar.invoke();
                takeSnapshot.dispose();
                commitSubscriptionChanges$runtime();
                return t;
            } finally {
                takeSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            takeSnapshot.dispose();
            throw th;
        }
    }

    public abstract void watch$runtime(yn0 yn0Var, Object obj);
}
