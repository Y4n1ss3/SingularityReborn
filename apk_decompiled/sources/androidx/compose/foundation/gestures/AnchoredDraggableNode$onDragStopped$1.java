package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.unit.Velocity;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {436, 438}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$onDragStopped$1 extends us0 implements my {
    final /* synthetic */ DragEvent.DragStopped $event;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {440}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableNode<T> anchoredDraggableNode, hm hmVar) {
            super(2, hmVar);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, hmVar);
            anonymousClass1.J$0 = ((Velocity) obj).m7858unboximpl();
            return anonymousClass1;
        }

        @Override // defpackage.my
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m386invokesFctU(((Velocity) obj).m7858unboximpl(), (hm) obj2);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m386invokesFctU(long j, hm hmVar) {
            return ((AnonymousClass1) create(Velocity.m7840boximpl(j), hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            float m381toFloatTH1AsA0;
            long j;
            AnchoredDraggableState anchoredDraggableState;
            AnchoredDraggableState anchoredDraggableState2;
            AnchoredDraggableState anchoredDraggableState3;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                long j2 = this.J$0;
                AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                m381toFloatTH1AsA0 = anchoredDraggableNode.m381toFloatTH1AsA0(j2);
                this.J$0 = j2;
                this.label = 1;
                obj = anchoredDraggableNode.fling(m381toFloatTH1AsA0, this);
                vn vnVar = vn.d;
                if (obj == vnVar) {
                    return vnVar;
                }
                j = j2;
            } else {
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                p10.Q(obj);
            }
            float floatValue = ((Number) obj).floatValue();
            anchoredDraggableState = ((AnchoredDraggableNode) this.this$0).state;
            float requireOffset = anchoredDraggableState.requireOffset();
            anchoredDraggableState2 = ((AnchoredDraggableNode) this.this$0).state;
            float minPosition = anchoredDraggableState2.getAnchors().minPosition();
            anchoredDraggableState3 = ((AnchoredDraggableNode) this.this$0).state;
            if (requireOffset >= anchoredDraggableState3.getAnchors().maxPosition() || requireOffset <= minPosition) {
                j = this.this$0.m384toVelocityadjELrA(floatValue);
            }
            return Velocity.m7840boximpl(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, DragEvent.DragStopped dragStopped, hm hmVar) {
        super(2, hmVar);
        this.this$0 = anchoredDraggableNode;
        this.$event = dragStopped;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$event, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r7 == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r0.mo205applyToFlingBMRW4eQ(r3, r8, r7) == r5) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long m379reverseIfNeededAH228Gc;
        float m381toFloatTH1AsA0;
        OverscrollEffect overscrollEffect;
        OverscrollEffect overscrollEffect2;
        long m384toVelocityadjELrA;
        Object fling;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            m379reverseIfNeededAH228Gc = anchoredDraggableNode.m379reverseIfNeededAH228Gc(this.$event.m417getVelocity9UxMQ8M());
            m381toFloatTH1AsA0 = anchoredDraggableNode.m381toFloatTH1AsA0(m379reverseIfNeededAH228Gc);
            overscrollEffect = ((AnchoredDraggableNode) this.this$0).overscrollEffect;
            AnchoredDraggableNode<T> anchoredDraggableNode2 = this.this$0;
            vn vnVar = vn.d;
            if (overscrollEffect == null) {
                this.label = 1;
                fling = anchoredDraggableNode2.fling(m381toFloatTH1AsA0, this);
            } else {
                overscrollEffect2 = ((AnchoredDraggableNode) anchoredDraggableNode2).overscrollEffect;
                overscrollEffect2.getClass();
                m384toVelocityadjELrA = this.this$0.m384toVelocityadjELrA(m381toFloatTH1AsA0);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
