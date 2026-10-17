package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.lazy.LazyListCacheWindowScope;
import androidx.compose.foundation.lazy.LazyListPrefetchResultScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class z30 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;

    public /* synthetic */ z30(int i, my myVar) {
        this.d = i;
        this.e = myVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 schedulePrefetch$lambda$0;
        w01 animateDecay$lambda$0;
        int i = this.d;
        my myVar = this.e;
        switch (i) {
            case 0:
                schedulePrefetch$lambda$0 = LazyListCacheWindowScope.schedulePrefetch$lambda$0(myVar, (LazyListPrefetchResultScope) obj);
                return schedulePrefetch$lambda$0;
            default:
                animateDecay$lambda$0 = SuspendAnimationKt.animateDecay$lambda$0(myVar, (AnimationScope) obj);
                return animateDecay$lambda$0;
        }
    }
}
