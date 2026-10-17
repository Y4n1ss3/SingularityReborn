package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.pager.PagerState;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u9 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ List f;
    public final /* synthetic */ PagerState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9(SharedPreferences sharedPreferences, List list, PagerState pagerState, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = sharedPreferences;
        this.f = list;
        this.g = pagerState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new u9(this.e, this.f, this.g, hmVar, 0);
            default:
                return new u9(this.e, this.f, this.g, hmVar, 1);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                ((u9) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((u9) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        PagerState pagerState = this.g;
        List list = this.f;
        SharedPreferences sharedPreferences = this.e;
        switch (i) {
            case 0:
                p10.Q(obj);
                sharedPreferences.edit().putInt("last_app_tab", ((Number) ((xe0) list.get(pagerState.getCurrentPage())).d).intValue()).apply();
                break;
            default:
                p10.Q(obj);
                sharedPreferences.edit().putInt("last_tweak_tab", ((Number) ((xe0) list.get(pagerState.getCurrentPage())).d).intValue()).apply();
                break;
        }
        return w01Var;
    }
}
