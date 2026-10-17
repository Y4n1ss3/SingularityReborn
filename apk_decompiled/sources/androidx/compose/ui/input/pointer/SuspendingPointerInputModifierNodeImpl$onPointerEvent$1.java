package androidx.compose.ui.input.pointer;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {718, 720}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends us0 implements my {
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, hm hmVar) {
        super(2, hmVar);
        this.this$0 = suspendingPointerInputModifierNodeImpl;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.invoke(r0, r4) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r5.invoke(r0, r4) == r3) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        my myVar;
        my myVar2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            myVar = this.this$0._deprecatedPointerInputHandler;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.this$0;
            vn vnVar = vn.d;
            if (myVar != null) {
                myVar2 = suspendingPointerInputModifierNodeImpl._deprecatedPointerInputHandler;
                myVar2.getClass();
                SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl2 = this.this$0;
                this.label = 1;
            } else {
                PointerInputEventHandler pointerInputEventHandler = suspendingPointerInputModifierNodeImpl.getPointerInputEventHandler();
                SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl3 = this.this$0;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
