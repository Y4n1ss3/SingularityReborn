package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.fi0;
import defpackage.hm;
import defpackage.ij0;
import defpackage.ji0;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {1026, 1048}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends ij0 implements my {
    final /* synthetic */ ji0 $currentDown;
    final /* synthetic */ fi0 $deepPress;
    final /* synthetic */ ji0 $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(fi0 fi0Var, ji0 ji0Var, ji0 ji0Var2, hm hmVar) {
        super(hmVar);
        this.$deepPress = fi0Var;
        this.$currentDown = ji0Var;
        this.$longPress = ji0Var2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$deepPress, this.$currentDown, this.$longPress, hmVar);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r8 == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        r1 = r5 ? 1 : 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6 A[EDGE_INSN: B:69:0x00d6->B:13:0x00d6 BREAK  A[LOOP:0: B:7:0x00c3->B:10:0x00d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b3 -> B:6:0x00b8). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        int i;
        Object obj2;
        Object awaitPointerEvent;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerEvent pointerEvent;
        int size;
        int i2;
        vn vnVar;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        int i3 = this.label;
        Object obj3 = null;
        boolean z = true;
        z = true;
        z = true;
        vn vnVar2 = vn.d;
        if (i3 == 0) {
            p10.Q(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            i = 0;
            if (i == 0) {
            }
        } else {
            if (i3 == 1) {
                i = this.I$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                obj2 = obj;
                PointerEvent pointerEvent2 = (PointerEvent) obj2;
                List<PointerInputChange> changes = pointerEvent2.getChanges();
                int size2 = changes.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        i = z ? 1 : 0;
                        break;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i4))) {
                        break;
                    }
                    i4++;
                }
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                int size3 = changes2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    PointerInputChange pointerInputChange3 = changes2.get(i5);
                    if (pointerInputChange3.isConsumed() || PointerEventKt.m6037isOutOfBoundsjwHxaWs(pointerInputChange3, awaitPointerEventScope.mo5985getSizeYbymL2g(), awaitPointerEventScope.mo5984getExtendedTouchPaddingNHjbRc())) {
                        break;
                    }
                }
                if (TapGestureDetector_androidKt.isDeepPress(pointerEvent2)) {
                    this.$deepPress.d = z;
                    i = z ? 1 : 0;
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = pointerEvent2;
                this.I$0 = i;
                this.label = 2;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
                if (awaitPointerEvent != vnVar2) {
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerEvent = pointerEvent2;
                    List<PointerInputChange> changes3 = ((PointerEvent) awaitPointerEvent).getChanges();
                    size = changes3.size();
                    i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                    }
                    if (DragGestureDetectorKt.m436isPointerUpDmW0f2w(pointerEvent, ((PointerInputChange) this.$currentDown.d).m6098getIdJ3iCeTQ())) {
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    vnVar2 = vnVar;
                    obj3 = null;
                    z = true;
                    if (i == 0) {
                    }
                }
                return vnVar2;
            }
            if (i3 != 2) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            pointerEvent = (PointerEvent) this.L$1;
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
            awaitPointerEvent = obj;
            List<PointerInputChange> changes32 = ((PointerEvent) awaitPointerEvent).getChanges();
            size = changes32.size();
            i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (changes32.get(i2).isConsumed()) {
                    i = z ? 1 : 0;
                    break;
                }
                i2++;
            }
            if (DragGestureDetectorKt.m436isPointerUpDmW0f2w(pointerEvent, ((PointerInputChange) this.$currentDown.d).m6098getIdJ3iCeTQ())) {
                ji0 ji0Var = this.$longPress;
                List<PointerInputChange> changes4 = pointerEvent.getChanges();
                ji0 ji0Var2 = this.$currentDown;
                int size4 = changes4.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        vnVar = vnVar2;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes4.get(i6);
                    vnVar = vnVar2;
                    if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ((PointerInputChange) ji0Var2.d).m6098getIdJ3iCeTQ())) {
                        break;
                    }
                    i6++;
                    vnVar2 = vnVar;
                }
                ji0Var.d = pointerInputChange;
            } else {
                List<PointerInputChange> changes5 = pointerEvent.getChanges();
                int size5 = changes5.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes5.get(i7);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i7++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 != null) {
                    this.$currentDown.d = pointerInputChange4;
                    this.$longPress.d = pointerInputChange4;
                    vnVar = vnVar2;
                } else {
                    i = z ? 1 : 0;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj3 = null;
                    if (i == 0) {
                        return w01.a;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = obj3;
                    this.I$0 = i;
                    this.label = z ? 1 : 0;
                    obj2 = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                }
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            vnVar2 = vnVar;
            obj3 = null;
            z = true;
            if (i == 0) {
            }
        }
    }
}
