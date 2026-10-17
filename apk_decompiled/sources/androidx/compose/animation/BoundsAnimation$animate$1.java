package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.geometry.Rect;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoundsAnimation$animate$1 extends f30 implements ky {
    final /* synthetic */ BoundsAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundsAnimation$animate$1(BoundsAnimation boundsAnimation) {
        super(1);
        this.this$0 = boundsAnimation;
    }

    @Override // defpackage.ky
    public final FiniteAnimationSpec<Rect> invoke(Transition.Segment<Boolean> segment) {
        return this.this$0.getAnimationSpec();
    }
}
