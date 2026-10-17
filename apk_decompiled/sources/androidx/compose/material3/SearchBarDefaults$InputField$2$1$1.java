package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SearchBarDefaults$InputField$2$1$1", f = "SearchBar.kt", l = {1363}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SearchBarDefaults$InputField$2$1$1 extends us0 implements my {
    final /* synthetic */ SearchBarState $searchBarState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$2$1$1(SearchBarState searchBarState, hm hmVar) {
        super(2, hmVar);
        this.$searchBarState = searchBarState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SearchBarDefaults$InputField$2$1$1(this.$searchBarState, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SearchBarDefaults$InputField$2$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            SearchBarState searchBarState = this.$searchBarState;
            this.label = 1;
            Object animateToExpanded = searchBarState.animateToExpanded(this);
            vn vnVar = vn.d;
            if (animateToExpanded == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
