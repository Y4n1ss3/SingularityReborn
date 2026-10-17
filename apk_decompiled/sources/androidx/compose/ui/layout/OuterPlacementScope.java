package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class OuterPlacementScope extends Placeable.PlacementScope {
    private final Owner owner;

    public OuterPlacementScope(Owner owner) {
        this.owner = owner;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutCoordinates getCoordinates() {
        return this.owner.getRoot().getOuterCoordinator$ui();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.owner.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.owner.getDensity().getFontScale();
    }

    public final Owner getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.owner.getRoot().getWidth();
    }
}
