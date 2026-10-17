package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import defpackage.gb0;
import defpackage.ky;
import defpackage.q10;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private boolean deactivated;
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(long j, SnapshotIdSet snapshotIdSet, ky kyVar, ky kyVar2, MutableSnapshot mutableSnapshot) {
        super(j, snapshotIdSet, kyVar, kyVar2);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo4150nestedActivated$runtime(this);
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.mo4151nestedDeactivated$runtime(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        Map<StateRecord, ? extends StateRecord> map;
        NestedMutableSnapshot nestedMutableSnapshot;
        Map<StateRecord, ? extends StateRecord> optimisticMerges;
        if (this.parent.getApplied$runtime() || this.parent.getDisposed$runtime()) {
            return new SnapshotApplyResult.Failure(this);
        }
        gb0 modified$runtime = getModified$runtime();
        long snapshotId = getSnapshotId();
        if (modified$runtime != null) {
            optimisticMerges = SnapshotKt.optimisticMerges(this.parent.getSnapshotId(), this, this.parent.getInvalid$runtime());
            map = optimisticMerges;
        } else {
            map = null;
        }
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
                if (modified$runtime == null || modified$runtime.d == 0) {
                    nestedMutableSnapshot = this;
                    nestedMutableSnapshot.closeAndReleasePinning$runtime();
                } else {
                    nestedMutableSnapshot = this;
                    SnapshotApplyResult innerApplyLocked$runtime = nestedMutableSnapshot.innerApplyLocked$runtime(this.parent.getSnapshotId(), modified$runtime, map, this.parent.getInvalid$runtime());
                    if (!q10.b(innerApplyLocked$runtime, SnapshotApplyResult.Success.INSTANCE)) {
                        return innerApplyLocked$runtime;
                    }
                    gb0 modified$runtime2 = nestedMutableSnapshot.parent.getModified$runtime();
                    if (modified$runtime2 != null) {
                        modified$runtime2.k(modified$runtime);
                    } else {
                        nestedMutableSnapshot.parent.setModified$runtime(modified$runtime);
                        nestedMutableSnapshot.setModified$runtime(null);
                    }
                }
                if (q10.i(nestedMutableSnapshot.parent.getSnapshotId(), snapshotId) < 0) {
                    nestedMutableSnapshot.parent.advance$runtime();
                }
                MutableSnapshot mutableSnapshot = nestedMutableSnapshot.parent;
                mutableSnapshot.setInvalid$runtime(mutableSnapshot.getInvalid$runtime().clear(snapshotId).andNot(nestedMutableSnapshot.getPreviousIds$runtime()));
                nestedMutableSnapshot.parent.recordPrevious$runtime(snapshotId);
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshot$runtime(nestedMutableSnapshot.takeoverPinnedSnapshot$runtime());
                nestedMutableSnapshot.parent.recordPreviousList$runtime(nestedMutableSnapshot.getPreviousIds$runtime());
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshots$runtime(nestedMutableSnapshot.getPreviousPinnedSnapshots$runtime());
                nestedMutableSnapshot.setApplied$runtime(true);
                nestedMutableSnapshot.deactivate();
                SnapshotObserverKt.dispatchObserverOnApplied(nestedMutableSnapshot, modified$runtime);
                return SnapshotApplyResult.Success.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    public final MutableSnapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }
}
