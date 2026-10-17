package androidx.compose.ui.graphics;

import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidColorFilter_androidKt {
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m4621actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    public static final float[] actualColorMatrixFromFilter(android.graphics.ColorFilter colorFilter) {
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m4840getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        o.m("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        return null;
    }

    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m4622actualLightingColorFilterOWjLjI(long j, long j2) {
        return new android.graphics.LightingColorFilter(ColorKt.m4815toArgb8_81llA(j), ColorKt.m4815toArgb8_81llA(j2));
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m4623actualTintColorFilterxETnrds(long j, int i) {
        return BlendModeColorFilterHelper.INSTANCE.m4705BlendModeColorFilterxETnrds(j, i);
    }

    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics();
    }

    public static final ColorFilter asComposeColorFilter(android.graphics.ColorFilter colorFilter) {
        if (colorFilter instanceof android.graphics.BlendModeColorFilter) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter((android.graphics.BlendModeColorFilter) colorFilter);
        }
        if (!(colorFilter instanceof android.graphics.LightingColorFilter) || !supportsLightingColorFilterQuery()) {
            return ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) ? new ColorMatrixColorFilter(null, colorFilter, null) : new ColorFilter(colorFilter);
        }
        android.graphics.LightingColorFilter lightingColorFilter = (android.graphics.LightingColorFilter) colorFilter;
        return new LightingColorFilter(ColorKt.Color(lightingColorFilter.getColorMultiply()), ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
    }

    public static final boolean supportsColorMatrixQuery() {
        return true;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return true;
    }
}
