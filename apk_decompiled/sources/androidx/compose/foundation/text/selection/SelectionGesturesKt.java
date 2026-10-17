package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import defpackage.bq;
import defpackage.f1;
import defpackage.fi0;
import defpackage.hm;
import defpackage.ii0;
import defpackage.ij0;
import defpackage.ky;
import defpackage.mb0;
import defpackage.my;
import defpackage.n60;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.yi;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitDown(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        SelectionGesturesKt$awaitDown$1 selectionGesturesKt$awaitDown$1;
        int i;
        vn vnVar;
        int size;
        int i2;
        if (hmVar instanceof SelectionGesturesKt$awaitDown$1) {
            selectionGesturesKt$awaitDown$1 = (SelectionGesturesKt$awaitDown$1) hmVar;
            int i3 = selectionGesturesKt$awaitDown$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$awaitDown$1.label = i3 - Integer.MIN_VALUE;
                Object obj = selectionGesturesKt$awaitDown$1.result;
                i = selectionGesturesKt$awaitDown$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Main;
                    selectionGesturesKt$awaitDown$1.L$0 = awaitPointerEventScope;
                    selectionGesturesKt$awaitDown$1.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, selectionGesturesKt$awaitDown$1);
                    vnVar = vn.d;
                    if (obj == vnVar) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent;
                }
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$awaitDown$1.L$0;
                p10.Q(obj);
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                i2 = 0;
                while (i2 < size) {
                    if (PointerEventKt.changedToDown(changes2.get(i2))) {
                        i2++;
                    } else {
                        PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                        selectionGesturesKt$awaitDown$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$awaitDown$1.label = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, selectionGesturesKt$awaitDown$1);
                        vnVar = vn.d;
                        if (obj == vnVar) {
                            return vnVar;
                        }
                        PointerEvent pointerEvent22 = (PointerEvent) obj;
                        List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                        size = changes22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent22;
            }
        }
        selectionGesturesKt$awaitDown$1 = new SelectionGesturesKt$awaitDown$1(hmVar);
        Object obj2 = selectionGesturesKt$awaitDown$1.result;
        i = selectionGesturesKt$awaitDown$1.label;
        if (i != 0) {
        }
    }

    public static final Object awaitSelectionGestures(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionGesturesKt$awaitSelectionGestures$2(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m4514getDistanceimpl(Offset.m4520minusMKHz9U(pointerInputChange.m6101getPositionF1C5BW0(), pointerInputChange2.m6101getPositionF1C5BW0())) < DragGestureDetectorKt.m437pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.m6104getTypeT8wyACA());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x012e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0031, B:13:0x0114, B:15:0x011c, B:17:0x0120, B:19:0x012e, B:21:0x013a, B:62:0x00e9), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:34:0x0049, B:35:0x008e, B:37:0x0096, B:39:0x00a4, B:41:0x00b0, B:52:0x0074), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mouseSelection(AwaitPointerEventScope awaitPointerEventScope, MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, PointerEvent pointerEvent, hm hmVar) {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        int i;
        SelectionAdjustment.Companion companion;
        SelectionAdjustment none;
        AwaitPointerEventScope awaitPointerEventScope2;
        fi0 fi0Var;
        int size;
        try {
            try {
                if (hmVar instanceof SelectionGesturesKt$mouseSelection$1) {
                    selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) hmVar;
                    int i2 = selectionGesturesKt$mouseSelection$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        selectionGesturesKt$mouseSelection$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = selectionGesturesKt$mouseSelection$1.result;
                        i = selectionGesturesKt$mouseSelection$1.label;
                        int i3 = 0;
                        if (i == 0) {
                            if (i == 1) {
                                mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.L$1;
                                awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.L$0;
                                p10.Q(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                    int size2 = changes.size();
                                    while (i3 < size2) {
                                        PointerInputChange pointerInputChange = changes.get(i3);
                                        if (PointerEventKt.changedToUp(pointerInputChange)) {
                                            pointerInputChange.consume();
                                        }
                                        i3++;
                                    }
                                }
                                return w01.a;
                            }
                            if (i != 2) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fi0Var = (fi0) selectionGesturesKt$mouseSelection$1.L$2;
                            mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.L$1;
                            awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.L$0;
                            p10.Q(obj);
                            if (((Boolean) obj).booleanValue() && fi0Var.d) {
                                List<PointerInputChange> changes2 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                size = changes2.size();
                                while (i3 < size) {
                                    PointerInputChange pointerInputChange2 = changes2.get(i3);
                                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                        pointerInputChange2.consume();
                                    }
                                    i3++;
                                }
                            }
                            mouseSelectionObserver.onDragDone();
                            return w01.a;
                        }
                        p10.Q(obj);
                        PointerInputChange pointerInputChange3 = pointerEvent.getChanges().get(0);
                        boolean m6074isShiftPressed5xRPYO0 = PointerEvent_androidKt.m6074isShiftPressed5xRPYO0(pointerEvent.m6033getKeyboardModifiersk7X9c1A());
                        int i4 = 18;
                        vn vnVar = vn.d;
                        if (m6074isShiftPressed5xRPYO0) {
                            if (mouseSelectionObserver.mo1413onExtendk4lQ0M(pointerInputChange3.m6101getPositionF1C5BW0())) {
                                pointerInputChange3.consume();
                                long m6098getIdJ3iCeTQ = pointerInputChange3.m6098getIdJ3iCeTQ();
                                mb0 mb0Var = new mb0(mouseSelectionObserver, i4);
                                selectionGesturesKt$mouseSelection$1.L$0 = awaitPointerEventScope;
                                selectionGesturesKt$mouseSelection$1.L$1 = mouseSelectionObserver;
                                selectionGesturesKt$mouseSelection$1.label = 1;
                                obj = DragGestureDetectorKt.m434dragjO51t88(awaitPointerEventScope, m6098getIdJ3iCeTQ, mb0Var, selectionGesturesKt$mouseSelection$1);
                                if (obj == vnVar) {
                                    return vnVar;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return w01.a;
                        }
                        int clicks = clicksCounter.getClicks();
                        if (clicks == 1) {
                            companion = SelectionAdjustment.Companion;
                            none = companion.getNone();
                        } else if (clicks != 2) {
                            companion = SelectionAdjustment.Companion;
                            none = companion.getParagraph();
                        } else {
                            companion = SelectionAdjustment.Companion;
                            none = companion.getWord();
                        }
                        if (mouseSelectionObserver.mo1415onStart9KIMszo(pointerInputChange3.m6101getPositionF1C5BW0(), none, clicksCounter.getClicks())) {
                            fi0 fi0Var2 = new fi0();
                            fi0Var2.d = !q10.b(none, companion.getNone());
                            long m6098getIdJ3iCeTQ2 = pointerInputChange3.m6098getIdJ3iCeTQ();
                            f1 f1Var = new f1(mouseSelectionObserver, none, fi0Var2, i4);
                            selectionGesturesKt$mouseSelection$1.L$0 = awaitPointerEventScope;
                            selectionGesturesKt$mouseSelection$1.L$1 = mouseSelectionObserver;
                            selectionGesturesKt$mouseSelection$1.L$2 = fi0Var2;
                            selectionGesturesKt$mouseSelection$1.label = 2;
                            obj = DragGestureDetectorKt.m434dragjO51t88(awaitPointerEventScope, m6098getIdJ3iCeTQ2, f1Var, selectionGesturesKt$mouseSelection$1);
                            if (obj != vnVar) {
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                fi0Var = fi0Var2;
                                if (((Boolean) obj).booleanValue()) {
                                    List<PointerInputChange> changes22 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                    size = changes22.size();
                                    while (i3 < size) {
                                    }
                                }
                                mouseSelectionObserver.onDragDone();
                            }
                            return vnVar;
                        }
                        return w01.a;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(hmVar);
        Object obj2 = selectionGesturesKt$mouseSelection$1.result;
        i = selectionGesturesKt$mouseSelection$1.label;
        int i32 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 mouseSelection$lambda$0(MouseSelectionObserver mouseSelectionObserver, PointerInputChange pointerInputChange) {
        if (mouseSelectionObserver.mo1414onExtendDragk4lQ0M(pointerInputChange.m6101getPositionF1C5BW0())) {
            pointerInputChange.consume();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 mouseSelection$lambda$2(MouseSelectionObserver mouseSelectionObserver, SelectionAdjustment selectionAdjustment, fi0 fi0Var, PointerInputChange pointerInputChange) {
        if (mouseSelectionObserver.mo1412onDrag3MmeM6k(pointerInputChange.m6101getPositionF1C5BW0(), selectionAdjustment)) {
            pointerInputChange.consume();
            fi0Var.d = true;
        }
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (r12 != r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object touchSelectionFirstPress(AwaitPointerEventScope awaitPointerEventScope, TextDragObserver textDragObserver, PointerEvent pointerEvent, hm hmVar) {
        SelectionGesturesKt$touchSelectionFirstPress$1 selectionGesturesKt$touchSelectionFirstPress$1;
        Object obj;
        int i;
        int i2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        try {
            if (hmVar instanceof SelectionGesturesKt$touchSelectionFirstPress$1) {
                selectionGesturesKt$touchSelectionFirstPress$1 = (SelectionGesturesKt$touchSelectionFirstPress$1) hmVar;
                int i3 = selectionGesturesKt$touchSelectionFirstPress$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelectionFirstPress$1.label = i3 - Integer.MIN_VALUE;
                    obj = selectionGesturesKt$touchSelectionFirstPress$1.result;
                    i = selectionGesturesKt$touchSelectionFirstPress$1.label;
                    i2 = 1;
                    vn vnVar = vn.d;
                    if (i != 0) {
                        p10.Q(obj);
                        pointerInputChange = (PointerInputChange) yi.p0(pointerEvent.getChanges());
                        long m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
                        selectionGesturesKt$touchSelectionFirstPress$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$2 = pointerInputChange;
                        selectionGesturesKt$touchSelectionFirstPress$1.label = 1;
                        obj = DragGestureDetectorKt.m424awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, m6098getIdJ3iCeTQ, selectionGesturesKt$touchSelectionFirstPress$1);
                        if (obj == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                            p10.Q(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                int size = changes.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    PointerInputChange pointerInputChange3 = changes.get(i4);
                                    if (PointerEventKt.changedToUp(pointerInputChange3)) {
                                        pointerInputChange3.consume();
                                    }
                                }
                                textDragObserver.onStop();
                            } else {
                                textDragObserver.onCancel();
                            }
                            return w01.a;
                        }
                        PointerInputChange pointerInputChange4 = (PointerInputChange) selectionGesturesKt$touchSelectionFirstPress$1.L$2;
                        textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                        p10.Q(obj);
                        pointerInputChange = pointerInputChange4;
                        awaitPointerEventScope = awaitPointerEventScope2;
                    }
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null && distanceIsTolerable(awaitPointerEventScope.getViewConfiguration(), pointerInputChange, pointerInputChange2)) {
                        textDragObserver.mo1172onStart3MmeM6k(pointerInputChange2.m6101getPositionF1C5BW0(), SelectionAdjustment.Companion.getWord());
                        long m6098getIdJ3iCeTQ2 = pointerInputChange2.m6098getIdJ3iCeTQ();
                        n60 n60Var = new n60(textDragObserver, i2);
                        selectionGesturesKt$touchSelectionFirstPress$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$2 = null;
                        selectionGesturesKt$touchSelectionFirstPress$1.label = 2;
                        obj = DragGestureDetectorKt.m434dragjO51t88(awaitPointerEventScope, m6098getIdJ3iCeTQ2, n60Var, selectionGesturesKt$touchSelectionFirstPress$1);
                    }
                    return w01.a;
                }
            }
            if (i != 0) {
            }
            pointerInputChange2 = (PointerInputChange) obj;
            if (pointerInputChange2 != null) {
                textDragObserver.mo1172onStart3MmeM6k(pointerInputChange2.m6101getPositionF1C5BW0(), SelectionAdjustment.Companion.getWord());
                long m6098getIdJ3iCeTQ22 = pointerInputChange2.m6098getIdJ3iCeTQ();
                n60 n60Var2 = new n60(textDragObserver, i2);
                selectionGesturesKt$touchSelectionFirstPress$1.L$0 = awaitPointerEventScope;
                selectionGesturesKt$touchSelectionFirstPress$1.L$1 = textDragObserver;
                selectionGesturesKt$touchSelectionFirstPress$1.L$2 = null;
                selectionGesturesKt$touchSelectionFirstPress$1.label = 2;
                obj = DragGestureDetectorKt.m434dragjO51t88(awaitPointerEventScope, m6098getIdJ3iCeTQ22, n60Var2, selectionGesturesKt$touchSelectionFirstPress$1);
            }
            return w01.a;
        } catch (CancellationException e) {
            textDragObserver.onCancel();
            throw e;
        }
        selectionGesturesKt$touchSelectionFirstPress$1 = new SelectionGesturesKt$touchSelectionFirstPress$1(hmVar);
        obj = selectionGesturesKt$touchSelectionFirstPress$1.result;
        i = selectionGesturesKt$touchSelectionFirstPress$1.label;
        i2 = 1;
        vn vnVar2 = vn.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 touchSelectionFirstPress$lambda$0(TextDragObserver textDragObserver, PointerInputChange pointerInputChange) {
        textDragObserver.mo1171onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange));
        pointerInputChange.consume();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00de, B:15:0x00e6, B:17:0x00f5, B:19:0x0101, B:21:0x0104, B:24:0x0107, B:27:0x010b, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:40:0x00b5, B:42:0x00b9, B:44:0x00bd, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x005c, B:60:0x0070, B:61:0x007d, B:64:0x0077), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00de, B:15:0x00e6, B:17:0x00f5, B:19:0x0101, B:21:0x0104, B:24:0x0107, B:27:0x010b, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:40:0x00b5, B:42:0x00b9, B:44:0x00bd, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x005c, B:60:0x0070, B:61:0x007d, B:64:0x0077), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00de, B:15:0x00e6, B:17:0x00f5, B:19:0x0101, B:21:0x0104, B:24:0x0107, B:27:0x010b, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:40:0x00b5, B:42:0x00b9, B:44:0x00bd, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x005c, B:60:0x0070, B:61:0x007d, B:64:0x0077), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object touchSelectionSubsequentPress(AwaitPointerEventScope awaitPointerEventScope, TextDragObserver textDragObserver, PointerEvent pointerEvent, int i, hm hmVar) {
        SelectionGesturesKt$touchSelectionSubsequentPress$1 selectionGesturesKt$touchSelectionSubsequentPress$1;
        int i2;
        long m6098getIdJ3iCeTQ;
        ii0 ii0Var;
        DownResolution downResolution;
        try {
            if (hmVar instanceof SelectionGesturesKt$touchSelectionSubsequentPress$1) {
                selectionGesturesKt$touchSelectionSubsequentPress$1 = (SelectionGesturesKt$touchSelectionSubsequentPress$1) hmVar;
                int i3 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelectionSubsequentPress$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
                    i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
                    w01 w01Var = w01.a;
                    int i4 = 2;
                    vn vnVar = vn.d;
                    if (i2 != 0) {
                        p10.Q(obj);
                        PointerInputChange pointerInputChange = (PointerInputChange) yi.p0(pointerEvent.getChanges());
                        m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
                        textDragObserver.mo1172onStart3MmeM6k(pointerInputChange.m6101getPositionF1C5BW0(), i > 2 ? SelectionAdjustment.Companion.getParagraph() : SelectionAdjustment.Companion.getWord());
                        ii0Var = new ii0();
                        ii0Var.d = Offset.Companion.m4531getUnspecifiedF1C5BW0();
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(m6098getIdJ3iCeTQ, ii0Var, null);
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = ii0Var;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.J$0 = m6098getIdJ3iCeTQ;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.label = 1;
                        obj = awaitPointerEventScope.withTimeoutOrNull(longPressTimeoutMillis, selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1, selectionGesturesKt$touchSelectionSubsequentPress$1);
                        if (obj == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                            p10.Q(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                textDragObserver.onCancel();
                                return w01Var;
                            }
                            List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                            int size = changes.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                PointerInputChange pointerInputChange2 = changes.get(i5);
                                if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                    pointerInputChange2.consume();
                                }
                            }
                            textDragObserver.onStop();
                            return w01Var;
                        }
                        long j = selectionGesturesKt$touchSelectionSubsequentPress$1.J$0;
                        ii0Var = (ii0) selectionGesturesKt$touchSelectionSubsequentPress$1.L$2;
                        TextDragObserver textDragObserver2 = (TextDragObserver) selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                        try {
                            p10.Q(obj);
                            m6098getIdJ3iCeTQ = j;
                            textDragObserver = textDragObserver2;
                            awaitPointerEventScope = awaitPointerEventScope2;
                        } catch (CancellationException e) {
                            e = e;
                            textDragObserver = textDragObserver2;
                            textDragObserver.onCancel();
                            throw e;
                        }
                    }
                    downResolution = (DownResolution) obj;
                    if (downResolution == null) {
                        downResolution = DownResolution.Timeout;
                    }
                    if (downResolution != DownResolution.Cancel) {
                        textDragObserver.onCancel();
                        return w01Var;
                    }
                    if (downResolution == DownResolution.Up) {
                        textDragObserver.onStop();
                        return w01Var;
                    }
                    if (downResolution == DownResolution.Drag) {
                        textDragObserver.mo1171onDragk4lQ0M(ii0Var.d);
                    }
                    n60 n60Var = new n60(textDragObserver, i4);
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = awaitPointerEventScope;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = textDragObserver;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = null;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.label = 2;
                    obj = DragGestureDetectorKt.m434dragjO51t88(awaitPointerEventScope, m6098getIdJ3iCeTQ, n60Var, selectionGesturesKt$touchSelectionSubsequentPress$1);
                }
            }
            if (i2 != 0) {
            }
            downResolution = (DownResolution) obj;
            if (downResolution == null) {
            }
            if (downResolution != DownResolution.Cancel) {
            }
        } catch (CancellationException e2) {
            e = e2;
        }
        selectionGesturesKt$touchSelectionSubsequentPress$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$1(hmVar);
        Object obj2 = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
        i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
        w01 w01Var2 = w01.a;
        int i42 = 2;
        vn vnVar2 = vn.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 touchSelectionSubsequentPress$lambda$0(TextDragObserver textDragObserver, PointerInputChange pointerInputChange) {
        textDragObserver.mo1171onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange));
        pointerInputChange.consume();
        return w01.a;
    }

    public static final Modifier updateSelectionTouchMode(Modifier modifier, final ky kyVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends ij0 implements my {
                final /* synthetic */ ky $updateTouchMode;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ky kyVar, hm hmVar) {
                    super(hmVar);
                    this.$updateTouchMode = kyVar;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:8:0x002c A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002a -> B:5:0x002d). Please report as a decompilation issue!!! */
                @Override // defpackage.mc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    /*
                        r3 = this;
                        int r0 = r3.label
                        r1 = 1
                        if (r0 == 0) goto L16
                        if (r0 != r1) goto Lf
                        java.lang.Object r0 = r3.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                        defpackage.p10.Q(r4)
                        goto L2d
                    Lf:
                        java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.o.f(r3)
                        r3 = 0
                        return r3
                    L16:
                        defpackage.p10.Q(r4)
                        java.lang.Object r4 = r3.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                        r0 = r4
                    L1e:
                        androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r3.L$0 = r0
                        r3.label = r1
                        java.lang.Object r4 = r0.awaitPointerEvent(r4, r3)
                        vn r2 = defpackage.vn.d
                        if (r4 != r2) goto L2d
                        return r2
                    L2d:
                        androidx.compose.ui.input.pointer.PointerEvent r4 = (androidx.compose.ui.input.pointer.PointerEvent) r4
                        ky r2 = r3.$updateTouchMode
                        boolean r4 = androidx.compose.foundation.text.selection.SelectionGestures_androidKt.isMouseOrTouchPad(r4)
                        r4 = r4 ^ r1
                        java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                        r2.invoke(r4)
                        goto L1e
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(ky.this, null), hmVar);
                return awaitPointerEventScope == vn.d ? awaitPointerEventScope : w01.a;
            }
        });
    }
}
