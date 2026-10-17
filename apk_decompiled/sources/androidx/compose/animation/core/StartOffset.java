package androidx.compose.animation.core;

import defpackage.dq;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m167boximpl(long j) {
        return new StartOffset(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m168constructorimpl(int i, int i2) {
        return m169constructorimpl(i * i2);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m170constructorimpl$default(int i, int i2, int i3, dq dqVar) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.Companion.m185getDelayEo1U57Q();
        }
        return m168constructorimpl(i, i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m171equalsimpl(long j, Object obj) {
        return (obj instanceof StartOffset) && j == ((StartOffset) obj).m177unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m172equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m173getOffsetMillisimpl(long j) {
        return Math.abs((int) j);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m174getOffsetTypeEo1U57Q(long j) {
        boolean z = j > 0;
        if (z) {
            return StartOffsetType.Companion.m186getFastForwardEo1U57Q();
        }
        if (!z) {
            return StartOffsetType.Companion.m185getDelayEo1U57Q();
        }
        o.n();
        return 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m175hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m176toStringimpl(long j) {
        return "StartOffset(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m171equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m175hashCodeimpl(this.value);
    }

    public String toString() {
        return m176toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m177unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m169constructorimpl(long j) {
        return j;
    }
}
