package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m5087createBlurEffect8A3gB4(RenderEffect renderEffect, float f, float f2, int i) {
        android.graphics.RenderEffect createBlurEffect;
        android.graphics.RenderEffect createBlurEffect2;
        android.graphics.RenderEffect createOffsetEffect;
        if (f == 0.0f && f2 == 0.0f) {
            createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(0.0f, 0.0f);
            return createOffsetEffect;
        }
        if (renderEffect == null) {
            createBlurEffect2 = android.graphics.RenderEffect.createBlurEffect(f, f2, AndroidTileMode_androidKt.m4664toAndroidTileMode0vamqd0(i));
            return createBlurEffect2;
        }
        createBlurEffect = android.graphics.RenderEffect.createBlurEffect(f, f2, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m4664toAndroidTileMode0vamqd0(i));
        return createBlurEffect;
    }

    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m5088createOffsetEffectUv8p0NA(RenderEffect renderEffect, long j) {
        android.graphics.RenderEffect createOffsetEffect;
        android.graphics.RenderEffect createOffsetEffect2;
        if (renderEffect == null) {
            createOffsetEffect2 = android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            return createOffsetEffect2;
        }
        createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect.asAndroidRenderEffect());
        return createOffsetEffect;
    }
}
