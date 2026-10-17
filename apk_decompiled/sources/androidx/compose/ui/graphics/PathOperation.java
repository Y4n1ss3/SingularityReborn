package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m5061constructorimpl(0);
    private static final int Intersect = m5061constructorimpl(1);
    private static final int Union = m5061constructorimpl(2);
    private static final int Xor = m5061constructorimpl(3);
    private static final int ReverseDifference = m5061constructorimpl(4);

    private /* synthetic */ PathOperation(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m5060boximpl(int i) {
        return new PathOperation(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5062equalsimpl(int i, Object obj) {
        return (obj instanceof PathOperation) && i == ((PathOperation) obj).m5066unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5063equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5064hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5065toStringimpl(int i) {
        return m5063equalsimpl0(i, Difference) ? "Difference" : m5063equalsimpl0(i, Intersect) ? "Intersect" : m5063equalsimpl0(i, Union) ? "Union" : m5063equalsimpl0(i, Xor) ? "Xor" : m5063equalsimpl0(i, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5062equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5064hashCodeimpl(this.value);
    }

    public String toString() {
        return m5065toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5066unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m5067getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m5068getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m5069getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m5070getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m5071getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5061constructorimpl(int i) {
        return i;
    }
}
