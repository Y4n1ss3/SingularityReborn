package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropRequestPermission_androidKt {
    private static final boolean containsContentUri(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null && q10.b(uri.getScheme(), "content")) {
                return true;
            }
        }
        return false;
    }

    public static final void dragAndDropRequestPermission(DelegatableNode delegatableNode, DragAndDropEvent dragAndDropEvent) {
        Activity tryGetActivity;
        if (containsContentUri(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()) && delegatableNode.getNode().isAttached() && (tryGetActivity = tryGetActivity(DelegatableNode_androidKt.requireView(delegatableNode))) != null) {
            tryGetActivity.requestDragAndDropPermissions(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent));
        }
    }

    private static final Activity tryGetActivity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
