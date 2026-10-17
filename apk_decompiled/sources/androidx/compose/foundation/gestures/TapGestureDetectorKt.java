package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.LongPressResult;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import defpackage.er;
import defpackage.hm;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;
import defpackage.z10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    private static final ny NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:10:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, boolean r7, androidx.compose.ui.input.pointer.PointerEventPass r8, defpackage.hm r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 != r3) goto L34
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            defpackage.p10.Q(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4e
        L34:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.o.f(r6)
            return r2
        L3a:
            defpackage.p10.Q(r9)
        L3d:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r9 = r6.awaitPointerEvent(r8, r0)
            vn r1 = defpackage.vn.d
            if (r9 != r1) goto L4e
            return r1
        L4e:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            r1 = 2
            r4 = 0
            boolean r1 = isChangedToDown$default(r9, r7, r4, r1, r2)
            if (r1 == 0) goto L3d
            java.util.List r6 = r9.getChanges()
            java.lang.Object r6 = r6.get(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, hm):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, PointerEventPass pointerEventPass, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z, pointerEventPass, hmVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:10:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, boolean r6, androidx.compose.ui.input.pointer.PointerEventPass r7, defpackage.hm r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            defpackage.p10.Q(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4e
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.o.f(r5)
            r5 = 0
            return r5
        L3a:
            defpackage.p10.Q(r8)
        L3d:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r2
            java.lang.Object r8 = r5.awaitPointerEvent(r7, r0)
            vn r1 = defpackage.vn.d
            if (r8 != r1) goto L4e
            return r1
        L4e:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            boolean r1 = isChangedToDown(r8, r6, r2)
            if (r1 == 0) goto L3d
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, hm):java.lang.Object");
    }

    public static /* synthetic */ Object awaitPrimaryFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, PointerEventPass pointerEventPass, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPrimaryFirstDown(awaitPointerEventScope, z, pointerEventPass, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, hm hmVar) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[LOOP:0: B:11:0x004c->B:12:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object consumeUntilUp(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int i;
        vn vnVar;
        int size;
        int i2;
        int i3;
        int size2;
        if (hmVar instanceof TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (TapGestureDetectorKt$consumeUntilUp$1) hmVar;
            int i4 = tapGestureDetectorKt$consumeUntilUp$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.label = i4 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$consumeUntilUp$1.result;
                i = tapGestureDetectorKt$consumeUntilUp$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    tapGestureDetectorKt$consumeUntilUp$1.L$0 = awaitPointerEventScope;
                    tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                    obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                    vnVar = vn.d;
                    if (obj == vnVar) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    size2 = changes2.size();
                    while (i2 < size2) {
                    }
                    return w01.a;
                }
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) tapGestureDetectorKt$consumeUntilUp$1.L$0;
                p10.Q(obj);
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                size = changes3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    changes3.get(i3).consume();
                }
                List<PointerInputChange> changes22 = pointerEvent2.getChanges();
                size2 = changes22.size();
                while (i2 < size2) {
                    if (changes22.get(i2).getPressed()) {
                        tapGestureDetectorKt$consumeUntilUp$1.L$0 = awaitPointerEventScope;
                        tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                        vnVar = vn.d;
                        if (obj == vnVar) {
                            return vnVar;
                        }
                        PointerEvent pointerEvent22 = (PointerEvent) obj;
                        List<PointerInputChange> changes32 = pointerEvent22.getChanges();
                        size = changes32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        List<PointerInputChange> changes222 = pointerEvent22.getChanges();
                        size2 = changes222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return w01.a;
            }
        }
        tapGestureDetectorKt$consumeUntilUp$1 = new TapGestureDetectorKt$consumeUntilUp$1(hmVar);
        Object obj2 = tapGestureDetectorKt$consumeUntilUp$1.result;
        i = tapGestureDetectorKt$consumeUntilUp$1.label;
        if (i != 0) {
        }
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, ny nyVar, ky kyVar, hm hmVar) {
        Object n = p10.n(new TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, nyVar, kyVar, new PressGestureScopeImpl(pointerInputScope), null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, ny nyVar, ky kyVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            nyVar = NoPressGesture;
        }
        if ((i & 2) != 0) {
            kyVar = null;
        }
        return detectTapAndPress(pointerInputScope, nyVar, kyVar, hmVar);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, ky kyVar, ky kyVar2, ny nyVar, ky kyVar3, hm hmVar) {
        Object n = p10.n(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, nyVar, kyVar2, kyVar, kyVar3, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, ky kyVar, ky kyVar2, ny nyVar, ky kyVar3, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = null;
        }
        if ((i & 2) != 0) {
            kyVar2 = null;
        }
        if ((i & 4) != 0) {
            nyVar = NoPressGesture;
        }
        if ((i & 8) != 0) {
            kyVar3 = null;
        }
        return detectTapGestures(pointerInputScope, kyVar, kyVar2, nyVar, kyVar3, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn getCoroutineStartForCurrentDispatchBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled ? xn.g : xn.d;
    }

    public static final boolean getDetectTapGesturesEnableNewDispatchingBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled;
    }

    public static final boolean isChangedToDown(PointerEvent pointerEvent, boolean z, boolean z2) {
        if (z2) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!PointerType.m6174equalsimpl0(changes.get(i).m6104getTypeT8wyACA(), PointerType.Companion.m6179getMouseT8wyACA())) {
                        break;
                    }
                    i++;
                } else if (!PointerEvent_androidKt.m6071isPrimaryPressedaHzCxE(pointerEvent.m6032getButtonsry648PA())) {
                    return false;
                }
            }
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PointerInputChange pointerInputChange = changes2.get(i2);
            if (!(z ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean isChangedToDown$default(PointerEvent pointerEvent, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = TapGestureDetector_androidKt.firstDownRefersToPrimaryMouseButtonOnly();
        }
        return isChangedToDown(pointerEvent, z, z2);
    }

    private static final z10 launchAwaitingReset(un unVar, z10 z10Var, xn xnVar, my myVar) {
        return p01.t(unVar, null, xnVar, new TapGestureDetectorKt$launchAwaitingReset$1(z10Var, myVar, null), 1);
    }

    public static /* synthetic */ z10 launchAwaitingReset$default(un unVar, z10 z10Var, xn xnVar, my myVar, int i, Object obj) {
        if ((i & 2) != 0) {
            xnVar = getCoroutineStartForCurrentDispatchBehavior();
        }
        return launchAwaitingReset(unVar, z10Var, xnVar, myVar);
    }

    public static final void setDetectTapGesturesEnableNewDispatchingBehavior(boolean z) {
        ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForLongPress(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, hm hmVar) {
        TapGestureDetectorKt$waitForLongPress$1 tapGestureDetectorKt$waitForLongPress$1;
        int i;
        ji0 ji0Var;
        try {
            if (hmVar instanceof TapGestureDetectorKt$waitForLongPress$1) {
                tapGestureDetectorKt$waitForLongPress$1 = (TapGestureDetectorKt$waitForLongPress$1) hmVar;
                int i2 = tapGestureDetectorKt$waitForLongPress$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tapGestureDetectorKt$waitForLongPress$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = tapGestureDetectorKt$waitForLongPress$1.result;
                    i = tapGestureDetectorKt$waitForLongPress$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        ji0 ji0Var2 = new ji0();
                        ji0Var2.d = LongPressResult.Canceled.INSTANCE;
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        my tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(pointerEventPass, ji0Var2, null);
                        tapGestureDetectorKt$waitForLongPress$1.L$0 = ji0Var2;
                        tapGestureDetectorKt$waitForLongPress$1.label = 1;
                        Object withTimeout = awaitPointerEventScope.withTimeout(longPressTimeoutMillis, tapGestureDetectorKt$waitForLongPress$2, tapGestureDetectorKt$waitForLongPress$1);
                        Object obj2 = vn.d;
                        if (withTimeout == obj2) {
                            return obj2;
                        }
                        ji0Var = ji0Var2;
                    } else {
                        if (i != 1) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ji0Var = (ji0) tapGestureDetectorKt$waitForLongPress$1.L$0;
                        p10.Q(obj);
                    }
                    return ji0Var.d;
                }
            }
            if (i != 0) {
            }
            return ji0Var.d;
        } catch (PointerEventTimeoutCancellationException unused) {
            return LongPressResult.Success.INSTANCE;
        }
        tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(hmVar);
        Object obj3 = tapGestureDetectorKt$waitForLongPress$1.result;
        i = tapGestureDetectorKt$waitForLongPress$1.label;
    }

    public static /* synthetic */ Object waitForLongPress$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForLongPress(awaitPointerEventScope, pointerEventPass, hmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForUpOrCancellation(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, hm hmVar) {
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$2;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$22;
        PointerEventPass pointerEventPass2;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerEventPass pointerEventPass3;
        int size;
        int i2;
        Object awaitPointerEvent;
        if (hmVar instanceof TapGestureDetectorKt$waitForUpOrCancellation$2) {
            tapGestureDetectorKt$waitForUpOrCancellation$2 = (TapGestureDetectorKt$waitForUpOrCancellation$2) hmVar;
            int i3 = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$2.label = i3 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
                i = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                    pointerEventPass2 = pointerEventPass;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = awaitPointerEventScope2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                    awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                    if (awaitPointerEvent != vnVar) {
                    }
                    return vnVar;
                }
                if (i == 1) {
                    pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
                    p10.Q(obj);
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
                awaitPointerEventScope3 = (AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
                p10.Q(obj);
                PointerEventPass pointerEventPass4 = pointerEventPass3;
                tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                pointerEventPass2 = pointerEventPass4;
                List<PointerInputChange> changes2 = ((PointerEvent) obj).getChanges();
                int size2 = changes2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (changes2.get(i4).isConsumed()) {
                        return null;
                    }
                }
                awaitPointerEventScope2 = awaitPointerEventScope3;
                tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = awaitPointerEventScope2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                if (awaitPointerEvent != vnVar) {
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    obj = awaitPointerEvent;
                    TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$23 = tapGestureDetectorKt$waitForUpOrCancellation$22;
                    pointerEventPass3 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$2 = tapGestureDetectorKt$waitForUpOrCancellation$23;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!PointerEventKt.changedToUp(changes3.get(i2))) {
                            List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                            int size3 = changes4.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                PointerInputChange pointerInputChange = changes4.get(i5);
                                if (pointerInputChange.isConsumed() || PointerEventKt.m6037isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope3.mo5985getSizeYbymL2g(), awaitPointerEventScope3.mo5984getExtendedTouchPaddingNHjbRc())) {
                                    break;
                                }
                            }
                            PointerEventPass pointerEventPass5 = PointerEventPass.Final;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.L$0 = awaitPointerEventScope3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.L$1 = pointerEventPass3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.label = 2;
                            obj = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass5, tapGestureDetectorKt$waitForUpOrCancellation$2);
                        }
                    }
                    return pointerEvent2.getChanges().get(0);
                }
                return vnVar;
            }
        }
        tapGestureDetectorKt$waitForUpOrCancellation$2 = new TapGestureDetectorKt$waitForUpOrCancellation$2(hmVar);
        Object obj2 = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
        i = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, hmVar);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z, hmVar);
    }

    private static /* synthetic */ void getCoroutineStartForCurrentDispatchBehavior$annotations() {
    }

    @er
    public static /* synthetic */ void getDetectTapGesturesEnableNewDispatchingBehavior$annotations() {
    }

    @er
    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z, hm hmVar) {
        return awaitFirstDown(awaitPointerEventScope, z, PointerEventPass.Main, hmVar);
    }
}
