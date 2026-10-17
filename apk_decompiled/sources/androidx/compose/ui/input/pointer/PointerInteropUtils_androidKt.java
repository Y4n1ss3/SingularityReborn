package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import defpackage.ky;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long j, ky kyVar) {
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        kyVar.invoke(obtain);
        obtain.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j, kyVar);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m6161toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, ky kyVar) {
        m6163toMotionEventScopeubNVwUQ(pointerEvent, j, kyVar, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m6162toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, ky kyVar) {
        m6163toMotionEventScopeubNVwUQ(pointerEvent, j, kyVar, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m6163toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j, ky kyVar, boolean z) {
        MotionEvent motionEvent = pointerEvent.getMotionEvent();
        if (motionEvent == null) {
            o.m("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        kyVar.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEvent.setAction(action);
    }
}
