package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m5036constructorimpl(0);
    private static final int Stroke = m5036constructorimpl(1);
    private final int value;

    private /* synthetic */ PaintingStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m5035boximpl(int i) {
        return new PaintingStyle(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5037equalsimpl(int i, Object obj) {
        return (obj instanceof PaintingStyle) && i == ((PaintingStyle) obj).m5041unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5038equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5039hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5040toStringimpl(int i) {
        return m5038equalsimpl0(i, Fill) ? "Fill" : m5038equalsimpl0(i, Stroke) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5037equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5039hashCodeimpl(this.value);
    }

    public String toString() {
        return m5040toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5041unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m5042getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m5043getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5036constructorimpl(int i) {
        return i;
    }
}
