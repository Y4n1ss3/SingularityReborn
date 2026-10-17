package androidx.compose.animation;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SizeAnimationModifierNode$measure$2 extends f30 implements ky {
    final /* synthetic */ int $height;
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $width;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$measure$2(SizeAnimationModifierNode sizeAnimationModifierNode, long j, int i, int i2, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.this$0 = sizeAnimationModifierNode;
        this.$measuredSize = j;
        this.$width = i;
        this.$height = i2;
        this.$this_measure = measureScope;
        this.$placeable = placeable;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.m6303place70tqf50$default(placementScope, this.$placeable, this.this$0.getAlignment().mo4178alignKFBX0sM(this.$measuredSize, IntSize.m7777constructorimpl((this.$width << 32) | (this.$height & 4294967295L)), this.$this_measure.getLayoutDirection()), 0.0f, 2, null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
