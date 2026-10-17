package defpackage;

import androidx.compose.foundation.pager.PagerState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class s8 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ PagerState f;
    public final /* synthetic */ int g;

    public /* synthetic */ s8(un unVar, PagerState pagerState, int i, int i2) {
        this.d = i2;
        this.e = unVar;
        this.f = pagerState;
        this.g = i;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = this.g;
        PagerState pagerState = this.f;
        un unVar = this.e;
        switch (i) {
            case 0:
                p01.t(unVar, null, null, new v9(pagerState, i2, null, 0), 3);
                break;
            default:
                p01.t(unVar, null, null, new v9(pagerState, i2, null, 1), 3);
                break;
        }
        return w01Var;
    }
}
