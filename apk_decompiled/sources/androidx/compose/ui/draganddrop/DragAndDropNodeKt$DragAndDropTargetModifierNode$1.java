package androidx.compose.ui.draganddrop;

import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNodeKt$DragAndDropTargetModifierNode$1 extends f30 implements ky {
    final /* synthetic */ ky $shouldStartDragAndDrop;
    final /* synthetic */ DragAndDropTarget $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$DragAndDropTargetModifierNode$1(ky kyVar, DragAndDropTarget dragAndDropTarget) {
        super(1);
        this.$shouldStartDragAndDrop = kyVar;
        this.$target = dragAndDropTarget;
    }

    @Override // defpackage.ky
    public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
        if (((Boolean) this.$shouldStartDragAndDrop.invoke(dragAndDropEvent)).booleanValue()) {
            return this.$target;
        }
        return null;
    }
}
