package androidx.compose.ui.text.input;

import defpackage.fc;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SetComposingRegionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetComposingRegionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text()) {
            editingBuffer.commitComposition$ui_text();
        }
        int h = y80.h(this.start, 0, editingBuffer.getLength$ui_text());
        int h2 = y80.h(this.end, 0, editingBuffer.getLength$ui_text());
        if (h != h2) {
            if (h < h2) {
                editingBuffer.setComposition$ui_text(h, h2);
            } else {
                editingBuffer.setComposition$ui_text(h2, h);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        return this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.start);
        sb.append(", end=");
        return fc.e(sb, this.end, ')');
    }
}
