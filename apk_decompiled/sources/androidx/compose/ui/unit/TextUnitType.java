package androidx.compose.ui.unit;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextUnitType {
    private final long type;
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m7831constructorimpl(0);
    private static final long Sp = m7831constructorimpl(4294967296L);
    private static final long Em = m7831constructorimpl(8589934592L);

    private /* synthetic */ TextUnitType(long j) {
        this.type = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m7830boximpl(long j) {
        return new TextUnitType(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7832equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnitType) && j == ((TextUnitType) obj).m7836unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7833equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7834hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7835toStringimpl(long j) {
        return m7833equalsimpl0(j, Unspecified) ? "Unspecified" : m7833equalsimpl0(j, Sp) ? "Sp" : m7833equalsimpl0(j, Em) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7832equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m7834hashCodeimpl(this.type);
    }

    public String toString() {
        return m7835toStringimpl(this.type);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7836unboximpl() {
        return this.type;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m7837getEmUIouoOA() {
            return TextUnitType.Em;
        }

        /* renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m7838getSpUIouoOA() {
            return TextUnitType.Sp;
        }

        /* renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m7839getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7831constructorimpl(long j) {
        return j;
    }
}
