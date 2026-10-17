package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.SharedTransitionScopeImpl$onEntryRemoved$1$1", f = "SharedTransitionScope.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$onEntryRemoved$1$1 extends us0 implements my {
    final /* synthetic */ SharedElementEntry $sharedElementState;
    final /* synthetic */ SharedElement $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$onEntryRemoved$1$1(SharedElement sharedElement, SharedElementEntry sharedElementEntry, hm hmVar) {
        super(2, hmVar);
        this.$this_with = sharedElement;
        this.$sharedElementState = sharedElementEntry;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SharedTransitionScopeImpl$onEntryRemoved$1$1(this.$this_with, this.$sharedElementState, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SharedTransitionScopeImpl$onEntryRemoved$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        SnapshotStateMap snapshotStateMap;
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        if (this.$this_with.getAllEntries().isEmpty()) {
            snapshotStateMap = this.$this_with.getScope().sharedElements;
            snapshotStateMap.remove(this.$this_with.getKey());
        }
        return w01.a;
    }
}
