package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SkipToLookaheadSizeNode$measure$2 extends f30 implements ky {
    final /* synthetic */ long $constrainedSize;
    final /* synthetic */ Placeable $p;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ SkipToLookaheadSizeNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkipToLookaheadSizeNode$measure$2(SkipToLookaheadSizeNode skipToLookaheadSizeNode, Placeable placeable, long j, MeasureScope measureScope) {
        super(1);
        this.this$0 = skipToLookaheadSizeNode;
        this.$p = placeable;
        this.$constrainedSize = j;
        this.$this_measure = measureScope;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        long j;
        long m6347constructorimpl;
        long j2;
        long j3;
        long j4;
        long j5;
        ScaleToBoundsImpl scaleToBounds = this.this$0.getScaleToBounds();
        if (scaleToBounds == null) {
            Placeable.PlacementScope.place$default(placementScope, this.$p, 0, 0, 0.0f, 4, null);
            return;
        }
        ContentScale contentScale = scaleToBounds.getContentScale();
        j = this.this$0.lookaheadSize;
        if (((int) (j >> 32)) != 0) {
            j4 = this.this$0.lookaheadSize;
            if (((int) (j4 & 4294967295L)) != 0) {
                j5 = this.this$0.lookaheadSize;
                m6347constructorimpl = contentScale.mo6227computeScaleFactorH7hwNQA(IntSizeKt.m7794toSizeozmzZPI(j5), IntSizeKt.m7794toSizeozmzZPI(this.$constrainedSize));
                Alignment alignment = scaleToBounds.getAlignment();
                j2 = this.this$0.lookaheadSize;
                int P = y80.P(Float.intBitsToFloat((int) (m6347constructorimpl >> 32)) * ((int) (j2 >> 32)));
                j3 = this.this$0.lookaheadSize;
                long mo4178alignKFBX0sM = alignment.mo4178alignKFBX0sM(IntSize.m7777constructorimpl((y80.P(Float.intBitsToFloat((int) (m6347constructorimpl & 4294967295L)) * ((int) (j3 & 4294967295L))) & 4294967295L) | (P << 32)), this.$constrainedSize, this.$this_measure.getLayoutDirection());
                Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$p, IntOffset.m7739getXimpl(mo4178alignKFBX0sM), IntOffset.m7740getYimpl(mo4178alignKFBX0sM), 0.0f, new AnonymousClass1(m6347constructorimpl), 4, (Object) null);
            }
        }
        m6347constructorimpl = ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
        Alignment alignment2 = scaleToBounds.getAlignment();
        j2 = this.this$0.lookaheadSize;
        int P2 = y80.P(Float.intBitsToFloat((int) (m6347constructorimpl >> 32)) * ((int) (j2 >> 32)));
        j3 = this.this$0.lookaheadSize;
        long mo4178alignKFBX0sM2 = alignment2.mo4178alignKFBX0sM(IntSize.m7777constructorimpl((y80.P(Float.intBitsToFloat((int) (m6347constructorimpl & 4294967295L)) * ((int) (j3 & 4294967295L))) & 4294967295L) | (P2 << 32)), this.$constrainedSize, this.$this_measure.getLayoutDirection());
        Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$p, IntOffset.m7739getXimpl(mo4178alignKFBX0sM2), IntOffset.m7740getYimpl(mo4178alignKFBX0sM2), 0.0f, new AnonymousClass1(m6347constructorimpl), 4, (Object) null);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements ky {
        final /* synthetic */ long $resolvedScale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(1);
            this.$resolvedScale = j;
        }

        public final void invoke(GraphicsLayerScope graphicsLayerScope) {
            graphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (this.$resolvedScale >> 32)));
            graphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (this.$resolvedScale & 4294967295L)));
            graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GraphicsLayerScope) obj);
            return w01.a;
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
