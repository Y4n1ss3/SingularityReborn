package defpackage;

import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class nn0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ SelectionController e;

    public /* synthetic */ nn0(SelectionController selectionController, int i) {
        this.d = i;
        this.e = selectionController;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        LayoutCoordinates onRemembered$lambda$0;
        TextLayoutResult onRemembered$lambda$1;
        LayoutCoordinates modifier$lambda$0;
        int i = this.d;
        SelectionController selectionController = this.e;
        switch (i) {
            case 0:
                onRemembered$lambda$0 = SelectionController.onRemembered$lambda$0(selectionController);
                return onRemembered$lambda$0;
            case 1:
                onRemembered$lambda$1 = SelectionController.onRemembered$lambda$1(selectionController);
                return onRemembered$lambda$1;
            default:
                modifier$lambda$0 = SelectionController.modifier$lambda$0(selectionController);
                return modifier$lambda$0;
        }
    }
}
