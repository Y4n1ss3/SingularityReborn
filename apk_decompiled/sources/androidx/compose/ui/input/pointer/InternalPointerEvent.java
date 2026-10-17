package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import defpackage.r60;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InternalPointerEvent {
    public static final int $stable = 8;
    private final r60 changes;
    private final PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public InternalPointerEvent(r60 r60Var, PointerInputEvent pointerInputEvent) {
        this.changes = r60Var;
        this.pointerInputEvent = pointerInputEvent;
    }

    /* renamed from: activeHoverEvent-0FcD4WY, reason: not valid java name */
    public final boolean m6006activeHoverEvent0FcD4WY(long j) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = pointers.get(i);
            if (PointerId.m6080equalsimpl0(pointerInputEventData.m6116getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    public final r60 getChanges() {
        return this.changes;
    }

    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    public final PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void setSuppressMovementConsumption(boolean z) {
        this.suppressMovementConsumption = z;
    }
}
