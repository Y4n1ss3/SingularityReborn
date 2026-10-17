package androidx.compose.ui.platform;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RenderEffect;
import defpackage.bv;
import defpackage.dq;
import defpackage.j50;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private int blendMode;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    private DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10) {
        this.uniqueId = j;
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.width = i5;
        this.height = i6;
        this.scaleX = f;
        this.scaleY = f2;
        this.translationX = f3;
        this.translationY = f4;
        this.elevation = f5;
        this.ambientShadowColor = i7;
        this.spotShadowColor = i8;
        this.rotationZ = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.cameraDistance = f9;
        this.pivotX = f10;
        this.pivotY = f11;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f12;
        this.renderEffect = renderEffect;
        this.blendMode = i9;
        this.colorFilter = colorFilter;
        this.compositingStrategy = i10;
    }

    /* renamed from: copy-qCc9W8c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m6742copyqCc9W8c$default(DeviceRenderNodeData deviceRenderNodeData, long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10, int i11, Object obj) {
        int i12;
        ColorFilter colorFilter2;
        long j2 = (i11 & 1) != 0 ? deviceRenderNodeData.uniqueId : j;
        int i13 = (i11 & 2) != 0 ? deviceRenderNodeData.left : i;
        int i14 = (i11 & 4) != 0 ? deviceRenderNodeData.top : i2;
        int i15 = (i11 & 8) != 0 ? deviceRenderNodeData.right : i3;
        int i16 = (i11 & 16) != 0 ? deviceRenderNodeData.bottom : i4;
        int i17 = (i11 & 32) != 0 ? deviceRenderNodeData.width : i5;
        int i18 = (i11 & 64) != 0 ? deviceRenderNodeData.height : i6;
        float f13 = (i11 & Fields.SpotShadowColor) != 0 ? deviceRenderNodeData.scaleX : f;
        float f14 = (i11 & Fields.RotationX) != 0 ? deviceRenderNodeData.scaleY : f2;
        float f15 = (i11 & Fields.RotationY) != 0 ? deviceRenderNodeData.translationX : f3;
        float f16 = (i11 & Fields.RotationZ) != 0 ? deviceRenderNodeData.translationY : f4;
        float f17 = (i11 & Fields.CameraDistance) != 0 ? deviceRenderNodeData.elevation : f5;
        int i19 = (i11 & Fields.TransformOrigin) != 0 ? deviceRenderNodeData.ambientShadowColor : i7;
        long j3 = j2;
        int i20 = (i11 & 8192) != 0 ? deviceRenderNodeData.spotShadowColor : i8;
        float f18 = (i11 & Fields.Clip) != 0 ? deviceRenderNodeData.rotationZ : f6;
        float f19 = (i11 & Fields.CompositingStrategy) != 0 ? deviceRenderNodeData.rotationX : f7;
        float f20 = (i11 & 65536) != 0 ? deviceRenderNodeData.rotationY : f8;
        float f21 = (i11 & Fields.RenderEffect) != 0 ? deviceRenderNodeData.cameraDistance : f9;
        float f22 = (i11 & Fields.ColorFilter) != 0 ? deviceRenderNodeData.pivotX : f10;
        float f23 = (i11 & Fields.BlendMode) != 0 ? deviceRenderNodeData.pivotY : f11;
        boolean z3 = (i11 & 1048576) != 0 ? deviceRenderNodeData.clipToOutline : z;
        boolean z4 = (i11 & 2097152) != 0 ? deviceRenderNodeData.clipToBounds : z2;
        float f24 = (i11 & 4194304) != 0 ? deviceRenderNodeData.alpha : f12;
        RenderEffect renderEffect2 = (i11 & GroupFlagsKt.IsNodeFlag) != 0 ? deviceRenderNodeData.renderEffect : renderEffect;
        int i21 = (i11 & GroupFlagsKt.HasObjectKeyFlag) != 0 ? deviceRenderNodeData.blendMode : i9;
        ColorFilter colorFilter3 = (i11 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? deviceRenderNodeData.colorFilter : colorFilter;
        if ((i11 & GroupFlagsKt.IsRecompositionRequiredFlag) != 0) {
            colorFilter2 = colorFilter3;
            i12 = deviceRenderNodeData.compositingStrategy;
        } else {
            i12 = i10;
            colorFilter2 = colorFilter3;
        }
        return deviceRenderNodeData.m6745copyqCc9W8c(j3, i13, i14, i15, i16, i17, i18, f13, f14, f15, f16, f17, i19, i20, f18, f19, f20, f21, f22, f23, z3, z4, f24, renderEffect2, i21, colorFilter2, i12);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* renamed from: component25-0nO6VwU, reason: not valid java name */
    public final int m6743component250nO6VwU() {
        return this.blendMode;
    }

    public final ColorFilter component26() {
        return this.colorFilter;
    }

    /* renamed from: component27--NrFUSI, reason: not valid java name */
    public final int m6744component27NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    /* renamed from: copy-qCc9W8c, reason: not valid java name */
    public final DeviceRenderNodeData m6745copyqCc9W8c(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10) {
        return new DeviceRenderNodeData(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect, i9, colorFilter, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && q10.b(this.renderEffect, deviceRenderNodeData.renderEffect) && BlendMode.m4670equalsimpl0(this.blendMode, deviceRenderNodeData.blendMode) && q10.b(this.colorFilter, deviceRenderNodeData.colorFilter) && CompositingStrategy.m4846equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m6746getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m6747getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int a = bv.a(this.alpha, kp0.c(kp0.c(bv.a(this.pivotY, bv.a(this.pivotX, bv.a(this.cameraDistance, bv.a(this.rotationY, bv.a(this.rotationX, bv.a(this.rotationZ, j50.b(this.spotShadowColor, j50.b(this.ambientShadowColor, bv.a(this.elevation, bv.a(this.translationY, bv.a(this.translationX, bv.a(this.scaleY, bv.a(this.scaleX, j50.b(this.height, j50.b(this.width, j50.b(this.bottom, j50.b(this.right, j50.b(this.top, j50.b(this.left, Long.hashCode(this.uniqueId) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.clipToOutline), 31, this.clipToBounds), 31);
        RenderEffect renderEffect = this.renderEffect;
        int m4671hashCodeimpl = (BlendMode.m4671hashCodeimpl(this.blendMode) + ((a + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return CompositingStrategy.m4847hashCodeimpl(this.compositingStrategy) + ((m4671hashCodeimpl + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setAmbientShadowColor(int i) {
        this.ambientShadowColor = i;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m6748setBlendModes9anfk8(int i) {
        this.blendMode = i;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m6749setCompositingStrategyaDBOjCE(int i) {
        this.compositingStrategy = i;
    }

    public final void setElevation(float f) {
        this.elevation = f;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setSpotShadowColor(int i) {
        this.spotShadowColor = i;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", blendMode=" + ((Object) BlendMode.m4672toStringimpl(this.blendMode)) + ", colorFilter=" + this.colorFilter + ", compositingStrategy=" + ((Object) CompositingStrategy.m4848toStringimpl(this.compositingStrategy)) + ')';
    }

    public /* synthetic */ DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10, dq dqVar) {
        this(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect, i9, colorFilter, i10);
    }
}
