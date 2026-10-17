package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.fg;
import defpackage.hm;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BasicTooltipStateImpl implements BasicTooltipState {
    private final boolean isPersistent;
    private final MutableState isVisible$delegate;
    private fg job;
    private final MutatorMutex mutatorMutex;

    public BasicTooltipStateImpl(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        this.isPersistent = z2;
        this.mutatorMutex = mutatorMutex;
        this.isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.BasicTooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void onDispose() {
        fg fgVar = this.job;
        if (fgVar != null) {
            fgVar.l(null);
        }
    }

    public void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public Object show(MutatePriority mutatePriority, hm hmVar) {
        Object mutate = this.mutatorMutex.mutate(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), hmVar);
        return mutate == vn.d ? mutate : w01.a;
    }
}
