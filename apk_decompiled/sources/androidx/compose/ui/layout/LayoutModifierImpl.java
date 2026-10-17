package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private ny measureBlock;

    public LayoutModifierImpl(ny nyVar) {
        this.measureBlock = nyVar;
    }

    public final ny getMeasureBlock() {
        return this.measureBlock;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return (MeasureResult) this.measureBlock.invoke(measureScope, measurable, Constraints.m7551boximpl(j));
    }

    public final void setMeasureBlock(ny nyVar) {
        this.measureBlock = nyVar;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
