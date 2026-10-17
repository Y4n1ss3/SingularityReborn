package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class MotionEventHelper {
    public static final MotionEventHelper INSTANCE = new MotionEventHelper();

    private MotionEventHelper() {
    }

    /* renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public final long m6023toRawOffsetdBAh8RU(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        float rawY = motionEvent.getRawY(i);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
