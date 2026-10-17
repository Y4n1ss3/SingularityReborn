package defpackage;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ng implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ CarouselState e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ TargetedFlingBehavior i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ PaddingValues m;
    public final /* synthetic */ oy n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ ng(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, oy oyVar, int i, int i2) {
        this.e = carouselState;
        this.g = f;
        this.f = modifier;
        this.h = f2;
        this.i = targetedFlingBehavior;
        this.j = z;
        this.k = f3;
        this.l = f4;
        this.m = paddingValues;
        this.n = oyVar;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3;
        w01 HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3 = CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3(this.e, this.g, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                CarouselState carouselState = this.e;
                float f = this.g;
                HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13 = CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13(carouselState, this.f, f, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13;
        }
    }

    public /* synthetic */ ng(CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, oy oyVar, int i, int i2) {
        this.e = carouselState;
        this.f = modifier;
        this.g = f;
        this.h = f2;
        this.i = targetedFlingBehavior;
        this.j = z;
        this.k = f3;
        this.l = f4;
        this.m = paddingValues;
        this.n = oyVar;
        this.o = i;
        this.p = i2;
    }
}
