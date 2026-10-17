package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import defpackage.hm;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PointerInputScope extends Density {
    <R> Object awaitPointerEventScope(my myVar, hm hmVar);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo357getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m4594getZeroNHjbRc();
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: getSize-YbymL2g */
    long mo358getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m6140getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            return PointerInputScope.super.mo357getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope) {
            return PointerInputScope.super.getInterceptOutOfBoundsChildEvents();
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6141roundToPxR2X_6o(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6142roundToPx0680j_4(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z) {
            PointerInputScope.super.setInterceptOutOfBoundsChildEvents(z);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6143toDpGaN1DYA(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6144toDpu2uoSUM(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6146toDpSizekrfVVM(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6147toPxR2X_6o(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6148toPx0680j_4(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(PointerInputScope pointerInputScope, DpRect dpRect) {
            return PointerInputScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6149toSizeXkaWNTQ(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6150toSp0xMU5do(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6151toSpkPz2Gy4(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo370toSpkPz2Gy4(f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6145toDpu2uoSUM(PointerInputScope pointerInputScope, int i) {
            return PointerInputScope.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6152toSpkPz2Gy4(PointerInputScope pointerInputScope, int i) {
            return PointerInputScope.super.mo371toSpkPz2Gy4(i);
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }
    }

    default void setInterceptOutOfBoundsChildEvents(boolean z) {
    }
}
