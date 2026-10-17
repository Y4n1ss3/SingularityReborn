package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Listener$otherA11yServicesListener$1 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    private final MutableState switchAccessEnabled$delegate;
    final /* synthetic */ Listener this$0;
    private final MutableState voiceAccessEnabled$delegate;

    public Listener$otherA11yServicesListener$1(Listener listener) {
        this.this$0 = listener;
        Boolean bool = Boolean.FALSE;
        this.switchAccessEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.voiceAccessEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwitchAccessEnabled() {
        return ((Boolean) this.switchAccessEnabled$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVoiceAccessEnabled() {
        return ((Boolean) this.voiceAccessEnabled$delegate.getValue()).booleanValue();
    }

    public void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        boolean switchAccessEnabled;
        boolean voiceAccessEnabled;
        switchAccessEnabled = this.this$0.getSwitchAccessEnabled(accessibilityManager);
        setSwitchAccessEnabled(switchAccessEnabled);
        voiceAccessEnabled = this.this$0.getVoiceAccessEnabled(accessibilityManager);
        setVoiceAccessEnabled(voiceAccessEnabled);
    }

    public final void setSwitchAccessEnabled(boolean z) {
        this.switchAccessEnabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setVoiceAccessEnabled(boolean z) {
        this.voiceAccessEnabled$delegate.setValue(Boolean.valueOf(z));
    }
}
