package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragGestureNode$initializePointerInputNode$1 implements PointerInputEventHandler {
    final /* synthetic */ DragGestureNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {624}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ my $onDrag;
        final /* synthetic */ iy $onDragCancel;
        final /* synthetic */ ky $onDragEnd;
        final /* synthetic */ ny $onDragStart;
        final /* synthetic */ iy $shouldAwaitTouchSlop;
        final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, DragGestureNode dragGestureNode, ny nyVar, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar) {
            super(2, hmVar);
            this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = dragGestureNode;
            this.$onDragStart = nyVar;
            this.$onDragEnd = kyVar;
            this.$onDragCancel = iyVar;
            this.$shouldAwaitTouchSlop = iyVar2;
            this.$onDrag = myVar;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_SuspendingPointerInputModifierNode, this.this$0, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            un unVar;
            CancellationException cancellationException;
            zg zgVar;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                un unVar2 = (un) this.L$0;
                try {
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    Orientation orientationLock = this.this$0.getOrientationLock();
                    ny nyVar = this.$onDragStart;
                    ky kyVar = this.$onDragEnd;
                    iy iyVar = this.$onDragCancel;
                    iy iyVar2 = this.$shouldAwaitTouchSlop;
                    my myVar = this.$onDrag;
                    this.L$0 = unVar2;
                    this.label = 1;
                    anonymousClass1 = this;
                    try {
                        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, orientationLock, nyVar, kyVar, iyVar, iyVar2, myVar, anonymousClass1);
                        vn vnVar = vn.d;
                        if (detectDragGestures == vnVar) {
                            return vnVar;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        unVar = unVar2;
                        cancellationException = e;
                        zgVar = anonymousClass1.this$0.channel;
                        if (zgVar != null) {
                        }
                        if (!p10.x(unVar)) {
                        }
                        return w01.a;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                    anonymousClass1 = this;
                }
            } else {
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                unVar = (un) this.L$0;
                try {
                    p10.Q(obj);
                } catch (CancellationException e3) {
                    cancellationException = e3;
                    anonymousClass1 = this;
                    zgVar = anonymousClass1.this$0.channel;
                    if (zgVar != null) {
                        zgVar.m(DragEvent.DragCancelled.INSTANCE);
                    }
                    if (!p10.x(unVar)) {
                        throw cancellationException;
                    }
                    return w01.a;
                }
            }
            return w01.a;
        }
    }

    public DragGestureNode$initializePointerInputNode$1(DragGestureNode dragGestureNode) {
        this.this$0 = dragGestureNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(DragGestureNode dragGestureNode, VelocityTracker velocityTracker, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
        zg zgVar;
        dragGestureNode.nodeOffset = Offset.Companion.m4532getZeroF1C5BW0();
        if (((Boolean) dragGestureNode.getCanDrag().invoke(PointerType.m6171boximpl(pointerInputChange.m6104getTypeT8wyACA()))).booleanValue()) {
            if (!dragGestureNode.isListeningForEvents$foundation()) {
                dragGestureNode.startListeningForEvents();
            }
            VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
            long m4520minusMKHz9U = Offset.m4520minusMKHz9U(pointerInputChange2.m6101getPositionF1C5BW0(), offset.m4526unboximpl());
            zgVar = dragGestureNode.channel;
            if (zgVar != null) {
                zgVar.m(new DragEvent.DragStarted(m4520minusMKHz9U, null));
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1(VelocityTracker velocityTracker, PointerInputScope pointerInputScope, DragGestureNode dragGestureNode, PointerInputChange pointerInputChange) {
        zg zgVar;
        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
        float maximumFlingVelocity = pointerInputScope.getViewConfiguration().getMaximumFlingVelocity();
        long m6209calculateVelocityAH228Gc = velocityTracker.m6209calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        velocityTracker.resetTracking();
        zgVar = dragGestureNode.channel;
        if (zgVar != null) {
            zgVar.m(new DragEvent.DragStopped(DraggableKt.m449toValidVelocityTH1AsA0(m6209calculateVelocityAH228Gc), false, null));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$2(DragGestureNode dragGestureNode) {
        zg zgVar;
        zgVar = dragGestureNode.channel;
        if (zgVar != null) {
            zgVar.m(DragEvent.DragCancelled.INSTANCE);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$3(DragGestureNode dragGestureNode) {
        return !dragGestureNode.startDragImmediately();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$4(DragGestureNode dragGestureNode, ii0 ii0Var, VelocityTracker velocityTracker, PointerInputChange pointerInputChange, Offset offset) {
        long j;
        zg zgVar;
        long j2;
        long positionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(dragGestureNode));
        if (!Offset.m4513equalsimpl0(positionOnScreen, ii0Var.d)) {
            long m4520minusMKHz9U = Offset.m4520minusMKHz9U(positionOnScreen, ii0Var.d);
            j2 = dragGestureNode.nodeOffset;
            dragGestureNode.nodeOffset = Offset.m4521plusMKHz9U(j2, m4520minusMKHz9U);
        }
        ii0Var.d = positionOnScreen;
        j = dragGestureNode.nodeOffset;
        VelocityTrackerKt.m6210addPointerInputChange0AR0LA0(velocityTracker, pointerInputChange, j);
        zgVar = dragGestureNode.channel;
        if (zgVar != null) {
            zgVar.m(new DragEvent.DragDelta(offset.m4526unboximpl(), false, null));
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope pointerInputScope, hm hmVar) {
        final VelocityTracker velocityTracker = new VelocityTracker();
        ii0 ii0Var = new ii0();
        ii0Var.d = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(this.this$0));
        final DragGestureNode dragGestureNode = this.this$0;
        final int i = 0;
        final int i2 = 1;
        Object n = p10.n(new AnonymousClass1(pointerInputScope, dragGestureNode, new ny() { // from class: androidx.compose.foundation.gestures.i
            @Override // defpackage.ny
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                w01 invoke$lambda$0;
                invoke$lambda$0 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$0(DragGestureNode.this, velocityTracker, (PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
                return invoke$lambda$0;
            }
        }, new ky() { // from class: androidx.compose.foundation.gestures.j
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 invoke$lambda$1;
                invoke$lambda$1 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$1(VelocityTracker.this, pointerInputScope, dragGestureNode, (PointerInputChange) obj);
                return invoke$lambda$1;
            }
        }, new iy() { // from class: androidx.compose.foundation.gestures.k
            @Override // defpackage.iy
            public final Object invoke() {
                w01 invoke$lambda$2;
                boolean invoke$lambda$3;
                int i3 = i;
                DragGestureNode dragGestureNode2 = dragGestureNode;
                switch (i3) {
                    case 0:
                        invoke$lambda$2 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$2(dragGestureNode2);
                        return invoke$lambda$2;
                    default:
                        invoke$lambda$3 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$3(dragGestureNode2);
                        return Boolean.valueOf(invoke$lambda$3);
                }
            }
        }, new iy() { // from class: androidx.compose.foundation.gestures.k
            @Override // defpackage.iy
            public final Object invoke() {
                w01 invoke$lambda$2;
                boolean invoke$lambda$3;
                int i3 = i2;
                DragGestureNode dragGestureNode2 = dragGestureNode;
                switch (i3) {
                    case 0:
                        invoke$lambda$2 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$2(dragGestureNode2);
                        return invoke$lambda$2;
                    default:
                        invoke$lambda$3 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$3(dragGestureNode2);
                        return Boolean.valueOf(invoke$lambda$3);
                }
            }
        }, new l(dragGestureNode, ii0Var, velocityTracker, i), null), hmVar);
        return n == vn.d ? n : w01.a;
    }
}
