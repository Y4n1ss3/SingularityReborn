package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoundsAnimationModifierNode extends Modifier.Node implements ApproachLayoutModifierNode {
    public static final int $stable = 8;
    private boolean animateMotionFrameOfReference;
    private BoundsTransform boundsTransform;
    private LookaheadScope lookaheadScope;
    private my onChooseMeasureConstraints;
    private boolean directManipulationParentsDirty = true;
    private final BoundsTransformDeferredAnimation boundsAnimation = new BoundsTransformDeferredAnimation();

    public BoundsAnimationModifierNode(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, my myVar, boolean z) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.onChooseMeasureConstraints = myVar;
        this.animateMotionFrameOfReference = z;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    public MeasureResult mo38approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        long m7794toSizeozmzZPI = this.boundsAnimation.m41getCurrentSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats ? IntSizeKt.m7794toSizeozmzZPI(approachMeasureScope.mo6212getLookaheadSizeYbymL2g()) : this.boundsAnimation.m41getCurrentSizeNHjbRc();
        Rect value = this.boundsAnimation.getValue();
        if (value != null) {
            m7794toSizeozmzZPI = value.m4549getSizeNHjbRc();
        }
        long m7790roundToIntSizeuvyYCjk = IntSizeKt.m7790roundToIntSizeuvyYCjk(m7794toSizeozmzZPI);
        long m7570unboximpl = ((Constraints) this.onChooseMeasureConstraints.invoke(IntSize.m7774boximpl(m7790roundToIntSizeuvyYCjk), Constraints.m7551boximpl(j))).m7570unboximpl();
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(m7570unboximpl);
        long m7578constrain4WqzIAM = ConstraintsKt.m7578constrain4WqzIAM(m7570unboximpl, m7790roundToIntSizeuvyYCjk);
        return MeasureScope.layout$default(approachMeasureScope, (int) (m7578constrain4WqzIAM >> 32), (int) (m7578constrain4WqzIAM & 4294967295L), null, new BoundsAnimationModifierNode$approachMeasure$1(this, mo6234measureBRTryo0), 4, null);
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    public final my getOnChooseMeasureConstraints() {
        return this.onChooseMeasureConstraints;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    public boolean mo39isMeasurementApproachInProgressozmzZPI(long j) {
        this.boundsAnimation.m44updateTargetSizeuvyYCjk(IntSizeKt.m7794toSizeozmzZPI(j));
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        this.boundsAnimation.updateTargetOffsetAndAnimate(this.lookaheadScope, placementScope, getCoroutineScope(), this.directManipulationParentsDirty, this.animateMotionFrameOfReference, this.boundsTransform);
        this.directManipulationParentsDirty = this.animateMotionFrameOfReference;
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.directManipulationParentsDirty = true;
    }

    public final void setAnimateMotionFrameOfReference(boolean z) {
        this.animateMotionFrameOfReference = z;
    }

    public final void setBoundsTransform(BoundsTransform boundsTransform) {
        this.boundsTransform = boundsTransform;
    }

    public final void setLookaheadScope(LookaheadScope lookaheadScope) {
        this.lookaheadScope = lookaheadScope;
    }

    public final void setOnChooseMeasureConstraints(my myVar) {
        this.onChooseMeasureConstraints = myVar;
    }
}
