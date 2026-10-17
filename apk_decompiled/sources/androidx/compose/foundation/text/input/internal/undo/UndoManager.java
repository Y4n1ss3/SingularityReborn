package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.dj;
import defpackage.dq;
import defpackage.q10;
import defpackage.ut;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UndoManager<T> {
    private final int capacity;
    private SnapshotStateList<T> redoStack;
    private SnapshotStateList<T> undoStack;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public UndoManager(List<? extends T> list, List<? extends T> list2, int i) {
        this.capacity = i;
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            InlineClassHelperKt.throwIllegalArgumentException("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.undoStack = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.redoStack = snapshotStateList2;
    }

    public final void clearHistory() {
        this.undoStack.clear();
        this.redoStack.clear();
    }

    public final boolean getCanRedo$foundation() {
        return !this.redoStack.isEmpty();
    }

    public final boolean getCanUndo$foundation() {
        return !this.undoStack.isEmpty();
    }

    public final int getSize() {
        return this.redoStack.size() + this.undoStack.size();
    }

    public final void record(T t) {
        this.redoStack.clear();
        while (true) {
            int size = getSize();
            int i = this.capacity - 1;
            SnapshotStateList<T> snapshotStateList = this.undoStack;
            if (size <= i) {
                snapshotStateList.add(t);
                return;
            }
            snapshotStateList.getClass();
            if (snapshotStateList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            snapshotStateList.remove(0);
        }
    }

    public final T redo() {
        if (!getCanRedo$foundation()) {
            InlineClassHelperKt.throwIllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t = (T) dj.k0(this.redoStack);
        this.undoStack.add(t);
        return t;
    }

    public final T undo() {
        if (!getCanUndo$foundation()) {
            InlineClassHelperKt.throwIllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t = (T) dj.k0(this.undoStack);
        this.redoStack.add(t);
        return t;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final <T> Saver<UndoManager<T>, Object> createSaver(Saver<T, Object> saver) {
            q10.G();
            throw null;
        }

        private Companion() {
        }
    }

    public UndoManager() {
        this(null, null, 0, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UndoManager(List list, List list2, int i, int i2, dq dqVar) {
        this(r6 != 0 ? r0 : list, (i2 & 2) != 0 ? r0 : list2, (i2 & 4) != 0 ? 100 : i);
        int i3 = i2 & 1;
        ut utVar = ut.d;
    }
}
