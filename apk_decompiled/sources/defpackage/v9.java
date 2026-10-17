package defpackage;

import androidx.compose.foundation.pager.PagerState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class v9 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ PagerState f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9(PagerState pagerState, int i, hm hmVar, int i2) {
        super(2, hmVar);
        this.d = i2;
        this.f = pagerState;
        this.g = i;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        int i2 = this.g;
        PagerState pagerState = this.f;
        switch (i) {
            case 0:
                return new v9(pagerState, i2, hmVar, 0);
            default:
                return new v9(pagerState, i2, hmVar, 1);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((v9) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    if (PagerState.animateScrollToPage$default(this.f, this.g, 0.0f, null, this, 6, null) == vnVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    if (PagerState.animateScrollToPage$default(this.f, this.g, 0.0f, null, this, 6, null) == vnVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
        }
        return vnVar;
    }
}
