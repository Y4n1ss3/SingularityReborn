package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import defpackage.dq;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadScopeImpl implements LookaheadScope {
    public static final int $stable = 8;
    private iy scopeCoordinates;

    public /* synthetic */ LookaheadScopeImpl(iy iyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? null : iyVar);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        iy iyVar = this.scopeCoordinates;
        iyVar.getClass();
        return (LayoutCoordinates) iyVar.invoke();
    }

    public final iy getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    public final void setScopeCoordinates(iy iyVar) {
        this.scopeCoordinates = iyVar;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates2 = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates2 != null) {
            return lookaheadLayoutCoordinates2;
        }
        layoutCoordinates.getClass();
        NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : lookaheadLayoutCoordinates;
    }

    public LookaheadScopeImpl(iy iyVar) {
        this.scopeCoordinates = iyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
