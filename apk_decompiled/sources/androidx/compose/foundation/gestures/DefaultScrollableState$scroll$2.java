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
@bq(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {208}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DefaultScrollableState$scroll$2 extends us0 implements my {
    final /* synthetic */ my $block;
    final /* synthetic */ MutatePriority $scrollPriority;
    int label;
    final /* synthetic */ DefaultScrollableState this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {211}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ my $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultScrollableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultScrollableState defaultScrollableState, my myVar, hm hmVar) {
            super(2, hmVar);
            this.this$0 = defaultScrollableState;
            this.$block = myVar;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(ScrollScope scrollScope, hm hmVar) {
            return ((AnonymousClass1) create(scrollScope, hmVar)).invokeSuspend(w01.a);
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
                    ScrollScope scrollScope = (ScrollScope) this.L$0;
                    mutableState2 = this.this$0.isScrollingState;
                    mutableState2.setValue(Boolean.TRUE);
                    my myVar = this.$block;
                    this.label = 1;
                    Object invoke = myVar.invoke(scrollScope, this);
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
                mutableState3 = this.this$0.isScrollingState;
                mutableState3.setValue(Boolean.FALSE);
                this = w01.a;
                return this;
            } catch (Throwable th) {
                mutableState = this.this$0.isScrollingState;
                mutableState.setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, my myVar, hm hmVar) {
        super(2, hmVar);
        this.this$0 = defaultScrollableState;
        this.$scrollPriority = mutatePriority;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DefaultScrollableState$scroll$2(this.this$0, this.$scrollPriority, this.$block, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DefaultScrollableState$scroll$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        ScrollScope scrollScope;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            mutatorMutex = this.this$0.scrollMutex;
            scrollScope = this.this$0.scrollScope;
            MutatePriority mutatePriority = this.$scrollPriority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, null);
            this.label = 1;
            Object mutateWith = mutatorMutex.mutateWith(scrollScope, mutatePriority, anonymousClass1, this);
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
