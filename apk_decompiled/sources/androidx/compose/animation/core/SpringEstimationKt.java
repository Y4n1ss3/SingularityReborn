package androidx.compose.animation.core;

import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5, double d6) {
        double sqrt = d2 / (Math.sqrt(d * d3) * 2.0d);
        double d7 = (d2 * d2) - ((4.0d * d3) * d);
        double d8 = 1.0d / (2.0d * d3);
        double sqrt2 = d7 < 0.0d ? 0.0d : Math.sqrt(d7);
        double d9 = -d2;
        return estimateDurationInternal((d9 + sqrt2) * d8, (d7 < 0.0d ? Math.sqrt(Math.abs(d7)) : 0.0d) * d8, (d9 - sqrt2) * d8, sqrt, d4, d5, d6);
    }

    private static final double estimateCriticallyDamped(double d, double d2, double d3, double d4) {
        double d5;
        double d6 = d4;
        double d7 = d * d2;
        double d8 = d3 - d7;
        double log = Math.log(Math.abs(d6 / d2)) / d;
        double log2 = Math.log(Math.abs(d6 / d8));
        int i = 0;
        double d9 = log2;
        for (int i2 = 0; i2 < 6; i2++) {
            d9 = log2 - Math.log(Math.abs(d9 / d));
        }
        double d10 = d9 / d;
        if (!((Double.doubleToRawLongBits(log) & SnapshotId_jvmKt.SnapshotIdMax) < 9218868437227405312L)) {
            log = d10;
        } else if ((Double.doubleToRawLongBits(d10) & SnapshotId_jvmKt.SnapshotIdMax) < 9218868437227405312L) {
            log = Math.max(log, d10);
        }
        double d11 = (-(d7 + d8)) / (d * d8);
        double d12 = d * d11;
        double exp = (Math.exp(d12) * d8 * d11) + (Math.exp(d12) * d2);
        if (!Double.isNaN(d11) && d11 > 0.0d) {
            if (d11 <= 0.0d || (-exp) >= d6) {
                log = (-(2.0d / d)) - (d2 / d8);
                d5 = Double.MAX_VALUE;
                while (d5 > 0.001d && i < 100) {
                    i++;
                    double d13 = d * log;
                    double exp2 = log - (((Math.exp(d13) * ((d8 * log) + d2)) + d6) / (Math.exp(d13) * (((1.0d + d13) * d8) + d7)));
                    d5 = Math.abs(log - exp2);
                    log = exp2;
                }
                return log;
            }
            if (d8 < 0.0d && d2 > 0.0d) {
                log = 0.0d;
            }
        }
        d6 = -d6;
        d5 = Double.MAX_VALUE;
        while (d5 > 0.001d) {
            i++;
            double d132 = d * log;
            double exp22 = log - (((Math.exp(d132) * ((d8 * log) + d2)) + d6) / (Math.exp(d132) * (((1.0d + d132) * d8) + d7)));
            d5 = Math.abs(log - exp22);
            log = exp22;
        }
        return log;
    }

    private static final long estimateDurationInternal(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d5;
        if (d6 == 0.0d && d8 == 0.0d) {
            return 0L;
        }
        if (d6 < 0.0d) {
            d8 = -d8;
        }
        double d9 = d8;
        double abs = Math.abs(d6);
        return (long) ((d4 > 1.0d ? estimateOverDamped(d, d3, abs, d9, d7) : d4 < 1.0d ? estimateUnderDamped(d, d2, abs, d9, d7) : estimateCriticallyDamped(d, abs, d9, d7)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final double estimateOverDamped(double d, double d2, double d3, double d4, double d5) {
        double d6;
        double d7 = d5;
        double d8 = d - d2;
        double d9 = ((d * d3) - d4) / d8;
        double d10 = d3 - d9;
        double log = Math.log(Math.abs(d7 / d10)) / d;
        double log2 = Math.log(Math.abs(d7 / d9)) / d2;
        if ((Double.doubleToRawLongBits(log) & SnapshotId_jvmKt.SnapshotIdMax) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(log2) & SnapshotId_jvmKt.SnapshotIdMax) < 9218868437227405312L) {
                log = Math.max(log, log2);
            }
        } else {
            log = log2;
        }
        double d11 = d10 * d;
        double log3 = Math.log(d11 / ((-d9) * d2)) / (d2 - d);
        if (!Double.isNaN(log3) && log3 > 0.0d) {
            if (log3 <= 0.0d || (-estimateOverDamped$xInflection(d10, d, log3, d9, d2)) >= d7) {
                log = Math.log((-((d9 * d2) * d2)) / (d11 * d)) / d8;
                d6 = d9 * d2;
                if (Math.abs((Math.exp(d2 * log) * d6) + (Math.exp(d * log) * d11)) >= 1.0E-4d) {
                    return log;
                }
                double d12 = Double.MAX_VALUE;
                int i = 0;
                while (d12 > 0.001d && i < 100) {
                    i++;
                    double d13 = d * log;
                    double d14 = d2 * log;
                    double exp = log - ((((Math.exp(d14) * d9) + (Math.exp(d13) * d10)) + d7) / ((Math.exp(d14) * d6) + (Math.exp(d13) * d11)));
                    d12 = Math.abs(log - exp);
                    log = exp;
                }
                return log;
            }
            if (d9 > 0.0d && d10 < 0.0d) {
                log = 0.0d;
            }
        }
        d7 = -d7;
        d6 = d9 * d2;
        if (Math.abs((Math.exp(d2 * log) * d6) + (Math.exp(d * log) * d11)) >= 1.0E-4d) {
        }
    }

    private static final double estimateOverDamped$xInflection(double d, double d2, double d3, double d4, double d5) {
        return (Math.exp(d5 * d3) * d4) + (Math.exp(d2 * d3) * d);
    }

    private static final double estimateUnderDamped(double d, double d2, double d3, double d4, double d5) {
        double d6 = (d4 - (d * d3)) / d2;
        return Math.log(d5 / Math.sqrt((d6 * d6) + (d3 * d3))) / d;
    }

    private static final boolean isNotFinite(double d) {
        return !((Double.doubleToRawLongBits(d) & SnapshotId_jvmKt.SnapshotIdMax) < 9218868437227405312L);
    }

    private static final double iterateNewtonsMethod(double d, ky kyVar, ky kyVar2) {
        return d - (((Number) kyVar.invoke(Double.valueOf(d))).doubleValue() / ((Number) kyVar2.invoke(Double.valueOf(d))).doubleValue());
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        double sqrt = Math.sqrt(d) * 2.0d * d2;
        double d6 = (sqrt * sqrt) - (4.0d * d);
        double sqrt2 = d6 < 0.0d ? 0.0d : Math.sqrt(d6);
        double sqrt3 = d6 < 0.0d ? Math.sqrt(Math.abs(d6)) : 0.0d;
        double d7 = -sqrt;
        return estimateDurationInternal((d7 + sqrt2) * 0.5d, sqrt3 * 0.5d, (d7 - sqrt2) * 0.5d, d2, d3, d4, d5);
    }

    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        return f2 == 0.0f ? MAX_LONG_MILLIS : estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }
}
