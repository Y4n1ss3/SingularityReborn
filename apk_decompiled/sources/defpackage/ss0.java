package defpackage;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ss0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnimationState e;

    public /* synthetic */ ss0(int i, AnimationState animationState) {
        this.d = i;
        this.e = animationState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 animate$lambda$4;
        w01 animate$lambda$3$0;
        int i = this.d;
        AnimationState animationState = this.e;
        switch (i) {
            case 0:
                animate$lambda$4 = SuspendAnimationKt.animate$lambda$4(animationState);
                return animate$lambda$4;
            default:
                animate$lambda$3$0 = SuspendAnimationKt.animate$lambda$3$0(animationState);
                return animate$lambda$3$0;
        }
    }
}
