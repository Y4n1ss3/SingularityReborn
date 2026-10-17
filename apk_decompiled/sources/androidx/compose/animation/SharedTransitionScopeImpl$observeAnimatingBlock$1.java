package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$observeAnimatingBlock$1 extends f30 implements iy {
    final /* synthetic */ SharedTransitionScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$observeAnimatingBlock$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(0);
        this.this$0 = sharedTransitionScopeImpl;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m93invoke() {
        SnapshotStateMap snapshotStateMap;
        snapshotStateMap = this.this$0.sharedElements;
        if (snapshotStateMap.isEmpty()) {
            return;
        }
        Iterator it = snapshotStateMap.entrySet().iterator();
        while (it.hasNext() && !((SharedElement) ((Map.Entry) it.next()).getValue()).isAnimating()) {
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m93invoke();
        return w01.a;
    }
}
