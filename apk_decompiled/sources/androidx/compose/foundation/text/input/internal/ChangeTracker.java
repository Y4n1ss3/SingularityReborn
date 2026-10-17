package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 8;
    private MutableVector<Change> _changes;
    private MutableVector<Change> _changesTemp;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Change {
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public Change(int i, int i2, int i3, int i4) {
            this.preStart = i;
            this.preEnd = i2;
            this.originalStart = i3;
            this.originalEnd = i4;
        }

        public static /* synthetic */ Change copy$default(Change change, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = change.preStart;
            }
            if ((i5 & 2) != 0) {
                i2 = change.preEnd;
            }
            if ((i5 & 4) != 0) {
                i3 = change.originalStart;
            }
            if ((i5 & 8) != 0) {
                i4 = change.originalEnd;
            }
            return change.copy(i, i2, i3, i4);
        }

        public final int component1() {
            return this.preStart;
        }

        public final int component2() {
            return this.preEnd;
        }

        public final int component3() {
            return this.originalStart;
        }

        public final int component4() {
            return this.originalEnd;
        }

        public final Change copy(int i, int i2, int i3, int i4) {
            return new Change(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.preStart == change.preStart && this.preEnd == change.preEnd && this.originalStart == change.originalStart && this.originalEnd == change.originalEnd;
        }

        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final int getOriginalStart() {
            return this.originalStart;
        }

        public final int getPreEnd() {
            return this.preEnd;
        }

        public final int getPreStart() {
            return this.preStart;
        }

        public int hashCode() {
            return Integer.hashCode(this.originalEnd) + j50.b(this.originalStart, j50.b(this.preEnd, Integer.hashCode(this.preStart) * 31, 31), 31);
        }

        public final void setOriginalEnd(int i) {
            this.originalEnd = i;
        }

        public final void setOriginalStart(int i) {
            this.originalStart = i;
        }

        public final void setPreEnd(int i) {
            this.preEnd = i;
        }

        public final void setPreStart(int i) {
            this.preStart = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Change(preStart=");
            sb.append(this.preStart);
            sb.append(", preEnd=");
            sb.append(this.preEnd);
            sb.append(", originalStart=");
            sb.append(this.originalStart);
            sb.append(", originalEnd=");
            return fc.e(sb, this.originalEnd, ')');
        }
    }

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector<Change> mutableVector;
        this._changes = new MutableVector<>(new Change[16], 0);
        this._changesTemp = new MutableVector<>(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null) {
            return;
        }
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            Change change = changeArr[i];
            this._changes.add(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd()));
        }
    }

    private final void appendNewChange(Change change, int i, int i2, int i3) {
        int preEnd;
        if (this._changesTemp.getSize() == 0) {
            preEnd = 0;
        } else {
            Change last = this._changesTemp.last();
            preEnd = last.getPreEnd() - last.getOriginalEnd();
        }
        if (change == null) {
            int i4 = i - preEnd;
            change = new Change(i, i2 + i3, i4, (i2 - i) + i4);
        } else {
            if (change.getPreStart() > i) {
                change.setPreStart(i);
                change.setOriginalStart(i);
            }
            if (i2 > change.getPreEnd()) {
                int preEnd2 = change.getPreEnd() - change.getOriginalEnd();
                change.setPreEnd(i2);
                change.setOriginalEnd(i2 - preEnd2);
            }
            change.setPreEnd(change.getPreEnd() + i3);
        }
        this._changesTemp.add(change);
    }

    public final void clearChanges() {
        this._changes.clear();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public int getChangeCount() {
        return this._changes.getSize();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getOriginalRange--jx7JFs */
    public long mo1235getOriginalRangejx7JFs(int i) {
        Change change = this._changes.content[i];
        return TextRangeKt.TextRange(change.getOriginalStart(), change.getOriginalEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getRange--jx7JFs */
    public long mo1236getRangejx7JFs(int i) {
        Change change = this._changes.content[i];
        return TextRangeKt.TextRange(change.getPreStart(), change.getPreEnd());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        MutableVector<Change> mutableVector = this._changes;
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            Change change = changeArr[i];
            sb.append("(" + change.getOriginalStart() + ',' + change.getOriginalEnd() + ")->(" + change.getPreStart() + ',' + change.getPreEnd() + ')');
            if (i < getChangeCount() - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public final void trackChange(int i, int i2, int i3) {
        int preEnd;
        if (i == i2 && i3 == 0) {
            return;
        }
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i4 = i3 - (max - min);
        Change change = null;
        boolean z = false;
        for (int i5 = 0; i5 < this._changes.getSize(); i5++) {
            Change change2 = this._changes.content[i5];
            int preStart = change2.getPreStart();
            if ((min > preStart || preStart > max) && (min > (preEnd = change2.getPreEnd()) || preEnd > max)) {
                int preStart2 = change2.getPreStart();
                if (min > change2.getPreEnd() || preStart2 > min) {
                    int preStart3 = change2.getPreStart();
                    if (max > change2.getPreEnd() || preStart3 > max) {
                        if (change2.getPreStart() > max && !z) {
                            appendNewChange(change, min, max, i4);
                            z = true;
                        }
                        if (z) {
                            change2.setPreStart(change2.getPreStart() + i4);
                            change2.setPreEnd(change2.getPreEnd() + i4);
                        }
                        this._changesTemp.add(change2);
                    }
                }
            }
            if (change == null) {
                change = change2;
            } else {
                change.setPreEnd(change2.getPreEnd());
                change.setOriginalEnd(change2.getOriginalEnd());
            }
        }
        if (!z) {
            appendNewChange(change, min, max, i4);
        }
        MutableVector<Change> mutableVector = this._changes;
        this._changes = this._changesTemp;
        this._changesTemp = mutableVector;
        mutableVector.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i, dq dqVar) {
        this((i & 1) != 0 ? null : changeTracker);
    }
}
