package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", l = {320}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DefaultDraggable2DState$drag$2 extends us0 implements my {
    final /* synthetic */ my $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ DefaultDraggable2DState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDraggable2DState$drag$2(DefaultDraggable2DState defaultDraggable2DState, MutatePriority mutatePriority, my myVar, hm hmVar) {
        super(2, hmVar);
        this.this$0 = defaultDraggable2DState;
        this.$dragPriority = mutatePriority;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DefaultDraggable2DState$drag$2(this.this$0, this.$dragPriority, this.$block, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DefaultDraggable2DState$drag$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        Drag2DScope drag2DScope;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            mutatorMutex = this.this$0.drag2DMutex;
            drag2DScope = this.this$0.drag2DScope;
            MutatePriority mutatePriority = this.$dragPriority;
            my myVar = this.$block;
            this.label = 1;
            Object mutateWith = mutatorMutex.mutateWith(drag2DScope, mutatePriority, myVar, this);
            vn vnVar = vn.d;
            if (mutateWith == vnVar) {
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
