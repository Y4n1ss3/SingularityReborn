package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", l = {533, 536, 544}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends ij0 implements my {
    final /* synthetic */ iy $onDragCancel;
    final /* synthetic */ iy $onDragEnd;
    final /* synthetic */ ky $onDragStart;
    final /* synthetic */ my $onVerticalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectVerticalDragGestures$5(ky kyVar, my myVar, iy iyVar, iy iyVar2, hm hmVar) {
        super(hmVar);
        this.$onDragStart = kyVar;
        this.$onVerticalDrag = myVar;
        this.$onDragEnd = iyVar;
        this.$onDragCancel = iyVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(gi0 gi0Var, PointerInputChange pointerInputChange, float f) {
        pointerInputChange.consume();
        gi0Var.d = f;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$1(my myVar, PointerInputChange pointerInputChange) {
        myVar.invoke(pointerInputChange, Float.valueOf(Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) & 4294967295L))));
        pointerInputChange.consume();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new DragGestureDetectorKt$detectVerticalDragGestures$5(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, hmVar);
        dragGestureDetectorKt$detectVerticalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((DragGestureDetectorKt$detectVerticalDragGestures$5) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        if (r14 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5;
        AwaitPointerEventScope awaitPointerEventScope;
        gi0 gi0Var;
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$52;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange;
        int i = this.label;
        int i2 = 2;
        int i3 = 1;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope3;
            this.label = 1;
            dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
            obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, dragGestureDetectorKt$detectVerticalDragGestures$5, 2, null);
            if (obj != vnVar) {
                awaitPointerEventScope = awaitPointerEventScope3;
            }
            return vnVar;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                dragGestureDetectorKt$detectVerticalDragGestures$52 = this;
                if (((Boolean) obj).booleanValue()) {
                    dragGestureDetectorKt$detectVerticalDragGestures$52.$onDragEnd.invoke();
                } else {
                    dragGestureDetectorKt$detectVerticalDragGestures$52.$onDragCancel.invoke();
                }
                return w01.a;
            }
            gi0Var = (gi0) this.L$1;
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
            dragGestureDetectorKt$detectVerticalDragGestures$52 = this;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                dragGestureDetectorKt$detectVerticalDragGestures$52.$onDragStart.invoke(Offset.m4505boximpl(pointerInputChange.m6101getPositionF1C5BW0()));
                dragGestureDetectorKt$detectVerticalDragGestures$52.$onVerticalDrag.invoke(pointerInputChange, new Float(gi0Var.d));
                long m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
                g gVar = new g(i2, dragGestureDetectorKt$detectVerticalDragGestures$52.$onVerticalDrag);
                dragGestureDetectorKt$detectVerticalDragGestures$52.L$0 = null;
                dragGestureDetectorKt$detectVerticalDragGestures$52.L$1 = null;
                dragGestureDetectorKt$detectVerticalDragGestures$52.label = 3;
                obj = DragGestureDetectorKt.m438verticalDragjO51t88(awaitPointerEventScope2, m6098getIdJ3iCeTQ, gVar, dragGestureDetectorKt$detectVerticalDragGestures$52);
            }
            return w01.a;
        }
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
        p10.Q(obj);
        dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
        awaitPointerEventScope = awaitPointerEventScope4;
        PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
        gi0Var = new gi0();
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$53 = dragGestureDetectorKt$detectVerticalDragGestures$5;
        long m6098getIdJ3iCeTQ2 = pointerInputChange2.m6098getIdJ3iCeTQ();
        int m6104getTypeT8wyACA = pointerInputChange2.m6104getTypeT8wyACA();
        h hVar = new h(gi0Var, i3);
        dragGestureDetectorKt$detectVerticalDragGestures$53.L$0 = awaitPointerEventScope;
        dragGestureDetectorKt$detectVerticalDragGestures$53.L$1 = gi0Var;
        dragGestureDetectorKt$detectVerticalDragGestures$53.label = 2;
        obj = DragGestureDetectorKt.m430awaitVerticalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, m6098getIdJ3iCeTQ2, m6104getTypeT8wyACA, hVar, dragGestureDetectorKt$detectVerticalDragGestures$53);
        dragGestureDetectorKt$detectVerticalDragGestures$52 = dragGestureDetectorKt$detectVerticalDragGestures$53;
        if (obj != vnVar) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return w01.a;
        }
        return vnVar;
    }
}
