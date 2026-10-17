package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DragAndDropTransferData {
    public static final int $stable = 8;
    private final ClipData clipData;
    private final int flags;
    private final Object localState;

    public /* synthetic */ DragAndDropTransferData(ClipData clipData, Object obj, int i, int i2, dq dqVar) {
        this(clipData, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? 0 : i);
    }

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final Object getLocalState() {
        return this.localState;
    }

    public DragAndDropTransferData(ClipData clipData, Object obj, int i) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i;
    }
}
