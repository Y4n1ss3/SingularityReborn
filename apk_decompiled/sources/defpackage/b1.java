package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class b1 {
    public static final int HOST_VIEW_ID = -1;
    private final Object mProvider;

    public b1() {
        this.mProvider = new a1(this);
    }

    public z0 createAccessibilityNodeInfo(int i) {
        return null;
    }

    public List<z0> findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public z0 findFocus(int i) {
        return null;
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }

    public b1(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.mProvider = accessibilityNodeProvider;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, z0 z0Var, String str, Bundle bundle) {
    }
}
