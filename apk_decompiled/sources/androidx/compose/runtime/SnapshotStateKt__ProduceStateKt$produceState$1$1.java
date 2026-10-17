package androidx.compose.runtime;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {80}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$1$1 extends us0 implements my {
    final /* synthetic */ my $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$1$1(my myVar, MutableState<T> mutableState, hm hmVar) {
        super(2, hmVar);
        this.$producer = myVar;
        this.$result = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$1 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(this.$producer, this.$result, hmVar);
        snapshotStateKt__ProduceStateKt$produceState$1$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            my myVar = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, unVar.getCoroutineContext());
            this.label = 1;
            Object invoke = myVar.invoke(produceStateScopeImpl, this);
            vn vnVar = vn.d;
            if (invoke == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
