package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends us0 implements my {
    int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(hm hmVar) {
        super(2, hmVar);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            p10.Q(obj);
            return Choreographer.getInstance();
        }
        o.f("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
