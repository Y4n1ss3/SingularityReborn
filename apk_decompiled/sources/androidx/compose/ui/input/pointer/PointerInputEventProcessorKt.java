package androidx.compose.ui.input.pointer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInputEventProcessorKt {
    public static final int ProcessResult(boolean z, boolean z2, boolean z3) {
        return ProcessResult.m6186constructorimpl((z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2));
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
