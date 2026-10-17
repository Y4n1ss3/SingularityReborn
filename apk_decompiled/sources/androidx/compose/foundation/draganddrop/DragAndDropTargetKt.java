package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropTargetKt {
    public static final Modifier dragAndDropTarget(Modifier modifier, ky kyVar, DragAndDropTarget dragAndDropTarget) {
        return modifier.then(new DropTargetElement(kyVar, dragAndDropTarget));
    }
}
