package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1 extends f30 implements ky {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, Placeable placeable, long j) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$placeable = placeable;
        this.$measuredSize = j;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.m6303place70tqf50$default(placementScope, this.$placeable, this.this$0.getScope().getContentAlignment().mo4178alignKFBX0sM(IntSize.m7777constructorimpl((this.$placeable.getWidth() << 32) | (this.$placeable.getHeight() & 4294967295L)), this.$measuredSize, LayoutDirection.Ltr), 0.0f, 2, null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
