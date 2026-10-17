package androidx.compose.runtime;

import defpackage.ky;
import defpackage.w01;
import defpackage.yn0;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ky {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ MultiSubscriptionSnapshotFlowManager e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager, yn0 yn0Var) {
        this.e = multiSubscriptionSnapshotFlowManager;
        this.f = yn0Var;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 readObserverFor$lambda$0;
        w01 unregisterApplyObserver$lambda$0$0$0;
        int i = this.d;
        MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                readObserverFor$lambda$0 = MultiSubscriptionSnapshotFlowManager.readObserverFor$lambda$0(multiSubscriptionSnapshotFlowManager, (yn0) obj2, obj);
                return readObserverFor$lambda$0;
            default:
                unregisterApplyObserver$lambda$0$0$0 = MultiSubscriptionSnapshotFlowManager.unregisterApplyObserver$lambda$0$0$0((Set) obj2, multiSubscriptionSnapshotFlowManager, obj);
                return unregisterApplyObserver$lambda$0$0$0;
        }
    }

    public /* synthetic */ e(Set set, MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager) {
        this.f = set;
        this.e = multiSubscriptionSnapshotFlowManager;
    }
}
