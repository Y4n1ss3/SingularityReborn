package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuToolbarHandlerModifierKt {
    private static final String ToolbarRequesterNotInitialized = "ToolbarRequester is not initialized.";

    public static final Modifier textContextMenuToolbarHandler(Modifier modifier, ToolbarRequester toolbarRequester, ky kyVar, ky kyVar2, ky kyVar3) {
        return modifier.then(new TextContextMenuToolbarHandlerElement(toolbarRequester, kyVar, kyVar2, kyVar3));
    }

    public static /* synthetic */ Modifier textContextMenuToolbarHandler$default(Modifier modifier, ToolbarRequester toolbarRequester, ky kyVar, ky kyVar2, ky kyVar3, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            kyVar2 = null;
        }
        return textContextMenuToolbarHandler(modifier, toolbarRequester, kyVar, kyVar2, kyVar3);
    }

    public static final Rect translateRootToDestination(Rect rect, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        if (!layoutCoordinates.isAttached() || !layoutCoordinates2.isAttached()) {
            return Rect.Companion.getZero();
        }
        return RectKt.m4556Recttz77jQw(layoutCoordinates2.mo6243localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates), rect.m4551getTopLeftF1C5BW0()), rect.m4549getSizeNHjbRc());
    }
}
