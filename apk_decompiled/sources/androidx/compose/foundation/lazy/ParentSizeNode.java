package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.dq;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    private float fraction;
    private State<Integer> heightState;
    private State<Integer> widthState;

    public /* synthetic */ ParentSizeNode(float f, State state, State state2, int i, dq dqVar) {
        this(f, (i & 2) != 0 ? null : state, (i & 4) != 0 ? null : state2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$2(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        State<Integer> state = this.widthState;
        int round = (state == null || state.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(state.getValue().floatValue() * this.fraction);
        State<Integer> state2 = this.heightState;
        int round2 = (state2 == null || state2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(state2.getValue().floatValue() * this.fraction);
        int m7566getMinWidthimpl = round != Integer.MAX_VALUE ? round : Constraints.m7566getMinWidthimpl(j);
        int m7565getMinHeightimpl = round2 != Integer.MAX_VALUE ? round2 : Constraints.m7565getMinHeightimpl(j);
        if (round == Integer.MAX_VALUE) {
            round = Constraints.m7564getMaxWidthimpl(j);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = Constraints.m7563getMaxHeightimpl(j);
        }
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.Constraints(m7566getMinWidthimpl, round, m7565getMinHeightimpl, round2));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new ky() { // from class: androidx.compose.foundation.lazy.d
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$2;
                measure_3p2s80s$lambda$2 = ParentSizeNode.measure_3p2s80s$lambda$2(Placeable.this, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$2;
            }
        }, 4, null);
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }

    public final void setHeightState(State<Integer> state) {
        this.heightState = state;
    }

    public final void setWidthState(State<Integer> state) {
        this.widthState = state;
    }

    public ParentSizeNode(float f, State<Integer> state, State<Integer> state2) {
        this.fraction = f;
        this.widthState = state;
        this.heightState = state2;
    }
}
