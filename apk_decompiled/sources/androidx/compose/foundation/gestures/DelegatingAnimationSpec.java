package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import defpackage.ky;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DelegatingAnimationSpec implements AnimationSpec<AnimationData> {
    private final AnimationSpec<Offset> offsetAnimationSpec;
    private final AnimationSpec<Float> rotationAnimationSpec;
    private final AnimationSpec<Float> zoomAnimationSpec;

    public DelegatingAnimationSpec(AnimationSpec<Float> animationSpec, AnimationSpec<Offset> animationSpec2, AnimationSpec<Float> animationSpec3) {
        this.zoomAnimationSpec = animationSpec;
        this.offsetAnimationSpec = animationSpec2;
        this.rotationAnimationSpec = animationSpec3;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(final TwoWayConverter<AnimationData, V> twoWayConverter) {
        AnimationSpec<Float> animationSpec = this.zoomAnimationSpec;
        zv zvVar = zv.a;
        final VectorizedAnimationSpec<V> vectorize = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(zvVar));
        final VectorizedAnimationSpec<V> vectorize2 = this.offsetAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(Offset.Companion));
        final VectorizedAnimationSpec<V> vectorize3 = this.rotationAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(zvVar));
        return new VectorizedFiniteAnimationSpec<V>() { // from class: androidx.compose.foundation.gestures.DelegatingAnimationSpec$vectorize$1
            private final AnimationVector1D degreesVector(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.getVectorConverter(zv.a).getConvertToVector().invoke(Float.valueOf(animationData.getDegrees()));
            }

            private final AnimationVector2D offsetVector(AnimationData animationData) {
                ky convertToVector = VectorConvertersKt.getVectorConverter(Offset.Companion).getConvertToVector();
                float intBitsToFloat = Float.intBitsToFloat((int) (animationData.m391getOffsetF1C5BW0() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (animationData.m391getOffsetF1C5BW0() & 4294967295L));
                return (AnimationVector2D) convertToVector.invoke(Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L))));
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/animation/core/AnimationVector1D;Landroidx/compose/animation/core/AnimationVector2D;Landroidx/compose/animation/core/AnimationVector1D;)TV; */
            private final AnimationVector packToAnimationVector(AnimationVector1D animationVector1D, AnimationVector2D animationVector2D, AnimationVector1D animationVector1D2) {
                ky convertToVector = twoWayConverter.getConvertToVector();
                float value = animationVector1D.getValue();
                float v1 = animationVector2D.getV1();
                float v2 = animationVector2D.getV2();
                return (AnimationVector) convertToVector.invoke(new AnimationData(value, Offset.m4508constructorimpl((Float.floatToRawIntBits(v2) & 4294967295L) | (Float.floatToRawIntBits(v1) << 32)), animationVector1D2.getValue(), null));
            }

            private final AnimationVector1D zoomVector(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.getVectorConverter(zv.a).getConvertToVector().invoke(Float.valueOf(animationData.getZoom()));
            }

            /* JADX WARN: Incorrect types in method signature: (TV;TV;TV;)J */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return Math.max(vectorize.getDurationNanos(zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), Math.max(vectorize2.getDurationNanos(offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), vectorize3.getDurationNanos(degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3))));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getValueFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return packToAnimationVector(vectorize.getValueFromNanos(j, zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), vectorize2.getValueFromNanos(j, offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), vectorize3.getValueFromNanos(j, degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3)));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getVelocityFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return packToAnimationVector(vectorize.getVelocityFromNanos(j, zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), vectorize2.getVelocityFromNanos(j, offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), vectorize3.getVelocityFromNanos(j, degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3)));
            }
        };
    }
}
