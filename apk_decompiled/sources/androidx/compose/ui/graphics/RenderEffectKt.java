package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RenderEffectKt {
    /* renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final BlurEffect m5085BlurEffect3YTHUZs(float f, float f2, int i) {
        return new BlurEffect(null, f, f2, i, null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ BlurEffect m5086BlurEffect3YTHUZs$default(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = TileMode.Companion.m5156getClamp3opZhB0();
        }
        return m5085BlurEffect3YTHUZs(f, f2, i);
    }

    public static final OffsetEffect OffsetEffect(float f, float f2) {
        return new OffsetEffect(null, Offset.m4508constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)), null);
    }
}
