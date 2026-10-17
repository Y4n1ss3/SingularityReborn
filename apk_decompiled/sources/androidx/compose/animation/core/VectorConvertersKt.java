package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.a10;
import defpackage.g11;
import defpackage.ky;
import defpackage.qu0;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new qu0(16), new g11(3));
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new qu0(17), new qu0(18));
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(new qu0(19), new qu0(20));
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new qu0(21), new qu0(22));
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new qu0(23), new qu0(24));
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new qu0(25), new qu0(26));
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new qu0(27), new qu0(28));
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new qu0(29), new g11(0));
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new g11(1), new g11(2));

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector2D DpOffsetToVector$lambda$0(DpOffset dpOffset) {
        return new AnimationVector2D(DpOffset.m7672getXD9Ej5fM(dpOffset.m7680unboximpl()), DpOffset.m7674getYD9Ej5fM(dpOffset.m7680unboximpl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpOffset DpOffsetToVector$lambda$1(AnimationVector2D animationVector2D) {
        float m7611constructorimpl = Dp.m7611constructorimpl(animationVector2D.getV1());
        float m7611constructorimpl2 = Dp.m7611constructorimpl(animationVector2D.getV2());
        return DpOffset.m7666boximpl(DpOffset.m7667constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (Float.floatToRawIntBits(m7611constructorimpl2) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector1D DpToVector$lambda$0(Dp dp) {
        return new AnimationVector1D(dp.m7625unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp DpToVector$lambda$1(AnimationVector1D animationVector1D) {
        return Dp.m7609boximpl(Dp.m7611constructorimpl(animationVector1D.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector1D FloatToVector$lambda$0(float f) {
        return new AnimationVector1D(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector2D IntOffsetToVector$lambda$0(IntOffset intOffset) {
        return new AnimationVector2D(IntOffset.m7739getXimpl(intOffset.m7748unboximpl()), IntOffset.m7740getYimpl(intOffset.m7748unboximpl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset IntOffsetToVector$lambda$1(AnimationVector2D animationVector2D) {
        return IntOffset.m7730boximpl(IntOffset.m7733constructorimpl((Math.round(animationVector2D.getV1()) << 32) | (Math.round(animationVector2D.getV2()) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector2D IntSizeToVector$lambda$0(IntSize intSize) {
        return new AnimationVector2D((int) (intSize.m7786unboximpl() >> 32), (int) (intSize.m7786unboximpl() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntSize IntSizeToVector$lambda$1(AnimationVector2D animationVector2D) {
        int round = Math.round(animationVector2D.getV1());
        if (round < 0) {
            round = 0;
        }
        return IntSize.m7774boximpl(IntSize.m7777constructorimpl(((Math.round(animationVector2D.getV2()) >= 0 ? r6 : 0) & 4294967295L) | (round << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector1D IntToVector$lambda$0(int i) {
        return new AnimationVector1D(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IntToVector$lambda$1(AnimationVector1D animationVector1D) {
        return (int) animationVector1D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector2D OffsetToVector$lambda$0(Offset offset) {
        return new AnimationVector2D(Float.intBitsToFloat((int) (offset.m4526unboximpl() >> 32)), Float.intBitsToFloat((int) (offset.m4526unboximpl() & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset OffsetToVector$lambda$1(AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector4D RectToVector$lambda$0(Rect rect) {
        return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect RectToVector$lambda$1(AnimationVector4D animationVector4D) {
        return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector2D SizeToVector$lambda$0(Size size) {
        return new AnimationVector2D(Float.intBitsToFloat((int) (size.m4590unboximpl() >> 32)), Float.intBitsToFloat((int) (size.m4590unboximpl() & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size SizeToVector$lambda$1(AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return Size.m4573boximpl(Size.m4576constructorimpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L)));
    }

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(ky kyVar, ky kyVar2) {
        return new TwoWayConverterImpl(kyVar, kyVar2);
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(zv zvVar) {
        return FloatToVector;
    }

    public static final float lerp(float f, float f2, float f3) {
        return (f2 * f3) + ((1.0f - f3) * f);
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(a10 a10Var) {
        return IntToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        return RectToVector;
    }

    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(Dp.Companion companion) {
        return DpToVector;
    }

    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(Size.Companion companion) {
        return SizeToVector;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(Offset.Companion companion) {
        return OffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(IntSize.Companion companion) {
        return IntSizeToVector;
    }
}
