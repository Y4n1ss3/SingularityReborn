package androidx.compose.foundation.content;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import defpackage.ky;
import defpackage.yi;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransferableContent_androidKt {
    public static final TransferableContent consume(TransferableContent transferableContent, ky kyVar) {
        ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() != 1) {
            int itemCount = clipData.getItemCount();
            ArrayList arrayList = null;
            for (int i = 0; i < itemCount; i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (!((Boolean) kyVar.invoke(itemAt)).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() != clipData.getItemCount()) {
                ClipDescription clipDescription = new ClipDescription(transferableContent.getClipMetadata().getClipDescription());
                ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) yi.p0(arrayList));
                int size = arrayList.size();
                for (int i2 = 1; i2 < size; i2++) {
                    clipData2.addItem((ClipData.Item) arrayList.get(i2));
                }
                return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData2), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.m318getSourcekB6V9T0(), transferableContent.getPlatformTransferableContent(), null);
            }
        } else if (((Boolean) kyVar.invoke(clipData.getItemAt(0))).booleanValue()) {
            return null;
        }
        return transferableContent;
    }

    public static final boolean hasMediaType(TransferableContent transferableContent, MediaType mediaType) {
        return transferableContent.getClipMetadata().getClipDescription().hasMimeType(mediaType.getRepresentation());
    }

    public static final String readPlainText(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipEntry.getClipData().getItemAt(i).getText() != null;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipEntry.getClipData().getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount2; i2++) {
            CharSequence text = clipEntry.getClipData().getItemAt(i2).getText();
            if (text != null) {
                if (z2) {
                    sb.append("\n");
                }
                sb.append(text);
                z2 = true;
            }
        }
        return sb.toString();
    }
}
