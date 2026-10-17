package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import defpackage.hm;
import defpackage.lu0;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface AwaitPointerEventScope extends Density {
    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, hm hmVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
            return null;
        }
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, hmVar);
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j, my myVar, hm hmVar) {
        return myVar.invoke(awaitPointerEventScope, hmVar);
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j, my myVar, hm hmVar) {
        return myVar.invoke(awaitPointerEventScope, hmVar);
    }

    Object awaitPointerEvent(PointerEventPass pointerEventPass, hm hmVar);

    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo5984getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m4594getZeroNHjbRc();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo5985getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default <T> Object withTimeout(long j, my myVar, hm hmVar) {
        return withTimeout$suspendImpl(this, j, myVar, hmVar);
    }

    default <T> Object withTimeoutOrNull(long j, my myVar, hm hmVar) {
        return withTimeoutOrNull$suspendImpl(this, j, myVar, hmVar);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m5986getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo5984getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5987roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5988roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5989toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5990toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5992toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5993toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5994toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5995toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5996toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5997toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo370toSpkPz2Gy4(f);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j, my myVar, hm hmVar) {
            return AwaitPointerEventScope.super.withTimeout(j, myVar, hmVar);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j, my myVar, hm hmVar) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j, myVar, hmVar);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5991toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return AwaitPointerEventScope.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5998toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return AwaitPointerEventScope.super.mo371toSpkPz2Gy4(i);
        }
    }
}
