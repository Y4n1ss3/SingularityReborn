package androidx.compose.animation;

import androidx.compose.ui.geometry.Rect;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoundsAnimation$animate$2 extends f30 implements ky {
    final /* synthetic */ Rect $currentBounds;
    final /* synthetic */ Rect $targetBounds;
    final /* synthetic */ BoundsAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundsAnimation$animate$2(BoundsAnimation boundsAnimation, Rect rect, Rect rect2) {
        super(1);
        this.this$0 = boundsAnimation;
        this.$targetBounds = rect;
        this.$currentBounds = rect2;
    }

    public final Rect invoke(boolean z) {
        return z == this.this$0.getTransition().getTargetState().booleanValue() ? this.$targetBounds : this.$currentBounds;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }
}
