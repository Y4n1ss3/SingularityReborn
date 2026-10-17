package androidx.compose.ui.graphics;

import defpackage.bv;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlurEffect extends RenderEffect {
    public static final int $stable = 0;
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;
    private final RenderEffect renderEffect;

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f, float f2, int i, int i2, dq dqVar) {
        this(renderEffect, f, (i2 & 4) != 0 ? f : f2, (i2 & 8) != 0 ? TileMode.Companion.m5156getClamp3opZhB0() : i, null);
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    public android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m5087createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.radiusX == blurEffect.radiusX && this.radiusY == blurEffect.radiusY && TileMode.m5152equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment) && q10.b(this.renderEffect, blurEffect.renderEffect);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return TileMode.m5153hashCodeimpl(this.edgeTreatment) + bv.a(this.radiusY, bv.a(this.radiusX, (renderEffect != null ? renderEffect.hashCode() : 0) * 31, 31), 31);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m5154toStringimpl(this.edgeTreatment)) + ')';
    }

    private BlurEffect(RenderEffect renderEffect, float f, float f2, int i) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = f;
        this.radiusY = f2;
        this.edgeTreatment = i;
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f, float f2, int i, dq dqVar) {
        this(renderEffect, f, f2, i);
    }
}
