package androidx.compose.foundation.text.selection;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionGestures_androidKt {
    public static final boolean isMouseOrTouchPad(PointerEvent pointerEvent) {
        MotionEvent motionEvent;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (PointerType.m6174equalsimpl0(changes.get(i).m6104getTypeT8wyACA(), PointerType.Companion.m6179getMouseT8wyACA())) {
                i++;
            } else {
                MotionEvent motionEvent2 = pointerEvent.getMotionEvent();
                if ((motionEvent2 == null || !motionEvent2.isFromSource(8194)) && ((motionEvent = pointerEvent.getMotionEvent()) == null || !motionEvent.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
