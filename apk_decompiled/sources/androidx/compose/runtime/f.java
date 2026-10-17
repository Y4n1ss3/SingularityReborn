package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.my;
import defpackage.w01;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 unregisterApplyObserver$lambda$0;
        w01 invokeSuspend$lambda$0;
        w01 unregisterApplyObserver$lambda$02;
        int i = this.d;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                unregisterApplyObserver$lambda$0 = MultiSubscriptionSnapshotFlowManager.unregisterApplyObserver$lambda$0((MultiSubscriptionSnapshotFlowManager) obj3, (Set) obj, (Snapshot) obj2);
                return unregisterApplyObserver$lambda$0;
            case 1:
                invokeSuspend$lambda$0 = Recomposer$recompositionRunner$2.invokeSuspend$lambda$0((Recomposer) obj3, (Set) obj, (Snapshot) obj2);
                return invokeSuspend$lambda$0;
            default:
                unregisterApplyObserver$lambda$02 = SingleSubscriptionSnapshotFlowManager.unregisterApplyObserver$lambda$0((SingleSubscriptionSnapshotFlowManager) obj3, (Set) obj, (Snapshot) obj2);
                return unregisterApplyObserver$lambda$02;
        }
    }
}
