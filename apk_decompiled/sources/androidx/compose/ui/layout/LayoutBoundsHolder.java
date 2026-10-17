package androidx.compose.ui.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutBoundsHolder {
    public static final int $stable = 0;
    private final MutableState bounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final RelativeLayoutBounds getBounds() {
        return (RelativeLayoutBounds) this.bounds$delegate.getValue();
    }

    public final void setBounds$ui(RelativeLayoutBounds relativeLayoutBounds) {
        this.bounds$delegate.setValue(relativeLayoutBounds);
    }
}
