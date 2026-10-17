package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.bq;
import defpackage.f30;
import defpackage.hm;
import defpackage.iw;
import defpackage.iy;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {736}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends us0 implements my {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ State<my> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements iy {
        final /* synthetic */ Transition<EnterExitState> $childTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Transition<EnterExitState> transition) {
            super(0);
            this.$childTransition = transition;
        }

        @Override // defpackage.iy
        public final Boolean invoke() {
            boolean exitFinished;
            exitFinished = AnimatedVisibilityKt.getExitFinished(this.$childTransition);
            return Boolean.valueOf(exitFinished);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition<EnterExitState> transition, State<? extends my> state, hm hmVar) {
        super(2, hmVar);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = state;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, hmVar);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // defpackage.my
    public final Object invoke(ProduceStateScope<Boolean> produceStateScope, hm hmVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(produceStateScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            iw snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$childTransition));
            final Transition<EnterExitState> transition = this.$childTransition;
            final State<my> state = this.$shouldDisposeBlockUpdated$delegate;
            jw jwVar = new jw() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                public final Object emit(boolean z, hm hmVar) {
                    boolean z2;
                    my AnimatedEnterExitImpl$lambda$1;
                    ProduceStateScope<Boolean> produceStateScope2 = produceStateScope;
                    if (z) {
                        AnimatedEnterExitImpl$lambda$1 = AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$1(state);
                        z2 = ((Boolean) AnimatedEnterExitImpl$lambda$1.invoke(transition.getCurrentState(), transition.getTargetState())).booleanValue();
                    } else {
                        z2 = false;
                    }
                    produceStateScope2.setValue(Boolean.valueOf(z2));
                    return w01.a;
                }

                @Override // defpackage.jw
                public /* bridge */ /* synthetic */ Object emit(Object obj2, hm hmVar) {
                    return emit(((Boolean) obj2).booleanValue(), hmVar);
                }
            };
            this.label = 1;
            Object collect = snapshotFlow.collect(jwVar, this);
            vn vnVar = vn.d;
            if (collect == vnVar) {
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
