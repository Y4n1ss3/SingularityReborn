package androidx.compose.runtime;

import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.kn;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.st;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {72, 73}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 extends us0 implements my {
    final /* synthetic */ kn $context;
    final /* synthetic */ iw $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {73}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ ProduceStateScope<R> $$this$produceState;
        final /* synthetic */ iw $this_collectAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(iw iwVar, ProduceStateScope<R> produceStateScope, hm hmVar) {
            super(2, hmVar);
            this.$this_collectAsState = iwVar;
            this.$$this$produceState = produceStateScope;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                iw iwVar = this.$this_collectAsState;
                final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                jw jwVar = new jw() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.1.2.1
                    @Override // defpackage.jw
                    public final Object emit(T t, hm hmVar) {
                        produceStateScope.setValue(t);
                        return w01.a;
                    }
                };
                this.label = 1;
                Object collect = iwVar.collect(jwVar, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(kn knVar, iw iwVar, hm hmVar) {
        super(2, hmVar);
        this.$context = knVar;
        this.$this_collectAsState = iwVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(this.$context, this.$this_collectAsState, hmVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(ProduceStateScope<R> produceStateScope, hm hmVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1) create(produceStateScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.collect(r1, r6) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (defpackage.p01.H(r0, r3, r6) == r4) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            boolean b = q10.b(this.$context, st.d);
            vn vnVar = vn.d;
            if (b) {
                iw iwVar = this.$this_collectAsState;
                jw jwVar = new jw() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1.1
                    @Override // defpackage.jw
                    public final Object emit(T t, hm hmVar) {
                        produceStateScope.setValue(t);
                        return w01.a;
                    }
                };
                this.label = 1;
            } else {
                kn knVar = this.$context;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
