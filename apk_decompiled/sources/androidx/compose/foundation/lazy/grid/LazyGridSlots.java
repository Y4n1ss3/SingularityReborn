package androidx.compose.foundation.lazy.grid;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridSlots {
    public static final int $stable = 8;
    private final int[] positions;
    private final int[] sizes;

    public LazyGridSlots(int[] iArr, int[] iArr2) {
        this.sizes = iArr;
        this.positions = iArr2;
    }

    public final int[] getPositions() {
        return this.positions;
    }

    public final int[] getSizes() {
        return this.sizes;
    }
}
