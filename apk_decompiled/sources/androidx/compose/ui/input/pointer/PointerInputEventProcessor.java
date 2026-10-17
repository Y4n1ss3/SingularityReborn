package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInputEventProcessor {
    public static final int $stable = 8;
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;
    private final LayoutNode root;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
    private final HitTestResult hitResult = new HitTestResult();

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m6123processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m6124processBIzXfog(pointerInputEvent, positionCalculator, z);
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.hitPathTracker.clearPreviouslyHitModifierNodeCache();
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m6124processBIzXfog(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z) {
        boolean z2;
        boolean z3;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false, false);
        }
        boolean z4 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerInputEvent, positionCalculator);
            int e = produce.getChanges().e();
            for (int i = 0; i < e; i++) {
                PointerInputChange pointerInputChange = (PointerInputChange) produce.getChanges().f(i);
                if (!pointerInputChange.getPressed() && !pointerInputChange.getPreviousPressed()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int e2 = produce.getChanges().e();
            for (int i2 = 0; i2 < e2; i2++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) produce.getChanges().f(i2);
                if (z2 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2)) {
                    LayoutNode.m6464hitTest6fMxITs$ui$default(this.root, pointerInputChange2.m6101getPositionF1C5BW0(), this.hitResult, pointerInputChange2.m6104getTypeT8wyACA(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m6003addHitPathQJqDSyo(pointerInputChange2.m6098getIdJ3iCeTQ(), this.hitResult, PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, z);
            if (!produce.getSuppressMovementConsumption()) {
                int e3 = produce.getChanges().e();
                for (int i3 = 0; i3 < e3; i3++) {
                    PointerInputChange pointerInputChange3 = (PointerInputChange) produce.getChanges().f(i3);
                    if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange3) && pointerInputChange3.isConsumed()) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            int e4 = produce.getChanges().e();
            int i4 = 0;
            while (true) {
                if (i4 >= e4) {
                    z4 = false;
                    break;
                }
                if (((PointerInputChange) produce.getChanges().f(i4)).isConsumed()) {
                    break;
                }
                i4++;
            }
            int ProcessResult = PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z3, z4);
            this.isProcessing = false;
            return ProcessResult;
        } catch (Throwable th) {
            this.isProcessing = false;
            throw th;
        }
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}
