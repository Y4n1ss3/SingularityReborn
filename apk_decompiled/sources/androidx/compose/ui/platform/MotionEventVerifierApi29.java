package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class MotionEventVerifierApi29 {
    public static final MotionEventVerifierApi29 INSTANCE = new MotionEventVerifierApi29();

    private MotionEventVerifierApi29() {
    }

    public final boolean isValidMotionEvent(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
