package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoundsAnimationModifierNode$approachMeasure$1 extends f30 implements ky {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ BoundsAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundsAnimationModifierNode$approachMeasure$1(BoundsAnimationModifierNode boundsAnimationModifierNode, Placeable placeable) {
        super(1);
        this.this$0 = boundsAnimationModifierNode;
        this.$placeable = placeable;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation;
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation2;
        long m4551getTopLeftF1C5BW0;
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation3;
        boundsTransformDeferredAnimation = this.this$0.boundsAnimation;
        Rect value = boundsTransformDeferredAnimation.getValue();
        LookaheadScope lookaheadScope = this.this$0.getLookaheadScope();
        BoundsAnimationModifierNode boundsAnimationModifierNode = this.this$0;
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        Offset m4505boximpl = coordinates != null ? Offset.m4505boximpl(lookaheadScope.getLookaheadScopeCoordinates(placementScope).mo6244localPositionOfS_NoaFU(coordinates, Offset.Companion.m4532getZeroF1C5BW0(), boundsAnimationModifierNode.getAnimateMotionFrameOfReference())) : null;
        BoundsAnimationModifierNode boundsAnimationModifierNode2 = this.this$0;
        if (value != null) {
            boundsTransformDeferredAnimation3 = boundsAnimationModifierNode2.boundsAnimation;
            boundsTransformDeferredAnimation3.m43updateCurrentBoundstz77jQw(value.m4551getTopLeftF1C5BW0(), value.m4549getSizeNHjbRc());
            m4551getTopLeftF1C5BW0 = value.m4551getTopLeftF1C5BW0();
        } else {
            boundsTransformDeferredAnimation2 = boundsAnimationModifierNode2.boundsAnimation;
            Rect currentBounds = boundsTransformDeferredAnimation2.getCurrentBounds();
            m4551getTopLeftF1C5BW0 = currentBounds != null ? currentBounds.m4551getTopLeftF1C5BW0() : Offset.Companion.m4532getZeroF1C5BW0();
        }
        long m4520minusMKHz9U = m4505boximpl != null ? Offset.m4520minusMKHz9U(m4551getTopLeftF1C5BW0, m4505boximpl.m4526unboximpl()) : Offset.Companion.m4532getZeroF1C5BW0();
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, Math.round(Float.intBitsToFloat((int) (m4520minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (m4520minusMKHz9U & 4294967295L))), 0.0f, 4, null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
