package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class RightClickGesturesKt$onRightClickDown$2 extends ij0 implements my {
    final /* synthetic */ ky $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightClickGesturesKt$onRightClickDown$2(ky kyVar, hm hmVar) {
        super(hmVar);
        this.$onDown = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        RightClickGesturesKt$onRightClickDown$2 rightClickGesturesKt$onRightClickDown$2 = new RightClickGesturesKt$onRightClickDown$2(this.$onDown, hmVar);
        rightClickGesturesKt$onRightClickDown$2.L$0 = obj;
        return rightClickGesturesKt$onRightClickDown$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((RightClickGesturesKt$onRightClickDown$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r9 == r4) goto L15;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            obj = RightClickGesturesKt.awaitFirstRightClickDown(awaitPointerEventScope, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                    pointerInputChange.consume();
                }
                return w01.a;
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
        pointerInputChange2.consume();
        this.$onDown.invoke(Offset.m4505boximpl(pointerInputChange2.m6101getPositionF1C5BW0()));
        this.L$0 = null;
        this.label = 2;
        obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
    }
}
