package androidx.compose.foundation.text;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UndoManager {
    public static final int $stable = 8;
    private boolean forceNextSnapshot;
    private Long lastSnapshot;
    private final int maxStoredCharacters;
    private Entry redoStack;
    private int storedCharacters;
    private Entry undoStack;

    public /* synthetic */ UndoManager(int i, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength : i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[LOOP:0: B:5:0x000e->B:10:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[EDGE_INSN: B:11:0x0023->B:12:0x0023 BREAK  A[LOOP:0: B:5:0x000e->B:10:0x001e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void removeLastUndo() {
        Entry entry;
        Entry entry2 = this.undoStack;
        if ((entry2 != null ? entry2.getNext() : null) == null) {
            return;
        }
        while (true) {
            if (entry2 != null) {
                Entry next = entry2.getNext();
                if (next != null) {
                    entry = next.getNext();
                    if (entry != null) {
                        break;
                    } else {
                        entry2 = entry2.getNext();
                    }
                }
            }
            entry = null;
            if (entry != null) {
            }
        }
        if (entry2 != null) {
            entry2.setNext(null);
        }
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void makeSnapshot(TextFieldValue textFieldValue) {
        TextFieldValue value;
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (q10.b(textFieldValue, entry != null ? entry.getValue() : null)) {
            return;
        }
        String text = textFieldValue.getText();
        Entry entry2 = this.undoStack;
        boolean b = q10.b(text, (entry2 == null || (value = entry2.getValue()) == null) ? null : value.getText());
        Entry entry3 = this.undoStack;
        if (b) {
            if (entry3 != null) {
                entry3.setValue(textFieldValue);
                return;
            }
            return;
        }
        this.undoStack = new Entry(entry3, textFieldValue);
        this.redoStack = null;
        int length = textFieldValue.getText().length() + this.storedCharacters;
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            removeLastUndo();
        }
    }

    public final TextFieldValue redo() {
        Entry entry = this.redoStack;
        if (entry == null) {
            return null;
        }
        this.redoStack = entry.getNext();
        this.undoStack = new Entry(this.undoStack, entry.getValue());
        this.storedCharacters = entry.getValue().getText().length() + this.storedCharacters;
        return entry.getValue();
    }

    public final void snapshotIfNeeded(TextFieldValue textFieldValue, long j) {
        if (!this.forceNextSnapshot) {
            Long l = this.lastSnapshot;
            if (j <= (l != null ? l.longValue() : 0L) + UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j);
        makeSnapshot(textFieldValue);
    }

    public final TextFieldValue undo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Entry {
        private Entry next;
        private TextFieldValue value;

        public /* synthetic */ Entry(Entry entry, TextFieldValue textFieldValue, int i, dq dqVar) {
            this((i & 1) != 0 ? null : entry, textFieldValue);
        }

        public final Entry getNext() {
            return this.next;
        }

        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setValue(TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            this.next = entry;
            this.value = textFieldValue;
        }
    }

    public UndoManager(int i) {
        this.maxStoredCharacters = i;
    }

    public UndoManager() {
        this(0, 1, null);
    }
}
