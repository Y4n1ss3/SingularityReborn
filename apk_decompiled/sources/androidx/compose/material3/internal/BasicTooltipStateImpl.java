package androidx.compose.material3.internal;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.fg;
import defpackage.hm;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BasicTooltipStateImpl implements TooltipState {
    private final boolean isPersistent;
    private final MutableState isVisible$delegate;
    private fg job;
    private final MutatorMutex mutatorMutex;
    private final MutableTransitionState<Boolean> transition = new MutableTransitionState<>(Boolean.FALSE);

    public BasicTooltipStateImpl(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        this.isPersistent = z2;
        this.mutatorMutex = mutatorMutex;
        this.isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.material3.TooltipState
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
        fg fgVar = this.job;
        if (fgVar != null) {
            fgVar.l(null);
        }
    }

    public void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, hm hmVar) {
        Object mutate = this.mutatorMutex.mutate(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), hmVar);
        return mutate == vn.d ? mutate : w01.a;
    }
}
