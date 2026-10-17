package defpackage;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.SearchBarColors;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class rg implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ rg(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, int i, int i2) {
        this.j = searchBarState;
        this.k = myVar;
        this.e = modifier;
        this.l = shape;
        this.m = searchBarColors;
        this.f = f;
        this.g = f2;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 HorizontalUncontainedCarousel_9QcgTRs$lambda$9;
        w01 SearchBar_nbWgWpA$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                HorizontalUncontainedCarousel_9QcgTRs$lambda$9 = CarouselKt.HorizontalUncontainedCarousel_9QcgTRs$lambda$9((CarouselState) this.j, this.f, this.e, this.g, (TargetedFlingBehavior) this.k, (PaddingValues) this.l, (oy) this.m, this.h, this.i, (Composer) obj, intValue);
                return HorizontalUncontainedCarousel_9QcgTRs$lambda$9;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SearchBar_nbWgWpA$lambda$2 = SearchBarKt.SearchBar_nbWgWpA$lambda$2((SearchBarState) this.j, (my) this.k, this.e, (Shape) this.l, (SearchBarColors) this.m, this.f, this.g, this.h, this.i, (Composer) obj, intValue2);
                return SearchBar_nbWgWpA$lambda$2;
        }
    }

    public /* synthetic */ rg(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, oy oyVar, int i, int i2) {
        this.j = carouselState;
        this.f = f;
        this.e = modifier;
        this.g = f2;
        this.k = targetedFlingBehavior;
        this.l = paddingValues;
        this.m = oyVar;
        this.h = i;
        this.i = i2;
    }
}
