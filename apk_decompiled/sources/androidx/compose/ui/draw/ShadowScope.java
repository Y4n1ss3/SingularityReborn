package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ShadowScope extends Density {
    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo4269getBlendMode0nO6VwU();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo4270getColor0d7_KjU();

    /* renamed from: getOffset-F1C5BW0 */
    long mo4271getOffsetF1C5BW0();

    float getRadius();

    float getSpread();

    void setAlpha(float f);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo4272setBlendModes9anfk8(int i);

    void setBrush(Brush brush);

    /* renamed from: setColor-8_81llA */
    void mo4273setColor8_81llA(long j);

    /* renamed from: setOffset-k-4lQ0M */
    void mo4274setOffsetk4lQ0M(long j);

    void setRadius(float f);

    void setSpread(float f);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4371roundToPxR2X_6o(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4372roundToPx0680j_4(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4373toDpGaN1DYA(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4374toDpu2uoSUM(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4376toDpSizekrfVVM(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4377toPxR2X_6o(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4378toPx0680j_4(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(ShadowScope shadowScope, DpRect dpRect) {
            return ShadowScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4379toSizeXkaWNTQ(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4380toSp0xMU5do(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4381toSpkPz2Gy4(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo370toSpkPz2Gy4(f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4375toDpu2uoSUM(ShadowScope shadowScope, int i) {
            return ShadowScope.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4382toSpkPz2Gy4(ShadowScope shadowScope, int i) {
            return ShadowScope.super.mo371toSpkPz2Gy4(i);
        }
    }
}
