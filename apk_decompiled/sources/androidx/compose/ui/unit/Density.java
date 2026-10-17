package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface Density extends FontScaling {
    float getDensity();

    /* renamed from: roundToPx--R2X_6o */
    default int mo360roundToPxR2X_6o(long j) {
        return Math.round(mo366toPxR2X_6o(j));
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo361roundToPx0680j_4(float f) {
        float mo367toPx0680j_4 = mo367toPx0680j_4(f);
        if (Float.isInfinite(mo367toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(mo367toPx0680j_4);
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo364toDpu2uoSUM(int i) {
        return Dp.m7611constructorimpl(i / getDensity());
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo365toDpSizekrfVVM(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m7633DpSizeYgX7TsA(mo363toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), mo363toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L)))) : DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
    }

    /* renamed from: toPx--R2X_6o */
    default float mo366toPxR2X_6o(long j) {
        if (!TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j), TextUnitType.Companion.m7838getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo367toPx0680j_4(mo362toDpGaN1DYA(j));
    }

    /* renamed from: toPx-0680j_4 */
    default float mo367toPx0680j_4(float f) {
        return getDensity() * f;
    }

    default Rect toRect(DpRect dpRect) {
        return new Rect(mo367toPx0680j_4(dpRect.m7694getLeftD9Ej5fM()), mo367toPx0680j_4(dpRect.m7696getTopD9Ej5fM()), mo367toPx0680j_4(dpRect.m7695getRightD9Ej5fM()), mo367toPx0680j_4(dpRect.m7693getBottomD9Ej5fM()));
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo368toSizeXkaWNTQ(long j) {
        if (j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.Companion.m4593getUnspecifiedNHjbRc();
        }
        float mo367toPx0680j_4 = mo367toPx0680j_4(DpSize.m7709getWidthD9Ej5fM(j));
        float mo367toPx0680j_42 = mo367toPx0680j_4(DpSize.m7707getHeightD9Ej5fM(j));
        return Size.m4576constructorimpl((Float.floatToRawIntBits(mo367toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo367toPx0680j_42) & 4294967295L));
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo371toSpkPz2Gy4(int i) {
        return mo369toSp0xMU5do(mo364toDpu2uoSUM(i));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7597roundToPxR2X_6o(Density density, long j) {
            return Density.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7598roundToPx0680j_4(Density density, float f) {
            return Density.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7599toDpGaN1DYA(Density density, long j) {
            return Density.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7601toDpu2uoSUM(Density density, int i) {
            return Density.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7602toDpSizekrfVVM(Density density, long j) {
            return Density.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7603toPxR2X_6o(Density density, long j) {
            return Density.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7604toPx0680j_4(Density density, float f) {
            return Density.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7605toSizeXkaWNTQ(Density density, long j) {
            return Density.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7606toSp0xMU5do(Density density, float f) {
            return Density.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7608toSpkPz2Gy4(Density density, int i) {
            return Density.super.mo371toSpkPz2Gy4(i);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7600toDpu2uoSUM(Density density, float f) {
            return Density.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7607toSpkPz2Gy4(Density density, float f) {
            return Density.super.mo370toSpkPz2Gy4(f);
        }

        public static /* synthetic */ void getDensity$annotations() {
        }
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo370toSpkPz2Gy4(float f) {
        return mo369toSp0xMU5do(mo363toDpu2uoSUM(f));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo363toDpu2uoSUM(float f) {
        return Dp.m7611constructorimpl(f / getDensity());
    }
}
