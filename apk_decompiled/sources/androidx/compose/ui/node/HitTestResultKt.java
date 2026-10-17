package androidx.compose.ui.node;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HitTestResultKt {
    private static final long IS_IN_EXPANDED_BOUNDS = 2;
    private static final long IS_IN_LAYER = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndFlags(float f, boolean z, boolean z2) {
        return DistanceAndFlags.m6433constructorimpl((((z ? 1L : 0L) | (z2 ? IS_IN_EXPANDED_BOUNDS : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static /* synthetic */ long DistanceAndFlags$default(float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return DistanceAndFlags(f, z, z2);
    }
}
