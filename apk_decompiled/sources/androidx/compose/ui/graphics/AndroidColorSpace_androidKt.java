package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidColorSpace_androidKt {
    public static final ColorSpace toAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        return ColorSpaceVerificationHelper.androidColorSpace(colorSpace);
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace toComposeColorSpace(ColorSpace colorSpace) {
        return ColorSpaceVerificationHelper.composeColorSpace(colorSpace);
    }
}
