package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.hm;
import defpackage.ky;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RightClickGesturesKt {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstRightClickDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, defpackage.hm r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1 r0 = (androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1 r0 = new androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            defpackage.p10.Q(r9)
            goto L40
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.o.f(r8)
            return r2
        L30:
            defpackage.p10.Q(r9)
        L33:
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r2, r0, r3, r2)
            vn r1 = defpackage.vn.d
            if (r9 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            int r1 = r9.m6032getButtonsry648PA()
            boolean r1 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m6073isSecondaryPressedaHzCxE(r1)
            if (r1 == 0) goto L33
            java.util.List r1 = r9.getChanges()
            int r4 = r1.size()
            r5 = 0
            r6 = r5
        L56:
            if (r6 >= r4) goto L68
            java.lang.Object r7 = r1.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r7)
            if (r7 != 0) goto L65
            goto L33
        L65:
            int r6 = r6 + 1
            goto L56
        L68:
            java.util.List r8 = r9.getChanges()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt.awaitFirstRightClickDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, hm):java.lang.Object");
    }

    public static final Object onRightClickDown(PointerInputScope pointerInputScope, ky kyVar, hm hmVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new RightClickGesturesKt$onRightClickDown$2(kyVar, null), hmVar);
        return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
    }
}
