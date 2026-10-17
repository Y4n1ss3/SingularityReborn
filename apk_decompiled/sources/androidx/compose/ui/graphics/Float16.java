package androidx.compose.ui.graphics;

import defpackage.cq;
import defpackage.dq;
import defpackage.q10;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m4870constructorimpl((short) 5120);
    private static final short LowestValue = m4870constructorimpl((short) -1025);
    private static final short MaxValue = m4870constructorimpl((short) 31743);
    private static final short MinNormal = m4870constructorimpl((short) 1024);
    private static final short MinValue = m4870constructorimpl((short) 1);
    private static final short NaN = m4870constructorimpl((short) 32256);
    private static final short NegativeInfinity = m4870constructorimpl((short) -1024);
    private static final short NegativeZero = m4870constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m4870constructorimpl((short) 31744);
    private static final short PositiveZero = m4870constructorimpl((short) 0);

    private /* synthetic */ Float16(short s) {
        this.halfValue = s;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m4864absoluteValueslo4al4(short s) {
        return m4870constructorimpl((short) (s & Short.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m4865boximpl(short s) {
        return new Float16(s);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m4866ceilslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & Short.MAX_VALUE;
        if (i2 < 15360) {
            i = ((-((~(i >> 15)) & (i2 == 0 ? 0 : 1))) & 15360) | (s & 32768);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + (((i >> 15) - 1) & i3)) & (~i3);
        }
        return m4870constructorimpl((short) i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m4867compareTo41bOqos(short s, short s2) {
        if (m4880isNaNimpl(s)) {
            return !m4880isNaNimpl(s2) ? 1 : 0;
        }
        if (m4880isNaNimpl(s2)) {
            return -1;
        }
        return q10.h((s & 32768) != 0 ? Fields.CompositingStrategy - (s & 65535) : s & 65535, (s2 & 32768) != 0 ? Fields.CompositingStrategy - (s2 & 65535) : s2 & 65535);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m4869constructorimpl(float f) {
        int i;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = floatToRawIntBits >>> 31;
        int i3 = (floatToRawIntBits >>> 23) & 255;
        int i4 = 8388607 & floatToRawIntBits;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = i3 - 112;
            if (i7 >= 31) {
                i5 = 49;
            } else if (i7 > 0) {
                i6 = i4 >> 13;
                if ((floatToRawIntBits & Fields.TransformOrigin) != 0) {
                    i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    return m4870constructorimpl((short) i);
                }
                i5 = i7;
            } else if (i7 >= -10) {
                int i8 = (8388608 | i4) >> (1 - i7);
                if ((i8 & Fields.TransformOrigin) != 0) {
                    i8 += 8192;
                }
                i5 = 0;
                i6 = i8 >> 13;
            } else {
                i5 = 0;
            }
        } else if (i4 != 0) {
            i6 = Fields.RotationY;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return m4870constructorimpl((short) i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4871equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).m4896unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4872equalsimpl0(short s, short s2) {
        return s == s2;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m4873floorslo4al4(short s) {
        int i = s & 65535;
        int i2 = s & Short.MAX_VALUE;
        if (i2 < 15360) {
            i = (s & 32768) | ((i <= 32768 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + ((-(i >> 15)) & i3)) & (~i3);
        }
        return m4870constructorimpl((short) i);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m4874getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m4875getSignslo4al4(short s) {
        int i = s & Short.MAX_VALUE;
        if (!((i > 31744) | (i == 0))) {
            i = (s & 32768) | 15360;
        }
        return m4870constructorimpl((short) i);
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m4876getSignificandimpl(short s) {
        return s & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4877hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m4878isFiniteimpl(short s) {
        return (s & Short.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m4879isInfiniteimpl(short s) {
        return (s & Short.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m4880isNaNimpl(short s) {
        return (s & Short.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m4881isNormalizedimpl(short s) {
        int i = s & 31744;
        return (i != 0) & (i != 31744);
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m4882roundslo4al4(short s) {
        int i = s & 65535;
        int i2 = s & Short.MAX_VALUE;
        if (i2 < 15360) {
            i = (s & 32768) | ((i2 < 14336 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = i2 >> 10;
            i = (i + (1 << (24 - i3))) & (~((1 << (25 - i3)) - 1));
        }
        return m4870constructorimpl((short) i);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m4883toBitsimpl(short s) {
        if (m4880isNaNimpl(s)) {
            return 32256;
        }
        return s & 65535;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m4884toByteimpl(short s) {
        return (byte) m4886toFloatimpl(s);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m4885toDoubleimpl(short s) {
        return m4886toFloatimpl(s);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m4886toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m4887toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        int i = 65535 & s;
        int i2 = i >>> 15;
        int i3 = (i >>> 10) & 31;
        int i4 = s & 1023;
        if (i3 != 31) {
            if (i2 == 1) {
                sb.append('-');
            }
            if (i3 != 0) {
                sb.append("0x1.");
                cq.f(16);
                String num = Integer.toString(i4, 16);
                num.getClass();
                Pattern compile = Pattern.compile("0{2,}$");
                compile.getClass();
                String replaceFirst = compile.matcher(num).replaceFirst("");
                replaceFirst.getClass();
                sb.append(replaceFirst);
                sb.append('p');
                sb.append(String.valueOf(i3 - 15));
            } else if (i4 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                cq.f(16);
                String num2 = Integer.toString(i4, 16);
                num2.getClass();
                Pattern compile2 = Pattern.compile("0{2,}$");
                compile2.getClass();
                String replaceFirst2 = compile2.matcher(num2).replaceFirst("");
                replaceFirst2.getClass();
                sb.append(replaceFirst2);
                sb.append("p-14");
            }
        } else if (i4 == 0) {
            if (i2 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m4888toIntimpl(short s) {
        return (int) m4886toFloatimpl(s);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m4889toLongimpl(short s) {
        return (long) m4886toFloatimpl(s);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m4890toRawBitsimpl(short s) {
        return s & 65535;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m4891toShortimpl(short s) {
        return (short) m4886toFloatimpl(s);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4892toStringimpl(short s) {
        return String.valueOf(m4886toFloatimpl(s));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m4893truncslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & Short.MAX_VALUE;
        if (i2 < 15360) {
            i = 32768 & s;
        } else if (i2 < 25600) {
            i &= ~((1 << (25 - (i2 >> 10))) - 1);
        }
        return m4870constructorimpl((short) i);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m4894withSignqCeQghg(short s, short s2) {
        return m4870constructorimpl((short) ((s & Short.MAX_VALUE) | (s2 & 32768)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m4895compareTo41bOqos(float16.m4896unboximpl());
    }

    public boolean equals(Object obj) {
        return m4871equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m4877hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m4892toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m4896unboximpl() {
        return this.halfValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m4897getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m4898getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m4899getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m4900getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m4901getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m4902getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m4903getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m4904getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m4905getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m4906getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m4895compareTo41bOqos(short s) {
        return m4867compareTo41bOqos(this.halfValue, s);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m4868constructorimpl(double d) {
        return m4869constructorimpl((float) d);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m4870constructorimpl(short s) {
        return s;
    }
}
