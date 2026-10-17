package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedBoundsNodeElement extends ModifierNodeElement<SharedBoundsNode> {
    public static final int $stable = 0;
    private final SharedElementEntry sharedElementState;

    public SharedBoundsNodeElement(SharedElementEntry sharedElementEntry) {
        this.sharedElementState = sharedElementEntry;
    }

    public static /* synthetic */ SharedBoundsNodeElement copy$default(SharedBoundsNodeElement sharedBoundsNodeElement, SharedElementEntry sharedElementEntry, int i, Object obj) {
        if ((i & 1) != 0) {
            sharedElementEntry = sharedBoundsNodeElement.sharedElementState;
        }
        return sharedBoundsNodeElement.copy(sharedElementEntry);
    }

    public final SharedElementEntry component1() {
        return this.sharedElementState;
    }

    public final SharedBoundsNodeElement copy(SharedElementEntry sharedElementEntry) {
        return new SharedBoundsNodeElement(sharedElementEntry);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SharedBoundsNode create() {
        return new SharedBoundsNode(this.sharedElementState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && q10.b(this.sharedElementState, ((SharedBoundsNodeElement) obj).sharedElementState);
    }

    public final SharedElementEntry getSharedElementState() {
        return this.sharedElementState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.sharedElementState.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sharedBounds");
        inspectorInfo.getProperties().set("sharedElementState", this.sharedElementState);
    }

    public String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.sharedElementState + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SharedBoundsNode sharedBoundsNode) {
        sharedBoundsNode.setSharedElementEntry$animation(this.sharedElementState);
    }
}
