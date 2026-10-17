package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@PlacementScopeMarker
/* loaded from: classes.dex */
public interface GraphicsLayerScope extends Density {
    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo4952getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    default int mo4953getBlendMode0nO6VwU() {
        return BlendMode.Companion.m4701getSrcOver0nO6VwU();
    }

    float getCameraDistance();

    boolean getClip();

    default ColorFilter getColorFilter() {
        return null;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo4954getCompositingStrategyNrFUSI() {
        return CompositingStrategy.Companion.m4850getAutoNrFUSI();
    }

    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo4955getSizeNHjbRc() {
        return Size.Companion.m4593getUnspecifiedNHjbRc();
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo4956getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo4957getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f);

    void setCameraDistance(float f);

    void setClip(boolean z);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    void setShape(Shape shape);

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo4962setTransformOrigin__ExYCQ(long j);

    void setTranslationX(float f);

    void setTranslationY(float f);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m4963getAmbientShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4952getAmbientShadowColor0d7_KjU();
        }

        @Deprecated
        /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
        public static int m4964getBlendMode0nO6VwU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4953getBlendMode0nO6VwU();
        }

        @Deprecated
        public static ColorFilter getColorFilter(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getColorFilter();
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m4965getCompositingStrategyNrFUSI(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4954getCompositingStrategyNrFUSI();
        }

        @Deprecated
        public static RenderEffect getRenderEffect(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4966getSizeNHjbRc(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4955getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m4967getSpotShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4956getSpotShadowColor0d7_KjU();
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4968roundToPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4969roundToPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m4970setAmbientShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j) {
            GraphicsLayerScope.super.mo4958setAmbientShadowColor8_81llA(j);
        }

        @Deprecated
        /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
        public static void m4971setBlendModes9anfk8(GraphicsLayerScope graphicsLayerScope, int i) {
            GraphicsLayerScope.super.mo4959setBlendModes9anfk8(i);
        }

        @Deprecated
        public static void setColorFilter(GraphicsLayerScope graphicsLayerScope, ColorFilter colorFilter) {
            GraphicsLayerScope.super.setColorFilter(colorFilter);
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m4972setCompositingStrategyaDBOjCE(GraphicsLayerScope graphicsLayerScope, int i) {
            GraphicsLayerScope.super.mo4960setCompositingStrategyaDBOjCE(i);
        }

        @Deprecated
        public static void setRenderEffect(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m4973setSpotShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j) {
            GraphicsLayerScope.super.mo4961setSpotShadowColor8_81llA(j);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4974toDpGaN1DYA(GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4975toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4977toDpSizekrfVVM(GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4978toPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4979toPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(GraphicsLayerScope graphicsLayerScope, DpRect dpRect) {
            return GraphicsLayerScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4980toSizeXkaWNTQ(GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4981toSp0xMU5do(GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4982toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo370toSpkPz2Gy4(f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4976toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, int i) {
            return GraphicsLayerScope.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4983toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, int i) {
            return GraphicsLayerScope.super.mo371toSpkPz2Gy4(i);
        }

        public static /* synthetic */ void getClip$annotations() {
        }
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo4958setAmbientShadowColor8_81llA(long j) {
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    default void mo4959setBlendModes9anfk8(int i) {
    }

    default void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo4960setCompositingStrategyaDBOjCE(int i) {
    }

    default void setRenderEffect(RenderEffect renderEffect) {
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    default void mo4961setSpotShadowColor8_81llA(long j) {
    }
}
