package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {
    private boolean isDisposed;
    private final Object key;
    private PinnableContainer.PinnedHandle parentHandle;
    private final LazyLayoutPinnedItemList pinnedItemList;
    private int pinsCount;
    private int index = -1;
    private final MutableState _parentPinnableContainer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.key = obj;
        this.pinnedItemList = lazyLayoutPinnedItemList;
    }

    private final PinnableContainer get_parentPinnableContainer() {
        return (PinnableContainer) this._parentPinnableContainer$delegate.getValue();
    }

    private final void set_parentPinnableContainer(PinnableContainer pinnableContainer) {
        this._parentPinnableContainer$delegate.setValue(pinnableContainer);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public Object getKey() {
        return this.key;
    }

    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void onDisposed() {
        this.isDisposed = true;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public PinnableContainer.PinnedHandle pin() {
        if (this.isDisposed) {
            InlineClassHelperKt.throwIllegalStateException("Pin should not be called on an already disposed item ");
        }
        if (this.pinsCount == 0) {
            this.pinnedItemList.pin$foundation(this);
            PinnableContainer parentPinnableContainer = getParentPinnableContainer();
            this.parentHandle = parentPinnableContainer != null ? parentPinnableContainer.pin() : null;
        }
        this.pinsCount++;
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        if (this.isDisposed) {
            return;
        }
        if (!(this.pinsCount > 0)) {
            InlineClassHelperKt.throwIllegalStateException("Release should only be called once");
        }
        int i = this.pinsCount - 1;
        this.pinsCount = i;
        if (i == 0) {
            this.pinnedItemList.release$foundation(this);
            PinnableContainer.PinnedHandle pinnedHandle = this.parentHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.parentHandle = null;
        }
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public final void setParentPinnableContainer(PinnableContainer pinnableContainer) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (pinnableContainer != get_parentPinnableContainer()) {
                set_parentPinnableContainer(pinnableContainer);
                if (this.pinsCount > 0) {
                    PinnableContainer.PinnedHandle pinnedHandle = this.parentHandle;
                    if (pinnedHandle != null) {
                        pinnedHandle.release();
                    }
                    this.parentHandle = pinnableContainer != null ? pinnableContainer.pin() : null;
                }
            }
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
