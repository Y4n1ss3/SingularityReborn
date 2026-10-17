package androidx.compose.foundation;

import android.view.ViewConfiguration;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EdgeEffectCompat_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = log;
        DecelMinusOne = log - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float flingDistance(Density density, float f) {
        double density2 = density.getDensity() * 386.0878f * 160.0f * 0.84f;
        double abs = Math.abs(f) * Inflection;
        float f2 = PlatformFlingScrollFriction;
        return (float) (Math.exp((DecelerationRate / DecelMinusOne) * Math.log(abs / (f2 * density2))) * f2 * density2);
    }
}
