package androidx.compose.runtime.composer.linkbuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupHandleKt {
    public static final long NULL_GROUP_HANDLE = -1;

    public static final int getContext(long j) {
        return (int) (j >>> 32);
    }

    public static final int getGroup(long j) {
        return (int) j;
    }

    public static final long makeGroupHandle(int i, int i2, int i3) {
        long j;
        long j2 = 4294967295L;
        if (i3 >= 0) {
            j = i2 << 32;
            j2 = 4294967295L & i3;
        } else {
            j = i << 32;
        }
        return j | j2;
    }

    public static final long makeGroupHandle(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }
}
