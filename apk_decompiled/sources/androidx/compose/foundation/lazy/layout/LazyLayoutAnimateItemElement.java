package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Float> fadeInSpec;
    private final FiniteAnimationSpec<Float> fadeOutSpec;
    private final FiniteAnimationSpec<IntOffset> placementSpec;

    public LazyLayoutAnimateItemElement(FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        this.fadeInSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
        this.fadeOutSpec = finiteAnimationSpec3;
    }

    private final FiniteAnimationSpec<Float> component1() {
        return this.fadeInSpec;
    }

    private final FiniteAnimationSpec<IntOffset> component2() {
        return this.placementSpec;
    }

    private final FiniteAnimationSpec<Float> component3() {
        return this.fadeOutSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyLayoutAnimateItemElement copy$default(LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = lazyLayoutAnimateItemElement.fadeInSpec;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec2 = lazyLayoutAnimateItemElement.placementSpec;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec3 = lazyLayoutAnimateItemElement.fadeOutSpec;
        }
        return lazyLayoutAnimateItemElement.copy(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    public final LazyLayoutAnimateItemElement copy(FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        return new LazyLayoutAnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(this.fadeInSpec, this.placementSpec, this.fadeOutSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return q10.b(this.fadeInSpec, lazyLayoutAnimateItemElement.fadeInSpec) && q10.b(this.placementSpec, lazyLayoutAnimateItemElement.placementSpec) && q10.b(this.fadeOutSpec, lazyLayoutAnimateItemElement.fadeOutSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        int hashCode = (finiteAnimationSpec == null ? 0 : finiteAnimationSpec.hashCode()) * 31;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = this.placementSpec;
        int hashCode2 = (hashCode + (finiteAnimationSpec2 == null ? 0 : finiteAnimationSpec2.hashCode())) * 31;
        FiniteAnimationSpec<Float> finiteAnimationSpec3 = this.fadeOutSpec;
        return hashCode2 + (finiteAnimationSpec3 != null ? finiteAnimationSpec3.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItem");
        inspectorInfo.getProperties().set("fadeInSpec", this.fadeInSpec);
        inspectorInfo.getProperties().set("placementSpec", this.placementSpec);
        inspectorInfo.getProperties().set("fadeOutSpec", this.fadeOutSpec);
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.fadeInSpec + ", placementSpec=" + this.placementSpec + ", fadeOutSpec=" + this.fadeOutSpec + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode) {
        lazyLayoutAnimationSpecsNode.setFadeInSpec(this.fadeInSpec);
        lazyLayoutAnimationSpecsNode.setPlacementSpec(this.placementSpec);
        lazyLayoutAnimationSpecsNode.setFadeOutSpec(this.fadeOutSpec);
    }
}
