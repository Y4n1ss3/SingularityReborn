package androidx.compose.ui.unit.fontscaling;

import defpackage.dq;
import defpackage.o;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontScaleConverterTable implements FontScaleConverter {
    private final float[] mFromSpValues;
    private final float[] mToDpValues;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            o.m("Array lengths must match and be nonzero");
            throw null;
        }
        this.mFromSpValues = fArr;
        this.mToDpValues = fArr2;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f) {
        return Companion.lookupAndInterpolate(f, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f) {
        return Companion.lookupAndInterpolate(f, this.mFromSpValues, this.mToDpValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues);
    }

    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mToDpValues) + (Arrays.hashCode(this.mFromSpValues) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.mFromSpValues);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.mToDpValues);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float f, float[] fArr, float[] fArr2) {
            float f2;
            float f3;
            float f4;
            float constrainedMap;
            float abs = Math.abs(f);
            float signum = Math.signum(f);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                constrainedMap = fArr2[binarySearch];
            } else {
                int i = -(binarySearch + 1);
                int i2 = i - 1;
                float f5 = 0.0f;
                if (i2 >= fArr.length - 1) {
                    float f6 = fArr[fArr.length - 1];
                    float f7 = fArr2[fArr.length - 1];
                    if (f6 == 0.0f) {
                        return 0.0f;
                    }
                    return (f7 / f6) * f;
                }
                if (i2 == -1) {
                    f2 = fArr[0];
                    f4 = fArr2[0];
                    f3 = 0.0f;
                } else {
                    f5 = fArr[i2];
                    f2 = fArr[i];
                    f3 = fArr2[i2];
                    f4 = fArr2[i];
                }
                constrainedMap = MathUtils.INSTANCE.constrainedMap(f3, f4, f5, f2, abs);
            }
            return signum * constrainedMap;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    public static /* synthetic */ void getMToDpValues$annotations() {
    }
}
