package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    private my alignmentCallback;
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(Direction direction, boolean z, my myVar) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(WrapContentNode wrapContentNode, int i, Placeable placeable, int i2, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.m6303place70tqf50$default(placementScope, placeable, ((IntOffset) wrapContentNode.alignmentCallback.invoke(IntSize.m7774boximpl(IntSize.m7777constructorimpl(((i - placeable.getWidth()) << 32) | ((i2 - placeable.getHeight()) & 4294967295L))), measureScope.getLayoutDirection())).m7748unboximpl(), 0.0f, 2, null);
        return w01.a;
    }

    public final my getAlignmentCallback() {
        return this.alignmentCallback;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int m7566getMinWidthimpl = direction != direction2 ? 0 : Constraints.m7566getMinWidthimpl(j);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.Constraints(m7566getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m7564getMaxWidthimpl(j) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m7565getMinHeightimpl(j) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m7563getMaxHeightimpl(j) : Integer.MAX_VALUE));
        final int h = y80.h(mo6234measureBRTryo0.getWidth(), Constraints.m7566getMinWidthimpl(j), Constraints.m7564getMaxWidthimpl(j));
        final int h2 = y80.h(mo6234measureBRTryo0.getHeight(), Constraints.m7565getMinHeightimpl(j), Constraints.m7563getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, h, h2, null, new ky() { // from class: androidx.compose.foundation.layout.n
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = WrapContentNode.measure_3p2s80s$lambda$0(WrapContentNode.this, h, mo6234measureBRTryo0, h2, measureScope, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }

    public final void setAlignmentCallback(my myVar) {
        this.alignmentCallback = myVar;
    }

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z) {
        this.unbounded = z;
    }
}
