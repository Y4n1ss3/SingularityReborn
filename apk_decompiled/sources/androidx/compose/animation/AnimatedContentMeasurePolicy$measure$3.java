package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy$measure$3 extends f30 implements ky {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ Placeable[] $placeables;
    final /* synthetic */ AnimatedContentMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$measure$3(Placeable[] placeableArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i, int i2) {
        super(1);
        this.$placeables = placeableArr;
        this.this$0 = animatedContentMeasurePolicy;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable[] placeableArr = this.$placeables;
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this.this$0;
        int i = this.$maxWidth;
        int i2 = this.$maxHeight;
        for (Placeable placeable : placeableArr) {
            if (placeable != null) {
                long mo4178alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo4178alignKFBX0sM(IntSize.m7777constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L)), IntSize.m7777constructorimpl((i << 32) | (i2 & 4294967295L)), LayoutDirection.Ltr);
                Placeable.PlacementScope.place$default(placementScope, placeable, IntOffset.m7739getXimpl(mo4178alignKFBX0sM), IntOffset.m7740getYimpl(mo4178alignKFBX0sM), 0.0f, 4, null);
            }
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
