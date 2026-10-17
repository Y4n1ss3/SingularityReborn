package androidx.compose.material3.carousel;

import defpackage.dq;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    public Arrangement(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.priority = i;
        this.smallSize = f;
        this.smallCount = i2;
        this.mediumSize = f2;
        this.mediumCount = i3;
        this.largeSize = f3;
        this.largeCount = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float f) {
        if (isValid()) {
            return Math.abs(f - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    private final boolean isValid() {
        int i = this.largeCount;
        if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f = this.largeSize;
        float f2 = this.mediumSize;
        return f > f2 && f2 > this.smallSize;
    }

    public final int getLargeCount() {
        return this.largeCount;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final int getMediumCount() {
        return this.mediumCount;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final int getSmallCount() {
        return this.smallCount;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final int itemCount() {
        return this.largeCount + this.mediumCount + this.smallCount;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private final float calculateLargeSize(float f, int i, float f2, int i2, int i3) {
            float f3 = i;
            float f4 = i2 / 2.0f;
            return (f - ((f3 + f4) * f2)) / (i3 + f4);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Arrangement fit(int i, float f, float f2, int i2, float f3, float f4, float f5, int i3, float f6, int i4, float f7) {
            float max;
            float calculateLargeSize;
            float f8;
            float f9;
            float f10 = f - ((((i4 + i3) + i2) - 1) * f2);
            float g = y80.g(f3, f4, f5);
            float f11 = i4;
            float f12 = i3;
            float f13 = i2;
            float f14 = f10 - ((g * f13) + ((f6 * f12) + (f7 * f11)));
            if (i2 <= 0 || f14 <= 0.0f) {
                if (i2 > 0 && f14 < 0.0f) {
                    max = Math.max(f14 / f13, f4 - g);
                }
                float f15 = i2 <= 0 ? g : 0.0f;
                calculateLargeSize = calculateLargeSize(f10, i2, f15, i3, i4);
                float f16 = f15;
                f8 = (calculateLargeSize + f16) / 2.0f;
                if (i3 > 0 && calculateLargeSize != f7) {
                    f9 = (f7 - calculateLargeSize) * f11;
                    float min = Math.min(Math.abs(f9), 0.1f * f8 * f12);
                    if (f9 <= 0.0f) {
                        f8 -= min / f12;
                        calculateLargeSize += min / f11;
                    } else {
                        f8 += min / f12;
                        calculateLargeSize -= min / f11;
                    }
                }
                return new Arrangement(i, f16, i2, f8, i3, calculateLargeSize, i4);
            }
            max = Math.min(f14 / f13, f5 - g);
            g += max;
            if (i2 <= 0) {
            }
            calculateLargeSize = calculateLargeSize(f10, i2, f15, i3, i4);
            float f162 = f15;
            f8 = (calculateLargeSize + f162) / 2.0f;
            if (i3 > 0) {
                f9 = (f7 - calculateLargeSize) * f11;
                float min2 = Math.min(Math.abs(f9), 0.1f * f8 * f12);
                if (f9 <= 0.0f) {
                }
            }
            return new Arrangement(i, f162, i2, f8, i3, calculateLargeSize, i4);
        }

        public final Arrangement findLowestCostArrangement(float f, float f2, float f3, float f4, float f5, int[] iArr, float f6, int[] iArr2, float f7, int[] iArr3) {
            int[] iArr4 = iArr;
            int length = iArr3.length;
            Arrangement arrangement = null;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr3[i2];
                int length2 = iArr2.length;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = iArr2[i4];
                    int length3 = iArr4.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = i4;
                        int i8 = iArr4[i6];
                        Arrangement arrangement2 = arrangement;
                        int i9 = i2;
                        int i10 = length2;
                        int i11 = length3;
                        int i12 = i6;
                        Arrangement fit = fit(i, f, f2, i8, f3, f4, f5, i5, f6, i3, f7);
                        if (arrangement2 != null && fit.cost(f7) >= arrangement2.cost(f7)) {
                            arrangement = arrangement2;
                        } else {
                            if (fit.cost(f7) == 0.0f) {
                                return fit;
                            }
                            arrangement = fit;
                        }
                        i++;
                        i6 = i12 + 1;
                        iArr4 = iArr;
                        i2 = i9;
                        length2 = i10;
                        i4 = i7;
                        length3 = i11;
                    }
                    i4++;
                    iArr4 = iArr;
                }
                i2++;
                iArr4 = iArr;
            }
            return arrangement;
        }

        private Companion() {
        }
    }
}
