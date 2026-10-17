package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$awaitSecondDown$2 extends ij0 implements my {
    final /* synthetic */ PointerInputChange $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(PointerInputChange pointerInputChange, hm hmVar) {
        super(hmVar);
        this.$firstUp = pointerInputChange;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, hmVar);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:5:0x0046). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        long doubleTapMinTimeMillis;
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2;
        vn vnVar;
        PointerInputChange pointerInputChange;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            awaitPointerEventScope = awaitPointerEventScope2;
            doubleTapMinTimeMillis = awaitPointerEventScope2.getViewConfiguration().getDoubleTapMinTimeMillis() + this.$firstUp.getUptimeMillis();
            this.L$0 = awaitPointerEventScope;
            this.J$0 = doubleTapMinTimeMillis;
            this.label = 1;
            tapGestureDetectorKt$awaitSecondDown$2 = this;
            obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, tapGestureDetectorKt$awaitSecondDown$2, 3, null);
            vnVar = vn.d;
            if (obj == vnVar) {
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange.getUptimeMillis() >= doubleTapMinTimeMillis) {
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            doubleTapMinTimeMillis = this.J$0;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
            tapGestureDetectorKt$awaitSecondDown$2 = this;
            awaitPointerEventScope = awaitPointerEventScope3;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange.getUptimeMillis() >= doubleTapMinTimeMillis) {
                return pointerInputChange;
            }
            this = tapGestureDetectorKt$awaitSecondDown$2;
            this.L$0 = awaitPointerEventScope;
            this.J$0 = doubleTapMinTimeMillis;
            this.label = 1;
            tapGestureDetectorKt$awaitSecondDown$2 = this;
            obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, tapGestureDetectorKt$awaitSecondDown$2, 3, null);
            vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange.getUptimeMillis() >= doubleTapMinTimeMillis) {
            }
        }
    }
}
