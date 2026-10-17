package androidx.compose.animation.core;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.a10;
import defpackage.p80;
import defpackage.xe0;
import defpackage.zv;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.4f;
    private static final float PxVisibilityThreshold = 1.0f;
    private static final Rect RectVisibilityThreshold;
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap;

    static {
        Float valueOf = Float.valueOf(1.0f);
        RectVisibilityThreshold = new Rect(1.0f, 1.0f, 1.0f, 1.0f);
        xe0 xe0Var = new xe0(VectorConvertersKt.getVectorConverter(a10.a), valueOf);
        xe0 xe0Var2 = new xe0(VectorConvertersKt.getVectorConverter(IntSize.Companion), valueOf);
        xe0 xe0Var3 = new xe0(VectorConvertersKt.getVectorConverter(IntOffset.Companion), valueOf);
        xe0 xe0Var4 = new xe0(VectorConvertersKt.getVectorConverter(zv.a), Float.valueOf(0.01f));
        xe0 xe0Var5 = new xe0(VectorConvertersKt.getVectorConverter(Rect.Companion), valueOf);
        xe0 xe0Var6 = new xe0(VectorConvertersKt.getVectorConverter(Size.Companion), valueOf);
        xe0 xe0Var7 = new xe0(VectorConvertersKt.getVectorConverter(Offset.Companion), valueOf);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.Companion);
        Float valueOf2 = Float.valueOf(0.4f);
        VisibilityThresholdMap = p80.M(xe0Var, xe0Var2, xe0Var3, xe0Var4, xe0Var5, xe0Var6, xe0Var7, new xe0(vectorConverter, valueOf2), new xe0(VectorConvertersKt.getVectorConverter(DpOffset.Companion), valueOf2));
    }

    public static final long getVisibilityThreshold(DpOffset.Companion companion) {
        Dp.Companion companion2 = Dp.Companion;
        float visibilityThreshold = getVisibilityThreshold(companion2);
        float visibilityThreshold2 = getVisibilityThreshold(companion2);
        return DpOffset.m7667constructorimpl((Float.floatToRawIntBits(visibilityThreshold) << 32) | (Float.floatToRawIntBits(visibilityThreshold2) & 4294967295L));
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    public static /* synthetic */ void getVisibilityThresholdMap$annotations() {
    }

    public static final int getVisibilityThreshold(a10 a10Var) {
        return 1;
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        return RectVisibilityThreshold;
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        return IntOffset.m7733constructorimpl(InlineClassHelperKt.Uint64Low32);
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
    }

    public static final float getVisibilityThreshold(Dp.Companion companion) {
        return Dp.m7611constructorimpl(0.4f);
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        return Size.m4576constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        return IntSize.m7777constructorimpl(InlineClassHelperKt.Uint64Low32);
    }
}
