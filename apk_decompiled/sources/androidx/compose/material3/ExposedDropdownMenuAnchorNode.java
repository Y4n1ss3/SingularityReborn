package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ExposedDropdownMenuAnchorNode extends Modifier.Node {
    private iy updateStateOnAttach;

    public ExposedDropdownMenuAnchorNode(iy iyVar) {
        this.updateStateOnAttach = iyVar;
    }

    public final iy getUpdateStateOnAttach() {
        return this.updateStateOnAttach;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.updateStateOnAttach.invoke();
    }

    public final void setUpdateStateOnAttach(iy iyVar) {
        this.updateStateOnAttach = iyVar;
    }
}
