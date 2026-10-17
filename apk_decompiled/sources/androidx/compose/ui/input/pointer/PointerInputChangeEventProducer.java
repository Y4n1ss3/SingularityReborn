package androidx.compose.ui.input.pointer;

import defpackage.dq;
import defpackage.r60;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class PointerInputChangeEventProducer {
    private final r60 previousPointerInputData = new r60();

    public final void clear() {
        r60 r60Var = this.previousPointerInputData;
        int i = r60Var.g;
        Object[] objArr = r60Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        r60Var.g = 0;
        r60Var.d = false;
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long mo6184screenToLocalMKHz9U;
        r60 r60Var = new r60(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = pointers.get(i);
            PointerInputData pointerInputData = (PointerInputData) this.previousPointerInputData.a(pointerInputEventData.m6116getIdJ3iCeTQ());
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                mo6184screenToLocalMKHz9U = pointerInputEventData.m6119getPositionF1C5BW0();
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                mo6184screenToLocalMKHz9U = positionCalculator.mo6184screenToLocalMKHz9U(pointerInputData.m6106getPositionOnScreenF1C5BW0());
            }
            r60Var.c(pointerInputEventData.m6116getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m6116getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m6119getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, mo6184screenToLocalMKHz9U, down, false, pointerInputEventData.m6122getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m6121getScrollDeltaF1C5BW0(), pointerInputEventData.getScaleGestureFactor(), pointerInputEventData.m6118getPanGestureOffsetF1C5BW0(), pointerInputEventData.m6117getOriginalEventPositionF1C5BW0(), null));
            boolean down2 = pointerInputEventData.getDown();
            r60 r60Var2 = this.previousPointerInputData;
            if (down2) {
                r60Var2.c(pointerInputEventData.m6116getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m6120getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), null));
            } else {
                r60Var2.d(pointerInputEventData.m6116getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(r60Var, pointerInputEvent);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        private PointerInputData(long j, long j2, boolean z) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m6106getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, dq dqVar) {
            this(j, j2, z);
        }
    }
}
