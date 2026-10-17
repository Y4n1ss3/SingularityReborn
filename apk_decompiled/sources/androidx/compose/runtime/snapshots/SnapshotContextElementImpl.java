package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotContextElement;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.my;
import defpackage.wu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, wu0 {
    public static final int $stable = 8;
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r, myVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, jnVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.in
    public jn getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, jnVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return SnapshotContextElement.DefaultImpls.plus(this, knVar);
    }

    @Override // defpackage.wu0
    public Snapshot updateThreadContext(kn knVar) {
        return this.snapshot.unsafeEnter();
    }

    @Override // defpackage.wu0
    public void restoreThreadContext(kn knVar, Snapshot snapshot) {
        this.snapshot.unsafeLeave(snapshot);
    }
}
