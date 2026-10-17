package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.HorizontalCenterOpticallyKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ef implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ef(float f, float f2, float f3, Placeable placeable) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = placeable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 StandardBottomSheet_w7I5h1o$lambda$13$lambda$12$lambda$11;
        w01 horizontalCenterOptically_4j6BHR0$lambda$1$lambda$0;
        int i = this.d;
        Object obj2 = this.h;
        float f = this.g;
        float f2 = this.f;
        float f3 = this.e;
        switch (i) {
            case 0:
                StandardBottomSheet_w7I5h1o$lambda$13$lambda$12$lambda$11 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$13$lambda$12$lambda$11((SheetState) obj2, f3, f2, f, (DraggableAnchorsConfig) obj);
                return StandardBottomSheet_w7I5h1o$lambda$13$lambda$12$lambda$11;
            default:
                horizontalCenterOptically_4j6BHR0$lambda$1$lambda$0 = HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$1$lambda$0(f3, f2, f, (Placeable) obj2, (Placeable.PlacementScope) obj);
                return horizontalCenterOptically_4j6BHR0$lambda$1$lambda$0;
        }
    }

    public /* synthetic */ ef(SheetState sheetState, float f, float f2, float f3) {
        this.h = sheetState;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }
}
