package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2", f = "SearchBar.kt", l = {904}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 extends us0 implements ny {
    /* synthetic */ float F$0;
    int label;
    final /* synthetic */ EnterAlwaysSearchBarScrollBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, hm hmVar) {
        super(3, hmVar);
        this.this$0 = enterAlwaysSearchBarScrollBehavior;
    }

    public final Object invoke(un unVar, float f, hm hmVar) {
        EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 enterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 = new EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2(this.this$0, hmVar);
        enterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2.F$0 = f;
        return enterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object m1948settleSearchBarOhffZ5M;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            float f = this.F$0;
            EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = this.this$0;
            this.label = 1;
            m1948settleSearchBarOhffZ5M = enterAlwaysSearchBarScrollBehavior.m1948settleSearchBarOhffZ5M(f, this);
            vn vnVar = vn.d;
            if (m1948settleSearchBarOhffZ5M == vnVar) {
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

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((un) obj, ((Number) obj2).floatValue(), (hm) obj3);
    }
}
