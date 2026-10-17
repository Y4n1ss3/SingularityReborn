package androidx.compose.ui.input.pointer;

import defpackage.dq;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class ConsumedData {
    public static final int $stable = 8;
    private PointerInputChange change;
    private boolean downChange;
    private boolean positionChange;

    public /* synthetic */ ConsumedData(boolean z, boolean z2, int i, dq dqVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean getDownChange() {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            return consumedDelegate$ui.getDownChange$ui();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getDownChange$ui() : this.downChange;
    }

    public final boolean getPositionChange() {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            return consumedDelegate$ui.getPositionChange$ui();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getPositionChange$ui() : this.positionChange;
    }

    public final void setDownChange(boolean z) {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            consumedDelegate$ui.setDownChange$ui(z);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setDownChange$ui(z);
        }
        this.downChange = z;
    }

    public final void setPositionChange(boolean z) {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            consumedDelegate$ui.setPositionChange$ui(z);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setPositionChange$ui(z);
        }
        this.positionChange = z;
    }

    public ConsumedData(boolean z, boolean z2) {
        this.positionChange = z;
        this.downChange = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConsumedData() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    public ConsumedData(PointerInputChange pointerInputChange) {
        this(pointerInputChange.getPositionChange$ui(), pointerInputChange.getDownChange$ui());
        this.change = pointerInputChange;
    }

    @er
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @er
    public static /* synthetic */ void getPositionChange$annotations() {
    }
}
