package androidx.compose.runtime.collection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArrayUtils_androidKt {
    public static final <T> T[] fastCopyInto(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }
}
