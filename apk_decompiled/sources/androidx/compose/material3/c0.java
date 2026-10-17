package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.ui.unit.IntSize;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ EnterAlwaysSearchBarScrollBehavior e;

    public /* synthetic */ c0(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, int i) {
        this.d = i;
        this.e = enterAlwaysSearchBarScrollBehavior;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 w01Var;
        w01 searchBarScrollBehavior$lambda$0;
        w01 searchBarScrollBehavior$lambda$3;
        int i = this.d;
        EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = this.e;
        switch (i) {
            case 0:
                w01Var = EnterAlwaysSearchBarScrollBehavior.settleSearchBar_OhffZ5M$lambda$5(enterAlwaysSearchBarScrollBehavior, (AnimationScope) obj);
                return w01Var;
            case 1:
                searchBarScrollBehavior$lambda$0 = EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$0(enterAlwaysSearchBarScrollBehavior, ((Float) obj).floatValue());
                return searchBarScrollBehavior$lambda$0;
            default:
                searchBarScrollBehavior$lambda$3 = EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$3(enterAlwaysSearchBarScrollBehavior, (IntSize) obj);
                return searchBarScrollBehavior$lambda$3;
        }
    }
}
