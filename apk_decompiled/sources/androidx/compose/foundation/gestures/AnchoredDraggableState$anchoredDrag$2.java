package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {1128}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$2 extends us0 implements ky {
    final /* synthetic */ ny $block;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {1129}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ ny $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ny nyVar, AnchoredDraggableState<T> anchoredDraggableState, hm hmVar) {
            super(2, hmVar);
            this.$block = nyVar;
            this.this$0 = anchoredDraggableState;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, hmVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.my
        public final Object invoke(DraggableAnchors<T> draggableAnchors, hm hmVar) {
            return ((AnonymousClass2) create(draggableAnchors, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$0;
                ny nyVar = this.$block;
                anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                Object invoke = nyVar.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, this);
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
    public AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState<T> anchoredDraggableState, ny nyVar, hm hmVar) {
        super(1, hmVar);
        this.this$0 = anchoredDraggableState;
        this.$block = nyVar;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new AnchoredDraggableState$anchoredDrag$2(this.this$0, this.$block, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object restartable;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            c cVar = new c(anchoredDraggableState, 0);
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
        Object closestAnchor = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset());
        if (closestAnchor != null) {
            if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(closestAnchor)) < 0.5f && ((Boolean) this.this$0.getConfirmValueChange$foundation().invoke(closestAnchor)).booleanValue()) {
                this.this$0.setSettledValue(closestAnchor);
                this.this$0.setCurrentValue(closestAnchor);
            }
        }
        return w01.a;
    }
}
