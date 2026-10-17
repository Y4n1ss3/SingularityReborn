package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TextContextMenuDataProvider {
    Rect contentBounds(LayoutCoordinates layoutCoordinates);

    TextContextMenuData data();

    /* renamed from: position-tuRUvjQ */
    long mo1224positiontuRUvjQ(LayoutCoordinates layoutCoordinates);
}
