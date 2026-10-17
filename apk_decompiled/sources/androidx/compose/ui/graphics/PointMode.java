package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = m5074constructorimpl(0);
    private static final int Lines = m5074constructorimpl(1);
    private static final int Polygon = m5074constructorimpl(2);

    private /* synthetic */ PointMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m5073boximpl(int i) {
        return new PointMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5075equalsimpl(int i, Object obj) {
        return (obj instanceof PointMode) && i == ((PointMode) obj).m5079unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5076equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5077hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5078toStringimpl(int i) {
        return m5076equalsimpl0(i, Points) ? "Points" : m5076equalsimpl0(i, Lines) ? "Lines" : m5076equalsimpl0(i, Polygon) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5075equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5077hashCodeimpl(this.value);
    }

    public String toString() {
        return m5078toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5079unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m5080getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m5081getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m5082getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5074constructorimpl(int i) {
        return i;
    }
}
