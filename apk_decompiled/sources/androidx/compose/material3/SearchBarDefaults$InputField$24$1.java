package androidx.compose.material3;

import androidx.compose.ui.focus.FocusManager;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SearchBarDefaults$InputField$24$1", f = "SearchBar.kt", l = {1742}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SearchBarDefaults$InputField$24$1 extends us0 implements my {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ boolean $shouldClearFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$24$1(boolean z, FocusManager focusManager, hm hmVar) {
        super(2, hmVar);
        this.$shouldClearFocus = z;
        this.$focusManager = focusManager;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SearchBarDefaults$InputField$24$1(this.$shouldClearFocus, this.$focusManager, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SearchBarDefaults$InputField$24$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            if (this.$shouldClearFocus) {
                this.label = 1;
                Object p = y80.p(100L, this);
                vn vnVar = vn.d;
                if (p == vnVar) {
                    return vnVar;
                }
            }
            return w01.a;
        }
        if (i != 1) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
        return w01.a;
    }
}
