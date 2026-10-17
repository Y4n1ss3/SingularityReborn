package androidx.compose.foundation.text.modifiers;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayoutCacheOperation {
    private final long flag;
    public static final Companion Companion = new Companion(null);
    private static final long MarkDirtyStyle = m1436constructorimpl(0);
    private static final long MarkDirtyDensity = m1436constructorimpl(1);
    private static final long MarkDirtyNode = m1436constructorimpl(2);
    private static final long LayoutWithConstraints = m1436constructorimpl(3);

    private /* synthetic */ LayoutCacheOperation(long j) {
        this.flag = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LayoutCacheOperation m1435boximpl(long j) {
        return new LayoutCacheOperation(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1437equalsimpl(long j, Object obj) {
        return (obj instanceof LayoutCacheOperation) && j == ((LayoutCacheOperation) obj).m1441unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1438equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1439hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1440toStringimpl(long j) {
        return "LayoutCacheOperation(flag=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m1437equalsimpl(this.flag, obj);
    }

    public final long getFlag() {
        return this.flag;
    }

    public int hashCode() {
        return m1439hashCodeimpl(this.flag);
    }

    public String toString() {
        return m1440toStringimpl(this.flag);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1441unboximpl() {
        return this.flag;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getLayoutWithConstraints-DEKiAbY, reason: not valid java name */
        public final long m1442getLayoutWithConstraintsDEKiAbY() {
            return LayoutCacheOperation.LayoutWithConstraints;
        }

        /* renamed from: getMarkDirtyDensity-DEKiAbY, reason: not valid java name */
        public final long m1443getMarkDirtyDensityDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyDensity;
        }

        /* renamed from: getMarkDirtyNode-DEKiAbY, reason: not valid java name */
        public final long m1444getMarkDirtyNodeDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyNode;
        }

        /* renamed from: getMarkDirtyStyle-DEKiAbY, reason: not valid java name */
        public final long m1445getMarkDirtyStyleDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyStyle;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m1436constructorimpl(long j) {
        return j;
    }
}
