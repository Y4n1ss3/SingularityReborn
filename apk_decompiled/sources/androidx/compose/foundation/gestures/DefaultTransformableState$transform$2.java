package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", l = {443}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DefaultTransformableState$transform$2 extends us0 implements my {
    final /* synthetic */ my $block;
    final /* synthetic */ MutatePriority $transformPriority;
    int label;
    final /* synthetic */ DefaultTransformableState this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", l = {446}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ my $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultTransformableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultTransformableState defaultTransformableState, my myVar, hm hmVar) {
            super(2, hmVar);
            this.this$0 = defaultTransformableState;
            this.$block = myVar;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(TransformScope transformScope, hm hmVar) {
            return ((AnonymousClass1) create(transformScope, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, w01] */
        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            MutableState mutableState;
            MutableState mutableState2;
            MutableState mutableState3;
            int i = this.label;
            try {
                if (i == 0) {
                    p10.Q(obj);
                    TransformScope transformScope = (TransformScope) this.L$0;
                    mutableState2 = this.this$0.isTransformingState;
                    mutableState2.setValue(Boolean.TRUE);
                    my myVar = this.$block;
                    this.label = 1;
                    Object invoke = myVar.invoke(transformScope, this);
                    vn vnVar = vn.d;
                    if (invoke == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                mutableState3 = this.this$0.isTransformingState;
                mutableState3.setValue(Boolean.FALSE);
                this = w01.a;
                return this;
            } catch (Throwable th) {
                mutableState = this.this$0.isTransformingState;
                mutableState.setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformableState$transform$2(DefaultTransformableState defaultTransformableState, MutatePriority mutatePriority, my myVar, hm hmVar) {
        super(2, hmVar);
        this.this$0 = defaultTransformableState;
        this.$transformPriority = mutatePriority;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DefaultTransformableState$transform$2(this.this$0, this.$transformPriority, this.$block, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DefaultTransformableState$transform$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        TransformScope transformScope;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            mutatorMutex = this.this$0.transformMutex;
            transformScope = this.this$0.transformScope;
            MutatePriority mutatePriority = this.$transformPriority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, null);
            this.label = 1;
            Object mutateWith = mutatorMutex.mutateWith(transformScope, mutatePriority, anonymousClass1, this);
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
