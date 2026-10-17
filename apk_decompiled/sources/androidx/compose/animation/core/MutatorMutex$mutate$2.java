package androidx.compose.animation.core;

import androidx.compose.animation.core.MutatorMutex;
import defpackage.bq;
import defpackage.hm;
import defpackage.in;
import defpackage.ky;
import defpackage.lb0;
import defpackage.my;
import defpackage.o;
import defpackage.ob0;
import defpackage.p10;
import defpackage.ts;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, 126}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MutatorMutex$mutate$2 extends us0 implements my {
    final /* synthetic */ ky $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, hmVar);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MutatorMutex$mutate$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [lb0] */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        MutatorMutex.Mutator mutator;
        lb0 lb0Var;
        MutatorMutex mutatorMutex;
        ob0 ob0Var;
        ky kyVar;
        Throwable th;
        MutatorMutex.Mutator mutator2;
        MutatorMutex mutatorMutex2;
        lb0 lb0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.label;
        vn vnVar = vn.d;
        try {
            try {
                if (i == 0) {
                    p10.Q(obj);
                    un unVar = (un) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    in inVar = unVar.getCoroutineContext().get(ts.l);
                    inVar.getClass();
                    mutator = new MutatorMutex.Mutator(mutatePriority, (z10) inVar);
                    this.this$0.tryMutateOrCancel(mutator);
                    lb0Var = this.this$0.mutex;
                    ky kyVar2 = this.$block;
                    mutatorMutex = this.this$0;
                    this.L$0 = mutator;
                    this.L$1 = lb0Var;
                    this.L$2 = kyVar2;
                    this.L$3 = mutatorMutex;
                    this.label = 1;
                    ob0Var = (ob0) lb0Var;
                    if (ob0Var.d(this) != vnVar) {
                        kyVar = kyVar2;
                    }
                    return vnVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutatorMutex2 = (MutatorMutex) this.L$2;
                    lb0Var2 = (lb0) this.L$1;
                    mutator2 = (MutatorMutex.Mutator) this.L$0;
                    try {
                        p10.Q(obj);
                        atomicReference2 = mutatorMutex2.currentMutator;
                        while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                        }
                        ((ob0) lb0Var2).f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = mutatorMutex2.currentMutator;
                        while (!atomicReference.compareAndSet(mutator2, null)) {
                        }
                        throw th;
                    }
                }
                MutatorMutex mutatorMutex3 = (MutatorMutex) this.L$3;
                kyVar = (ky) this.L$2;
                ?? r5 = (lb0) this.L$1;
                MutatorMutex.Mutator mutator3 = (MutatorMutex.Mutator) this.L$0;
                p10.Q(obj);
                mutatorMutex = mutatorMutex3;
                mutator = mutator3;
                ob0Var = r5;
                this.L$0 = mutator;
                this.L$1 = ob0Var;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = kyVar.invoke(this);
                if (invoke != vnVar) {
                    lb0Var2 = ob0Var;
                    obj = invoke;
                    mutator2 = mutator;
                    mutatorMutex2 = mutatorMutex;
                    atomicReference2 = mutatorMutex2.currentMutator;
                    while (!atomicReference2.compareAndSet(mutator2, null)) {
                    }
                    ((ob0) lb0Var2).f(null);
                    return obj;
                }
                return vnVar;
            } catch (Throwable th3) {
                th = th3;
                mutator2 = mutator;
                mutatorMutex2 = mutatorMutex;
                atomicReference = mutatorMutex2.currentMutator;
                while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((ob0) 2).f(null);
            throw th4;
        }
    }
}
