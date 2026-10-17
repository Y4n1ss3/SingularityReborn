package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OffsetEffect extends RenderEffect {
    public static final int $stable = 0;
    private final long offset;
    private final RenderEffect renderEffect;

    private OffsetEffect(RenderEffect renderEffect, long j) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    public android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m5088createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        return q10.b(this.renderEffect, offsetEffect.renderEffect) && Offset.m4513equalsimpl0(this.offset, offsetEffect.offset);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return Offset.m4518hashCodeimpl(this.offset) + ((renderEffect != null ? renderEffect.hashCode() : 0) * 31);
    }

    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m4524toStringimpl(this.offset)) + ')';
    }

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect, long j, dq dqVar) {
        this(renderEffect, j);
    }
}
