package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.ds0;
import defpackage.t0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {
    private final MutableState accessibilityEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final boolean listenToSwitchAccessState;
    private final boolean listenToVoiceAccessState;
    private final Listener$otherA11yServicesListener$1 otherA11yServicesListener;
    private final Listener$touchExplorationListener$1 touchExplorationListener;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public static final void addAccessibilityServicesStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void removeAccessibilityServicesStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    public Listener(boolean z, boolean z2, boolean z3) {
        this.listenToSwitchAccessState = z2;
        this.listenToVoiceAccessState = z3;
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1 = null;
        this.touchExplorationListener = z ? new Listener$touchExplorationListener$1() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            listener$otherA11yServicesListener$1 = new Listener$otherA11yServicesListener$1(this);
        }
        this.otherA11yServicesListener = listener$otherA11yServicesListener$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSwitchAccessEnabled(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && ds0.g0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getVoiceAccessEnabled(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && ds0.g0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    private final void setAccessibilityEnabled(boolean z) {
        this.accessibilityEnabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean getListenToSwitchAccessState() {
        return this.listenToSwitchAccessState;
    }

    public final boolean getListenToVoiceAccessState() {
        return this.listenToVoiceAccessState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r0.getSwitchAccessEnabled() == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r2.getVoiceAccessEnabled() == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0.getEnabled() == true) goto L24;
     */
    @Override // androidx.compose.runtime.State
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean getValue() {
        boolean z;
        if (getAccessibilityEnabled()) {
            Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
            z = true;
            if (listener$touchExplorationListener$1 != null) {
            }
            if (this.listenToSwitchAccessState) {
                Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1 = this.otherA11yServicesListener;
                if (listener$otherA11yServicesListener$1 != null) {
                }
            }
            if (this.listenToVoiceAccessState) {
                Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$12 = this.otherA11yServicesListener;
                if (listener$otherA11yServicesListener$12 != null) {
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        setAccessibilityEnabled(z);
    }

    public final void register(AccessibilityManager accessibilityManager) {
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        setAccessibilityEnabled(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            listener$touchExplorationListener$1.setEnabled(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$otherA11yServicesListener$1 = this.otherA11yServicesListener) == null) {
            return;
        }
        listener$otherA11yServicesListener$1.setSwitchAccessEnabled(getSwitchAccessEnabled(accessibilityManager));
        listener$otherA11yServicesListener$1.setVoiceAccessEnabled(getVoiceAccessEnabled(accessibilityManager));
        Api33Impl.addAccessibilityServicesStateChangeListener(accessibilityManager, t0.c(listener$otherA11yServicesListener$1));
    }

    public final void unregister(AccessibilityManager accessibilityManager) {
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$otherA11yServicesListener$1 = this.otherA11yServicesListener) == null) {
            return;
        }
        Api33Impl.removeAccessibilityServicesStateChangeListener(accessibilityManager, t0.c(listener$otherA11yServicesListener$1));
    }
}
