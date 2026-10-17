package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class oa0 extends m10 {
    public int e;

    public oa0(int i) {
        this.a = ql0.a;
        this.b = n10.a;
        if (i >= 0) {
            g(ql0.d(i));
        } else {
            o.m("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(int i) {
        int i2 = this.d;
        this.b[e(i)] = i;
        return this.d != i2;
    }

    public final void c(oa0 oa0Var) {
        int[] iArr = oa0Var.b;
        long[] jArr = oa0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = iArr[(i << 3) + i3];
                        this.b[e(i4)] = i4;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void d() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != ql0.a) {
            ac.Z(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.e = ql0.a(this.c) - this.d;
    }

    public final int e(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int i3;
        int i4;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.c;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j4 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j5 = i8;
            int i15 = i11;
            int i16 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                int i17 = i5;
                int i18 = i16;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i5 = i17;
                i16 = i18;
            }
            int i19 = i5;
            int i20 = i16;
            char c = '\b';
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int f = f(i7);
                long j8 = 255;
                if (this.e != 0 || ((this.a[f >> 3] >> ((f & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i21 = this.c;
                    if (i21 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(this.d * 32, i21 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i22 = this.c;
                            int[] iArr2 = this.b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = i20;
                            while (i24 < i23) {
                                char c2 = c;
                                long j9 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i24++;
                                j5 = j5;
                                c = c2;
                                j8 = j8;
                            }
                            j = j8;
                            j2 = j5;
                            int e0 = ac.e0(jArr4);
                            int i25 = e0 - 1;
                            long j10 = 72057594037927935L;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[e0] = jArr4[i20];
                            int i26 = i20;
                            while (i26 != i22) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j11 = (jArr4[i27] >> i28) & j;
                                if (j11 != 128 && j11 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i26]) * i19;
                                    int i29 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int f2 = f(i29);
                                    int i30 = i29 & i22;
                                    if (((f2 - i30) & i22) / 8 == ((i26 - i30) & i22) / 8) {
                                        long j12 = j10;
                                        jArr4[i27] = ((r7 & 127) << i28) | ((~(j << i28)) & jArr4[i27]);
                                        jArr4[jArr4.length - i14] = (jArr4[i20] & j12) | Long.MIN_VALUE;
                                        i26++;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i31 = f2 >> 3;
                                        long j14 = jArr4[i31];
                                        int i32 = (f2 & 7) << 3;
                                        if (((j14 >> i32) & j) == 128) {
                                            i3 = i14;
                                            iArr = iArr2;
                                            int i33 = i26;
                                            jArr4[i31] = ((~(j << i32)) & j14) | ((r7 & 127) << i32);
                                            jArr4[i27] = (jArr4[i27] & (~(j << i28))) | (128 << i28);
                                            iArr[f2] = iArr[i33];
                                            iArr[i33] = i20;
                                            i4 = i33;
                                        } else {
                                            iArr = iArr2;
                                            int i34 = i26;
                                            i3 = i14;
                                            jArr4[i31] = ((r7 & 127) << i32) | ((~(j << i32)) & j14);
                                            int i35 = iArr[f2];
                                            iArr[f2] = iArr[i34];
                                            iArr[i34] = i35;
                                            i4 = i34 - 1;
                                        }
                                        jArr4[jArr4.length - i3] = (jArr4[i20] & j13) | Long.MIN_VALUE;
                                        i26 = i4 + i3;
                                        i14 = i3;
                                        j10 = j13;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i2 = i14;
                            this.e = ql0.a(this.c) - this.d;
                            f = f(i7);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int b = ql0.b(this.c);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.b;
                    int i36 = this.c;
                    g(b);
                    long[] jArr6 = this.a;
                    int[] iArr4 = this.b;
                    int i37 = this.c;
                    int i38 = i20;
                    while (i38 < i36) {
                        if (((jArr5[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j3) {
                            int i39 = iArr3[i38];
                            int hashCode3 = Integer.hashCode(i39) * i19;
                            int i40 = hashCode3 ^ (hashCode3 << 16);
                            int f3 = f(i40 >>> 7);
                            long j15 = i40 & 127;
                            int i41 = f3 >> 3;
                            int i42 = (f3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j16 = (jArr6[i41] & (~(255 << i42))) | (j15 << i42);
                            jArr[i41] = j16;
                            jArr[(((f3 - 7) & i37) + (i37 & 7)) >> 3] = j16;
                            iArr4[f3] = i39;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i38++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    f = f(i7);
                }
                this.d += i2;
                int i43 = this.e;
                long[] jArr7 = this.a;
                int i44 = f >> 3;
                long j17 = jArr7[i44];
                int i45 = (f & 7) << 3;
                if (((j17 >> i45) & j) != j3) {
                    i2 = i20;
                }
                this.e = i43 - i2;
                int i46 = this.c;
                long j18 = (j17 & (~(j << i45))) | (j2 << i45);
                jArr7[i44] = j18;
                jArr7[(((f - 7) & i46) + (i46 & 7)) >> 3] = j18;
                return f;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i19;
        }
    }

    public final int f(int i) {
        int i2 = this.c;
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

    public final void g(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, ql0.c(i)) : 0;
        this.c = max;
        if (max == 0) {
            jArr = ql0.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = ql0.a(this.c) - this.d;
        this.b = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        boolean z = i2 >= 0;
        if (z) {
            i(i2);
        }
        return z;
    }

    public final void i(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public /* synthetic */ oa0() {
        this(6);
    }
}
