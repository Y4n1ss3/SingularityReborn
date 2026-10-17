package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.ky;
import defpackage.p10;
import defpackage.qu0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitCtrlMouseScrollOrNull(AwaitPointerEventScope awaitPointerEventScope, ScrollConfig scrollConfig, hm hmVar) {
        TransformableKt$awaitCtrlMouseScrollOrNull$1 transformableKt$awaitCtrlMouseScrollOrNull$1;
        int i;
        PointerEvent pointerEvent;
        if (hmVar instanceof TransformableKt$awaitCtrlMouseScrollOrNull$1) {
            transformableKt$awaitCtrlMouseScrollOrNull$1 = (TransformableKt$awaitCtrlMouseScrollOrNull$1) hmVar;
            int i2 = transformableKt$awaitCtrlMouseScrollOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transformableKt$awaitCtrlMouseScrollOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transformableKt$awaitCtrlMouseScrollOrNull$1.result;
                i = transformableKt$awaitCtrlMouseScrollOrNull$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    transformableKt$awaitCtrlMouseScrollOrNull$1.L$0 = awaitPointerEventScope;
                    transformableKt$awaitCtrlMouseScrollOrNull$1.L$1 = scrollConfig;
                    transformableKt$awaitCtrlMouseScrollOrNull$1.label = 1;
                    obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, transformableKt$awaitCtrlMouseScrollOrNull$1, 1, null);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    scrollConfig = (ScrollConfig) transformableKt$awaitCtrlMouseScrollOrNull$1.L$1;
                    awaitPointerEventScope = (AwaitPointerEventScope) transformableKt$awaitCtrlMouseScrollOrNull$1.L$0;
                    p10.Q(obj);
                }
                pointerEvent = (PointerEvent) obj;
                if (PointerEvent_androidKt.m6065isCtrlPressed5xRPYO0(pointerEvent.m6033getKeyboardModifiersk7X9c1A()) || !PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), PointerEventType.Companion.m6056getScroll7fucELk())) {
                    return null;
                }
                long mo387calculateMouseWheelScroll8xgXZGE = scrollConfig.mo387calculateMouseWheelScroll8xgXZGE(awaitPointerEventScope, pointerEvent, awaitPointerEventScope.mo5985getSizeYbymL2g());
                if (Offset.m4513equalsimpl0(mo387calculateMouseWheelScroll8xgXZGE, Offset.Companion.m4532getZeroF1C5BW0())) {
                    return null;
                }
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                for (int i3 = 0; i3 < size; i3++) {
                    changes.get(i3).consume();
                }
                return Offset.m4505boximpl(mo387calculateMouseWheelScroll8xgXZGE);
            }
        }
        transformableKt$awaitCtrlMouseScrollOrNull$1 = new TransformableKt$awaitCtrlMouseScrollOrNull$1(hmVar);
        Object obj2 = transformableKt$awaitCtrlMouseScrollOrNull$1.result;
        i = transformableKt$awaitCtrlMouseScrollOrNull$1.label;
        if (i != 0) {
        }
        pointerEvent = (PointerEvent) obj2;
        if (PointerEvent_androidKt.m6065isCtrlPressed5xRPYO0(pointerEvent.m6033getKeyboardModifiersk7X9c1A())) {
        }
        return null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0046 -> B:10:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstCtrlMouseScroll(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, defpackage.hm r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            defpackage.p10.Q(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L49
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.o.f(r5)
            r5 = 0
            return r5
        L37:
            defpackage.p10.Q(r7)
        L3a:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r2
            java.lang.Object r7 = awaitCtrlMouseScrollOrNull(r5, r6, r0)
            vn r1 = defpackage.vn.d
            if (r7 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
            if (r7 == 0) goto L3a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitFirstCtrlMouseScroll(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, hm):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02ad, code lost:
    
        if (r4 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02af, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0203, code lost:
    
        if (((java.lang.Boolean) r9.invoke(androidx.compose.ui.geometry.Offset.m4505boximpl(r3))).booleanValue() != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b4 A[EDGE_INSN: B:99:0x02b4->B:98:0x02b4 BREAK  A[LOOP:0: B:14:0x029f->B:17:0x02b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0286 -> B:13:0x0292). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(AwaitPointerEventScope awaitPointerEventScope, boolean z, zg zgVar, ky kyVar, hm hmVar) {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        int i;
        vn vnVar;
        PointerEventPass pointerEventPass;
        zg zgVar2;
        ky kyVar2;
        boolean z2;
        long j;
        float f;
        int i2;
        int i3;
        float f2;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object obj;
        zg zgVar3;
        boolean z3;
        ky kyVar3;
        int size;
        int i4;
        int i5;
        int i6;
        int i7;
        float f4;
        float f5;
        Object awaitPointerEvent;
        float f6;
        int i8;
        PointerEvent pointerEvent;
        AwaitPointerEventScope awaitPointerEventScope3;
        boolean z4;
        float f7;
        float f8;
        float f9;
        float f10;
        long j2;
        int i9;
        int i10;
        long j3;
        int size2;
        int i11;
        int size3;
        int i12;
        int i13;
        int size4;
        int i14;
        if (hmVar instanceof TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (TransformableKt$detectZoom$1) hmVar;
            int i15 = transformableKt$detectZoom$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.label = i15 - Integer.MIN_VALUE;
                TransformableKt$detectZoom$1 transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                Object obj2 = transformableKt$detectZoom$12.result;
                i = transformableKt$detectZoom$12.label;
                vnVar = vn.d;
                if (i != 0) {
                    pointerEventPass = null;
                    p10.Q(obj2);
                    long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
                    float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                    transformableKt$detectZoom$12.L$0 = awaitPointerEventScope;
                    zgVar2 = zgVar;
                    transformableKt$detectZoom$12.L$1 = zgVar2;
                    kyVar2 = kyVar;
                    transformableKt$detectZoom$12.L$2 = kyVar2;
                    z2 = z;
                    transformableKt$detectZoom$12.Z$0 = z2;
                    transformableKt$detectZoom$12.F$0 = 0.0f;
                    transformableKt$detectZoom$12.F$1 = 1.0f;
                    transformableKt$detectZoom$12.J$0 = m4532getZeroF1C5BW0;
                    transformableKt$detectZoom$12.I$0 = 0;
                    transformableKt$detectZoom$12.F$2 = touchSlop;
                    transformableKt$detectZoom$12.I$1 = 0;
                    transformableKt$detectZoom$12.label = 1;
                    if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, transformableKt$detectZoom$12, 2, null) != vnVar) {
                        j = m4532getZeroF1C5BW0;
                        f = touchSlop;
                        i2 = 0;
                        i3 = 0;
                        f2 = 1.0f;
                        f3 = 0.0f;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                    }
                    return vnVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = transformableKt$detectZoom$12.I$2;
                        i8 = transformableKt$detectZoom$12.I$1;
                        f6 = transformableKt$detectZoom$12.F$2;
                        i7 = transformableKt$detectZoom$12.I$0;
                        j = transformableKt$detectZoom$12.J$0;
                        f5 = transformableKt$detectZoom$12.F$1;
                        f7 = transformableKt$detectZoom$12.F$0;
                        boolean z5 = transformableKt$detectZoom$12.Z$0;
                        PointerEvent pointerEvent2 = (PointerEvent) transformableKt$detectZoom$12.L$3;
                        ky kyVar4 = (ky) transformableKt$detectZoom$12.L$2;
                        zgVar3 = (zg) transformableKt$detectZoom$12.L$1;
                        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) transformableKt$detectZoom$12.L$0;
                        p10.Q(obj2);
                        z4 = z5;
                        kyVar2 = kyVar4;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        pointerEvent = pointerEvent2;
                        awaitPointerEvent = obj2;
                        List<PointerInputChange> changes = ((PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes.size();
                        i12 = i5;
                        i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                break;
                            }
                            if (changes.get(i13).isConsumed()) {
                                break;
                            }
                            i13++;
                        }
                        boolean z6 = false;
                        if (i12 == 0 && !z6) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            size4 = changes2.size();
                            for (i14 = 0; i14 < size4; i14++) {
                                if (changes2.get(i14).getPressed()) {
                                    i2 = i8;
                                    f = f6;
                                    i3 = i7;
                                    f2 = f5;
                                    f3 = f7;
                                    zgVar2 = zgVar3;
                                    z2 = z4;
                                    awaitPointerEventScope2 = awaitPointerEventScope3;
                                    pointerEventPass = null;
                                }
                            }
                        }
                        return w01.a;
                    }
                    i2 = transformableKt$detectZoom$12.I$1;
                    f = transformableKt$detectZoom$12.F$2;
                    i3 = transformableKt$detectZoom$12.I$0;
                    j = transformableKt$detectZoom$12.J$0;
                    f2 = transformableKt$detectZoom$12.F$1;
                    f3 = transformableKt$detectZoom$12.F$0;
                    boolean z7 = transformableKt$detectZoom$12.Z$0;
                    ky kyVar5 = (ky) transformableKt$detectZoom$12.L$2;
                    zgVar3 = (zg) transformableKt$detectZoom$12.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) transformableKt$detectZoom$12.L$0;
                    p10.Q(obj2);
                    z3 = z7;
                    kyVar3 = kyVar5;
                    obj = obj2;
                    PointerEvent pointerEvent3 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent3.getChanges();
                    size = changes3.size();
                    int i16 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i5 = 0;
                            break;
                        }
                        if (changes3.get(i4).isConsumed()) {
                            i5 = 1;
                            break;
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                        float calculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent3);
                        float calculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent3);
                        int i17 = i3;
                        float f11 = f2;
                        long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent3);
                        if (i17 == 0) {
                            f9 = f11 * calculateZoom;
                            f3 += calculateRotation;
                            j = Offset.m4521plusMKHz9U(j, calculatePan);
                            f8 = calculateRotation;
                            float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent3, false);
                            float abs = Math.abs(1.0f - f9) * calculateCentroidSize;
                            float abs2 = Math.abs(((3.1415927f * f3) * calculateCentroidSize) / 180.0f);
                            float m4514getDistanceimpl = Offset.m4514getDistanceimpl(j);
                            if (abs > f || abs2 > f || (m4514getDistanceimpl > f && ((Boolean) kyVar3.invoke(Offset.m4505boximpl(calculatePan))).booleanValue())) {
                                int i18 = (!z3 || abs2 >= f) ? 0 : 1;
                                zgVar3.m(TransformEvent.TransformStarted.INSTANCE);
                                i6 = i18;
                                f10 = f3;
                                j2 = j;
                                i9 = 1;
                                if (i9 == 0) {
                                    i10 = i9;
                                    j3 = j2;
                                } else {
                                    float f12 = i6 != 0 ? 0.0f : f8;
                                    if (f12 != 0.0f) {
                                        i10 = i9;
                                        j3 = j2;
                                    } else if (calculateZoom == 1.0f) {
                                        i10 = i9;
                                        j3 = j2;
                                        if (!Offset.m4513equalsimpl0(calculatePan, Offset.Companion.m4532getZeroF1C5BW0())) {
                                        }
                                        List<PointerInputChange> changes4 = pointerEvent3.getChanges();
                                        size2 = changes4.size();
                                        for (i11 = 0; i11 < size2; i11++) {
                                            PointerInputChange pointerInputChange = changes4.get(i11);
                                            if (PointerEventKt.positionChanged(pointerInputChange)) {
                                                pointerInputChange.consume();
                                            }
                                        }
                                    } else {
                                        i10 = i9;
                                        j3 = j2;
                                    }
                                    zgVar3.m(new TransformEvent.TransformDelta(calculateZoom, calculatePan, f12, null));
                                    List<PointerInputChange> changes42 = pointerEvent3.getChanges();
                                    size2 = changes42.size();
                                    while (i11 < size2) {
                                    }
                                }
                                i7 = i10;
                                j = j3;
                                f5 = f9;
                                f4 = f10;
                            } else {
                                i6 = i16;
                            }
                        } else {
                            f8 = calculateRotation;
                            i6 = i16;
                            f9 = f11;
                        }
                        f10 = f3;
                        j2 = j;
                        i9 = i17;
                        if (i9 == 0) {
                        }
                        i7 = i10;
                        j = j3;
                        f5 = f9;
                        f4 = f10;
                    } else {
                        float f13 = f2;
                        zgVar3.m(TransformEvent.TransformStopped.INSTANCE);
                        i6 = i16;
                        i7 = i3;
                        f4 = f3;
                        f5 = f13;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                    transformableKt$detectZoom$12.L$0 = awaitPointerEventScope2;
                    transformableKt$detectZoom$12.L$1 = zgVar3;
                    transformableKt$detectZoom$12.L$2 = kyVar3;
                    transformableKt$detectZoom$12.L$3 = pointerEvent3;
                    transformableKt$detectZoom$12.Z$0 = z3;
                    transformableKt$detectZoom$12.F$0 = f4;
                    transformableKt$detectZoom$12.F$1 = f5;
                    transformableKt$detectZoom$12.J$0 = j;
                    transformableKt$detectZoom$12.I$0 = i7;
                    transformableKt$detectZoom$12.F$2 = f;
                    transformableKt$detectZoom$12.I$1 = i6;
                    transformableKt$detectZoom$12.I$2 = i5;
                    int i19 = i6;
                    transformableKt$detectZoom$12.label = 3;
                    awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, transformableKt$detectZoom$12);
                    if (awaitPointerEvent != vnVar) {
                        float f14 = f4;
                        f6 = f;
                        i8 = i19;
                        pointerEvent = pointerEvent3;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        z4 = z3;
                        kyVar2 = kyVar3;
                        f7 = f14;
                        List<PointerInputChange> changes5 = ((PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes5.size();
                        i12 = i5;
                        i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                            }
                            i13++;
                        }
                        boolean z62 = false;
                        if (i12 == 0) {
                            List<PointerInputChange> changes22 = pointerEvent.getChanges();
                            size4 = changes22.size();
                            while (i14 < size4) {
                            }
                        }
                        return w01.a;
                    }
                    return vnVar;
                }
                pointerEventPass = null;
                i2 = transformableKt$detectZoom$12.I$1;
                f = transformableKt$detectZoom$12.F$2;
                i3 = transformableKt$detectZoom$12.I$0;
                j = transformableKt$detectZoom$12.J$0;
                f2 = transformableKt$detectZoom$12.F$1;
                f3 = transformableKt$detectZoom$12.F$0;
                boolean z8 = transformableKt$detectZoom$12.Z$0;
                kyVar2 = (ky) transformableKt$detectZoom$12.L$2;
                zg zgVar4 = (zg) transformableKt$detectZoom$12.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) transformableKt$detectZoom$12.L$0;
                p10.Q(obj2);
                z2 = z8;
                zgVar2 = zgVar4;
                transformableKt$detectZoom$12.L$0 = awaitPointerEventScope2;
                transformableKt$detectZoom$12.L$1 = zgVar2;
                transformableKt$detectZoom$12.L$2 = kyVar2;
                PointerEventPass pointerEventPass3 = pointerEventPass;
                transformableKt$detectZoom$12.L$3 = pointerEventPass3;
                transformableKt$detectZoom$12.Z$0 = z2;
                transformableKt$detectZoom$12.F$0 = f3;
                transformableKt$detectZoom$12.F$1 = f2;
                transformableKt$detectZoom$12.J$0 = j;
                transformableKt$detectZoom$12.I$0 = i3;
                transformableKt$detectZoom$12.F$2 = f;
                transformableKt$detectZoom$12.I$1 = i2;
                transformableKt$detectZoom$12.label = 2;
                obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass3, transformableKt$detectZoom$12, 1, pointerEventPass3);
                if (obj != vnVar) {
                    boolean z9 = z2;
                    zgVar3 = zgVar2;
                    kyVar3 = kyVar2;
                    z3 = z9;
                    PointerEvent pointerEvent32 = (PointerEvent) obj;
                    List<PointerInputChange> changes32 = pointerEvent32.getChanges();
                    size = changes32.size();
                    int i162 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                    }
                    PointerEventPass pointerEventPass22 = PointerEventPass.Final;
                    transformableKt$detectZoom$12.L$0 = awaitPointerEventScope2;
                    transformableKt$detectZoom$12.L$1 = zgVar3;
                    transformableKt$detectZoom$12.L$2 = kyVar3;
                    transformableKt$detectZoom$12.L$3 = pointerEvent32;
                    transformableKt$detectZoom$12.Z$0 = z3;
                    transformableKt$detectZoom$12.F$0 = f4;
                    transformableKt$detectZoom$12.F$1 = f5;
                    transformableKt$detectZoom$12.J$0 = j;
                    transformableKt$detectZoom$12.I$0 = i7;
                    transformableKt$detectZoom$12.F$2 = f;
                    transformableKt$detectZoom$12.I$1 = i6;
                    transformableKt$detectZoom$12.I$2 = i5;
                    int i192 = i6;
                    transformableKt$detectZoom$12.label = 3;
                    awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass22, transformableKt$detectZoom$12);
                    if (awaitPointerEvent != vnVar) {
                    }
                }
                return vnVar;
            }
        }
        transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(hmVar);
        TransformableKt$detectZoom$1 transformableKt$detectZoom$122 = transformableKt$detectZoom$1;
        Object obj22 = transformableKt$detectZoom$122.result;
        i = transformableKt$detectZoom$122.label;
        vnVar = vn.d;
        if (i != 0) {
        }
        transformableKt$detectZoom$122.L$0 = awaitPointerEventScope2;
        transformableKt$detectZoom$122.L$1 = zgVar2;
        transformableKt$detectZoom$122.L$2 = kyVar2;
        PointerEventPass pointerEventPass32 = pointerEventPass;
        transformableKt$detectZoom$122.L$3 = pointerEventPass32;
        transformableKt$detectZoom$122.Z$0 = z2;
        transformableKt$detectZoom$122.F$0 = f3;
        transformableKt$detectZoom$122.F$1 = f2;
        transformableKt$detectZoom$122.J$0 = j;
        transformableKt$detectZoom$122.I$0 = i3;
        transformableKt$detectZoom$122.F$2 = f;
        transformableKt$detectZoom$122.I$1 = i2;
        transformableKt$detectZoom$122.label = 2;
        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass32, transformableKt$detectZoom$122, 1, pointerEventPass32);
        if (obj != vnVar) {
        }
        return vnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectZoomByCtrlMouseScroll(PointerInputScope pointerInputScope, zg zgVar, ScrollConfig scrollConfig, hm hmVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new TransformableKt$detectZoomByCtrlMouseScroll$2(hmVar.getContext(), scrollConfig, zgVar, null), hmVar);
        return awaitPointerEventScope == vn.d ? awaitPointerEventScope : w01.a;
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new qu0(12), z, z2);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean transformable$lambda$0(Offset offset) {
        return true;
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, ky kyVar, boolean z, boolean z2) {
        return modifier.then(new TransformableElement(transformableState, kyVar, z, z2));
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, ky kyVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, kyVar, z, z2);
    }
}
