package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dq;
import defpackage.iy;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SkipToLookaheadSizeElement extends ModifierNodeElement<SkipToLookaheadSizeNode> {
    public static final int $stable = 0;
    private final iy isEnabled;
    private final ScaleToBoundsImpl scaleToBounds;

    public /* synthetic */ SkipToLookaheadSizeElement(ScaleToBoundsImpl scaleToBoundsImpl, iy iyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? null : scaleToBoundsImpl, (i & 2) != 0 ? SkipToLookaheadSizeNodeKt.DefaultEnabled : iyVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SkipToLookaheadSizeNode create() {
        return new SkipToLookaheadSizeNode(this.scaleToBounds, this.isEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof SkipToLookaheadSizeElement)) {
            return false;
        }
        SkipToLookaheadSizeElement skipToLookaheadSizeElement = (SkipToLookaheadSizeElement) obj;
        return skipToLookaheadSizeElement.isEnabled == this.isEnabled && q10.b(skipToLookaheadSizeElement.scaleToBounds, this.scaleToBounds);
    }

    public final ScaleToBoundsImpl getScaleToBounds() {
        return this.scaleToBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.isEnabled.hashCode() * 31;
        ScaleToBoundsImpl scaleToBoundsImpl = this.scaleToBounds;
        return hashCode + (scaleToBoundsImpl != null ? scaleToBoundsImpl.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("skipToLookahead");
        inspectorInfo.getProperties().set("scaleToBounds", this.scaleToBounds);
        inspectorInfo.getProperties().set("isEnabled", this.isEnabled);
    }

    public final iy isEnabled() {
        return this.isEnabled;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SkipToLookaheadSizeNode skipToLookaheadSizeNode) {
        skipToLookaheadSizeNode.setScaleToBounds(this.scaleToBounds);
        skipToLookaheadSizeNode.setEnabled(this.isEnabled);
    }

    public SkipToLookaheadSizeElement(ScaleToBoundsImpl scaleToBoundsImpl, iy iyVar) {
        this.scaleToBounds = scaleToBoundsImpl;
        this.isEnabled = iyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkipToLookaheadSizeElement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
