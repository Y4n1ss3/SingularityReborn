package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.oy;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {1175}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$4 extends us0 implements ky {
    final /* synthetic */ oy $block;
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {1177}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ oy $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(oy oyVar, AnchoredDraggableState<T> anchoredDraggableState, hm hmVar) {
            super(2, hmVar);
            this.$block = oyVar;
            this.this$0 = anchoredDraggableState;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, hmVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.my
        public final Object invoke(xe0 xe0Var, hm hmVar) {
            return ((AnonymousClass2) create(xe0Var, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                xe0 xe0Var = (xe0) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) xe0Var.d;
                Object obj2 = xe0Var.e;
                oy oyVar = this.$block;
                anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                Object invoke = oyVar.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, obj2, this);
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
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState<T> anchoredDraggableState, T t, oy oyVar, hm hmVar) {
        super(1, hmVar);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = t;
        this.$block = oyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xe0 invokeSuspend$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        return new xe0(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new AnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, this.$block, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((AnchoredDraggableState$anchoredDrag$4) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object restartable;
        AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            this.this$0.setDragTarget(this.$targetValue);
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            c cVar = new c(anchoredDraggableState, i2);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, anchoredDraggableState, null);
            this.label = 1;
            restartable = AnchoredDraggableKt.restartable(cVar, anonymousClass2, this);
            vn vnVar = vn.d;
            if (restartable == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        if (((Boolean) this.this$0.getConfirmValueChange$foundation().invoke(this.$targetValue)).booleanValue()) {
            float positionOf = this.this$0.getAnchors().positionOf(this.$targetValue);
            anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
            anchoredDraggableState$anchoredDragScope$1.dragTo(positionOf, this.this$0.getLastVelocity());
            this.this$0.setSettledValue(this.$targetValue);
            this.this$0.setCurrentValue(this.$targetValue);
        }
        return w01.a;
    }
}
