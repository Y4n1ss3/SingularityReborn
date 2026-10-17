package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.bu;
import defpackage.dq;
import defpackage.p01;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IndirectPointerInputDragCycleDetector {
    public static final int $stable = 8;
    private DragDetectionState.AwaitDown _awaitDownState;
    private DragDetectionState.AwaitGesturePickup _awaitGesturePickupState;
    private DragDetectionState.AwaitTouchSlop _awaitTouchSlopState;
    private DragDetectionState.Dragging _draggingState;
    private DragDetectionState currentDragState;
    private final DragGestureNode node;
    private long nodeOffset;
    private final OffsetSmoother offsetSmoother;
    private long previousPositionOnScreen;
    private TouchSlopDetector touchSlopDetector;
    private final IndirectPointerInputEventSmoother touchSmooth;
    private VelocityTracker velocityTracker;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DragDetectionState.AwaitDown.AwaitTouchSlop.values().length];
            try {
                iArr[DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IndirectPointerInputDragCycleDetector(DragGestureNode dragGestureNode) {
        this.node = dragGestureNode;
        Offset.Companion companion = Offset.Companion;
        this.previousPositionOnScreen = companion.m4531getUnspecifiedF1C5BW0();
        this.touchSmooth = new IndirectPointerInputEventSmoother();
        this.offsetSmoother = new OffsetSmoother();
        this.nodeOffset = companion.m4532getZeroF1C5BW0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final DragDetectionState.AwaitDown getAwaitDownState() {
        DragDetectionState.AwaitDown awaitDown = this._awaitDownState;
        if (awaitDown != null) {
            return awaitDown;
        }
        DragDetectionState.AwaitDown awaitDown2 = new DragDetectionState.AwaitDown(null, false, 3, 0 == true ? 1 : 0);
        this._awaitDownState = awaitDown2;
        return awaitDown2;
    }

    private final DragDetectionState.AwaitGesturePickup getAwaitGesturePickupState() {
        DragDetectionState.AwaitGesturePickup awaitGesturePickup = this._awaitGesturePickupState;
        if (awaitGesturePickup != null) {
            return awaitGesturePickup;
        }
        DragDetectionState.AwaitGesturePickup awaitGesturePickup2 = new DragDetectionState.AwaitGesturePickup(null, 0L, null, 7, null);
        this._awaitGesturePickupState = awaitGesturePickup2;
        return awaitGesturePickup2;
    }

    private final DragDetectionState.AwaitTouchSlop getAwaitTouchSlopState() {
        DragDetectionState.AwaitTouchSlop awaitTouchSlop = this._awaitTouchSlopState;
        if (awaitTouchSlop != null) {
            return awaitTouchSlop;
        }
        DragDetectionState.AwaitTouchSlop awaitTouchSlop2 = new DragDetectionState.AwaitTouchSlop(null, 0L, false, 7, null);
        this._awaitTouchSlopState = awaitTouchSlop2;
        return awaitTouchSlop2;
    }

    private final DragDetectionState.Dragging getDraggingState() {
        DragDetectionState.Dragging dragging = this._draggingState;
        if (dragging != null) {
            return dragging;
        }
        DragDetectionState.Dragging dragging2 = new DragDetectionState.Dragging(0L, 1, null);
        this._draggingState = dragging2;
        return dragging2;
    }

    private final void moveToAwaitDownState() {
        DragDetectionState.AwaitDown awaitDownState = getAwaitDownState();
        awaitDownState.setAwaitTouchSlop(DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized);
        awaitDownState.setConsumedOnInitial(false);
        this.currentDragState = awaitDownState;
    }

    /* renamed from: moveToAwaitGesturePickupState-rnUCldI, reason: not valid java name */
    private final void m455moveToAwaitGesturePickupStaternUCldI(IndirectPointerInputChange indirectPointerInputChange, long j, TouchSlopDetector touchSlopDetector) {
        DragDetectionState.AwaitGesturePickup awaitGesturePickupState = getAwaitGesturePickupState();
        awaitGesturePickupState.setInitialDown(indirectPointerInputChange);
        awaitGesturePickupState.m463setPointerId0FcD4WY(j);
        TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
        awaitGesturePickupState.setTouchSlopDetector(touchSlopDetector);
        this.currentDragState = awaitGesturePickupState;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U, reason: not valid java name */
    private final void m456moveToAwaitTouchSlopStateaWI9W7U(IndirectPointerInputChange indirectPointerInputChange, long j, long j2, boolean z) {
        DragDetectionState.AwaitTouchSlop awaitTouchSlopState = getAwaitTouchSlopState();
        awaitTouchSlopState.setInitialDown(indirectPointerInputChange);
        awaitTouchSlopState.m465setPointerId0FcD4WY(j);
        TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
        if (touchSlopDetector == null) {
            this.touchSlopDetector = new TouchSlopDetector(this.node.getOrientationLock(), 0L, 2, null);
        } else {
            if (touchSlopDetector != null) {
                touchSlopDetector.setOrientation(this.node.getOrientationLock());
            }
            TouchSlopDetector touchSlopDetector2 = this.touchSlopDetector;
            if (touchSlopDetector2 != null) {
                touchSlopDetector2.m567resetk4lQ0M(j2);
            }
        }
        awaitTouchSlopState.setVerifyConsumptionInFinalPass(z);
        this.currentDragState = awaitTouchSlopState;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U$default, reason: not valid java name */
    public static /* synthetic */ void m457moveToAwaitTouchSlopStateaWI9W7U$default(IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector, IndirectPointerInputChange indirectPointerInputChange, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = Offset.Companion.m4532getZeroF1C5BW0();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            z = false;
        }
        indirectPointerInputDragCycleDetector.m456moveToAwaitTouchSlopStateaWI9W7U(indirectPointerInputChange, j, j3, z);
    }

    /* renamed from: moveToDraggingState-0FcD4WY, reason: not valid java name */
    private final void m458moveToDraggingState0FcD4WY(long j) {
        DragDetectionState.Dragging draggingState = getDraggingState();
        draggingState.m467setPointerId0FcD4WY(j);
        this.currentDragState = draggingState;
    }

    private final void processAwaitGesturePickup(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitGesturePickup awaitGesturePickup) {
        boolean z;
        long m478primaryAxisPosition_bfSUIo;
        long m478primaryAxisPosition_bfSUIo2;
        if (pointerEventPass != PointerEventPass.Final) {
            return;
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = true;
                break;
            } else {
                if (changes.get(i2).isConsumed()) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
        int size2 = changes2.size();
        while (true) {
            if (i >= size2) {
                break;
            }
            if (!changes2.get(i).getPressed()) {
                i++;
            } else if (!indirectPointerEvent.getChanges().isEmpty()) {
                if (z) {
                    m478primaryAxisPosition_bfSUIo = IndirectPointerInputDragCycleDetectorKt.m478primaryAxisPosition_bfSUIo((IndirectPointerInputChange) yi.p0(indirectPointerEvent.getChanges()), this.node.getOrientationLock(), IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()));
                    IndirectPointerInputChange initialDown = awaitGesturePickup.getInitialDown();
                    initialDown.getClass();
                    m478primaryAxisPosition_bfSUIo2 = IndirectPointerInputDragCycleDetectorKt.m478primaryAxisPosition_bfSUIo(initialDown, this.node.getOrientationLock(), IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()));
                    long m4520minusMKHz9U = Offset.m4520minusMKHz9U(m478primaryAxisPosition_bfSUIo, m478primaryAxisPosition_bfSUIo2);
                    IndirectPointerInputChange initialDown2 = awaitGesturePickup.getInitialDown();
                    if (initialDown2 != null) {
                        m457moveToAwaitTouchSlopStateaWI9W7U$default(this, initialDown2, awaitGesturePickup.m462getPointerIdJ3iCeTQ(), m4520minusMKHz9U, false, 8, null);
                        return;
                    } else {
                        defpackage.o.m("AwaitGesturePickup.initialDown was not initialized.");
                        return;
                    }
                }
                return;
            }
        }
        moveToAwaitDownState();
    }

    private final void processAwaitTouchSlop(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitTouchSlop awaitTouchSlop) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        boolean changedToUpIgnoreConsumed;
        long m478primaryAxisPosition_bfSUIo;
        long m480primaryAxisPreviousPosition_bfSUIo;
        IndirectPointerInputChange indirectPointerInputChange3;
        if (pointerEventPass == PointerEventPass.Initial) {
            return;
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            indirectPointerInputChange = null;
            if (i >= size) {
                indirectPointerInputChange2 = null;
                break;
            }
            indirectPointerInputChange2 = changes.get(i);
            if (PointerId.m6080equalsimpl0(indirectPointerInputChange2.m5604getIdJ3iCeTQ(), awaitTouchSlop.m464getPointerIdJ3iCeTQ())) {
                break;
            } else {
                i++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange4 = indirectPointerInputChange2;
        if (indirectPointerInputChange4 == null) {
            List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
            int size2 = changes2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    indirectPointerInputChange3 = null;
                    break;
                }
                indirectPointerInputChange3 = changes2.get(i2);
                if (indirectPointerInputChange3.getPressed()) {
                    break;
                } else {
                    i2++;
                }
            }
            indirectPointerInputChange4 = indirectPointerInputChange3;
            if (indirectPointerInputChange4 == null) {
                moveToAwaitDownState();
                return;
            }
            awaitTouchSlop.m465setPointerId0FcD4WY(indirectPointerInputChange4.m5604getIdJ3iCeTQ());
        }
        IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange4;
        if (pointerEventPass == PointerEventPass.Main) {
            if (indirectPointerInputChange5.isConsumed()) {
                IndirectPointerInputChange initialDown = awaitTouchSlop.getInitialDown();
                if (initialDown == null) {
                    defpackage.o.m("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long m464getPointerIdJ3iCeTQ = awaitTouchSlop.m464getPointerIdJ3iCeTQ();
                TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
                if (touchSlopDetector == null) {
                    defpackage.o.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
                m455moveToAwaitGesturePickupStaternUCldI(initialDown, m464getPointerIdJ3iCeTQ, touchSlopDetector);
            } else {
                changedToUpIgnoreConsumed = IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(indirectPointerInputChange5);
                if (changedToUpIgnoreConsumed) {
                    List<IndirectPointerInputChange> changes3 = indirectPointerEvent.getChanges();
                    int size3 = changes3.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size3) {
                            break;
                        }
                        IndirectPointerInputChange indirectPointerInputChange6 = changes3.get(i3);
                        if (indirectPointerInputChange6.getPressed()) {
                            indirectPointerInputChange = indirectPointerInputChange6;
                            break;
                        }
                        i3++;
                    }
                    IndirectPointerInputChange indirectPointerInputChange7 = indirectPointerInputChange;
                    if (indirectPointerInputChange7 == null) {
                        moveToAwaitDownState();
                    } else {
                        awaitTouchSlop.m465setPointerId0FcD4WY(indirectPointerInputChange7.m5604getIdJ3iCeTQ());
                    }
                } else {
                    float m437pointerSlopE8SPZFQ = DragGestureDetectorKt.m437pointerSlopE8SPZFQ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, CompositionLocalsKt.getLocalViewConfiguration()), PointerType.Companion.m6181getTouchT8wyACA());
                    TouchSlopDetector requireTouchSlopDetector = requireTouchSlopDetector();
                    m478primaryAxisPosition_bfSUIo = IndirectPointerInputDragCycleDetectorKt.m478primaryAxisPosition_bfSUIo(indirectPointerInputChange5, this.node.getOrientationLock(), IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()));
                    m480primaryAxisPreviousPosition_bfSUIo = IndirectPointerInputDragCycleDetectorKt.m480primaryAxisPreviousPosition_bfSUIo(indirectPointerInputChange5, this.node.getOrientationLock(), IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()));
                    long m564addPositionsakrDWew = requireTouchSlopDetector.m564addPositionsakrDWew(m478primaryAxisPosition_bfSUIo, m480primaryAxisPreviousPosition_bfSUIo, m437pointerSlopE8SPZFQ);
                    if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                        indirectPointerInputChange5.consume();
                        IndirectPointerInputChange initialDown2 = awaitTouchSlop.getInitialDown();
                        initialDown2.getClass();
                        m460sendDragStart3f7A7Is(initialDown2, indirectPointerInputChange5, IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()), m564addPositionsakrDWew);
                        m459sendDragEventEu1f8Dk(indirectPointerInputChange5, IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()), m564addPositionsakrDWew);
                        m458moveToDraggingState0FcD4WY(indirectPointerInputChange5.m5604getIdJ3iCeTQ());
                    } else {
                        awaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                    }
                }
            }
        }
        if (pointerEventPass == PointerEventPass.Final && awaitTouchSlop.getVerifyConsumptionInFinalPass()) {
            if (!indirectPointerInputChange5.isConsumed()) {
                awaitTouchSlop.setVerifyConsumptionInFinalPass(false);
                return;
            }
            IndirectPointerInputChange initialDown3 = awaitTouchSlop.getInitialDown();
            if (initialDown3 == null) {
                defpackage.o.m("AwaitTouchSlop.initialDown was not initialized");
                return;
            }
            long m464getPointerIdJ3iCeTQ2 = awaitTouchSlop.m464getPointerIdJ3iCeTQ();
            TouchSlopDetector touchSlopDetector2 = this.touchSlopDetector;
            if (touchSlopDetector2 != null) {
                m455moveToAwaitGesturePickupStaternUCldI(initialDown3, m464getPointerIdJ3iCeTQ2, touchSlopDetector2);
            } else {
                defpackage.o.m("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
        }
    }

    private final void processDraggingState(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, DragDetectionState.Dragging dragging) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        boolean changedToUpIgnoreConsumed;
        long m475positionChangeIgnoreConsumed_bfSUIo;
        long m474positionChange_bfSUIo;
        boolean changedToUpIgnoreConsumed2;
        if (pointerEventPass != PointerEventPass.Main) {
            return;
        }
        long m466getPointerIdJ3iCeTQ = dragging.m466getPointerIdJ3iCeTQ();
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            indirectPointerInputChange = null;
            if (i2 >= size) {
                indirectPointerInputChange2 = null;
                break;
            }
            indirectPointerInputChange2 = changes.get(i2);
            if (PointerId.m6080equalsimpl0(indirectPointerInputChange2.m5604getIdJ3iCeTQ(), m466getPointerIdJ3iCeTQ)) {
                break;
            } else {
                i2++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange3 = indirectPointerInputChange2;
        if (indirectPointerInputChange3 == null) {
            return;
        }
        changedToUpIgnoreConsumed = IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(indirectPointerInputChange3);
        if (!changedToUpIgnoreConsumed) {
            if (indirectPointerInputChange3.isConsumed()) {
                sendDragCancelled();
                return;
            }
            m475positionChangeIgnoreConsumed_bfSUIo = IndirectPointerInputDragCycleDetectorKt.m475positionChangeIgnoreConsumed_bfSUIo(indirectPointerInputChange3, this.node.getOrientationLock(), IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()));
            if (Offset.m4514getDistanceimpl(m475positionChangeIgnoreConsumed_bfSUIo) == 0.0f) {
                return;
            }
            m474positionChange_bfSUIo = IndirectPointerInputDragCycleDetectorKt.m474positionChange_bfSUIo(indirectPointerInputChange3, this.node.getOrientationLock(), IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()));
            m459sendDragEventEu1f8Dk(indirectPointerInputChange3, IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()), m474positionChange_bfSUIo);
            indirectPointerInputChange3.consume();
            return;
        }
        List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
        int size2 = changes2.size();
        while (true) {
            if (i >= size2) {
                break;
            }
            IndirectPointerInputChange indirectPointerInputChange4 = changes2.get(i);
            if (indirectPointerInputChange4.getPressed()) {
                indirectPointerInputChange = indirectPointerInputChange4;
                break;
            }
            i++;
        }
        IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange;
        if (indirectPointerInputChange5 != null) {
            dragging.m467setPointerId0FcD4WY(indirectPointerInputChange5.m5604getIdJ3iCeTQ());
            return;
        }
        if (!indirectPointerInputChange3.isConsumed()) {
            changedToUpIgnoreConsumed2 = IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(indirectPointerInputChange3);
            if (changedToUpIgnoreConsumed2) {
                m461sendDragStoppedk92h6UU(indirectPointerInputChange3, IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()));
                moveToAwaitDownState();
            }
        }
        sendDragCancelled();
        moveToAwaitDownState();
    }

    private final void processInitialDownState(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitDown awaitDown) {
        boolean changedToDownIgnoreConsumed;
        if (indirectPointerEvent.getChanges().isEmpty()) {
            return;
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            changedToDownIgnoreConsumed = IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(changes.get(i));
            if (!changedToDownIgnoreConsumed) {
                return;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange = (IndirectPointerInputChange) yi.p0(indirectPointerEvent.getChanges());
        DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop = WhenMappings.$EnumSwitchMapping$0[awaitDown.getAwaitTouchSlop().ordinal()] == 1 ? !this.node.startDragImmediately() ? DragDetectionState.AwaitDown.AwaitTouchSlop.Yes : DragDetectionState.AwaitDown.AwaitTouchSlop.No : awaitDown.getAwaitTouchSlop();
        awaitDown.setAwaitTouchSlop(awaitTouchSlop);
        if (pointerEventPass == PointerEventPass.Initial && awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
            indirectPointerInputChange.consume();
            awaitDown.setConsumedOnInitial(true);
        }
        if (pointerEventPass == PointerEventPass.Main) {
            if (awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                m457moveToAwaitTouchSlopStateaWI9W7U$default(this, indirectPointerInputChange, indirectPointerInputChange.m5604getIdJ3iCeTQ(), 0L, false, 12, null);
                return;
            }
            if (awaitDown.getConsumedOnInitial()) {
                IndirectPointerEventPrimaryDirectionalMotionAxis m5583boximpl = IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw());
                Offset.Companion companion = Offset.Companion;
                m460sendDragStart3f7A7Is(indirectPointerInputChange, indirectPointerInputChange, m5583boximpl, companion.m4532getZeroF1C5BW0());
                m459sendDragEventEu1f8Dk(indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis.m5583boximpl(indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw()), companion.m4532getZeroF1C5BW0());
                m458moveToDraggingState0FcD4WY(indirectPointerInputChange.m5604getIdJ3iCeTQ());
            }
        }
    }

    private final TouchSlopDetector requireTouchSlopDetector() {
        TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
        if (touchSlopDetector != null) {
            return touchSlopDetector;
        }
        defpackage.o.m("Touch slop detector not initialized.");
        return null;
    }

    private final VelocityTracker requireVelocityTracker() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        defpackage.o.m("Velocity Tracker not initialized.");
        return null;
    }

    private final void sendDragCancelled() {
        this.node.onDragEvent(DragEvent.DragCancelled.INSTANCE);
    }

    /* renamed from: sendDragEvent-Eu1f8Dk, reason: not valid java name */
    private final void m459sendDragEventEu1f8Dk(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j) {
        long positionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(this.node));
        if (!Offset.m4513equalsimpl0(this.previousPositionOnScreen, Offset.Companion.m4531getUnspecifiedF1C5BW0()) && !Offset.m4513equalsimpl0(positionOnScreen, this.previousPositionOnScreen)) {
            this.nodeOffset = Offset.m4521plusMKHz9U(this.nodeOffset, Offset.m4520minusMKHz9U(positionOnScreen, this.previousPositionOnScreen));
        }
        this.previousPositionOnScreen = positionOnScreen;
        Orientation orientationLock = this.node.getOrientationLock();
        orientationLock.getClass();
        if (Math.abs(DraggableKt.m447toFloat3MmeM6k(j, orientationLock)) > 2.0f) {
            IndirectPointerInputDragCycleDetectorKt.m473addIndirectPointerInputChangeQf4Zb88(requireVelocityTracker(), indirectPointerInputChange, this.node.getOrientationLock(), indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
            this.node.onDragEvent(new DragEvent.DragDelta(this.offsetSmoother.m493smoothEventPositionMKHz9U(j), true, null));
        }
    }

    /* renamed from: sendDragStart-3f7A7Is, reason: not valid java name */
    private final void m460sendDragStart3f7A7Is(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerInputChange indirectPointerInputChange2, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j) {
        long m478primaryAxisPosition_bfSUIo;
        if (this.velocityTracker == null) {
            this.velocityTracker = new VelocityTracker();
        }
        this.nodeOffset = Offset.Companion.m4532getZeroF1C5BW0();
        IndirectPointerInputDragCycleDetectorKt.m473addIndirectPointerInputChangeQf4Zb88(requireVelocityTracker(), indirectPointerInputChange, this.node.getOrientationLock(), indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
        m478primaryAxisPosition_bfSUIo = IndirectPointerInputDragCycleDetectorKt.m478primaryAxisPosition_bfSUIo(indirectPointerInputChange2, this.node.getOrientationLock(), indirectPointerEventPrimaryDirectionalMotionAxis);
        long m4520minusMKHz9U = Offset.m4520minusMKHz9U(m478primaryAxisPosition_bfSUIo, j);
        if (((Boolean) this.node.getCanDrag().invoke(PointerType.m6171boximpl(PointerType.Companion.m6181getTouchT8wyACA()))).booleanValue()) {
            this.previousPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(this.node));
            this.node.onDragEvent(new DragEvent.DragStarted(m4520minusMKHz9U, null));
        }
        this.offsetSmoother.reset();
    }

    /* renamed from: sendDragStopped-k92h6UU, reason: not valid java name */
    private final void m461sendDragStoppedk92h6UU(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        IndirectPointerInputDragCycleDetectorKt.m473addIndirectPointerInputChangeQf4Zb88(requireVelocityTracker(), indirectPointerInputChange, this.node.getOrientationLock(), indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
        float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
        long m6209calculateVelocityAH228Gc = requireVelocityTracker().m6209calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        requireVelocityTracker().resetTracking();
        this.node.onDragEvent(new DragEvent.DragStopped(DraggableKt.m449toValidVelocityTH1AsA0(m6209calculateVelocityAH228Gc), true, null));
    }

    public final DragGestureNode getNode() {
        return this.node;
    }

    public final void processIndirectPointerInputEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        DragDetectionState dragDetectionState = this.currentDragState;
        if (dragDetectionState == null) {
            dragDetectionState = getAwaitDownState();
            this.currentDragState = dragDetectionState;
        }
        if (dragDetectionState == null) {
            defpackage.o.m("currentDragState should not be null");
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitDown) {
            processInitialDownState(indirectPointerEvent, pointerEventPass, (DragDetectionState.AwaitDown) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitTouchSlop) {
            processAwaitTouchSlop(indirectPointerEvent, pointerEventPass, (DragDetectionState.AwaitTouchSlop) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitGesturePickup) {
            processAwaitGesturePickup(indirectPointerEvent, pointerEventPass, (DragDetectionState.AwaitGesturePickup) dragDetectionState);
        } else if (dragDetectionState instanceof DragDetectionState.Dragging) {
            processDraggingState(indirectPointerEvent, pointerEventPass, (DragDetectionState.Dragging) dragDetectionState);
        } else {
            defpackage.o.n();
        }
    }

    public final void resetDragDetectionState() {
        moveToAwaitDownState();
        if (this.node.isListeningForEvents$foundation()) {
            sendDragCancelled();
        }
        this.velocityTracker = null;
        this.offsetSmoother.reset();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class DragDetectionState {
        public static final int $stable = 0;

        public /* synthetic */ DragDetectionState(dq dqVar) {
            this();
        }

        private DragDetectionState() {
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class AwaitDown extends DragDetectionState {
            public static final int $stable = 8;
            private AwaitTouchSlop awaitTouchSlop;
            private boolean consumedOnInitial;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            public static final class AwaitTouchSlop {
                private static final /* synthetic */ bu $ENTRIES;
                private static final /* synthetic */ AwaitTouchSlop[] $VALUES;
                public static final AwaitTouchSlop Yes = new AwaitTouchSlop("Yes", 0);
                public static final AwaitTouchSlop No = new AwaitTouchSlop("No", 1);
                public static final AwaitTouchSlop NotInitialized = new AwaitTouchSlop("NotInitialized", 2);

                private static final /* synthetic */ AwaitTouchSlop[] $values() {
                    return new AwaitTouchSlop[]{Yes, No, NotInitialized};
                }

                static {
                    AwaitTouchSlop[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = p01.k($values);
                }

                private AwaitTouchSlop(String str, int i) {
                }

                public static bu getEntries() {
                    return $ENTRIES;
                }

                public static AwaitTouchSlop valueOf(String str) {
                    return (AwaitTouchSlop) Enum.valueOf(AwaitTouchSlop.class, str);
                }

                public static AwaitTouchSlop[] values() {
                    return (AwaitTouchSlop[]) $VALUES.clone();
                }
            }

            public /* synthetic */ AwaitDown(AwaitTouchSlop awaitTouchSlop, boolean z, int i, dq dqVar) {
                this((i & 1) != 0 ? AwaitTouchSlop.NotInitialized : awaitTouchSlop, (i & 2) != 0 ? false : z);
            }

            public final AwaitTouchSlop getAwaitTouchSlop() {
                return this.awaitTouchSlop;
            }

            public final boolean getConsumedOnInitial() {
                return this.consumedOnInitial;
            }

            public final void setAwaitTouchSlop(AwaitTouchSlop awaitTouchSlop) {
                this.awaitTouchSlop = awaitTouchSlop;
            }

            public final void setConsumedOnInitial(boolean z) {
                this.consumedOnInitial = z;
            }

            public AwaitDown(AwaitTouchSlop awaitTouchSlop, boolean z) {
                super(null);
                this.awaitTouchSlop = awaitTouchSlop;
                this.consumedOnInitial = z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AwaitDown() {
                this(null, false, 3, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Dragging extends DragDetectionState {
            public static final int $stable = 8;
            private long pointerId;

            public /* synthetic */ Dragging(long j, int i, dq dqVar) {
                this((i & 1) != 0 ? PointerId.m6078constructorimpl(SnapshotId_jvmKt.SnapshotIdMax) : j, null);
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
            public final long m466getPointerIdJ3iCeTQ() {
                return this.pointerId;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m467setPointerId0FcD4WY(long j) {
                this.pointerId = j;
            }

            private Dragging(long j) {
                super(null);
                this.pointerId = j;
            }

            public /* synthetic */ Dragging(long j, dq dqVar) {
                this(j);
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class AwaitGesturePickup extends DragDetectionState {
            public static final int $stable = 8;
            private IndirectPointerInputChange initialDown;
            private long pointerId;
            private TouchSlopDetector touchSlopDetector;

            public /* synthetic */ AwaitGesturePickup(IndirectPointerInputChange indirectPointerInputChange, long j, TouchSlopDetector touchSlopDetector, int i, dq dqVar) {
                this((i & 1) != 0 ? null : indirectPointerInputChange, (i & 2) != 0 ? PointerId.m6078constructorimpl(SnapshotId_jvmKt.SnapshotIdMax) : j, (i & 4) != 0 ? null : touchSlopDetector, null);
            }

            public final IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
            public final long m462getPointerIdJ3iCeTQ() {
                return this.pointerId;
            }

            public final TouchSlopDetector getTouchSlopDetector() {
                return this.touchSlopDetector;
            }

            public final void setInitialDown(IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m463setPointerId0FcD4WY(long j) {
                this.pointerId = j;
            }

            public final void setTouchSlopDetector(TouchSlopDetector touchSlopDetector) {
                this.touchSlopDetector = touchSlopDetector;
            }

            private AwaitGesturePickup(IndirectPointerInputChange indirectPointerInputChange, long j, TouchSlopDetector touchSlopDetector) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j;
                this.touchSlopDetector = touchSlopDetector;
            }

            public /* synthetic */ AwaitGesturePickup(IndirectPointerInputChange indirectPointerInputChange, long j, TouchSlopDetector touchSlopDetector, dq dqVar) {
                this(indirectPointerInputChange, j, touchSlopDetector);
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class AwaitTouchSlop extends DragDetectionState {
            public static final int $stable = 8;
            private IndirectPointerInputChange initialDown;
            private long pointerId;
            private boolean verifyConsumptionInFinalPass;

            public /* synthetic */ AwaitTouchSlop(IndirectPointerInputChange indirectPointerInputChange, long j, boolean z, int i, dq dqVar) {
                this((i & 1) != 0 ? null : indirectPointerInputChange, (i & 2) != 0 ? PointerId.m6078constructorimpl(SnapshotId_jvmKt.SnapshotIdMax) : j, (i & 4) != 0 ? false : z, null);
            }

            public final IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
            public final long m464getPointerIdJ3iCeTQ() {
                return this.pointerId;
            }

            public final boolean getVerifyConsumptionInFinalPass() {
                return this.verifyConsumptionInFinalPass;
            }

            public final void setInitialDown(IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m465setPointerId0FcD4WY(long j) {
                this.pointerId = j;
            }

            public final void setVerifyConsumptionInFinalPass(boolean z) {
                this.verifyConsumptionInFinalPass = z;
            }

            private AwaitTouchSlop(IndirectPointerInputChange indirectPointerInputChange, long j, boolean z) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j;
                this.verifyConsumptionInFinalPass = z;
            }

            public /* synthetic */ AwaitTouchSlop(IndirectPointerInputChange indirectPointerInputChange, long j, boolean z, dq dqVar) {
                this(indirectPointerInputChange, j, z);
            }
        }
    }
}
