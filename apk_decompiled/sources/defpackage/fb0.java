package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class fb0 extends pl0 {
    public int f;

    public fb0(int i) {
        this.a = ql0.a;
        Object[] objArr = p10.d;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            i(ql0.d(i));
        } else {
            o.m("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void f() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != ql0.a) {
            ac.Z(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ac.X(this.c, 0, this.d, null);
        ac.X(this.b, 0, this.d, null);
        this.f = ql0.a(this.d) - this.e;
    }

    public final int g(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int h(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (q10.b(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int g = g(i4);
                long j8 = 255;
                if (this.f != 0 || ((this.a[g >> 3] >> ((g & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compareUnsigned(this.e * 32, i14 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int e0 = ac.e0(jArr4);
                            int i20 = e0 - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[e0] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int g2 = g(i24);
                                    int i25 = i24 & i16;
                                    if (((g2 - i25) & i16) / i19 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = g2 >> 3;
                                        long j12 = jArr4[i27];
                                        int i28 = (g2 & 7) << 3;
                                        if (((j12 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j12) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[g2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[g2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j12);
                                            Object obj3 = objArr[g2];
                                            objArr[g2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[g2];
                                            objArr3[g2] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i26;
                                        i16 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = ql0.a(this.d) - this.e;
                            g = g(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int b = ql0.b(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i29 = this.d;
                    i(b);
                    long[] jArr6 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i30 = this.d;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i31];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int g3 = g(i32 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i32 & 127;
                            int i33 = g3 >> 3;
                            int i34 = (g3 & 7) << 3;
                            long j14 = (jArr[i33] & (~(255 << i34))) | (j13 << i34);
                            jArr[i33] = j14;
                            jArr[(((g3 - 7) & i30) + (i30 & 7)) >> 3] = j14;
                            objArr6[g3] = obj5;
                            objArr7[g3] = objArr5[i31];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    g = g(i4);
                }
                this.e++;
                int i35 = this.f;
                long[] jArr7 = this.a;
                int i36 = g >> 3;
                long j15 = jArr7[i36];
                int i37 = (g & 7) << 3;
                this.f = i35 - (((j15 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.d;
                long j16 = (j15 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j16;
                jArr7[(((g - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return ~g;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final void i(int i) {
        long[] jArr;
        Object[] objArr = p10.d;
        int max = i > 0 ? Math.max(7, ql0.c(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = ql0.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.a = jArr;
        this.f = ql0.a(this.d) - this.e;
        this.b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (q10.b(this.b[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return k(i);
        }
        return null;
    }

    public final Object k(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void l(Object obj, Object obj2) {
        int h = h(obj);
        if (h < 0) {
            h = ~h;
        }
        this.b[h] = obj;
        this.c[h] = obj2;
    }

    public /* synthetic */ fb0() {
        this(6);
    }
}
