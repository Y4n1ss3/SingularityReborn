package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import defpackage.hm;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class BringIntoViewOnScreenResponderNode extends Modifier.Node implements BringIntoViewModifierNode {
    private ViewGroup view;

    public BringIntoViewOnScreenResponderNode(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    public Object bringIntoView(LayoutCoordinates layoutCoordinates, iy iyVar, hm hmVar) {
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect rect = (Rect) iyVar.invoke();
        Rect m4553translatek4lQ0M = rect != null ? rect.m4553translatek4lQ0M(positionInRoot) : null;
        if (m4553translatek4lQ0M != null) {
            this.view.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(m4553translatek4lQ0M), false);
        }
        return w01.a;
    }

    public final ViewGroup getView() {
        return this.view;
    }

    public final void setView(ViewGroup viewGroup) {
        this.view = viewGroup;
    }
}
