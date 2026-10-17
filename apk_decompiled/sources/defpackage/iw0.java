package defpackage;

import androidx.compose.animation.core.Transition;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class iw0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Transition e;

    public /* synthetic */ iw0(Transition transition, int i) {
        this.d = i;
        this.e = transition;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        boolean animateTo$lambda$0$0;
        long calculateTotalDurationNanos;
        int i = this.d;
        Transition transition = this.e;
        switch (i) {
            case 0:
                animateTo$lambda$0$0 = Transition.animateTo$lambda$0$0(transition);
                return Boolean.valueOf(animateTo$lambda$0$0);
            default:
                calculateTotalDurationNanos = transition.calculateTotalDurationNanos();
                return Long.valueOf(calculateTotalDurationNanos);
        }
    }
}
