package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VertexMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Triangles = m5177constructorimpl(0);
    private static final int TriangleStrip = m5177constructorimpl(1);
    private static final int TriangleFan = m5177constructorimpl(2);

    private /* synthetic */ VertexMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VertexMode m5176boximpl(int i) {
        return new VertexMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5178equalsimpl(int i, Object obj) {
        return (obj instanceof VertexMode) && i == ((VertexMode) obj).m5182unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5179equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5180hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5181toStringimpl(int i) {
        return m5179equalsimpl0(i, Triangles) ? "Triangles" : m5179equalsimpl0(i, TriangleStrip) ? "TriangleStrip" : m5179equalsimpl0(i, TriangleFan) ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5178equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5180hashCodeimpl(this.value);
    }

    public String toString() {
        return m5181toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5182unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m5183getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m5184getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m5185getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5177constructorimpl(int i) {
        return i;
    }
}
