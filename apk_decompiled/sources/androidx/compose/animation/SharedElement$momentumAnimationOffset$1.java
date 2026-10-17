package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import defpackage.f30;
import defpackage.iy;
import defpackage.p01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedElement$momentumAnimationOffset$1 extends f30 implements iy {
    final /* synthetic */ SharedElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$momentumAnimationOffset$1(SharedElement sharedElement) {
        super(0);
        this.this$0 = sharedElement;
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.m4505boximpl(m84invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
    public final long m84invokeF1C5BW0() {
        boolean z;
        Animatable animatable;
        Animatable animatable2;
        SharedElementEntry sharedElementEntry;
        z = this.this$0.animationSpecFinalized;
        if (!z && this.this$0.getScope().isTransitionActive()) {
            animatable2 = this.this$0.momentumAnimation;
            if (animatable2.isRunning()) {
                List<SharedElementEntry> enabledEntries = this.this$0.getEnabledEntries();
                int size = enabledEntries.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        sharedElementEntry = null;
                        break;
                    }
                    sharedElementEntry = enabledEntries.get(i);
                    if (sharedElementEntry.getTarget()) {
                        break;
                    }
                    i++;
                }
                SharedElementEntry sharedElementEntry2 = sharedElementEntry;
                if (sharedElementEntry2 != null) {
                    SharedElement sharedElement = this.this$0;
                    FiniteAnimationSpec<Rect> animationSpec = sharedElementEntry2.getBoundsAnimation().getAnimationSpec();
                    if (animationSpec instanceof SpringSpec) {
                        SpringSpec springSpec = (SpringSpec) animationSpec;
                        p01.t(sharedElement.getScope().getCoroutineScope(), null, null, new SharedElement$momentumAnimationOffset$1$2$1(sharedElement, AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), Offset.m4505boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion))), null), 3);
                    }
                    sharedElement.animationSpecFinalized = true;
                }
            }
        }
        animatable = this.this$0.momentumAnimation;
        return ((Offset) animatable.getValue()).m4526unboximpl();
    }
}
