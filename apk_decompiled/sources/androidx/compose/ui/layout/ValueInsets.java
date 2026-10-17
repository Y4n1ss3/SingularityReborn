package androidx.compose.ui.layout;

import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ValueInsets {
    private final long packedValue;

    private /* synthetic */ ValueInsets(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ValueInsets m6371boximpl(long j) {
        return new ValueInsets(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6373equalsimpl(long j, Object obj) {
        return (obj instanceof ValueInsets) && j == ((ValueInsets) obj).m6381unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6374equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m6375getBottomimpl(long j) {
        return (int) (j & 65535);
    }

    /* renamed from: getLeft-impl, reason: not valid java name */
    public static final int m6376getLeftimpl(long j) {
        return (int) ((j >>> 48) & 65535);
    }

    /* renamed from: getRight-impl, reason: not valid java name */
    public static final int m6377getRightimpl(long j) {
        return (int) ((j >>> 16) & 65535);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m6378getTopimpl(long j) {
        return (int) ((j >>> 32) & 65535);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6379hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6380toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("ValueInsets(");
        sb.append((int) ((j >>> 48) & 65535));
        sb.append(", ");
        sb.append((int) ((j >>> 32) & 65535));
        sb.append(", ");
        sb.append((int) ((j >>> 16) & 65535));
        sb.append(", ");
        return fc.e(sb, (int) (j & 65535), ')');
    }

    public boolean equals(Object obj) {
        return m6373equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m6379hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6380toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6381unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6372constructorimpl(long j) {
        return j;
    }
}
