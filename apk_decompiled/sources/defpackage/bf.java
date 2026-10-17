package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bf implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bf(float f, int i, Object obj) {
        this.d = i;
        this.f = obj;
        this.e = f;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        xe0 StandardBottomSheet_w7I5h1o$lambda$13$lambda$12;
        KeylineList HorizontalUncontainedCarousel_VUP9l70$lambda$7$lambda$6;
        int i = this.d;
        float f = this.e;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                StandardBottomSheet_w7I5h1o$lambda$13$lambda$12 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$13$lambda$12((SheetState) obj3, f, (IntSize) obj, (Constraints) obj2);
                return StandardBottomSheet_w7I5h1o$lambda$13$lambda$12;
            default:
                HorizontalUncontainedCarousel_VUP9l70$lambda$7$lambda$6 = CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$7$lambda$6((Density) obj3, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return HorizontalUncontainedCarousel_VUP9l70$lambda$7$lambda$6;
        }
    }
}
