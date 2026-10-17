package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AspectRatioElement extends ModifierNodeElement<AspectRatioNode> {
    private final float aspectRatio;
    private final ky inspectorInfo;
    private final boolean matchHeightConstraintsFirst;

    public AspectRatioElement(float f, boolean z, ky kyVar) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
        this.inspectorInfo = kyVar;
        if (f > 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("aspectRatio " + f + " must be > 0");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AspectRatioNode create() {
        return new AspectRatioNode(this.aspectRatio, this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        return aspectRatioElement != null && this.aspectRatio == aspectRatioElement.aspectRatio && this.matchHeightConstraintsFirst == ((AspectRatioElement) obj).matchHeightConstraintsFirst;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.matchHeightConstraintsFirst) + (Float.hashCode(this.aspectRatio) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AspectRatioNode aspectRatioNode) {
        aspectRatioNode.setAspectRatio(this.aspectRatio);
        aspectRatioNode.setMatchHeightConstraintsFirst(this.matchHeightConstraintsFirst);
    }
}
