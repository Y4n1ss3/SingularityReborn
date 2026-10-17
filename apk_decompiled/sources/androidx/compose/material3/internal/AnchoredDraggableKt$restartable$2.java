package androidx.compose.material3.internal;

import androidx.compose.runtime.SnapshotStateKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.iy;
import defpackage.ji0;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {708}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$2 extends us0 implements my {
    final /* synthetic */ my $block;
    final /* synthetic */ iy $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements jw {
        final /* synthetic */ un $$this$coroutineScope;
        final /* synthetic */ my $block;
        final /* synthetic */ ji0 $previousDrag;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {715}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends us0 implements my {
            final /* synthetic */ un $$this$coroutineScope;
            final /* synthetic */ my $block;
            final /* synthetic */ I $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(my myVar, I i, un unVar, hm hmVar) {
                super(2, hmVar);
                this.$block = myVar;
                this.$latestInputs = i;
                this.$$this$coroutineScope = unVar;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, hmVar);
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
                    my myVar = this.$block;
                    Object obj2 = this.$latestInputs;
                    this.label = 1;
                    Object invoke = myVar.invoke(obj2, this);
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
                p10.h(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return w01.a;
            }
        }

        public AnonymousClass1(ji0 ji0Var, un unVar, my myVar) {
            this.$previousDrag = ji0Var;
            this.$$this$coroutineScope = unVar;
            this.$block = myVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        @Override // defpackage.jw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(I i, hm hmVar) {
            AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
            int i2;
            Object obj;
            if (hmVar instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
                anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) hmVar;
                int i3 = anchoredDraggableKt$restartable$2$1$emit$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableKt$restartable$2$1$emit$1.label = i3 - Integer.MIN_VALUE;
                    Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.result;
                    i2 = anchoredDraggableKt$restartable$2$1$emit$1.label;
                    if (i2 != 0) {
                        p10.Q(obj2);
                        z10 z10Var = (z10) this.$previousDrag.d;
                        obj = i;
                        if (z10Var != null) {
                            z10Var.cancel(new AnchoredDragFinishedSignal());
                            anchoredDraggableKt$restartable$2$1$emit$1.L$0 = i;
                            anchoredDraggableKt$restartable$2$1$emit$1.L$1 = z10Var;
                            anchoredDraggableKt$restartable$2$1$emit$1.label = 1;
                            Object n = z10Var.n(anchoredDraggableKt$restartable$2$1$emit$1);
                            vn vnVar = vn.d;
                            obj = i;
                            if (n == vnVar) {
                                return vnVar;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = anchoredDraggableKt$restartable$2$1$emit$1.L$0;
                        p10.Q(obj2);
                        obj = obj3;
                    }
                    ji0 ji0Var = this.$previousDrag;
                    un unVar = this.$$this$coroutineScope;
                    ji0Var.d = p01.t(unVar, null, xn.g, new AnonymousClass2(this.$block, obj, unVar, null), 1);
                    return w01.a;
                }
            }
            anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, hmVar);
            Object obj22 = anchoredDraggableKt$restartable$2$1$emit$1.result;
            i2 = anchoredDraggableKt$restartable$2$1$emit$1.label;
            if (i2 != 0) {
            }
            ji0 ji0Var2 = this.$previousDrag;
            un unVar2 = this.$$this$coroutineScope;
            ji0Var2.d = p01.t(unVar2, null, xn.g, new AnonymousClass2(this.$block, obj, unVar2, null), 1);
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2(iy iyVar, my myVar, hm hmVar) {
        super(2, hmVar);
        this.$inputs = iyVar;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, hmVar);
        anchoredDraggableKt$restartable$2.L$0 = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AnchoredDraggableKt$restartable$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            ji0 ji0Var = new ji0();
            iw snapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ji0Var, unVar, this.$block);
            this.label = 1;
            Object collect = snapshotFlow.collect(anonymousClass1, this);
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
