package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import defpackage.hm;
import defpackage.ii0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011f -> B:16:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0167 -> B:11:0x0169). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0188 -> B:16:0x0129). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2890awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, my myVar, hm hmVar) {
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        my myVar2;
        ii0 ii0Var;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f;
        float f2;
        ii0 ii0Var2;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i3;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i4;
        Object awaitPointerEvent$default;
        if (hmVar instanceof DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) hmVar;
            int i5 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i6 = 1;
                PointerEventPass pointerEventPass2 = null;
                vn vnVar = vn.d;
                if (i2 != 0) {
                    p10.Q(obj3);
                    if (m2892isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m2893pointerSlopE8SPZFQ = m2893pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    ii0 ii0Var3 = new ii0();
                    ii0Var3.d = j;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    myVar2 = myVar;
                    ii0Var = ii0Var3;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                    f = m2893pointerSlopE8SPZFQ;
                    f2 = 0.0f;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i6, pointerEventPass2);
                    if (awaitPointerEvent$default != vnVar) {
                    }
                    return vnVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f5 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                    float f6 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    ii0 ii0Var4 = (ii0) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    my myVar3 = (my) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    p10.Q(obj3);
                    f2 = f5;
                    pointerEventPass = null;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    ii0Var2 = ii0Var4;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                    f = f6;
                    myVar2 = myVar3;
                    if (!pointerInputChange2.isConsumed()) {
                        return pointerEventPass;
                    }
                    pointerEventPass2 = pointerEventPass;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                    ii0Var = ii0Var2;
                    i6 = 1;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = myVar2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ii0Var;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i6, pointerEventPass2);
                    if (awaitPointerEvent$default != vnVar) {
                        float f7 = f;
                        f4 = f2;
                        obj3 = awaitPointerEvent$default;
                        ii0Var2 = ii0Var;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
                        f3 = f7;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerEventPass = pointerEventPass2;
                                obj = pointerEventPass;
                                break;
                            }
                            obj = changes.get(i3);
                            pointerEventPass = pointerEventPass2;
                            i4 = i3;
                            if (PointerId.m6080equalsimpl0(((PointerInputChange) obj).m6098getIdJ3iCeTQ(), ii0Var2.d)) {
                                break;
                            }
                            i3 = i4 + 1;
                            pointerEventPass2 = pointerEventPass;
                        }
                        obj.getClass();
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange.isConsumed()) {
                            return pointerEventPass;
                        }
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size2) {
                                    obj2 = pointerEventPass;
                                    break;
                                }
                                obj2 = changes2.get(i7);
                                if (((PointerInputChange) obj2).getPressed()) {
                                    break;
                                }
                                i7++;
                            }
                            PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                            if (pointerInputChange3 == null) {
                                return pointerEventPass;
                            }
                            ii0Var2.d = pointerInputChange3.m6098getIdJ3iCeTQ();
                            pointerEventPass2 = pointerEventPass;
                            f2 = f4;
                            f = f3;
                        } else {
                            f2 = (Float.intBitsToFloat((int) (pointerInputChange.m6101getPositionF1C5BW0() >> 32)) - Float.intBitsToFloat((int) (pointerInputChange.m6102getPreviousPositionF1C5BW0() >> 32))) + f4;
                            if (Math.abs(f2) < f3) {
                                PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$0 = myVar2;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$2 = ii0Var2;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$3 = pointerInputChange;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.F$0 = f3;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.F$1 = f2;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.label = 2;
                                if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13) != vnVar) {
                                    f = f3;
                                    pointerInputChange2 = pointerInputChange;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                }
                            } else {
                                myVar2.invoke(pointerInputChange, new Float(f2 - (Math.signum(f2) * f3)));
                                if (pointerInputChange.isConsumed()) {
                                    return pointerInputChange;
                                }
                                pointerEventPass2 = pointerEventPass;
                                f = f3;
                                f2 = 0.0f;
                            }
                        }
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                        ii0Var = ii0Var2;
                        i6 = 1;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = myVar2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ii0Var;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i6;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i6, pointerEventPass2);
                        if (awaitPointerEvent$default != vnVar) {
                        }
                    }
                    return vnVar;
                }
                float f8 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                float f9 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                ii0 ii0Var5 = (ii0) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                my myVar4 = (my) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                p10.Q(obj3);
                DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                f4 = f8;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14;
                f3 = f9;
                myVar2 = myVar4;
                ii0Var2 = ii0Var5;
                PointerEvent pointerEvent2 = (PointerEvent) obj3;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                size = changes3.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                    }
                    i3 = i4 + 1;
                    pointerEventPass2 = pointerEventPass;
                }
                obj.getClass();
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange.isConsumed()) {
                }
            }
        }
        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(hmVar);
        Object obj32 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i62 = 1;
        PointerEventPass pointerEventPass22 = null;
        vn vnVar2 = vn.d;
        if (i2 != 0) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m2891awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, my myVar, ky kyVar, hm hmVar) {
        PointerEventPass pointerEventPass;
        Object obj;
        Object obj2;
        long j2 = j;
        PointerEventPass pointerEventPass2 = null;
        if (m2892isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float m2893pointerSlopE8SPZFQ = m2893pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        float f = 0.0f;
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass2, hmVar, 1, pointerEventPass2);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes.get(i3);
                pointerEventPass = pointerEventPass2;
                if (Boolean.valueOf(PointerId.m6080equalsimpl0(((PointerInputChange) obj).m6098getIdJ3iCeTQ(), j2)).booleanValue()) {
                    break;
                }
                i3++;
                pointerEventPass2 = pointerEventPass;
            }
            obj.getClass();
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange.isConsumed()) {
                return pointerEventPass;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i2 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes2.get(i2);
                    if (Boolean.valueOf(((PointerInputChange) obj2).getPressed()).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                if (pointerInputChange2 == null) {
                    return pointerEventPass;
                }
                j2 = pointerInputChange2.m6098getIdJ3iCeTQ();
            } else {
                f += ((Number) kyVar.invoke(Offset.m4505boximpl(pointerInputChange.m6101getPositionF1C5BW0()))).floatValue() - ((Number) kyVar.invoke(Offset.m4505boximpl(pointerInputChange.m6102getPreviousPositionF1C5BW0()))).floatValue();
                if (Math.abs(f) < m2893pointerSlopE8SPZFQ) {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, hmVar);
                    if (pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                } else {
                    myVar.invoke(pointerInputChange, Float.valueOf(f - (Math.signum(f) * m2893pointerSlopE8SPZFQ)));
                    if (pointerInputChange.isConsumed()) {
                        return pointerInputChange;
                    }
                    f = 0.0f;
                    pointerEventPass2 = pointerEventPass;
                }
            }
            pointerEventPass2 = pointerEventPass;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m2892isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
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
    public static final float m2893pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m6174equalsimpl0(i, PointerType.Companion.m6179getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }
}
