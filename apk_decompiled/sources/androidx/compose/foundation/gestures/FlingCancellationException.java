package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.PlatformOptimizedCancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlingCancellationException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }
}
