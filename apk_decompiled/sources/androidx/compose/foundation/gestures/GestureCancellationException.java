package androidx.compose.foundation.gestures;

import defpackage.dq;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public static final int $stable = 8;

    public /* synthetic */ GestureCancellationException(String str, int i, dq dqVar) {
        this((i & 1) != 0 ? null : str);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GestureCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
