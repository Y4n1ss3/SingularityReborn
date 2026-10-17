package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    /* renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final android.graphics.BlendModeColorFilter m4705BlendModeColorFilterxETnrds(long j, int i) {
        return new android.graphics.BlendModeColorFilter(ColorKt.m4815toArgb8_81llA(j), AndroidBlendMode_androidKt.m4608toAndroidBlendModes9anfk8(i));
    }

    public final BlendModeColorFilter createBlendModeColorFilter(android.graphics.BlendModeColorFilter blendModeColorFilter) {
        return new BlendModeColorFilter(ColorKt.Color(blendModeColorFilter.getColor()), AndroidBlendMode_androidKt.toComposeBlendMode(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
