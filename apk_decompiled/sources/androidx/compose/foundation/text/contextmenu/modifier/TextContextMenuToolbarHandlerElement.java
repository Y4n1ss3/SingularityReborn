package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextContextMenuToolbarHandlerElement extends ModifierNodeElement<TextContextMenuToolbarHandlerNode> {
    private final ky computeContentBounds;
    private final ky onHide;
    private final ky onShow;
    private final ToolbarRequester requester;

    public TextContextMenuToolbarHandlerElement(ToolbarRequester toolbarRequester, ky kyVar, ky kyVar2, ky kyVar3) {
        this.requester = toolbarRequester;
        this.onShow = kyVar;
        this.onHide = kyVar2;
        this.computeContentBounds = kyVar3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextContextMenuToolbarHandlerNode create() {
        return new TextContextMenuToolbarHandlerNode(this.requester, this.onShow, this.onHide, this.computeContentBounds);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.requester == textContextMenuToolbarHandlerElement.requester && this.onShow == textContextMenuToolbarHandlerElement.onShow && this.onHide == textContextMenuToolbarHandlerElement.onHide && this.computeContentBounds == textContextMenuToolbarHandlerElement.computeContentBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.requester.hashCode() * 31;
        ky kyVar = this.onShow;
        int hashCode2 = (hashCode + (kyVar != null ? kyVar.hashCode() : 0)) * 31;
        ky kyVar2 = this.onHide;
        return this.computeContentBounds.hashCode() + ((hashCode2 + (kyVar2 != null ? kyVar2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        textContextMenuToolbarHandlerNode.update(this.requester);
        textContextMenuToolbarHandlerNode.setOnShow(this.onShow);
        textContextMenuToolbarHandlerNode.setOnHide(this.onHide);
        textContextMenuToolbarHandlerNode.setComputeContentBounds(this.computeContentBounds);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
