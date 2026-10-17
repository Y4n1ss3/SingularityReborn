package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.iw;
import defpackage.iy;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class InfiniteTransition$run$1$1 extends us0 implements my {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, hm hmVar) {
        super(2, hmVar);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(MutableState mutableState, InfiniteTransition infiniteTransition, gi0 gi0Var, un unVar, long j) {
        long j2;
        MutableVector mutableVector;
        long j3;
        MutableVector mutableVector2;
        State state = (State) mutableState.getValue();
        long longValue = state != null ? ((Number) state.getValue()).longValue() : j;
        j2 = infiniteTransition.startTimeNanos;
        if (j2 == Long.MIN_VALUE || gi0Var.d != SuspendAnimationKt.getDurationScale(unVar.getCoroutineContext())) {
            infiniteTransition.startTimeNanos = j;
            mutableVector = infiniteTransition._animations;
            Object[] objArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                ((InfiniteTransition.TransitionAnimationState) objArr[i]).reset$animation_core();
            }
            gi0Var.d = SuspendAnimationKt.getDurationScale(unVar.getCoroutineContext());
        }
        if (gi0Var.d == 0.0f) {
            mutableVector2 = infiniteTransition._animations;
            Object[] objArr2 = mutableVector2.content;
            int size2 = mutableVector2.getSize();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InfiniteTransition.TransitionAnimationState) objArr2[i2]).skipToEnd$animation_core();
            }
        } else {
            j3 = infiniteTransition.startTimeNanos;
            infiniteTransition.onFrame((long) ((longValue - j3) / gi0Var.d));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$1(un unVar) {
        return SuspendAnimationKt.getDurationScale(unVar.getCoroutineContext());
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, hmVar);
        infiniteTransition$run$1$1.L$0 = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((InfiniteTransition$run$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (defpackage.cq.p(r13, r0, r12) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
    
        if (androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r6, r12) == r4) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0077 -> B:6:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005d -> B:6:0x0041). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final un unVar;
        gi0 gi0Var;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            un unVar2 = (un) this.L$0;
            gi0 gi0Var2 = new gi0();
            gi0Var2.d = 1.0f;
            unVar = unVar2;
            gi0Var = gi0Var2;
        } else if (i == 1) {
            gi0 gi0Var3 = (gi0) this.L$1;
            un unVar3 = (un) this.L$0;
            p10.Q(obj);
            gi0Var = gi0Var3;
            unVar = unVar3;
            if (gi0Var.d == 0.0f) {
                iw snapshotFlow = SnapshotStateKt.snapshotFlow(new iy() { // from class: androidx.compose.animation.core.b
                    @Override // defpackage.iy
                    public final Object invoke() {
                        float invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = InfiniteTransition$run$1$1.invokeSuspend$lambda$1(un.this);
                        return Float.valueOf(invokeSuspend$lambda$1);
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
                this.L$0 = unVar;
                this.L$1 = gi0Var;
                this.label = 2;
            }
        } else {
            if (i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gi0 gi0Var4 = (gi0) this.L$1;
            un unVar4 = (un) this.L$0;
            p10.Q(obj);
            gi0Var = gi0Var4;
            unVar = unVar4;
        }
        a aVar = new a(this.$toolingOverride, this.this$0, gi0Var, unVar, 1);
        this.L$0 = unVar;
        this.L$1 = gi0Var;
        this.label = 1;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends us0 implements my {
        /* synthetic */ float F$0;
        int label;

        public AnonymousClass3(hm hmVar) {
            super(2, hmVar);
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(hmVar);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        public final Object invoke(float f, hm hmVar) {
            return ((AnonymousClass3) create(Float.valueOf(f), hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                p10.Q(obj);
                return Boolean.valueOf(this.F$0 > 0.0f);
            }
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // defpackage.my
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (hm) obj2);
        }
    }
}
