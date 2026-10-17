package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface GraphicsLayerImpl {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ky DefaultDrawBlock = GraphicsLayerImpl$Companion$DefaultDrawBlock$1.INSTANCE;

        private Companion() {
        }

        public final ky getDefaultDrawBlock() {
            return DefaultDrawBlock;
        }
    }

    Matrix calculateMatrix();

    void discardDisplayList();

    void draw(Canvas canvas);

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo5438getAmbientShadowColor0d7_KjU();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo5439getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    int mo5440getCompositingStrategyke2Ky5w();

    default boolean getHasDisplayList() {
        return true;
    }

    long getLayerId();

    long getOwnerId();

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    long mo5441getPivotOffsetF1C5BW0();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo5442getSpotShadowColor0d7_KjU();

    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    float getTranslationX();

    float getTranslationY();

    boolean isInvalidated();

    void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, ky kyVar);

    void setAlpha(float f);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo5443setAmbientShadowColor8_81llA(long j);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo5444setBlendModes9anfk8(int i);

    void setCameraDistance(float f);

    void setClip(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    void mo5445setCompositingStrategyWpw9cng(int i);

    void setInvalidated(boolean z);

    /* renamed from: setOutline-O0kMr_c, reason: not valid java name */
    void mo5446setOutlineO0kMr_c(Outline outline, long j);

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    void mo5447setPivotOffsetk4lQ0M(long j);

    /* renamed from: setPosition-H0pRuoY, reason: not valid java name */
    void mo5448setPositionH0pRuoY(int i, int i2, long j);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo5449setSpotShadowColor8_81llA(long j);

    void setTranslationX(float f);

    void setTranslationY(float f);
}
