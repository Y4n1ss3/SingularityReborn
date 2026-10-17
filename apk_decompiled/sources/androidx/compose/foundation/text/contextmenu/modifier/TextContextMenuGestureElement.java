package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextContextMenuGestureElement extends ModifierNodeElement<TextContextMenuGestureNode> {
    private final my onPreShowContextMenu;

    public TextContextMenuGestureElement(my myVar) {
        this.onPreShowContextMenu = myVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextContextMenuGestureNode create() {
        return new TextContextMenuGestureNode(this.onPreShowContextMenu);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextContextMenuGestureElement) && this.onPreShowContextMenu == ((TextContextMenuGestureElement) obj).onPreShowContextMenu;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        my myVar = this.onPreShowContextMenu;
        if (myVar != null) {
            return myVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("TextContextMenuGestures");
        inspectorInfo.getProperties().set("onPreShowContextMenu", this.onPreShowContextMenu);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextContextMenuGestureNode textContextMenuGestureNode) {
        textContextMenuGestureNode.update(this.onPreShowContextMenu);
    }
}
