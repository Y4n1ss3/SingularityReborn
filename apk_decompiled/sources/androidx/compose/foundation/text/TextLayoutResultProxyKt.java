package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1207coerceIn3MmeM6k(long j, Rect rect) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i2) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i2) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i2)) & 4294967295L));
    }
}
