package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.cq;
import defpackage.er;
import defpackage.hm;
import defpackage.kn;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForEachGestureKt {
    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (changes.get(i).getPressed()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (allPointersUp(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:10:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUp(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, hm hmVar) {
        ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        int i;
        if (hmVar instanceof ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3) hmVar;
            int i2 = forEachGestureKt$awaitAllPointersUp$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.label = i2 - Integer.MIN_VALUE;
                Object obj = forEachGestureKt$awaitAllPointersUp$3.result;
                i = forEachGestureKt$awaitAllPointersUp$3.label;
                if (i == 0) {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PointerEventPass pointerEventPass2 = (PointerEventPass) forEachGestureKt$awaitAllPointersUp$3.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) forEachGestureKt$awaitAllPointersUp$3.L$0;
                    p10.Q(obj);
                    pointerEventPass = pointerEventPass2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    List<PointerInputChange> changes = ((PointerEvent) obj).getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (i3 < size) {
                        if (changes.get(i3).getPressed()) {
                            forEachGestureKt$awaitAllPointersUp$3.L$0 = awaitPointerEventScope;
                            forEachGestureKt$awaitAllPointersUp$3.L$1 = pointerEventPass;
                            forEachGestureKt$awaitAllPointersUp$3.label = 1;
                            obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, forEachGestureKt$awaitAllPointersUp$3);
                            vn vnVar = vn.d;
                            if (obj == vnVar) {
                                return vnVar;
                            }
                            List<PointerInputChange> changes2 = ((PointerEvent) obj).getChanges();
                            int size2 = changes2.size();
                            int i32 = 0;
                            while (i32 < size2) {
                            }
                        } else {
                            i32++;
                        }
                    }
                    return w01.a;
                }
                p10.Q(obj);
            }
        }
        forEachGestureKt$awaitAllPointersUp$3 = new ForEachGestureKt$awaitAllPointersUp$3(hmVar);
        Object obj2 = forEachGestureKt$awaitAllPointersUp$3.result;
        i = forEachGestureKt$awaitAllPointersUp$3.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object awaitAllPointersUp$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Final;
        }
        return awaitAllPointersUp(awaitPointerEventScope, pointerEventPass, hmVar);
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, my myVar, hm hmVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitEachGesture$2(hmVar.getContext(), myVar, null), hmVar);
        return awaitPointerEventScope == vn.d ? awaitPointerEventScope : w01.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:35|36))(2:37|38)|13|14|(4:19|20|(2:22|23)|26)(2:16|17))(3:39|40|23))(3:41|14|(0)(0))))|43|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r10 != r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r10 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0052, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kn] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008e -> B:13:0x004f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a8 -> B:13:0x004f). Please report as a decompilation issue!!! */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object forEachGesture(PointerInputScope pointerInputScope, my myVar, hm hmVar) {
        ForEachGestureKt$forEachGesture$1 forEachGestureKt$forEachGesture$1;
        ?? r1;
        kn knVar;
        PointerInputScope pointerInputScope2;
        my myVar2;
        kn knVar2;
        PointerInputScope pointerInputScope3;
        if (hmVar instanceof ForEachGestureKt$forEachGesture$1) {
            forEachGestureKt$forEachGesture$1 = (ForEachGestureKt$forEachGesture$1) hmVar;
            int i = forEachGestureKt$forEachGesture$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$forEachGesture$1.label = i - Integer.MIN_VALUE;
                Object obj = forEachGestureKt$forEachGesture$1.result;
                r1 = forEachGestureKt$forEachGesture$1.label;
                vn vnVar = vn.d;
                if (r1 != 0) {
                    p10.Q(obj);
                    knVar = forEachGestureKt$forEachGesture$1.getContext();
                    pointerInputScope2 = pointerInputScope;
                    myVar = myVar;
                    if (cq.x(knVar)) {
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 == 2) {
                            kn knVar3 = (kn) forEachGestureKt$forEachGesture$1.L$2;
                            my myVar3 = (my) forEachGestureKt$forEachGesture$1.L$1;
                            PointerInputScope pointerInputScope4 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                            p10.Q(obj);
                            pointerInputScope3 = pointerInputScope4;
                            knVar2 = knVar3;
                            myVar2 = myVar3;
                        } else {
                            if (r1 != 3) {
                                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kn knVar4 = (kn) forEachGestureKt$forEachGesture$1.L$2;
                            my myVar4 = (my) forEachGestureKt$forEachGesture$1.L$1;
                            PointerInputScope pointerInputScope5 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                            p10.Q(obj);
                            pointerInputScope3 = pointerInputScope5;
                            knVar2 = knVar4;
                            myVar2 = myVar4;
                        }
                        knVar = knVar2;
                        pointerInputScope2 = pointerInputScope3;
                        myVar = myVar2;
                        if (cq.x(knVar)) {
                            return w01.a;
                        }
                        try {
                        } catch (CancellationException e) {
                            r1 = pointerInputScope2;
                            pointerInputScope = knVar;
                            e = e;
                            if (cq.x(pointerInputScope)) {
                                throw e;
                            }
                            forEachGestureKt$forEachGesture$1.L$0 = r1;
                            forEachGestureKt$forEachGesture$1.L$1 = myVar;
                            forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                            forEachGestureKt$forEachGesture$1.label = 3;
                            Object awaitAllPointersUp = awaitAllPointersUp(r1, forEachGestureKt$forEachGesture$1);
                            pointerInputScope3 = r1;
                            knVar2 = pointerInputScope;
                            myVar2 = myVar;
                        }
                        forEachGestureKt$forEachGesture$1.L$0 = pointerInputScope2;
                        forEachGestureKt$forEachGesture$1.L$1 = myVar;
                        forEachGestureKt$forEachGesture$1.L$2 = knVar;
                        forEachGestureKt$forEachGesture$1.label = 1;
                        if (myVar.invoke(pointerInputScope2, forEachGestureKt$forEachGesture$1) != vnVar) {
                            r1 = pointerInputScope2;
                            pointerInputScope = knVar;
                            myVar = myVar;
                            forEachGestureKt$forEachGesture$1.L$0 = r1;
                            forEachGestureKt$forEachGesture$1.L$1 = myVar;
                            forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                            forEachGestureKt$forEachGesture$1.label = 2;
                            Object awaitAllPointersUp2 = awaitAllPointersUp(r1, forEachGestureKt$forEachGesture$1);
                            pointerInputScope3 = r1;
                            knVar2 = pointerInputScope;
                            myVar2 = myVar;
                        }
                        return vnVar;
                    }
                    kn knVar5 = (kn) forEachGestureKt$forEachGesture$1.L$2;
                    my myVar5 = (my) forEachGestureKt$forEachGesture$1.L$1;
                    PointerInputScope pointerInputScope6 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                    p10.Q(obj);
                    r1 = pointerInputScope6;
                    pointerInputScope = knVar5;
                    myVar = myVar5;
                    forEachGestureKt$forEachGesture$1.L$0 = r1;
                    forEachGestureKt$forEachGesture$1.L$1 = myVar;
                    forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                    forEachGestureKt$forEachGesture$1.label = 2;
                    Object awaitAllPointersUp22 = awaitAllPointersUp(r1, forEachGestureKt$forEachGesture$1);
                    pointerInputScope3 = r1;
                    knVar2 = pointerInputScope;
                    myVar2 = myVar;
                }
            }
        }
        forEachGestureKt$forEachGesture$1 = new ForEachGestureKt$forEachGesture$1(hmVar);
        Object obj2 = forEachGestureKt$forEachGesture$1.result;
        r1 = forEachGestureKt$forEachGesture$1.label;
        vn vnVar2 = vn.d;
        if (r1 != 0) {
        }
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, hm hmVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitAllPointersUp$2(null), hmVar);
        return awaitPointerEventScope == vn.d ? awaitPointerEventScope : w01.a;
    }
}
