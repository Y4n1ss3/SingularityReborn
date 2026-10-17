package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m5150constructorimpl(0);
    private static final int Repeated = m5150constructorimpl(1);
    private static final int Mirror = m5150constructorimpl(2);
    private static final int Decal = m5150constructorimpl(3);

    private /* synthetic */ TileMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m5149boximpl(int i) {
        return new TileMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5151equalsimpl(int i, Object obj) {
        return (obj instanceof TileMode) && i == ((TileMode) obj).m5155unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5152equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5153hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5154toStringimpl(int i) {
        return m5152equalsimpl0(i, Clamp) ? "Clamp" : m5152equalsimpl0(i, Repeated) ? "Repeated" : m5152equalsimpl0(i, Mirror) ? "Mirror" : m5152equalsimpl0(i, Decal) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5151equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5153hashCodeimpl(this.value);
    }

    public String toString() {
        return m5154toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5155unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m5156getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m5157getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m5158getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m5159getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5150constructorimpl(int i) {
        return i;
    }
}
