package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.oy;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {
    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m569anglek4lQ0M(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                m4532getZeroF1C5BW0 = Offset.m4521plusMKHz9U(m4532getZeroF1C5BW0, z ? pointerInputChange.m6101getPositionF1C5BW0() : pointerInputChange.m6102getPreviousPositionF1C5BW0());
                i++;
            }
        }
        return i == 0 ? Offset.Companion.m4531getUnspecifiedF1C5BW0() : Offset.m4511divtuRUvjQ(m4532getZeroF1C5BW0, i);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroid(pointerEvent, z);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        long calculateCentroid = calculateCentroid(pointerEvent, z);
        float f = 0.0f;
        if (Offset.m4513equalsimpl0(calculateCentroid, Offset.Companion.m4531getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                i++;
                f = Offset.m4514getDistanceimpl(Offset.m4520minusMKHz9U(z ? pointerInputChange.m6101getPositionF1C5BW0() : pointerInputChange.m6102getPreviousPositionF1C5BW0(), calculateCentroid)) + f;
            }
        }
        return f / i;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(pointerEvent, z);
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        return Offset.m4513equalsimpl0(calculateCentroid, companion.m4531getUnspecifiedF1C5BW0()) ? companion.m4532getZeroF1C5BW0() : Offset.m4520minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            PointerInputChange pointerInputChange2 = changes2.get(i4);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long m6101getPositionF1C5BW0 = pointerInputChange2.m6101getPositionF1C5BW0();
                long m4520minusMKHz9U = Offset.m4520minusMKHz9U(pointerInputChange2.m6102getPreviousPositionF1C5BW0(), calculateCentroid2);
                long m4520minusMKHz9U2 = Offset.m4520minusMKHz9U(m6101getPositionF1C5BW0, calculateCentroid);
                float m569anglek4lQ0M = m569anglek4lQ0M(m4520minusMKHz9U2) - m569anglek4lQ0M(m4520minusMKHz9U);
                float m4514getDistanceimpl = Offset.m4514getDistanceimpl(Offset.m4521plusMKHz9U(m4520minusMKHz9U2, m4520minusMKHz9U)) / 2.0f;
                if (m569anglek4lQ0M > 180.0f) {
                    m569anglek4lQ0M -= 360.0f;
                } else if (m569anglek4lQ0M < -180.0f) {
                    m569anglek4lQ0M += 360.0f;
                }
                f2 += m569anglek4lQ0M * m4514getDistanceimpl;
                f += m4514getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f || calculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z, oy oyVar, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TransformGestureDetectorKt$detectTransformGestures$2(z, oyVar, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z, oy oyVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(pointerInputScope, z, oyVar, hmVar);
    }
}
