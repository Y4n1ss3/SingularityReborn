package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.gb0;
import defpackage.ky;
import defpackage.q10;
import defpackage.sl0;
import defpackage.w01;
import defpackage.yi;
import defpackage.yn0;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SingleSubscriptionSnapshotFlowManager extends SnapshotFlowManagerImpl {
    private Object soleWatchedObject;
    private yn0 subscribedChannel;
    private gb0 watchSet;
    private Object workingSoleWatchedObject;
    private gb0 workingWatchSet;
    private final ky readObserverCache = new g(this, 1);
    private final ObserverHandle unregisterApplyObserver = Snapshot.Companion.registerApplyObserver(new f(this, 2));

    private final void clearWatchSetImpl() {
        this.workingSoleWatchedObject = null;
        this.workingWatchSet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 readObserverCache$lambda$0(SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager, Object obj) {
        yn0 yn0Var = singleSubscriptionSnapshotFlowManager.subscribedChannel;
        yn0Var.getClass();
        singleSubscriptionSnapshotFlowManager.watch$runtime(yn0Var, obj);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 unregisterApplyObserver$lambda$0(SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager, Set set, Snapshot snapshot) {
        yn0 yn0Var;
        synchronized (singleSubscriptionSnapshotFlowManager.getLock()) {
            try {
                gb0 gb0Var = singleSubscriptionSnapshotFlowManager.watchSet;
                if (gb0Var == null) {
                    if (yi.m0(set, singleSubscriptionSnapshotFlowManager.soleWatchedObject)) {
                        yn0Var = singleSubscriptionSnapshotFlowManager.subscribedChannel;
                    }
                    yn0Var = null;
                } else {
                    Object[] objArr = gb0Var.b;
                    long[] jArr = gb0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        loop0: while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                                        yn0Var = singleSubscriptionSnapshotFlowManager.subscribedChannel;
                                        break loop0;
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                    yn0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yn0Var != null) {
            yn0Var.m(w01.a);
        }
        return w01.a;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void clearWatchSet$runtime(yn0 yn0Var) {
        clearWatchSetImpl();
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void commitSubscriptionChanges$runtime() {
        synchronized (getLock()) {
            try {
                this.soleWatchedObject = this.workingSoleWatchedObject;
                if (this.workingWatchSet == null) {
                    this.watchSet = null;
                } else {
                    gb0 gb0Var = this.watchSet;
                    if (gb0Var == null) {
                        gb0 gb0Var2 = sl0.a;
                        gb0Var = new gb0();
                        this.watchSet = gb0Var;
                    }
                    this.watchSet = this.workingWatchSet;
                    this.workingWatchSet = gb0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void dispose$runtime() {
        this.unregisterApplyObserver.dispose();
        clearWatchSetImpl();
        synchronized (getLock()) {
            this.subscribedChannel = null;
            this.soleWatchedObject = null;
            this.watchSet = null;
        }
    }

    public final yn0 getSubscribedChannel() {
        return this.subscribedChannel;
    }

    public final MultiSubscriptionSnapshotFlowManager promote() {
        MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager = new MultiSubscriptionSnapshotFlowManager();
        yn0 yn0Var = this.subscribedChannel;
        if (!(yn0Var != null)) {
            PreconditionsKt.throwIllegalStateException("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
        }
        gb0 gb0Var = this.watchSet;
        if (gb0Var == null) {
            Object obj = this.soleWatchedObject;
            obj.getClass();
            multiSubscriptionSnapshotFlowManager.watch$runtime(yn0Var, obj);
        } else {
            Object[] objArr = gb0Var.b;
            long[] jArr = gb0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                multiSubscriptionSnapshotFlowManager.watch$runtime(yn0Var, objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        multiSubscriptionSnapshotFlowManager.commitSubscriptionChanges$runtime();
        dispose$runtime();
        return multiSubscriptionSnapshotFlowManager;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public ky readObserverFor$runtime(yn0 yn0Var) {
        yn0 yn0Var2 = this.subscribedChannel;
        if (!(yn0Var2 == null || q10.b(yn0Var2, yn0Var))) {
            PreconditionsKt.throwIllegalStateException("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.subscribedChannel = yn0Var;
        return this.readObserverCache;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void reportSnapshotFlowCancellation$runtime(yn0 yn0Var) {
        this.subscribedChannel = null;
        clearWatchSet$runtime(yn0Var);
        commitSubscriptionChanges$runtime();
    }

    public final void setSubscribedChannel(yn0 yn0Var) {
        this.subscribedChannel = yn0Var;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void watch$runtime(yn0 yn0Var, Object obj) {
        if (!q10.b(this.subscribedChannel, yn0Var)) {
            PreconditionsKt.throwIllegalStateException("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        gb0 gb0Var = this.workingWatchSet;
        Object obj2 = this.workingSoleWatchedObject;
        if (gb0Var != null) {
            if (obj2 != null) {
                PreconditionsKt.throwIllegalStateException("workingSoleWatchedObject must be null when workingWatchSet is non-null");
            }
            gb0Var.d(obj);
        } else {
            if (obj2 == null) {
                this.workingSoleWatchedObject = obj;
                return;
            }
            gb0 gb0Var2 = sl0.a;
            gb0 gb0Var3 = new gb0();
            gb0Var3.d(obj2);
            gb0Var3.d(obj);
            this.workingWatchSet = gb0Var3;
            this.workingSoleWatchedObject = null;
        }
    }
}
