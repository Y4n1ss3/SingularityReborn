package androidx.compose.ui.layout;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutInfo_androidKt {
    public static final View getView(LayoutInfo layoutInfo) {
        layoutInfo.getClass();
        Object owner$ui = ((LayoutNode) layoutInfo).getOwner$ui();
        if (owner$ui instanceof View) {
            return (View) owner$ui;
        }
        return null;
    }
}
