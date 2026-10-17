package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BitwiseOperatorsKt {
    public static final int rol(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    public static final int ror(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    public static final long rol(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    public static final long ror(long j, int i) {
        return Long.rotateRight(j, i);
    }
}
