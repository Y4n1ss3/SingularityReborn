package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Constraints;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DerivedWidthModifierNode extends InsetsConsumingModifierNode implements LayoutModifierNode {
    private WindowInsets insets;
    private ny widthCalc;
    private WindowInsets widthInsets = WindowInsetsKt.WindowInsets();

    public DerivedWidthModifierNode(WindowInsets windowInsets, ny nyVar) {
        this.insets = windowInsets;
        this.widthCalc = nyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public void insetsInvalidated() {
        this.widthInsets = WindowInsetsKt.exclude(this.insets, getAncestorConsumedInsets());
        super.insetsInvalidated();
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int intValue = ((Number) this.widthCalc.invoke(this.widthInsets, measureScope.getLayoutDirection(), measureScope)).intValue();
        if (intValue == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new b(3), 4, null);
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, intValue, intValue, 0, 0, 12, null));
        return MeasureScope.layout$default(measureScope, intValue, mo6234measureBRTryo0.getHeight(), null, new a(2, mo6234measureBRTryo0), 4, null);
    }

    public final void update(WindowInsets windowInsets, ny nyVar) {
        if (q10.b(this.insets, windowInsets) && nyVar == this.widthCalc) {
            return;
        }
        this.insets = windowInsets;
        this.widthCalc = nyVar;
        this.widthInsets = WindowInsetsKt.exclude(windowInsets, getAncestorConsumedInsets());
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
