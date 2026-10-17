package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClipOp {
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m4743constructorimpl(0);
    private static final int Intersect = m4743constructorimpl(1);
    private final int value;

    private /* synthetic */ ClipOp(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m4742boximpl(int i) {
        return new ClipOp(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4744equalsimpl(int i, Object obj) {
        return (obj instanceof ClipOp) && i == ((ClipOp) obj).m4748unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4745equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4746hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4747toStringimpl(int i) {
        return m4745equalsimpl0(i, Difference) ? "Difference" : m4745equalsimpl0(i, Intersect) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4744equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4746hashCodeimpl(this.value);
    }

    public String toString() {
        return m4747toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4748unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m4749getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m4750getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4743constructorimpl(int i) {
        return i;
    }
}
