package androidx.compose.ui.input.pointer;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInputResetException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public PointerInputResetException() {
        super("Pointer input was reset");
    }
}
