package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ZIndexNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private float zIndex;

    public ZIndexNode(float f) {
        this.zIndex = f;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new ZIndexNode$measure$1(mo6234measureBRTryo0, this), 4, null);
    }

    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    public String toString() {
        return k4.g(new StringBuilder("ZIndexModifier(zIndex="), this.zIndex, ')');
    }
}
