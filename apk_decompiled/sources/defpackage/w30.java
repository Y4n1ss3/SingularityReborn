package defpackage;

import androidx.compose.foundation.pager.PagerState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class w30 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ PagerState e;

    public /* synthetic */ w30(PagerState pagerState, int i) {
        this.d = i;
        this.e = pagerState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int pageCount;
        int i = this.d;
        PagerState pagerState = this.e;
        switch (i) {
            case 0:
                pageCount = pagerState.getPageCount();
                break;
            case 1:
                pageCount = pagerState.getPageCount();
                break;
            case 2:
                pageCount = PagerState.settledPage_delegate$lambda$0(pagerState);
                break;
            case 3:
                pageCount = PagerState.targetPage_delegate$lambda$0(pagerState);
                break;
            default:
                pageCount = pagerState.getPageCount();
                break;
        }
        return Integer.valueOf(pageCount);
    }
}
