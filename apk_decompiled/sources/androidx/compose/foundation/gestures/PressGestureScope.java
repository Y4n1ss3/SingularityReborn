package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {
    Object awaitRelease(hm hmVar);

    Object tryAwaitRelease(hm hmVar);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m507roundToPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m508roundToPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m509toDpGaN1DYA(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m510toDpu2uoSUM(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m512toDpSizekrfVVM(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m513toPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m514toPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m515toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m516toSp0xMU5do(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m517toSpkPz2Gy4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo370toSpkPz2Gy4(f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m511toDpu2uoSUM(PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m518toSpkPz2Gy4(PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo371toSpkPz2Gy4(i);
        }
    }
}
