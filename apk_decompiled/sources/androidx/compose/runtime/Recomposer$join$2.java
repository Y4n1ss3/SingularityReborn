package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Recomposer$join$2 extends us0 implements my {
    /* synthetic */ Object L$0;
    int label;

    public Recomposer$join$2(hm hmVar) {
        super(2, hmVar);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(hmVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @Override // defpackage.my
    public final Object invoke(Recomposer.State state, hm hmVar) {
        return ((Recomposer$join$2) create(state, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            p10.Q(obj);
            return Boolean.valueOf(((Recomposer.State) this.L$0) == Recomposer.State.ShutDown);
        }
        o.f("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
