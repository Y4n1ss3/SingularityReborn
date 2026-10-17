package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import defpackage.dq;
import defpackage.hm;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LabelStateImpl implements TooltipState {
    private final boolean isPersistent;
    private final boolean isVisible;
    private final MutableTransitionState<Boolean> transition;

    public LabelStateImpl(boolean z, boolean z2) {
        this.isVisible = z;
        this.isPersistent = z2;
        this.transition = new MutableTransitionState<>(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.TooltipState
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return this.isVisible;
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, hm hmVar) {
        return w01.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LabelStateImpl() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
    }

    public /* synthetic */ LabelStateImpl(boolean z, boolean z2, int i, dq dqVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }
}
