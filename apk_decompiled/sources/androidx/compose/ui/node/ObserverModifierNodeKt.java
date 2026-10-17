package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(T t, iy iyVar) {
        ObserverNodeOwnerScope ownerScope$ui = t.getOwnerScope$ui();
        if (ownerScope$ui == null) {
            ownerScope$ui = new ObserverNodeOwnerScope(t);
            t.setOwnerScope$ui(ownerScope$ui);
        }
        OwnerSnapshotObserver snapshotObserver = DelegatableNodeKt.requireOwner(t).getSnapshotObserver();
        snapshotObserver.observer.observeReads(ownerScope$ui, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui(), iyVar);
    }
}
