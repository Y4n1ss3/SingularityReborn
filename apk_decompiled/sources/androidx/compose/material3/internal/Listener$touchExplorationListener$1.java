package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Listener$touchExplorationListener$1 implements AccessibilityManager.TouchExplorationStateChangeListener {
    private final MutableState enabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        setEnabled(z);
    }

    public final void setEnabled(boolean z) {
        this.enabled$delegate.setValue(Boolean.valueOf(z));
    }
}
