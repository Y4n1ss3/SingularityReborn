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
@bq(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {1090}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DefaultDraggableState$drag$2 extends us0 implements my {
    final /* synthetic */ my $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ DefaultDraggableState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDraggableState$drag$2(DefaultDraggableState defaultDraggableState, MutatePriority mutatePriority, my myVar, hm hmVar) {
        super(2, hmVar);
        this.this$0 = defaultDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DefaultDraggableState$drag$2(this.this$0, this.$dragPriority, this.$block, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DefaultDraggableState$drag$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        DragScope dragScope;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            mutatorMutex = this.this$0.scrollMutex;
            dragScope = this.this$0.dragScope;
            MutatePriority mutatePriority = this.$dragPriority;
            my myVar = this.$block;
            this.label = 1;
            Object mutateWith = mutatorMutex.mutateWith(dragScope, mutatePriority, myVar, this);
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
