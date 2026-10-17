package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.dq;
import defpackage.ed;
import defpackage.iy;
import defpackage.o8;
import defpackage.w4;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselPagerState extends PagerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<CarouselPagerState, ?> Saver = ListSaverKt.listSaver(new w4(6), new ed(14));
    private MutableState<iy> pageCountState;

    public CarouselPagerState(int i, float f, iy iyVar) {
        super(i, f);
        this.pageCountState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(iyVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(SaverScope saverScope, CarouselPagerState carouselPagerState) {
        return y80.E(Integer.valueOf(carouselPagerState.getCurrentPage()), Float.valueOf(y80.g(carouselPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), carouselPagerState.pageCountState.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselPagerState Saver$lambda$2(List list) {
        Object obj = list.get(0);
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        obj2.getClass();
        return new CarouselPagerState(intValue, ((Float) obj2).floatValue(), new o8(list, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Saver$lambda$2$lambda$1(List list) {
        Object obj = list.get(2);
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return ((Number) this.pageCountState.getValue().invoke()).intValue();
    }

    public final MutableState<iy> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(MutableState<iy> mutableState) {
        this.pageCountState = mutableState;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<CarouselPagerState, ?> getSaver() {
            return CarouselPagerState.Saver;
        }

        private Companion() {
        }
    }
}
