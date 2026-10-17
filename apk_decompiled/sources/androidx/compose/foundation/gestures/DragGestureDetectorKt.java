package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import defpackage.e1;
import defpackage.fi0;
import defpackage.g7;
import defpackage.hm;
import defpackage.ii0;
import defpackage.iy;
import defpackage.ji0;
import defpackage.ky;
import defpackage.ms;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.qo;
import defpackage.vn;
import defpackage.w01;
import defpackage.x6;
import defpackage.xk;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(0.125f);
        mouseSlop = m7611constructorimpl;
        float m7611constructorimpl2 = Dp.m7611constructorimpl(18.0f);
        defaultTouchSlop = m7611constructorimpl2;
        mouseToTouchSlopRatio = m7611constructorimpl / m7611constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0095 -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUpWithSlopDetection(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, hm hmVar) {
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
        int i;
        ii0 ii0Var;
        TouchSlopDetector touchSlopDetector;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
        PointerEventPass pointerEventPass2;
        Object awaitPointerEvent;
        vn vnVar;
        PointerInputChange pointerInputChange2;
        int size;
        int i3;
        PointerInputChange pointerInputChange3;
        PointerInputChange pointerInputChange4;
        int size2;
        int i4;
        if (hmVar instanceof DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) {
            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = (DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) hmVar;
            int i5 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label = i5 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
                i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
                if (i == 0) {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.F$0;
                    int i6 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.I$0;
                    TouchSlopDetector touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$3;
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$2;
                    PointerEventPass pointerEventPass3 = (PointerEventPass) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$0;
                    p10.Q(obj);
                    float f3 = f2;
                    TouchSlopDetector touchSlopDetector3 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                    pointerEventPass2 = pointerEventPass3;
                    ii0Var = ii0Var2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size3 = changes.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size3) {
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes.get(i7);
                        if (PointerId.m6080equalsimpl0(pointerInputChange2.m6098getIdJ3iCeTQ(), ii0Var.d)) {
                            break;
                        }
                        i7++;
                    }
                    PointerInputChange pointerInputChange5 = pointerInputChange2;
                    if (pointerInputChange5 != null || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange5)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        size = changes2.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i3);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i3++;
                        }
                        pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            return Boolean.valueOf(i6 != 0);
                        }
                        ii0Var.d = pointerInputChange4.m6098getIdJ3iCeTQ();
                    } else if ((touchSlopDetector3.m564addPositionsakrDWew(pointerInputChange5.m6101getPositionF1C5BW0(), pointerInputChange5.m6102getPreviousPositionF1C5BW0(), f3) & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                        i2 = 1;
                        List<PointerInputChange> changes3 = pointerEvent.getChanges();
                        size2 = changes3.size();
                        for (i4 = 0; i4 < size2; i4++) {
                            if (changes3.get(i4).getPressed()) {
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                touchSlopDetector = touchSlopDetector3;
                                f = f3;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$1 = pointerEventPass2;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$2 = ii0Var;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$3 = touchSlopDetector;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.I$0 = i2;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.F$0 = f;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.label = 1;
                                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                                vnVar = vn.d;
                                if (awaitPointerEvent != vnVar) {
                                    return vnVar;
                                }
                                awaitPointerEventScope3 = awaitPointerEventScope2;
                                obj = awaitPointerEvent;
                                f3 = f;
                                i6 = i2;
                                touchSlopDetector3 = touchSlopDetector;
                                PointerEvent pointerEvent2 = (PointerEvent) obj;
                                List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                                int size32 = changes4.size();
                                int i72 = 0;
                                while (true) {
                                    if (i72 < size32) {
                                    }
                                    i72++;
                                }
                                PointerInputChange pointerInputChange52 = pointerInputChange2;
                                if (pointerInputChange52 != null) {
                                }
                                List<PointerInputChange> changes22 = pointerEvent2.getChanges();
                                size = changes22.size();
                                i3 = 0;
                                while (true) {
                                    if (i3 < size) {
                                    }
                                    i3++;
                                }
                                pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 != null) {
                                }
                            }
                        }
                        return Boolean.valueOf(i2 == 0);
                    }
                    i2 = i6;
                    List<PointerInputChange> changes32 = pointerEvent2.getChanges();
                    size2 = changes32.size();
                    while (i4 < size2) {
                    }
                    return Boolean.valueOf(i2 == 0);
                }
                p10.Q(obj);
                if (ForEachGestureKt.allPointersUp(awaitPointerEventScope)) {
                    return Boolean.FALSE;
                }
                ii0 ii0Var3 = new ii0();
                ii0Var3.d = pointerInputChange.m6098getIdJ3iCeTQ();
                float m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), pointerInputChange.m6104getTypeT8wyACA());
                ii0Var = ii0Var3;
                touchSlopDetector = new TouchSlopDetector(null, 0L, 3, null);
                i2 = 0;
                awaitPointerEventScope2 = awaitPointerEventScope;
                f = m437pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                pointerEventPass2 = pointerEventPass;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$1 = pointerEventPass2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$2 = ii0Var;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.I$0 = i2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.F$0 = f;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.label = 1;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                vnVar = vn.d;
                if (awaitPointerEvent != vnVar) {
                }
            }
        }
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = new DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(hmVar);
        Object obj2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
        i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object awaitAllPointersUpWithSlopDetection$default(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, pointerInputChange, pointerEventPass, hmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r6) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m419awaitDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, hm hmVar) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        ii0 ii0Var;
        Object awaitPointerEvent$default;
        vn vnVar;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (hmVar instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) hmVar;
            int i2 = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
                    p10.Q(obj);
                    ii0 ii0Var3 = ii0Var2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i4);
                        if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var3.d)) {
                            break;
                        }
                        i4++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (i3 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i3);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i3++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                ii0Var3.d = pointerInputChange4.m6098getIdJ3iCeTQ();
                                ii0Var = ii0Var3;
                            }
                        }
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ii0Var;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                        vnVar = vn.d;
                        if (awaitPointerEvent$default != vnVar) {
                            return vnVar;
                        }
                        ii0 ii0Var4 = ii0Var;
                        obj = awaitPointerEvent$default;
                        ii0Var3 = ii0Var4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                p10.Q(obj);
                if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                ii0Var = new ii0();
                ii0Var.d = j;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ii0Var;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                vnVar = vn.d;
                if (awaitPointerEvent$default != vnVar) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(hmVar);
        Object obj2 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        return r6;
     */
    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object m420awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, ky kyVar, hm hmVar) {
        PointerInputChange pointerInputChange;
        while (true) {
            PointerInputChange pointerInputChange2 = null;
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, hmVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), j)).booleanValue()) {
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    break;
                }
                j = pointerInputChange5.m6098getIdJ3iCeTQ();
            } else if (((Boolean) kyVar.invoke(pointerInputChange3)).booleanValue()) {
                break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r6) >> 32)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m421awaitHorizontalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, hm hmVar) {
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        int i;
        ii0 ii0Var;
        Object awaitPointerEvent$default;
        vn vnVar;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (hmVar instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) hmVar;
            int i2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
                i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0;
                    p10.Q(obj);
                    ii0 ii0Var3 = ii0Var2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var3.d)) {
                            break;
                        }
                        i3++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (r4 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(r4);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                r4++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                ii0Var3.d = pointerInputChange4.m6098getIdJ3iCeTQ();
                                ii0Var = ii0Var3;
                            }
                        }
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = ii0Var;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                        vnVar = vn.d;
                        if (awaitPointerEvent$default != vnVar) {
                            return vnVar;
                        }
                        ii0 ii0Var4 = ii0Var;
                        obj = awaitPointerEvent$default;
                        ii0Var3 = ii0Var4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                p10.Q(obj);
                if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                ii0Var = new ii0();
                ii0Var.d = j;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = ii0Var;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                vnVar = vn.d;
                if (awaitPointerEvent$default != vnVar) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(hmVar);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
        i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0182 -> B:11:0x0183). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m422awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, my myVar, hm hmVar) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        float m437pointerSlopE8SPZFQ;
        ii0 ii0Var;
        my myVar2;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        my myVar3;
        AwaitPointerEventScope awaitPointerEventScope3;
        TouchSlopDetector touchSlopDetector2;
        float f;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i4;
        Object awaitPointerEvent$default;
        if (hmVar instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) hmVar;
            int i5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i6 = 1;
                vn vnVar = vn.d;
                if (i2 != 0) {
                    p10.Q(obj);
                    Orientation orientation = Orientation.Horizontal;
                    long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
                    if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    ii0Var = new ii0();
                    ii0Var.d = j;
                    myVar2 = myVar;
                    touchSlopDetector = new TouchSlopDetector(orientation, m4532getZeroF1C5BW0, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = myVar2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i6, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i2 == 1) {
                    f = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    myVar3 = (my) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    p10.Q(obj);
                    ii0Var = ii0Var2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = myVar2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i6, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i2 != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                ii0 ii0Var3 = (ii0) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                my myVar4 = (my) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                p10.Q(obj);
                touchSlopDetector = touchSlopDetector3;
                pointerInputChange2 = pointerInputChange4;
                char c = 2;
                float f3 = f2;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                myVar3 = myVar4;
                ii0Var = ii0Var3;
                if (!pointerInputChange2.isConsumed()) {
                    return null;
                }
                m437pointerSlopE8SPZFQ = f3;
                myVar2 = myVar3;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = myVar2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ii0Var;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = null;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m437pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i6;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i6, null);
                if (awaitPointerEvent$default != vnVar) {
                    myVar3 = myVar2;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    f = m437pointerSlopE8SPZFQ;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i4 = i3;
                        if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var.d)) {
                            break;
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        float f4 = f;
                        TouchSlopDetector touchSlopDetector4 = touchSlopDetector2;
                        long m564addPositionsakrDWew = touchSlopDetector4.m564addPositionsakrDWew(pointerInputChange2.m6101getPositionF1C5BW0(), pointerInputChange2.m6102getPreviousPositionF1C5BW0(), f4);
                        touchSlopDetector = touchSlopDetector4;
                        f3 = f4;
                        if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            myVar3.invoke(pointerInputChange2, new Float(Float.intBitsToFloat((int) (m564addPositionsakrDWew >> 32))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            i6 = 1;
                            TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                            m437pointerSlopE8SPZFQ = f3;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            myVar2 = myVar3;
                        } else {
                            i6 = 1;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = myVar3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ii0Var;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = f3;
                            c = 2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) != vnVar) {
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    } else {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i7);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i7++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        ii0Var.d = pointerInputChange5.m6098getIdJ3iCeTQ();
                        touchSlopDetector = touchSlopDetector2;
                        i6 = 1;
                        m437pointerSlopE8SPZFQ = f;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        myVar2 = myVar3;
                    }
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = myVar2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i6, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                }
                return vnVar;
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(hmVar);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i62 = 1;
        vn vnVar2 = vn.d;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x019f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0193 -> B:11:0x0197). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m423awaitHorizontalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, my myVar, hm hmVar) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        float m437pointerSlopE8SPZFQ;
        ii0 ii0Var;
        my myVar2;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        vn vnVar;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        Object awaitPointerEvent$default;
        if (hmVar instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) hmVar;
            int i3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass2 = null;
                vn vnVar2 = vn.d;
                if (i != 0) {
                    p10.Q(obj3);
                    int m6181getTouchT8wyACA = PointerType.Companion.m6181getTouchT8wyACA();
                    Orientation orientation = Orientation.Horizontal;
                    long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
                    if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m6181getTouchT8wyACA);
                    ii0Var = new ii0();
                    ii0Var.d = j;
                    TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation, m4532getZeroF1C5BW0, null);
                    myVar2 = myVar;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != vnVar2) {
                    }
                    return vnVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                    my myVar3 = (my) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                    p10.Q(obj3);
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    touchSlopDetector = touchSlopDetector4;
                    m437pointerSlopE8SPZFQ = f2;
                    int i5 = 1;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    char c = 2;
                    if (!pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    i4 = i5;
                    myVar2 = myVar3;
                    pointerEventPass2 = null;
                    ii0Var = ii0Var2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != vnVar2) {
                        f = m437pointerSlopE8SPZFQ;
                        touchSlopDetector2 = touchSlopDetector;
                        obj3 = awaitPointerEvent$default;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i6 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerEventPass = pointerEventPass2;
                                vnVar = vnVar2;
                                obj = pointerEventPass;
                                break;
                            }
                            obj = changes.get(i2);
                            pointerEventPass = pointerEventPass2;
                            vnVar = vnVar2;
                            if (PointerId.m6080equalsimpl0(((PointerInputChange) obj).m6098getIdJ3iCeTQ(), ii0Var.d)) {
                                break;
                            }
                            i2++;
                            pointerEventPass2 = pointerEventPass;
                            vnVar2 = vnVar;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return pointerEventPass;
                        }
                        if (pointerInputChange.isConsumed()) {
                            return pointerEventPass;
                        }
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = pointerEventPass;
                                    break;
                                }
                                obj2 = changes2.get(i6);
                                if (((PointerInputChange) obj2).getPressed()) {
                                    break;
                                }
                                i6++;
                            }
                            PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                            if (pointerInputChange3 == null) {
                                return pointerEventPass;
                            }
                            ii0Var.d = pointerInputChange3.m6098getIdJ3iCeTQ();
                            m437pointerSlopE8SPZFQ = f;
                            i4 = 1;
                            touchSlopDetector = touchSlopDetector2;
                            vnVar2 = vnVar;
                            pointerEventPass2 = null;
                        } else {
                            long m564addPositionsakrDWew = touchSlopDetector2.m564addPositionsakrDWew(pointerInputChange.m6101getPositionF1C5BW0(), pointerInputChange.m6102getPreviousPositionF1C5BW0(), f);
                            m437pointerSlopE8SPZFQ = f;
                            if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                                myVar2.invoke(pointerInputChange, new Float(Float.intBitsToFloat((int) (m564addPositionsakrDWew >> 32))));
                                if (pointerInputChange.isConsumed()) {
                                    return pointerInputChange;
                                }
                                TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector2, 0L, 1, pointerEventPass);
                                i4 = 1;
                                touchSlopDetector = touchSlopDetector2;
                                vnVar2 = vnVar;
                                pointerEventPass2 = null;
                            } else {
                                i5 = 1;
                                PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = myVar2;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = ii0Var;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector2;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerInputChange;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                                c = 2;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = 2;
                                vnVar2 = vnVar;
                                if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12) != vnVar2) {
                                    ii0Var2 = ii0Var;
                                    myVar3 = myVar2;
                                    pointerInputChange2 = pointerInputChange;
                                    touchSlopDetector = touchSlopDetector2;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                }
                            }
                        }
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = myVar2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = ii0Var;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                        if (awaitPointerEvent$default != vnVar2) {
                        }
                    }
                    return vnVar2;
                }
                float f3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                ii0 ii0Var3 = (ii0) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                my myVar4 = (my) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                p10.Q(obj3);
                f = f3;
                touchSlopDetector2 = touchSlopDetector5;
                ii0Var = ii0Var3;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                myVar2 = myVar4;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                PointerEvent pointerEvent2 = (PointerEvent) obj3;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                size = changes3.size();
                int i62 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                    }
                    i2++;
                    pointerEventPass2 = pointerEventPass;
                    vnVar2 = vnVar;
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(hmVar);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass22 = null;
        vn vnVar22 = vn.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5 A[Catch: PointerEventTimeoutCancellationException -> 0x00ae, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00ae, blocks: (B:11:0x002e, B:12:0x00a1, B:14:0x00a5, B:36:0x0085), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r9v3, types: [ji0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m424awaitLongPressOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, hm hmVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        fi0 fi0Var;
        try {
            if (hmVar instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) hmVar;
                int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                    i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                            return null;
                        }
                        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size = changes.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i3);
                            if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), j)) {
                                break;
                            }
                            i3++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 == null) {
                            return null;
                        }
                        ji0 ji0Var = new ji0();
                        ji0 ji0Var2 = new ji0();
                        ji0Var2.d = pointerInputChange2;
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        fi0 fi0Var2 = new fi0();
                        my dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(fi0Var2, ji0Var2, ji0Var, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = ji0Var;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2 = fi0Var2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        Object withTimeout = awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1);
                        Object obj2 = vn.d;
                        if (withTimeout == obj2) {
                            return obj2;
                        }
                        fi0Var = fi0Var2;
                        j = ji0Var;
                    } else {
                        if (i != 1) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fi0Var = (fi0) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2;
                        ji0 ji0Var3 = (ji0) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                        pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                        p10.Q(obj);
                        j = ji0Var3;
                    }
                    if (fi0Var.d) {
                        return null;
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) j.d;
                    return pointerInputChange3 == null ? pointerInputChange2 : pointerInputChange3;
                }
            }
            if (i != 0) {
            }
            if (fi0Var.d) {
            }
        } catch (PointerEventTimeoutCancellationException unused) {
            PointerInputChange pointerInputChange4 = (PointerInputChange) j.d;
            return pointerInputChange4 == null ? pointerInputChange2 : pointerInputChange4;
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(hmVar);
        Object obj3 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0187 -> B:11:0x018b). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m425awaitPointerSlopOrCancellation6ksA65w(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Orientation orientation, long j2, my myVar, hm hmVar) {
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        int i2;
        float m437pointerSlopE8SPZFQ;
        my myVar2;
        ii0 ii0Var;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        ii0 ii0Var2;
        AwaitPointerEventScope awaitPointerEventScope3;
        my myVar3;
        TouchSlopDetector touchSlopDetector2;
        float f;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        int i4;
        PointerInputChange pointerInputChange3;
        int i5;
        Object awaitPointerEvent$default;
        if (hmVar instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) hmVar;
            int i6 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i6 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
                i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
                int i7 = 1;
                vn vnVar = vn.d;
                if (i2 != 0) {
                    p10.Q(obj);
                    if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    ii0 ii0Var3 = new ii0();
                    ii0Var3.d = j;
                    myVar2 = myVar;
                    ii0Var = ii0Var3;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    touchSlopDetector = new TouchSlopDetector(orientation, j2, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = myVar2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i7;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i7, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i2 == 1) {
                    f = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                    ii0 ii0Var4 = (ii0) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    myVar3 = (my) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    p10.Q(obj);
                    ii0Var2 = ii0Var4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    ii0 ii0Var5 = ii0Var2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i5 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    i7 = i4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = myVar2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i7;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i7, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i2 != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                ii0 ii0Var6 = (ii0) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                my myVar4 = (my) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                p10.Q(obj);
                pointerInputChange2 = pointerInputChange4;
                char c = 2;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                touchSlopDetector = touchSlopDetector3;
                m437pointerSlopE8SPZFQ = f2;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                i4 = 1;
                ii0 ii0Var7 = ii0Var6;
                myVar3 = myVar4;
                if (!pointerInputChange2.isConsumed()) {
                    return null;
                }
                myVar2 = myVar3;
                ii0Var = ii0Var7;
                i7 = i4;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = myVar2;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = ii0Var;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = null;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i7;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i7, null);
                if (awaitPointerEvent$default != vnVar) {
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    f = m437pointerSlopE8SPZFQ;
                    obj = awaitPointerEvent$default;
                    ii0Var2 = ii0Var;
                    myVar3 = myVar2;
                    touchSlopDetector2 = touchSlopDetector;
                    ii0 ii0Var52 = ii0Var2;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i5 = i3;
                        if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var52.d)) {
                            break;
                        }
                        i3 = i5 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        float f3 = f;
                        TouchSlopDetector touchSlopDetector4 = touchSlopDetector2;
                        long m564addPositionsakrDWew = touchSlopDetector4.m564addPositionsakrDWew(pointerInputChange2.m6101getPositionF1C5BW0(), pointerInputChange2.m6102getPreviousPositionF1C5BW0(), f3);
                        m437pointerSlopE8SPZFQ = f3;
                        if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            myVar3.invoke(pointerInputChange2, Offset.m4505boximpl(m564addPositionsakrDWew));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            i4 = 1;
                            TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector4, 0L, 1, null);
                            myVar2 = myVar3;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            ii0Var = ii0Var52;
                            touchSlopDetector = touchSlopDetector4;
                        } else {
                            i4 = 1;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope3;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = myVar3;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = ii0Var52;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector4;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                            c = 2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = 2;
                            if (awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12) != vnVar) {
                                ii0Var7 = ii0Var52;
                                touchSlopDetector = touchSlopDetector4;
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    } else {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i8);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i8++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        ii0Var52.d = pointerInputChange5.m6098getIdJ3iCeTQ();
                        m437pointerSlopE8SPZFQ = f;
                        TouchSlopDetector touchSlopDetector5 = touchSlopDetector2;
                        i4 = 1;
                        myVar2 = myVar3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        ii0Var = ii0Var52;
                        touchSlopDetector = touchSlopDetector5;
                    }
                    i7 = i4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = myVar2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i7;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i7, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                }
                return vnVar;
            }
        }
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(hmVar);
        Object obj2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
        i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
        int i72 = 1;
        vn vnVar2 = vn.d;
        if (i2 != 0) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$$forInline, reason: not valid java name */
    private static final Object m426awaitPointerSlopOrCancellation6ksA65w$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Orientation orientation, long j2, my myVar, hm hmVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        long j3 = j;
        if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j3)) {
            return null;
        }
        float m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, j2, null);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, hmVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (Boolean.valueOf(PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), j3)).booleanValue()) {
                    break;
                }
                i3++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i2 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i2);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                j3 = pointerInputChange4.m6098getIdJ3iCeTQ();
            } else {
                long m564addPositionsakrDWew = touchSlopDetector.m564addPositionsakrDWew(pointerInputChange3.m6101getPositionF1C5BW0(), pointerInputChange3.m6102getPreviousPositionF1C5BW0(), m437pointerSlopE8SPZFQ);
                if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    myVar.invoke(pointerInputChange3, Offset.m4505boximpl(m564addPositionsakrDWew));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, hmVar);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static Object m427awaitPointerSlopOrCancellation6ksA65w$default(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Orientation orientation, long j2, my myVar, hm hmVar, int i2, Object obj) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        long m4532getZeroF1C5BW0 = (i2 & 8) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j2;
        long j3 = j;
        if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j3)) {
            return null;
        }
        float m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, m4532getZeroF1C5BW0, null);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, hmVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i4);
                if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), j3)) {
                    break;
                }
                i4++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                j3 = pointerInputChange4.m6098getIdJ3iCeTQ();
            } else {
                float f = m437pointerSlopE8SPZFQ;
                TouchSlopDetector touchSlopDetector2 = touchSlopDetector;
                long m564addPositionsakrDWew = touchSlopDetector2.m564addPositionsakrDWew(pointerInputChange3.m6101getPositionF1C5BW0(), pointerInputChange3.m6102getPreviousPositionF1C5BW0(), f);
                if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    myVar.invoke(pointerInputChange3, Offset.m4505boximpl(m564addPositionsakrDWew));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, hmVar);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                }
                m437pointerSlopE8SPZFQ = f;
                touchSlopDetector = touchSlopDetector2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0176 -> B:11:0x017c). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m428awaitTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, my myVar, hm hmVar) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        float m437pointerSlopE8SPZFQ;
        my myVar2;
        ii0 ii0Var;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i3;
        Object awaitPointerEvent$default;
        if (hmVar instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) hmVar;
            int i4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
                i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
                int i5 = 1;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    int m6181getTouchT8wyACA = PointerType.Companion.m6181getTouchT8wyACA();
                    long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
                    if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m6181getTouchT8wyACA);
                    ii0 ii0Var2 = new ii0();
                    ii0Var2.d = j;
                    TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(null, m4532getZeroF1C5BW0, null);
                    myVar2 = myVar;
                    ii0Var = ii0Var2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i == 1) {
                    float f2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                    ii0 ii0Var3 = (ii0) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                    my myVar3 = (my) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                    p10.Q(obj);
                    f = f2;
                    touchSlopDetector2 = touchSlopDetector4;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    myVar2 = myVar3;
                    ii0Var = ii0Var3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2 = i3 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                ii0Var = (ii0) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                my myVar4 = (my) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                p10.Q(obj);
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                touchSlopDetector = touchSlopDetector5;
                m437pointerSlopE8SPZFQ = f3;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                int i6 = 1;
                char c = 2;
                if (!pointerInputChange4.isConsumed()) {
                    return null;
                }
                i5 = i6;
                myVar2 = myVar4;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = myVar2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ii0Var;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = null;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, null);
                if (awaitPointerEvent$default != vnVar) {
                    f = m437pointerSlopE8SPZFQ;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i2);
                        i3 = i2;
                        if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var.d)) {
                            break;
                        }
                        i2 = i3 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        long m564addPositionsakrDWew = touchSlopDetector2.m564addPositionsakrDWew(pointerInputChange2.m6101getPositionF1C5BW0(), pointerInputChange2.m6102getPreviousPositionF1C5BW0(), f);
                        m437pointerSlopE8SPZFQ = f;
                        if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            myVar2.invoke(pointerInputChange2, Offset.m4505boximpl(m564addPositionsakrDWew));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                            i5 = 1;
                            touchSlopDetector = touchSlopDetector2;
                        } else {
                            i6 = 1;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = myVar2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ii0Var;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                            c = 2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12) != vnVar) {
                                TouchSlopDetector touchSlopDetector6 = touchSlopDetector2;
                                myVar4 = myVar2;
                                pointerInputChange4 = pointerInputChange2;
                                touchSlopDetector = touchSlopDetector6;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                        }
                    } else {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i7);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i7++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        ii0Var.d = pointerInputChange5.m6098getIdJ3iCeTQ();
                        m437pointerSlopE8SPZFQ = f;
                        i5 = 1;
                        touchSlopDetector = touchSlopDetector2;
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                }
                return vnVar;
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(hmVar);
        Object obj2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i52 = 1;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r6) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m429awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, hm hmVar) {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        int i;
        ii0 ii0Var;
        Object awaitPointerEvent$default;
        vn vnVar;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (hmVar instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) hmVar;
            int i2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
                i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
                    p10.Q(obj);
                    ii0 ii0Var3 = ii0Var2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var3.d)) {
                            break;
                        }
                        i3++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (r4 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(r4);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                r4++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                ii0Var3.d = pointerInputChange4.m6098getIdJ3iCeTQ();
                                ii0Var = ii0Var3;
                            }
                        }
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = ii0Var;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                        vnVar = vn.d;
                        if (awaitPointerEvent$default != vnVar) {
                            return vnVar;
                        }
                        ii0 ii0Var4 = ii0Var;
                        obj = awaitPointerEvent$default;
                        ii0Var3 = ii0Var4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                p10.Q(obj);
                if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                ii0Var = new ii0();
                ii0Var.d = j;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = ii0Var;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                vnVar = vn.d;
                if (awaitPointerEvent$default != vnVar) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(hmVar);
        Object obj2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0185 -> B:11:0x0186). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m430awaitVerticalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, my myVar, hm hmVar) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        float m437pointerSlopE8SPZFQ;
        ii0 ii0Var;
        my myVar2;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        my myVar3;
        AwaitPointerEventScope awaitPointerEventScope3;
        TouchSlopDetector touchSlopDetector2;
        float f;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i4;
        Object awaitPointerEvent$default;
        if (hmVar instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) hmVar;
            int i5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                int i6 = 1;
                vn vnVar = vn.d;
                if (i2 != 0) {
                    p10.Q(obj);
                    Orientation orientation = Orientation.Vertical;
                    long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
                    if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    ii0Var = new ii0();
                    ii0Var.d = j;
                    myVar2 = myVar;
                    touchSlopDetector = new TouchSlopDetector(orientation, m4532getZeroF1C5BW0, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = myVar2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i6, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i2 == 1) {
                    f = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    myVar3 = (my) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    p10.Q(obj);
                    ii0Var = ii0Var2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = myVar2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i6, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i2 != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                ii0 ii0Var3 = (ii0) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                my myVar4 = (my) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                p10.Q(obj);
                touchSlopDetector = touchSlopDetector3;
                pointerInputChange2 = pointerInputChange4;
                char c = 2;
                float f3 = f2;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                myVar3 = myVar4;
                ii0Var = ii0Var3;
                if (!pointerInputChange2.isConsumed()) {
                    return null;
                }
                m437pointerSlopE8SPZFQ = f3;
                myVar2 = myVar3;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = myVar2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ii0Var;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = null;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m437pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i6;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i6, null);
                if (awaitPointerEvent$default != vnVar) {
                    myVar3 = myVar2;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    f = m437pointerSlopE8SPZFQ;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i4 = i3;
                        if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var.d)) {
                            break;
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        float f4 = f;
                        TouchSlopDetector touchSlopDetector4 = touchSlopDetector2;
                        long m564addPositionsakrDWew = touchSlopDetector4.m564addPositionsakrDWew(pointerInputChange2.m6101getPositionF1C5BW0(), pointerInputChange2.m6102getPreviousPositionF1C5BW0(), f4);
                        touchSlopDetector = touchSlopDetector4;
                        f3 = f4;
                        if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            myVar3.invoke(pointerInputChange2, new Float(Float.intBitsToFloat((int) (m564addPositionsakrDWew & 4294967295L))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            i6 = 1;
                            TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                            m437pointerSlopE8SPZFQ = f3;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            myVar2 = myVar3;
                        } else {
                            i6 = 1;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = myVar3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ii0Var;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = f3;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) != vnVar) {
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    } else {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i7);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i7++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        ii0Var.d = pointerInputChange5.m6098getIdJ3iCeTQ();
                        touchSlopDetector = touchSlopDetector2;
                        i6 = 1;
                        m437pointerSlopE8SPZFQ = f;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        myVar2 = myVar3;
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = myVar2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i6, null);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                }
                return vnVar;
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(hmVar);
        Object obj2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i62 = 1;
        vn vnVar2 = vn.d;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0196 -> B:11:0x019a). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m431awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, my myVar, hm hmVar) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        float m437pointerSlopE8SPZFQ;
        ii0 ii0Var;
        my myVar2;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        vn vnVar;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        Object awaitPointerEvent$default;
        if (hmVar instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) hmVar;
            int i3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass2 = null;
                vn vnVar2 = vn.d;
                if (i != 0) {
                    p10.Q(obj3);
                    int m6181getTouchT8wyACA = PointerType.Companion.m6181getTouchT8wyACA();
                    Orientation orientation = Orientation.Vertical;
                    long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
                    if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m437pointerSlopE8SPZFQ = m437pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m6181getTouchT8wyACA);
                    ii0Var = new ii0();
                    ii0Var.d = j;
                    TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation, m4532getZeroF1C5BW0, null);
                    myVar2 = myVar;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != vnVar2) {
                    }
                    return vnVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                    my myVar3 = (my) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                    p10.Q(obj3);
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    touchSlopDetector = touchSlopDetector4;
                    m437pointerSlopE8SPZFQ = f2;
                    int i5 = 1;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    char c = 2;
                    if (!pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    i4 = i5;
                    myVar2 = myVar3;
                    pointerEventPass2 = null;
                    ii0Var = ii0Var2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != vnVar2) {
                        f = m437pointerSlopE8SPZFQ;
                        touchSlopDetector2 = touchSlopDetector;
                        obj3 = awaitPointerEvent$default;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i6 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerEventPass = pointerEventPass2;
                                vnVar = vnVar2;
                                obj = pointerEventPass;
                                break;
                            }
                            obj = changes.get(i2);
                            pointerEventPass = pointerEventPass2;
                            vnVar = vnVar2;
                            if (PointerId.m6080equalsimpl0(((PointerInputChange) obj).m6098getIdJ3iCeTQ(), ii0Var.d)) {
                                break;
                            }
                            i2++;
                            pointerEventPass2 = pointerEventPass;
                            vnVar2 = vnVar;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return pointerEventPass;
                        }
                        if (pointerInputChange.isConsumed()) {
                            return pointerEventPass;
                        }
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = pointerEventPass;
                                    break;
                                }
                                obj2 = changes2.get(i6);
                                if (((PointerInputChange) obj2).getPressed()) {
                                    break;
                                }
                                i6++;
                            }
                            PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                            if (pointerInputChange3 == null) {
                                return pointerEventPass;
                            }
                            ii0Var.d = pointerInputChange3.m6098getIdJ3iCeTQ();
                            m437pointerSlopE8SPZFQ = f;
                            i4 = 1;
                            touchSlopDetector = touchSlopDetector2;
                            vnVar2 = vnVar;
                            pointerEventPass2 = null;
                        } else {
                            long m564addPositionsakrDWew = touchSlopDetector2.m564addPositionsakrDWew(pointerInputChange.m6101getPositionF1C5BW0(), pointerInputChange.m6102getPreviousPositionF1C5BW0(), f);
                            m437pointerSlopE8SPZFQ = f;
                            if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                                myVar2.invoke(pointerInputChange, new Float(Float.intBitsToFloat((int) (m564addPositionsakrDWew & 4294967295L))));
                                if (pointerInputChange.isConsumed()) {
                                    return pointerInputChange;
                                }
                                TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector2, 0L, 1, pointerEventPass);
                                i4 = 1;
                                touchSlopDetector = touchSlopDetector2;
                                vnVar2 = vnVar;
                                pointerEventPass2 = null;
                            } else {
                                i5 = 1;
                                PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = myVar2;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = ii0Var;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector2;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerInputChange;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                                c = 2;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = 2;
                                vnVar2 = vnVar;
                                if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12) != vnVar2) {
                                    ii0Var2 = ii0Var;
                                    myVar3 = myVar2;
                                    pointerInputChange2 = pointerInputChange;
                                    touchSlopDetector = touchSlopDetector2;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                }
                            }
                        }
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = myVar2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = ii0Var;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m437pointerSlopE8SPZFQ;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                        if (awaitPointerEvent$default != vnVar2) {
                        }
                    }
                    return vnVar2;
                }
                float f3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                ii0 ii0Var3 = (ii0) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                my myVar4 = (my) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                p10.Q(obj3);
                f = f3;
                touchSlopDetector2 = touchSlopDetector5;
                ii0Var = ii0Var3;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                myVar2 = myVar4;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                PointerEvent pointerEvent2 = (PointerEvent) obj3;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                size = changes3.size();
                int i62 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                    }
                    i2++;
                    pointerEventPass2 = pointerEventPass;
                    vnVar2 = vnVar;
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(hmVar);
        Object obj32 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass22 = null;
        vn vnVar22 = vn.d;
        if (i != 0) {
        }
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar) {
        Object detectDragGestures = detectDragGestures(pointerInputScope, null, new x6(kyVar, 4), new g7(3, iyVar), iyVar2, new ms(0), myVar, hmVar);
        return detectDragGestures == vn.d ? detectDragGestures : w01.a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Orientation orientation, ny nyVar, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            nyVar = new xk(26);
        }
        ny nyVar2 = nyVar;
        if ((i & 4) != 0) {
            kyVar = new qo(12);
        }
        ky kyVar2 = kyVar;
        if ((i & 8) != 0) {
            iyVar = new ms(1);
        }
        iy iyVar3 = iyVar;
        if ((i & 16) != 0) {
            iyVar2 = new ms(2);
        }
        return detectDragGestures(pointerInputScope, orientation, nyVar2, kyVar2, iyVar3, iyVar2, myVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGestures$lambda$0(Offset offset) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGestures$lambda$3(ky kyVar, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
        kyVar.invoke(Offset.m4505boximpl(pointerInputChange2.m6101getPositionF1C5BW0()));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGestures$lambda$4(iy iyVar, PointerInputChange pointerInputChange) {
        iyVar.invoke();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean detectDragGestures$lambda$5() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGestures$lambda$6(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGestures$lambda$7(PointerInputChange pointerInputChange) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean detectDragGestures$lambda$9() {
        return true;
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(kyVar, iyVar, iyVar2, myVar, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = new qo(9);
        }
        ky kyVar2 = kyVar;
        if ((i & 2) != 0) {
            iyVar = new e1(22);
        }
        iy iyVar3 = iyVar;
        if ((i & 4) != 0) {
            iyVar2 = new e1(23);
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, kyVar2, iyVar3, iyVar2, myVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectDragGesturesAfterLongPress$lambda$0(Offset offset) {
        return w01.a;
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(kyVar, myVar, iyVar, iyVar2, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = new qo(8);
        }
        ky kyVar2 = kyVar;
        if ((i & 2) != 0) {
            iyVar = new e1(28);
        }
        iy iyVar3 = iyVar;
        if ((i & 4) != 0) {
            iyVar2 = new e1(29);
        }
        return detectHorizontalDragGestures(pointerInputScope, kyVar2, iyVar3, iyVar2, myVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectHorizontalDragGestures$lambda$0(Offset offset) {
        return w01.a;
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(kyVar, myVar, iyVar, iyVar2, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = new qo(11);
        }
        ky kyVar2 = kyVar;
        if ((i & 2) != 0) {
            iyVar = new e1(26);
        }
        iy iyVar3 = iyVar;
        if ((i & 4) != 0) {
            iyVar2 = new e1(27);
        }
        return detectVerticalDragGestures(pointerInputScope, kyVar2, iyVar3, iyVar2, myVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectVerticalDragGestures$lambda$0(Offset offset) {
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        if (((r2 != null ? r2 == androidx.compose.foundation.gestures.Orientation.Vertical ? java.lang.Float.intBitsToFloat((int) (r3 & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (r3 >> 32)) : androidx.compose.ui.geometry.Offset.m4514getDistanceimpl(r3)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ky] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r7v3, types: [ky] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0089 -> B:10:0x008f). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m432dragVnAYq1g(AwaitPointerEventScope awaitPointerEventScope, long j, ky kyVar, Orientation orientation, ky kyVar2, hm hmVar) {
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$2;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Orientation orientation2;
        ky kyVar3;
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$22;
        ky kyVar4;
        ii0 ii0Var;
        ky kyVar5;
        AwaitPointerEventScope awaitPointerEventScope3;
        ky kyVar6;
        Object awaitPointerEvent$default;
        vn vnVar;
        PointerEventPass pointerEventPass;
        Object obj;
        Object obj2;
        int i2;
        if (hmVar instanceof DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (DragGestureDetectorKt$drag$2) hmVar;
            int i3 = dragGestureDetectorKt$drag$2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.label = i3 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$drag$2.result;
                i = dragGestureDetectorKt$drag$2.label;
                int i4 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i != 0) {
                    p10.Q(obj3);
                    j2 = j;
                    if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return null;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    orientation2 = orientation;
                    kyVar3 = kyVar2;
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    kyVar4 = kyVar;
                    ii0Var = new ii0();
                    ii0Var.d = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    kyVar6 = kyVar4;
                    kyVar5 = kyVar3;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = kyVar6;
                    dragGestureDetectorKt$drag$22.L$2 = orientation2;
                    dragGestureDetectorKt$drag$22.L$3 = kyVar5;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = ii0Var;
                    dragGestureDetectorKt$drag$22.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i4, pointerEventPass2);
                    vnVar = vn.d;
                    if (awaitPointerEvent$default == vnVar) {
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0 ii0Var2 = (ii0) dragGestureDetectorKt$drag$2.L$5;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$4;
                    ky kyVar7 = (ky) dragGestureDetectorKt$drag$2.L$3;
                    Orientation orientation3 = (Orientation) dragGestureDetectorKt$drag$2.L$2;
                    ky kyVar8 = (ky) dragGestureDetectorKt$drag$2.L$1;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$0;
                    p10.Q(obj3);
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    ?? r1 = kyVar8;
                    ii0 ii0Var3 = ii0Var2;
                    orientation2 = orientation3;
                    ?? r7 = kyVar7;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes.get(i5);
                        pointerEventPass = pointerEventPass2;
                        i2 = i5;
                        if (PointerId.m6080equalsimpl0(((PointerInputChange) obj).m6098getIdJ3iCeTQ(), ii0Var3.d)) {
                            break;
                        }
                        i5 = i2 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    ?? r14 = (PointerInputChange) obj;
                    if (r14 == 0) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(r14)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = pointerEventPass;
                                    break;
                                }
                                obj2 = changes2.get(i6);
                                if (((PointerInputChange) obj2).getPressed()) {
                                    break;
                                }
                                i6++;
                            }
                            PointerInputChange pointerInputChange = (PointerInputChange) obj2;
                            if (pointerInputChange != null) {
                                ii0Var3.d = pointerInputChange.m6098getIdJ3iCeTQ();
                                pointerEventPass2 = pointerEventPass;
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                i4 = 1;
                                ii0Var = ii0Var3;
                                kyVar6 = r1;
                                kyVar5 = r7;
                                dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$drag$22.L$1 = kyVar6;
                                dragGestureDetectorKt$drag$22.L$2 = orientation2;
                                dragGestureDetectorKt$drag$22.L$3 = kyVar5;
                                dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                                dragGestureDetectorKt$drag$22.L$5 = ii0Var;
                                dragGestureDetectorKt$drag$22.label = i4;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i4, pointerEventPass2);
                                vnVar = vn.d;
                                if (awaitPointerEvent$default == vnVar) {
                                    return vnVar;
                                }
                                ii0 ii0Var4 = ii0Var;
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                obj3 = awaitPointerEvent$default;
                                ii0Var3 = ii0Var4;
                                r1 = kyVar6;
                                r7 = kyVar5;
                            }
                        } else {
                            long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(r14);
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52 = i2 + 1;
                            pointerEventPass2 = pointerEventPass;
                        }
                        ?? r142 = (PointerInputChange) obj;
                        if (r142 == 0) {
                            r142 = pointerEventPass;
                        }
                    }
                    if (r142 == 0) {
                        return pointerEventPass;
                    }
                    if (((Boolean) r7.invoke(r142)).booleanValue()) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(r142)) {
                        return r142;
                    }
                    r1.invoke(r142);
                    j2 = r142.m6098getIdJ3iCeTQ();
                    pointerEventPass2 = pointerEventPass;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    i4 = 1;
                    kyVar4 = r1;
                    kyVar3 = r7;
                    ii0Var = new ii0();
                    ii0Var.d = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    kyVar6 = kyVar4;
                    kyVar5 = kyVar3;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = kyVar6;
                    dragGestureDetectorKt$drag$22.L$2 = orientation2;
                    dragGestureDetectorKt$drag$22.L$3 = kyVar5;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = ii0Var;
                    dragGestureDetectorKt$drag$22.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i4, pointerEventPass2);
                    vnVar = vn.d;
                    if (awaitPointerEvent$default == vnVar) {
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$2 = new DragGestureDetectorKt$drag$2(hmVar);
        Object obj32 = dragGestureDetectorKt$drag$2.result;
        i = dragGestureDetectorKt$drag$2.label;
        int i42 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m433dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, ky kyVar, Orientation orientation, ky kyVar2, hm hmVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        long j2 = j;
        if (m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, hmVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i);
                if (Boolean.valueOf(PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), j2)).booleanValue()) {
                    break;
                }
                i++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                pointerInputChange3 = null;
            } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (r9 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(r9);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    r9++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 != null) {
                    j2 = pointerInputChange4.m6098getIdJ3iCeTQ();
                }
            } else {
                long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3);
                if (!Boolean.valueOf(1 ^ ((orientation == null ? Offset.m4514getDistanceimpl(positionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (positionChangeIgnoreConsumed & 4294967295L)) : Float.intBitsToFloat((int) (positionChangeIgnoreConsumed >> 32))) == 0.0f ? 1 : 0)).booleanValue()) {
                    continue;
                }
            }
            if (pointerInputChange3 == null || ((Boolean) kyVar2.invoke(pointerInputChange3)).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                return pointerInputChange3;
            }
            kyVar.invoke(pointerInputChange3);
            j2 = pointerInputChange3.m6098getIdJ3iCeTQ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0045 -> B:10:0x0048). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m434dragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, ky kyVar, hm hmVar) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        vn vnVar;
        PointerInputChange pointerInputChange;
        if (hmVar instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) hmVar;
            int i2 = dragGestureDetectorKt$drag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$1.result;
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                    dragGestureDetectorKt$drag$1.L$1 = kyVar;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = m419awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                    vnVar = vn.d;
                    if (obj == vnVar) {
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ky kyVar2 = (ky) dragGestureDetectorKt$drag$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$1.L$0;
                    p10.Q(obj);
                    kyVar = kyVar2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            return Boolean.TRUE;
                        }
                        kyVar.invoke(pointerInputChange);
                        j = pointerInputChange.m6098getIdJ3iCeTQ();
                        dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$drag$1.L$1 = kyVar;
                        dragGestureDetectorKt$drag$1.label = 1;
                        obj = m419awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                        vnVar = vn.d;
                        if (obj == vnVar) {
                            return vnVar;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(hmVar);
        Object obj2 = dragGestureDetectorKt$drag$1.result;
        i = dragGestureDetectorKt$drag$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007f -> B:10:0x0085). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m435horizontalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, ky kyVar, hm hmVar) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        ky kyVar2;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        ii0 ii0Var;
        Object awaitPointerEvent$default;
        vn vnVar;
        PointerInputChange pointerInputChange;
        float intBitsToFloat;
        PointerInputChange pointerInputChange2;
        if (hmVar instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) hmVar;
            int i2 = dragGestureDetectorKt$horizontalDrag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$horizontalDrag$1.result;
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                int i3 = 1;
                PointerInputChange pointerInputChange3 = null;
                if (i != 0) {
                    p10.Q(obj);
                    Orientation orientation3 = Orientation.Horizontal;
                    j2 = j;
                    if (!m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        orientation = orientation3;
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        kyVar2 = kyVar;
                        ii0 ii0Var2 = new ii0();
                        ii0Var2.d = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        ii0Var = ii0Var2;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = kyVar2;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$4 = ii0Var;
                        dragGestureDetectorKt$horizontalDrag$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i3, null);
                        vnVar = vn.d;
                        if (awaitPointerEvent$default == vnVar) {
                        }
                    }
                    return Boolean.valueOf(pointerInputChange3 == null);
                }
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ii0Var = (ii0) dragGestureDetectorKt$horizontalDrag$1.L$4;
                awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$3;
                orientation2 = (Orientation) dragGestureDetectorKt$horizontalDrag$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
                ky kyVar3 = (ky) dragGestureDetectorKt$horizontalDrag$1.L$0;
                p10.Q(obj);
                DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$1;
                kyVar2 = kyVar3;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i4);
                    if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var.d)) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange;
                if (pointerInputChange4 == null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i5);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            }
                            i5++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange2;
                        if (pointerInputChange5 != null) {
                            ii0Var.d = pointerInputChange5.m6098getIdJ3iCeTQ();
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                            i3 = 1;
                            dragGestureDetectorKt$horizontalDrag$12.L$0 = kyVar2;
                            dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                            dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                            dragGestureDetectorKt$horizontalDrag$12.L$4 = ii0Var;
                            dragGestureDetectorKt$horizontalDrag$12.label = i3;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i3, null);
                            vnVar = vn.d;
                            if (awaitPointerEvent$default == vnVar) {
                                return vnVar;
                            }
                            DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$14 = dragGestureDetectorKt$horizontalDrag$12;
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                            dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$14;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4);
                        if (orientation2 != null) {
                            intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                        } else {
                            intBitsToFloat = Offset.m4514getDistanceimpl(positionChangeIgnoreConsumed);
                        }
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    PointerInputChange pointerInputChange42 = pointerInputChange;
                    if (pointerInputChange42 == null) {
                        pointerInputChange42 = null;
                    }
                }
                if (pointerInputChange42 != null && !pointerInputChange42.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange42)) {
                        pointerInputChange3 = pointerInputChange42;
                    } else {
                        kyVar2.invoke(pointerInputChange42);
                        orientation = orientation2;
                        j2 = pointerInputChange42.m6098getIdJ3iCeTQ();
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                        i3 = 1;
                        ii0 ii0Var22 = new ii0();
                        ii0Var22.d = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        ii0Var = ii0Var22;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = kyVar2;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$4 = ii0Var;
                        dragGestureDetectorKt$horizontalDrag$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i3, null);
                        vnVar = vn.d;
                        if (awaitPointerEvent$default == vnVar) {
                        }
                    }
                }
                return Boolean.valueOf(pointerInputChange3 == null);
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(hmVar);
        Object obj2 = dragGestureDetectorKt$horizontalDrag$1.result;
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        int i32 = 1;
        PointerInputChange pointerInputChange32 = null;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m436isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m437pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m6174equalsimpl0(i, PointerType.Companion.m6179getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007f -> B:10:0x0085). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m438verticalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, ky kyVar, hm hmVar) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        ky kyVar2;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        ii0 ii0Var;
        Object awaitPointerEvent$default;
        vn vnVar;
        PointerInputChange pointerInputChange;
        float intBitsToFloat;
        PointerInputChange pointerInputChange2;
        if (hmVar instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) hmVar;
            int i2 = dragGestureDetectorKt$verticalDrag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$verticalDrag$1.result;
                i = dragGestureDetectorKt$verticalDrag$1.label;
                int i3 = 1;
                PointerInputChange pointerInputChange3 = null;
                if (i != 0) {
                    p10.Q(obj);
                    Orientation orientation3 = Orientation.Vertical;
                    j2 = j;
                    if (!m436isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        orientation = orientation3;
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        kyVar2 = kyVar;
                        ii0 ii0Var2 = new ii0();
                        ii0Var2.d = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        ii0Var = ii0Var2;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = kyVar2;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$4 = ii0Var;
                        dragGestureDetectorKt$verticalDrag$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i3, null);
                        vnVar = vn.d;
                        if (awaitPointerEvent$default == vnVar) {
                        }
                    }
                    return Boolean.valueOf(pointerInputChange3 == null);
                }
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ii0Var = (ii0) dragGestureDetectorKt$verticalDrag$1.L$4;
                awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$3;
                orientation2 = (Orientation) dragGestureDetectorKt$verticalDrag$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$1;
                ky kyVar3 = (ky) dragGestureDetectorKt$verticalDrag$1.L$0;
                p10.Q(obj);
                DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$1;
                kyVar2 = kyVar3;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i4);
                    if (PointerId.m6080equalsimpl0(pointerInputChange.m6098getIdJ3iCeTQ(), ii0Var.d)) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange;
                if (pointerInputChange4 == null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i5);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            }
                            i5++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange2;
                        if (pointerInputChange5 != null) {
                            ii0Var.d = pointerInputChange5.m6098getIdJ3iCeTQ();
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                            i3 = 1;
                            dragGestureDetectorKt$verticalDrag$12.L$0 = kyVar2;
                            dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                            dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                            dragGestureDetectorKt$verticalDrag$12.L$4 = ii0Var;
                            dragGestureDetectorKt$verticalDrag$12.label = i3;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i3, null);
                            vnVar = vn.d;
                            if (awaitPointerEvent$default == vnVar) {
                                return vnVar;
                            }
                            DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$14 = dragGestureDetectorKt$verticalDrag$12;
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                            dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$14;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4);
                        if (orientation2 != null) {
                            intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                        } else {
                            intBitsToFloat = Offset.m4514getDistanceimpl(positionChangeIgnoreConsumed);
                        }
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    PointerInputChange pointerInputChange42 = pointerInputChange;
                    if (pointerInputChange42 == null) {
                        pointerInputChange42 = null;
                    }
                }
                if (pointerInputChange42 != null && !pointerInputChange42.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange42)) {
                        pointerInputChange3 = pointerInputChange42;
                    } else {
                        kyVar2.invoke(pointerInputChange42);
                        orientation = orientation2;
                        j2 = pointerInputChange42.m6098getIdJ3iCeTQ();
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                        i3 = 1;
                        ii0 ii0Var22 = new ii0();
                        ii0Var22.d = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        ii0Var = ii0Var22;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = kyVar2;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$4 = ii0Var;
                        dragGestureDetectorKt$verticalDrag$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i3, null);
                        vnVar = vn.d;
                        if (awaitPointerEvent$default == vnVar) {
                        }
                    }
                }
                return Boolean.valueOf(pointerInputChange3 == null);
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(hmVar);
        Object obj2 = dragGestureDetectorKt$verticalDrag$1.result;
        i = dragGestureDetectorKt$verticalDrag$1.label;
        int i32 = 1;
        PointerInputChange pointerInputChange32 = null;
        if (i != 0) {
        }
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Orientation orientation, ny nyVar, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$13(iyVar2, new ii0(), orientation, nyVar, myVar, iyVar, kyVar, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, ky kyVar, iy iyVar, iy iyVar2, my myVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = new qo(10);
        }
        ky kyVar2 = kyVar;
        if ((i & 2) != 0) {
            iyVar = new e1(24);
        }
        iy iyVar3 = iyVar;
        if ((i & 4) != 0) {
            iyVar2 = new e1(25);
        }
        return detectDragGestures(pointerInputScope, kyVar2, iyVar3, iyVar2, myVar, hmVar);
    }
}
