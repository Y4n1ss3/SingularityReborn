package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.q10;
import defpackage.w01;
import defpackage.x00;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class InsetsPaddingModifierNode extends InsetsConsumingModifierNode implements LayoutModifierNode {
    public static final int $stable = 8;
    private WindowInsets insets;

    public InsetsPaddingModifierNode(WindowInsets windowInsets) {
        this.insets = windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, int i, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return WindowInsetsKt.union(windowInsets, this.insets);
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public void insetsInvalidated() {
        super.insetsInvalidated();
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int left = getConsumedInsets().getLeft(measureScope, measureScope.getLayoutDirection()) - getAncestorConsumedInsets().getLeft(measureScope, measureScope.getLayoutDirection());
        int top = getConsumedInsets().getTop(measureScope) - getAncestorConsumedInsets().getTop(measureScope);
        int right = (getConsumedInsets().getRight(measureScope, measureScope.getLayoutDirection()) - getAncestorConsumedInsets().getRight(measureScope, measureScope.getLayoutDirection())) + left;
        int bottom = (getConsumedInsets().getBottom(measureScope) - getAncestorConsumedInsets().getBottom(measureScope)) + top;
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(j, -right, -bottom));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m7581constrainWidthK40F9xA(j, mo6234measureBRTryo0.getWidth() + right), ConstraintsKt.m7580constrainHeightK40F9xA(j, mo6234measureBRTryo0.getHeight() + bottom), null, new x00(mo6234measureBRTryo0, left, top, 0), 4, null);
    }

    public final void update(WindowInsets windowInsets) {
        if (q10.b(windowInsets, this.insets)) {
            return;
        }
        this.insets = windowInsets;
        insetsInvalidated();
    }
}
