package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class NestedScrollElement extends ModifierNodeElement<NestedScrollNode> {
    private final NestedScrollConnection connection;
    private final NestedScrollDispatcher dispatcher;

    public NestedScrollElement(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.dispatcher = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public NestedScrollNode create() {
        return new NestedScrollNode(this.connection, this.dispatcher);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return q10.b(nestedScrollElement.connection, this.connection) && q10.b(nestedScrollElement.dispatcher, this.dispatcher);
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.connection.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
        return hashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("nestedScroll");
        inspectorInfo.getProperties().set("connection", this.connection);
        inspectorInfo.getProperties().set("dispatcher", this.dispatcher);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(NestedScrollNode nestedScrollNode) {
        nestedScrollNode.updateNode$ui(this.connection, this.dispatcher);
    }
}
