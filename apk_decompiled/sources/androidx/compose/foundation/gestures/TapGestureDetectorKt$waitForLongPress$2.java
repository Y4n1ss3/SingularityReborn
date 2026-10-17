package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.LongPressResult;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.ji0;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, 409}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$waitForLongPress$2 extends ij0 implements my {
    final /* synthetic */ PointerEventPass $pass;
    final /* synthetic */ ji0 $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, ji0 ji0Var, hm hmVar) {
        super(hmVar);
        this.$pass = pointerEventPass;
        this.$result = ji0Var;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.$pass, this.$result, hmVar);
        tapGestureDetectorKt$waitForLongPress$2.L$0 = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((TapGestureDetectorKt$waitForLongPress$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        r13.$result.d = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r13.$result.d = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r14 = r14.getChanges();
        r5 = r14.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r6 >= r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r7 = r14.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r7.isConsumed() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.m6037isOutOfBoundsjwHxaWs(r7, r0.mo5985getSizeYbymL2g(), r0.mo5984getExtendedTouchPaddingNHjbRc()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        r13.$result.d = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        r14 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r13.L$0 = r0;
        r13.label = 2;
        r14 = r0.awaitPointerEvent(r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r14 != r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:6:0x00a1). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        AwaitPointerEventScope awaitPointerEventScope2;
        int size;
        int i;
        Object awaitPointerEvent;
        int i2 = this.label;
        vn vnVar = vn.d;
        if (i2 == 0) {
            p10.Q(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            PointerEventPass pointerEventPass = this.$pass;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
            if (awaitPointerEvent != vnVar) {
            }
            return vnVar;
        }
        if (i2 == 1) {
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i = 0;
            while (true) {
                if (i >= size) {
                }
                i++;
            }
            return w01.a;
        }
        if (i2 != 2) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
        p10.Q(obj);
        List<PointerInputChange> changes2 = ((PointerEvent) obj).getChanges();
        int size2 = changes2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (changes2.get(i3).isConsumed()) {
                break;
            }
        }
        awaitPointerEventScope = awaitPointerEventScope2;
        PointerEventPass pointerEventPass2 = this.$pass;
        this.L$0 = awaitPointerEventScope;
        this.label = 1;
        awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
        if (awaitPointerEvent != vnVar) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            obj = awaitPointerEvent;
            PointerEvent pointerEvent2 = (PointerEvent) obj;
            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
            size = changes3.size();
            i = 0;
            while (true) {
                if (i >= size) {
                    this.$result.d = new LongPressResult.Released(pointerEvent2.getChanges().get(0));
                    break;
                }
                if (!PointerEventKt.changedToUp(changes3.get(i))) {
                    break;
                }
                i++;
            }
            return w01.a;
        }
        return vnVar;
    }
}
