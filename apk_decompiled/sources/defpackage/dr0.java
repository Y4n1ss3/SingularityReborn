package defpackage;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class dr0 implements ObserverHandle {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dr0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Snapshot.Companion.registerApplyObserver$lambda$1((my) obj);
                break;
            case 1:
                Snapshot.Companion.registerGlobalWriteObserver$lambda$1((ky) obj);
                break;
            default:
                SnapshotObserverKt.observeSnapshots$lambda$1((SnapshotObserver) obj);
                break;
        }
    }
}
