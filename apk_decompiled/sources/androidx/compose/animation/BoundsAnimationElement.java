package androidx.compose.animation;

import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoundsAnimationElement extends ModifierNodeElement<BoundsAnimationModifierNode> {
    public static final int $stable = 0;
    private final boolean animateMotionFrameOfReference;
    private final BoundsTransform boundsTransform;
    private final LookaheadScope lookaheadScope;
    private final my resolveMeasureConstraints;

    public BoundsAnimationElement(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, my myVar, boolean z) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.resolveMeasureConstraints = myVar;
        this.animateMotionFrameOfReference = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BoundsAnimationModifierNode create() {
        return new BoundsAnimationModifierNode(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof BoundsAnimationElement)) {
            return false;
        }
        BoundsAnimationElement boundsAnimationElement = (BoundsAnimationElement) obj;
        return q10.b(boundsAnimationElement.lookaheadScope, this.lookaheadScope) && q10.b(boundsAnimationElement.boundsTransform, this.boundsTransform) && boundsAnimationElement.resolveMeasureConstraints == this.resolveMeasureConstraints && boundsAnimationElement.animateMotionFrameOfReference == this.animateMotionFrameOfReference;
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

    public final my getResolveMeasureConstraints() {
        return this.resolveMeasureConstraints;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.animateMotionFrameOfReference) + ((this.resolveMeasureConstraints.hashCode() + ((this.boundsTransform.hashCode() + (this.lookaheadScope.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("boundsAnimation");
        inspectorInfo.getProperties().set("lookaheadScope", this.lookaheadScope);
        inspectorInfo.getProperties().set("boundsTransform", this.boundsTransform);
        inspectorInfo.getProperties().set("onChooseMeasureConstraints", this.resolveMeasureConstraints);
        inspectorInfo.getProperties().set("animateMotionFrameOfReference", Boolean.valueOf(this.animateMotionFrameOfReference));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BoundsAnimationModifierNode boundsAnimationModifierNode) {
        boundsAnimationModifierNode.setLookaheadScope(this.lookaheadScope);
        boundsAnimationModifierNode.setBoundsTransform(this.boundsTransform);
        boundsAnimationModifierNode.setOnChooseMeasureConstraints(this.resolveMeasureConstraints);
        boundsAnimationModifierNode.setAnimateMotionFrameOfReference(this.animateMotionFrameOfReference);
    }
}
