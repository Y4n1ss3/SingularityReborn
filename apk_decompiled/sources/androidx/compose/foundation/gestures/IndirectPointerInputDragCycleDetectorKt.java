package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IndirectPointerInputDragCycleDetectorKt {
    private static final int PixelSensibility = 2;
    private static final int SmoothingFactor = 3;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addIndirectPointerInputChange-Qf4Zb88, reason: not valid java name */
    public static final void m473addIndirectPointerInputChangeQf4Zb88(VelocityTracker velocityTracker, IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, IndirectPointerInputEventSmoother indirectPointerInputEventSmoother, long j) {
        velocityTracker.m6207addPositionUv8p0NA(indirectPointerInputChange.getUptimeMillis(), Offset.m4521plusMKHz9U(m479primaryAxisPositiongrjNGvw(indirectPointerInputEventSmoother.m481smoothEventPositiontuRUvjQ(indirectPointerInputChange), orientation, indirectPointerEventPrimaryDirectionalMotionAxis), j));
    }

    private static final boolean changedToDown(IndirectPointerInputChange indirectPointerInputChange) {
        return (indirectPointerInputChange.isConsumed() || indirectPointerInputChange.getPreviousPressed() || !indirectPointerInputChange.getPressed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean changedToDownIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean changedToUpIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: positionChange-_bfSUIo, reason: not valid java name */
    public static final long m474positionChange_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        return m476positionChangeInternalwfG_k4k(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: positionChangeIgnoreConsumed-_bfSUIo, reason: not valid java name */
    public static final long m475positionChangeIgnoreConsumed_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        return m476positionChangeInternalwfG_k4k(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, true);
    }

    /* renamed from: positionChangeInternal-wfG_k4k, reason: not valid java name */
    private static final long m476positionChangeInternalwfG_k4k(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, boolean z) {
        return (z || !indirectPointerInputChange.isConsumed()) ? Offset.m4520minusMKHz9U(m478primaryAxisPosition_bfSUIo(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis), m480primaryAxisPreviousPosition_bfSUIo(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis)) : Offset.Companion.m4532getZeroF1C5BW0();
    }

    /* renamed from: positionChangeInternal-wfG_k4k$default, reason: not valid java name */
    public static /* synthetic */ long m477positionChangeInternalwfG_k4k$default(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m476positionChangeInternalwfG_k4k(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: primaryAxisPosition-_bfSUIo, reason: not valid java name */
    public static final long m478primaryAxisPosition_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return indirectPointerInputChange.m5605getPositionF1C5BW0();
        }
        IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null ? false : IndirectPointerEventPrimaryDirectionalMotionAxis.m5586equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m5589unboximpl(), companion.m5591getXnZO2Niw())) {
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m5605getPositionF1C5BW0() >> 32));
        } else {
            if (!(indirectPointerEventPrimaryDirectionalMotionAxis != null ? IndirectPointerEventPrimaryDirectionalMotionAxis.m5586equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m5589unboximpl(), companion.m5592getYnZO2Niw()) : false)) {
                return indirectPointerInputChange.m5605getPositionF1C5BW0();
            }
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m5605getPositionF1C5BW0() & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }

    /* renamed from: primaryAxisPosition-grjNGvw, reason: not valid java name */
    private static final long m479primaryAxisPositiongrjNGvw(long j, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return j;
        }
        IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null ? false : IndirectPointerEventPrimaryDirectionalMotionAxis.m5586equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m5589unboximpl(), companion.m5591getXnZO2Niw())) {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (!(indirectPointerEventPrimaryDirectionalMotionAxis != null ? IndirectPointerEventPrimaryDirectionalMotionAxis.m5586equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m5589unboximpl(), companion.m5592getYnZO2Niw()) : false)) {
                return j;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: primaryAxisPreviousPosition-_bfSUIo, reason: not valid java name */
    public static final long m480primaryAxisPreviousPosition_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return indirectPointerInputChange.m5606getPreviousPositionF1C5BW0();
        }
        IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null ? false : IndirectPointerEventPrimaryDirectionalMotionAxis.m5586equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m5589unboximpl(), companion.m5591getXnZO2Niw())) {
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m5606getPreviousPositionF1C5BW0() >> 32));
        } else {
            if (!(indirectPointerEventPrimaryDirectionalMotionAxis != null ? IndirectPointerEventPrimaryDirectionalMotionAxis.m5586equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m5589unboximpl(), companion.m5592getYnZO2Niw()) : false)) {
                return indirectPointerInputChange.m5606getPreviousPositionF1C5BW0();
            }
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m5606getPreviousPositionF1C5BW0() & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }
}
