package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.graphics.GraphicsLayerScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SheetState e;

    public /* synthetic */ ze(SheetState sheetState, int i) {
        this.d = i;
        this.e = sheetState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 verticalScaleDown$lambda$18;
        w01 verticalScaleUp$lambda$17;
        int i = this.d;
        SheetState sheetState = this.e;
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        switch (i) {
            case 0:
                verticalScaleDown$lambda$18 = BottomSheetScaffoldKt.verticalScaleDown$lambda$18(sheetState, graphicsLayerScope);
                return verticalScaleDown$lambda$18;
            default:
                verticalScaleUp$lambda$17 = BottomSheetScaffoldKt.verticalScaleUp$lambda$17(sheetState, graphicsLayerScope);
                return verticalScaleUp$lambda$17;
        }
    }
}
