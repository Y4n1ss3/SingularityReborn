package defpackage;

import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class o8 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;

    public /* synthetic */ o8(List list, int i) {
        this.d = i;
        this.e = list;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int size;
        int i = this.d;
        List list = this.e;
        switch (i) {
            case 0:
                size = list.size();
                break;
            case 1:
                size = CarouselPagerState.Saver$lambda$2$lambda$1(list);
                break;
            case 2:
                size = CarouselState.Saver$lambda$3$lambda$2(list);
                break;
            default:
                size = list.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
