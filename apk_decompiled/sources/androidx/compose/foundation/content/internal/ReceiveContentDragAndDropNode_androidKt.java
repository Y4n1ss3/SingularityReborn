package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import defpackage.je0;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReceiveContentDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode ReceiveContentDragAndDropNode(final ReceiveContentConfiguration receiveContentConfiguration, final ky kyVar) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new je0(12), new DragAndDropTarget() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                kyVar.invoke(dragAndDropEvent);
                TransferableContent transferableContent = ReceiveContentDragAndDropNode_androidKt.toTransferableContent(dragAndDropEvent);
                return !q10.b(transferableContent, ReceiveContentConfiguration.this.getReceiveContentListener().onReceive(transferableContent));
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentConfiguration.this.getReceiveContentListener().onDragEnd();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentConfiguration.this.getReceiveContentListener().onDragEnter();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentConfiguration.this.getReceiveContentListener().onDragExit();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentConfiguration.this.getReceiveContentListener().onDragStart();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ReceiveContentDragAndDropNode$lambda$0(DragAndDropEvent dragAndDropEvent) {
        return true;
    }

    public static final TransferableContent toTransferableContent(DragAndDropEvent dragAndDropEvent) {
        DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
        return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(androidDragEvent.getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(androidDragEvent.getClipDescription()), TransferableContent.Source.Companion.m327getDragAndDropkB6V9T0(), null, 8, null);
    }
}
