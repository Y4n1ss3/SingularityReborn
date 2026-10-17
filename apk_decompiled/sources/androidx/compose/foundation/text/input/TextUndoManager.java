package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.dq;
import defpackage.ky;
import defpackage.m50;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextUndoManager {
    private final MutableState stagingUndo$delegate;
    private final UndoManager<TextUndoOperation> undoManager;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager, int i, dq dqVar) {
        this((i & 1) != 0 ? null : textUndoOperation, (i & 2) != 0 ? new UndoManager(null, null, 100, 3, null) : undoManager);
    }

    private final void flush() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation stagingUndo = getStagingUndo();
            if (stagingUndo != null) {
                this.undoManager.record(stagingUndo);
            }
            setStagingUndo(null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextUndoOperation getStagingUndo() {
        return (TextUndoOperation) this.stagingUndo$delegate.getValue();
    }

    private final void setStagingUndo(TextUndoOperation textUndoOperation) {
        this.stagingUndo$delegate.setValue(textUndoOperation);
    }

    public final void clearHistory() {
        setStagingUndo(null);
        this.undoManager.clearHistory();
    }

    public final boolean getCanRedo() {
        return this.undoManager.getCanRedo$foundation() && getStagingUndo() == null;
    }

    public final boolean getCanUndo() {
        return this.undoManager.getCanUndo$foundation() || getStagingUndo() != null;
    }

    public final void record(TextUndoOperation textUndoOperation) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation stagingUndo = getStagingUndo();
            if (stagingUndo == null) {
                setStagingUndo(textUndoOperation);
                return;
            }
            TextUndoOperation merge = TextUndoManagerKt.merge(stagingUndo, textUndoOperation);
            if (merge != null) {
                setStagingUndo(merge);
            } else {
                flush();
                setStagingUndo(textUndoOperation);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void redo(TextFieldState textFieldState) {
        if (getCanRedo()) {
            TextUndoOperationKt.redo(textFieldState, this.undoManager.redo());
        }
    }

    public final void undo(TextFieldState textFieldState) {
        if (getCanUndo()) {
            flush();
            TextUndoOperationKt.undo(textFieldState, this.undoManager.undo());
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {
            public static final int $stable;
            public static final Saver INSTANCE = new Saver();
            private static final androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> undoManagerSaver;

            static {
                UndoManager.Companion companion = UndoManager.Companion;
                final androidx.compose.runtime.saveable.Saver<TextUndoOperation, Object> saver = TextUndoOperation.Companion.getSaver();
                undoManagerSaver = new androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object>() { // from class: androidx.compose.foundation.text.input.TextUndoManager$Companion$Saver$special$$inlined$createSaver$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // androidx.compose.runtime.saveable.Saver
                    public UndoManager<TextUndoOperation> restore(Object obj) {
                        obj.getClass();
                        List list = (List) obj;
                        int intValue = ((Number) list.get(0)).intValue();
                        int intValue2 = ((Number) list.get(1)).intValue();
                        int intValue3 = ((Number) list.get(2)).intValue();
                        Saver saver2 = Saver.this;
                        m50 o = y80.o();
                        int i = 3;
                        while (i < intValue2 + 3) {
                            Object restore = saver2.restore(list.get(i));
                            restore.getClass();
                            o.add(restore);
                            i++;
                        }
                        m50 d = y80.d(o);
                        Saver saver3 = Saver.this;
                        m50 o2 = y80.o();
                        while (i < intValue2 + intValue3 + 3) {
                            Object restore2 = saver3.restore(list.get(i));
                            restore2.getClass();
                            o2.add(restore2);
                            i++;
                        }
                        return new UndoManager<>(d, y80.d(o2), intValue);
                    }

                    @Override // androidx.compose.runtime.saveable.Saver
                    public Object save(SaverScope saverScope, UndoManager<TextUndoOperation> undoManager) {
                        int i;
                        SnapshotStateList snapshotStateList;
                        SnapshotStateList snapshotStateList2;
                        SnapshotStateList snapshotStateList3;
                        SnapshotStateList snapshotStateList4;
                        Saver saver2 = Saver.this;
                        m50 o = y80.o();
                        i = ((UndoManager) undoManager).capacity;
                        o.add(Integer.valueOf(i));
                        snapshotStateList = ((UndoManager) undoManager).undoStack;
                        o.add(Integer.valueOf(snapshotStateList.size()));
                        snapshotStateList2 = ((UndoManager) undoManager).redoStack;
                        o.add(Integer.valueOf(snapshotStateList2.size()));
                        snapshotStateList3 = ((UndoManager) undoManager).undoStack;
                        int size = snapshotStateList3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            o.add(saver2.save(saverScope, snapshotStateList3.get(i2)));
                        }
                        snapshotStateList4 = ((UndoManager) undoManager).redoStack;
                        int size2 = snapshotStateList4.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            o.add(saver2.save(saverScope, snapshotStateList4.get(i3)));
                        }
                        return y80.d(o);
                    }
                };
                $stable = 8;
            }

            private Saver() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.saveable.Saver
            public TextUndoManager restore(Object obj) {
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                TextUndoOperation restore = obj2 != null ? TextUndoOperation.Companion.getSaver().restore(obj2) : null;
                androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> saver = undoManagerSaver;
                obj3.getClass();
                UndoManager<TextUndoOperation> restore2 = saver.restore(obj3);
                restore2.getClass();
                return new TextUndoManager(restore, restore2);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Object save(SaverScope saverScope, TextUndoManager textUndoManager) {
                TextUndoOperation stagingUndo = textUndoManager.getStagingUndo();
                return y80.E(stagingUndo != null ? TextUndoOperation.Companion.getSaver().save(saverScope, stagingUndo) : null, undoManagerSaver.save(saverScope, textUndoManager.undoManager));
            }
        }

        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public TextUndoManager(TextUndoOperation textUndoOperation, UndoManager<TextUndoOperation> undoManager) {
        this.undoManager = undoManager;
        this.stagingUndo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(textUndoOperation, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextUndoManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
