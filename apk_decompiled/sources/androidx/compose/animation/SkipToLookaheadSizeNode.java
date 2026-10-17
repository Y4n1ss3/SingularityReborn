package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SkipToLookaheadSizeNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private final MutableState isEnabled$delegate;
    private Constraints lookaheadConstraints;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private final MutableState scaleToBounds$delegate;

    public SkipToLookaheadSizeNode(ScaleToBoundsImpl scaleToBoundsImpl, iy iyVar) {
        this.scaleToBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(scaleToBoundsImpl, null, 2, null);
        this.isEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(iyVar, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScaleToBoundsImpl getScaleToBounds() {
        return (ScaleToBoundsImpl) this.scaleToBounds$delegate.getValue();
    }

    public final iy isEnabled() {
        return (iy) this.isEnabled$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m37isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicHeight(i) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m37isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicWidth(i) : (int) (this.lookaheadSize >> 32);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0;
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = Constraints.m7551boximpl(j);
        }
        if (!((Boolean) isEnabled().invoke()).booleanValue()) {
            Placeable mo6234measureBRTryo02 = measurable.mo6234measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, mo6234measureBRTryo02.getWidth(), mo6234measureBRTryo02.getHeight(), null, new SkipToLookaheadSizeNode$measure$1$1(mo6234measureBRTryo02), 4, null);
        }
        if (measureScope.isLookingAhead()) {
            mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
            this.lookaheadSize = IntSize.m7777constructorimpl((mo6234measureBRTryo0.getWidth() << 32) | (mo6234measureBRTryo0.getHeight() & 4294967295L));
        } else {
            Constraints constraints = this.lookaheadConstraints;
            constraints.getClass();
            mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        }
        long m7578constrain4WqzIAM = ConstraintsKt.m7578constrain4WqzIAM(j, this.lookaheadSize);
        return MeasureScope.layout$default(measureScope, (int) (m7578constrain4WqzIAM >> 32), (int) (4294967295L & m7578constrain4WqzIAM), null, new SkipToLookaheadSizeNode$measure$2(this, mo6234measureBRTryo0, m7578constrain4WqzIAM, measureScope), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m37isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicHeight(i) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m37isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicWidth(i) : (int) (this.lookaheadSize >> 32);
    }

    public final void setEnabled(iy iyVar) {
        this.isEnabled$delegate.setValue(iyVar);
    }

    public final void setScaleToBounds(ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds$delegate.setValue(scaleToBoundsImpl);
    }
}
