package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {2394, 2396}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes.dex */
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends im {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExitAlwaysScrollBehavior$nestedScrollConnection$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(ExitAlwaysScrollBehavior$nestedScrollConnection$1 exitAlwaysScrollBehavior$nestedScrollConnection$1, hm hmVar) {
        super(hmVar);
        this.this$0 = exitAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo533onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
