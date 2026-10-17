package defpackage;

import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ug implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Density e;
    public final /* synthetic */ float f;
    public final /* synthetic */ CarouselState g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;

    public /* synthetic */ ug(Density density, float f, CarouselState carouselState, float f2, float f3, int i) {
        this.d = i;
        this.e = density;
        this.f = f;
        this.g = carouselState;
        this.h = f2;
        this.i = f3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        KeylineList HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$12$lambda$11;
        KeylineList HorizontalMultiBrowseCarousel_3tcCNu0$lambda$2$lambda$1;
        int i = this.d;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$12$lambda$11 = CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$12$lambda$11(this.e, this.f, this.g, this.h, this.i, floatValue, floatValue2);
                return HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$12$lambda$11;
            default:
                HorizontalMultiBrowseCarousel_3tcCNu0$lambda$2$lambda$1 = CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$2$lambda$1(this.e, this.f, this.g, this.h, this.i, floatValue, floatValue2);
                return HorizontalMultiBrowseCarousel_3tcCNu0$lambda$2$lambda$1;
        }
    }
}
