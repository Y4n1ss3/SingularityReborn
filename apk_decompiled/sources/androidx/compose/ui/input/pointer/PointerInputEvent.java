package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInputEvent {
    public static final int $stable = 8;
    private MotionEvent motionEvent;
    private final List<PointerInputEventData> pointers;
    private final long uptime;

    public PointerInputEvent(long j, List<PointerInputEventData> list, MotionEvent motionEvent) {
        this.uptime = j;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }

    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List<PointerInputEventData> getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public final void setMotionEvent(MotionEvent motionEvent) {
        this.motionEvent = motionEvent;
    }
}
