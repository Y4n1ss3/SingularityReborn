package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = SnapshotStateObserver.$stable;
    private final SnapshotStateObserver observer;
    private final ky onCommitAffectingLookaheadMeasure = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;
    private final ky onCommitAffectingMeasure = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;
    private final ky onCommitAffectingSemantics = OwnerSnapshotObserver$onCommitAffectingSemantics$1.INSTANCE;
    private final ky onCommitAffectingLayout = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;
    private final ky onCommitAffectingLayoutModifier = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;
    private final ky onCommitAffectingLayoutModifierInLookahead = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.INSTANCE;
    private final ky onCommitAffectingLookahead = OwnerSnapshotObserver$onCommitAffectingLookahead$1.INSTANCE;

    public OwnerSnapshotObserver(ky kyVar) {
        this.observer = new SnapshotStateObserver(kyVar);
    }

    public final void clear$ui(Object obj) {
        this.observer.clear(obj);
    }

    public final void clearInvalidObservations$ui() {
        this.observer.clearIf(OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE);
    }

    public final void observeLayoutModifierSnapshotReads$ui(LayoutNode layoutNode, iy iyVar) {
        this.observer.observeReads(layoutNode, this.onCommitAffectingLayoutModifier, iyVar);
    }

    public final void observeLayoutModifierSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, iy iyVar) {
        this.observer.observeReads(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, iyVar);
    }

    public final void observeLayoutSnapshotReads$ui(LayoutNode layoutNode, iy iyVar) {
        this.observer.observeReads(layoutNode, this.onCommitAffectingLayout, iyVar);
    }

    public final void observeLayoutSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, iy iyVar) {
        this.observer.observeReads(layoutNode, this.onCommitAffectingLookahead, iyVar);
    }

    public final void observeMeasureSnapshotReads$ui(LayoutNode layoutNode, iy iyVar) {
        this.observer.observeReads(layoutNode, this.onCommitAffectingMeasure, iyVar);
    }

    public final void observeMeasureSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, iy iyVar) {
        this.observer.observeReads(layoutNode, this.onCommitAffectingLookaheadMeasure, iyVar);
    }

    public final <T extends OwnerScope> void observeReads$ui(T t, ky kyVar, iy iyVar) {
        this.observer.observeReads(t, kyVar, iyVar);
    }

    public final void observeSemanticsReads$ui(LayoutNode layoutNode, iy iyVar) {
        this.observer.observeReads(layoutNode, this.onCommitAffectingSemantics, iyVar);
    }

    public final void startObserving$ui() {
        this.observer.start();
    }

    public final void stopObserving$ui() {
        this.observer.stop();
        this.observer.clear();
    }
}
