package androidx.compose.runtime;

import defpackage.iy;
import defpackage.yn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotFlowManager {
    public static final int $stable = 8;
    private SnapshotFlowManagerImpl managerImpl = new SingleSubscriptionSnapshotFlowManager();

    public final void dispose() {
        SnapshotFlowManagerImpl snapshotFlowManagerImpl = this.managerImpl;
        if (!(snapshotFlowManagerImpl != null)) {
            PreconditionsKt.throwIllegalStateException("Called dispose on a manager that has been disposed of");
        }
        snapshotFlowManagerImpl.dispose$runtime();
        this.managerImpl = null;
    }

    public final void reportSnapshotFlowCancellation$runtime(yn0 yn0Var) {
        SnapshotFlowManagerImpl snapshotFlowManagerImpl = this.managerImpl;
        if (snapshotFlowManagerImpl != null) {
            snapshotFlowManagerImpl.reportSnapshotFlowCancellation$runtime(yn0Var);
        }
    }

    public final <T> T runAndWatch$runtime(yn0 yn0Var, iy iyVar) {
        SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager;
        yn0 subscribedChannel;
        if (!(this.managerImpl != null)) {
            PreconditionsKt.throwIllegalStateException("Called runAndWatch on a manager that has been disposed of");
        }
        SnapshotFlowManagerImpl snapshotFlowManagerImpl = this.managerImpl;
        if ((snapshotFlowManagerImpl instanceof SingleSubscriptionSnapshotFlowManager) && (subscribedChannel = (singleSubscriptionSnapshotFlowManager = (SingleSubscriptionSnapshotFlowManager) snapshotFlowManagerImpl).getSubscribedChannel()) != null && !subscribedChannel.equals(yn0Var)) {
            this.managerImpl = singleSubscriptionSnapshotFlowManager.promote();
        }
        SnapshotFlowManagerImpl snapshotFlowManagerImpl2 = this.managerImpl;
        snapshotFlowManagerImpl2.getClass();
        return (T) snapshotFlowManagerImpl2.runAndWatch$runtime(yn0Var, iyVar);
    }
}
