package androidx.compose.ui.input.indirect;

import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import defpackage.o;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidIndirectPointerEvent_androidKt {
    private static final float RATIO_CUTOFF = 5.0f;

    /* renamed from: IndirectPointerEvent-eAXfkT4, reason: not valid java name */
    public static final IndirectPointerEvent m5581IndirectPointerEventeAXfkT4(MotionEvent motionEvent, int i, MotionEvent motionEvent2) {
        long j;
        long j2;
        long j3;
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        Integer valueOf = motionEvent2 != null ? Integer.valueOf(motionEvent2.getActionMasked()) : null;
        boolean z2 = (valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 2);
        long eventTime = motionEvent.getEventTime();
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = new ArrayList(pointerCount);
        int i2 = 0;
        while (i2 < pointerCount) {
            int pointerId = motionEvent.getPointerId(i2);
            long m6078constructorimpl = PointerId.m6078constructorimpl(pointerId);
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent.getX(i2)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i2)) & 4294967295L));
            actionIndex = actionIndex;
            boolean z3 = i2 != actionIndex;
            if ((motionEvent2 != null ? motionEvent2.findPointerIndex(pointerId) : -1) >= 0) {
                motionEvent2.getClass();
                j = m4508constructorimpl;
                z = z2;
                j2 = motionEvent2.getEventTime();
                j3 = Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent2.getX(r10)) << 32) | (Float.floatToRawIntBits(motionEvent2.getY(r10)) & 4294967295L));
            } else {
                j = m4508constructorimpl;
                j2 = eventTime;
                j3 = j;
                z = false;
            }
            int i3 = pointerCount;
            arrayList.add(new IndirectPointerInputChange(m6078constructorimpl, eventTime, j, z3, motionEvent.getPressure(i2), j2, j3, z, null));
            i2++;
            pointerCount = i3;
        }
        return new AndroidIndirectPointerEvent(arrayList, convertActionToIndirectPointerEventType(actionMasked), i, motionEvent, null);
    }

    /* renamed from: IndirectPointerEvent-eAXfkT4$default, reason: not valid java name */
    public static /* synthetic */ IndirectPointerEvent m5582IndirectPointerEventeAXfkT4$default(MotionEvent motionEvent, int i, MotionEvent motionEvent2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m5590getNonenZO2Niw();
        }
        if ((i2 & 4) != 0) {
            motionEvent2 = null;
        }
        return m5581IndirectPointerEventeAXfkT4(motionEvent, i, motionEvent2);
    }

    public static final int convertActionToIndirectPointerEventType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return IndirectPointerEventType.Companion.m5600getMove4ZHQPSE();
                }
                if (i != 5) {
                    if (i != 6) {
                        return IndirectPointerEventType.Companion.m5603getUnknown4ZHQPSE();
                    }
                }
            }
            return IndirectPointerEventType.Companion.m5602getRelease4ZHQPSE();
        }
        return IndirectPointerEventType.Companion.m5601getPress4ZHQPSE();
    }

    public static final MotionEvent getNativeEvent(IndirectPointerEvent indirectPointerEvent) {
        indirectPointerEvent.getClass();
        return ((AndroidIndirectPointerEvent) indirectPointerEvent).getNativeEvent$ui();
    }

    public static final int indirectPrimaryDirectionalScrollAxis(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            o.m("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m5591getXnZO2Niw();
            }
            if (motionRange2 != null && motionRange == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m5592getYnZO2Niw();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == 0.0f || range / range2 >= RATIO_CUTOFF)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m5591getXnZO2Niw();
                }
                if (range2 > range && (range == 0.0f || range2 / range >= RATIO_CUTOFF)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m5592getYnZO2Niw();
                }
            }
        }
        return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m5590getNonenZO2Niw();
    }
}
