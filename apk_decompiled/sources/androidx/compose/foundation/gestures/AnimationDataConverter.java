package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.ui.geometry.Offset;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {
    public static final AnimationDataConverter INSTANCE = new AnimationDataConverter();

    private AnimationDataConverter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationData _get_convertFromVector_$lambda$0(AnimationVector4D animationVector4D) {
        float v1 = animationVector4D.getV1();
        float v2 = animationVector4D.getV2();
        float v3 = animationVector4D.getV3();
        return new AnimationData(v1, Offset.m4508constructorimpl((Float.floatToRawIntBits(v3) & 4294967295L) | (Float.floatToRawIntBits(v2) << 32)), animationVector4D.getV4(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector4D _get_convertToVector_$lambda$0(AnimationData animationData) {
        return new AnimationVector4D(animationData.getZoom(), Float.intBitsToFloat((int) (animationData.m391getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (animationData.m391getOffsetF1C5BW0() & 4294967295L)), animationData.getDegrees());
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public ky getConvertFromVector() {
        return new d(1);
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public ky getConvertToVector() {
        return new d(0);
    }
}
