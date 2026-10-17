package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import defpackage.cb0;
import defpackage.ki0;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {
    private final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback;
    private final DragAndDropSourceNode dragAndDropModifierNode;

    public DragSourceNodeWithDefaultPainter(my myVar, ky kyVar) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        this.cacheDrawScopeDragShadowCallback = cacheDrawScopeDragShadowCallback;
        this.dragAndDropModifierNode = (DragAndDropSourceNode) delegate(new DragAndDropSourceNode(new a(this, 2), myVar, kyVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 dragAndDropModifierNode$lambda$0(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter, DrawScope drawScope) {
        dragSourceNodeWithDefaultPainter.cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
        return w01.a;
    }

    private static Object getDetectDragStart$delegate(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        cb0 cb0Var = new cb0(dragSourceNodeWithDefaultPainter.dragAndDropModifierNode, DragAndDropSourceNode.class, "detectDragStart", "getDetectDragStart()Lkotlin/jvm/functions/Function2;", 0);
        ki0.a.getClass();
        return cb0Var;
    }

    private static Object getTransferData$delegate(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        cb0 cb0Var = new cb0(dragSourceNodeWithDefaultPainter.dragAndDropModifierNode, DragAndDropSourceNode.class, "transferData", "getTransferData()Lkotlin/jvm/functions/Function1;", 0);
        ki0.a.getClass();
        return cb0Var;
    }

    public final my getDetectDragStart() {
        return this.dragAndDropModifierNode.getDetectDragStart();
    }

    public final ky getTransferData() {
        return this.dragAndDropModifierNode.getTransferData();
    }

    public final void setDetectDragStart(my myVar) {
        this.dragAndDropModifierNode.setDetectDragStart(myVar);
    }

    public final void setTransferData(ky kyVar) {
        this.dragAndDropModifierNode.setTransferData(kyVar);
    }
}
