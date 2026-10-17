package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.DpRect;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m5281drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
            ContentDrawScope.super.mo5237drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m5282getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo5334getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m5283getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo5335getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m5284recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j, ky kyVar) {
            ContentDrawScope.super.mo5336recordJVtK1S4(graphicsLayer, j, kyVar);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5285roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5286roundToPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5287toDpGaN1DYA(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5288toDpu2uoSUM(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5290toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5291toPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5292toPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5293toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5294toSp0xMU5do(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5295toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo370toSpkPz2Gy4(f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5289toDpu2uoSUM(ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5296toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo371toSpkPz2Gy4(i);
        }
    }
}
