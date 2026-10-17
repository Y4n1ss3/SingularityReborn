package androidx.compose.material3.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.ny;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$anchoredDraggable$1 extends us0 implements ny {
    final /* synthetic */ AnchoredDraggableState<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {177}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, float f, hm hmVar) {
            super(2, hmVar);
            this.$state = anchoredDraggableState;
            this.$velocity = f;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$state, this.$velocity, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                float f = this.$velocity;
                this.label = 1;
                Object obj2 = anchoredDraggableState.settle(f, this);
                vn vnVar = vn.d;
                if (obj2 == vnVar) {
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
    public AnchoredDraggableKt$anchoredDraggable$1(AnchoredDraggableState<T> anchoredDraggableState, hm hmVar) {
        super(3, hmVar);
        this.$state = anchoredDraggableState;
    }

    public final Object invoke(un unVar, float f, hm hmVar) {
        AnchoredDraggableKt$anchoredDraggable$1 anchoredDraggableKt$anchoredDraggable$1 = new AnchoredDraggableKt$anchoredDraggable$1(this.$state, hmVar);
        anchoredDraggableKt$anchoredDraggable$1.L$0 = unVar;
        anchoredDraggableKt$anchoredDraggable$1.F$0 = f;
        return anchoredDraggableKt$anchoredDraggable$1.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        p01.t((un) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3);
        return w01.a;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((un) obj, ((Number) obj2).floatValue(), (hm) obj3);
    }
}
