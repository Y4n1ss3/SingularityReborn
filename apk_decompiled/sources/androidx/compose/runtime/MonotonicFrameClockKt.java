package androidx.compose.runtime;

import defpackage.hm;
import defpackage.kn;
import defpackage.ky;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock getMonotonicFrameClock(kn knVar) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) knVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        o.f("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final <R> Object withFrameMillis(ky kyVar, hm hmVar) {
        return getMonotonicFrameClock(hmVar.getContext()).withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(kyVar), hmVar);
    }

    public static final <R> Object withFrameNanos(ky kyVar, hm hmVar) {
        return getMonotonicFrameClock(hmVar.getContext()).withFrameNanos(kyVar, hmVar);
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock monotonicFrameClock, ky kyVar, hm hmVar) {
        return monotonicFrameClock.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(kyVar), hmVar);
    }

    public static /* synthetic */ void getMonotonicFrameClock$annotations(kn knVar) {
    }
}
