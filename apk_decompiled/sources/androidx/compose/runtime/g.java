package androidx.compose.runtime;

import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        boolean usedContainer$lambda$0$0;
        w01 readObserverCache$lambda$0;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                usedContainer$lambda$0$0 = NestedContentMap.usedContainer$lambda$0$0((MovableContentStateReference) obj2, (NestedMovableContent) obj);
                return Boolean.valueOf(usedContainer$lambda$0$0);
            default:
                readObserverCache$lambda$0 = SingleSubscriptionSnapshotFlowManager.readObserverCache$lambda$0((SingleSubscriptionSnapshotFlowManager) obj2, obj);
                return readObserverCache$lambda$0;
        }
    }
}
