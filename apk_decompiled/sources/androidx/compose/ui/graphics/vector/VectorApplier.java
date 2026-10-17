package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = AbstractApplier.$stable;

    public VectorApplier(VNode vNode) {
        super(vNode);
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        o.f("Cannot only insert VNode into Group");
        return null;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, VNode vNode) {
        asGroup(getCurrent()).insertAt(i, vNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        asGroup(getCurrent()).move(i, i2, i3);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        GroupComponent asGroup = asGroup(getRoot());
        asGroup.remove(0, asGroup.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        asGroup(getCurrent()).remove(i, i2);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, VNode vNode) {
    }
}
