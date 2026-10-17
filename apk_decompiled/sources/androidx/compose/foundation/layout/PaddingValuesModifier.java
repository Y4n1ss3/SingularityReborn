package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1(Placeable placeable, int i, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        return w01.a;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float mo712calculateLeftPaddingu2uoSUM = this.paddingValues.mo712calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float mo714calculateTopPaddingD9Ej5fM = this.paddingValues.mo714calculateTopPaddingD9Ej5fM();
        float mo713calculateRightPaddingu2uoSUM = this.paddingValues.mo713calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float mo711calculateBottomPaddingD9Ej5fM = this.paddingValues.mo711calculateBottomPaddingD9Ej5fM();
        if (!((Dp.m7610compareTo0680j_4(mo712calculateLeftPaddingu2uoSUM, Dp.m7611constructorimpl(0.0f)) >= 0) & (Dp.m7610compareTo0680j_4(mo714calculateTopPaddingD9Ej5fM, Dp.m7611constructorimpl(0.0f)) >= 0) & (Dp.m7610compareTo0680j_4(mo713calculateRightPaddingu2uoSUM, Dp.m7611constructorimpl(0.0f)) >= 0) & (Dp.m7610compareTo0680j_4(mo711calculateBottomPaddingD9Ej5fM, Dp.m7611constructorimpl(0.0f)) >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
        final int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(mo712calculateLeftPaddingu2uoSUM);
        int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(mo713calculateRightPaddingu2uoSUM) + mo361roundToPx0680j_4;
        final int mo361roundToPx0680j_43 = measureScope.mo361roundToPx0680j_4(mo714calculateTopPaddingD9Ej5fM);
        int mo361roundToPx0680j_44 = measureScope.mo361roundToPx0680j_4(mo711calculateBottomPaddingD9Ej5fM) + mo361roundToPx0680j_43;
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(j, -mo361roundToPx0680j_42, -mo361roundToPx0680j_44));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m7581constrainWidthK40F9xA(j, mo6234measureBRTryo0.getWidth() + mo361roundToPx0680j_42), ConstraintsKt.m7580constrainHeightK40F9xA(j, mo6234measureBRTryo0.getHeight() + mo361roundToPx0680j_44), null, new ky() { // from class: androidx.compose.foundation.layout.i
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$1;
                int i = mo361roundToPx0680j_4;
                measure_3p2s80s$lambda$1 = PaddingValuesModifier.measure_3p2s80s$lambda$1(mo6234measureBRTryo0, i, mo361roundToPx0680j_43, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$1;
            }
        }, 4, null);
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }
}
