package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import defpackage.fg;
import defpackage.hm;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TooltipStateImpl implements TooltipState {
    private final boolean isPersistent;
    private fg job;
    private final MutatorMutex mutatorMutex;
    private final MutableTransitionState<Boolean> transition;

    public TooltipStateImpl(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        this.isPersistent = z2;
        this.mutatorMutex = mutatorMutex;
        this.transition = new MutableTransitionState<>(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        fg fgVar;
        getTransition().setTargetState$animation_core(Boolean.FALSE);
        if (!isPersistent() || (fgVar = this.job) == null) {
            return;
        }
        fgVar.l(null);
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
        return getTransition().getCurrentState().booleanValue() || getTransition().getTargetState().booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
        fg fgVar = this.job;
        if (fgVar != null) {
            fgVar.l(null);
        }
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, hm hmVar) {
        Object mutate = this.mutatorMutex.mutate(mutatePriority, new TooltipStateImpl$show$2(this, new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null), hmVar);
        return mutate == vn.d ? mutate : w01.a;
    }
}
