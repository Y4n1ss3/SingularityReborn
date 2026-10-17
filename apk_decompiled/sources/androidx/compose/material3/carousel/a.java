package androidx.compose.material3.carousel;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ CarouselPageSize e;

    public /* synthetic */ a(CarouselPageSize carouselPageSize, int i) {
        this.d = i;
        this.e = carouselPageSize;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        Strategy strategy;
        Strategy strategy2;
        int i = this.d;
        CarouselPageSize carouselPageSize = this.e;
        switch (i) {
            case 0:
                strategy = carouselPageSize.getStrategy();
                return strategy;
            default:
                strategy2 = carouselPageSize.getStrategy();
                return strategy2;
        }
    }
}
