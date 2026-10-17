package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    private int[] ops = OpArray.m1314constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m1309mapfzxv0v0(int i, boolean z) {
        int i2;
        int i3;
        int[] iArr = this.ops;
        int i4 = this.opsSize;
        if (i4 >= 0) {
            if (z) {
                i3 = i;
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = i5 * 3;
                    int i7 = iArr[i6];
                    int i8 = iArr[i6 + 1];
                    int i9 = iArr[i6 + 2];
                    long m1310mapStepC6uMEY = m1310mapStepC6uMEY(i3, i7, i8, i9, z);
                    long m1310mapStepC6uMEY2 = m1310mapStepC6uMEY(i, i7, i8, i9, z);
                    i3 = Math.min(TextRange.m7060getStartimpl(m1310mapStepC6uMEY), TextRange.m7060getStartimpl(m1310mapStepC6uMEY2));
                    i = Math.max(TextRange.m7055getEndimpl(m1310mapStepC6uMEY), TextRange.m7055getEndimpl(m1310mapStepC6uMEY2));
                }
            } else {
                int i10 = i4 - 1;
                i3 = i;
                while (-1 < i10) {
                    int i11 = i10 * 3;
                    int i12 = iArr[i11];
                    int i13 = iArr[i11 + 1];
                    int i14 = iArr[i11 + 2];
                    OffsetMappingCalculator offsetMappingCalculator = this;
                    boolean z2 = z;
                    long m1310mapStepC6uMEY3 = offsetMappingCalculator.m1310mapStepC6uMEY(i3, i12, i13, i14, z2);
                    long m1310mapStepC6uMEY4 = offsetMappingCalculator.m1310mapStepC6uMEY(i, i12, i13, i14, z2);
                    i3 = Math.min(TextRange.m7060getStartimpl(m1310mapStepC6uMEY3), TextRange.m7060getStartimpl(m1310mapStepC6uMEY4));
                    i = Math.max(TextRange.m7055getEndimpl(m1310mapStepC6uMEY3), TextRange.m7055getEndimpl(m1310mapStepC6uMEY4));
                    i10--;
                    this = offsetMappingCalculator;
                    z = z2;
                }
            }
            i2 = i;
            i = i3;
        } else {
            i2 = i;
        }
        return TextRangeKt.TextRange(i, i2);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m1310mapStepC6uMEY(int i, int i2, int i3, int i4, boolean z) {
        int i5 = z ? i3 : i4;
        if (z) {
            i3 = i4;
        }
        return i < i2 ? TextRangeKt.TextRange(i) : i == i2 ? i5 == 0 ? TextRangeKt.TextRange(i2, i3 + i2) : TextRangeKt.TextRange(i2) : i < i2 + i5 ? i3 == 0 ? TextRangeKt.TextRange(i2) : TextRangeKt.TextRange(i2, i3 + i2) : TextRangeKt.TextRange((i - i5) + i3);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m1311mapFromDestjx7JFs(int i) {
        return m1309mapfzxv0v0(i, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m1312mapFromSourcejx7JFs(int i) {
        return m1309mapfzxv0v0(i, true);
    }

    public final void recordEditOperation(int i, int i2, int i3) {
        if (!(i3 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + i3);
        }
        int min = Math.min(i, i2);
        int max = Math.max(min, i2) - min;
        if (max >= 2 || max != i3) {
            int i4 = this.opsSize + 1;
            if (i4 > OpArray.m1321getSizeimpl(this.ops)) {
                this.ops = OpArray.m1316copyOfpSmdads(this.ops, Math.max(i4 * 2, OpArray.m1321getSizeimpl(this.ops) * 2));
            }
            OpArray.m1323setimpl(this.ops, this.opsSize, min, max, i3);
            this.opsSize = i4;
        }
    }
}
