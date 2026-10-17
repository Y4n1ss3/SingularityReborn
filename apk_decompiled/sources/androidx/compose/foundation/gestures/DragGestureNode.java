package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.DragDetectionState;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.d41;
import defpackage.hm;
import defpackage.ky;
import defpackage.lu0;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.yi;
import defpackage.zg;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode, IndirectPointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private DragDetectionState.AwaitDown _awaitDownState;
    private DragDetectionState.AwaitGesturePickup _awaitGesturePickupState;
    private DragDetectionState.AwaitTouchSlop _awaitTouchSlopState;
    private final ky _canDrag = new defpackage.h(this, 17);
    private DragDetectionState.Dragging _draggingState;
    private ky canDrag;
    private zg channel;
    private DragDetectionState currentDragState;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector;
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private boolean isListeningForPointerInputEvents;
    private long nodeOffset;
    private Orientation orientationLock;
    private SuspendingPointerInputModifierNode pointerInputNode;
    private long previousPositionOnScreen;
    private TouchSlopDetector touchSlopDetector;
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

    public DragGestureNode(ky kyVar, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = kyVar;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        Offset.Companion companion = Offset.Companion;
        this.previousPositionOnScreen = companion.m4531getUnspecifiedF1C5BW0();
        this.nodeOffset = companion.m4532getZeroF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _canDrag$lambda$0(DragGestureNode dragGestureNode, PointerType pointerType) {
        return ((Boolean) dragGestureNode.canDrag.invoke(pointerType)).booleanValue();
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

    private final SuspendingPointerInputModifierNode initializePointerInputNode() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new DragGestureNode$initializePointerInputNode$1(this));
    }

    private final void moveToAwaitDownState() {
        DragDetectionState.AwaitDown awaitDownState = getAwaitDownState();
        awaitDownState.setAwaitTouchSlop(DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized);
        awaitDownState.setConsumedOnInitial(false);
        this.currentDragState = awaitDownState;
    }

    /* renamed from: moveToAwaitGesturePickupState-rnUCldI, reason: not valid java name */
    private final void m439moveToAwaitGesturePickupStaternUCldI(PointerInputChange pointerInputChange, long j, TouchSlopDetector touchSlopDetector) {
        DragDetectionState.AwaitGesturePickup awaitGesturePickupState = getAwaitGesturePickupState();
        awaitGesturePickupState.setInitialDown(pointerInputChange);
        awaitGesturePickupState.m410setPointerId0FcD4WY(j);
        TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
        awaitGesturePickupState.setTouchSlopDetector(touchSlopDetector);
        this.currentDragState = awaitGesturePickupState;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U, reason: not valid java name */
    private final void m440moveToAwaitTouchSlopStateaWI9W7U(PointerInputChange pointerInputChange, long j, long j2, boolean z) {
        DragDetectionState.AwaitTouchSlop awaitTouchSlopState = getAwaitTouchSlopState();
        awaitTouchSlopState.setInitialDown(pointerInputChange);
        awaitTouchSlopState.m412setPointerId0FcD4WY(j);
        TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
        if (touchSlopDetector == null) {
            this.touchSlopDetector = new TouchSlopDetector(this.orientationLock, 0L, 2, null);
        } else {
            if (touchSlopDetector != null) {
                touchSlopDetector.setOrientation(this.orientationLock);
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
    public static /* synthetic */ void m441moveToAwaitTouchSlopStateaWI9W7U$default(DragGestureNode dragGestureNode, PointerInputChange pointerInputChange, long j, long j2, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: moveToAwaitTouchSlopState-aWI9W7U");
            return;
        }
        if ((i & 4) != 0) {
            j2 = Offset.Companion.m4532getZeroF1C5BW0();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            z = false;
        }
        dragGestureNode.m440moveToAwaitTouchSlopStateaWI9W7U(pointerInputChange, j, j3, z);
    }

    /* renamed from: moveToDraggingState-0FcD4WY, reason: not valid java name */
    private final void m442moveToDraggingState0FcD4WY(long j) {
        DragDetectionState.Dragging draggingState = getDraggingState();
        draggingState.m414setPointerId0FcD4WY(j);
        this.currentDragState = draggingState;
    }

    private final void processAwaitGesturePickup(PointerEvent pointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitGesturePickup awaitGesturePickup) {
        boolean z;
        if (pointerEventPass != PointerEventPass.Final) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
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
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        while (true) {
            if (i >= size2) {
                break;
            }
            if (!changes2.get(i).getPressed()) {
                i++;
            } else if (!pointerEvent.getChanges().isEmpty()) {
                if (z) {
                    long m6101getPositionF1C5BW0 = ((PointerInputChange) yi.p0(pointerEvent.getChanges())).m6101getPositionF1C5BW0();
                    PointerInputChange initialDown = awaitGesturePickup.getInitialDown();
                    initialDown.getClass();
                    long m4520minusMKHz9U = Offset.m4520minusMKHz9U(m6101getPositionF1C5BW0, initialDown.m6101getPositionF1C5BW0());
                    PointerInputChange initialDown2 = awaitGesturePickup.getInitialDown();
                    if (initialDown2 != null) {
                        m441moveToAwaitTouchSlopStateaWI9W7U$default(this, initialDown2, awaitGesturePickup.m409getPointerIdJ3iCeTQ(), m4520minusMKHz9U, false, 8, null);
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

    private final void processAwaitTouchSlop(PointerEvent pointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitTouchSlop awaitTouchSlop) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (pointerEventPass == PointerEventPass.Initial) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            pointerInputChange = null;
            if (i >= size) {
                pointerInputChange2 = null;
                break;
            }
            pointerInputChange2 = changes.get(i);
            if (PointerId.m6080equalsimpl0(pointerInputChange2.m6098getIdJ3iCeTQ(), awaitTouchSlop.m411getPointerIdJ3iCeTQ())) {
                break;
            } else {
                i++;
            }
        }
        PointerInputChange pointerInputChange4 = pointerInputChange2;
        if (pointerInputChange4 == null) {
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    pointerInputChange3 = null;
                    break;
                }
                pointerInputChange3 = changes2.get(i2);
                if (pointerInputChange3.getPressed()) {
                    break;
                } else {
                    i2++;
                }
            }
            pointerInputChange4 = pointerInputChange3;
            if (pointerInputChange4 == null) {
                moveToAwaitDownState();
                return;
            }
            awaitTouchSlop.m412setPointerId0FcD4WY(pointerInputChange4.m6098getIdJ3iCeTQ());
        }
        if (pointerEventPass == PointerEventPass.Main) {
            if (pointerInputChange4.isConsumed()) {
                PointerInputChange initialDown = awaitTouchSlop.getInitialDown();
                if (initialDown == null) {
                    defpackage.o.m("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long m411getPointerIdJ3iCeTQ = awaitTouchSlop.m411getPointerIdJ3iCeTQ();
                TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
                if (touchSlopDetector == null) {
                    defpackage.o.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
                m439moveToAwaitGesturePickupStaternUCldI(initialDown, m411getPointerIdJ3iCeTQ, touchSlopDetector);
            } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                List<PointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        break;
                    }
                    PointerInputChange pointerInputChange5 = changes3.get(i3);
                    if (pointerInputChange5.getPressed()) {
                        pointerInputChange = pointerInputChange5;
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange6 = pointerInputChange;
                if (pointerInputChange6 == null) {
                    moveToAwaitDownState();
                } else {
                    awaitTouchSlop.m412setPointerId0FcD4WY(pointerInputChange6.m6098getIdJ3iCeTQ());
                }
            } else {
                long m564addPositionsakrDWew = requireTouchSlopDetector().m564addPositionsakrDWew(pointerInputChange4.m6101getPositionF1C5BW0(), pointerInputChange4.m6102getPreviousPositionF1C5BW0(), DragGestureDetectorKt.m437pointerSlopE8SPZFQ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration()), pointerInputChange4.m6104getTypeT8wyACA()));
                if ((InlineClassHelperKt.DualUnsignedFloatMask & m564addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    pointerInputChange4.consume();
                    PointerInputChange initialDown2 = awaitTouchSlop.getInitialDown();
                    initialDown2.getClass();
                    m444sendDragStart0AR0LA0(initialDown2, pointerInputChange4, m564addPositionsakrDWew);
                    m443sendDragEventUv8p0NA(pointerInputChange4, m564addPositionsakrDWew);
                    m442moveToDraggingState0FcD4WY(pointerInputChange4.m6098getIdJ3iCeTQ());
                } else {
                    awaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                }
            }
        }
        if (pointerEventPass == PointerEventPass.Final && awaitTouchSlop.getVerifyConsumptionInFinalPass()) {
            if (!pointerInputChange4.isConsumed()) {
                awaitTouchSlop.setVerifyConsumptionInFinalPass(false);
                return;
            }
            PointerInputChange initialDown3 = awaitTouchSlop.getInitialDown();
            if (initialDown3 == null) {
                defpackage.o.m("AwaitTouchSlop.initialDown was not initialized");
                return;
            }
            long m411getPointerIdJ3iCeTQ2 = awaitTouchSlop.m411getPointerIdJ3iCeTQ();
            TouchSlopDetector touchSlopDetector2 = this.touchSlopDetector;
            if (touchSlopDetector2 != null) {
                m439moveToAwaitGesturePickupStaternUCldI(initialDown3, m411getPointerIdJ3iCeTQ2, touchSlopDetector2);
            } else {
                defpackage.o.m("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragCancel(hm hmVar) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        int i;
        if (hmVar instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) hmVar;
            int i2 = dragGestureNode$processDragCancel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragCancel$1.result;
                i = dragGestureNode$processDragCancel$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                            dragGestureNode$processDragCancel$1.label = 1;
                            Object emit = mutableInteractionSource.emit(cancel, dragGestureNode$processDragCancel$1);
                            vn vnVar = vn.d;
                            if (emit == vnVar) {
                                return vnVar;
                            }
                        }
                    }
                    onDragStopped(new DragEvent.DragStopped(Velocity.Companion.m7860getZero9UxMQ8M(), false, null));
                    return w01.a;
                }
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                this.dragInteraction = null;
                onDragStopped(new DragEvent.DragStopped(Velocity.Companion.m7860getZero9UxMQ8M(), false, null));
                return w01.a;
            }
        }
        dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(this, hmVar);
        Object obj2 = dragGestureNode$processDragCancel$1.result;
        i = dragGestureNode$processDragCancel$1.label;
        if (i != 0) {
        }
        this.dragInteraction = null;
        onDragStopped(new DragEvent.DragStopped(Velocity.Companion.m7860getZero9UxMQ8M(), false, null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r1.emit(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStart(DragEvent.DragStarted dragStarted, hm hmVar) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        int i;
        DragInteraction.Start start;
        MutableInteractionSource mutableInteractionSource;
        DragEvent.DragStarted dragStarted2;
        DragInteraction.Start start2;
        if (hmVar instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) hmVar;
            int i2 = dragGestureNode$processDragStart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragStart$1.result;
                i = dragGestureNode$processDragStart$1.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    DragInteraction.Start start3 = this.dragInteraction;
                    if (start3 != null && (r1 = this.interactionSource) != null) {
                        DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
                        dragGestureNode$processDragStart$1.L$0 = dragStarted;
                        dragGestureNode$processDragStart$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        start2 = (DragInteraction.Start) dragGestureNode$processDragStart$1.L$1;
                        dragStarted2 = (DragEvent.DragStarted) dragGestureNode$processDragStart$1.L$0;
                        p10.Q(obj);
                        start = start2;
                        dragStarted = dragStarted2;
                        this.dragInteraction = start;
                        mo385onDragStartedk4lQ0M(dragStarted.m416getStartPointF1C5BW0());
                        return w01.a;
                    }
                    dragStarted = (DragEvent.DragStarted) dragGestureNode$processDragStart$1.L$0;
                    p10.Q(obj);
                }
                start = new DragInteraction.Start();
                mutableInteractionSource = this.interactionSource;
                if (mutableInteractionSource != null) {
                    dragGestureNode$processDragStart$1.L$0 = dragStarted;
                    dragGestureNode$processDragStart$1.L$1 = start;
                    dragGestureNode$processDragStart$1.label = 2;
                    if (mutableInteractionSource.emit(start, dragGestureNode$processDragStart$1) != vnVar) {
                        dragStarted2 = dragStarted;
                        start2 = start;
                        start = start2;
                        dragStarted = dragStarted2;
                    }
                    return vnVar;
                }
                this.dragInteraction = start;
                mo385onDragStartedk4lQ0M(dragStarted.m416getStartPointF1C5BW0());
                return w01.a;
            }
        }
        dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(this, hmVar);
        Object obj2 = dragGestureNode$processDragStart$1.result;
        i = dragGestureNode$processDragStart$1.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        start = new DragInteraction.Start();
        mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
        }
        this.dragInteraction = start;
        mo385onDragStartedk4lQ0M(dragStarted.m416getStartPointF1C5BW0());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStop(DragEvent.DragStopped dragStopped, hm hmVar) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        int i;
        if (hmVar instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) hmVar;
            int i2 = dragGestureNode$processDragStop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragStop$1.result;
                i = dragGestureNode$processDragStop$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Stop stop = new DragInteraction.Stop(start);
                            dragGestureNode$processDragStop$1.L$0 = dragStopped;
                            dragGestureNode$processDragStop$1.label = 1;
                            Object emit = mutableInteractionSource.emit(stop, dragGestureNode$processDragStop$1);
                            vn vnVar = vn.d;
                            if (emit == vnVar) {
                                return vnVar;
                            }
                        }
                    }
                    onDragStopped(dragStopped);
                    return w01.a;
                }
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dragStopped = (DragEvent.DragStopped) dragGestureNode$processDragStop$1.L$0;
                p10.Q(obj);
                this.dragInteraction = null;
                onDragStopped(dragStopped);
                return w01.a;
            }
        }
        dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(this, hmVar);
        Object obj2 = dragGestureNode$processDragStop$1.result;
        i = dragGestureNode$processDragStop$1.label;
        if (i != 0) {
        }
        this.dragInteraction = null;
        onDragStopped(dragStopped);
        return w01.a;
    }

    private final void processDraggingState(PointerEvent pointerEvent, PointerEventPass pointerEventPass, DragDetectionState.Dragging dragging) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (pointerEventPass != PointerEventPass.Main) {
            return;
        }
        long m413getPointerIdJ3iCeTQ = dragging.m413getPointerIdJ3iCeTQ();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            pointerInputChange = null;
            if (i2 >= size) {
                pointerInputChange2 = null;
                break;
            }
            pointerInputChange2 = changes.get(i2);
            if (PointerId.m6080equalsimpl0(pointerInputChange2.m6098getIdJ3iCeTQ(), m413getPointerIdJ3iCeTQ)) {
                break;
            } else {
                i2++;
            }
        }
        PointerInputChange pointerInputChange3 = pointerInputChange2;
        if (pointerInputChange3 == null) {
            return;
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
            if (pointerInputChange3.isConsumed()) {
                sendDragCancelled();
                return;
            } else {
                if (Offset.m4514getDistanceimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3)) == 0.0f) {
                    return;
                }
                m443sendDragEventUv8p0NA(pointerInputChange3, PointerEventKt.positionChange(pointerInputChange3));
                pointerInputChange3.consume();
                return;
            }
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        while (true) {
            if (i >= size2) {
                break;
            }
            PointerInputChange pointerInputChange4 = changes2.get(i);
            if (pointerInputChange4.getPressed()) {
                pointerInputChange = pointerInputChange4;
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange5 = pointerInputChange;
        if (pointerInputChange5 != null) {
            dragging.m414setPointerId0FcD4WY(pointerInputChange5.m6098getIdJ3iCeTQ());
            return;
        }
        if (pointerInputChange3.isConsumed() || !PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
            sendDragCancelled();
        } else {
            sendDragStopped(pointerInputChange3);
        }
        moveToAwaitDownState();
    }

    private final void processInitialDownState(PointerEvent pointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitDown awaitDown) {
        if (!pointerEvent.getChanges().isEmpty() && TapGestureDetectorKt.isChangedToDown$default(pointerEvent, false, false, 2, null)) {
            PointerInputChange pointerInputChange = (PointerInputChange) yi.p0(pointerEvent.getChanges());
            DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop = WhenMappings.$EnumSwitchMapping$0[awaitDown.getAwaitTouchSlop().ordinal()] == 1 ? !startDragImmediately() ? DragDetectionState.AwaitDown.AwaitTouchSlop.Yes : DragDetectionState.AwaitDown.AwaitTouchSlop.No : awaitDown.getAwaitTouchSlop();
            awaitDown.setAwaitTouchSlop(awaitTouchSlop);
            if (pointerEventPass == PointerEventPass.Initial && awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
                pointerInputChange.consume();
                awaitDown.setConsumedOnInitial(true);
            }
            if (pointerEventPass == PointerEventPass.Main) {
                if (awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                    m441moveToAwaitTouchSlopStateaWI9W7U$default(this, pointerInputChange, pointerInputChange.m6098getIdJ3iCeTQ(), 0L, false, 12, null);
                } else if (awaitDown.getConsumedOnInitial()) {
                    Offset.Companion companion = Offset.Companion;
                    m444sendDragStart0AR0LA0(pointerInputChange, pointerInputChange, companion.m4532getZeroF1C5BW0());
                    m443sendDragEventUv8p0NA(pointerInputChange, companion.m4532getZeroF1C5BW0());
                    m442moveToDraggingState0FcD4WY(pointerInputChange.m6098getIdJ3iCeTQ());
                }
            }
        }
    }

    private final void processRawPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        DragDetectionState dragDetectionState = this.currentDragState;
        if (dragDetectionState == null) {
            defpackage.o.m("currentDragState should not be null");
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitDown) {
            processInitialDownState(pointerEvent, pointerEventPass, (DragDetectionState.AwaitDown) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitTouchSlop) {
            processAwaitTouchSlop(pointerEvent, pointerEventPass, (DragDetectionState.AwaitTouchSlop) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitGesturePickup) {
            processAwaitGesturePickup(pointerEvent, pointerEventPass, (DragDetectionState.AwaitGesturePickup) dragDetectionState);
        } else if (dragDetectionState instanceof DragDetectionState.Dragging) {
            processDraggingState(pointerEvent, pointerEventPass, (DragDetectionState.Dragging) dragDetectionState);
        } else {
            defpackage.o.n();
        }
    }

    private final zg requireChannel() {
        zg zgVar = this.channel;
        if (zgVar != null) {
            return zgVar;
        }
        defpackage.o.m("Events channel not initialized.");
        return null;
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

    private final void resetDragDetectionState() {
        moveToAwaitDownState();
        if (this.isListeningForEvents) {
            sendDragCancelled();
        }
        this.velocityTracker = null;
    }

    private final void sendDragCancelled() {
        requireChannel().m(DragEvent.DragCancelled.INSTANCE);
    }

    /* renamed from: sendDragEvent-Uv8p0NA, reason: not valid java name */
    private final void m443sendDragEventUv8p0NA(PointerInputChange pointerInputChange, long j) {
        long positionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(getNode()));
        if (!Offset.m4513equalsimpl0(this.previousPositionOnScreen, Offset.Companion.m4531getUnspecifiedF1C5BW0()) && !Offset.m4513equalsimpl0(positionOnScreen, this.previousPositionOnScreen)) {
            this.nodeOffset = Offset.m4521plusMKHz9U(this.nodeOffset, Offset.m4520minusMKHz9U(positionOnScreen, this.previousPositionOnScreen));
        }
        this.previousPositionOnScreen = positionOnScreen;
        VelocityTrackerKt.m6210addPointerInputChange0AR0LA0(requireVelocityTracker(), pointerInputChange, this.nodeOffset);
        requireChannel().m(new DragEvent.DragDelta(j, false, null));
    }

    /* renamed from: sendDragStart-0AR0LA0, reason: not valid java name */
    private final void m444sendDragStart0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j) {
        if (this.velocityTracker == null) {
            this.velocityTracker = new VelocityTracker();
        }
        VelocityTrackerKt.addPointerInputChange(requireVelocityTracker(), pointerInputChange);
        long m4520minusMKHz9U = Offset.m4520minusMKHz9U(pointerInputChange2.m6101getPositionF1C5BW0(), j);
        this.nodeOffset = Offset.Companion.m4532getZeroF1C5BW0();
        if (((Boolean) this.canDrag.invoke(PointerType.m6171boximpl(pointerInputChange.m6104getTypeT8wyACA()))).booleanValue()) {
            if (!this.isListeningForEvents) {
                if (this.channel == null) {
                    this.channel = d41.b(Integer.MAX_VALUE, 6, null);
                }
                startListeningForEvents();
            }
            this.previousPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(this));
            requireChannel().m(new DragEvent.DragStarted(m4520minusMKHz9U, null));
        }
    }

    private final void sendDragStopped(PointerInputChange pointerInputChange) {
        VelocityTrackerKt.addPointerInputChange(requireVelocityTracker(), pointerInputChange);
        float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
        long m6209calculateVelocityAH228Gc = requireVelocityTracker().m6209calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        requireVelocityTracker().resetTracking();
        requireChannel().m(new DragEvent.DragStopped(DraggableKt.m449toValidVelocityTH1AsA0(m6209calculateVelocityAH228Gc), false, null));
        this.isListeningForPointerInputEvents = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        if (this.channel == null) {
            this.channel = d41.b(Integer.MAX_VALUE, 6, null);
        }
        p01.t(getCoroutineScope(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3);
    }

    public static /* synthetic */ void update$default(DragGestureNode dragGestureNode, ky kyVar, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: update");
            return;
        }
        if ((i & 1) != 0) {
            kyVar = dragGestureNode.canDrag;
        }
        if ((i & 2) != 0) {
            z = dragGestureNode.enabled;
        }
        if ((i & 4) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        if ((i & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        ky kyVar2 = kyVar;
        dragGestureNode.update(kyVar2, z, mutableInteractionSource2, orientation, z3);
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    public abstract Object drag(my myVar, hm hmVar);

    public final ky getCanDrag() {
        return this.canDrag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final Orientation getOrientationLock() {
        return this.orientationLock;
    }

    public final boolean isListeningForEvents$foundation() {
        return this.isListeningForEvents;
    }

    public final boolean isListeningForPointerInputEvents$foundation() {
        return this.isListeningForPointerInputEvents;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onCancelIndirectPointerInput() {
        IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.resetDragDetectionState();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
        if (ComposeFoundationFlags.isNonSuspendingPointerInputInDraggableEnabled && this.isListeningForPointerInputEvents) {
            resetDragDetectionState();
        }
        this.isListeningForPointerInputEvents = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
        this.nodeOffset = Offset.Companion.m4532getZeroF1C5BW0();
    }

    public final void onDragEvent(DragEvent dragEvent) {
        if ((dragEvent instanceof DragEvent.DragStarted) && !this.isListeningForEvents) {
            this.isListeningForEvents = true;
            startListeningForEvents();
        }
        requireChannel().m(dragEvent);
    }

    /* renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo385onDragStartedk4lQ0M(long j);

    public abstract void onDragStopped(DragEvent.DragStopped dragStopped);

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        if (this.enabled) {
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
            if (indirectPointerInputDragCycleDetector == null) {
                indirectPointerInputDragCycleDetector = new IndirectPointerInputDragCycleDetector(this);
                this.indirectPointerInputDragCycleDetector = indirectPointerInputDragCycleDetector;
            }
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.processIndirectPointerInputEvent(indirectPointerEvent, pointerEventPass);
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.isListeningForPointerInputEvents = true;
        boolean z = ComposeFoundationFlags.isNonSuspendingPointerInputInDraggableEnabled;
        boolean z2 = this.enabled;
        if (z) {
            if (z2) {
                if (this.currentDragState == null) {
                    this.currentDragState = getAwaitDownState();
                }
                processRawPointerEvent(pointerEvent, pointerEventPass);
                return;
            }
            return;
        }
        if (z2 && this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(initializePointerInputNode());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        }
    }

    public final void setListeningForEvents$foundation(boolean z) {
        this.isListeningForEvents = z;
    }

    public final void setListeningForPointerInputEvents$foundation(boolean z) {
        this.isListeningForPointerInputEvents = z;
    }

    public final void setOrientationLock(Orientation orientation) {
        this.orientationLock = orientation;
    }

    public abstract boolean startDragImmediately();

    public final void update(ky kyVar, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z2) {
        this.canDrag = kyVar;
        boolean z3 = true;
        if (this.enabled != z) {
            this.enabled = z;
            if (!z) {
                disposeInteractionSource();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
                if (suspendingPointerInputModifierNode != null) {
                    undelegate(suspendingPointerInputModifierNode);
                }
                this.pointerInputNode = null;
                this.indirectPointerInputDragCycleDetector = null;
            }
            z2 = true;
        }
        if (!q10.b(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        if (this.orientationLock != orientation) {
            this.orientationLock = orientation;
        } else {
            z3 = z2;
        }
        if (z3) {
            if (ComposeFoundationFlags.isNonSuspendingPointerInputInDraggableEnabled && this.isListeningForPointerInputEvents) {
                resetDragDetectionState();
            }
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.resetDragDetectionState();
            }
            SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.pointerInputNode;
            if (suspendingPointerInputModifierNode2 != null) {
                suspendingPointerInputModifierNode2.resetPointerInputHandler();
            }
        }
    }
}
