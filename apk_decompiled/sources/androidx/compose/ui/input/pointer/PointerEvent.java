package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.ComposeUiFlags;
import defpackage.r60;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final int classification;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent = getMotionEvent();
        this.classification = motionEvent != null ? motionEvent.getClassification() : 0;
        MotionEvent motionEvent2 = getMotionEvent();
        this.buttons = PointerButtons.m6025constructorimpl(motionEvent2 != null ? motionEvent2.getButtonState() : 0);
        MotionEvent motionEvent3 = getMotionEvent();
        this.keyboardModifiers = PointerKeyboardModifiers.m6165constructorimpl(motionEvent3 != null ? motionEvent3.getMetaState() : 0);
        this.type = m6031calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m6031calculatePointerEventType7fucELk() {
        MotionEvent motionEvent = getMotionEvent();
        if (motionEvent == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            while (r1 < size) {
                PointerInputChange pointerInputChange = list.get(r1);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m6052getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m6051getPress7fucELk();
                }
                r1++;
            }
            return PointerEventType.Companion.m6047getMove7fucELk();
        }
        boolean z = motionEvent.getClassification() == 3;
        r1 = motionEvent.getClassification() == 5 ? 1 : 0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            return (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6050getPanStart7fucELk() : (r1 == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6051getPress7fucELk() : PointerEventType.Companion.m6055getScaleStart7fucELk();
        }
        if (actionMasked == 1) {
            return (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6048getPanEnd7fucELk() : (r1 == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6052getRelease7fucELk() : PointerEventType.Companion.m6054getScaleEnd7fucELk();
        }
        if (actionMasked != 2) {
            switch (actionMasked) {
                case 5:
                    return (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6050getPanStart7fucELk() : (r1 == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6051getPress7fucELk() : PointerEventType.Companion.m6053getScaleChange7fucELk();
                case 6:
                    return (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6048getPanEnd7fucELk() : (r1 == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6052getRelease7fucELk() : PointerEventType.Companion.m6053getScaleChange7fucELk();
                case 7:
                    break;
                case 8:
                    return PointerEventType.Companion.m6056getScroll7fucELk();
                case 9:
                    return PointerEventType.Companion.m6045getEnter7fucELk();
                case 10:
                    return PointerEventType.Companion.m6046getExit7fucELk();
                default:
                    return PointerEventType.Companion.m6057getUnknown7fucELk();
            }
        }
        return (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6049getPanMove7fucELk() : (r1 == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m6047getMove7fucELk() : PointerEventType.Companion.m6053getScaleChange7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> list, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new PointerEvent(list, null);
        }
        if (motionEvent.equals(getMotionEvent())) {
            return new PointerEvent(list, this.internalPointerEvent);
        }
        r60 r60Var = new r60(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            PointerInputChange pointerInputChange = list.get(i);
            r60Var.c(pointerInputChange.m6098getIdJ3iCeTQ(), pointerInputChange);
            long m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long m6101getPositionF1C5BW0 = pointerInputChange.m6101getPositionF1C5BW0();
            long m6101getPositionF1C5BW02 = pointerInputChange.m6101getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int m6104getTypeT8wyACA = pointerInputChange.m6104getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i2 = i;
            arrayList.add(new PointerInputEventData(m6098getIdJ3iCeTQ, uptimeMillis, m6101getPositionF1C5BW0, m6101getPositionF1C5BW02, pressed, pressure, m6104getTypeT8wyACA, internalPointerEvent != null && internalPointerEvent.m6006activeHoverEvent0FcD4WY(pointerInputChange.m6098getIdJ3iCeTQ()), null, 0L, pointerInputChange.getScaleFactor(), pointerInputChange.m6100getPanOffsetF1C5BW0(), 0L, 4864, null));
            i = i2 + 1;
        }
        return new PointerEvent(list, new InternalPointerEvent(r60Var, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m6032getButtonsry648PA() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final int getClassification() {
        return this.classification;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m6033getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    public final MotionEvent getMotionEvent() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name */
    public final int m6034getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui, reason: not valid java name */
    public final void m6035setTypeEhbLWgg$ui(int i) {
        this.type = i;
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }
}
