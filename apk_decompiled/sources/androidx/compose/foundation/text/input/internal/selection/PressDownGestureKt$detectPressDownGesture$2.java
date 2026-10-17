package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", l = {31, 37}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class PressDownGestureKt$detectPressDownGesture$2 extends ij0 implements my {
    final /* synthetic */ TapOnPosition $onDown;
    final /* synthetic */ iy $onUp;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressDownGestureKt$detectPressDownGesture$2(TapOnPosition tapOnPosition, iy iyVar, hm hmVar) {
        super(hmVar);
        this.$onDown = tapOnPosition;
        this.$onUp = iyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new PressDownGestureKt$detectPressDownGesture$2(this.$onDown, this.$onUp, hmVar);
        pressDownGestureKt$detectPressDownGesture$2.L$0 = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((PressDownGestureKt$detectPressDownGesture$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r14 != r4) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:6:0x0060). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2;
        AwaitPointerEventScope awaitPointerEventScope;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope3;
            this.label = 1;
            pressDownGestureKt$detectPressDownGesture$2 = this;
            obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, pressDownGestureKt$detectPressDownGesture$2, 2, null);
            if (obj != vnVar) {
                awaitPointerEventScope = awaitPointerEventScope3;
            }
            return vnVar;
        }
        if (i != 1) {
            if (i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pointerInputChange = (PointerInputChange) this.L$1;
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
            pressDownGestureKt$detectPressDownGesture$2 = this;
            List<PointerInputChange> changes = ((PointerEvent) obj).getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChange2 = changes.get(i2);
                if (PointerId.m6080equalsimpl0(pointerInputChange2.m6098getIdJ3iCeTQ(), pointerInputChange.m6098getIdJ3iCeTQ()) && pointerInputChange2.getPressed()) {
                    pressDownGestureKt$detectPressDownGesture$2.L$0 = awaitPointerEventScope2;
                    pressDownGestureKt$detectPressDownGesture$2.L$1 = pointerInputChange;
                    pressDownGestureKt$detectPressDownGesture$2.label = 2;
                    obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, pressDownGestureKt$detectPressDownGesture$2, 1, null);
                }
            }
            pressDownGestureKt$detectPressDownGesture$2.$onUp.invoke();
            return w01.a;
        }
        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
        p10.Q(obj);
        pressDownGestureKt$detectPressDownGesture$2 = this;
        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
        pressDownGestureKt$detectPressDownGesture$2.$onDown.mo1388onEventk4lQ0M(pointerInputChange3.m6101getPositionF1C5BW0());
        if (pressDownGestureKt$detectPressDownGesture$2.$onUp != null) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = pointerInputChange3;
            pressDownGestureKt$detectPressDownGesture$2.L$0 = awaitPointerEventScope2;
            pressDownGestureKt$detectPressDownGesture$2.L$1 = pointerInputChange;
            pressDownGestureKt$detectPressDownGesture$2.label = 2;
            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, pressDownGestureKt$detectPressDownGesture$2, 1, null);
        }
        return w01.a;
    }
}
