package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class cr0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ gi0 f;
    public final /* synthetic */ ScrollScope g;
    public final /* synthetic */ ky h;

    public /* synthetic */ cr0(float f, gi0 gi0Var, ScrollScope scrollScope, ky kyVar, int i) {
        this.d = i;
        this.e = f;
        this.f = gi0Var;
        this.g = scrollScope;
        this.h = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 animateDecay$lambda$0;
        w01 animateWithTarget$lambda$0;
        int i = this.d;
        ky kyVar = this.h;
        ScrollScope scrollScope = this.g;
        gi0 gi0Var = this.f;
        float f = this.e;
        AnimationScope animationScope = (AnimationScope) obj;
        switch (i) {
            case 0:
                animateDecay$lambda$0 = SnapFlingBehaviorKt.animateDecay$lambda$0(f, gi0Var, scrollScope, kyVar, animationScope);
                return animateDecay$lambda$0;
            default:
                animateWithTarget$lambda$0 = SnapFlingBehaviorKt.animateWithTarget$lambda$0(f, gi0Var, scrollScope, kyVar, animationScope);
                return animateWithTarget$lambda$0;
        }
    }
}
