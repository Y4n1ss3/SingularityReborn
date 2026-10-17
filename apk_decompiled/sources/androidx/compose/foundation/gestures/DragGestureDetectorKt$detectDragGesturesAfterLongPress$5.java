package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {359, 360, 365}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends ij0 implements my {
    final /* synthetic */ my $onDrag;
    final /* synthetic */ iy $onDragCancel;
    final /* synthetic */ iy $onDragEnd;
    final /* synthetic */ ky $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar) {
        super(hmVar);
        this.$onDragStart = kyVar;
        this.$onDragEnd = iyVar;
        this.$onDragCancel = iyVar2;
        this.$onDrag = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(my myVar, PointerInputChange pointerInputChange) {
        myVar.invoke(pointerInputChange, Offset.m4505boximpl(PointerEventKt.positionChange(pointerInputChange)));
        pointerInputChange.consume();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, hmVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r13 == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[Catch: CancellationException -> 0x00af, TryCatch #0 {CancellationException -> 0x00af, blocks: (B:21:0x0089, B:23:0x0091, B:25:0x009f, B:27:0x00ab, B:29:0x00b2, B:32:0x00b5, B:33:0x00bb, B:17:0x0062, B:19:0x0066, B:14:0x0051, B:8:0x0049), top: B:7:0x0049 }] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
        AwaitPointerEventScope awaitPointerEventScope;
        PointerInputChange pointerInputChange;
        int i = this.label;
        int i2 = 0;
        vn vnVar = vn.d;
        if (i != 0) {
            try {
                if (i != 1) {
                    if (i == 2) {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        p10.Q(obj);
                        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.$onDragStart.invoke(Offset.m4505boximpl(pointerInputChange.m6101getPositionF1C5BW0()));
                            long m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
                            g gVar = new g(i2, dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.$onDrag);
                            dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = awaitPointerEventScope;
                            dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.label = 3;
                            obj = DragGestureDetectorKt.m434dragjO51t88(awaitPointerEventScope, m6098getIdJ3iCeTQ, gVar, dragGestureDetectorKt$detectDragGesturesAfterLongPress$5);
                        }
                        return w01.a;
                    }
                    if (i != 3) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
                    if (((Boolean) obj).booleanValue()) {
                        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size = changes.size();
                        while (i2 < size) {
                            PointerInputChange pointerInputChange2 = changes.get(i2);
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                            i2++;
                        }
                        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.$onDragEnd.invoke();
                    } else {
                        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.$onDragCancel.invoke();
                    }
                    return w01.a;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
            } catch (CancellationException e) {
                cancellationException = e;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.$onDragCancel.invoke();
                throw cancellationException;
            }
        } else {
            p10.Q(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            try {
                this.L$0 = awaitPointerEventScope2;
                this.label = 1;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
                try {
                    obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, dragGestureDetectorKt$detectDragGesturesAfterLongPress$5, 2, null);
                    if (obj == vnVar) {
                        return vnVar;
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                } catch (CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.$onDragCancel.invoke();
                    throw cancellationException;
                }
            } catch (CancellationException e3) {
                e = e3;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
            }
        }
        long m6098getIdJ3iCeTQ2 = ((PointerInputChange) obj).m6098getIdJ3iCeTQ();
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = awaitPointerEventScope;
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.label = 2;
        obj = DragGestureDetectorKt.m424awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, m6098getIdJ3iCeTQ2, dragGestureDetectorKt$detectDragGesturesAfterLongPress$5);
        if (obj == vnVar) {
            return vnVar;
        }
        pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
        }
        return w01.a;
    }
}
