package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final my finishedListener;

    public SizeAnimationModifierElement(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, my myVar) {
        this.animationSpec = finiteAnimationSpec;
        this.alignment = alignment;
        this.finishedListener = myVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SizeAnimationModifierNode create() {
        return new SizeAnimationModifierNode(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return q10.b(sizeAnimationModifierElement.animationSpec, this.animationSpec) && sizeAnimationModifierElement.finishedListener == this.finishedListener && q10.b(sizeAnimationModifierElement.alignment, this.alignment);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final my getFinishedListener() {
        return this.finishedListener;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = (this.alignment.hashCode() + (this.animationSpec.hashCode() * 31)) * 31;
        my myVar = this.finishedListener;
        return hashCode + (myVar != null ? myVar.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.animationSpec);
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("finishedListener", this.finishedListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SizeAnimationModifierNode sizeAnimationModifierNode) {
        sizeAnimationModifierNode.setAnimationSpec(this.animationSpec);
        sizeAnimationModifierNode.setListener(this.finishedListener);
        sizeAnimationModifierNode.setAlignment(this.alignment);
    }
}
