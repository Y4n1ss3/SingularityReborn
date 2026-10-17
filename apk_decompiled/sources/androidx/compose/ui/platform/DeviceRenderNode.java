package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(Canvas canvas);

    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo6738getBlendMode0nO6VwU();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo6739getCompositingStrategyNrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix matrix);

    int getLeft();

    void getMatrix(Matrix matrix);

    float getPivotX();

    float getPivotY();

    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i);

    void offsetTopAndBottom(int i);

    void record(CanvasHolder canvasHolder, Path path, ky kyVar);

    void setAlpha(float f);

    void setAmbientShadowColor(int i);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo6740setBlendModes9anfk8(int i);

    void setCameraDistance(float f);

    void setClipToBounds(boolean z);

    void setClipToOutline(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo6741setCompositingStrategyaDBOjCE(int i);

    void setElevation(float f);

    boolean setHasOverlappingRendering(boolean z);

    void setOutline(Outline outline);

    void setPivotX(float f);

    void setPivotY(float f);

    boolean setPosition(int i, int i2, int i3, int i4);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setSpotShadowColor(int i);

    void setTranslationX(float f);

    void setTranslationY(float f);
}
