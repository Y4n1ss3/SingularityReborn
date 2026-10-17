package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a1 extends AccessibilityNodeProvider {
    public final b1 a;

    public a1(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.addExtraDataToAccessibilityNodeInfo(i, new z0(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        z0 createAccessibilityNodeInfo = this.a.createAccessibilityNodeInfo(i);
        if (createAccessibilityNodeInfo == null) {
            return null;
        }
        return createAccessibilityNodeInfo.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        List<z0> findAccessibilityNodeInfosByText = this.a.findAccessibilityNodeInfosByText(str, i);
        if (findAccessibilityNodeInfosByText == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = findAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(findAccessibilityNodeInfosByText.get(i2).a);
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        z0 findFocus = this.a.findFocus(i);
        if (findFocus == null) {
            return null;
        }
        return findFocus.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.performAction(i, i2, bundle);
    }
}
