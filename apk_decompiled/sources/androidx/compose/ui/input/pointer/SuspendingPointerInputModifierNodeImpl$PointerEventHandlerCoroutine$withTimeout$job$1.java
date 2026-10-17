package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import defpackage.bq;
import defpackage.fg;
import defpackage.hm;
import defpackage.jj0;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {882, 883}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 extends us0 implements my {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(long j, SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, hm hmVar) {
        super(2, hmVar);
        this.$timeMillis = j;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(this.$timeMillis, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (defpackage.y80.p(8, r8) == r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (defpackage.y80.p(r6, r8) == r5) goto L15;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fg fgVar;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            long j = this.$timeMillis - 8;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                fgVar = ((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.this$0).pointerAwaiter;
                if (fgVar != null) {
                    fgVar.resumeWith(new jj0(new PointerEventTimeoutCancellationException(this.$timeMillis)));
                }
                return w01.a;
            }
            p10.Q(obj);
        }
        this.label = 2;
    }
}
