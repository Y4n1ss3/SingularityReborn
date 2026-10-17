package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HapticDefaults {
    public static final int $stable = 0;
    public static final HapticDefaults INSTANCE = new HapticDefaults();

    private HapticDefaults() {
    }

    public final boolean isPremiumVibratorEnabled(Context context) {
        boolean areAllPrimitivesSupported;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
        return areAllPrimitivesSupported;
    }
}
