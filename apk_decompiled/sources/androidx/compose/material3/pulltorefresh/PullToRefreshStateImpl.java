package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.dq;
import defpackage.hm;
import defpackage.je0;
import defpackage.n30;
import defpackage.vn;
import defpackage.w01;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<PullToRefreshStateImpl, Float> Saver = SaverKt.Saver(new n30(8), new je0(11));
    private final Animatable<Float, AnimationVector1D> anim;

    public PullToRefreshStateImpl() {
        this(new Animatable(Float.valueOf(0.0f), VectorConvertersKt.getVectorConverter(zv.a), null, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float Saver$lambda$0(SaverScope saverScope, PullToRefreshStateImpl pullToRefreshStateImpl) {
        return pullToRefreshStateImpl.anim.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PullToRefreshStateImpl Saver$lambda$1(float f) {
        return new PullToRefreshStateImpl(new Animatable(Float.valueOf(f), VectorConvertersKt.getVectorConverter(zv.a), null, null, 12, null));
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object animateToHidden(hm hmVar) {
        Object animateTo$default = Animatable.animateTo$default(this.anim, new Float(0.0f), null, null, null, hmVar, 14, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object animateToThreshold(hm hmVar) {
        Object animateTo$default = Animatable.animateTo$default(this.anim, new Float(1.0f), null, null, null, hmVar, 14, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getDistanceFraction() {
        return this.anim.getValue().floatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public boolean isAnimating() {
        return this.anim.isRunning();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object snapTo(float f, hm hmVar) {
        Object snapTo = this.anim.snapTo(new Float(f), hmVar);
        return snapTo == vn.d ? snapTo : w01.a;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<PullToRefreshStateImpl, Float> getSaver() {
            return PullToRefreshStateImpl.Saver;
        }

        private Companion() {
        }
    }

    private PullToRefreshStateImpl(Animatable<Float, AnimationVector1D> animatable) {
        this.anim = animatable;
    }
}
