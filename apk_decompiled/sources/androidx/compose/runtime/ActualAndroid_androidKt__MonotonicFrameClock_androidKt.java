package androidx.compose.runtime;

import android.os.Looper;
import defpackage.er;
import defpackage.g30;
import defpackage.ys0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {
    private static final g30 DefaultMonotonicFrameClock$delegate = new ys0(new a());
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static final MonotonicFrameClock DefaultMonotonicFrameClock_delegate$lambda$0$ActualAndroid_androidKt__MonotonicFrameClock_androidKt() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : FallbackFrameClock.INSTANCE;
    }

    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    @er
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }
}
