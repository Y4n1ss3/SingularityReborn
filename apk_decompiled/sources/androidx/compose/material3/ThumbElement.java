package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ThumbElement extends ModifierNodeElement<ThumbNode> {
    private final FiniteAnimationSpec<Float> animationSpec;
    private final boolean checked;
    private final InteractionSource interactionSource;

    public ThumbElement(InteractionSource interactionSource, boolean z, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.interactionSource = interactionSource;
        this.checked = z;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThumbElement copy$default(ThumbElement thumbElement, InteractionSource interactionSource, boolean z, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            interactionSource = thumbElement.interactionSource;
        }
        if ((i & 2) != 0) {
            z = thumbElement.checked;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = thumbElement.animationSpec;
        }
        return thumbElement.copy(interactionSource, z, finiteAnimationSpec);
    }

    public final InteractionSource component1() {
        return this.interactionSource;
    }

    public final boolean component2() {
        return this.checked;
    }

    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    public final ThumbElement copy(InteractionSource interactionSource, boolean z, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new ThumbElement(interactionSource, z, finiteAnimationSpec);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ThumbNode create() {
        return new ThumbNode(this.interactionSource, this.checked, this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return q10.b(this.interactionSource, thumbElement.interactionSource) && this.checked == thumbElement.checked && q10.b(this.animationSpec, thumbElement.animationSpec);
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.animationSpec.hashCode() + kp0.c(this.interactionSource.hashCode() * 31, 31, this.checked);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("switchThumb");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        uf.d(this.checked, inspectorInfo.getProperties(), "checked", inspectorInfo).set("animationSpec", this.animationSpec);
    }

    public String toString() {
        return "ThumbElement(interactionSource=" + this.interactionSource + ", checked=" + this.checked + ", animationSpec=" + this.animationSpec + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ThumbNode thumbNode) {
        thumbNode.setInteractionSource(this.interactionSource);
        if (thumbNode.getChecked() != this.checked) {
            LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
        }
        thumbNode.setChecked(this.checked);
        thumbNode.setAnimationSpec(this.animationSpec);
        thumbNode.update();
    }
}
