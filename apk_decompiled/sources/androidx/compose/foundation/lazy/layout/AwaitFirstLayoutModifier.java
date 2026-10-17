package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnLayoutRectChangedModifierKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import defpackage.hm;
import defpackage.nj;
import defpackage.oj;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier extends ModifierNodeElement<Node> {
    public static final int $stable = 0;
    private Node attachedNode;
    private nj lock;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class Node extends Modifier.Node {
        private DelegatableNode.RegistrationHandle handle;

        public Node() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 requestOnAfterLayoutCallback$lambda$0(Node node, AwaitFirstLayoutModifier awaitFirstLayoutModifier, RelativeLayoutBounds relativeLayoutBounds) {
            DelegatableNode.RegistrationHandle registrationHandle = node.handle;
            if (registrationHandle != null) {
                registrationHandle.unregister();
            }
            node.handle = null;
            nj njVar = awaitFirstLayoutModifier.lock;
            w01 w01Var = w01.a;
            if (njVar != null) {
                ((oj) njVar).K(w01Var);
            }
            awaitFirstLayoutModifier.lock = null;
            return w01Var;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            AwaitFirstLayoutModifier.this.attachedNode = this;
            if (AwaitFirstLayoutModifier.this.lock != null) {
                requestOnAfterLayoutCallback();
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            if (AwaitFirstLayoutModifier.this.attachedNode == this) {
                AwaitFirstLayoutModifier.this.attachedNode = null;
            }
            DelegatableNode.RegistrationHandle registrationHandle = this.handle;
            if (registrationHandle != null) {
                registrationHandle.unregister();
            }
            this.handle = null;
        }

        public final void requestOnAfterLayoutCallback() {
            this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, new defpackage.g(3, this, AwaitFirstLayoutModifier.this));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return new Node();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return 234;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("AwaitFirstLayoutModifier");
    }

    public final Object waitForFirstLayout(hm hmVar) {
        nj njVar = this.lock;
        nj njVar2 = njVar;
        if (njVar == null) {
            oj ojVar = new oj(true);
            ojVar.H(null);
            this.lock = ojVar;
            Node node = this.attachedNode;
            njVar2 = ojVar;
            if (node != null) {
                njVar2 = ojVar;
                if (node.isAttached()) {
                    node.requestOnAfterLayoutCallback();
                    njVar2 = ojVar;
                }
            }
        }
        Object r = ((oj) njVar2).r(hmVar);
        return r == vn.d ? r : w01.a;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node node) {
    }
}
