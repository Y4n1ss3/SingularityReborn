package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.m50;
import defpackage.y80;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UndoManager$Companion$createSaver$1<T> implements Saver<UndoManager<T>, Object> {
    final /* synthetic */ Saver<T, Object> $itemSaver;

    public UndoManager$Companion$createSaver$1(Saver<T, Object> saver) {
        this.$itemSaver = saver;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public UndoManager<T> restore(Object obj) {
        obj.getClass();
        List list = (List) obj;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        int intValue3 = ((Number) list.get(2)).intValue();
        Saver<T, Object> saver = this.$itemSaver;
        m50 o = y80.o();
        int i = 3;
        while (i < intValue2 + 3) {
            T restore = saver.restore(list.get(i));
            restore.getClass();
            o.add(restore);
            i++;
        }
        m50 d = y80.d(o);
        Saver<T, Object> saver2 = this.$itemSaver;
        m50 o2 = y80.o();
        while (i < intValue2 + intValue3 + 3) {
            T restore2 = saver2.restore(list.get(i));
            restore2.getClass();
            o2.add(restore2);
            i++;
        }
        return new UndoManager<>(d, y80.d(o2), intValue);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public Object save(SaverScope saverScope, UndoManager<T> undoManager) {
        int i;
        SnapshotStateList snapshotStateList;
        SnapshotStateList snapshotStateList2;
        SnapshotStateList snapshotStateList3;
        SnapshotStateList snapshotStateList4;
        Saver<T, Object> saver = this.$itemSaver;
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
            o.add(saver.save(saverScope, snapshotStateList3.get(i2)));
        }
        snapshotStateList4 = ((UndoManager) undoManager).redoStack;
        int size2 = snapshotStateList4.size();
        for (int i3 = 0; i3 < size2; i3++) {
            o.add(saver.save(saverScope, snapshotStateList4.get(i3)));
        }
        return y80.d(o);
    }
}
