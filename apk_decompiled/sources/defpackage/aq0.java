package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class aq0 {
    public final my a;
    public final ky b;
    public final oy c;
    public long[] d;
    public Object[] e;
    public Object[] f;
    public long[] g;
    public int h;
    public int i;
    public int j;
    public final int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public aq0() {
        yp0 yp0Var = yp0.e;
        this.a = xp0.d;
        this.b = yp0Var;
        this.c = zp0.d;
        this.d = ql0.a;
        Object[] objArr = p10.d;
        this.e = objArr;
        this.f = objArr;
        this.g = d41.j;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.k = 16;
        c(ql0.d(16));
    }

    public final int a(int i) {
        int i2 = this.h;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.d;
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        int i;
        int hashCode = obj.hashCode() * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.h;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.d;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (q10.b(this.e[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            long[] jArr2 = this.g;
            jArr2[i] = (jArr2[i] & 4611686018427387903L) | 4611686018427387904L;
            return this.f[i];
        }
        Object invoke = this.b.invoke(obj);
        if (invoke == null) {
            return null;
        }
        d(obj, invoke);
        return invoke;
    }

    public final void c(int i) {
        long[] jArr;
        long[] jArr2;
        Object[] objArr = p10.d;
        int max = i > 0 ? Math.max(7, ql0.c(i)) : 0;
        this.h = max;
        if (max == 0) {
            jArr = ql0.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            int i3 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr3[i3] = (jArr3[i3] & (~j)) | j;
            jArr = jArr3;
        }
        this.d = jArr;
        this.i = ql0.a(this.h) - this.j;
        this.e = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.f = objArr;
        if (max == 0) {
            jArr2 = d41.j;
        } else {
            long[] jArr4 = new long[max];
            Arrays.fill(jArr4, 0, max, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.g = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c6, code lost:
    
        r7 = (int) (r10[r8] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02b7, code lost:
    
        r7 = (int) (r10[r7] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d2, code lost:
    
        r3 = r48.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d7, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d9, code lost:
    
        r48.m = (int) (r10[r3] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e0, code lost:
    
        r3 = r48.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e2, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02e4, code lost:
    
        r48.n = (int) (r10[r3] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02eb, code lost:
    
        r3 = r48.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ed, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ef, code lost:
    
        r48.o = (int) (r10[r3] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02fa, code lost:
    
        r37 = r5;
        r33 = 255;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0308, code lost:
    
        r3 = defpackage.ql0.b(r48.h);
        r4 = r48.d;
        r5 = r48.e;
        r6 = r48.f;
        r7 = r48.g;
        r8 = r48.h;
        r9 = new int[r8];
        c(r3);
        r3 = r48.d;
        r10 = r48.e;
        r11 = r48.f;
        r12 = r48.g;
        r13 = r48.h;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0329, code lost:
    
        if (r15 >= r8) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0339, code lost:
    
        if (((r4[r15 >> 3] >> ((r15 & 7) << 3)) & 255) >= r29) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x033b, code lost:
    
        r14 = r5[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x033d, code lost:
    
        if (r14 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x033f, code lost:
    
        r17 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0346, code lost:
    
        r17 = r17 * r25;
        r17 = r17 ^ (r17 << 16);
        r18 = r3;
        r3 = a(r17 >>> 7);
        r3 = r17 & 127;
        r17 = r4;
        r27 = r3 >> 3;
        r28 = (r3 & 7) << 3;
        r3 = (r18[r27] & (~(255 << r28))) | (r3 << r28);
        r18[r27] = r3;
        r18[(((r3 - 7) & r13) + (r13 & 7)) >> 3] = r3;
        r10[r3] = r14;
        r11[r3] = r6[r15];
        r12[r3] = r7[r15];
        r9[r15] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x038d, code lost:
    
        r15 = r15 + 1;
        r4 = r17;
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0344, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0389, code lost:
    
        r18 = r3;
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0394, code lost:
    
        r3 = r48.g;
        r4 = r3.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0399, code lost:
    
        if (r15 >= r4) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x039b, code lost:
    
        r5 = r3[r15];
        r7 = (int) ((r5 >> 31) & 2147483647L);
        r8 = (int) (r5 & 2147483647L);
        r5 = r5 & (-4611686018427387904L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03aa, code lost:
    
        if (r7 != Integer.MAX_VALUE) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03ac, code lost:
    
        r7 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03b2, code lost:
    
        r5 = (r5 | r7) << 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03b6, code lost:
    
        if (r8 != Integer.MAX_VALUE) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03b8, code lost:
    
        r7 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03be, code lost:
    
        r3[r15] = r5 | r7;
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ba, code lost:
    
        r7 = r9[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03ae, code lost:
    
        r7 = r9[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03c5, code lost:
    
        r3 = r48.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03ca, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03cc, code lost:
    
        r48.m = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03d0, code lost:
    
        r3 = r48.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03d2, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03d4, code lost:
    
        r48.n = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03d8, code lost:
    
        r3 = r48.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03da, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03dc, code lost:
    
        r48.o = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0303, code lost:
    
        r31 = r10;
        r29 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00a7, code lost:
    
        r31 = r10;
        r33 = 255;
        r16 = 0;
        r29 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        r26 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r3 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r48.i != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (((r48.d[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        r3 = r48.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r3 <= 8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        r29 = 128;
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (java.lang.Long.compareUnsigned(r48.j * 32, r3 * 25) > 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        r3 = r48.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        if (r3 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        r37 = r5;
        r33 = 255;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03e2, code lost:
    
        r3 = a(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03e6, code lost:
    
        r48.j++;
        r4 = r48.i;
        r5 = r48.d;
        r6 = r3 >> 3;
        r7 = r5[r6];
        r9 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03fe, code lost:
    
        if (((r7 >> r9) & r33) != r29) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0400, code lost:
    
        r16 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0402, code lost:
    
        r48.i = r4 - r16;
        r4 = r48.h;
        r7 = (r7 & (~(r33 << r9))) | (r31 << r9);
        r5[r6] = r7;
        r5[(((r3 - 7) & r4) + (r4 & 7)) >> 3] = r7;
        r14 = ~r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        r6 = r48.h;
        r7 = r48.e;
        r8 = r48.f;
        r9 = r48.g;
        r10 = new long[r6];
        r33 = 255;
        r13 = 8;
        java.util.Arrays.fill(r10, 0, r6, androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask);
        r15 = (r6 + 7) >> 3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        if (r11 >= r15) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        r39 = r13;
        r13 = r3[r11] & (-9187201950435737472L);
        r3[r11] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r11 = r11 + 1;
        r5 = r5;
        r13 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        r37 = r5;
        r12 = 7;
        r4 = r3.length;
        r5 = r4 - 1;
        r4 = r4 - 2;
        r3[r4] = (r3[r4] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
    
        if (r15 == r6) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
    
        r11 = r15 >> 3;
        r17 = (r15 & 7) << 3;
        r13 = (r3[r11] >> r17) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0148, code lost:
    
        if (r13 != 128) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r13 == 254) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r13 = r7[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        if (r13 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        r13 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        r13 = r13 * r25;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r4 = a(r14);
        r5 = r14 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017a, code lost:
    
        if ((((r4 - r5) & r6) / 8) != (((r15 - r5) & r6) / 8)) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a9, code lost:
    
        r41 = r12;
        r5 = r4 >> 3;
        r42 = r3[r5];
        r12 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01be, code lost:
    
        if (((r42 >> r12) & 255) != 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c0, code lost:
    
        r46 = r6;
        r3[r5] = (r42 & (~(255 << r12))) | ((r13 & 127) << r12);
        r3[r11] = (r3[r11] & (~(255 << r17))) | (128 << r17);
        r7[r4] = r7[r15];
        r7[r15] = null;
        r8[r4] = r8[r15];
        r8[r15] = null;
        r9[r4] = r9[r15];
        r9[r15] = 4611686018427387903L;
        r5 = (int) ((r10[r15] >> 32) & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fe, code lost:
    
        if (r5 == Integer.MAX_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0200, code lost:
    
        r10[r5] = (r10[r5] & (-4294967296L)) | r4;
        r10[r15] = (r10[r15] & 4294967295L) | (-4294967296L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021a, code lost:
    
        r10[r4] = (r15 << 32) | 2147483647L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0278, code lost:
    
        r3[r3.length - 1] = r3[0];
        r15 = r15 + 1;
        r12 = r41;
        r6 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0211, code lost:
    
        r10[r15] = 9223372032559808512L | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0222, code lost:
    
        r46 = r6;
        r3[r5] = ((r13 & 127) << r12) | (r42 & (~(255 << r12)));
        r5 = r7[r4];
        r7[r4] = r7[r15];
        r7[r15] = r5;
        r5 = r8[r4];
        r8[r4] = r8[r15];
        r8[r15] = r5;
        r5 = r9[r4];
        r9[r4] = r9[r15];
        r9[r15] = r5;
        r5 = (int) ((r10[r15] >> 32) & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0254, code lost:
    
        if (r5 == Integer.MAX_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0256, code lost:
    
        r13 = r4;
        r10[r5] = (r10[r5] & (-4294967296L)) | r13;
        r10[r15] = (r10[r15] & 4294967295L) | (r13 << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x026f, code lost:
    
        r10[r4] = (r5 << 32) | r15;
        r15 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0268, code lost:
    
        r5 = r4;
        r10[r15] = r5 | (r5 << 32);
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017c, code lost:
    
        r41 = r12;
        r3[r11] = ((r13 & 127) << r17) | (r3[r11] & (~(255 << r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0193, code lost:
    
        if (r10[r15] != androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0195, code lost:
    
        r4 = r15;
        r10[r15] = r4 | (r4 << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019b, code lost:
    
        r3[r3.length - 1] = r3[0];
        r15 = r15 + 1;
        r12 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015b, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0289, code lost:
    
        r16 = 0;
        r48.i = defpackage.ql0.a(r48.h) - r48.j;
        r3 = r48.g;
        r4 = r3.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a2, code lost:
    
        if (r15 >= r4) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02a4, code lost:
    
        r5 = r3[r15];
        r7 = (int) ((r5 >> 31) & 2147483647L);
        r8 = (int) (r5 & 2147483647L);
        r5 = r5 & (-4611686018427387904L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b3, code lost:
    
        if (r7 != Integer.MAX_VALUE) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02b5, code lost:
    
        r7 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02bc, code lost:
    
        r5 = (r5 | r7) << 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02c0, code lost:
    
        if (r8 != Integer.MAX_VALUE) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02c2, code lost:
    
        r7 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02cb, code lost:
    
        r3[r15] = r5 | r7;
        r15 = r15 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = -862048943;
        int hashCode = obj.hashCode() * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.h;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.d;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            int i13 = i9;
            long j = (((-i11) >> 63) & (jArr[i10 + 1] << (64 - i11))) | (jArr[i10] >>> i11);
            long j2 = i6;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                i = i3;
                if (j4 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j4) >> 3) + i8) & i7;
                int i14 = i12;
                if (q10.b(this.e[i2], obj)) {
                    break loop0;
                }
                j4 &= j4 - 1;
                i3 = i;
                i12 = i14;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i;
        }
        if (i2 < 0) {
            i2 = ~i2;
        }
        Object[] objArr = this.f;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        this.e[i2] = obj;
        int i15 = this.l;
        my myVar = this.a;
        int intValue = ((Number) myVar.invoke(obj, obj2)).intValue() + i15;
        this.l = intValue;
        int i16 = this.k;
        if (obj3 != null) {
            this.l = intValue - ((Number) myVar.invoke(obj, obj3)).intValue();
            this.c.invoke(obj, obj3, obj2, Boolean.FALSE);
            e(i16);
            return;
        }
        e(i16);
        long[] jArr2 = this.g;
        int i17 = this.m;
        jArr2[i2] = (i17 & 2147483647L) | 4611686016279904256L;
        if (i17 != Integer.MAX_VALUE) {
            jArr2[i17] = (jArr2[i17] & (-4611686016279904257L)) | ((i2 & 2147483647L) << 31);
        }
        this.m = i2;
        if (this.n == Integer.MAX_VALUE) {
            this.n = i2;
        }
    }

    public final void e(int i) {
        char c;
        long j;
        while (this.l > i && this.j != 0) {
            long[] jArr = this.g;
            int i2 = this.o;
            if (i2 == Integer.MAX_VALUE) {
                i2 = this.n;
            }
            while (i2 != Integer.MAX_VALUE) {
                long j2 = jArr[i2];
                if (((int) ((j2 >> 62) & 1)) == 0) {
                    break;
                }
                int i3 = (int) ((j2 >> 31) & 2147483647L);
                jArr[i2] = 4611686018427387903L & j2;
                i2 = i3 != Integer.MAX_VALUE ? i3 : this.n;
            }
            int i4 = (int) ((jArr[i2] >> 31) & 2147483647L);
            if (i4 == Integer.MAX_VALUE) {
                i4 = Integer.MAX_VALUE;
            }
            this.o = i4;
            if (i2 == Integer.MAX_VALUE) {
                return;
            }
            Object obj = this.e[i2];
            obj.getClass();
            this.j--;
            long[] jArr2 = this.d;
            int i5 = this.h;
            int i6 = i2 >> 3;
            int i7 = (i2 & 7) << 3;
            long j3 = ((~(255 << i7)) & jArr2[i6]) | (254 << i7);
            jArr2[i6] = j3;
            jArr2[(((i2 - 7) & i5) + (i5 & 7)) >> 3] = j3;
            this.e[i2] = null;
            Object[] objArr = this.f;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            long[] jArr3 = this.g;
            long j4 = jArr3[i2];
            int i8 = (int) ((j4 >> 31) & 2147483647L);
            int i9 = (int) (j4 & 2147483647L);
            if (i8 != Integer.MAX_VALUE) {
                c = 31;
                j = 2147483647L;
                jArr3[i8] = (i9 & 2147483647L) | (jArr3[i8] & (-2147483648L));
            } else {
                c = 31;
                j = 2147483647L;
                this.m = i9;
            }
            if (i9 != Integer.MAX_VALUE) {
                jArr3[i9] = (jArr3[i9] & (-4611686016279904257L)) | ((i8 & j) << c);
            } else {
                this.n = i8;
            }
            if (this.o == i2) {
                this.o = i8;
            }
            jArr3[i2] = 4611686018427387903L;
            if (obj2 != null) {
                this.l -= ((Number) this.a.invoke(obj, obj2)).intValue();
                this.c.invoke(obj, obj2, null, Boolean.TRUE);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aq0)) {
            return false;
        }
        aq0 aq0Var = (aq0) obj;
        if (aq0Var.l != this.l || aq0Var.j != this.j) {
            return false;
        }
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        long[] jArr = this.d;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            obj2.getClass();
                            Object obj3 = objArr2[i4];
                            obj3.getClass();
                            if (!obj3.equals(aq0Var.b(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        long[] jArr = this.d;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        obj.getClass();
                        Object obj2 = objArr2[i5];
                        obj2.getClass();
                        i2 += obj2.hashCode() ^ obj.hashCode();
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SieveCache[maxSize=");
        sb.append(this.k);
        sb.append(", size=");
        sb.append(this.l);
        sb.append(", capacity=");
        sb.append(this.h);
        sb.append(", count=");
        return fc.e(sb, this.j, ']');
    }
}
