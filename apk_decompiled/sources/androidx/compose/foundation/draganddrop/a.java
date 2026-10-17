package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        boolean createAndAttachDragAndDropModifierNode$lambda$0;
        w01 dragAndDropModifierNode$lambda$0;
        w01 _init_$lambda$1;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = DragAndDropSourceDefaults$DefaultStartDetector$1.invokeSuspend$lambda$0((DragAndDropStartDetectorScope) obj2, (Offset) obj);
                return invokeSuspend$lambda$0;
            case 1:
                createAndAttachDragAndDropModifierNode$lambda$0 = DragAndDropTargetNode.createAndAttachDragAndDropModifierNode$lambda$0((DragAndDropTargetNode) obj2, (DragAndDropEvent) obj);
                return Boolean.valueOf(createAndAttachDragAndDropModifierNode$lambda$0);
            case 2:
                dragAndDropModifierNode$lambda$0 = DragSourceNodeWithDefaultPainter.dragAndDropModifierNode$lambda$0((DragSourceNodeWithDefaultPainter) obj2, (DrawScope) obj);
                return dragAndDropModifierNode$lambda$0;
            default:
                _init_$lambda$1 = LegacyDragSourceNodeWithDefaultPainter._init_$lambda$1((CacheDrawScopeDragShadowCallback) obj2, (DrawScope) obj);
                return _init_$lambda$1;
        }
    }
}
