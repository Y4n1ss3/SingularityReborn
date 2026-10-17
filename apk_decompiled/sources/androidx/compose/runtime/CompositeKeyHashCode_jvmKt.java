package androidx.compose.runtime;

import defpackage.cq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositeKeyHashCode_jvmKt {
    public static final int CompositeKeyHashSizeBits = 64;
    public static final long EmptyCompositeKeyHashCode = 0;

    public static final long CompositeKeyHashCode(int i) {
        return i;
    }

    public static final long bottomUpCompoundWith(long j, int i, int i2) {
        return j ^ Long.rotateLeft(i, i2);
    }

    public static final long compoundWith(long j, int i, int i2) {
        return Long.rotateLeft(j, i2) ^ i;
    }

    public static final String toString(long j, int i) {
        cq.f(i);
        String l = Long.toString(j, i);
        l.getClass();
        return l;
    }

    public static final long unCompoundWith(long j, int i, int i2) {
        return Long.rotateRight(j ^ i, i2);
    }

    public static final long bottomUpCompoundWith(long j, long j2, int i) {
        return j ^ Long.rotateLeft(j2, i);
    }

    public static final long toLong(long j) {
        return j;
    }
}
