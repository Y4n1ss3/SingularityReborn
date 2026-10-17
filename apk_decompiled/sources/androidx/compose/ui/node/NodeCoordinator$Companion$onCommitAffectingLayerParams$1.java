package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.ky;
import defpackage.o;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends f30 implements ky {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    public NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    public final void invoke(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        try {
            if (nodeCoordinator.isValidOwnerScope()) {
                NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
            }
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            o.j();
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NodeCoordinator) obj);
        return w01.a;
    }
}
