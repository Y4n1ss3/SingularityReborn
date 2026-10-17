package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import defpackage.g7;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import java.util.Collection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode textFieldDragAndDropNode(iy iyVar, final my myVar, final ky kyVar, final ky kyVar2, final ky kyVar3, final ky kyVar4, final ky kyVar5, final ky kyVar6, final ky kyVar7) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new g7(11, iyVar), new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onChanged(DragAndDropEvent dragAndDropEvent) {
                ky kyVar8 = kyVar5;
                if (kyVar8 != null) {
                    kyVar8.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                ky.this.invoke(dragAndDropEvent);
                return ((Boolean) myVar.invoke(AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription()))).booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                ky kyVar8 = kyVar7;
                if (kyVar8 != null) {
                    kyVar8.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                ky kyVar8 = kyVar3;
                if (kyVar8 != null) {
                    kyVar8.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                ky kyVar8 = kyVar6;
                if (kyVar8 != null) {
                    kyVar8.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onMoved(DragAndDropEvent dragAndDropEvent) {
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
                ky kyVar8 = kyVar4;
                if (kyVar8 != null) {
                    float x = androidDragEvent.getX();
                    float y = androidDragEvent.getY();
                    kyVar8.invoke(Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L))));
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                ky kyVar8 = kyVar2;
                if (kyVar8 != null) {
                    kyVar8.invoke(dragAndDropEvent);
                }
            }
        });
    }

    public static /* synthetic */ DragAndDropTargetModifierNode textFieldDragAndDropNode$default(iy iyVar, my myVar, ky kyVar, ky kyVar2, ky kyVar3, ky kyVar4, ky kyVar5, ky kyVar6, ky kyVar7, int i, Object obj) {
        if ((i & 8) != 0) {
            kyVar2 = null;
        }
        if ((i & 16) != 0) {
            kyVar3 = null;
        }
        if ((i & 32) != 0) {
            kyVar4 = null;
        }
        if ((i & 64) != 0) {
            kyVar5 = null;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            kyVar6 = null;
        }
        if ((i & Fields.RotationX) != 0) {
            kyVar7 = null;
        }
        return textFieldDragAndDropNode(iyVar, myVar, kyVar, kyVar2, kyVar3, kyVar4, kyVar5, kyVar6, kyVar7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean textFieldDragAndDropNode$lambda$0(iy iyVar, DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
        Iterable<MediaType> iterable = (Iterable) iyVar.invoke();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (MediaType mediaType : iterable) {
            if (q10.b(mediaType, MediaType.Companion.getAll()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                return true;
            }
        }
        return false;
    }
}
