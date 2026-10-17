package androidx.compose.runtime;

import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.ky;
import defpackage.sl0;
import defpackage.tj;
import defpackage.w01;
import defpackage.yn0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MultiSubscriptionSnapshotFlowManager extends SnapshotFlowManagerImpl {
    private final fb0 readObserverCache;
    private final gb0 toNotify;
    private final ObserverHandle unregisterApplyObserver;
    private fb0 subscriptions = ScopeMap.m3918constructorimpl$default(null, 1, null);
    private final List<SubscriptionChange> pendingChanges = new ArrayList();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Add implements SubscriptionChange {
        private final yn0 channel;
        private final Object obj;

        public Add(Object obj, yn0 yn0Var) {
            this.obj = obj;
            this.channel = yn0Var;
        }

        public final yn0 getChannel() {
            return this.channel;
        }

        public final Object getObj() {
            return this.obj;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RemoveScope implements SubscriptionChange {
        private final yn0 channel;

        public RemoveScope(yn0 yn0Var) {
            this.channel = yn0Var;
        }

        public final yn0 getChannel() {
            return this.channel;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface SubscriptionChange {
    }

    public MultiSubscriptionSnapshotFlowManager() {
        gb0 gb0Var = sl0.a;
        this.toNotify = new gb0();
        this.readObserverCache = new fb0();
        this.unregisterApplyObserver = Snapshot.Companion.registerApplyObserver(new f(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 readObserverFor$lambda$0(MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager, yn0 yn0Var, Object obj) {
        multiSubscriptionSnapshotFlowManager.watch$runtime(yn0Var, obj);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 unregisterApplyObserver$lambda$0(MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager, Set set, Snapshot snapshot) {
        synchronized (multiSubscriptionSnapshotFlowManager.getLock()) {
            try {
                ScopeMap.m3923forEachKeyimpl(multiSubscriptionSnapshotFlowManager.subscriptions, new e(set, multiSubscriptionSnapshotFlowManager));
                gb0 gb0Var = multiSubscriptionSnapshotFlowManager.toNotify;
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
                                    ((yn0) objArr[(i << 3) + i3]).m(w01.a);
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
                multiSubscriptionSnapshotFlowManager.toNotify.f();
            } catch (Throwable th) {
                throw th;
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 unregisterApplyObserver$lambda$0$0$0(Set set, MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager, Object obj) {
        Object d;
        if (set.contains(obj) && (d = multiSubscriptionSnapshotFlowManager.subscriptions.d(obj)) != null) {
            if (d instanceof gb0) {
                gb0 gb0Var = (gb0) d;
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
                                    multiSubscriptionSnapshotFlowManager.toNotify.d((yn0) objArr[(i << 3) + i3]);
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
            } else {
                multiSubscriptionSnapshotFlowManager.toNotify.d((yn0) d);
            }
        }
        return w01.a;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void clearWatchSet$runtime(yn0 yn0Var) {
        this.pendingChanges.add(new RemoveScope(yn0Var));
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void commitSubscriptionChanges$runtime() {
        synchronized (getLock()) {
            try {
                List<SubscriptionChange> list = this.pendingChanges;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    SubscriptionChange subscriptionChange = list.get(i);
                    if (subscriptionChange instanceof Add) {
                        ScopeMap.m3911addimpl(this.subscriptions, ((Add) subscriptionChange).getObj(), ((Add) subscriptionChange).getChannel());
                    } else {
                        if (!(subscriptionChange instanceof RemoveScope)) {
                            throw new tj();
                        }
                        ScopeMap.m3933removeScopeimpl(this.subscriptions, ((RemoveScope) subscriptionChange).getChannel());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.pendingChanges.clear();
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void dispose$runtime() {
        this.unregisterApplyObserver.dispose();
        this.pendingChanges.clear();
        this.readObserverCache.f();
        synchronized (getLock()) {
            ScopeMap.m3916clearimpl(this.subscriptions);
        }
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public ky readObserverFor$runtime(yn0 yn0Var) {
        ky kyVar = (ky) this.readObserverCache.d(yn0Var);
        if (kyVar == null) {
            kyVar = new e(this, yn0Var);
            fb0 fb0Var = this.readObserverCache;
            int h = fb0Var.h(yn0Var);
            if (h < 0) {
                h = ~h;
            }
            Object[] objArr = fb0Var.c;
            Object obj = objArr[h];
            fb0Var.b[h] = yn0Var;
            objArr[h] = kyVar;
        }
        return kyVar;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void reportSnapshotFlowCancellation$runtime(yn0 yn0Var) {
        this.readObserverCache.j(yn0Var);
        clearWatchSet$runtime(yn0Var);
        commitSubscriptionChanges$runtime();
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void watch$runtime(yn0 yn0Var, Object obj) {
        this.pendingChanges.add(new Add(obj, yn0Var));
    }
}
