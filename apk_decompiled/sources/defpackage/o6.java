package defpackage;

import androidx.compose.animation.AnimateBoundsModifierKt;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.animation.SharedTransitionDefaults;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements BoundsTransform {
    public final /* synthetic */ int a;

    public /* synthetic */ o6(int i) {
        this.a = i;
    }

    @Override // androidx.compose.animation.BoundsTransform
    public final FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2) {
        FiniteAnimationSpec DefaultBoundsTransform$lambda$0;
        FiniteAnimationSpec approachPlaceMatchInTransition$lambda$0;
        FiniteAnimationSpec BoundsTransform$lambda$0;
        switch (this.a) {
            case 0:
                DefaultBoundsTransform$lambda$0 = AnimateBoundsModifierKt.DefaultBoundsTransform$lambda$0(rect, rect2);
                return DefaultBoundsTransform$lambda$0;
            case 1:
                approachPlaceMatchInTransition$lambda$0 = SharedBoundsNode.approachPlaceMatchInTransition$lambda$0(rect, rect2);
                return approachPlaceMatchInTransition$lambda$0;
            default:
                BoundsTransform$lambda$0 = SharedTransitionDefaults.BoundsTransform$lambda$0(rect, rect2);
                return BoundsTransform$lambda$0;
        }
    }
}
