package androidx.compose.ui.unit;

import androidx.compose.ui.unit.TextUnitType;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m7830boximpl(companion.m7839getUnspecifiedUIouoOA()), TextUnitType.m7830boximpl(companion.m7838getSpUIouoOA()), TextUnitType.m7830boximpl(companion.m7837getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m7795boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m7796compareToR2X_6o(long j, long j2) {
        TextUnitKt.m7819checkArithmeticNB67dxo(j, j2);
        return Float.compare(m7805getValueimpl(j), m7805getValueimpl(j2));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7798divkPz2Gy4(long j, double d) {
        TextUnitKt.m7818checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7803getRawTypeimpl(j), (float) (m7805getValueimpl(j) / d));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7801equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).m7814unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7802equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m7803getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m7804getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m7803getRawTypeimpl(j) >>> 32)].m7836unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m7805getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7806hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m7807isEmimpl(long j) {
        return m7803getRawTypeimpl(j) == 8589934592L;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m7808isSpimpl(long j) {
        return m7803getRawTypeimpl(j) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7809timeskPz2Gy4(long j, double d) {
        TextUnitKt.m7818checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7803getRawTypeimpl(j), (float) (m7805getValueimpl(j) * d));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7812toStringimpl(long j) {
        long m7804getTypeUIouoOA = m7804getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7839getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
            return m7805getValueimpl(j) + ".sp";
        }
        if (!TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
            return "Invalid";
        }
        return m7805getValueimpl(j) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m7813unaryMinusXSAIIZE(long j) {
        TextUnitKt.m7818checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7803getRawTypeimpl(j), -m7805getValueimpl(j));
    }

    public boolean equals(Object obj) {
        return m7801equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m7806hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7812toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7814unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m7816getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7815getUnspecifiedXSAIIZE$annotations() {
        }
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7799divkPz2Gy4(long j, float f) {
        TextUnitKt.m7818checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7803getRawTypeimpl(j), m7805getValueimpl(j) / f);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7810timeskPz2Gy4(long j, float f) {
        TextUnitKt.m7818checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7803getRawTypeimpl(j), m7805getValueimpl(j) * f);
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7800divkPz2Gy4(long j, int i) {
        TextUnitKt.m7818checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7803getRawTypeimpl(j), m7805getValueimpl(j) / i);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7811timeskPz2Gy4(long j, int i) {
        TextUnitKt.m7818checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7803getRawTypeimpl(j), m7805getValueimpl(j) * i);
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7797constructorimpl(long j) {
        return j;
    }
}
