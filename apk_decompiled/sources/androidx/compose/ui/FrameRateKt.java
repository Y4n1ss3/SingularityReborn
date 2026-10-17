package androidx.compose.ui;

import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FrameRateKt {
    private static final Modifier frameRate(Modifier modifier, float f) {
        return modifier.then(new FrameRateElement(f));
    }

    public static final Modifier preferredFrameRate(Modifier modifier, float f) {
        return frameRate(GraphicsLayerModifierKt.m4926graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null), f);
    }

    /* renamed from: preferredFrameRate-kI47g10, reason: not valid java name */
    public static final Modifier m4189preferredFrameRatekI47g10(Modifier modifier, float f) {
        return frameRate(GraphicsLayerModifierKt.m4926graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null), f);
    }
}
