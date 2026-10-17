package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1 extends f30 implements ky {
    public static final OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1();

    public OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1() {
        super(1);
    }

    public final void invoke(LayoutNode layoutNode) {
        if (layoutNode.isValidOwnerScope()) {
            LayoutNode.requestLookaheadRelayout$ui$default(layoutNode, false, 1, null);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return w01.a;
    }
}
