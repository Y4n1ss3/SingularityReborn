package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DragHandleColors;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.DragHandleShapes;
import androidx.compose.material3.DragHandleSizes;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ lg(PopupPositionProvider popupPositionProvider, iy iyVar, Modifier modifier, ContextMenuColors contextMenuColors, ky kyVar, int i, int i2) {
        this.d = 1;
        this.h = popupPositionProvider;
        this.i = iyVar;
        this.e = modifier;
        this.j = contextMenuColors;
        this.k = kyVar;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ElevatedCard$lambda$3;
        w01 ContextMenuPopup$lambda$2;
        w01 VerticalDragHandle$lambda$16;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ElevatedCard$lambda$3 = CardKt.ElevatedCard$lambda$3(this.e, (Shape) this.h, (CardColors) this.i, (CardElevation) this.j, (ny) this.k, this.f, this.g, (Composer) obj, intValue);
                return ElevatedCard$lambda$3;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ContextMenuPopup$lambda$2 = ContextMenuUiKt.ContextMenuPopup$lambda$2((PopupPositionProvider) this.h, (iy) this.i, this.e, (ContextMenuColors) this.j, (ky) this.k, this.f, this.g, (Composer) obj, intValue2);
                return ContextMenuPopup$lambda$2;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                VerticalDragHandle$lambda$16 = DragHandleKt.VerticalDragHandle$lambda$16(this.e, (DragHandleSizes) this.h, (DragHandleColors) this.i, (DragHandleShapes) this.j, (MutableInteractionSource) this.k, this.f, this.g, (Composer) obj, intValue3);
                return VerticalDragHandle$lambda$16;
        }
    }

    public /* synthetic */ lg(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.f = i;
        this.g = i2;
    }
}
