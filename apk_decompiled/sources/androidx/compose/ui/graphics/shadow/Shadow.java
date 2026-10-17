package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import defpackage.bv;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;
import defpackage.kp0;
import defpackage.q10;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Shadow {
    public static final int $stable = 0;
    private final float alpha;
    private final int blendMode;
    private final Brush brush;
    private final long color;
    private final long offset;
    private final float radius;
    private final float spread;

    public /* synthetic */ Shadow(float f, long j, float f2, long j2, float f3, int i, int i2, dq dqVar) {
        this(f, (i2 & 2) != 0 ? Color.Companion.m4787getBlack0d7_KjU() : j, (i2 & 4) != 0 ? Dp.m7611constructorimpl(0.0f) : f2, (i2 & 8) != 0 ? DpOffset.Companion.m7682getZeroRKDOV3M() : j2, (i2 & 16) != 0 ? 1.0f : f3, (i2 & 32) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : i, (dq) null);
    }

    public final Shadow copyWithoutOffset$ui_graphics() {
        return new Shadow(this.radius, this.spread, DpOffset.Companion.m7682getZeroRKDOV3M(), this.color, this.brush, this.alpha, this.blendMode, (dq) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Dp.m7616equalsimpl0(this.radius, shadow.radius) && Dp.m7616equalsimpl0(this.spread, shadow.spread) && DpOffset.m7671equalsimpl0(this.offset, shadow.offset) && this.alpha == shadow.alpha && BlendMode.m4670equalsimpl0(this.blendMode, shadow.blendMode) && Color.m4762equalsimpl0(this.color, shadow.color) && q10.b(this.brush, shadow.brush);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5478getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5479getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-RKDOV3M, reason: not valid java name */
    public final long m5480getOffsetRKDOV3M() {
        return this.offset;
    }

    /* renamed from: getRadius-D9Ej5fM, reason: not valid java name */
    public final float m5481getRadiusD9Ej5fM() {
        return this.radius;
    }

    /* renamed from: getSpread-D9Ej5fM, reason: not valid java name */
    public final float m5482getSpreadD9Ej5fM() {
        return this.spread;
    }

    public int hashCode() {
        int d = kp0.d(this.color, (BlendMode.m4671hashCodeimpl(this.blendMode) + bv.a(this.alpha, (DpOffset.m7676hashCodeimpl(this.offset) + j50.a(this.spread, Dp.m7617hashCodeimpl(this.radius) * 31, 31)) * 31, 31)) * 31, 31);
        Brush brush = this.brush;
        return d + (brush != null ? brush.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shadow(radius=");
        fc.i(this.radius, sb, ", spread=");
        fc.i(this.spread, sb, ", offset=");
        sb.append((Object) DpOffset.m7679toStringimpl(this.offset));
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m4672toStringimpl(this.blendMode));
        sb.append(", color=");
        kp0.i(this.color, sb, ", brush=");
        sb.append(this.brush);
        sb.append(')');
        return sb.toString();
    }

    public final Shadow transparentCopy$ui_graphics() {
        return new Shadow(this.radius, Color.Companion.m4796getTransparent0d7_KjU(), this.spread, this.offset, this.alpha, this.blendMode, (dq) null);
    }

    public /* synthetic */ Shadow(float f, long j, float f2, long j2, float f3, int i, dq dqVar) {
        this(f, j, f2, j2, f3, i);
    }

    public /* synthetic */ Shadow(float f, Brush brush, float f2, long j, float f3, int i, dq dqVar) {
        this(f, brush, f2, j, f3, i);
    }

    private Shadow(float f, float f2, long j, long j2, Brush brush, float f3, int i) {
        this.radius = f;
        this.spread = f2;
        this.offset = j;
        this.blendMode = i;
        if (brush instanceof SolidColor) {
            this.color = ((SolidColor) brush).m5117getValue0d7_KjU();
            this.brush = null;
        } else {
            this.color = j2;
            this.brush = brush;
        }
        this.alpha = y80.g(f3, 0.0f, 1.0f);
    }

    private Shadow(float f, Brush brush, float f2, long j, float f3, int i) {
        this(f, f2, j, Color.Companion.m4787getBlack0d7_KjU(), brush, f3, i, (dq) null);
    }

    public /* synthetic */ Shadow(float f, float f2, long j, long j2, Brush brush, float f3, int i, dq dqVar) {
        this(f, f2, j, j2, brush, f3, i);
    }

    private Shadow(float f, long j, float f2, long j2, float f3, int i) {
        this(f, f2, j2, j != 16 ? j : Color.Companion.m4787getBlack0d7_KjU(), (Brush) null, f3, i, (dq) null);
    }

    public /* synthetic */ Shadow(float f, Brush brush, float f2, long j, float f3, int i, int i2, dq dqVar) {
        this(f, brush, (i2 & 4) != 0 ? Dp.m7611constructorimpl(0.0f) : f2, (i2 & 8) != 0 ? DpOffset.Companion.m7682getZeroRKDOV3M() : j, (i2 & 16) != 0 ? 1.0f : f3, (i2 & 32) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : i, (dq) null);
    }
}
