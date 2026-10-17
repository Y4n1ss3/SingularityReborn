package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.ui.geometry.Offset;
import defpackage.k80;
import defpackage.mo0;
import defpackage.xt;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(DragAndDropEvent dragAndDropEvent) {
        float x = dragAndDropEvent.getDragEvent$ui().getX();
        float y = dragAndDropEvent.getDragEvent$ui().getY();
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
    }

    public static final Set<String> mimeTypes(DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent$ui().getClipDescription();
        if (clipDescription == null) {
            return xt.d;
        }
        mo0 mo0Var = new mo0(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i = 0; i < mimeTypeCount; i++) {
            mo0Var.add(clipDescription.getMimeType(i));
        }
        k80 k80Var = mo0Var.d;
        k80Var.b();
        k80Var.p = true;
        if (k80Var.l <= 0) {
            k80.q.getClass();
        }
        return mo0Var.size() > 0 ? mo0Var : mo0.e;
    }

    public static final DragEvent toAndroidDragEvent(DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent$ui();
    }
}
