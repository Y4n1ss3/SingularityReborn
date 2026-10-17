package androidx.compose.animation.core;

import defpackage.bq;
import defpackage.fg;
import defpackage.hm;
import defpackage.lb0;
import defpackage.my;
import defpackage.o;
import defpackage.ob0;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2174}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransitionKt$rememberTransition$1$1 extends us0 implements my {
    final /* synthetic */ TransitionState<T> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState<T> transitionState, hm hmVar) {
        super(2, hmVar);
        this.$transitionState = transitionState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TransitionKt$rememberTransition$1$1(this.$transitionState, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TransitionKt$rememberTransition$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        lb0 lb0Var;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            ((SeekableTransitionState) this.$transitionState).observeTotalDuration$animation_core();
            lb0 compositionContinuationMutex$animation_core = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex$animation_core();
            obj2 = this.$transitionState;
            this.L$0 = compositionContinuationMutex$animation_core;
            this.L$1 = obj2;
            this.label = 1;
            ob0 ob0Var = (ob0) compositionContinuationMutex$animation_core;
            Object d = ob0Var.d(this);
            vn vnVar = vn.d;
            if (d == vnVar) {
                return vnVar;
            }
            lb0Var = ob0Var;
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = (TransitionState) this.L$1;
            lb0Var = (lb0) this.L$0;
            p10.Q(obj);
        }
        try {
            ((SeekableTransitionState) obj2).setComposedTargetState$animation_core(((SeekableTransitionState) obj2).getTargetState());
            fg compositionContinuation$animation_core = ((SeekableTransitionState) obj2).getCompositionContinuation$animation_core();
            if (compositionContinuation$animation_core != null) {
                compositionContinuation$animation_core.resumeWith(((SeekableTransitionState) obj2).getTargetState());
            }
            ((SeekableTransitionState) obj2).setCompositionContinuation$animation_core(null);
            ((ob0) lb0Var).f(null);
            return w01.a;
        } catch (Throwable th) {
            ((ob0) lb0Var).f(null);
            throw th;
        }
    }
}
