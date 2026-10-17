package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class FocusTargetPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        View embeddedView;
        boolean z;
        View findFocus;
        Rect calculateFocusRectRelativeTo;
        View embeddedView2;
        embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this);
        if (getNode().isAttached()) {
            embeddedView2 = FocusGroupNode_androidKt.getEmbeddedView(this);
            if (embeddedView2.hasFocusable()) {
                z = true;
                focusProperties.setCanFocus(z);
                findFocus = embeddedView.findFocus();
                if (findFocus != null || (calculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findFocus, embeddedView)) == null) {
                }
                focusProperties.setFocusRect(calculateFocusRectRelativeTo);
                return;
            }
        }
        z = false;
        focusProperties.setCanFocus(z);
        findFocus = embeddedView.findFocus();
        if (findFocus != null) {
        }
    }
}
